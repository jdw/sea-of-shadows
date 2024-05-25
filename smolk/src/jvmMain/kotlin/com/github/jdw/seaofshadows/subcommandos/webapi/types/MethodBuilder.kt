package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.fleeksoft.ksoup.Ksoup
import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.utils.throws
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.runBlocking
import kotlin.reflect.KParameter
import kotlin.reflect.full.createType

fun Method.Builder.build(): Method {
    assert(name!!.isNotBlank() && name!!.isNotEmpty())
    assert(seeFurtherUrls.isNotEmpty())
    seeFurtherUrls.forEach { url -> assert(url.isNotBlank() && url.isNotEmpty()) }
    assert(documentation!!.isNotBlank() && documentation!!.isNotEmpty())

    return Method(
        seeFurtherUrls = seeFurtherUrls.toSet(),
        documentation = documentation!!,
        annotations = annotations.toList(),
        isAbstract = isAbstract!!,
        isFinal = isFinal!!,
        isOpen = isOpen!!,
        isSuspend = isSuspend!!,
        name = name!!,
        myParameters = parameters.toList(),
        returnType = returnType!!,
        typeParameters = typeParameters.toList(),
        visibility = visibility,
        problems = problems.toList()
    )
}


fun Method.Builder.nextParameterIndex(): Int = parameters.size


fun Method.Builder.fetchMozillaDocumentationUrl(): String {
    val baseUrl = "${Glob.MOZILLA_API_BASE_URL}/${parent!!.simpleName}".replace("WebGLRenderingContextBase", "WebGLRenderingContext")
    val methodUri: MutableSet<String> = mutableSetOf() //TODO Put on parent to only fetch once

    with(Ksoup.parse(Glob.fetchCache(baseUrl))) {
        runBlocking {
            getElementsByTag("summary").asFlow().collect { summary ->
                if (summary.html() == "Instance methods") {
                    summary.parent()!!.getElementsByTag("ol")[0]
                        .getElementsByTag("li").asFlow().collect { li ->
                            methodUri.add(li.getElementsByTag("a")[0].attribute("href")!!.value)
                        }

                }
            }
        }
    }

    name!!.indices.forEach { idx ->
        val namePart = name!!.substring(0..name!!.length - 1 - idx)

        methodUri.forEach { href ->
            if (href.contains(namePart)) {
                val url =  "${Glob.MOZILLA_BASE_URL}${href}"
                Glob.fetchCache(url)

                return url
            }
        }
    }

    throws()
}


fun Method.Builder.fetchDocumentation(): String {
    var ret = ""

    runBlocking {
        seeFurtherUrls.asFlow()
            .filter { it.contains(Glob.MOZILLA_API_BASE_URL) && it.contains(name!!)}
            .collect {
                with(Ksoup.parse(Glob.fetchCache(it))) {
                    ret = getElementById("content")!!
                            .getElementsByClass("section-content").first()!!
                            .getElementsByTag("p")
                            .text()
                }
            }
    }

    return ret
}


fun Method.Builder.handleOneRowMethodDeclarationWithParameters(row: String) {
    val splitOnLeftParantheses = row.split("(")
    if (splitOnLeftParantheses.size != 2) throw IllegalStateException("Row '$row' yielded ${splitOnLeftParantheses.size} pieces!")
    val parametersRaw = splitOnLeftParantheses.last().removeSuffix(");")

    try {
        parseParametersRow(parametersRaw)
    }
    catch (e: Exception) {
        problems.add(e.message ?: "Problems adding parameter!")
    }
}


fun Method.Builder.handleOneRowMethodDeclarationWithoutMethodParameters() {

}


fun Method.Builder.parseParametersRow(row: String) {
    row.split(", ").forEach { parameterPair ->
        val pieces = parameterPair.split(" ")
        val parameterName = Type.IDLPIECE_TO_KTPIECE(pieces[1])
        val parameterType = pieces[0].removeSuffix("?")
        val builder = this

        val parameter = Parameter.builder()
            .apply { parent = builder }
            .apply { type = Nothing::class.createType() }
            .apply { name = parameterName }
            .apply { typeName = Type.IDLPIECE_TO_KTPIECE(parameterType) }
            .apply { documentation =
                try {
                    fetchDocumentation(builder.seeFurtherUrls)
                }
                catch (e: Exception) {
                    "TODO: Importing this parameters documentation caused troube!"
                }
            }
            .apply { index = parent!!.nextParameterIndex() }
            .apply { isOptional = false }
            .apply { isVararg = false }
            .apply { kind = KParameter.Kind.VALUE } //TODO Might not be correct...
            .build()

        parameters.add(parameter)
    }
}


fun Method.Builder.handleEndRow(row: String) {
    parseParametersRow(row)

    parent!!.members.add(build())
}
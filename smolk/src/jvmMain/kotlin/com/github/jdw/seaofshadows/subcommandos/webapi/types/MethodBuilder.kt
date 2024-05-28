package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.getKhronosGroupUrlFromSpecifications
import com.github.jdw.seaofshadows.htmlToMarkdown
import com.github.jdw.seaofshadows.utils.throws
import kotlin.reflect.KParameter
import kotlin.reflect.KType
import kotlin.reflect.KTypeParameter
import kotlin.reflect.KVisibility
import kotlin.reflect.full.createType


class MethodBuilder {
    var parent: InterfaceBuilder? = null
    val urls: MutableMap<String, String> = mutableMapOf()
    var annotations: MutableList<Annotation> = mutableListOf()
    var isAbstract: Boolean? = null
    var isFinal: Boolean? = null
    var isOpen: Boolean? = null
    var isSuspend: Boolean? = null
    var name: String? = null
    var parameters: MutableList<Parameter> = mutableListOf()
    var returnType: KType? = null
    var typeParameters: MutableList<KTypeParameter> = mutableListOf()
    var visibility: KVisibility? = null
    val problems: MutableList<String> = mutableListOf()

    fun getDocumentation(): String {
        val url = urls["Mozilla"]!!

        with(Glob.fetchDocument(url)) {
            urls["Khronos Group"] = this.getKhronosGroupUrlFromSpecifications()
            return getElementById("content")!!
                .getElementsByClass("section-content").first()!!
                .getElementsByTag("p")
                .html()
                .htmlToMarkdown()
                .replace("\r\r", " -- ")
                .trim()
        }
    }

    fun build(): Method {
        assert(name!!.isNotBlank() && name!!.isNotEmpty())
        assert(urls.isNotEmpty())
        Glob.keywordsToBeBracketedInKdoc.add(name!!)

        urls.forEach { (title, url) ->
            assert(url.isNotBlank() && url.isNotEmpty())
            assert(title.isNotBlank() && title.isNotEmpty())
        }

        var doc = ""
        getDocumentation().split("\n").forEach { row ->
            if (!row.contains("]: https://")) {
                doc += row
                return@forEach
            }

            val (title, url) = row.split("]: ")

            urls[title] = url
        }

        assert(doc.isNotBlank() && doc.isNotEmpty())

//        if (name!! == "compressedTexImage2D") {
//            println("compressedTexImage2D documentation:")
//            println(doc)
//            println()
//        }

        return Method(
            urls = urls.toMap(),
            annotations = annotations.toList(),
            isAbstract = isAbstract!!,
            isFinal = isFinal!!,
            isOpen = isOpen!!,
            isSuspend = isSuspend!!,
            name = name!!,
            parameters = parameters.toList(),
            returnType = returnType!!,
            typeParameters = typeParameters.toList(),
            visibility = visibility,
            problems = problems.toList(),
            documentation = doc
        )
    }


    fun nextParameterIndex(): Int = parameters.size


    fun fetchMozillaDocumentationUrl(): String {
        name!!.indices.forEach { idx ->
            val namePart = name!!.substring(0..name!!.length - 1 - idx)

            parent!!.methodUris.forEach { href ->
                if (href.contains(namePart)) {
                    val url = "${Glob.MOZILLA_BASE_URL}${href}"
                    Glob.fetchDocument(url)

                    return url
                }
            }
        }

        throws()
    }


    fun handleOneRowMethodDeclarationWithParameters(row: String) {
        val splitOnLeftParantheses = row.split("(")
        if (splitOnLeftParantheses.size != 2) throw IllegalStateException("Row '$row' yielded ${splitOnLeftParantheses.size} pieces!")
        val parametersRaw = splitOnLeftParantheses.last().removeSuffix(");")

        try {
            parseParametersRow(parametersRaw)
        } catch (e: Exception) {
            problems.add(e.message ?: "Problems adding parameter!")
        }
    }


    fun handleOneRowMethodDeclarationWithoutMethodParameters() {

    }


    fun handleMiddleRow(row: String) {
        parseParametersRow(row)
    }


    fun parseParametersRow(row: String) {
        row.split(", ").forEach { parameterPair ->
            val pieces = parameterPair.split(" ")
            val parameterName = Glob.translateIDLPieceToKotlinPiece(pieces[1].trim().removeSuffix(","))
            val parameterType = pieces[0].trim().removeSuffix("?")
            val builder = this

            val parameter = Parameter.builder()
                .apply { parent = builder }
                .apply { type = Nothing::class.createType() }
                .apply { name = parameterName }
                .apply { typeName = Glob.translateIDLPieceToKotlinPiece(parameterType) }
                .apply { index = parent!!.nextParameterIndex() }
                .apply { isOptional = false }
                .apply { isVararg = false }
                .apply { kind = KParameter.Kind.VALUE } //TODO Might not be correct...
                .apply { nullable = pieces[0].trim().endsWith("?") }
                .build()

            parameters.add(parameter)
        }
    }


    fun handleEndRow(row: String) {
        parseParametersRow(row)

        parent!!.members.add(build())
    }
}
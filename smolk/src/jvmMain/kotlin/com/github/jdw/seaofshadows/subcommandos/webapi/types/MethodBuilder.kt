package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.utils.throws
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.runBlocking
import kotlin.reflect.KParameter
import kotlin.reflect.KType
import kotlin.reflect.KTypeParameter
import kotlin.reflect.KVisibility
import kotlin.reflect.full.createType


class MethodBuilder {
    var parent: InterfaceBuilder? = null
    val urls: MutableSet<String> = mutableSetOf()
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


    fun build(): Method {
        assert(name!!.isNotBlank() && name!!.isNotEmpty())
        assert(urls.isNotEmpty())
        urls.forEach { url -> assert(url.isNotBlank() && url.isNotEmpty()) }

        return Method(
            urls = urls.toSet(),
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


    fun parseParametersRow(row: String) {
        row.split(", ").forEach { parameterPair ->
            val pieces = parameterPair.split(" ")
            val parameterName = Type.IDLPIECE_TO_KTPIECE(pieces[1])
            val parameterType = pieces[0].removeSuffix("?")
            val builder = this

            val parameter = Parameter.builder()
                .apply { parent = builder }
                .apply { urls.add(parent!!.urls.filter { it.contains(Glob.MOZILLA_API_BASE_URL) }.first()) }
                .apply { type = Nothing::class.createType() }
                .apply { name = parameterName }
                .apply { typeName = Type.IDLPIECE_TO_KTPIECE(parameterType) }
                .apply { index = parent!!.nextParameterIndex() }
                .apply { isOptional = false }
                .apply { isVararg = false }
                .apply { kind = KParameter.Kind.VALUE } //TODO Might not be correct...
                .build()

            parameters.add(parameter)
        }
    }


    fun handleEndRow(row: String) {
        parseParametersRow(row)

        parent!!.members.add(build())
    }
}
package com.github.jdw.seaofshadows.importing.types

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.htmlToMarkdown
import kotlin.reflect.KParameter
import kotlin.reflect.KType


class ParameterBuilder {
    var parent: MethodBuilder? = null
    var name: String? = null
    var index: Int? = null
    var annotations: MutableList<Annotation> = mutableListOf()
    var isOptional: Boolean? = null
    var isVararg: Boolean? = null
    var kind: KParameter.Kind? = null
    var type: KType? = null
    var typeName: String? = null
    var nullable: Boolean? = null
    var builderBlock: () -> Parameter = {
        var documentation = ""

        val url = parent!!
            .urls["Mozilla"]!!

        assert(url.isNotBlank() && url.isNotEmpty())
        with(Glob.fetchDocument(url)) {
            val alternativeDtIds = mapOf(
                "data" to setOf("pixels", "srcdata"),
                "v0" to setOf("x", "v0_v1_v2_v3"),
                "v1" to setOf("y", "v0_v1_v2_v3"),
                "v2" to setOf("z", "v0_v1_v2_v3"),
                "v3" to setOf("w", "v0_v1_v2_v3"),
                "x" to setOf("v0", "value_v0_v1_v2_v3", "v0_v1_v2_v3"),
                "y" to setOf("v1", "value_v0_v1_v2_v3", "v0_v1_v2_v3"),
                "z" to setOf("v2", "value_v0_v1_v2_v3", "v0_v1_v2_v3"),
                "w" to setOf("v3", "value_v0_v1_v2_v3", "v0_v1_v2_v3"),
                "value" to setOf("value_v0_v1_v2_v3"),
                "cap" to setOf("capability"),
                "source" to setOf("pixels")
            )

            documentation = try {
                var dt = getElementById(name!!.lowercase())

                if (alternativeDtIds.containsKey(name!!)) {
                    alternativeDtIds[name!!]!!.forEach {
                        if (null == dt) dt = getElementById(it)
                    }
                }

                dt!!

                if ("v0_v1_v2_v3" != dt!!.id() && "value_v0_v1_v2_v3" != dt!!.id()) name = dt!!.id()
                val dd = dt!!.nextElementSibling()!!

                assert(dd.tagName() == "dd")

                val html = dd.html().replace("Number", "number") //TODO Handle tables

                if (html.contains("A new value to be used for the uniform variable")) "A new value to be used for the uniform variable."
                else html
            }
            catch (e: Exception) {
                "TODO: This parameters documentation import caused unspecified trouble!"
            }
        }

        documentation = documentation
            .htmlToMarkdown()
            .replace("`", "")
            .replace("\n\n", "\n")
            .split("When using a WebGL 2 context").first()

        assert(
            name!!
                .isNotBlank() && name!!.isNotEmpty()
        )
        assert(
            typeName!!
                .isNotBlank() && typeName!!.isNotEmpty()
        )

        Parameter(
            annotations = annotations.toList(),
            index = index!!,
            isOptional = isOptional!!,
            isVararg = isVararg!!,
            kind = kind!!,
            name = name!!,
            type = type!!,
            typeName = typeName!!,
            documentation = documentation,
            nullable = nullable!!
        )
    }

    val builderBlockForCanvas2d: () -> Parameter = {
        val parameterName = name!!.lowercase()
        val documentation = try {
            Glob
                .fetchDocument(parent!!.urls["Mozilla"]!!)
                .getElementById(parameterName)!!
                .nextElementSibling()!!
                .text()
        }
        catch (e: Exception) {
            "TODO: Something failed while importing documentation for this parameter!"
        }

        Parameter(
            annotations = annotations.toList(),
            index = index!!,
            isOptional = isOptional!!,
            isVararg = isVararg!!,
            kind = kind!!,
            name = name!!,
            type = type!!,
            typeName = typeName!!,
            documentation = documentation,
            nullable = nullable!!
        )
    }


    fun build(): Parameter { return builderBlock.invoke() }
}
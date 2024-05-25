package com.github.jdw.seaofshadows.subcommandos.webapi.types

import kotlin.reflect.KClassifier
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection

class Type(
    override val annotations: List<Annotation>,
    override val arguments: List<KTypeProjection>,
    override val classifier: KClassifier?,
    override val isMarkedNullable: Boolean,
    val name: String
) : KType {
    class Builder {
        val annotations: MutableList<Annotation> = mutableListOf()
        val arguments: MutableList<KTypeProjection> = mutableListOf()
        var classifier: KClassifier? = null
        var isMarkedNullable: Boolean? = null
        var name: String? = null
        var ktype: KType? = null
    }

    companion object {
        fun builder(): Builder = Builder()
        val NAME_TO_TYPE = mutableMapOf<String, Type>()


        fun IDLPIECE_TO_KTPIECE(jsName: String): String {
            val mapped = mapOf(
                "boolean" to "Boolean",
                "object" to "Any",
                "void" to "Nothing",
                "any" to "Any",
                "sequence<DOMString>" to "List<DOMString>",
                "sequence<WebGLShader>" to "List<WebGLShader>",
                "sequence<GLfloat>" to "List<GLfloat>",
                "sequence<long>" to "List<Long>",
                "dictionary" to "class",
                "indx" to "index",
                "v" to "value",
                "x" to "v0",
                "y" to "v1",
                "z" to "v2",
                "w" to "v3")

            return mapped[jsName]
                ?: jsName
        }


        fun ktypeToType(name: String, other: KType): Type {
            val builder = Builder()
                .apply { isMarkedNullable = other.isMarkedNullable }
                .apply{ this.name = name }

            other.classifier?.let { builder.classifier = other.classifier }
            other.arguments.forEach { builder.arguments.add(it) }
            other.annotations.forEach { builder.annotations.add(it) }

            return builder.build()
        }
    }
}
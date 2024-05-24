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
    class Builder() {
        private val annotations: MutableList<Annotation> = mutableListOf()
        private val arguments: MutableList<KTypeProjection> = mutableListOf()
        private var classifier: KClassifier? = null
        private var isMarkedNullable: Boolean? = null
        private var name: String? = null
        private var ktype: KType? = null

        fun build(): Type {
            assert(name!!
                .isNotBlank() && name!!.isNotEmpty())

            return Type(
                annotations.toList(),
                arguments.toList(),
                classifier,
                isMarkedNullable!!,
                name!!)
        }


        fun copyFromKType(value: KType): Builder {
            with(value) {
                annotations.forEach { annotation(it) }
                arguments.forEach { argument(it) }
                classifier?.let {  classifier(it) }
                isMarkedNullable(isMarkedNullable)
            }

            with(name!!) {
                NAME_TO_TYPE[this] = Type.ktypeToType(this, value)
            }

            return this
        }


        fun annotation(value: Annotation): Builder {
            annotations.add(value)

            return this
        }


        fun argument(value: KTypeProjection): Builder {
            arguments.add(value)

            return this
        }


        fun name(value: String): Builder {
            name = value

            return this
        }


        fun classifier(value: KClassifier): Builder {
            classifier = value

            return this
        }


        fun isMarkedNullable(value: Boolean): Builder {
            isMarkedNullable = value

            return this
        }
    }

    companion object {
        val NAME_TO_TYPE = mutableMapOf<String, Type>()
        fun IDLNAME_TO_KTNAME(jsName: String): String {
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
                "indx" to "index")

            return mapped[jsName]
                ?: jsName
        }


        fun builder(): Builder = Builder()


        fun ktypeToType(name: String, other: KType): Type {
            val typeBuilder = Type
                .Builder()
                .isMarkedNullable(other.isMarkedNullable)
                .name(name)

            other.classifier?.let { typeBuilder.classifier(other.classifier!!) }
            other.arguments.forEach { typeBuilder.argument(it) }
            other.annotations.forEach { typeBuilder.annotation(it) }

            return typeBuilder.build()
        }
    }
}
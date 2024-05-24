package com.github.jdw.seaofshadows.subcommandos.webapi.types

import kotlin.reflect.KParameter
import kotlin.reflect.KType

class Parameter(
    override val annotations: List<Annotation>,
    override val index: Int,
    override val isOptional: Boolean,
    override val isVararg: Boolean,
    override val kind: KParameter.Kind,
    override val name: String?,
    override val type: KType,
    val documentation: String,
    val typeName: String
): KParameter {
    override fun equals(other: Any?): Boolean {
        if (other !is Parameter) return false

        return this.hashCode() == other.hashCode()
    }

    override fun hashCode(): Int {
        var result: Int = documentation.hashCode()
        result = 31 * result + annotations.hashCode()
        result = 31 * result + index.hashCode()
        result = 31 * result + isOptional.hashCode()
        result = 31 * result + isVararg.hashCode()
        result = 31 * result + kind.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + type.hashCode()

        return result
    }

    class Builder {
        private var name: String? = null
        private var index: Int? = null
        private var annotations: MutableList<Annotation> = mutableListOf()
        private var isOptional: Boolean? = null
        private var isVararg: Boolean? = null
        private var kind: KParameter.Kind? = null
        private var type: KType? = null
        private var documentation: String? = null
        private var typeName: String? = null


        fun build(): Parameter {
            assert(name!!
                .isNotBlank() && name!!.isNotEmpty())
            assert(typeName!!
                .isNotBlank() && typeName!!.isNotEmpty())

            return Parameter(
                annotations = annotations.toList(),
                index = index!!,
                isOptional = isOptional!!,
                isVararg = isVararg!!,
                kind = kind!!,
                name = name!!,
                type = type!!,
                documentation = documentation!!,
                typeName = typeName!!)
        }


        fun documentation(value: String): Builder {
            documentation = value

            return this
        }


        fun typeName(value: String): Builder {
            typeName = value

            return this
        }


        fun type(value: KType): Builder {
            type = value
            return this
        }

        fun kind(value: KParameter.Kind): Builder {
            kind = value
            return this
        }

        fun isVararg(value: Boolean): Builder {
            isVararg = value
            return this
        }

        fun isOptional(value: Boolean): Builder {
            isOptional = value
            return this
        }

        fun name(value: String): Builder {
            this.name = value
            return this
        }

        fun annotate(value: Annotation): Builder {
            annotations.add(value)

            return this
        }

        fun index(value: Int): Builder {
            this.index = value
            return this
        }
    }


    companion object {
        fun builder(): Builder = Builder()
    }
}
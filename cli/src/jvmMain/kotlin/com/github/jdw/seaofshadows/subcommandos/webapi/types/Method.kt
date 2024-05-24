package com.github.jdw.seaofshadows.subcommandos.webapi.types

import kotlin.reflect.KCallable
import kotlin.reflect.KParameter
import kotlin.reflect.KType
import kotlin.reflect.KTypeParameter
import kotlin.reflect.KVisibility

class Method(
    val url: String,
    val documentation: String,
    override val annotations: List<Annotation>,
    override val isAbstract: Boolean,
    override val isFinal: Boolean,
    override val isOpen: Boolean,
    override val isSuspend: Boolean,
    override val name: String,
    override val returnType: KType,
    override val typeParameters: List<KTypeParameter>,
    override val visibility: KVisibility?,
    val myParameters: List<Parameter>,
    val problems: List<String>
): KCallable<Any> {
    override val parameters: List<KParameter>
        get() {
            return myParameters
        }

    override fun call(vararg args: Any?): Any {
        TODO("Not yet implemented")
    }

    override fun callBy(args: Map<KParameter, Any?>): Any {
        TODO("Not yet implemented")
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Method) return false;

        return this.hashCode() == other.hashCode();
    }

    override fun hashCode(): Int {
        var result = url.hashCode()
        result = 31 * result + documentation.hashCode()
        result = 31 * result + annotations.hashCode()
        result = 31 * result + isAbstract.hashCode()
        result = 31 * result + isFinal.hashCode()
        result = 31 * result + isOpen.hashCode()
        result = 31 * result + isSuspend.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + parameters.hashCode()
        result = 31 * result + returnType.hashCode()
        result = 31 * result + typeParameters.hashCode()
        result = 31 * result + (visibility?.hashCode() ?: 0)

        return result
    }

    class Builder {
        var url: String? = null
        private var documentation: String? = null
        private var annotations: MutableList<Annotation> = mutableListOf()
        private var isAbstract: Boolean? = null
        private var isFinal: Boolean? = null
        private var isOpen: Boolean? = null
        private var isSuspend: Boolean? = null
        private var name: String? = null
        private var parameters: MutableList<Parameter> = mutableListOf()
        private var returnType: KType? = null
        private var typeParameters: MutableList<KTypeParameter> = mutableListOf()
        private var visibility: KVisibility? = null
        private val problems: MutableList<String> = mutableListOf()

        fun build(): Method {
            assert(name!!.isNotBlank() && name!!.isNotEmpty())
            assert(url!!.isNotBlank() && url!!.isNotEmpty())
            assert(documentation!!.isNotBlank() && documentation!!.isNotEmpty())

            return Method(
                url = url!!,
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
                visibility = visibility!!,
                problems = problems.toList()
            )
        }


        fun nextParameterIndex(): Int = parameters.size


        fun problem(value: String): Builder {
            problems.add(value)

            return this
        }


        fun url(value: String): Builder {
            url = value

            return this
        }


        fun documentation(value: String): Builder {
            documentation += value

            return this
        }


        fun annotation(value: Annotation): Builder {
            annotations.add(value)

            return this
        }


        fun isAbstract(value: Boolean): Builder {
            isAbstract = value
            return this
        }


        fun isFinal(value: Boolean): Builder {
            isFinal = value
            return this
        }


        fun isOpen(value: Boolean): Builder {
            isOpen = value
            return this
        }


        fun isSuspend(value: Boolean): Builder {
            isSuspend = value
            return this
        }


        fun name(value: String): Builder {
            name = value
            return this
        }


        fun parameter(value: Parameter): Builder {
            parameters.add(value)

            return this
        }


        fun returnType(value: KType): Builder {
            returnType = value
            return this
        }


        fun typeParameter(value: KTypeParameter): Builder { //TODO What is this?
            typeParameters.add(value)

            return this
        }


        fun visibility(value: KVisibility): Builder {
            visibility = value
            return this
        }
    }

    companion object {
        fun builder(): Builder = Builder()
    }
}
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
    class Builder {
        var parent: Method.Builder? = null
        var name: String? = null
        var index: Int? = null
        var annotations: MutableList<Annotation> = mutableListOf()
        var isOptional: Boolean? = null
        var isVararg: Boolean? = null
        var kind: KParameter.Kind? = null
        var type: KType? = null
        var documentation: String? = null
        var typeName: String? = null
    }


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


    companion object {
        fun builder(): Builder = Builder()
    }
}
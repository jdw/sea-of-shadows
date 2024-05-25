package com.github.jdw.seaofshadows.subcommandos.webapi.types

import kotlin.reflect.KCallable
import kotlin.reflect.KParameter
import kotlin.reflect.KType
import kotlin.reflect.KTypeParameter
import kotlin.reflect.KVisibility

class Method(
    val seeFurtherUrls: Set<String>,
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
    class Builder {
        var parent: Interface.Builder? = null
        val seeFurtherUrls: MutableSet<String> = mutableSetOf()
        var documentation: String? = null
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
    }


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
        var result = seeFurtherUrls.hashCode()
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


    companion object {
        fun builder(): Builder = Builder()
    }
}
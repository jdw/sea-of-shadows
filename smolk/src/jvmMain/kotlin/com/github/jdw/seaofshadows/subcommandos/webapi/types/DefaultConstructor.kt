package com.github.jdw.seaofshadows.subcommandos.webapi.types

import kotlin.reflect.KFunction
import kotlin.reflect.KParameter
import kotlin.reflect.KType
import kotlin.reflect.KTypeParameter
import kotlin.reflect.KVisibility
import kotlin.reflect.full.createType

class DefaultInterfaceConstructor(override val name: String): KFunction<Interface> {
    override val annotations: List<Annotation> = emptyList()
    override val isAbstract: Boolean = false
    override val isExternal: Boolean = false
    override val isFinal: Boolean = false
    override val isInfix: Boolean = false
    override val isInline: Boolean = false
    override val isOpen: Boolean = false
    override val isOperator: Boolean = false
    override val isSuspend: Boolean = false
    override val parameters: List<KParameter> = emptyList()
    override val returnType: KType
        get() {
            return Unit::class.createType()
        }
    override val typeParameters: List<KTypeParameter> = emptyList()
    override val visibility: KVisibility? = null

    override fun call(vararg args: Any?): Interface {
        throw Exception("Can not instance an interface!")
    }

    override fun callBy(args: Map<KParameter, Any?>): Interface {
        throw Exception("Can not instance an interface!")
    }
}
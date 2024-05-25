package com.github.jdw.seaofshadows.subcommandos.webapi.types

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
    var urls: MutableSet<String> = mutableSetOf()


    fun build(): Parameter {
        assert(
            name!!
                .isNotBlank() && name!!.isNotEmpty()
        )
        assert(
            typeName!!
                .isNotBlank() && typeName!!.isNotEmpty()
        )

        return Parameter(
            annotations = annotations.toList(),
            index = index!!,
            isOptional = isOptional!!,
            isVararg = isVararg!!,
            kind = kind!!,
            name = name!!,
            type = type!!,
            typeName = typeName!!,
            urls = urls.toSet()
        )
    }
}
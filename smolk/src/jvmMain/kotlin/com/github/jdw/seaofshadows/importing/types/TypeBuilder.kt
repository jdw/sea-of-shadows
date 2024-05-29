package com.github.jdw.seaofshadows.importing.types

import kotlin.reflect.KClassifier
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection


class TypeBuilder {
    val annotations: MutableList<Annotation> = mutableListOf()
    val arguments: MutableList<KTypeProjection> = mutableListOf()
    var classifier: KClassifier? = null
    var isMarkedNullable: Boolean? = null
    var name: String? = null
    var ktype: KType? = null

    fun build(): Type {
        return Type(
            annotations.toList(),
            arguments.toList(),
            classifier,
            isMarkedNullable!!,
            name!!
        )
    }
}
package com.github.jdw.seaofshadows.importing.types

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
    companion object {
        fun builder(): TypeBuilder = TypeBuilder()
        val NAME_TO_TYPE = mutableMapOf<String, Type>()


        fun ktypeToType(name: String, other: KType): Type {
            val builder = builder()
                .apply { isMarkedNullable = other.isMarkedNullable }
                .apply{ this.name = name }

            other.classifier?.let { builder.classifier = other.classifier }
            other.arguments.forEach { builder.arguments.add(it) }
            other.annotations.forEach { builder.annotations.add(it) }

            return builder.build()
        }
    }
}
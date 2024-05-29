package com.github.jdw.seaofshadows.importing.types

import kotlin.reflect.KCallable
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KType
import kotlin.reflect.KTypeParameter
import kotlin.reflect.KVisibility

class Class(override val annotations: List<Annotation>,
            override val constructors: Collection<KFunction<Class>>,
            override val isAbstract: Boolean,
            override val isCompanion: Boolean,
            override val isData: Boolean,
            override val isFinal: Boolean,
            override val isFun: Boolean,
            override val isInner: Boolean,
            override val isOpen: Boolean,
            override val isSealed: Boolean,
            override val isValue: Boolean,
            override val members: Collection<KCallable<*>>,
            override val nestedClasses: Collection<KClass<*>>,
            override val objectInstance: Class?,
            override val qualifiedName: String?,
            override val sealedSubclasses: List<KClass<out Class>>,
            override val simpleName: String?,
            override val supertypes: List<KType>,
            override val typeParameters: List<KTypeParameter>,
            override val visibility: KVisibility?,
            val properties: List<Property>,
            val supertypesSimpleNames: List<String>,
            val urls: Map<String, String>,
            val documentation: String
): KClass<Class> {
    override fun equals(other: Any?): Boolean {
        if (other !is Class) return false

        return this.hashCode() == other.hashCode()
    }

    override fun hashCode(): Int {
        var result = annotations.hashCode()
        result = 31 * result + constructors.hashCode()
        result = 31 * result + isAbstract.hashCode()
        result = 31 * result + isCompanion.hashCode()
        result = 31 * result + isData.hashCode()
        result = 31 * result + isFinal.hashCode()
        result = 31 * result + isFun.hashCode()
        result = 31 * result + isInner.hashCode()
        result = 31 * result + isOpen.hashCode()
        result = 31 * result + isSealed.hashCode()
        result = 31 * result + isValue.hashCode()
        result = 31 * result + members.hashCode()
        result = 31 * result + nestedClasses.hashCode()
        result = 31 * result + objectInstance.hashCode()
        result = 31 * result + qualifiedName.hashCode()
        result = 31 * result + sealedSubclasses.hashCode()
        result = 31 * result + simpleName.hashCode()
        result = 31 * result + supertypes.hashCode()
        result = 31 * result + typeParameters.hashCode()
        result = 31 * result + visibility.hashCode()
        result = 31 * result + documentation.hashCode()
        result = 31 * result + properties.hashCode()
        result = 31 * result + supertypesSimpleNames.hashCode()

        return result
    }

    override fun isInstance(value: Any?): Boolean {
        return value is Class
    }


    companion object {
        fun builder(): ClassBuilder = ClassBuilder()
    }
}
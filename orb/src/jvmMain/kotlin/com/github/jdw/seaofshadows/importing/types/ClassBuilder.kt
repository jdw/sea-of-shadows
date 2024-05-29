package com.github.jdw.seaofshadows.importing.types

import com.github.jdw.seaofshadows.Glob
import kotlin.reflect.KCallable
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KType
import kotlin.reflect.KTypeParameter
import kotlin.reflect.KVisibility

class ClassBuilder: BaseBuilder() {
    val annotations: MutableList<Annotation> = mutableListOf()
    var constructors: MutableList<KFunction<Class>> = mutableListOf()
    var isAbstract: Boolean? = null
    var isCompanion: Boolean? = null
    var isData: Boolean? = null
    var isFinal: Boolean? = null
    var isFun: Boolean? = null
    var isInner: Boolean? = null
    var isOpen: Boolean? = null
    var isSealed: Boolean? = null
    var isValue: Boolean? = null
    var members: MutableList<KCallable<*>> = mutableListOf()
    var nestedClasses: MutableList<KClass<*>> = mutableListOf()
    var objectInstance: Class? = null
    var qualifiedName: String? = null
    var sealedSubclasses: MutableList<KClass<out Class>> = mutableListOf()
    var supertypes: MutableList<KType> = mutableListOf()
    var typeParameters: MutableList<KTypeParameter> = mutableListOf()
    var visibility: KVisibility? = null
    val properties: MutableList<Property> = mutableListOf()
    val supertyesSimpleNames: MutableList<String> = mutableListOf()

    fun build(): Class {
        assert(simpleName!!.isNotBlank() && simpleName!!.isNotEmpty())
        assert(qualifiedName!!.isNotBlank() && qualifiedName!!.isNotEmpty())
        val documentation = getDocumentation()
        assert(documentation.isNotBlank() && documentation.isNotEmpty())

        Glob.keywordsToBeBracketedInKdoc.add(simpleName!!)

        return Class(
            annotations = annotations.toList(),
            constructors = constructors.toList(),
            isAbstract = isAbstract!!,
            isCompanion = isCompanion!!,
            isData = isData!!,
            isFinal = isFinal!!,
            isFun = isFun!!,
            isInner = isInner!!,
            isOpen = isOpen!!,
            isSealed = isSealed!!,
            isValue = isValue!!,
            members = members.toList(),
            nestedClasses = nestedClasses.toList(),
            objectInstance = null,
            qualifiedName = qualifiedName!!,
            sealedSubclasses = sealedSubclasses.toList(),
            simpleName = simpleName!!,
            supertypes = supertypes.toList(),
            typeParameters = typeParameters.toList(),
            visibility = visibility,
            properties = properties.toList(),
            supertypesSimpleNames = supertyesSimpleNames.toList(),
            urls =  urls.toMap(),
            documentation = documentation
        )
    }
}
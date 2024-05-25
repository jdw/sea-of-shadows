package com.github.jdw.seaofshadows.subcommandos.webapi.types

fun Class.Builder.build(): Class {
    assert(simpleName!!.isNotBlank() && simpleName!!.isNotEmpty())
    assert(qualifiedName!!.isNotBlank() && qualifiedName!!.isNotEmpty())
    assert(documentation!!.isNotBlank() && documentation!!.isNotEmpty())

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
        documentation = documentation!!,
        properties = properties.toList(),
        supertypesSimpleNames = supertyesSimpleNames.toList()
    )
}
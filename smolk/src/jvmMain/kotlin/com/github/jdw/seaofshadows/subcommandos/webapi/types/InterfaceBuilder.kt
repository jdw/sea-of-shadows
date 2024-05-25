package com.github.jdw.seaofshadows.subcommandos.webapi.types

fun Interface.Builder.build(): Interface {
    assert(simpleName!!.isNotBlank() && simpleName!!.isNotEmpty())
    assert(qualifiedName!!.isNotBlank() && qualifiedName!!.isNotEmpty())
    assert(documentation!!.isNotBlank() && documentation!!.isNotEmpty())

    return Interface(
        annotations = annotations.toList(),
        constructors = listOf(InterfaceDefaultConstructor(simpleName!!)),
        isAbstract = false,
        isCompanion = false,
        isData = false,
        isFinal = false,
        isFun = false,
        isInner = false,
        isOpen = false,
        isSealed = false,
        isValue = false,
        members = members.toList(),
        nestedClasses = nestedClasses.toList(),
        objectInstance = null,
        qualifiedName = qualifiedName!!,
        sealedSubclasses = emptyList(),
        simpleName = simpleName!!,
        supertypes = supertypes.toList(),
        typeParameters = listOf(),
        visibility = visibility,
        documentation = documentation!!,
        supertypesSimpleNames = supertypeNames.toList(),
        properties = properties.toList(),
        imports = imports.toList()
    )
}
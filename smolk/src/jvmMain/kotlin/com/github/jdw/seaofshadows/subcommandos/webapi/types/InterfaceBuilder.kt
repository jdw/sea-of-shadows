package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.applyKeywords
import kotlin.reflect.KCallable
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.KVisibility


class InterfaceBuilder: BaseBuilder() {
    val annotations: MutableList<Annotation> = mutableListOf()
    var members: MutableList<KCallable<*>> = mutableListOf()
    var nestedClasses: MutableList<KClass<*>> = mutableListOf()
    var qualifiedName: String? = null
    var supertypes: MutableList<KType> = mutableListOf()
    var supertypeNames: MutableList<String> = mutableListOf()
    var visibility: KVisibility? = null
    var properties: MutableList<Property> = mutableListOf()
    var imports: MutableList<KClass<out Any>> = mutableListOf()

    fun build(): Interface {
        assert(simpleName!!.isNotBlank() && simpleName!!.isNotEmpty())
        assert(qualifiedName!!.isNotBlank() && qualifiedName!!.isNotEmpty())
        Glob.keywordsToBeBracketedInKdoc.add(simpleName!!)

        var doc = ""
        getDocumentation().split("\n").forEach { row ->
            if (!row.contains("]: https://")) {
                doc += row
                return@forEach
            }

            val (title, url) = row.split("]: ")

            urls[title.replace("[", "")] = url
        }

        doc = doc.trim()
        assert(doc.isNotBlank() && doc.isNotEmpty())

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
            supertypesSimpleNames = supertypeNames.toList(),
            properties = properties.toList(),
            imports = imports.toList(),
            urls = urls.toMap(),
            documentation = doc
        )
    }
}
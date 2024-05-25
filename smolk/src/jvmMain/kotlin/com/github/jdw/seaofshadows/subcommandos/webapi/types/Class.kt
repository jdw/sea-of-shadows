package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.github.jdw.seaofshadows.subcommandos.webapi.Code
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
            val documentation: String,
            val properties: List<Property>,
            val supertypesSimpleNames: List<String>
): KClass<Class> {
    class Builder {
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
        var simpleName: String? = null
        var supertypes: MutableList<KType> = mutableListOf()
        var typeParameters: MutableList<KTypeParameter> = mutableListOf()
        var visibility: KVisibility? = null
        var documentation: String? = null
        val properties: MutableList<Property> = mutableListOf()
        val supertyesSimpleNames: MutableList<String> = mutableListOf()
    }


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


    fun render(): Code {
        val clazz = this
        val code = Code()

        val packag3 = clazz.qualifiedName!!
            .removeSuffix(".${clazz.simpleName}")

        code.add("package $packag3")
        code.add("")
        code.add("/**")
        code.add(" * ${clazz.documentation}")
        code.add(" */")
        var firstRow = "class ${clazz.simpleName}"

        if (clazz.properties.isNotEmpty()) firstRow += " {"
        code.add(firstRow)
        if (clazz.properties.isNotEmpty()) code.indent()

        clazz.properties.forEach { property -> // Maintain order found in WebIDL, plz!
            var row =
                if (property.mutable) "var "
                else "val "

            row += "${property.name}: ${property.type}"

            property.defaultValue?.let { row += "= ${property.defaultValue}" }
        }

        if (clazz.properties.isNotEmpty()) code.undent()
        if (clazz.properties.isNotEmpty()) code.add("}")

        return code
    }



    companion object {
        fun builder(): Builder = Builder()
    }
}
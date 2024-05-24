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

    class Builder {
        private val annotations: MutableList<Annotation> = mutableListOf()
        private var constructors: MutableList<KFunction<Class>> = mutableListOf()
        private var isAbstract: Boolean? = null
        private var isCompanion: Boolean? = null
        private var isData: Boolean? = null
        private var isFinal: Boolean? = null
        private var isFun: Boolean? = null
        private var isInner: Boolean? = null
        private var isOpen: Boolean? = null
        private var isSealed: Boolean? = null
        private var isValue: Boolean? = null
        private var members: MutableList<KCallable<*>> = mutableListOf()
        private var nestedClasses: MutableList<KClass<*>> = mutableListOf()
        private var objectInstance: Class? = null
        private var qualifiedName: String? = null
        private var sealedSubclasses: MutableList<KClass<out Class>> = mutableListOf()
        private var simpleName: String? = null
        private var supertypes: MutableList<KType> = mutableListOf()
        private var typeParameters: MutableList<KTypeParameter> = mutableListOf()
        private var visibility: KVisibility? = null
        private var documentation: String? = null
        private val properties: MutableList<Property> = mutableListOf()
        private val supertyesSimpleNames: MutableList<String> = mutableListOf()

        fun build(): Class {
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
                visibility = visibility!!,
                documentation = documentation!!,
                properties = properties.toList(),
                supertypesSimpleNames = supertyesSimpleNames.toList()
            )
        }


        fun supertypeSimpleName(value: String): Builder {
            supertyesSimpleNames.add(value)

            return this
        }


        fun property(value: Property): Builder {
            properties.add(value)

            return this
        }


        fun annotation(value: Annotation): Builder {
            annotations.add(value)

            return this
        }


        fun constructor(value: KFunction<Class>): Builder {
            constructors.add(value)

            return this
        }


        fun isAbstract(value: Boolean): Builder {
            isAbstract = value

            return this
        }


        fun isCompanion(value: Boolean): Builder {
            isCompanion = value

            return this
        }


        fun isData(value: Boolean): Builder {
            isData = value

            return this
        }


        fun isFinal(value: Boolean): Builder {
            isFinal = value

            return this
        }


        fun isFun(value: Boolean): Builder {
            isFun = value

            return this
        }


        fun isInner(value: Boolean): Builder {
            isInner = value

            return this
        }


        fun isOpen(value: Boolean): Builder {
            isOpen = value

            return this
        }


        fun isSealed(value: Boolean): Builder {
            isSealed = value

            return this
        }


        fun isValue(value: Boolean): Builder {
            isValue = value

            return this
        }


        fun member(value: KCallable<*>): Builder {
            members.add(value)

            return this
        }


        fun nestedClass(value: KClass<*>): Builder {
            nestedClasses.add(value)

            return this
        }


        fun qualifiedName(value: String): Builder {
            qualifiedName = value

            return this
        }


        fun sealedSubclasse(value: KClass<out Class>): Builder {
            sealedSubclasses.add(value)

            return this
        }


        fun simpleName(value: String): Builder {
            simpleName = value

            return this
        }


        fun supertype(value: KType): Builder {
            supertypes.add(value)

            return this
        }


        fun typeParameter(value: KTypeParameter): Builder {
            typeParameters.add(value)

            return this
        }


        fun visibility(value: KVisibility): Builder {
            visibility = value

            return this
        }


        fun documentation(value: String): Builder {
            documentation = value

            return this
        }
    }

    companion object {
        fun builder(): Builder = Builder()
    }
}
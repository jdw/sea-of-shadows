package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.github.jdw.seaofshadows.subcommandos.webapi.Code
import org.jetbrains.kotlin.util.prefixIfNot
import org.jetbrains.kotlin.util.suffixIfNot
import kotlin.reflect.KCallable
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KType
import kotlin.reflect.KTypeParameter
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVisibility

class Interface(override val annotations: List<Annotation>,
                override val constructors: Collection<KFunction<Any>>,
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
                override val objectInstance: Interface?,
                override val qualifiedName: String?,
                override val sealedSubclasses: List<KClass<out Interface>>,
                override val simpleName: String?,
                override val supertypes: List<KType>,
                override val typeParameters: List<KTypeParameter>,
                override val visibility: KVisibility?,
                val documentation: String,
                val properties: List<Property>,
                val supertypesSimpleNames: List<String>,
                val imports: List<KClass<out Any>> //TODO Remove?
): KClass<Any> {
    fun createType(
        arguments: List<KTypeProjection> = emptyList(),
        nullable: Boolean = false,
        annotations: List<Annotation> = emptyList()
    ): Type {
        return Type.builder()
            .apply { arguments.forEach { this.argument(it) } }
            .apply { annotations.forEach { this.annotation(it) } }
            .isMarkedNullable(nullable)
            .classifier(this)
            .name(this.simpleName!!)
            .build()
    }


    override fun equals(other: Any?): Boolean {
        if (other !is Interface) return false

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
        return value is Interface
    }


    fun render(): Code {
        val code = Code()
        val interfaze = this
        val packag3 = interfaze.qualifiedName!!
            .removeSuffix(".${interfaze.simpleName}")

        code.add("package $packag3")
        code.add("")
        renderImports(interfaze, code, packag3)
        code.add("")
        code.add("/**")
        code.add(" * ${interfaze.documentation}")
        code.add(" */")

        var firstRow = " interface ${interfaze.simpleName}"
        interfaze.visibility?.name?.lowercase().let { firstRow.prefixIfNot(it.orEmpty()) }
        firstRow = firstRow.trim()

        if (interfaze.supertypesSimpleNames.isNotEmpty()) {
            firstRow += ": "

            interfaze.supertypesSimpleNames.forEach { firstRow += "$it, " }
            firstRow = firstRow.removeSuffix(", ")
        }

        if (interfaze.properties.isEmpty()) {
            code.add(firstRow)

            return code
        }

        firstRow += " {"
        code.add(firstRow)
        code.indent()

        interfaze.properties
            .filter { !it.const }
            .forEach {
                val valOrVar =
                    if (it.mutable) "var"
                    else "val"
                code.add("$valOrVar ${it.name}: ${it.type}")
            }

        // Render constants
        val consts = interfaze.properties.filter { it.const }
        renderConstants(consts, code)

        // Render methods
        renderMethods(this, code)
        code.undent()
        code.add("}")

        return code
    }


    class Builder {
        val seeFurtherUrls: MutableSet<String> = mutableSetOf()
        val annotations: MutableList<Annotation> = mutableListOf()
        var members: MutableList<KCallable<*>> = mutableListOf()
        var nestedClasses: MutableList<KClass<*>> = mutableListOf()
        var qualifiedName: String? = null
        var simpleName: String? = null
        var supertypes: MutableList<KType> = mutableListOf()
        var supertypeNames: MutableList<String> = mutableListOf()
        var visibility: KVisibility? = null
        var documentation: String? = null
        var properties: MutableList<Property> = mutableListOf()
        var imports: MutableList<KClass<out Any>> = mutableListOf()


        fun build(): Interface {
            assert(simpleName!!.isNotBlank() && simpleName!!.isNotEmpty())
            assert(qualifiedName!!.isNotBlank() && qualifiedName!!.isNotEmpty())
            assert(documentation!!.isNotBlank() && documentation!!.isNotEmpty())

            return Interface(
                annotations = annotations.toList(),
                constructors = listOf(DefaultInterfaceConstructor(simpleName!!)),
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
    }


    companion object {
        fun builder(): Builder = Builder()


        private fun renderConstants(consts: List<Property>, code: Code) {
            if (consts.isNotEmpty()) {
                code.add("")
                code.add("")
                code.add("companion object {")
                code.indent()
                //TODO Add documentaton from Mozilla's constants page
                consts.forEach {
                    var propertyString = "val ${it.name}: ${it.type} = ${it.defaultValue}"

                    if ("GLenum" == it.type) propertyString += "UL"
                    code.add(propertyString)
                }

                code.undent()
                code.add("}")
            }
        }


        private fun renderImports(interfaze: Interface, code: Code, packag3: String) {
            val imports = mutableSetOf<String>()

            // Adding from interface's own properties
            interfaze.properties.forEach { imports.add(it.type) }

            // Adding from each member method's parameters
            interfaze.members.forEach { member ->
                val method = member as Method
                method.myParameters.forEach { imports.add(Type.IDLNAME_TO_KTNAME(it.typeName)) }
            }

            imports.sorted()
                .filter { !it.contains("kotlin") }
                .map { it.split("<").first() }
                .forEach {
                    if (true) return@forEach // No imports needed as we are in the same package... Doh!
                    if (it.startsWith("com")) code.add("import $it")
                    else code.add("import $packag3.$it")
                }
        }


        private fun renderMethods(interfaze: Interface, code: Code) {
            code.add("")

            interfaze.members.forEach { member -> // Maintain same order as in the IDL
                if (member !is Method) return@forEach
                val method: Method = member

                code.add("/**")
                code.add(" * ${method.documentation.removePrefix("null")}")
                if (method.problems.isNotEmpty()) {
                    code.add(" *")
                    code.add(" * Problems found during importing:")
                    method.problems.forEach { code.add(" * $it") }
                }
                code.add(" *")
                code.add(" * See further documentation:")
                method.seeFurtherUrls.forEach { url ->
                    val withinBrackets =
                        if (url.contains("mozilla")) "Mozilla's"
                        else if (url.contains("khronos")) "Khronos Group's"
                        else url
                    code.add(" * * [$withinBrackets](${url})")
                }
                code.add(" *")
                method.parameters.sortedBy { it.index }.forEach { kparameter ->
                    val parameter = kparameter as Parameter
                    code.add(" * @param ${parameter.name} ${parameter.documentation}")
                }
                code.add(" */")

                var methodSignatureRow = method.visibility?.name?.lowercase() ?: ""
                methodSignatureRow += " fun ${method.name}("
                method.myParameters.sortedBy { it.index }.forEach { it ->
                    methodSignatureRow += "${it.name}: ${it.typeName}, "
                }
                methodSignatureRow = methodSignatureRow.removeSuffix(", ").suffixIfNot(")").trim()
                if (method.problems.isNotEmpty()) methodSignatureRow = methodSignatureRow.prefixIfNot("//")
                code.add(methodSignatureRow)
                code.add("")
                code.add("")
            }
        }
    }
}
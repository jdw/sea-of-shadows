package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.github.jdw.seaofshadows.subcommandos.webapi.Code
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.jetbrains.kotlin.util.prefixIfNot
import org.jetbrains.kotlin.util.suffixIfNot

fun Interface.actuallyRender(): Code {
    runBlocking {
        launch { documentation }
        properties.forEach { launch { it.documentation } }
        members.forEach {
            val method = it as Method
            launch { method.documentation }
            it.parameters.forEach { p ->
                val parameter = p as Parameter
                launch { parameter.documentation }
            }
        }
    }

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

    if (interfaze.properties.isEmpty() && members.isEmpty()) {
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
    renderMembers(this, code)
    code.undent()
    code.add("}")

    return code
}


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
        method.myParameters.forEach { imports.add(Type.IDLPIECE_TO_KTPIECE(it.typeName)) }
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


private fun renderMembers(interfaze: Interface, code: Code) {
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
        method.urls.forEach { url ->
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
package com.github.jdw.seaofshadows.importing.types

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.applyKeywords
import com.github.jdw.seaofshadows.enumClassName
import com.github.jdw.seaofshadows.formatAfterMaxWidth
import com.github.jdw.seaofshadows.importing.Code
import com.github.jdw.seaofshadows.utils.echt
import com.github.jdw.seaofshadows.variableNameToEnumMemberName
import org.jetbrains.kotlin.util.prefixIfNot
import org.jetbrains.kotlin.util.suffixIfNot


fun Interface.renderKotlin(): Code {
    val code = Code()

    val packag3 = qualifiedName!!.removeSuffix(".${simpleName}")

    code.add("package $packag3")
    code.add("")
    renderImports(this, code, packag3)
    code.add("")
    code.add("/**")
    documentation
        .applyKeywords()
        .replace("[`OffscreenCanvasRenderingContext2D`][OffscreenCanvasRenderingContext2D]", "[OffscreenCanvasRenderingContext2D]")
        .replace("[`OffscreenCanvas`][OffscreenCanvas]", "[OffscreenCanvas]")
        .formatAfterMaxWidth().forEach { code.add(" * $it") }
    code.add(" *")
    code.add(" * See further documentation:")
    urls.forEach { (title, url) -> code.add(" * * [$title]($url)") }
    code.add(" */")

    var firstRow = " interface ${simpleName}"
    visibility?.name?.lowercase().let { firstRow.prefixIfNot(it.orEmpty()) }
    firstRow = firstRow.trim()

    if (supertypesSimpleNames.isNotEmpty()) {
        firstRow += ": "

        supertypesSimpleNames.forEach { firstRow += "$it, " }
        firstRow = firstRow.removeSuffix(", ")
    }

    if (properties.isEmpty() && members.isEmpty()) {
        code.add(firstRow)

        return code
    }

    firstRow += " {"
    code.add(firstRow)
    code.indent()

    renderNonConstantProperties(properties, code)

    // Render constants
    val consts = properties.filter { it.const }
    renderConstants(consts, code)

    // Render methods
    renderMembers(this, code)
    code.undent()
    code.add("}")

    return code
}


private fun renderNonConstantProperties(properties: List<Property>, code: Code) {
    properties
        .filter { !it.const }
        .forEach { property ->
            property.allowedValues.isNotEmpty().echt {
                code.add("enum class ${property.name.enumClassName()} {")
                code.indent()
                property
                    .allowedValues
                    .entries
                    .sortedBy { it.key }
                    .forEachIndexed { idx, (allowedValue, dox) -> // Keep alphanumerical
                        if ("" != dox) {
                            code.add("/**")
                            code.add(" * $dox")
                            code.add(" */")
                            val lastMember = idx == property.allowedValues.size - 1
                            val comma = if (lastMember) ""
                                else ","
                            code.add("${allowedValue.variableNameToEnumMemberName()}$comma")
                            if (!lastMember) {
                                code.add("")
                                code.add("")
                            }
                        }
                    }
                code.undent()
                code.add("}")
            }

            val valOrVar =
                if (property.mutable) "var"
                else "val"

            var defaultValueStr = ""
            if (null != property.defaultValue) {
                defaultValueStr =
                    if (property.allowedValues.containsKey(property.defaultValue!!)) {
                        " = ${property.name.enumClassName()}.${property.defaultValue.variableNameToEnumMemberName()}"
                    } else " = ${property.defaultValue}"
            }

            code.add("$valOrVar ${property.name}: ${property.type}$defaultValueStr")
        }
}


private fun renderConstants(consts: List<Property>, code: Code) {
    if (consts.isNotEmpty()) {
        code.add("")
        code.add("")
        code.add("companion object {")
        code.indent()

        var first = true
        consts.forEach {
            var propertyString = "val ${it.name}: ${it.type} = ${it.defaultValue}"

            if ("GLenum" == it.type) propertyString += "UL"
            if ("" != it.documentation) {
                if (!first) {
                    code.add("")
                    code.add("")
                }
                else {
                    first = false
                }
                code.add("/**")
                code.add("* ${it.documentation}")
                code.add(" */")
            }
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
        method.parameters.forEach { kparameter ->
            val parameter = kparameter as Parameter
            imports.add(Glob.translateIDLPieceToKotlinPiece(parameter.typeName))
        }
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
        method.documentation.applyKeywords().formatAfterMaxWidth().forEach { code.add(" * $it") }
        if (method.problems.isNotEmpty()) {
            code.add(" *")
            code.add(" * Problems found during importing:")
            method.problems.forEach { code.add(" * $it") }
        }
        code.add(" *")
        code.add(" * See further documentation:")
        method.urls.forEach { (title, url) -> code.add(" * * [$title]($url)") }
        if (method.parameters.isNotEmpty()) code.add(" *")
        renderParameters(method, code)
        code.add(" */")

        var methodSignatureRow = method.visibility?.name?.lowercase() ?: ""
        methodSignatureRow += " fun ${method.name}("
        method.parameters.sortedBy { it.index }.forEach { kparameter ->
            val parameter = kparameter as Parameter
            methodSignatureRow += "${parameter.name}: ${parameter.typeName}"
            if (parameter.nullable) methodSignatureRow += "?" //TODO Only apply when it makes sense
            methodSignatureRow += ", "
        }
        methodSignatureRow = methodSignatureRow.removeSuffix(", ").suffixIfNot(")").trim()
        val returnType = method.returnType as Type
        if ("Unit" != returnType.name) {
            methodSignatureRow += ": ${returnType.name}"
            if (returnType.isMarkedNullable) methodSignatureRow += "?"
        }

        if (method.problems.isNotEmpty()) methodSignatureRow = methodSignatureRow.prefixIfNot("//")
        code.add(methodSignatureRow)
        code.add("")
        code.add("")
    }
}


private fun renderParameters(method: Method, code: Code) {
    //TODO getTexParameter

    val log = method.name == "compressedTexImage2D"

    method.parameters
        .sortedBy { it.index }
        .forEach { kparameter ->
            val parameter = kparameter as Parameter

            val docs = parameter.documentation
                .applyKeywords()
                .split("\n")

            if (docs[0].contains(" Possible values:")) {
                code.add(" * @param ${parameter.name} ${docs[0].replace(" Possible values:", "")}")
                code.add(" * Possible values:")
            } else {
                code.add(" * @param ${parameter.name} ${docs[0]}")
            }

            (1..<docs.size).forEach { idx ->
                    val doc = docs[idx]

                    doc.formatAfterMaxWidth().forEach {
                        if (it.isNotEmpty() && it.isNotBlank()) {
                            if (it.endsWith(" extension:")) {
                                code.add(" * ${it.removePrefix("  *  ")}")
                                code.add(" *")
                            }
                            else if (it.startsWith("ext.")) {
                                code.add(" *   *  $it")
                            }
                            else if (it.contains("R ext.")) {
                                val its = it.split("R ext.")
                                code.add(" * ${its[0]}R")
                                code.add(" *   *  ext.${its[1]}")
                            }
                            else {
                                code.add(" * $it")
                            }
                        }
                    }
                }
        }
    }

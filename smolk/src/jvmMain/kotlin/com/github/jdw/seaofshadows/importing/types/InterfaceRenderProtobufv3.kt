package com.github.jdw.seaofshadows.importing.types

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.capitalizeFirstLetter
import com.github.jdw.seaofshadows.importing.Code
import com.github.jdw.seaofshadows.toProtobufFieldName
import kotlinx.coroutines.flow.flow
import java.io.File


private fun protobufv3BaseCodeObject(file: File, packageRaw: String): Code {
    val code = Code()
    code.file = file

    val packag3 = if (packageRaw.contains("canvas2d")) {
            if (file.path.contains("/")) "${Glob.GROUP}.canvas2d.${file.path.split("/").first()}".lowercase()
            else "${Glob.GROUP}.canvas2d"
        }
        else "TODO"
    code.add("""syntax = "proto3";""")
    code.add("")
    code.add("package $packag3;")

    code.add("")
    code.add("// Generated with Sea of Shadows version ${Glob.VERSION}")
    code.add("")

    return code
}


fun Interface.renderProtobufv3() = flow<Code> {
    renderBase().forEach { emit(it) }

    renderMembers().forEach { code: Code ->
        emit(code)
    }
}


private fun Interface.renderBase(): List<Code> {
    val ret: MutableList<Code> = mutableListOf()
    val name = simpleName!!.capitalizeFirstLetter()
    val code = protobufv3BaseCodeObject(File("$name.proto"), qualifiedName!!)

    properties.forEach { property ->
        val allowedValuesName = "${property.name.capitalizeFirstLetter()}Value"
        val path = simpleName.lowercase()
        if (property.allowedValues.isNotEmpty()) {
            code.add("""import "$path/$allowedValuesName.proto";""")
        }
    }
    code.addBlankLineIfLastLineIsNotBlank()

    code.add("message $name {")
    code.indent()
    code.add("uint64 parent = 1;")
    properties.forEachIndexed { idx, property ->
        val allowedValuesName = "${property.name.capitalizeFirstLetter()}Value"
        property.renderAllowedValues(allowedValuesName, File("${simpleName.lowercase()}/$allowedValuesName.proto"), qualifiedName).forEach { ret.add(it) }
        var type = when (property.type) {
            "String" -> "string"
            "Int" -> "int32"
            "HTMLCanvasElement" -> "HTMLCanvasElement"
            else -> "<TODO: parameter.typeName = ${property.type}>"
        }
        if (property.allowedValues.isNotEmpty()) type = "${property.name.capitalizeFirstLetter()}Value"
        val name = property.name.toProtobufFieldName()
        val pidx = idx + 2
        code.add("$type $name = $pidx;")
    }
    code.undent()
    code.add("}")
    ret.add(code)

    return ret.toList()
}


fun Property.renderAllowedValues(name: String, file: File, qualifiedName: String): List<Code> {
    if (allowedValues.isEmpty()) return emptyList()

    val code = protobufv3BaseCodeObject(file, qualifiedName)
    code.add("enum $name {")
    code.indent()
    allowedValues
        .entries
        .sortedBy { it.key }
        .forEachIndexed() { idx, pair ->
            val value = pair.key.toProtobufFieldName().uppercase()
            val dox = pair.value
            code.add("/**")
            code.add(" * $dox")
            code.add(" */")
            code.add("$value = $idx;")
            code.add("")
        }
    code.removeTrailingBlankLine()
    code.undent()
    code.add("}")
    return listOf(code)
}

private fun Interface.renderMembers(): List<Code> {
    val ret: MutableList<Code> = mutableListOf()

    members.forEach { member ->
        val method = member as Method
        var code = protobufv3BaseCodeObject(
            File("${simpleName!!.lowercase()}/${method.name.capitalizeFirstLetter()}Request.proto"),
            qualifiedName!!)

        code.add("message ${method.name.capitalizeFirstLetter()}Request {")
        code.indent()
        code.add("uint64 parent = 1;")

        method.parameters.forEach { kparameter ->
            val parameter = kparameter as Parameter
            val type = when (parameter.typeName) {
                "String" -> "string"
                "Int" -> "int32"
                else -> when (parameter.name) {
                    "x",
                    "y",
                    "z",
                    "w" -> "int32"
                    else -> "<TODO: parameter.typeName = ${parameter.typeName}>"
                }
            }
            val name = parameter.name!!.toProtobufFieldName()
            val idx = parameter.index + 2
            code.add("$type $name = $idx;")
        }
        code.undent()
        code.add("}")

        ret.add(code)

        code = protobufv3BaseCodeObject(
            File("$simpleName/${method.name.capitalizeFirstLetter()}Response.proto"),
            qualifiedName)

        code.add("message ${method.name.capitalizeFirstLetter()}Response {")
        code.indent()
        code.add("uint64 parent = 1;")

        var latestIdx = 1
        method.parameters.sortedBy { it.index }.forEach { kparameter ->
            val parameter = kparameter as Parameter
            val type = when (parameter.typeName) {
                "String" -> "string"
                "Int" -> "int32"
                else -> when (parameter.name) {
                    "x",
                    "y",
                    "z",
                    "w",
                    "height",
                    "width" -> "int32"
                    else -> "<TODO: parameter.typeName = ${parameter.typeName}>"
                }
            }
            val name = parameter.name!!.toProtobufFieldName()
            val idx = parameter.index + 2
            latestIdx = idx
            code.add("$type $name = $idx;")
        }
        latestIdx++
        code.add("string result = $latestIdx;")
        code.undent()
        code.add("}")
        ret.add(code)
    }

    return ret.toList()
}
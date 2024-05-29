package com.github.jdw.seaofshadows.importing.types

import com.github.jdw.seaofshadows.importing.Code

fun Class.renderKotlin(): Code {
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
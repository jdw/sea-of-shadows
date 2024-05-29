package com.github.jdw.seaofshadows.subcommandos.rosetta.rowhandlers

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.importing.Code

//TODO Remove... This is done manually
class TypedefRowHandler {
    val rows = mutableListOf<String>()
    val typedefTypes = arrayOf( // Keep types with multiple words first
        "unsigned long" to ULong::class,
        "unsigned short" to UShort::class,
        "unsigned long" to ULong::class,
        "unrestricted float" to Double::class,
        "boolean" to Boolean::class,
        "byte" to Byte::class,
        "short" to Short::class,
        "long" to Long::class,
        "octet" to UByte::class)
    val glTypes = mutableListOf<String>()


    fun render(codes: MutableMap<String, Code>, packag3: String) {
        val code = Code()
        codes["WebGL1Types.kt"] = code
        code.add("package $packag3")
        code.add("")

        rows.forEach {
            val row = it.split(";").first() //TODO

            for (idx in typedefTypes.indices) {
                if (idx < 1) continue

                val type = typedefTypes[idx]
                val idlType = type.first
                val kotlinType = type.second.simpleName
                val name = row.split(" ").last()

                if (row.contains(idlType)) {
                    code.add("typealias $name = $kotlinType")

                    return@forEach
                }
            }

            throw Exception("Unhandled typedef = '$row'")
        }
    }


    fun handleTypedef(row: String) {
        typedefTypes.forEach {
            val javascriptType = it.first

            if (row.contains(javascriptType)) {
                val glType = row.split(javascriptType).last().trim().removeSuffix(";")
                glTypes.add(glType)
                Glob.debug("Adding GL type '$glType'...")
            }
        }

        rows.add(row)
    }
}
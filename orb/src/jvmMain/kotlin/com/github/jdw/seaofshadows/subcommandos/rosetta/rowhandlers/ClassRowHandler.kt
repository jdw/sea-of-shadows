package com.github.jdw.seaofshadows.subcommandos.rosetta.rowhandlers

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.importing.types.Class
import com.github.jdw.seaofshadows.importing.types.ClassBuilder
import com.github.jdw.seaofshadows.importing.types.Property

class ClassRowHandler {
    var currentClassBuilder: ClassBuilder? = null
    val classes = mutableMapOf<String, Class>()


    fun isActive() = currentClassBuilder != null


    fun handleDictionary(row: String, packag3: String) {
        val pieces = row.split(" ")

        currentClassBuilder = Class.builder()
            .apply { simpleName = pieces[1] }
            .apply { qualifiedName= packag3.apply { pieces[1] } }
            .apply { isAbstract = false }
            .apply { isFinal = false }
            .apply { isInner = false }
            .apply { isData = false }
            .apply { isOpen = false }
            .apply { isSealed = false }
            .apply { isValue = false }
            .apply { isCompanion = false }
            .apply { urls["Mozilla"] = "${Glob.MOZILLA_API_BASE_URL}/${simpleName!!}" }
            .apply { isFun = false } // I'm NOT having fun!

        if (":" == pieces[2]) { // We have inheritance
            (2..< pieces.size).forEach { idx ->
                val supertypeSimpleName = pieces[idx]

                if (Glob.isValidKotlinIdentifier(supertypeSimpleName)) {
                    currentClassBuilder!!.supertyesSimpleNames.add(supertypeSimpleName)
                }
            }
        }
    }


    fun handleClassProperty(row: String) {
        val pieces = row.split(" ")
        val builder = Property.builder()
            .apply { type = pieces[0] }
            .apply { name = pieces[1] }
            .apply { const = false }

        if (pieces.size == 4) {
            builder
                .apply { defaultValue = pieces[3] }
                .apply { mutable = false }
        }
        else if (pieces.size == 2) {
            builder
                .apply { mutable = true }
                .build()
        }

        currentClassBuilder!!.properties.add(builder.build())
    }
}
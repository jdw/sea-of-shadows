package com.github.jdw.seaofshadows.subcommandos.webapi.rowhandlers

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Class
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Property
import kotlin.reflect.KVisibility

class ClassRowHandler {
    var currentClassBuilder: Class.Builder? = null
    val classes = mutableMapOf<String, Class>()


    fun isActive() = currentClassBuilder != null


    fun handleDictionary(row: String, packag3: String) {
        val pieces = row.split(" ")

        currentClassBuilder = Class.builder()
            .simpleName(pieces[1])
            .qualifiedName("$packag3.${pieces[1]}")
            .documentation("hej")
            .isAbstract(false)
            .isFinal(false)
            .isInner(false)
            .isData(false)
            .isOpen(false)
            .isSealed(false)
            .isValue(false)
            .isCompanion(false)
            .isFun(false) // I'm NOT having fun!
            .visibility(KVisibility.PUBLIC)

        if (":" == pieces[2]) { // We have inheritance
            (2..< pieces.size).forEach { idx ->
                val supertypeSimpleName = pieces[idx]

                if (Glob.isValidKotlinIdentifier(supertypeSimpleName)) {
                    currentClassBuilder!!.supertypeSimpleName(supertypeSimpleName)
                }
            }
        }
    }


    fun handleClassProperty(row: String) {
        val pieces = row.split(" ")

        if (pieces.size == 4) {
            currentClassBuilder!!.property(
                Property.builder()
                    .type(pieces[0])
                    .name(pieces[1])
                    .defaultValue(pieces[3])
                    .const(false)
                    .mutable(false)
                    .build())
        }
        else if (pieces.size == 2) {
            val property = Property.builder()
                .type(pieces[0])
                .name(pieces[1])
                .const(false)
                .mutable(true)
                .build()

            currentClassBuilder!!.property(property)
        }
    }
}
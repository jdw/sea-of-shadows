package com.github.jdw.seaofshadows.subcommandos.webapi.rowhandlers

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Interface
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Method
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Property
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Type
import com.github.jdw.seaofshadows.subcommandos.webapi.types.build
import com.github.jdw.seaofshadows.subcommandos.webapi.types.fetchDocumentation
import com.github.jdw.seaofshadows.subcommandos.webapi.types.fetchMozillaDocumentationUrl
import com.github.jdw.seaofshadows.subcommandos.webapi.types.handleEndRow
import com.github.jdw.seaofshadows.subcommandos.webapi.types.handleOneRowMethodDeclarationWithParameters
import com.github.jdw.seaofshadows.subcommandos.webapi.types.handleOneRowMethodDeclarationWithoutMethodParameters
import com.github.jdw.seaofshadows.subcommandos.webapi.types.parseParametersRow
import com.github.jdw.seaofshadows.utils.throws
import kotlin.reflect.KClass

typealias Kaka = List<String>

class InterfaceRowHandler {
    var currentInterfaceBuilder: Interface.Builder? = null
    val interfaces = mutableMapOf<String, Interface>()
    var currentMethodBuilder: Method.Builder? = null


    fun isHandlingMethod() = currentMethodBuilder != null

    fun handleInterface(row: String, packag3: String, predefinedSupertypes: Map<String, KClass<out Any>>) {
        val pieces = row.split(" ")
        val name =
            if (pieces[1] == "mixin") pieces[2]
            else pieces[1]
        val builder = Interface.builder()
            .apply { simpleName = name }
            .apply { qualifiedName = "$packag3.$name" }
            .apply { documentation = "SiC" }
        currentInterfaceBuilder = builder

        var weHaveInheritance = -1
        for (idx in pieces.indices) {
            if (pieces[idx].equals(":")) {
                weHaveInheritance = idx
                break
            }
        }

        if (-1 != weHaveInheritance)
            (weHaveInheritance..< pieces.size)
                .filter { Glob.isValidKotlinIdentifier(pieces[it]) }
                .forEach { // Maintain same order as in IDL file
                    val supertypeName = pieces[it].replace(",", "")

                    if (interfaces.containsKey(supertypeName)) {
                        val interfaze = interfaces[supertypeName]!!
                        builder.supertypeNames.add(interfaze.simpleName!!)
                    }
                    else if (predefinedSupertypes.containsKey(supertypeName)) {
                        val clazz = predefinedSupertypes[supertypeName]!!
                        builder.apply { imports.add(clazz) }
                            .apply { supertypeNames.add(clazz.simpleName!!) }
                    }
                    else {
                        throw Exception("Supertype '$supertypeName' unknown!")
                    }
                }
    }


    fun handleEndOfInterface(): Interface {
        val interfaze = currentInterfaceBuilder!!.build()
        interfaces[interfaze.simpleName!!] = interfaze
        currentInterfaceBuilder = null

        return interfaze
    }


    fun handleReadOnly(row: String, predefinedSupertypes: Map<String, KClass<out Any>>) {
        val pieces = row.trim().split(" ")
        val builder = Property.builder().apply { const = false }
        var typeHasBeenChecked = false

        for (idx in pieces.indices) {
            val block = pieces[idx]
            if ("readonly" == block) {
                builder.mutable = false
                continue
            }
            if ("attribute" == block) continue

            if (!typeHasBeenChecked) {
                assert(Type.NAME_TO_TYPE.containsKey(block) || predefinedSupertypes.containsKey(block))

                typeHasBeenChecked = true
                builder.type = block
            }

            builder.name = block.removeSuffix(";")
        }

        currentInterfaceBuilder!!.properties.add(builder.build())
    }


    fun isActive() = currentInterfaceBuilder != null


    fun handleMethod(row: String) {
        val pieces = row.split(" ").toMutableList()

        if ("[WebGLHandlesContextLoss]" == pieces[0]) pieces.removeFirst()

        val returnTypeRaw = pieces[0]
        val returnTypeName = returnTypeRaw.removeSuffix("?")
        val returnTypeIsNullable = returnTypeRaw.trim().endsWith("?")
        val methodRaw = pieces[1]
        val methodName = methodRaw.split("(").first()

        val builder = Method.builder()
            .apply { parent = currentInterfaceBuilder }
            .apply { name = methodName }
            .apply { seeFurtherUrls.add(fetchMozillaDocumentationUrl()) }
            .apply { this.returnType = Type.builder()
                .apply { isMarkedNullable = returnTypeIsNullable }
                .apply { name = Type.IDLPIECE_TO_KTPIECE(returnTypeName) }
                .build() }
            .apply { isSuspend = false }
            .apply { isOpen = false }
            .apply { isFinal = false }
            .apply { isAbstract = false }
            .apply { documentation = fetchDocumentation() }


        if (methodRaw.contains("();")) {
            builder.handleOneRowMethodDeclarationWithoutMethodParameters();
            currentInterfaceBuilder!!.members.add(builder.build())

            return
        }

        if (pieces.last().trim().endsWith(");")) {
            builder.handleOneRowMethodDeclarationWithParameters(row)
            currentInterfaceBuilder!!
                .members.add(builder.build())

            return
        }

        if (pieces.last().trim().endsWith(",")) {
            val splitOnLeftParanthesis = row.removeSuffix(",").split("(")

            if (splitOnLeftParanthesis.size != 2) throws()

            val parametersRaw = splitOnLeftParanthesis.last()
            builder.parseParametersRow(parametersRaw)
            currentMethodBuilder = builder

            return
        }
    }


    fun handleOngoingMethod(rowRaw: String) {
        val row =
            if (rowRaw.contains("//")) rowRaw.split("//").first().trim() //TODO Should be checked much sooner
            else rowRaw

        if (!(row.endsWith(");") || row.endsWith(","))) throw IllegalStateException("Faulty end of row in ongoing method context!")

        if (row.endsWith(");")) { // End of method declaration
            currentMethodBuilder!!.handleEndRow(row.removeSuffix(");"))
            currentMethodBuilder = null

            return
        }
    }


    fun handleConst(row: String) { //TODO Import comments from Mozilla
        val pieces = row.split(" ").filter { it.isNotEmpty() && it.isNotBlank() }

        assert(pieces.size == 5)

        val property = Property.builder()
                .apply { mutable = false }
                .apply { const = true }
                .apply { type = pieces[1] }
                .apply { name = pieces[2] }
                .apply { defaultValue = pieces[4].removeSuffix(";") }
                .build()

        currentInterfaceBuilder!!.properties.add(property)
    }
}
package com.github.jdw.seaofshadows.subcommandos.webapi.rowhandlers

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.subcommandos.Webapi
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Class
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Interface
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Method
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Parameter
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Property
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Type
import kotlin.reflect.KClass
import kotlin.reflect.KParameter
import kotlin.reflect.full.createType

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
        val builder = Property.builder().const(false)
        var typeHasBeenChecked = false

        for (idx in pieces.indices) {
            val block = pieces[idx]
            if ("readonly" == block) {
                builder.mutable(false)
                continue
            }
            if ("attribute" == block) continue

            if (!typeHasBeenChecked) {
                assert(Type.NAME_TO_TYPE.containsKey(block) || predefinedSupertypes.containsKey(block))

                typeHasBeenChecked = true
                builder.type(block)
            }

            builder.name(block.removeSuffix(";"))
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
        val methodUrl = Webapi.figureOutMethodDocumentationUrl(currentInterfaceBuilder!!.simpleName!!, methodRaw.split("(").first())

        val methodBuilder = Method.builder()
            .name(methodRaw.split("(").first())
            .returnType(
                Type
                    .builder()
                    .isMarkedNullable(returnTypeIsNullable)
                    .name(Type.IDLNAME_TO_KTNAME(returnTypeName))
                    .build())
            .url(methodUrl)
            .isSuspend(false)
            .isOpen(false)
            .isFinal(false)
            .isAbstract(false)

            Webapi.fetchMethodDocumentation(methodUrl, methodBuilder)


        if (methodRaw.contains("();")) {
            handleOneRowMethodDeclarationWithoutMethodParameters(methodBuilder);
            currentInterfaceBuilder!!.members.add(methodBuilder.build())

            return
        }

        if (pieces.last().trim().endsWith(");")) {
            handleOneRowMethodDeclarationWithParameters(row, methodBuilder)
            currentInterfaceBuilder!!
                .members.add(methodBuilder.build())

            return
        }

        if (pieces.last().trim().endsWith(",")) {
            val splitOnLeftParanthesis = row.removeSuffix(",").split("(")

            if (splitOnLeftParanthesis.size != 2) throw IllegalStateException("Row '$row' resulted in size = ${splitOnLeftParanthesis.size}")

            val parametersRaw = splitOnLeftParanthesis.last()
            parametersRawToParameters(parametersRaw, methodBuilder)
            currentMethodBuilder = methodBuilder

            return
        }
    }


    private fun handleOneRowMethodDeclarationWithParameters(row: String, methodBuilder: Method.Builder) {
        val splitOnLeftParantheses = row.split("(")
        if (splitOnLeftParantheses.size != 2) throw IllegalStateException("Row '$row' yielded ${splitOnLeftParantheses.size} pieces!")
        val parametersRaw = splitOnLeftParantheses.last().removeSuffix(");")

        try {
            parametersRawToParameters(parametersRaw, methodBuilder)
        }
        catch (e: Exception) {
            methodBuilder.problem(e.message ?: "Problems adding parameter!")
        }
    }


    private fun handleOneRowMethodDeclarationWithoutMethodParameters(methodBuilder: Method.Builder) {

    }


    fun handleOngoingMethod(rowRaw: String) {
        val row =
            if (rowRaw.contains("//")) rowRaw.split("//").first().trim()
            else rowRaw

        if (!(row.endsWith(");") || row.endsWith(","))) throw IllegalStateException("Faulty end of row in ongoing method context!")

        if (row.endsWith(");")) { // End of method declaration
            handleEndOfOngoingMethod(row.removeSuffix(");"))

            return
        }

        if (row.endsWith(",")) { // Method declaration continues with next row
            return
        }
    }


    private fun handleEndOfOngoingMethod(row: String) {
        val methodBuilder = currentMethodBuilder!!
        try {
            parametersRawToParameters(row, methodBuilder)
        }
        catch (e: Exception) {
            methodBuilder.problem(e.message ?: "Problem when handling '$row'!")
        }

        currentInterfaceBuilder!!.members.add(methodBuilder.build())
        currentMethodBuilder = null
    }

    private fun parametersRawToParameters(parametersRaw: String, methodBuilder: Method.Builder) {
        assert(parametersRaw.contains("(") || parametersRaw.contains(");") || parametersRaw.endsWith(", "))

        parametersRaw.split(", ").forEach { parameterPair ->
            val pieces = parameterPair.split(" ")
            val parameterName = Type.IDLNAME_TO_KTNAME(pieces[1])
            val parameterTypeRaw = pieces[0]
            val parameterType = parameterTypeRaw.removeSuffix("?")
            val documentation = try {
                    Webapi.fetchParameterDocumentation(parameterName, parameterType, methodBuilder.seeFurtherUrls)
                }
                catch (e: Exception) {
                    "This parameter caused unspecified trouble while importing!"
                }

            val parameter = Parameter.builder()
                .type(Nothing::class.createType())
                .name(parameterName)
                .typeName(Type.IDLNAME_TO_KTNAME(parameterType))
                .index(methodBuilder.nextParameterIndex())
                .documentation(documentation)
                .isOptional(false)
                .isVararg(false)
                .kind(KParameter.Kind.VALUE) //TODO Might not be correct...
                .build()

            methodBuilder.parameter(parameter)
        }
    }


    fun handleConst(row: String) {
        val pieces = row.split(" ").filter { it.isNotEmpty() && it.isNotBlank() }

        assert(pieces.size == 5)

        val property =
            Property
                .builder()
                .mutable(false)
                .const(true)
                .type(pieces[1])
                .name(pieces[2])
                .defaultValue(pieces[4].removeSuffix(";"))
                .build()

        currentInterfaceBuilder!!.properties.add(property)
    }
}
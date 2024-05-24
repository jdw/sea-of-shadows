package com.github.jdw.seaofshadows.subcommandos

import com.github.ajalt.clikt.core.CliktCommand
import kotlinx.serialization.protobuf.schema.ProtoBufSchemaGenerator

class Protobuf: CliktCommand(help="Generate protobuf files from Kotlin classes.") {
    override fun run() {
        //https://kotlinlang.org/api/kotlinx.serialization/kotlinx-serialization-protobuf/kotlinx.serialization.protobuf.schema/-proto-buf-schema-generator/
        //ProtoBufSchemaGenerator.generateSchemaText()
        println("Generating...")


    }
}
package com.github.jdw.seaofshadows.subcommandos

import com.github.ajalt.clikt.core.CliktCommand
import kotlinx.serialization.protobuf.schema.ProtoBufSchemaGenerator

class Protobuf: CliktCommand(help="Generate protobuf files from imported assets.") {
    override fun run() {
        println("Generating...")


    }
}
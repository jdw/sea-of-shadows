package com.github.jdw.seaofshadows

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.boolean
import com.github.jdw.seaofshadows.core.messaging.SerializationTarget
import com.github.jdw.seaofshadows.subcommandos.Protobuf
import com.github.jdw.seaofshadows.subcommandos.Settings
import com.github.jdw.seaofshadows.subcommandos.Webapi
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.json.Json
import kotlinx.serialization.protobuf.ProtoBuf

class SeaOfShadows: CliktCommand(name="seaofshadows") {
    val versbose by option("-v", "--verbose", help="Verbose output (default: false).").boolean().default(false)

    override fun run() = Unit
}

@OptIn(ExperimentalSerializationApi::class)
fun main(args: Array<String>) = SeaOfShadows()
    .subcommands(Webapi(), Protobuf(), Settings())
    .main(args)

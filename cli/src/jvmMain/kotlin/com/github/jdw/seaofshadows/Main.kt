package com.github.jdw.seaofshadows

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.boolean
import com.github.jdw.seaofshadows.subcommandos.Protobuf
import com.github.jdw.seaofshadows.subcommandos.Settings
import com.github.jdw.seaofshadows.subcommandos.Webapi

class SeaOfShadows: CliktCommand(name="seaofshadows") {
    val versbose by option("-v", "--verbose", help="Verbose output (default: false).").boolean().default(false)

    override fun run() = Unit
}

fun main(args: Array<String>) = SeaOfShadows()
    .subcommands(Webapi(), Protobuf(), Settings())
    .main(args)

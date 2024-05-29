package com.github.jdw.seaofshadows

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.jdw.seaofshadows.subcommandos.Protocol
import com.github.jdw.seaofshadows.subcommandos.Settings
import com.github.jdw.seaofshadows.subcommandos.Rosetta
import kotlinx.serialization.ExperimentalSerializationApi

class SeaOfShadows: CliktCommand(name="seaofshadows") {
    val verbose by option("-v", "--verbose", help="Verbose output (default: false).").flag()

    override fun run() {
        Glob.verbose = verbose
    }
}


fun main(args: Array<String>)  {
    SeaOfShadows()
    .subcommands(Rosetta(), Protocol(), Settings())
    .main(args)
}

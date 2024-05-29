package com.github.jdw.seaofshadows.subcommandos

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.path
import com.github.jdw.seaofshadows.subcommandos.protocol.Canvas2d

class Protocol: CliktCommand(help="Generate serde files from imported assets.") {
    val zip by option(help = "Zip files as you go.").flag()
    val zipPath by option("-zp", "--zip-path", help = "Base path for the zip files.").path(mustExist = true)
    val deleteWithoutAsking by option("-dwa", "--delete-without-asking", help = "Delete already existing protocol files without asking first. Use this with caution!")
        .flag(default = false)
    val canvas2d = Canvas2d()

    init {
        subcommands(canvas2d)
    }

    override fun run() {
        canvas2d.deleteWithoutAsking = deleteWithoutAsking
    }
}
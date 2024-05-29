package com.github.jdw.seaofshadows.subcommandos

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.validate
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.types.file
import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.subcommandos.rosetta.Canvas2d
import com.github.jdw.seaofshadows.subcommandos.rosetta.WebGL1
import com.github.jdw.seaofshadows.utils.doch
import com.github.jdw.seaofshadows.utils.echt
import com.github.jdw.seaofshadows.utils.throws
import kotlinx.coroutines.runBlocking
import java.io.File
import kotlin.system.exitProcess


class Rosetta(): CliktCommand(help="Import Khronos Group and Mozilla WebAPI documentation from ${Glob.KHRONOS_BASE_URL} or ${Glob.MOZILLA_API_BASE_URL} to local files.") {

    init {
        subcommands(Canvas2d(), WebGL1())
    }
    override fun run() {

    }
}


fun Set<String>.supportedValues(edges: Pair<Char, Char>, separator: Char = ','): String {
    if (this.isEmpty()) return ""

    var ret = "${edges.first}"
    this.forEach {
        ret += "$it$separator"
    }

    return "${ret.removeSuffix(separator.toString())}${edges.second}".replace(" ", "")
}
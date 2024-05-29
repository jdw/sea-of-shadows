package com.github.jdw.seaofshadows.subcommandos

import com.github.ajalt.clikt.core.CliktCommand
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
    private val supportedApis: Set<String> = setOf("webgl1", "canvas2d")
    private val api by argument(help = "The APIs listed at the aforementioned site. ${supportedApis.supportedValues('<' to '>', '|')}.")
        .validate {
            require(supportedApis.contains(it)) {
                "The API argument must be any of ${supportedApis.supportedValues('<' to '>', '|')}."
            }
        }
    private val supportedLanguages: Set<String> = setOf("kotlin")
    private val language by option("-l", "--language", help = "The language to render code to. ${supportedLanguages.supportedValues('<' to '>', '|')}")
        .default("kotlin")
    private val path by option("-p", "--path", help = "The path to write generated source code files to.")
        .file(canBeDir = true, mustExist = true)
        .required()
    private val delete by option("-d", "--delete", help = "Delete the already imported files in the path.").flag()

    override fun run() {
        handleDeletion()

        runBlocking {
            when (api) {
                "webgl1" -> WebGL1(path, language).apply { run() }
                "canvas2d" -> Canvas2d(path, language).run()
                else -> throws()
            }
        }

        exitProcess(0)
    }


    private fun handleDeletion() {
        delete.echt {
            val files = path.list()!!.forEach { fileName: String ->
                with(File("${path.path}/$fileName")) {
                    readLines()
                        .any { it.contains("//PROTECT_FROM_AUTODELETE") }
                        .echt { delete() }
                        .doch { Glob.debug("Did not delete '${this.name}'...") }
                }
            }
        }
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
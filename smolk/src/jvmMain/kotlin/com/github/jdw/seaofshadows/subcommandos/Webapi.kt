package com.github.jdw.seaofshadows.subcommandos

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.validate
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.types.file
import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.subcommandos.webapi.WebGL1
import com.github.jdw.seaofshadows.subcommandos.webapi.WebGL2
import com.github.jdw.seaofshadows.utils.doch
import com.github.jdw.seaofshadows.utils.echt
import kotlinx.coroutines.runBlocking
import java.io.File
import kotlin.system.exitProcess


class Webapi(): CliktCommand(help="Import Khronos and Mozilla WebAPI documentation from ${Glob.MOZILLA_API_BASE_URL} to local Kotlin files and classes.") {
    private val supportedApis: Set<String> = setOf("WebGL1", "WebGL2")
    private val api by argument(help = "The APIs listed at the aforementioned site but without spaces and kept capitalization. ${supportedApis.supportedValues('<' to '>', '|')}.")
        .validate {
            require(supportedApis.contains(it)) {
                "The API argument must be any of ${supportedApis.supportedValues('<' to '>', '|')}."
            }
        }
    private val path by option("-p", "--path", help = "The path to write generated Kotlin files to.").file(canBeDir = true, mustExist = true).required()
    private val delete by option("-d", "--delete", help = "Delete the already imported files in the path.").flag()

    override fun run() {
        handleDeletion()

        runBlocking {
            when (api) {
                "WebGL1" -> WebGL1(path).apply { run() }.apply { save() }
                "WebGL2" -> {
                    WebGL1(path).apply { run() }.apply { save() }
                    WebGL2().run(path)
                }
                else -> throw Exception("Unsupported API = '$api'!")
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
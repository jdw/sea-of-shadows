package com.github.jdw.seaofshadows.subcommandos

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.file
import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.utils.doch
import com.github.jdw.seaofshadows.utils.echt
import java.io.File

abstract class ApiSubcommand(help: String, defaultPath: File): CliktCommand(help = help) {
    val path by option("-p", "--path", help = "The path to write generated source code files to. Default value is '${defaultPath.toPath()}'.")
        .file(canBeDir = true, mustExist = true)
        .default(defaultPath)
    private val supportedLanguages: Set<String> = setOf("kotlin")
    val language by option("-l", "--language", help = "The language to render code to. Supported values are ${supportedLanguages.supportedValues('<' to '>', '|')}")
        .default("kotlin")

    private val delete by option("-d", "--delete", help = "Delete the already imported files in the path.").flag()

    fun handleDeletion() {
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
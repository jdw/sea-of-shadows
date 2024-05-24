package com.github.jdw.seaofshadows.subcommandos

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.optional
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.file
import com.github.jdw.seaofshadows.core.Settings
import com.github.jdw.seaofshadows.core.validate
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File
import kotlin.system.exitProcess

class Settings: CliktCommand(help="Validate given JSON file towards the core.Settings Kotlin data class.", printHelpOnEmptyArgs = true) {
    val file: File? by argument(help = "Either the file to create with default settings or if it already exists then it will be parsed and validated towards the core.Settings Kotlin data class.")
        .file()
        .optional()
    val validationHelp: Boolean by option(help = "Print validation help and exit.").flag(default = false)

    override fun run() {
        println()
        if (validationHelp) {
            var format = Json {
                encodeDefaults = true
                prettyPrint = true
            }

            val defaultSettings = Settings()
            defaultSettings.meansOfCommunicationPrioritizations
            println("Default settings is:\n${format.encodeToString(defaultSettings)}")
            println()
            format = Json {
                encodeDefaults = false
                prettyPrint = true
            }
            println("Minimum settings is:\n${format.encodeToString(defaultSettings)}")

            println()
            format = Json {
                encodeDefaults = true
                prettyPrint = true
            }
            val data = format.encodeToString(Json.decodeFromString<Settings>("{}"))
            println("Resulting settings for minimum settings is:\n$data")

            exitProcess(0)
        }

        if (null != file) {
            val fileNonNull = file!!
            if (fileNonNull.exists() && fileNonNull.isFile) {
                val data = fileNonNull.readText()
                try {
                    val settings = Json.decodeFromString<Settings>(data)
                    println("Parsing of ${fileNonNull.absoluteFile} succeeded!")
                    try {
                        val result = settings.validate()
                        println("Validation of ${fileNonNull.absoluteFile} succeeded!")
                    }
                    catch (e: Exception) {
                        println("Validation of ${fileNonNull.absoluteFile} failed!")
                    }
                }
                catch (e: Exception) {
                    println("Failed parsing file ${fileNonNull.absoluteFile}!")
                }
            }
            else {
                println("Saving default settings to ${fileNonNull.absoluteFile}")
                val format = Json {
                    encodeDefaults = true
                    prettyPrint = true
                }

                val data = format.encodeToString(Settings())
                fileNonNull.writeText(data)
            }
        }
    }
}
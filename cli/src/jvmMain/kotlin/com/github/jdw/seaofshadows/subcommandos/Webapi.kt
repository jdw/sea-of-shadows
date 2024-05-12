package com.github.jdw.seaofshadows.subcommandos

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.jdw.seaofshadows.subcommandos.mozillaexporters.WebGL
import kotlinx.coroutines.runBlocking
import kotlin.system.exitProcess


class Webapi(): CliktCommand(help="Export Mozilla WebAPI documentation from $MOZILLA_BASE_URL to local Kotlin files and classes.") {
    val supportedApis: Set<String> = setOf("WebGL")
    val api by argument(help = "The APIs listed at the aforementioned site but without spaces and kept capitalization. ${supportedApis.supportedValues('<' to '>', '|')}")
    val supportedSections: Set<String> = setOf("constants", "extensions", "interfaces")
    val section by option("-s", "--section", help = "Supported sections of the WebGL API. ${supportedSections.supportedValues('<' to '>', '|')}.").default("")
    val version by option("-v", "--version", help = "API version.")

    override fun run() {
        runBlocking {
            when (api) {
                "WebGL" -> WebGL().run(section)
            }
        }

        exitProcess(0)
    }

    companion object {
        const val MOZILLA_BASE_URL = "https://developer.mozilla.org/en-US/docs/Web/API"
        const val MOZILLA_WEBGL_CONSTANTS_URL = "https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants"
    }
}

fun Set<String>.supportedValues(edges: Pair<Char, Char>, separator: Char = ','): String {
    if (this.isEmpty()) {
        return ""
    }

    var ret = "${edges.first}"
    this.forEach {
        ret += "$it$separator"
    }

    return "${ret.removeSuffix(separator.toString())}${edges.second}".replace(" ", "")
}
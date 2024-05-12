package com.github.jdw.seaofshadows.subcommandos

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.validate
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.validate
import com.github.jdw.seaofshadows.subcommandos.mozillaexporters.WebGL1
import com.github.jdw.seaofshadows.subcommandos.mozillaexporters.WebGL2
import kotlinx.coroutines.runBlocking
import kotlin.system.exitProcess


class Webapi(): CliktCommand(help="Export Mozilla WebAPI documentation from $MOZILLA_BASE_URL to local Kotlin files and classes.") {
    val supportedApis: Set<String> = setOf("WebGL1", "WebGL2")
    val api by argument(help = "The APIs listed at the aforementioned site but without spaces and kept capitalization. ${supportedApis.supportedValues('<' to '>', '|')}.")
        .validate {
            require(supportedApis.contains(it)) {
                "The API argument must be any of ${supportedApis.supportedValues('<' to '>', '|')}."
            }
        }
    val supportedSections: Set<String> = setOf("constants", "extensions", "interfaces")
    val section by option("-s", "--section", help = "Supported sections of the WebGL1 API. ${supportedSections.supportedValues('<' to '>', '|')}.")
        .default("")
        .validate {
            require(supportedSections.contains(it)) {
                "Section must be any of ${supportedSections.supportedValues('<' to '>', '|')}."
            }
        }

    override fun run() {
        runBlocking {
            when (api) {
                "WebGL1" -> WebGL1().run(section)
                "WebGL2" -> WebGL2().run(section)
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
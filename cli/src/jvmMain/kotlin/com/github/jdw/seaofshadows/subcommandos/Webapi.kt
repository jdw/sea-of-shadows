package com.github.jdw.seaofshadows.subcommandos

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.validate
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.options.validate
import com.github.ajalt.clikt.parameters.types.file
import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.subcommandos.importers.WebGL1Constants
import com.github.jdw.seaofshadows.subcommandos.importers.WebGL2Constants
import com.github.jdw.seaofshadows.subcommandos.importers.WebGL2
import fuel.httpGet
import kotlinx.coroutines.runBlocking
import kotlin.io.path.Path
import kotlin.io.path.createParentDirectories
import kotlin.io.path.exists
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.system.exitProcess


class Webapi(): CliktCommand(help="Export Mozilla WebAPI documentation from ${Glob.MOZILLA_API_BASE_URL} to local Kotlin files and classes.") {
    val supportedApis: Set<String> = setOf("WebGL2")
    val api by argument(help = "The APIs listed at the aforementioned site but without spaces and kept capitalization. ${supportedApis.supportedValues('<' to '>', '|')}.")
        .validate {
            require(supportedApis.contains(it)) {
                "The API argument must be any of ${supportedApis.supportedValues('<' to '>', '|')}."
            }
        }
    val path by option("-p", "--path", help = "The path to write to.").file(canBeDir = true, mustExist = true).required()

    override fun run() {
        runBlocking {
            when (api) {
                "WebGL2" -> WebGL2().run(path)
            }
        }

        exitProcess(0)
    }

    companion object {
        fun fetchCache(httpUrl: String): String {
            val cacheBasePath = "cache"

            val path =
                if (httpUrl.endsWith(".html") || httpUrl.endsWith(".idl")) Path("$cacheBasePath/${httpUrl.replace("https://", "").replace("http://","")}")
                else Path("$cacheBasePath/${httpUrl.replace("https://", "").replace("http://","")}.html")

            return if (!path.exists()) {
                path.createParentDirectories()
                var body = ""
                runBlocking {
                    Glob.debug("Fetching '$httpUrl'...")
                    body = httpUrl.httpGet().body
                }

                path.writeText(body)
                body
            }
            else {
                path.readText()
            }
        }
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
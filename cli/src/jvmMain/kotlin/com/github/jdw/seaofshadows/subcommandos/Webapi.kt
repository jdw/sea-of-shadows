package com.github.jdw.seaofshadows.subcommandos

import com.fleeksoft.ksoup.Ksoup
import com.fleeksoft.ksoup.parseInputStream
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.types.path
import fuel.httpGet
import kotlinx.coroutines.runBlocking

private val mozillaUrl = "https://developer.mozilla.org/en-US/docs/Web/API"

class Webapi(): CliktCommand(help="Export Mozilla WebAPI documentation from $mozillaUrl to local Kotlin classes.") {
    val supportedApis: Set<String> = setOf("WebGL", "Canvas API")
    val api by argument(help = supportedApis.help('<' to '>', '|'))
    val path by argument(help = "Path to put the generated Kotlin classes'.").path(mustExist = true, canBeDir = true)

    override fun run() {
        val apis: MutableSet<String> = mutableSetOf()
        //KSoup
    }
}

fun Set<String>.help(edges: Pair<Char, Char>, separator: Char = ','): String {
    if (this.isEmpty()) {
        return "The APIs listed at the aforementioned site but without spaces and kept capitalization."
    }

    var ret = "${edges.first}"
    this.forEach {
        ret += "$it$separator"
    }

    return "${ret.removeSuffix(separator.toString())}${edges.second}".replace(" ", "")
}
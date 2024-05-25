package com.github.jdw.seaofshadows.subcommandos

import com.fleeksoft.ksoup.Ksoup
import com.fleeksoft.ksoup.nodes.Element
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
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Method
import com.github.jdw.seaofshadows.utils.doch
import com.github.jdw.seaofshadows.utils.echt
import com.github.jdw.seaofshadows.utils.throws
import kotlinx.coroutines.runBlocking
import java.io.File
import kotlin.system.exitProcess


class Webapi(): CliktCommand(help="Import Khronos and Mozilla WebAPI documentation from ${Glob.MOZILLA_API_BASE_URL} to local Kotlin files and classes.") {
    val supportedApis: Set<String> = setOf("WebGL1", "WebGL2")
    val api by argument(help = "The APIs listed at the aforementioned site but without spaces and kept capitalization. ${supportedApis.supportedValues('<' to '>', '|')}.")
        .validate {
            require(supportedApis.contains(it)) {
                "The API argument must be any of ${supportedApis.supportedValues('<' to '>', '|')}."
            }
        }
    val path by option("-p", "--path", help = "The path to write generated Kotlin files to.").file(canBeDir = true, mustExist = true).required()
    val delete by option("-d", "--delete", help = "Delete the already imported files in the path.").flag()

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


    companion object {
        fun figureOutMethodDocumentationUrl(interfaze: String, nameRaw: String): String {
            val baseUrl = "${Glob.MOZILLA_API_BASE_URL}/$interfaze".replace("WebGLRenderingContextBase", "WebGLRenderingContext")
            val doc = Ksoup.parse(Glob.fetchCache(baseUrl))

            var listOfMethods: Element? = null

            doc.getElementsByTag("summary").forEach {
                if (it.html() == "Instance methods") {
                    listOfMethods = it.parent()!!.getElementsByTag("ol")[0]
                }
            }

            nameRaw.indices.forEach { idx ->
                val namePart = nameRaw.substring(0..nameRaw.length - 1 - idx)

                listOfMethods!!.getElementsByTag("li").forEach {
                    val href = it.getElementsByTag("a")[0].attribute("href")!!

                    if (href.value.contains(namePart)) {
                        val ret =  "${Glob.MOZILLA_BASE_URL}${href.value}"
                        Glob.fetchCache(ret)

                        return ret
                    }
                }
            }

            throw IllegalStateException("Could not find documentation URL for '$interfaze/$nameRaw'!")
        }


        fun fetchMethodDocumentation(mozillaUrl: String, methodBuilder: Method.Builder) {
            with(Ksoup.parse(Glob.fetchCache(mozillaUrl))) {
                methodBuilder.documentation(
                    getElementById("content")!!
                        .getElementsByClass("section-content").first()!!
                        .getElementsByTag("p")
                        .text()) } }


        fun fetchParameterDocumentation(parameterName: String, parameterType: String, urls: Set<String>): String {
            urls
                .filter { it.contains(Glob.MOZILLA_BASE_URL) }
                .apply { isEmpty().echt { throws() } }
                .apply { if (this.size != 1) throws() }
                .forEach { url ->
                    assert(url.isNotBlank() && url.isNotEmpty())
                    assert(parameterName.isNotEmpty())
                    assert(parameterName.isNotBlank())

                    val doc = Ksoup.parse(Glob.fetchCache(url))
                    val dt = doc.getElementById(parameterName.lowercase())
                        ?: throws(
                            "parameterName" to parameterName,
                            "parameterType" to parameterType,
                            "url" to url
                        ) //throw NullPointerException("Parameter '$parameterName' with type '$parameterType' non-existent for '$url'!")

                    val dd = dt.nextElementSibling()!!

                    assert(dd.tagName() == "dd")

                    return dd.text()
                }

            throws() } }
}

fun Set<String>.supportedValues(edges: Pair<Char, Char>, separator: Char = ','): String {
    if (this.isEmpty()) return ""

    var ret = "${edges.first}"
    this.forEach {
        ret += "$it$separator"
    }

    return "${ret.removeSuffix(separator.toString())}${edges.second}".replace(" ", "")
}
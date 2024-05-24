package com.github.jdw.seaofshadows

import com.fleeksoft.ksoup.Ksoup
import com.fleeksoft.ksoup.nodes.Element
import fuel.HttpResponse
import fuel.httpGet
import kotlinx.coroutines.runBlocking
import org.jetbrains.kotlin.konan.properties.loadProperties
import kotlin.io.path.Path
import kotlin.io.path.createParentDirectories
import kotlin.io.path.exists
import kotlin.io.path.readText
import kotlin.io.path.writeText

object Glob {
    val GROUP: String by loadProperties("gradle.properties")
    val MOZILLA_BASE_URL: String by loadProperties("gradle.properties")
    val MOZILLA_API_BASE_URL: String by loadProperties("gradle.properties")
    val MOZILLA_WEBGL_CONSTANTS_URL: String by loadProperties("gradle.properties")
    val WEBGL1_VERSION: String by loadProperties("gradle.properties")
    val WEBGL2_VERSION: String by loadProperties("gradle.properties")
    val KHRONOS_WEBGL1_IDL = loadProperties("gradle.properties").getProperty("KHRONOS_WEBGL1_IDL").replace("{WEBGL1_VERSION}", WEBGL1_VERSION)
    val KHRONOS_WEBGL2_IDL = loadProperties("gradle.properties").getProperty("KHRONOS_WEBGL2_IDL").replace("{WEBGL2_VERSION}", WEBGL2_VERSION)

    var verbose = false

    fun debug(msg: String) {
        if (verbose) println(msg)
    }

    fun isValidKotlinIdentifier(name: String): Boolean {
        val keywords = listOf(
            "abstract", "as", "break", "by", "catch", "class", "continue", "const",
            "constructor", "crossinline", "data", "do", "else", "enum", "extends", "external",
            "false", "final", "finally", "for", "fun", "if", "implements", "import",
            "in", "infix", "inner", "interface", "internal", "is", "is!", "lateinit",
            "noinline", "null", "object", "out", "override", "package", "private", "protected",
            "public", "reified", "return", "rethrow", "sealed", "static", "sealed", "super",
            "suspend", "this", "throw", "true", "try", "typealias", "val", "var",
            "when", "while", "yield"
        )
        val regex = Regex("^[a-zA-Z_][a-zA-Z0-9_]*\$?".trim())  // Allowed characters and optional trailing $
        if (!regex.matches(name)) {
            return false
        }

        return !keywords.contains(name) // Check against reserved keywords (uppercase for case-insensitivity)
    }

    fun fetchCache(httpUrl: String): String {
        val cacheBasePath = "cache"

        val path =
            if (httpUrl.endsWith(".html") || httpUrl.endsWith(".idl")) Path("$cacheBasePath/${httpUrl.replace("https://", "").replace("http://","")}")
            else Path("$cacheBasePath/${httpUrl.replace("https://", "").replace("http://","")}.html")

        return if (!path.exists()) {
            path.createParentDirectories()
            var result: HttpResponse? = null
            runBlocking {
                debug("Fetching '$httpUrl'...")
                result = httpUrl.httpGet()
            }

            if (200 != result!!.statusCode) throw Exception("Status code '${result!!.statusCode}' for '$httpUrl'!")

            path.writeText(result!!.body)
            result!!.body
        }
        else {
            path.readText()
        }
    }
}
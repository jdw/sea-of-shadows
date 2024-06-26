package com.github.jdw.seaofshadows

import com.fleeksoft.ksoup.Ksoup
import com.fleeksoft.ksoup.nodes.Document
import com.github.jdw.seaofshadows.utils.echt
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
    val VERSION: String by loadProperties("gradle.properties")
    val MOZILLA_BASE_URL: String by loadProperties("gradle.properties")
    val MOZILLA_API_BASE_URL: String by loadProperties("gradle.properties")
    val MOZILLA_WEBGL_CONSTANTS_URL: String by loadProperties("gradle.properties")
    val WEBGL1_VERSION: String by loadProperties("gradle.properties")
    val WEBGL2_VERSION: String by loadProperties("gradle.properties")
    val KHRONOS_BASE_URL: String by loadProperties("gradle.properties")
    val KHRONOS_WEBGL1_IDL = loadProperties("gradle.properties").getProperty("KHRONOS_WEBGL1_IDL").replace("{WEBGL1_VERSION}", WEBGL1_VERSION)
    val KHRONOS_WEBGL2_IDL = loadProperties("gradle.properties").getProperty("KHRONOS_WEBGL2_IDL").replace("{WEBGL2_VERSION}", WEBGL2_VERSION)
    val CACHE_BASE_PATH: String by loadProperties("gradle.properties")
    val MOZILLA_CANVAS2D_BASE_URL: String by loadProperties("gradle.properties")
    val DEFAULT_PROTOBUFV3_PATH: String by loadProperties("gradle.properties")

    var verbose = false
    private val urlToDocuments: MutableMap<String, Document> = mutableMapOf()
    fun debug(msg: String) = verbose.echt { println(msg) }


    fun translateIDLPieceToKotlinPiece(idlName: String): String {
        val mapped = mapOf(
            "boolean" to "Boolean",
            "object" to "Any",
            "void" to "Unit",
            "any" to "Any",
            "sequence<DOMString>" to "List<DOMString>",
            "sequence<WebGLShader>" to "List<WebGLShader>",
            "sequence<GLfloat>" to "List<GLfloat>",
            "sequence<long>" to "List<Long>",
            "dictionary" to "class",
            "indx" to "index",
            "v" to "value",
            "values" to "value",
            "WebGLContextAttributes?" to "Map<String, Any>?")

        return mapped[idlName]
            ?: idlName
    }

    val keywordsToBeBracketedInKdoc = mutableSetOf("ArrayBuffer", "ArrayBufferView", "BufferDataSource", "DataView",
        "GLenum", "GLboolean", "GLbitfield", "GLbyte", "GLshort", "GLint", "GLsizei",
        "GLintptr", "GLsizeiptr", "GLubyte", "GLushort", "GLuint", "GLfloat", "GLclampf", "DOMString",
        "Event", "EventInit", "Float32Array", "HTMLCanvasElement", "Int32Array", "SequenceDomString", "SequenceWebGLShader",
        "SharedArrayBuffer", "TexImageSource", "TypedArray", "WebGLActiveInfo", "WebGLBuffer", "WebGLContextAttributes", "WebGLContextEvent",
        "WebGLContextEventInit", "WebGLFramebuffer", "WebGLObject", "WebGLProgram", "WebGLRenderbuffer", "WebGLRenderingContext",
        "WebGLRenderingContextBase", "WebGLShader", "WebGLShaderPrecisionFormat", "WebGLTexture", "WebGLUniformLocation", "createProgram")

    fun isValidKotlinIdentifier(name: String): Boolean { //TODO Move to General.kt
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


    fun fetchDocument(httpUrl: String): Document {
        assert(httpUrl.startsWith("https://"))

        if (urlToDocuments.containsKey(httpUrl)) return urlToDocuments[httpUrl]!!

        val ret = Ksoup.parse(fetchCache(httpUrl))
        urlToDocuments[httpUrl] = ret

        return ret
    }


    fun fetchCache(httpUrl: String): String {
        assert(httpUrl.startsWith("https://"))

        val path =
            if (httpUrl.endsWith(".html") || httpUrl.endsWith(".idl")) Path("$CACHE_BASE_PATH/${httpUrl.replace("https://", "").replace("http://","")}")
            else Path("$CACHE_BASE_PATH/${httpUrl.replace("https://", "").replace("http://","")}.html")

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


    fun error(message: String) = println("⁉\uFE0F  $message")


    fun error(message: String, filename: String, lineNumber: Int) = println("⁉\uFE0F  ($filename:$lineNumber): $message")
}
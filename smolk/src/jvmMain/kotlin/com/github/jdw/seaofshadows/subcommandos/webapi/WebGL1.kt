package com.github.jdw.seaofshadows.subcommandos.webapi

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.core.dom.Canvas
import com.github.jdw.seaofshadows.subcommandos.webapi.rowhandlers.ClassRowHandler
import com.github.jdw.seaofshadows.subcommandos.webapi.rowhandlers.InterfaceRowHandler
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Type
import com.github.jdw.seaofshadows.subcommandos.webapi.types.build
import com.github.jdw.seaofshadows.webgl.shared.ArrayBuffer
import com.github.jdw.seaofshadows.webgl.shared.ArrayBufferView
import com.github.jdw.seaofshadows.webgl.shared.BufferDataSource
import com.github.jdw.seaofshadows.webgl.shared.DOMString
import com.github.jdw.seaofshadows.webgl.shared.Event
import com.github.jdw.seaofshadows.webgl.shared.Float32Array
import com.github.jdw.seaofshadows.webgl.shared.GLbitfield
import com.github.jdw.seaofshadows.webgl.shared.GLboolean
import com.github.jdw.seaofshadows.webgl.shared.GLbyte
import com.github.jdw.seaofshadows.webgl.shared.GLclampf
import com.github.jdw.seaofshadows.webgl.shared.GLenum
import com.github.jdw.seaofshadows.webgl.shared.GLfloat
import com.github.jdw.seaofshadows.webgl.shared.GLint
import com.github.jdw.seaofshadows.webgl.shared.GLintptr
import com.github.jdw.seaofshadows.webgl.shared.GLshort
import com.github.jdw.seaofshadows.webgl.shared.GLsizei
import com.github.jdw.seaofshadows.webgl.shared.GLsizeiptr
import com.github.jdw.seaofshadows.webgl.shared.GLubyte
import com.github.jdw.seaofshadows.webgl.shared.GLuint
import com.github.jdw.seaofshadows.webgl.shared.GLushort
import com.github.jdw.seaofshadows.webgl.shared.Int32Array
import com.github.jdw.seaofshadows.webgl.shared.TexImageSource
import com.github.jdw.seaofshadows.webgl.shared.WebGLShader
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.File
import kotlin.reflect.full.createType


class WebGL1(val path: File) {
    private val irh = InterfaceRowHandler()
    private val crh = ClassRowHandler()

    private val packag3 = "${Glob.GROUP}.webgl.shared"
    private val codes = mutableMapOf<String, Code>()
    private val javascriptTypes = mutableMapOf(
        "boolean" to Boolean::class,
        "object" to Any::class,
        "void" to Nothing::class,
        "any" to Any::class,
        "TexImageSource" to TexImageSource::class)
    private val predefinedSupertypes = mapOf(
        "Event" to Event::class,
        "HTMLCanvasElement" to Canvas::class,
        "DOMString" to DOMString::class, //TODO Both here and in javascriptTypes?
        "BufferDataSource" to BufferDataSource::class)


    init {
        predefinedSupertypes.forEach {
            val name = it.key
            val ktype = it.value.createType()
            Type.NAME_TO_TYPE[name] = Type.ktypeToType(name, ktype)
        }

        javascriptTypes.forEach {
            val name = it.key
            val ktype = it.value.createType()
            Type.NAME_TO_TYPE[name] = Type.ktypeToType(name, ktype)
        }

        Type.NAME_TO_TYPE["ArrayBuffer"] = Type.ktypeToType("ArrayBuffer", ArrayBuffer::class.createType())
        Type.NAME_TO_TYPE["ArrayBufferView"] = Type.ktypeToType("ArrayBufferView", ArrayBufferView::class.createType())
        Type.NAME_TO_TYPE["Int32Array"] = Type.ktypeToType("Int32Array", Int32Array::class.createType())
        Type.NAME_TO_TYPE["Float32Array"] = Type.ktypeToType("Float32Array", Float32Array::class.createType())
    }


    fun run() {
        var rowCnt = 1
        val rows = Glob.fetchCache(Glob.KHRONOS_WEBGL1_IDL).split("\n")
        for (idx in rows.indices) {
            Glob.debug("${rowCnt++}: ${rows[idx]}")

            val rowTrimmed = rows[idx].trim()

            if ("" == rowTrimmed) continue

            if (irh.isActive() &&
                crh.isActive()) throw IllegalStateException("Can't build a class and an interface at the same time!")
            val pieces = rowTrimmed.split(" ")
            val firstPiece = pieces.first()

            if ("/*" == firstPiece && pieces.last() == "*/") continue

            if (irh.isActive()) {
                when (firstPiece) {
                    "{", // Only found after interface declaration the row above
                    "//", // Cancels out the whole row, ofc
                    "HTMLImageElement", // Only first at row 647
                    "HTMLCanvasElement", // Only first at row 648
                    "HTMLVideoElement)", // Only first at row 649
                    "typedef" -> noop()
                    "readonly" -> irh.handleReadOnly(rowTrimmed, predefinedSupertypes)
                    "};" -> handleEndOfInterface()
                    "const" -> irh.handleConst(rowTrimmed)
                    "GLenum", "GLsizei", "ArrayBufferView", "GLint", "WebGLBuffer?", "WebGLFramebuffer?",
                    "WebGLProgram?", "WebGLRenderbuffer?", "WebGLTexture?", "WebGLActiveInfo?", "sequence<WebGLShader>?",
                    "sequence<DOMString>?", "[WebGLHandlesContextLoss]", "any", "DOMString?", "WebGLUniformLocation?",
                    "void", "object?", "WebGLShader?", "WebGLShaderPrecisionFormat?", "Float32Array", "sequence<GLfloat>",
                    "GLboolean" -> {
                        if (irh.isHandlingMethod()) irh.handleOngoingMethod(rowTrimmed) // Multiline method definition
                        else irh.handleMethod(rowTrimmed) // First piece is a return type of a new method
                    }
                    else -> throw Exception("Unhandled first word '$firstPiece'!")
                }
            }
            else if (crh.isActive()) {
                when (firstPiece) {
                    "//" -> noop()
                    "};" -> handleEndOfClassScope()
                    else -> crh.handleClassProperty(rowTrimmed)
                }
            }
            else {
                when (firstPiece) {
                    "[Constructor(DOMString",
                    "WebGLRenderingContext", // Will be defined in webgl1-canvas
                    "typedef" -> noop()
                    "interface" -> irh.handleInterface(rowTrimmed, packag3, predefinedSupertypes)
                    "dictionary" -> crh.handleDictionary(rowTrimmed, packag3)
                    "//" -> noop()
                    else -> throw Exception("Unhandled first word '$firstPiece'!")
                }
            }
        }
    }


    fun handleEndOfClassScope() {
        val clazz = crh.currentClassBuilder!!.build()
        crh.currentClassBuilder = null

        val code = clazz.render()

        code.save(File("${path.path}/${clazz.simpleName}.kt"))
    }


    fun handleEndOfInterface() {
        val interfaze = irh.handleEndOfInterface()
        val type = interfaze.createType()
        val code = interfaze.render()
        code.save(File("${path.path}/${interfaze.simpleName}.kt"))

        Type.NAME_TO_TYPE[interfaze.simpleName!!] = type
    }


    fun save() {
        runBlocking {
            codes.entries.forEach {
                val code = it.value
                val filename = it.key

                launch {
                    Glob.debug("Saving $filename...")
                    code.save(File("${path.path}/${filename}"))
                }
            }
        }
    }


    private fun noop() {}
}
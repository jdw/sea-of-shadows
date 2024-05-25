package com.github.jdw.seaofshadows.subcommandos.webapi

import java.io.File

class Code() {
    private val lines = ArrayList<String>()
    private var dents = ""
    private var changesSinceLastSave = true

    fun add(lineRaw: String) {
        val line = if (isOngoingKdoc(lineRaw)) replaceBracketsToKeywords(lineRaw) else lineRaw
        lines.add("$dents$line\n")
        changesSinceLastSave = true
    }

    fun add(line: String, yes: Boolean) {
        if (yes) add(line)
    }


    fun indent() {
        dents += "\t"
    }

    fun undent() {
        dents = dents.substring(0, dents.length - 1)
    }

    fun undentAll() {
        dents = ""
    }

    override fun toString(): String {
        return lines.joinToString(separator = "")
    }

    fun save(file: File) {
        if (changesSinceLastSave) {
            file.writeText(toString())
            changesSinceLastSave = false
        }

    }


    private fun isOngoingKdoc(lineRaw: String) = lineRaw.startsWith(" *")


    private fun replaceBracketsToKeywords(lineRaw: String): String {
        var ret = lineRaw

        setOf("ArrayBuffer", "ArrayBufferView", "BufferDataSource", "DataView",
            "GLenum", "GLboolean", "GLbitfield", "GLbyte", "GLshort", "GLint", "GLsizei",
            "GLintptr", "GLsizeiptr", "GLubyte", "GLushort", "GLuint", "GLfloat", "GLclampf", "DOMString",
            "Event", "EventInit", "Float32Array", "HTMLCanvasElement", "Int32Array", "SequenceDomString", "SequenceWebGLShader",
            "SharedArrayBuffer", "TexImageSource", "TypedArray", "WebGLActiveInfo", "WebGLBuffer", "WebGLContextAttributes", "WebGLContextEvent",
            "WebGLContextEventInit", "WebGLFramebuffer", "WebGLObject", "WebGLProgram", "WebGLRenderbuffer", "WebGLRenderingContext",
            "WebGLRenderingContextBase", "WebGLShader", "WebGLShaderPrecisionFormat", "WebGLTexture", "WebGLUniformLocation")
            .forEach { ret = ret.replace(it, "[$it]") }

        return ret
    }
}
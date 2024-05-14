package com.github.jdw.seaofshadows.shared.webgl

import kotlin.js.JsName

// https://registry.khronos.org/webgl/specs/latest/1.0/#5.1
typealias GLenum = ULong
typealias GLboolean = Boolean
typealias GLbitfield = ULong
typealias GLbyte = Byte
typealias GLshort = Short
typealias GLint = Long
typealias GLsizei = Long
typealias GLintptr = Long
typealias GLsizeiptr = Long
typealias GLubyte = UByte
typealias GLushort = UShort
typealias GLuint = ULong
typealias GLfloat = Double
typealias GLclampf = Double
typealias GLint64 = Long

// The power preference settings are documented in the WebGLContextAttributes
// section of the specification.
enum class WebGLPowerPreference(val jsName: String) {
    DEFAULT("default"),
    LOW_POWER("low-power"),
    HIGH_PERFORMANCE("high-performance")
}

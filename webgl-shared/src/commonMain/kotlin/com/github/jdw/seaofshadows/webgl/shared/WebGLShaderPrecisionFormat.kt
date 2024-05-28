package com.github.jdw.seaofshadows.webgl.shared


/**
 *  The [WebGLShaderPrecisionFormat] interface is part of the *WebGL API* and
 * represents the information returned by calling the
 * [WebGLRenderingContext].getShaderPrecisionFormat`][WebGLRenderingContext.getShaderPrecisionFormat]
 * method.
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLShaderPrecisionFormat)
 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.12)
 * * [WebGL API](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/WebGL_API)
 * * [WebGLRenderingContext.getShaderPrecisionFormat](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/WebGLRenderingContext/getShaderPrecisionFormat)
 */
interface WebGLShaderPrecisionFormat {
	val rangeMin: GLint
	val rangeMax: GLint
	val precision: GLint
	
}

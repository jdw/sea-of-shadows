package com.github.jdw.seaofshadows.webgl.shared


/**
 *  The [WebGLActiveInfo] interface is part of the *WebGL API* and represents the
 * information returned by calling the [WebGLRenderingContext].[getActiveAttrib]
 * and [WebGLRenderingContext].[getActiveUniform] methods.
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLActiveInfo)
 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.11)
 * * [WebGL API](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/WebGL_API)
 * * [WebGLRenderingContext].getActiveAttrib](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/WebGLRenderingContext/getActiveAttrib)
 * * [WebGLRenderingContext].getActiveUniform](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/WebGLRenderingContext/getActiveUniform)
 */
interface WebGLActiveInfo {
	val size: GLint
	val type: GLenum
	val name: DOMString
	
}

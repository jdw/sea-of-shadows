package com.github.jdw.seaofshadows.shared.webgl.interfaces

/**
 * The <strong>WebGLActiveInfo</strong> interface is part of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> and represents the information returned by calling the <a href="/en-US/docs/Web/API/WebGLRenderingContext/getActiveAttrib"><code>WebGLRenderingContext.getActiveAttrib()</code></a> and <a href="/en-US/docs/Web/API/WebGLRenderingContext/getActiveUniform"><code>WebGLRenderingContext.getActiveUniform()</code></a> methods.
 *
 * See more: https://developer.mozilla.org/en-US/docs/Web/API/WebGLActiveInfo
 */
interface WebGLActiveInfo {
	val name: String
	val type: String
	val size: Double
}

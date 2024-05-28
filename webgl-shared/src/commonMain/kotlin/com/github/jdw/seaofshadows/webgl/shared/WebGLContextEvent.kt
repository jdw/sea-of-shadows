package com.github.jdw.seaofshadows.webgl.shared


/**
 *  The WebContextEvent interface is part of the *WebGL API* and is an interface
 * for an event that is generated in response to a status change to the WebGL
 * rendering context.
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLContextEvent)
 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.15)
 * * [WebGL API](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/WebGL_API)
 */
interface WebGLContextEvent: Event {
	val statusMessage: DOMString
	
}

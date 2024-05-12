package com.github.jdw.seaofshadows.shared.webgl.interfaces

/**
 * The WebGLShader is part of the WebGL API and can either be a vertex or a fragment shader. A WebGLProgram requires both types of shaders.
 *
 * To create a WebGLShader use [WebGLRenderingContext.createShader], then hook up the GLSL source code using [WebGLRenderingContext.shaderSource], and finally invoke [WebGLRenderingContext.compileShader] to finish and compile the shader. At this point the WebGLShader is still not in a usable form and must still be attached to a [WebGLProgram].
 */
interface WebGLShader: WebGLObject
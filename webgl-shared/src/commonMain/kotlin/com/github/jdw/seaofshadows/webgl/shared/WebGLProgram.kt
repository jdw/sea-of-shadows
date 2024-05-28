package com.github.jdw.seaofshadows.webgl.shared


/**
 *  The [WebGLProgram] is part of the *WebGL API* and is a combination of two
 * compiled [WebGLShader] consisting of a vertex shader and a fragment shader (both
 * written in GLSL).
 * 
 *  To create a [WebGLProgram], call the GL context's
 * [`createProgram`][createProgram] function. After attaching the shader programs
 * using [attachShader], you link them into a usable program. This is shown in the
 * code below.
 * 
 *  See [WebGLShader] for information on creating the `vertexShader` and
 * `fragmentShader` in the above example.
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLProgram)
 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.6)
 * * [WebGL API](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/WebGL_API)
 * * [WebGLShader](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/WebGLShader)
 * * [createProgram](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/WebGLRenderingContext/createProgram)
 * * [attachShader](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/WebGLRenderingContext/attachShader)
 */
interface WebGLProgram: WebGLObject

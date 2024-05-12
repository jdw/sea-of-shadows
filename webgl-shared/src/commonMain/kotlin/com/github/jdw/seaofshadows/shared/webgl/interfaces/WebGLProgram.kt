package com.github.jdw.seaofshadows.shared.webgl.interfaces

/**
 * The WebGLProgram is part of the WebGL API and is a combination of two compiled WebGLShaders consisting of a vertex shader and a fragment shader (both written in GLSL).
 *
 * To create a WebGLProgram, call the GL context's [createProgram] function. After attaching the shader programs using [attachShader], you link them into a usable program. This is shown in the code below.
 *
 * See more: https://developer.mozilla.org/en-US/docs/Web/API/WebGLProgram
 */
interface WebGLProgram: WebGLObject

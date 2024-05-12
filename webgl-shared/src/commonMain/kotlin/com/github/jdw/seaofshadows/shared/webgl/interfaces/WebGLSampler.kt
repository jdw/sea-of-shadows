package com.github.jdw.seaofshadows.shared.webgl.interfaces

/**
 * The WebGLSampler interface is part of the WebGL 2 API and stores sampling parameters for WebGLTexture access inside of a shader.
 *
 * When working with WebGLSampler objects, the following methods of the WebGL2RenderingContext are useful:
 * * [WebGL2RenderingContext.createSampler]
 * * [WebGL2RenderingContext.deleteSampler]
 * * [WebGL2RenderingContext.isSampler]
 * * [WebGL2RenderingContext.bindSampler]
 * * [WebGL2RenderingContext.getSamplerParameter]
 *
 * See more: https://developer.mozilla.org/en-US/docs/Web/API/WebGLSampler
 */
interface WebGLSampler: WebGLObject
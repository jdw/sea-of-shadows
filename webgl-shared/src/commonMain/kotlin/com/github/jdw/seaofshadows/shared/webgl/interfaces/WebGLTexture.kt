package com.github.jdw.seaofshadows.shared.webgl.interfaces

/**
 * The WebGLTexture interface is part of the WebGL API and represents an opaque texture object providing storage and state for texturing operations.
 *
 * The WebGLTexture object does not define any methods or properties of its own and its content is not directly accessible. When working with WebGLTexture objects, the following methods of the WebGLRenderingContext are useful:
 * * [WebGLRenderingContext.bindTexture]
 * * [WebGLRenderingContext.createTexture]
 * * [WebGLRenderingContext.deleteTexture]
 * * [WebGLRenderingContext.isTexture]
 *
 * See more: https://developer.mozilla.org/en-US/docs/Web/API/WebGLTexture
 */
interface WebGLTexture: WebGLObject
package com.github.jdw.seaofshadows.shared.webgl.interfaces

/**
 * The WebGLRenderbuffer interface is part of the WebGL API and represents a buffer that can contain an image, or that can be a source or target of a rendering operation.
 *
 * The WebGLRenderbuffer object does not define any methods or properties of its own and its content is not directly accessible. When working with WebGLRenderbuffer objects, the following methods of the [WebGLRenderingContext] are useful:
 * * [WebGLRenderingContext.bindRenderbuffer]
 * * [WebGLRenderingContext.createRenderbuffer]
 * * [WebGLRenderingContext.deleteRenderbuffer]
 * * [WebGLRenderingContext.framebufferRenderbuffer]
 * * [WebGLRenderingContext.getRenderbufferParameter]
 * * [WebGLRenderingContext.isRenderbuffer]
 * * [WebGLRenderingContext.renderbufferStorage]
 *
 * See more: https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderbuffer
 */
interface WebGLRenderbuffer: WebGLObject

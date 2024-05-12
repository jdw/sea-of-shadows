package com.github.jdw.seaofshadows.shared.webgl.interfaces

/**
 * The WebGLFramebuffer interface is part of the WebGL API and represents a collection of buffers that serve as a rendering destination.
 *
 * The WebGLFramebuffer object does not define any methods or properties of its own and its content is not directly accessible. When working with WebGLFramebuffer objects, the following methods of the [WebGLRenderingContext] are useful:
 * * [WebGLRenderingContext.bindFramebuffer]
 * * [WebGLRenderingContext.createFramebuffer]
 * * [WebGLRenderingContext.deleteFramebuffer]
 * * [WebGLRenderingContext.isFramebuffer]
 * * [WebGLRenderingContext.framebufferRenderbuffer]
 * * [WebGLRenderingContext.framebufferTexture2D]
 *
 * See more: https://developer.mozilla.org/en-US/docs/Web/API/WebGLFramebuffer
 */
interface WebGLFramebuffer: WebGLObject

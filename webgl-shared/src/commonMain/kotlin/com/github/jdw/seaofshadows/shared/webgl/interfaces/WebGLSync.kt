package com.github.jdw.seaofshadows.shared.webgl.interfaces

/**
 * The WebGLSync interface is part of the WebGL 2 API and is used to synchronize activities between the GPU and the application.
 *
 * When working with WebGLSync objects, the following methods of the [WebGL2RenderingContext] are useful:
 * * [WebGL2RenderingContext.fenceSync]
 * * [WebGL2RenderingContext.deleteSync]
 * * [WebGL2RenderingContext.isSync]
 * * [WebGL2RenderingContext.clientWaitSync]
 * * [WebGL2RenderingContext.waitSync]
 * * [WebGL2RenderingContext.getSyncParameter]
 *
 * See more: https://developer.mozilla.org/en-US/docs/Web/API/WebGLSync
 */
interface WebGLSync: WebGLObject
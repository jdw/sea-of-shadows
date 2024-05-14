package com.github.jdw.seaofshadows.shared.webgl.interfaces

import com.github.jdw.seaofshadows.shared.webgl.GLbitfield
import com.github.jdw.seaofshadows.shared.webgl.GLboolean
import com.github.jdw.seaofshadows.shared.webgl.GLenum
import com.github.jdw.seaofshadows.shared.webgl.GLfloat
import com.github.jdw.seaofshadows.shared.webgl.GLint
import com.github.jdw.seaofshadows.shared.webgl.GLint64
import com.github.jdw.seaofshadows.shared.webgl.GLintptr
import com.github.jdw.seaofshadows.shared.webgl.GLsizei
import com.github.jdw.seaofshadows.shared.webgl.GLsizeiptr
import com.github.jdw.seaofshadows.shared.webgl.GLuint

interface WebGL2RenderingContext {
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.beginQuery()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> starts an asynchronous query. The <code>target</code> parameter indicates which kind of query to begin.</p>
	 *
	 * @param query A <a href="/en-US/docs/Web/API/WebGLQuery"><code>WebGLQuery</code></a> object for which to start the querying.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target of the query. Possible values:
Specifies an occlusion query: these queries detect whether an object is visible (whether the scoped drawing commands pass the depth test and if so, how many samples pass).
Same as above, but less accurate and faster version.
Number of primitives that are written to transform feedback buffers.
	 */
	fun beginQuery(query: WebGLQuery, target: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.beginTransformFeedback()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> starts a transform feedback operation.</p>
	 *
	 * @param primitivemode A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the output type of the primitives that will be recorded into the buffer objects that are bound for transform feedback. Possible values:
	 */
	fun beginTransformFeedback(primitivemode: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.bindBufferBase()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> binds a given <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a> to a given binding point (<code>target</code>) at a given <code>index</code>.</p>
	 *
	 * @param buffer A <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a> which to bind to the binding point (<code>target</code>).
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the <code>target</code>.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target for the bind operation. Possible values:
	 */
	fun bindBufferBase(buffer: WebGLBuffer, index: GLuint, target: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.bindBufferRange()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> binds a range of a given <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a> to a given binding point (<code>target</code>) at a given <code>index</code>.</p>
	 *
	 * @param buffer A <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a> which to bind to the binding point (<code>target</code>).
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the <code>target</code>.
	 * @param offset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying the starting offset.
	 * @param size A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizeiptr"><code>GLsizeiptr</code></a> specifying the amount of data that can be read from the buffer.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target for the bind operation. Possible values:
	 */
	fun bindBufferRange(buffer: WebGLBuffer, index: GLuint, offset: GLintptr, size: GLsizeiptr, target: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.bindSampler()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> binds a passed <a href="/en-US/docs/Web/API/WebGLSampler"><code>WebGLSampler</code></a> object to the texture unit at the passed index.</p>
	 *
	 * @param sampler A <a href="/en-US/docs/Web/API/WebGLSampler"><code>WebGLSampler</code></a> object to bind.
	 * @param unit A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the texture unit to which to bind the sampler to.
	 */
	fun bindSampler(sampler: WebGLSampler, unit: GLuint): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.bindTransformFeedback()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> binds a passed <a href="/en-US/docs/Web/API/WebGLTransformFeedback"><code>WebGLTransformFeedback</code></a> object to the current GL state.</p>
	 *
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target (binding point). Must be <code>gl.TRANSFORM_FEEDBACK</code>.
	 * @param transformfeedback A <a href="/en-US/docs/Web/API/WebGLTransformFeedback"><code>WebGLTransformFeedback</code></a> object to bind.
	 */
	fun bindTransformFeedback(target: GLenum, transformfeedback: WebGLTransformFeedback): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.bindVertexArray()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> binds a passed <a href="/en-US/docs/Web/API/WebGLVertexArrayObject"><code>WebGLVertexArrayObject</code></a> object to the buffer.</p>
	 *
	 * @param vertexarray A <a href="/en-US/docs/Web/API/WebGLVertexArrayObject"><code>WebGLVertexArrayObject</code></a> (VAO) object to bind.
	 */
	fun bindVertexArray(vertexarray: WebGLVertexArrayObject): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.blitFramebuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> transfers a block of pixels from the read framebuffer to the draw framebuffer. Read and draw framebuffers are bound using <a href="/en-US/docs/Web/API/WebGLRenderingContext/bindFramebuffer"><code>WebGLRenderingContext.bindFramebuffer()</code></a>.</p>
	 *
	 * @param dstx0_dsty0_dstx1_dsty1 A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the bounds of the destination rectangle.
	 * @param filter A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the interpolation to be applied if the image is stretched. Possible values:
	 * @param mask A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLbitfield"><code>GLbitfield</code></a> specifying a bitwise OR mask indicating which buffers are to be copied. Possible values:
	 * @param srcx0_srcy0_srcx1_srcy1 A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the bounds of the source rectangle.
	 */
	fun blitFramebuffer(dstx0_dsty0_dstx1_dsty1: GLint, filter: GLenum, mask: GLbitfield, srcx0_srcy0_srcx1_srcy1: GLint): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.bufferData()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> creates and initializes the buffer object's data store.</p>
	 *
	 * @param length A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> defaulting to 0. Only allowed if <code>srcOffset</code> is given.
	 * @param size A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizeiptr"><code>GLsizeiptr</code></a> setting the size in bytes of the buffer object's data store. One of <code>size</code> and <code>srcData</code> must be provided.
	 * @param srcdata An <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer"><code>ArrayBuffer</code></a>, <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer"><code>SharedArrayBuffer</code></a>, a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a> that will be copied into the data store. If <code>null</code>, a data store is still created, but the content is uninitialized and undefined. One of <code>size</code> and <code>srcData</code> must be provided.
	 * @param srcoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the element index offset where to start reading the buffer. Only allowed if <code>srcData</code> is provided.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data.
Buffer used for element indices.
Buffer for copying from one buffer object to another.
Buffer for copying from one buffer object to another.
Buffer for transform feedback operations.
Buffer used for storing uniform blocks.
Buffer used for pixel transfer operations.
Buffer used for pixel transfer operations.
	 * @param usage A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the intended usage pattern of the data store for optimization purposes. Possible values:
The contents are intended to be specified once by the application, and used many times as the source for WebGL drawing and image specification commands.
The contents are intended to be respecified repeatedly by the application, and used many times as the source for WebGL drawing and image specification commands.
The contents are intended to be specified once by the application, and used at most a few times as the source for WebGL drawing and image specification commands.
The contents are intended to be specified once by reading data from WebGL, and queried many times by the application.
The contents are intended to be respecified repeatedly by reading data from WebGL, and queried many times by the application.
The contents are intended to be specified once by reading data from WebGL, and queried at most a few times by the application
The contents are intended to be specified once by reading data from WebGL, and used many times as the source for WebGL drawing and image specification commands.
The contents are intended to be respecified repeatedly by reading data from WebGL, and used many times as the source for WebGL drawing and image specification commands.
The contents are intended to be specified once by reading data from WebGL, and used at most a few times as the source for WebGL drawing and image specification commands.
	 */
	fun bufferData(length: GLuint, size: GLsizeiptr, srcdata: ArrayBuffer, srcoffset: GLuint, target: GLenum, usage: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.bufferSubData()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> updates a subset of a buffer object's data store.</p>
	 *
	 * @param dstbyteoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying an offset in bytes where the data replacement will start.
	 * @param length A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> defaulting to 0, where 0 means <code>bufferSubData</code> should calculate the length.
	 * @param srcdata An <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer"><code>ArrayBuffer</code></a>, <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer"><code>SharedArrayBuffer</code></a>, a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a>, or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> that will be copied into the data store.
	 * @param srcoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the element index offset where to start reading the buffer.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data.
Buffer used for element indices.
Buffer for copying from one buffer object to another.
Buffer for copying from one buffer object to another.
Buffer for transform feedback operations.
Buffer used for storing uniform blocks.
Buffer used for pixel transfer operations.
Buffer used for pixel transfer operations.
	 */
	fun bufferSubData(dstbyteoffset: GLintptr, length: GLuint, srcdata: ArrayBuffer, srcoffset: GLuint, target: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.clearBuffer[fiuv]()</code></strong> methods of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> clear buffers from the currently bound framebuffer.</p>
	 *
	 * @param buffer A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the buffer to clear. Possible values are:
	 * @param depth A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> specifying the value to clear a depth render buffer to.
	 * @param drawbuffer A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the draw buffer to clear.
	 * @param stencil A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the value to clear the stencil render buffer to.
	 * @param values An <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a>, <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> or <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> values or an <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array"><code>Int32Array</code></a>, <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint32Array"><code>Uint32Array</code></a> or <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> specifying the values to clear to.
	 */
	fun clearBuffer(buffer: GLenum, depth: GLfloat, drawbuffer: GLint, stencil: GLint, values: GLint): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.clientWaitSync()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> blocks and waits for a <a href="/en-US/docs/Web/API/WebGLSync"><code>WebGLSync</code></a> object to become signaled or a given timeout to be passed.</p>
	 *
	 * @param flags A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLbitfield"><code>GLbitfield</code></a> specifying a bitwise combination of flags controlling the flushing behavior. May be <code>gl.SYNC_FLUSH_COMMANDS_BIT</code>.
	 * @param sync A <a href="/en-US/docs/Web/API/WebGLSync"><code>WebGLSync</code></a> object on which to wait on.
	 * @param timeout A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint64"><code>GLint64</code></a> specifying a timeout (in nanoseconds) for which to wait for the sync object to become signaled. Must not be larger than <code>gl.MAX_CLIENT_WAIT_TIMEOUT_WEBGL</code>.
	 */
	fun clientWaitSync(flags: GLbitfield, sync: WebGLSync, timeout: GLint64): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.compressedTexSubImage3D()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies a three-dimensional sub-rectangle for a texture image in a compressed format.</p>
	 *
	 * @param depth A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the depth of the texture.
	 * @param format A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the compressed image format. Possible values:
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the texture.
	 * @param imagesize A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the number of bytes to read from the buffer bound to <code>gl.PIXEL_UNPACK_BUFFER</code>.
	 * @param level A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.
	 * @param offset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the offset in bytes from which to read from the buffer bound to <code>gl.PIXEL_UNPACK_BUFFER</code>.
	 * @param srcdata A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a> object that will be used as a data store for the compressed image data in memory.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the texture.
	 * @param xoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the x offset within the compressed texture image.
	 * @param yoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the y offset within the compressed texture image.
	 * @param zoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the z offset within the compressed texture image.
	 */
	fun compressedTexSubImage3D(depth: GLsizei, format: GLenum, height: GLsizei, imagesize: GLint, level: GLint, offset: GLint, srcdata: TypedArray, target: GLenum, width: GLsizei, xoffset: GLint, yoffset: GLint, zoffset: GLint): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.copyBufferSubData()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> copies part of the data of a buffer to another buffer.</p>
	 *
	 * @param readoffset_writeoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying the byte offset from which to start reading from or writing to the buffer.
	 * @param readtarget_writetarget A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) from whose data store should be read or written. Possible values:
	 * @param size A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> in bytes specifying the size of the data to be copied from <code>readTarget</code> to <code>writeTarget</code>.
	 */
	fun copyBufferSubData(readoffset_writeoffset: GLintptr, readtarget_writetarget: GLenum, size: GLsizei): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.copyTexSubImage3D()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> copies pixels from the current <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> into an existing 3D texture sub-image.</p>
	 *
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the texture.
	 * @param level A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the texture.
	 * @param x A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the x coordinate of the lower left corner where to start copying.
	 * @param xoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the x offset within the texture image.
	 * @param y A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the y coordinate of the lower left corner where to start copying.
	 * @param yoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the y offset within the texture image.
	 * @param zoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the z offset within the texture image.
	 */
	fun copyTexSubImage3D(height: GLsizei, level: GLint, target: GLenum, width: GLsizei, x: GLint, xoffset: GLint, y: GLint, yoffset: GLint, zoffset: GLint): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.createQuery()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> creates and initializes <a href="/en-US/docs/Web/API/WebGLQuery"><code>WebGLQuery</code></a> objects, which provide ways to asynchronously query for information.</p>
	 *
	 */
	fun createQuery(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.createSampler()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> creates and initializes <a href="/en-US/docs/Web/API/WebGLSampler"><code>WebGLSampler</code></a> objects.</p>
	 *
	 */
	fun createSampler(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.createTransformFeedback()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> creates and initializes <a href="/en-US/docs/Web/API/WebGLTransformFeedback"><code>WebGLTransformFeedback</code></a> objects.</p>
	 *
	 */
	fun createTransformFeedback(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.createVertexArray()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> creates and initializes a <a href="/en-US/docs/Web/API/WebGLVertexArrayObject"><code>WebGLVertexArrayObject</code></a> object that represents a vertex array object (VAO) pointing to vertex array data and which provides names for different sets of vertex data.</p>
	 *
	 */
	fun createVertexArray(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.deleteQuery()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> deletes a given <a href="/en-US/docs/Web/API/WebGLQuery"><code>WebGLQuery</code></a> object.</p>
	 *
	 * @param query A <a href="/en-US/docs/Web/API/WebGLQuery"><code>WebGLQuery</code></a> object to delete.
	 */
	fun deleteQuery(query: WebGLQuery): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.deleteSampler()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> deletes a given <a href="/en-US/docs/Web/API/WebGLSampler"><code>WebGLSampler</code></a> object.</p>
	 *
	 * @param sampler A <a href="/en-US/docs/Web/API/WebGLSampler"><code>WebGLSampler</code></a> object to delete.
	 */
	fun deleteSampler(sampler: WebGLSampler): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.deleteSync()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> deletes a given <a href="/en-US/docs/Web/API/WebGLSync"><code>WebGLSync</code></a> object.</p>
	 *
	 * @param sync A <a href="/en-US/docs/Web/API/WebGLSync"><code>WebGLSync</code></a> object to delete.
	 */
	fun deleteSync(sync: WebGLSync): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.deleteTransformFeedback()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> deletes a given <a href="/en-US/docs/Web/API/WebGLTransformFeedback"><code>WebGLTransformFeedback</code></a> object.</p>
	 *
	 * @param transformfeedback A <a href="/en-US/docs/Web/API/WebGLTransformFeedback"><code>WebGLTransformFeedback</code></a> object to delete.
	 */
	fun deleteTransformFeedback(transformfeedback: WebGLTransformFeedback): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.deleteVertexArray()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> deletes a given <a href="/en-US/docs/Web/API/WebGLVertexArrayObject"><code>WebGLVertexArrayObject</code></a> object.</p>
	 *
	 * @param vertexarray A <a href="/en-US/docs/Web/API/WebGLVertexArrayObject"><code>WebGLVertexArrayObject</code></a> (VAO) object to delete.
	 */
	fun deleteVertexArray(vertexarray: WebGLVertexArrayObject): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.drawArraysInstanced()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> renders primitives from array data like the <a href="/en-US/docs/Web/API/WebGLRenderingContext/drawArrays" title="gl.drawArrays()"><code>gl.drawArrays()</code></a> method. In addition, it can execute multiple instances of the range of elements.</p>
<div class="notecard note" id="sect1">
 <p><strong>Note:</strong> When using <a href="/en-US/docs/Web/API/WebGLRenderingContext" title="WebGL 1">WebGL 1</a>, the <a href="/en-US/docs/Web/API/ANGLE_instanced_arrays"><code>ANGLE_instanced_arrays</code></a> extension can provide this method, too.</p>
</div>
	 *
	 * @param count A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the number of indices to be rendered.
	 * @param first A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the starting index in the array of vector points.
	 * @param instancecount A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the number of instances of the range of elements to execute.
	 * @param mode A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the type primitive to render. Possible values are:
	 */
	fun drawArraysInstanced(count: GLsizei, first: GLint, instancecount: GLsizei, mode: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.drawBuffers()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> defines draw buffers to which fragment colors are written into. The draw buffer settings are part of the state of the currently bound framebuffer or the drawingbuffer if no framebuffer is bound.</p>
	 *
	 * @param buffers An <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the buffers into which fragment colors will be written. Possible values are:
Fragment shader output is not written into any color buffer.
Fragment shader output is written into the back color buffer.
Fragment shader output is written in the nth color attachment of the current framebuffer.
	 */
	fun drawBuffers(buffers: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.drawElementsInstanced()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> renders primitives from array data like the <a href="/en-US/docs/Web/API/WebGLRenderingContext/drawElements" title="gl.drawElements()"><code>gl.drawElements()</code></a> method. In addition, it can execute multiple instances of a set of elements.</p>
<div class="notecard note" id="sect1">
 <p><strong>Note:</strong> When using <a href="/en-US/docs/Web/API/WebGLRenderingContext" title="WebGL 1">WebGL 1</a>, the <a href="/en-US/docs/Web/API/ANGLE_instanced_arrays"><code>ANGLE_instanced_arrays</code></a> extension can provide this method, too.</p>
</div>
	 *
	 * @param count A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the number of elements to be rendered.
	 * @param instancecount A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the number of instances of the set of elements to execute.
	 * @param mode A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the type primitive to render. Possible values are:
	 * @param offset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying an offset in the element array buffer. Must be a valid multiple of the size of the given <code>type</code>.
	 * @param type A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the type of the values in the element array buffer. Possible values are:
	 */
	fun drawElementsInstanced(count: GLsizei, instancecount: GLsizei, mode: GLenum, offset: GLintptr, type: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.drawRangeElements()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> renders primitives from array data in a given range.</p>
	 *
	 * @param count A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the number of elements to be rendered.
	 * @param end A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the maximum array index contained in <code>offset</code>.
	 * @param mode A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the type primitive to render. Possible values are:
	 * @param offset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying an offset in the element array buffer. Must be a valid multiple of the size of the given <code>type</code>.
	 * @param start A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the minimum array index contained in <code>offset</code>.
	 * @param type A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the type of the values in the element array buffer. Possible values are:
	 */
	fun drawRangeElements(count: GLsizei, end: GLuint, mode: GLenum, offset: GLintptr, start: GLuint, type: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.endQuery()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> marks the end of a given query target.</p>
	 *
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target of the query. Possible values:
Specifies an occlusion query: these queries detect whether an object is visible (whether the scoped drawing commands pass the depth test and if so, how many samples pass).
Same as above, but less accurate and faster version.
Number of primitives that are written to transform feedback buffers.
	 */
	fun endQuery(target: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.endTransformFeedback()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> ends a transform feedback operation.</p>
	 *
	 */
	fun endTransformFeedback(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.fenceSync()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> creates a new <a href="/en-US/docs/Web/API/WebGLSync"><code>WebGLSync</code></a> object and inserts it into the GL command stream.</p>
	 *
	 * @param condition A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the condition that must be met to set the sync object's state to signaled. Must be <code>gl.SYNC_GPU_COMMANDS_COMPLETE</code>.
	 * @param flags A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLbitfield"><code>GLbitfield</code></a> specifying a bitwise combination of flags controlling the behavior of the sync object. Must be <code>0</code> (exists for extensions only).
	 */
	fun fenceSync(condition: GLenum, flags: GLbitfield): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.framebufferTextureLayer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> attaches a single layer of a texture to a framebuffer.</p>
<p>This method is similar to <a href="/en-US/docs/Web/API/WebGLRenderingContext/framebufferTexture2D"><code>WebGLRenderingContext.framebufferTexture2D()</code></a>, but only a given single layer of the texture level is attached to the attachment point.</p>
	 *
	 * @param attachment A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the attachment point for the <code>texture</code>. Possible values:
	 * @param layer A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the layer of the texture image to attach.
	 * @param level A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the mipmap level of the texture image to attach.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
	 * @param texture A <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> object whose image to attach.
	 */
	fun framebufferTextureLayer(attachment: GLenum, layer: GLint, level: GLint, target: GLenum, texture: WebGLTexture): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getActiveUniformBlockName()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> retrieves the name of the active uniform block at a given index within a <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.</p>
	 *
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> containing the uniform block.
	 * @param uniformblockindex A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the uniform block to whose name to retrieve.
	 */
	fun getActiveUniformBlockName(program: WebGLProgram, uniformblockindex: GLuint): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getActiveUniformBlockParameter()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> retrieves information about an active uniform block within a <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.</p>
	 *
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which information to query. Possible values:
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> indicating the uniform buffer binding point.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> indicating the minimum total buffer object size.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> indicating the number of active uniforms in the uniform block.
Returns a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint32Array"><code>Uint32Array</code></a> indicating the list of active uniforms in the uniform block.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether the uniform block is referenced by the vertex shader.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether the uniform block is referenced by the fragment shader.
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> containing the active uniform block.
	 * @param uniformblockindex A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the active uniform block within the program.
	 */
	fun getActiveUniformBlockParameter(pname: GLenum, program: WebGLProgram, uniformblockindex: GLuint): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getActiveUniforms()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> retrieves information about active uniforms within a <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.</p>
	 *
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which information to query. Possible values:
Returns an <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> indicating the <a href="/en-US/docs/Web/API/WebGLRenderingContext/getUniform#return_value">types of the uniforms</a>.
Returns an <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> indicating the sizes of the uniforms.
Returns an <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the block indices of the uniforms.
Returns an <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the uniform buffer offsets.
Returns an <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the strides between the elements.
Returns an <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the strides between columns of a column-major matrix or a row-major matrix.
Returns an <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether each of the uniforms is a row-major matrix or not.
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> containing the active uniforms.
	 * @param uniformindices An <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the indices of the active uniforms to query.
	 */
	fun getActiveUniforms(pname: GLenum, program: WebGLProgram, uniformindices: GLuint): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getBufferSubData()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> reads data from a buffer binding point and writes them to an <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer"><code>ArrayBuffer</code></a> or <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer"><code>SharedArrayBuffer</code></a>.</p>
	 *
	 * @param dstdata A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a> object to copy the data to. If <code>dstData</code> is a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a> then <code>dstOffset</code> and <code>length</code> are interpreted in bytes, otherwise <code>dstData</code>'s element type is used.
	 * @param dstoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the element index offset to start writing in <code>dstData</code>.
	 * @param length A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the number of elements to copy. If this is 0 or not specified, <code>getBufferSubData</code> will copy until the end of <code>dstData</code>.
	 * @param srcbyteoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying the byte offset from which to start reading from the buffer.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data.
Buffer used for element indices.
Buffer for copying from one buffer object to another.
Buffer for copying from one buffer object to another.
Buffer for transform feedback operations.
Buffer used for storing uniform blocks.
Buffer used for pixel transfer operations.
Buffer used for pixel transfer operations.
	 */
	fun getBufferSubData(dstdata: TypedArray, dstoffset: GLuint, length: GLuint, srcbyteoffset: GLintptr, target: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getFragDataLocation()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns the binding of color numbers to user-defined varying out variables.</p>
	 *
	 * @param name A string specifying the name of the user-defined varying out variable.
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> to query.
	 */
	fun getFragDataLocation(name: , program: WebGLProgram): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getIndexedParameter()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns indexed information about a given <code>target</code>.</p>
	 *
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the <code>target</code> that is queried.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target for which to return information. Possible values:
When using the <a href="/en-US/docs/Web/API/OES_draw_buffers_indexed"><code>OES_draw_buffers_indexed</code></a> WebGL 2 extension, the following values are available additionally:
	 */
	fun getIndexedParameter(index: GLuint, target: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getInternalformatParameter()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns information about implementation-dependent support for internal formats.</p>
	 *
	 * @param internalformat A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the internal format about which to retrieve information (must be a color-renderable, depth-renderable or stencil-renderable format).
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the type of information to query. Possible values:
Returns a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array"><code>Int32Array</code></a> containing sample counts supported for <code>internalformat</code> in descending order.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target renderbuffer object. Possible values:
Buffer data storage for single images in a renderable internal format.
	 */
	fun getInternalformatParameter(internalformat: GLenum, pname: GLenum, target: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getQuery()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns the currently active <a href="/en-US/docs/Web/API/WebGLQuery"><code>WebGLQuery</code></a> for the <code>target</code>, or <a href="/en-US/docs/Web/JavaScript/Reference/Operators/null"><code>null</code></a>.</p>
	 *
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the query object target. Must be <code>gl.CURRENT_QUERY</code>.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target of the query. Possible values:
Specifies an occlusion query: these queries detect whether an object is visible (whether the scoped drawing commands pass the depth test and if so, how many samples pass).
Same as above, but less accurate and faster version.
Number of primitives that are written to transform feedback buffers.
	 */
	fun getQuery(pname: GLenum, target: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getQueryParameter()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns parameter information of a <a href="/en-US/docs/Web/API/WebGLQuery"><code>WebGLQuery</code></a> object.</p>
	 *
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which information to return. Possible values:
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> containing the query result.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether or not a query result is available.
	 * @param query A <a href="/en-US/docs/Web/API/WebGLQuery"><code>WebGLQuery</code></a> object.
	 */
	fun getQueryParameter(pname: GLenum, query: WebGLQuery): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getSamplerParameter()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns parameter information of a <a href="/en-US/docs/Web/API/WebGLSampler"><code>WebGLSampler</code></a> object.</p>
	 *
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which information to return. Possible values:
	 * @param sampler A <a href="/en-US/docs/Web/API/WebGLSampler"><code>WebGLSampler</code></a> object.
	 */
	fun getSamplerParameter(pname: GLenum, sampler: WebGLSampler): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getSyncParameter()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns parameter information of a <a href="/en-US/docs/Web/API/WebGLSync"><code>WebGLSync</code></a> object.</p>
	 *
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which information to return. Possible values:
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> indicating the type of the sync object (always <code>gl.SYNC_FENCE</code>).
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> indicating the status of the sync object (<code>gl.SIGNALED</code> or <code>gl.UNSIGNALED</code>).
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> indicating the sync objects' condition (always <code>gl.SYNC_GPU_COMMANDS_COMPLETE</code>).
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> indicating the flags with which the sync object was created (always 0 as no flags are supported).
	 * @param sync A <a href="/en-US/docs/Web/API/WebGLSync"><code>WebGLSync</code></a> object.
	 */
	fun getSyncParameter(pname: GLenum, sync: WebGLSync): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getTransformFeedbackVarying()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns information about varying variables from <a href="/en-US/docs/Web/API/WebGLTransformFeedback"><code>WebGLTransformFeedback</code></a> buffers.</p>
	 *
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the varying variable whose information to retrieve<code>.</code>
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.
	 */
	fun getTransformFeedbackVarying(index: GLuint, program: WebGLProgram): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getUniformBlockIndex()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> retrieves the index of a uniform block within a <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.</p>
	 *
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> containing the uniform block.
	 * @param uniformname A string specifying the name of the uniform block to whose index to retrieve.
	 */
	fun getUniformBlockIndex(program: WebGLProgram, uniformname: ): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.getUniformIndices()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> retrieves the indices of a number of uniforms within a <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.</p>
	 *
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> containing uniforms whose indices to query.
	 * @param uniformnames An <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of string specifying the names of the uniforms to query.
	 */
	fun getUniformIndices(program: WebGLProgram, uniformnames: Array<String>): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.invalidateFramebuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> invalidates the contents of attachments in a framebuffer.</p>
	 *
	 * @param attachments An <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the attachment points to invalidate. Possible values:
Invalidates one of the framebuffer's color buffers.
Invalidates the framebuffer's depth buffer.
Invalidates the framebuffer's stencil buffer.
Invalidates both the framebuffer's depth and stencil buffer.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image.
Equivalent to <code>gl.FRAMEBUFFER</code>.
Used as a source for reading operations.
	 */
	fun invalidateFramebuffer(attachments: GLenum, target: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.invalidateSubFramebuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> invalidates portions of the contents of attachments in a framebuffer.</p>
	 *
	 * @param attachments An <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the attachment points to invalidate. Possible values:
Invalidates one of the framebuffer's color buffers.
Invalidates the framebuffer's depth buffer.
Invalidates the framebuffer's stencil buffer.
Invalidates both the framebuffer's depth and stencil buffer.
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the pixel rectangle to invalidate.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image.
Equivalent to <code>gl.FRAMEBUFFER</code>.
Used as a source for reading operations.
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the pixel rectangle to invalidate.
	 * @param x A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the left origin of the pixel rectangle to invalidate.
	 * @param y A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the bottom origin of the pixel rectangle to invalidate.
	 */
	fun invalidateSubFramebuffer(attachments: GLenum, height: GLsizei, target: GLenum, width: GLsizei, x: GLint, y: GLint): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.isQuery()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns <code>true</code> if the passed object is a valid <a href="/en-US/docs/Web/API/WebGLQuery"><code>WebGLQuery</code></a> object.</p>
	 *
	 * @param query A <a href="/en-US/docs/Web/API/WebGLQuery"><code>WebGLQuery</code></a> object to test.
	 */
	fun isQuery(query: WebGLQuery): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.isSampler()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns <code>true</code> if the passed object is a valid <a href="/en-US/docs/Web/API/WebGLSampler"><code>WebGLSampler</code></a> object.</p>
	 *
	 * @param sampler A <a href="/en-US/docs/Web/API/WebGLSampler"><code>WebGLSampler</code></a> object to test.
	 */
	fun isSampler(sampler: WebGLSampler): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.isSync()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns <code>true</code> if the passed object is a valid <a href="/en-US/docs/Web/API/WebGLSync"><code>WebGLSync</code></a> object.</p>
	 *
	 * @param sync A <a href="/en-US/docs/Web/API/WebGLSync"><code>WebGLSync</code></a> object to test.
	 */
	fun isSync(sync: WebGLSync): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.isTransformFeedback()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns <code>true</code> if the passed object is a valid <a href="/en-US/docs/Web/API/WebGLTransformFeedback"><code>WebGLTransformFeedback</code></a> object.</p>
	 *
	 * @param transformfeedback A <a href="/en-US/docs/Web/API/WebGLTransformFeedback"><code>WebGLTransformFeedback</code></a> object to test.
	 */
	fun isTransformFeedback(transformfeedback: WebGLTransformFeedback): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.isVertexArray()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns <code>true</code> if the passed object is a valid <a href="/en-US/docs/Web/API/WebGLVertexArrayObject"><code>WebGLVertexArrayObject</code></a> object.</p>
	 *
	 * @param vertexarray A <a href="/en-US/docs/Web/API/WebGLVertexArrayObject"><code>WebGLVertexArrayObject</code></a> (VAO) object to test.
	 */
	fun isVertexArray(vertexarray: WebGLVertexArrayObject): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.pauseTransformFeedback()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> pauses a transform feedback operation.</p>
	 *
	 */
	fun pauseTransformFeedback(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.readBuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> selects a color buffer as the source for pixels for subsequent calls to <a href="/en-US/docs/Web/API/WebGLRenderingContext/copyTexImage2D" title="copyTexImage2D"><code>copyTexImage2D</code></a>, <a href="/en-US/docs/Web/API/WebGLRenderingContext/copyTexSubImage2D" title="copyTexSubImage2D"><code>copyTexSubImage2D</code></a>, <a href="/en-US/docs/Web/API/WebGL2RenderingContext/copyTexSubImage3D" title="copyTexSubImage3D"><code>copyTexSubImage3D</code></a> or <a href="/en-US/docs/Web/API/WebGLRenderingContext/readPixels" title="readPixels"><code>readPixels</code></a>.</p>
	 *
	 * @param source A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying a color buffer. Possible values:
Reads from the back color buffer.
Reads from no color buffer.
Reads from one of the 16 color attachment buffers.
	 */
	fun readBuffer(source: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.renderbufferStorageMultisample()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns creates and initializes a renderbuffer object's data store and allows specifying a number of samples to be used.</p>
	 *
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the renderbuffer in pixels.
	 * @param internalformat A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the internal format of the renderbuffer. Possible values (<code>gl.DEPTH_STENCIL</code> is not supported):
	 * @param samples A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the number of samples to be used for the renderbuffer storage.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target renderbuffer object. Possible values:
Buffer data storage for single images in a renderable internal format.
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the renderbuffer in pixels.
	 */
	fun renderbufferStorageMultisample(height: GLsizei, internalformat: GLenum, samples: GLsizei, target: GLenum, width: GLsizei): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.resumeTransformFeedback()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> resumes a transform feedback operation.</p>
	 *
	 */
	fun resumeTransformFeedback(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.samplerParameter[if]()</code></strong> methods of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> set <a href="/en-US/docs/Web/API/WebGLSampler"><code>WebGLSampler</code></a> parameters.</p>
	 *
	 * @param param A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> (<code>samplerParameteri</code>) or a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> (<code>samplerParameterf</code>) specifying a value for <code>pname</code>.
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which parameter to set. Possible values:
A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture comparison function.
A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture comparison mode.
A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture magnification filter.
A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> specifying the maximum level-of-detail value.
A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture minification filter
A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> specifying the minimum level-of-detail value.
A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture wrapping function for the texture coordinate r.
A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture wrapping function for the texture coordinate s.
A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture wrapping function for the texture coordinate t.
	 * @param sampler A <a href="/en-US/docs/Web/API/WebGLSampler"><code>WebGLSampler</code></a> object.
	 */
	fun samplerParameter(param: GLint, pname: GLenum, sampler: WebGLSampler): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.texImage3D()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies a three-dimensional texture image.</p>
	 *
	 * @param border A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the width of the border. Must be 0.
	 * @param depth A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the depth of the texture.
	 * @param format A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the format of the texel data. The correct combinations with <code>internalformat</code> are listed in <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE" class="external" target="_blank">this table</a>.
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the texture.
	 * @param internalformat A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the color components in the texture. Possible values:
	 * @param level A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.
	 * @param offset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> byte offset into the <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a>'s data store. Used to upload data to the currently bound <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> from the <code>WebGLBuffer</code> bound to the <code>PIXEL_UNPACK_BUFFER</code> target.
	 * @param source One of the following objects can be used as a pixel source for the texture:
	 * @param srcdata A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a> object.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:
	 * @param type A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the data type of the texel data. Possible values:
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the texture.
	 */
	fun texImage3D(border: GLint, depth: GLsizei, format: GLenum, height: GLsizei, internalformat: GLint, level: GLint, offset: GLintptr, source: ImageBitmap, srcdata: TypedArray, target: GLenum, type: GLenum, width: GLsizei): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.texStorage2D()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies all levels of two-dimensional texture storage.</p>
	 *
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the texture.
	 * @param internalformat A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture store format. Possible values:
Unlike OpenGL 3.0, WebGL 2 <strong>doesn't support</strong> the following ETC2 and EAC compressed texture formats (see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#5.37" class="external" target="_blank">section 5.37</a> in the WebGL 2 spec). You might be able to enable them via the <a href="/en-US/docs/Web/API/WEBGL_compressed_texture_etc"><code>WEBGL_compressed_texture_etc</code></a> extension, though.
	 * @param levels A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the number of texture levels.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the texture.
	 */
	fun texStorage2D(height: GLsizei, internalformat: GLenum, levels: GLint, target: GLenum, width: GLsizei): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.texStorage3D()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies all levels of a three-dimensional texture or two-dimensional array texture.</p>
	 *
	 * @param depth A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the depth of the texture.
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the texture.
	 * @param internalformat A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture store format. Possible values:
In addition if the <a href="/en-US/docs/Web/API/WEBGL_compressed_texture_etc"><code>WEBGL_compressed_texture_etc</code></a> extension is supported, the following values are also possible:
	 * @param level A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the number of texture levels.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the texture.
	 */
	fun texStorage3D(depth: GLsizei, height: GLsizei, internalformat: GLenum, level: GLint, target: GLenum, width: GLsizei): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.texSubImage3D()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies a sub-rectangle of the current texture.</p>
	 *
	 * @param depth A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the depth of the texture.
	 * @param format A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the format of the texel data. Possible values:
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the texture.
	 * @param level A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.
	 * @param offset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> byte offset into the <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a>'s data store. Used to upload data to the currently bound <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> from the <code>WebGLBuffer</code> bound to the <code>PIXEL_UNPACK_BUFFER</code> target.
	 * @param pixels One of the following objects can be used as a pixel source for the texture:
	 * @param srcdata A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a> object.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:
	 * @param type A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the data type of the texel data. Possible values:
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the texture.
	 * @param xoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the x offset within the texture image.
	 * @param yoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the y offset within the texture image.
	 * @param zoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the z offset within the texture image.
	 */
	fun texSubImage3D(depth: GLsizei, format: GLenum, height: GLsizei, level: GLint, offset: GLintptr, pixels: Uint8Array, srcdata: TypedArray, target: GLenum, type: GLenum, width: GLsizei, xoffset: GLint, yoffset: GLint, zoffset: GLint): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.transformFeedbackVaryings()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> specifies values to record in <a href="/en-US/docs/Web/API/WebGLTransformFeedback"><code>WebGLTransformFeedback</code></a> buffers.</p>
	 *
	 * @param buffermode A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the mode to use when capturing the varying variables. Either <code>gl.INTERLEAVED_ATTRIBS</code> or <code>gl.SEPARATE_ATTRIBS</code>.
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.
	 * @param varyings An <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array"><code>Array</code></a> of string specifying the names of the varying variables to use.
	 */
	fun transformFeedbackVaryings(buffermode: GLenum, program: WebGLProgram, varyings: Array<String>): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.uniform[1234][uif][v]()</code></strong> methods of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specify values of uniform variables.</p>
<div class="notecard note" id="sect1">
 <p><strong>Note:</strong> <code>ui</code> stands for <em>unsigned integer</em>, <code>i</code> for <em>integer</em>, <code>f</code> for <em>float</em>, and <code>v</code> for <em>vector</em>. Not all combinations are valid: <code>u</code> cannot be combined with <code>f</code>. See the syntax table below. Equivalent Regex: <code>uniform[1234](u?i|f)v?</code></p>
</div>
	 *
	 * @param data_v0_v1_v2_v3 A new value to be used for the uniform variable. Possible types:
	 * @param location A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.
	 */
	fun uniform(data_v0_v1_v2_v3: Number, location: WebGLUniformLocation): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.uniformBlockBinding()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> assigns binding points for active uniform blocks.</p>
	 *
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> containing the active uniform block whose binding to assign.
	 * @param uniformblockbinding A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the binding point to which to bind the uniform block.
	 * @param uniformblockindex A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the active uniform block within the program.
	 */
	fun uniformBlockBinding(program: WebGLProgram, uniformblockbinding: GLuint, uniformblockindex: GLuint): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.uniformMatrix[234]x[234]fv()</code></strong> methods of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> specify matrix values for uniform variables.</p>
<div class="notecard note" id="sect1">
 <p><strong>Note:</strong> There are no <code>2x2</code>, <code>3x3</code>, and <code>4x4</code> versions of this method. They are abbreviated in <code>2</code>, <code>3</code>, and <code>4</code>, respectively. See the syntax below.</p>
</div>
	 *
	 * @param data A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> of float values.
	 * @param location A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.
	 * @param transpose A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether to transpose the matrix.
	 */
	fun uniformMatrix(data: Float32Array, location: WebGLUniformLocation, transpose: GLboolean): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.vertexAttribDivisor()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> modifies the rate at which generic vertex attributes advance when rendering multiple instances of primitives with <a href="/en-US/docs/Web/API/WebGL2RenderingContext/drawArraysInstanced" title="gl.drawArraysInstanced()"><code>gl.drawArraysInstanced()</code></a> and <a href="/en-US/docs/Web/API/WebGL2RenderingContext/drawElementsInstanced" title="gl.drawElementsInstanced()"><code>gl.drawElementsInstanced()</code></a>.</p>
<div class="notecard note" id="sect1">
 <p><strong>Note:</strong> When using <a href="/en-US/docs/Web/API/WebGLRenderingContext" title="WebGL 1">WebGL 1</a>, the <a href="/en-US/docs/Web/API/ANGLE_instanced_arrays"><code>ANGLE_instanced_arrays</code></a> extension can provide this method, too.</p>
</div>
	 *
	 * @param divisor A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the number of instances that will pass between updates of the generic attribute.
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the generic vertex attributes.
	 */
	fun vertexAttribDivisor(divisor: GLuint, index: GLuint): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.vertexAttribI4[u]i[v]()</code></strong> methods of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> specify integer values for generic vertex attributes.</p>
	 *
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.
	 * @param v0_v1_v2_v3 An integer <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number"><code>Number</code></a> for the vertex attribute value.
	 * @param value A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint32Array"><code>Uint32Array</code></a>/<a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array"><code>Int32Array</code></a> or sequences of <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a>/ <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> for integer vector vertex attribute values.
	 */
	fun vertexAttribI(index: GLuint, v0_v1_v2_v3: Number, value: GLuint): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.vertexAttribIPointer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> specifies integer data formats and locations of vertex attributes in a vertex attributes array.</p>
	 *
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the vertex attribute that is to be modified.
	 * @param offset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying an offset in bytes of the first component in the vertex attribute array. Must be a multiple of <code>type</code>.
	 * @param size A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the number of components per vertex attribute. Must be 1, 2, 3, or 4.
	 * @param stride A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the offset in bytes between the beginning of consecutive vertex attributes.
	 * @param type A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the data type of each component in the array. Must be one of: <code>gl.BYTE</code>, <code>gl.UNSIGNED_BYTE</code>, <code>gl.SHORT</code>, <code>gl.UNSIGNED_SHORT</code>, <code>gl.INT</code>, or <code>gl.UNSIGNED_INT</code>.
	 */
	fun vertexAttribIPointer(index: GLuint, offset: GLintptr, size: GLint, stride: GLsizei, type: GLenum): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGL2RenderingContext.waitSync()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL 2 API</a> returns immediately, but waits on the GL server until the given <a href="/en-US/docs/Web/API/WebGLSync"><code>WebGLSync</code></a> object is signaled.</p>
<p>The method is a no-op in the absence of the possibility of synchronizing between multiple GL contexts.</p>
	 *
	 * @param flags A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLbitfield"><code>GLbitfield</code></a> specifying a bitwise combination of flags controlling the flushing behavior. Must be <code>0</code> (exists for extensions only).
	 * @param sync A <a href="/en-US/docs/Web/API/WebGLSync"><code>WebGLSync</code></a> object on which to wait on.
	 * @param timeout A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint64"><code>GLint64</code></a> specifying a timeout the server should wait before continuing. Must be <code>gl.TIMEOUT_IGNORED</code>.
	 */
	fun waitSync(flags: GLbitfield, sync: WebGLSync, timeout: GLint64): Unit // return type, 
	
}

package com.github.jdw.seaofshadows.shared.webgl.interfaces

interface WebGLRenderingContext {
	/**
	 * <p>The <strong><code>WebGLRenderingContext.activeTexture()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies which texture unit to make active.</p>
	 *
	 * @param texture The texture unit to make active. The value is a <code>gl.TEXTUREI</code> where <em>I</em> is within the range from 0 to <code>gl.MAX_COMBINED_TEXTURE_IMAGE_UNITS - 1</code>.
	 */
	fun activeTexture(texture: ,): Unit // return type, 
	
	/**
	 * <p>The <strong>WebGLRenderingContext.attachShader()</strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> attaches either a fragment or vertex <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> to a <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.</p>
	 *
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.
	 * @param shader A fragment or vertex <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a>.
	 */
	fun attachShader(program: WebGLProgram,shader: WebGLShader,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.bindAttribLocation()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> binds a generic vertex index to an attribute variable.</p>
	 *
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the generic vertex to bind.
	 * @param name A string specifying the name of the variable to bind to the generic vertex index. This name cannot start with "webgl_" or "_webgl_", as these are reserved for use by WebGL.
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> object to bind.
	 */
	fun bindAttribLocation(index: GLuint,name: ,program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.bindBuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> binds a given <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a> to a target.</p>
	 *
	 * @param buffer A <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a> to bind.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data.
Buffer used for element indices.
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
Buffer for copying from one buffer object to another.
Buffer for copying from one buffer object to another.
Buffer for transform feedback operations.
Buffer used for storing uniform blocks.
Buffer used for pixel transfer operations.
Buffer used for pixel transfer operations.
	 */
	fun bindBuffer(buffer: WebGLBuffer,target: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.bindFramebuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> binds to the specified target the provided <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a>, or, if the <code>framebuffer</code> argument is null, the default <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a>, which is associated with the canvas rendering context.</p>
	 *
	 * @param framebuffer A <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> object to bind, or <a href="/en-US/docs/Web/JavaScript/Reference/Operators/null"><code>null</code></a> for binding the <a href="/en-US/docs/Web/API/HTMLCanvasElement"><code>HTMLCanvasElement</code></a> or <a href="/en-US/docs/Web/API/OffscreenCanvas"><code>OffscreenCanvas</code></a> object associated with the rendering context.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
Collection buffer data storage of color, alpha, depth and stencil buffers used as both a destination for drawing and as a source for reading (see below).
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
Used as a destination for drawing operations such as <code>gl.draw*</code>, <code>gl.clear*</code> and <code>gl.blitFramebuffer</code>.
Used as a source for reading operations such as <code>gl.readPixels</code> and <code>gl.blitFramebuffer</code>.
	 */
	fun bindFramebuffer(framebuffer: WebGLFramebuffer,target: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.bindRenderbuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> binds a given <a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> to a target, which must be <code>gl.RENDERBUFFER</code>.</p>
	 *
	 * @param renderbuffer A <a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> object to bind.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
Buffer data storage for single images in a renderable internal format.
	 */
	fun bindRenderbuffer(renderbuffer: WebGLRenderbuffer,target: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.bindTexture()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> binds a given <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> to a target (binding point).</p>
	 *
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
	 * @param texture A <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> object to bind.
	 */
	fun bindTexture(target: GLenum,texture: WebGLTexture,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.blendColor()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> is used to set the source and destination blending factors.</p>
	 *
	 * @param alpha A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> for the alpha component (transparency) in the range of 0. to 1. Default value is 0.
	 * @param blue A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> for the blue component in the range of 0 to 1. Default value is 0.
	 * @param green A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> for the green component in the range of 0 to 1. Default value is 0.
	 * @param red A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> for the red component in the range of 0 to 1. Default value is 0.
	 */
	fun blendColor(alpha: GLclampf,blue: GLclampf,green: GLclampf,red: GLclampf,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.blendEquation()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> is used to set both the RGB blend equation and alpha blend equation to a single equation.</p>
<p>The blend equation determines how a new pixel is combined with a pixel already in the <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a>.</p>
	 *
	 * @param mode A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying how source and destination colors are combined. Must be either:
When using the <a href="/en-US/docs/Web/API/EXT_blend_minmax"><code>EXT_blend_minmax</code></a> extension:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
	 */
	fun blendEquation(mode: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.blendEquationSeparate()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> is used to set the RGB blend equation and alpha blend equation separately.</p>
<p>The blend equation determines how a new pixel is combined with a pixel already in the <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a>.</p>
	 *
	 * @param modealpha A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying how the alpha component (transparency) of source and destination colors are combined. Must be either:
	 * @param modergb A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying how the red, green and blue components of source and destination colors are combined. Must be either:
	 */
	fun blendEquationSeparate(modealpha: GLenum,modergb: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.blendFunc()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> defines which function is used for blending pixel arithmetic.</p>
	 *
	 * @param dfactor A <a href="/en-US/docs/Web/API/WebGL_API/Types"><code>WebGL_API.Types</code></a> specifying a multiplier for the destination blending factors. The default value is <code>gl.ZERO</code>. For possible values, see below.
	 * @param sfactor A <a href="/en-US/docs/Web/API/WebGL_API/Types"><code>WebGL_API.Types</code></a> specifying a multiplier for the source blending factors. The default value is <code>gl.ONE</code>. For possible values, see below.
	 */
	fun blendFunc(dfactor: WebGL_API.Types,sfactor: WebGL_API.Types,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.blendFuncSeparate()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> defines which function is used for blending pixel arithmetic for RGB and alpha components separately.</p>
	 *
	 * @param dstalpha A <a href="/en-US/docs/Web/API/WebGL_API/Types"><code>WebGL_API.Types</code></a> specifying a multiplier for the alpha destination blending factor. The default value is <code>gl.ZERO</code>. For possible values, see below.
	 * @param dstrgb A <a href="/en-US/docs/Web/API/WebGL_API/Types"><code>WebGL_API.Types</code></a> specifying a multiplier for the red, green and blue (RGB) destination blending factors. The default value is <code>gl.ZERO</code>. For possible values, see below.
	 * @param srcalpha A <a href="/en-US/docs/Web/API/WebGL_API/Types"><code>WebGL_API.Types</code></a> specifying a multiplier for the alpha source blending factor. The default value is <code>gl.ONE</code>. For possible values, see below.
	 * @param srcrgb A <a href="/en-US/docs/Web/API/WebGL_API/Types"><code>WebGL_API.Types</code></a> specifying a multiplier for the red, green and blue (RGB) source blending factors. The default value is <code>gl.ONE</code>. For possible values, see below.
	 */
	fun blendFuncSeparate(dstalpha: WebGL_API.Types,dstrgb: WebGL_API.Types,srcalpha: WebGL_API.Types,srcrgb: WebGL_API.Types,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.bufferData()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> initializes and creates the buffer object's data store.</p>
	 *
	 * @param size A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizeiptr"><code>GLsizeiptr</code></a> setting the size in bytes of the buffer object's data store.
	 * @param srcdata An <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer"><code>ArrayBuffer</code></a>, <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer"><code>SharedArrayBuffer</code></a>, a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a> that will be copied into the data store. If <code>null</code>, a data store is still created, but the content is uninitialized and undefined.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data.
Buffer used for element indices.
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
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
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
The contents are intended to be specified once by reading data from WebGL, and queried many times by the application.
The contents are intended to be respecified repeatedly by reading data from WebGL, and queried many times by the application.
The contents are intended to be specified once by reading data from WebGL, and queried at most a few times by the application
The contents are intended to be specified once by reading data from WebGL, and used many times as the source for WebGL drawing and image specification commands.
The contents are intended to be respecified repeatedly by reading data from WebGL, and used many times as the source for WebGL drawing and image specification commands.
The contents are intended to be specified once by reading data from WebGL, and used at most a few times as the source for WebGL drawing and image specification commands.
	 */
	fun bufferData(size: GLsizeiptr,srcdata: ArrayBuffer,target: GLenum,usage: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.bufferSubData()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> updates a subset of a buffer object's data store.</p>
	 *
	 * @param dstbyteoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying an offset in bytes where the data replacement will start.
	 * @param length A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> defaulting to 0.
	 * @param srcdata An <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer"><code>ArrayBuffer</code></a>, <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer"><code>SharedArrayBuffer</code></a>, a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a>, or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> that will be copied into the data store.
	 * @param srcoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the element index offset where to start reading the buffer.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data.
Buffer used for element indices.
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
Buffer for copying from one buffer object to another.
Buffer for copying from one buffer object to another.
Buffer for transform feedback operations.
Buffer used for storing uniform blocks.
Buffer used for pixel transfer operations.
Buffer used for pixel transfer operations.
	 */
	fun bufferSubData(dstbyteoffset: GLintptr,length: GLuint,srcdata: ArrayBuffer,srcoffset: GLuint,target: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.checkFramebufferStatus()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns the completeness status of the <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> object.</p>
	 *
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image.
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
Equivalent to <code>gl.FRAMEBUFFER</code>. Used as a destination for drawing, rendering, clearing, and writing operations.
Used as a source for reading operations.
	 */
	fun checkFramebufferStatus(target: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.clear()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> clears buffers to preset values.</p>
<p>The preset values can be set by <a href="/en-US/docs/Web/API/WebGLRenderingContext/clearColor" title="clearColor()"><code>clearColor()</code></a>, <a href="/en-US/docs/Web/API/WebGLRenderingContext/clearDepth" title="clearDepth()"><code>clearDepth()</code></a> or <a href="/en-US/docs/Web/API/WebGLRenderingContext/clearStencil" title="clearStencil()"><code>clearStencil()</code></a>.</p>
<p>The scissor box, dithering, and buffer writemasks can affect the <code>clear()</code> method.</p>
	 *
	 * @param mask A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLbitfield"><code>GLbitfield</code></a> bitwise OR mask that indicates the buffers to be cleared. Possible values are:
	 */
	fun clear(mask: GLbitfield,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.clearColor()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies the color values used when clearing color buffers.</p>
<p>This specifies what color values to use when calling the <a href="/en-US/docs/Web/API/WebGLRenderingContext/clear" title="clear()"><code>clear()</code></a> method. The values are clamped between 0 and 1.</p>
	 *
	 * @param alpha A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the alpha (transparency) value used when the color buffers are cleared. Default value: 0.
	 * @param blue A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the blue color value used when the color buffers are cleared. Default value: 0.
	 * @param green A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the green color value used when the color buffers are cleared. Default value: 0.
	 * @param red A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the red color value used when the color buffers are cleared. Default value: 0.
	 */
	fun clearColor(alpha: GLclampf,blue: GLclampf,green: GLclampf,red: GLclampf,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.clearDepth()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies the clear value for the depth buffer.</p>
<p>This specifies what depth value to use when calling the <a href="/en-US/docs/Web/API/WebGLRenderingContext/clear" title="clear()"><code>clear()</code></a> method. The value is clamped between 0 and 1.</p>
	 *
	 * @param depth A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the depth value used when the depth buffer is cleared. Default value: 1.
	 */
	fun clearDepth(depth: GLclampf,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.clearStencil()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies the clear value for the stencil buffer.</p>
<p>This specifies what stencil value to use when calling the <a href="/en-US/docs/Web/API/WebGLRenderingContext/clear" title="clear()"><code>clear()</code></a> method.</p>
	 *
	 * @param s A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the index used when the stencil buffer is cleared. Default value: 0.
	 */
	fun clearStencil(s: GLint,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.colorMask()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> sets which color components to enable or to disable when drawing or rendering to a <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a>.</p>
	 *
	 * @param alpha A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether or not the alpha (transparency) component can be written into the frame buffer. Default value: <code>true</code>.
	 * @param blue A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether or not the blue color component can be written into the frame buffer. Default value: <code>true</code>.
	 * @param green A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether or not the green color component can be written into the frame buffer. Default value: <code>true</code>.
	 * @param red A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether or not the red color component can be written into the frame buffer. Default value: <code>true</code>.
	 */
	fun colorMask(alpha: GLboolean,blue: GLboolean,green: GLboolean,red: GLboolean,): Unit // return type, 
	
	/**
	 * <p>The <strong>WebGLRenderingContext.compileShader()</strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> compiles a GLSL shader into binary data so that it can be used by a <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.</p>
	 *
	 * @param shader A fragment or vertex <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a>.
	 */
	fun compileShader(shader: WebGLShader,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.compressedTexImage2D()</code></strong> and <strong><code>WebGL2RenderingContext.compressedTexImage3D()</code></strong> methods of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specify a two- or three-dimensional texture image in a compressed format.</p>
<p>Compressed image formats must be enabled by <a href="/en-US/docs/Web/API/WebGL_API/Using_Extensions">WebGL extensions</a> before using these methods.</p>
	 *
	 * @param border A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the width of the border. Must be 0.
	 * @param depth A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the depth of the texture/the number of textures in a <code>TEXTURE_2D_ARRAY</code>.
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the texture.
	 * @param imagesize A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the number of bytes to read from the buffer bound to <code>gl.PIXEL_UNPACK_BUFFER</code>.
	 * @param internalformat A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the compressed image format. Compressed image formats must be enabled by <a href="/en-US/docs/Web/API/WebGL_API/Using_Extensions">WebGL extensions</a> before using this method. All values are possible for <code>compressedTexImage2D</code>. See <a href="/en-US/docs/Web/API/WebGL_API/Compressed_texture_formats">compressed texture formats</a> for which are valid for <code>compressedTexImage3D</code>. Possible values:
	 * @param level A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.
	 * @param offset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying the offset in bytes from which to read from the buffer bound to <code>gl.PIXEL_UNPACK_BUFFER</code>.
	 * @param pixels A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a> that will be used as a data store for the compressed image data in memory.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values for <code>compressedTexImage2D</code>:
Possible values for <code>compressedTexImage3D</code>:
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the texture.
	 */
	fun compressedTexImage2D(border: GLint,depth: GLsizei,height: GLsizei,imagesize: GLsizei,internalformat: GLenum,level: GLint,offset: GLintptr,pixels: TypedArray,target: GLenum,width: GLsizei,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.compressedTexSubImage2D()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies a two-dimensional sub-rectangle for a texture image in a compressed format.</p>
<p>Compressed image formats must be enabled by <a href="/en-US/docs/Web/API/WebGL_API/Using_Extensions">WebGL extensions</a> before using this method or a <a href="/en-US/docs/Web/API/WebGL2RenderingContext"><code>WebGL2RenderingContext</code></a> must be used.</p>
	 *
	 * @param format A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the compressed image format. Compressed image formats must be enabled by <a href="/en-US/docs/Web/API/WebGL_API/Using_Extensions">WebGL extensions</a> before using this method. Possible values:
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the compressed texture.
	 * @param imagesize A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the number of bytes to read from the buffer bound to <code>gl.PIXEL_UNPACK_BUFFER</code>.
	 * @param level A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.
	 * @param offset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying the offset in bytes from which to read from the buffer bound to <code>gl.PIXEL_UNPACK_BUFFER</code>.
	 * @param srcdata A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a> that will be used as a data store for the compressed image data in memory.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active compressed texture. Possible values:
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the compressed texture.
	 * @param xoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the horizontal offset within the compressed texture image.
	 * @param yoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the vertical offset within the compressed texture image.
	 */
	fun compressedTexSubImage2D(format: GLenum,height: GLsizei,imagesize: GLsizei,level: GLint,offset: GLintptr,srcdata: TypedArray,target: GLenum,width: GLsizei,xoffset: GLint,yoffset: GLint,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.copyTexImage2D()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> copies pixels from the current <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> into a 2D texture image.</p>
	 *
	 * @param border A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the width of the border. Must be 0.
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the texture.
	 * @param internalformat A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the color components in the texture. Possible values:
	 * @param level A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the texture.
	 * @param x A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the x coordinate of the lower left corner where to start copying.
	 * @param y A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the y coordinate of the lower left corner where to start copying.
	 */
	fun copyTexImage2D(border: GLint,height: GLsizei,internalformat: GLenum,level: GLint,target: GLenum,width: GLsizei,x: GLint,y: GLint,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.copyTexSubImage2D()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> copies pixels from the current <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> into an existing 2D texture sub-image.</p>
	 *
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the texture.
	 * @param level A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the texture.
	 * @param x A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the x coordinate of the lower left corner where to start copying.
	 * @param xoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the horizontal offset within the texture image.
	 * @param y A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the y coordinate of the lower left corner where to start copying.
	 * @param yoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the vertical offset within the texture image.
	 */
	fun copyTexSubImage2D(height: GLsizei,level: GLint,target: GLenum,width: GLsizei,x: GLint,xoffset: GLint,y: GLint,yoffset: GLint,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.createBuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> creates and initializes a <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a> storing data such as vertices or colors.</p>
	 *
	 */
	fun createBuffer(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.createFramebuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> creates and initializes a <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> object.</p>
	 *
	 */
	fun createFramebuffer(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.createProgram()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> creates and initializes a <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> object.</p>
	 *
	 */
	fun createProgram(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.createRenderbuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> creates and initializes a <a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> object.</p>
	 *
	 */
	fun createRenderbuffer(): Unit // return type, 
	
	/**
	 * <p>The <a href="/en-US/docs/Web/API/WebGLRenderingContext"><code>WebGLRenderingContext</code></a> method <strong><code>createShader()</code></strong> of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> creates a <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> that can then be configured further using <a href="/en-US/docs/Web/API/WebGLRenderingContext/shaderSource"><code>WebGLRenderingContext.shaderSource()</code></a> and <a href="/en-US/docs/Web/API/WebGLRenderingContext/compileShader"><code>WebGLRenderingContext.compileShader()</code></a>.</p>
	 *
	 * @param type Either <code>gl.VERTEX_SHADER</code> or <code>gl.FRAGMENT_SHADER</code>
	 */
	fun createShader(type: ,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.createTexture()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> creates and initializes a <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> object.</p>
	 *
	 */
	fun createTexture(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.cullFace()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies whether or not front- and/or back-facing polygons can be culled.</p>
	 *
	 * @param mode A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying whether front- or back-facing polygons are candidates for culling. The default value is <code>gl.BACK</code>. Possible values are:
	 */
	fun cullFace(mode: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.deleteBuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> deletes a given <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a>. This method has no effect if the buffer has already been deleted. Normally you don't need to call this method yourself, when the buffer object is dereferenced it will be marked as free.</p>
	 *
	 * @param buffer A <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a> object to delete.
	 */
	fun deleteBuffer(buffer: WebGLBuffer,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.deleteFramebuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> deletes a given <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> object. This method has no effect if the frame buffer has already been deleted.</p>
	 *
	 * @param framebuffer A <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> object to delete.
	 */
	fun deleteFramebuffer(framebuffer: WebGLFramebuffer,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.deleteProgram()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> deletes a given <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> object. This method has no effect if the program has already been deleted.</p>
	 *
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> object to delete.
	 */
	fun deleteProgram(program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.deleteRenderbuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> deletes a given <a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> object. This method has no effect if the render buffer has already been deleted.</p>
	 *
	 * @param renderbuffer A <a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> object to delete.
	 */
	fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.deleteShader()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> marks a given <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> object for deletion. It will then be deleted whenever the shader is no longer in use. This method has no effect if the shader has already been deleted, and the <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> is automatically marked for deletion when it is destroyed by the garbage collector.</p>
	 *
	 * @param shader A <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> object to delete.
	 */
	fun deleteShader(shader: WebGLShader,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.deleteTexture()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> deletes a given <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> object. This method has no effect if the texture has already been deleted.</p>
	 *
	 * @param texture A <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> object to delete.
	 */
	fun deleteTexture(texture: WebGLTexture,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.depthFunc()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies a function that compares incoming pixel depth to the current depth buffer value.</p>
	 *
	 * @param func A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the depth comparison function, which sets the conditions under which the pixel will be drawn. The default value is <code>gl.LESS</code>. Possible values are:
	 */
	fun depthFunc(func: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.depthMask()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> sets whether writing into the depth buffer is enabled or disabled.</p>
	 *
	 * @param flag A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether or not writing into the depth buffer is enabled. Default value: <code>true</code>, meaning that writing is enabled.
	 */
	fun depthMask(flag: GLboolean,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.depthRange()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies the depth range mapping from normalized device coordinates to window or viewport coordinates.</p>
	 *
	 * @param zfar A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the mapping of the far clipping plane to window or viewport coordinates. Clamped to the range 0 to 1. The default value i<code>s 1.</code>
	 * @param znear A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the mapping of the near clipping plane to window or viewport coordinates. Clamped to the range 0 to 1 and must be less than or equal to <code>zFar</code>. The default value i<code>s 0.</code>
	 */
	fun depthRange(zfar: GLclampf,znear: GLclampf,): Unit // return type, 
	
	/**
	 * <p>The <strong>WebGLRenderingContext.detachShader()</strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> detaches a previously attached <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> from a <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.</p>
	 *
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.
	 * @param shader A fragment or vertex <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a>.
	 */
	fun detachShader(program: WebGLProgram,shader: WebGLShader,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.disable()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> disables specific WebGL capabilities for this context.</p>
	 *
	 * @param capability A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which WebGL capability to disable. Possible values:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
	 */
	fun disable(capability: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.disableVertexAttribArray()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> turns the generic vertex attribute array off at a given index position.</p>
	 *
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the vertex attribute to disable.
	 */
	fun disableVertexAttribArray(index: GLuint,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.drawArrays()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> renders primitives from array data.</p>
	 *
	 * @param count A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the number of indices to be rendered.
	 * @param first A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the starting index in the array of vector points.
	 * @param mode A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the type primitive to render. Possible values are:
	 */
	fun drawArrays(count: GLsizei,first: GLint,mode: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.drawElements()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> renders primitives from array data.</p>
	 *
	 * @param count A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the number of elements of the bound element array buffer to be rendered. For example, to draw a wireframe triangle with <code>gl.LINES</code> the count should be 2 endpoints per line × 3 lines = 6 elements. However to draw the same wireframe triangle with <code>gl.LINE_STRIP</code> the element array buffer does not repeat the indices for the end of the first line/start of the second line, and end of the second line/start of the third line, so <code>count</code> will be four. To draw the same triangle with <code>gl.LINE_LOOP</code> the element array buffer does not repeat the first/last vertex either so <code>count</code> will be three.
	 * @param mode A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the type primitive to render. Possible values are:
	 * @param offset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying a byte offset in the element array buffer. Must be a valid multiple of the size of the given <code>type</code>.
	 * @param type A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the type of the values in the element array buffer. Possible values are:
When using the <a href="/en-US/docs/Web/API/OES_element_index_uint"><code>OES_element_index_uint</code></a> extension:
	 */
	fun drawElements(count: GLsizei,mode: GLenum,offset: GLintptr,type: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.enable()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> enables specific WebGL capabilities for this context.</p>
	 *
	 * @param cap A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which WebGL capability to enable. Possible values:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
	 */
	fun enable(cap: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <a href="/en-US/docs/Web/API/WebGLRenderingContext"><code>WebGLRenderingContext</code></a> method <strong><code>enableVertexAttribArray()</code></strong>, part of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a>, turns on the generic vertex attribute array at the specified index into the list of attribute arrays.</p>
<div class="notecard note" id="sect1">
 <p><strong>Note:</strong> You can disable the attribute array by calling <a href="/en-US/docs/Web/API/WebGLRenderingContext/disableVertexAttribArray" title="disableVertexAttribArray()"><code>disableVertexAttribArray()</code></a>.</p>
</div>
<p>In WebGL, values that apply to a specific vertex are stored in <a href="/en-US/docs/Web/API/WebGL_API/Data#attributes">attributes</a>. These are only available to the JavaScript code and the vertex shader. Attributes are referenced by an index number into the list of attributes maintained by the GPU. Some vertex attribute indices may have predefined purposes, depending on the platform and/or the GPU. Others are assigned by the WebGL layer when you create the attributes.</p>
<p>Either way, since attributes cannot be used unless enabled, and are disabled by default, you need to call <code>enableVertexAttribArray()</code> to enable individual attributes so that they can be used. Once that's been done, other methods can be used to access the attribute, including <a href="/en-US/docs/Web/API/WebGLRenderingContext/vertexAttribPointer" title="vertexAttribPointer()"><code>vertexAttribPointer()</code></a>, <a href="/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib" title="vertexAttrib*()"><code>vertexAttrib*()</code></a>, and <a href="/en-US/docs/Web/API/WebGLRenderingContext/getVertexAttrib" title="getVertexAttrib()"><code>getVertexAttrib()</code></a>.</p>
	 *
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index number that uniquely identifies the vertex attribute to enable. If you know the name of the attribute but not its index, you can get the index by calling <a href="/en-US/docs/Web/API/WebGLRenderingContext/getAttribLocation" title="getAttribLocation()"><code>getAttribLocation()</code></a>.
	 */
	fun enableVertexAttribArray(index: GLuint,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.finish()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> blocks execution until all previously called commands are finished.</p>
	 *
	 */
	fun finish(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.flush()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> empties different buffer commands, causing all commands to be executed as quickly as possible.</p>
	 *
	 */
	fun flush(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.framebufferRenderbuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> attaches a <a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> object to a <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> object.</p>
	 *
	 * @param attachment A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the attachment point for the render buffer. Possible values:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
When using the <a href="/en-US/docs/Web/API/WEBGL_draw_buffers"><code>WEBGL_draw_buffers</code></a> extension:
	 * @param renderbuffer A <a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> object to attach.
	 * @param renderbuffertarget A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) for the render buffer. Possible values:
Buffer data storage for single images in a renderable internal format.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) for the framebuffer. Possible values:
Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image.
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
Equivalent to <code>gl.FRAMEBUFFER</code>. Used as a destination for drawing, rendering, clearing, and writing operations.
Used as a source for reading operations.
	 */
	fun framebufferRenderbuffer(attachment: GLenum,renderbuffer: WebGLRenderbuffer,renderbuffertarget: GLenum,target: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.framebufferTexture2D()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> attaches a texture to a <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a>.</p>
	 *
	 * @param attachment A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the attachment point for the <code>texture</code>. Possible values:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
When using the <a href="/en-US/docs/Web/API/WEBGL_draw_buffers"><code>WEBGL_draw_buffers</code></a> extension:
When using the <a href="/en-US/docs/Web/API/WEBGL_depth_texture"><code>WEBGL_depth_texture</code></a> extension:
	 * @param level A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the mipmap level of the texture image to be attached. Must be 0.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image.
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
Used as a destination for drawing, rendering, clearing, and writing operations.
Used as a source for reading operations.
When binding, <code>gl.FRAMEBUFFER</code> sets both the <code>gl.DRAW_FRAMEBUFFER</code> and <code>gl.READ_FRAMEBUFFER</code> binding points. When referencing, <code>gl.FRAMEBUFFER</code> refers to the <code>gl.DRAW_FRAMEBUFFER</code> binding
	 * @param textarget A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture target. Possible values:
	 * @param texture A <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> object whose image to attach.
	 */
	fun framebufferTexture2D(attachment: GLenum,level: GLint,target: GLenum,textarget: GLenum,texture: WebGLTexture,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.frontFace()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies whether polygons are front- or back-facing by setting a winding orientation.</p>
	 *
	 * @param mode A <a href="/en-US/docs/Web/API/WebGL_API/Types">GLenum</a> type winding orientation. The default value is <code>gl.CCW</code>. Possible values:
	 */
	fun frontFace(mode: ,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.generateMipmap()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> generates a set of mipmaps for a <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> object.</p>
<p>Mipmaps are used to create distance with objects. A higher-resolution mipmap is used for objects that are closer, and a lower-resolution mipmap is used for objects that are farther away. It starts with the resolution of the texture image and halves the resolution until a 1x1 dimension texture image is created.</p>
	 *
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture whose mipmaps will be generated. Possible values:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
	 */
	fun generateMipmap(target: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getActiveAttrib()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns a <a href="/en-US/docs/Web/API/WebGLActiveInfo"><code>WebGLActiveInfo</code></a> object containing size, type, and name of a vertex attribute. It is generally used when querying unknown attributes either for debugging or generic library creation.</p>
	 *
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the vertex attribute to get. This value is an index 0 to N - 1 as returned by <a href="/en-US/docs/Web/API/WebGLRenderingContext/getProgramParameter" title="gl.getProgramParameter(program, gl.ACTIVE_ATTRIBUTES)"><code>gl.getProgramParameter(program, gl.ACTIVE_ATTRIBUTES)</code></a>.
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> containing the vertex attribute.
	 */
	fun getActiveAttrib(index: GLuint,program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getActiveUniform()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns a <a href="/en-US/docs/Web/API/WebGLActiveInfo"><code>WebGLActiveInfo</code></a> object containing size, type, and name of a uniform attribute. It is generally used when querying unknown uniforms either for debugging or generic library creation.</p>
	 *
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the uniform attribute to get. This value is an index 0 to N - 1 as returned by <a href="/en-US/docs/Web/API/WebGLRenderingContext/getProgramParameter" title="gl.getProgramParameter(program, gl.ACTIVE_UNIFORMS)"><code>gl.getProgramParameter(program, gl.ACTIVE_UNIFORMS)</code></a>.
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> specifying the WebGL shader program from which to obtain the uniform variable's information.
	 */
	fun getActiveUniform(index: GLuint,program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getAttachedShaders()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns a list of <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> objects attached to a <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.</p>
	 *
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> object to get attached shaders for.
	 */
	fun getAttachedShaders(program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getAttribLocation()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns the location of an attribute variable in a given <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.</p>
	 *
	 * @param name A string specifying the name of the attribute variable whose location to get.
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> containing the attribute variable.
	 */
	fun getAttribLocation(name: ,program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getBufferParameter()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns information about the buffer.</p>
	 *
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying information to query. Possible values:
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the size of the buffer in bytes.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> indicating the usage pattern of the buffer. One of the following:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target buffer object. Possible values:
Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data.
Buffer used for element indices.
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
Buffer for copying from one buffer object to another.
Buffer for copying from one buffer object to another.
Buffer for transform feedback operations.
Buffer used for storing uniform blocks.
Buffer used for pixel transfer operations.
Buffer used for pixel transfer operations.
	 */
	fun getBufferParameter(pname: GLenum,target: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getContextAttributes()</code></strong> method returns a <code>WebGLContextAttributes</code> object that contains the actual context parameters. Might return <a href="/en-US/docs/Web/JavaScript/Reference/Operators/null"><code>null</code></a>, if the context is lost.</p>
	 *
	 */
	fun getContextAttributes(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getError()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns error information.</p>
	 *
	 */
	fun getError(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getExtension()</code></strong> method enables a <a href="/en-US/docs/Web/API/WebGL_API">WebGL</a> extension.</p>
	 *
	 * @param name A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/String"><code>String</code></a> for the name of the WebGL extension to enable.
	 */
	fun getExtension(name: String,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getFramebufferAttachmentParameter()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns information about a framebuffer's attachment.</p>
	 *
	 * @param attachment A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the attachment point for the <code>texture</code>. Possible values:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
When using the <a href="/en-US/docs/Web/API/WEBGL_draw_buffers"><code>WEBGL_draw_buffers</code></a> extension:
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying information to query. Possible values:
When using the <a href="/en-US/docs/Web/API/EXT_sRGB"><code>EXT_sRGB</code></a> extension:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
When using the <a href="/en-US/docs/Web/API/OVR_multiview2"><code>OVR_multiview2</code></a> extension:
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image.
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
Equivalent to <code>gl.FRAMEBUFFER</code>. Used as a destination for drawing, rendering, clearing, and writing operations.
Used as a source for reading operations.
	 */
	fun getFramebufferAttachmentParameter(attachment: GLenum,pname: GLenum,target: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getParameter()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns a value for the passed parameter name.</p>
	 *
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which parameter value to return. See below for possible values.
	 */
	fun getParameter(pname: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong>WebGLRenderingContext.getProgramInfoLog</strong> returns the information log for the specified <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> object. It contains errors that occurred during failed linking or validation of <code>WebGLProgram</code> objects.</p>
	 *
	 * @param program The <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> to query.
	 */
	fun getProgramInfoLog(program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getProgramParameter()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns information about the given program.</p>
	 *
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the information to query. Possible values:
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether or not the program is flagged for deletion.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether or not the last link operation was successful.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether or not the last validation operation was successful.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of attached shaders to a program.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of active attribute variables to a program.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of active uniform variables to a program.
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> indicating the buffer mode when transform feedback is active. May be <code>gl.SEPARATE_ATTRIBS</code> or <code>gl.INTERLEAVED_ATTRIBS</code>.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of varying variables to capture in transform feedback mode.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of uniform blocks containing active uniforms.
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> to get parameter information from.
	 */
	fun getProgramParameter(pname: GLenum,program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getRenderbufferParameter()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns information about the renderbuffer.</p>
	 *
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the information to query. Possible values:
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the width of the image of the currently bound renderbuffer.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the height of the image of the currently bound renderbuffer.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> indicating the internal format of the currently bound renderbuffer. The default is <code>gl.RGBA4</code>. Possible return values:
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> that is the resolution size (in bits) for the green color.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> that is the resolution size (in bits) for the blue color.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> that is the resolution size (in bits) for the red color.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> that is the resolution size (in bits) for the alpha component.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> that is the resolution size (in bits) for the depth component.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> that is the resolution size (in bits) for the stencil component.
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following value is available additionally:
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of samples of the image of the currently bound renderbuffer.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target renderbuffer object. Possible values:
Buffer data storage for single images in a renderable internal format.
	 */
	fun getRenderbufferParameter(pname: GLenum,target: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong>WebGLRenderingContext.getShaderInfoLog</strong> returns the information log for the specified <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> object. It contains warnings, debugging and compile information.</p>
	 *
	 * @param shader A <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> to query.
	 */
	fun getShaderInfoLog(shader: WebGLShader,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getShaderParameter()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns information about the given shader.</p>
	 *
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the information to query. Possible values:
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether or not the shader is flagged for deletion.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether or not the last shader compilation was successful.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> indicating whether the shader is a vertex shader (<code>gl.VERTEX_SHADER</code>) or fragment shader (<code>gl.FRAGMENT_SHADER</code>) object.
	 * @param shader A <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> to get parameter information from.
	 */
	fun getShaderParameter(pname: GLenum,shader: WebGLShader,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getShaderPrecisionFormat()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns a new <a href="/en-US/docs/Web/API/WebGLShaderPrecisionFormat"><code>WebGLShaderPrecisionFormat</code></a> object describing the range and precision for the specified shader numeric format.</p>
	 *
	 * @param precisiontype A precision type value. Either <code>gl.LOW_FLOAT</code>, <code>gl.MEDIUM_FLOAT</code>, <code>gl.HIGH_FLOAT</code>, <code>gl.LOW_INT</code>, <code>gl.MEDIUM_INT</code>, or <code>gl.HIGH_INT</code>.
	 * @param shadertype Either a <code>gl.FRAGMENT_SHADER</code> or a <code>gl.VERTEX_SHADER</code>.
	 */
	fun getShaderPrecisionFormat(precisiontype: ,shadertype: ,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getShaderSource()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns the source code of a <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> as a string.</p>
	 *
	 * @param shader A <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> object to get the source code from.
	 */
	fun getShaderSource(shader: WebGLShader,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getSupportedExtensions()</code></strong> method returns a list of all the supported <a href="/en-US/docs/Web/API/WebGL_API">WebGL</a> extensions.</p>
	 *
	 */
	fun getSupportedExtensions(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getTexParameter()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns information about the given texture.</p>
	 *
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the information to query. Possible values:
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
	 */
	fun getTexParameter(pname: GLenum,target: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getUniform()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns the value of a uniform variable at a given location.</p>
	 *
	 * @param location A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to get.
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> containing the uniform attribute.
	 */
	fun getUniform(location: WebGLUniformLocation,program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>Part of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a>, the <a href="/en-US/docs/Web/API/WebGLRenderingContext"><code>WebGLRenderingContext</code></a> method <strong><code>getUniformLocation()</code></strong> returns the location of a specific <strong>uniform</strong> variable which is part of a given <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.</p>
<p>The uniform variable is returned as a <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object, which is an opaque identifier used to specify where in the GPU's memory that uniform variable is located.</p>
<p>Once you have the uniform's location, you can access the uniform itself using one of the other uniform access methods, passing in the uniform location as one of the inputs:</p>
<ul>
 <li><a href="/en-US/docs/Web/API/WebGLRenderingContext/getUniform" title="getUniform()"><code>getUniform()</code></a>
  <ul>
   <li>: Returns the value of the uniform at the given location.</li>
  </ul><!-- markdownlint-disable MD052 -- text in code block is misidentified as image --></li>
 <li><a href="/en-US/docs/Web/API/WebGLRenderingContext/uniform"><code>WebGLRenderingContext.uniform[1234][fi][v]()</code></a>
  <ul>
   <li>: Sets the uniform's value to the specified value, which may be a single floating point or integer number, or a 2-4 component vector specified either as a list of values or as a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> or <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array"><code>Int32Array</code></a>.<!-- markdownlint-disable MD052 — text in code block is misidentified as image --></li>
  </ul></li>
 <li><a href="/en-US/docs/Web/API/WebGLRenderingContext/uniformMatrix"><code>WebGLRenderingContext.uniformMatrix[234][fv]()</code></a>
  <ul>
   <li>: Sets the uniform's value to the specified matrix, possibly with transposition. The value is represented as a sequence of <code>GLfloat</code> values or as a <code>Float32Array</code>.</li>
  </ul></li>
</ul>
<p>The uniform itself is declared in the shader program using GLSL.</p>
	 *
	 * @param name A string specifying the name of the uniform variable whose location is to be returned. The name can't have any whitespace in it, and you can't use this function to get the location of any uniforms starting with the reserved string <code>"gl_"</code>, since those are internal to the WebGL layer.
The possible values correspond to the uniform names returned by <a href="/en-US/docs/Web/API/WebGLRenderingContext/getActiveUniform" title="getActiveUniform"><code>getActiveUniform</code></a>; see that function for specifics on how declared uniforms map to uniform location names.
Additionally, for uniforms declared as arrays, the following names are also valid:
	 * @param program The <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> in which to locate the specified uniform variable.
	 */
	fun getUniformLocation(name: getActiveUniform,program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getVertexAttrib()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns information about a vertex attribute at a given position.</p>
	 *
	 * @param ext.vertex_attrib_array_divisor_angle Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> describing the frequency divisor used for instanced rendering.
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the vertex attribute.
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the information to query. Possible values:
Returns the currently bound <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a>.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> that is <code>true</code> if the vertex attribute is enabled at this <code>index</code>. Otherwise <code>false</code>.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the size of an element of the vertex array.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of bytes between successive elements in the array. 0 means that the elements are sequential.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> representing the array type. One of
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> that is true if fixed-point data types are normalized for the vertex attribute array at the given <code>index</code>.
Returns a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> (with 4 elements) representing the current value of the vertex attribute at the given <code>index</code>.
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether an integer data type is in the vertex attribute array at the given <code>index</code>.
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> describing the frequency divisor used for instanced rendering.
When using the <a href="/en-US/docs/Web/API/ANGLE_instanced_arrays"><code>ANGLE_instanced_arrays</code></a> extension:
Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> describing the frequency divisor used for instanced rendering.
	 */
	fun getVertexAttrib(ext.vertex_attrib_array_divisor_angle: GLint,index: GLuint,pname: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.getVertexAttribOffset()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns the address of a specified vertex attribute.</p>
	 *
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the vertex attribute.
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> which must be <code>gl.VERTEX_ATTRIB_ARRAY_POINTER</code>.
	 */
	fun getVertexAttribOffset(index: GLuint,pname: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.hint()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies hints for certain behaviors. The interpretation of these hints depend on the implementation.</p>
	 *
	 * @param ext.fragment_shader_derivative_hint_oes Accuracy of the derivative calculation for the GLSL built-in functions: <code>dFdx</code>, <code>dFdy</code>, and <code>fwidth</code>.
	 * @param mode Sets the behavior. The default value is <code>gl.DONT_CARE</code>. The possible values are:
	 * @param target Sets which behavior to be controlled. Possible values:
Quality of filtering when generating mipmap images with <a href="/en-US/docs/Web/API/WebGLRenderingContext/generateMipmap"><code>WebGLRenderingContext.generateMipmap()</code></a>.
When using the <a href="/en-US/docs/Web/API/OES_standard_derivatives"><code>OES_standard_derivatives</code></a> extension:
Accuracy of the derivative calculation for the GLSL built-in functions: <code>dFdx</code>, <code>dFdy</code>, and <code>fwidth</code>.
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
Same as <code>ext.FRAGMENT_SHADER_DERIVATIVE_HINT_OES</code>
	 */
	fun hint(ext.fragment_shader_derivative_hint_oes: ,mode: ,target: WebGL 2 context,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.isBuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns <code>true</code> if the passed <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a> is valid and <code>false</code> otherwise.</p>
	 *
	 * @param buffer A <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a> to check.
	 */
	fun isBuffer(buffer: WebGLBuffer,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.isContextLost()</code></strong> method returns a boolean value indicating whether or not the WebGL context has been lost and must be re-established before rendering can resume.</p>
	 *
	 */
	fun isContextLost(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.isEnabled()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> tests whether a specific WebGL capability is enabled or not for this context.</p>
<p>By default, all capabilities except <code>gl.DITHER</code> are <strong>disabled</strong>.</p>
	 *
	 * @param cap A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which WebGL capability to test. Possible values:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
	 */
	fun isEnabled(cap: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.isFramebuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns <code>true</code> if the passed <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> is valid and <code>false</code> otherwise.</p>
	 *
	 * @param framebuffer A <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> to check.
	 */
	fun isFramebuffer(framebuffer: WebGLFramebuffer,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.isProgram()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns <code>true</code> if the passed <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> is valid, <code>false</code> otherwise.</p>
	 *
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> to check.
	 */
	fun isProgram(program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.isRenderbuffer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns <code>true</code> if the passed <a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> is valid and <code>false</code> otherwise.</p>
	 *
	 * @param renderbuffer A <a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> to check.
	 */
	fun isRenderbuffer(renderbuffer: WebGLRenderbuffer,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.isShader()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns <code>true</code> if the passed <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> is valid, <code>false</code> otherwise.</p>
	 *
	 * @param shader A <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> to check.
	 */
	fun isShader(shader: WebGLShader,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.isTexture()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> returns <code>true</code> if the passed <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> is valid and <code>false</code> otherwise.</p>
	 *
	 * @param texture A <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> to check.
	 */
	fun isTexture(texture: WebGLTexture,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.lineWidth()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> sets the line width of rasterized lines.</p>
<div class="notecard warning" id="sect1">
 <p><strong>Warning:</strong> The webgl spec, based on the OpenGL ES 2.0/3.0 specs points out that the minimum and maximum width for a line is implementation defined. The maximum minimum width is allowed to be 1.0. The minimum maximum width is also allowed to be 1.0. Because of these implementation defined limits it is not recommended to use line widths other than 1.0 since there is no guarantee any user's browser will display any other width.</p>
 <p>As of January 2017 most implementations of WebGL only support a minimum of 1 and a maximum of 1 as the technology they are based on has these same limits.</p>
</div>
	 *
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> specifying the width of rasterized lines. Default value: 1.
	 */
	fun lineWidth(width: GLfloat,): Unit // return type, 
	
	/**
	 * <p>The <a href="/en-US/docs/Web/API/WebGLRenderingContext"><code>WebGLRenderingContext</code></a> interface's <strong><code>linkProgram()</code></strong> method links a given <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>, completing the process of preparing the GPU code for the program's fragment and vertex shaders.</p>
	 *
	 * @param program The <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> to link.
	 */
	fun linkProgram(program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>The <a href="/en-US/docs/Web/API/WebGLRenderingContext"><code>WebGLRenderingContext</code></a> method <strong><code>makeXRCompatible()</code></strong> ensures that the rendering context described by the <code>WebGLRenderingContext</code> is ready to render the scene for the immersive <a href="/en-US/docs/Web/API/WebXR_Device_API">WebXR</a> device on which it will be displayed. If necessary, the <a href="/en-US/docs/Web/API/WebGL_API">WebGL</a> layer may reconfigure the context to be ready to render to a different device than it originally was.</p>
<p>This is useful if you have an application which can start out being presented on a standard 2D display but can then be transitioned to a 3D immersion system.</p>
	 *
	 */
	fun makeXRCompatible(): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.pixelStorei()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies the pixel storage modes.</p>
	 *
	 * @param param A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying a value to set the <code>pname</code> parameter to. See below for possible values.
	 * @param pname A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which parameter to set. See below for possible values.
	 */
	fun pixelStorei(param: GLint,pname: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.polygonOffset()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies the scale factors and units to calculate depth values.</p>
<p>The offset is added before the depth test is performed and before the value is written into the depth buffer.</p>
	 *
	 * @param factor A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> which sets the scale factor for the variable depth offset for each polygon. The default value is 0.
	 * @param units A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> which sets the multiplier by which an implementation-specific value is multiplied with to create a constant depth offset. The default value is 0.
	 */
	fun polygonOffset(factor: GLfloat,units: GLfloat,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.readPixels()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> reads a block of pixels from a specified rectangle of the current color framebuffer into a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a> object.</p>
	 *
	 * @param dstoffset Offset. Defaults to 0.
	 * @param format A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the format of the pixel data. Possible values:
Discards the red, green and blue components and reads the alpha component.
Discards the alpha components and reads the red, green and blue components.
Red, green, blue and alpha components are read from the color buffer.
WebGL2 adds
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the rectangle.
	 * @param pixels An object to read data into. The array type must match the type of the <code>type</code> parameter:
	 * @param type A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the data type of the pixel data. Possible values:
WebGL2 adds
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the rectangle.
	 * @param x A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the first horizontal pixel that is read from the lower left corner of a rectangular block of pixels.
	 * @param y A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the first vertical pixel that is read from the lower left corner of a rectangular block of pixels.
	 */
	fun readPixels(dstoffset: ,format: GLenum,height: GLsizei,pixels: Uint8Array,type: GLenum,width: GLsizei,x: GLint,y: GLint,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.renderbufferStorage()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> creates and initializes a renderbuffer object's data store.</p>
	 *
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the renderbuffer in pixels.
	 * @param internalformat A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the internal format of the renderbuffer. Possible values:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
When using the <a href="/en-US/docs/Web/API/WEBGL_color_buffer_float"><code>WEBGL_color_buffer_float</code></a> extension:
When using the <a href="/en-US/docs/Web/API/EXT_sRGB"><code>EXT_sRGB</code></a> extension:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a> and the <a href="/en-US/docs/Web/API/EXT_color_buffer_float"><code>EXT_color_buffer_float</code></a> extension:
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target renderbuffer object. Possible values:
Buffer data storage for single images in a renderable internal format.
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the renderbuffer in pixels.
	 */
	fun renderbufferStorage(height: GLsizei,internalformat: GLenum,target: GLenum,width: GLsizei,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.sampleCoverage()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies multi-sample coverage parameters for anti-aliasing effects.</p>
	 *
	 * @param invert A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> which sets whether or not the coverage masks should be inverted. The default value is <code>false</code>.
	 * @param value A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> which sets a single floating-point coverage value clamped to the range [0,1]. The default value is 1.0.
	 */
	fun sampleCoverage(invert: GLboolean,value: GLclampf,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.scissor()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> sets a scissor box, which limits the drawing to a specified rectangle.</p>
	 *
	 * @param height A non-negative <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the scissor box. Default value: height of the canvas.
	 * @param width A non-negative <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the scissor box. Default value: width of the canvas.
	 * @param x A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the horizontal coordinate for the lower left corner of the box. Default value: 0.
	 * @param y A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the vertical coordinate for the lower left corner of the box. Default value: 0.
	 */
	fun scissor(height: GLsizei,width: GLsizei,x: GLint,y: GLint,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.shaderSource()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> sets the source code of a <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a>.</p>
	 *
	 * @param shader A <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> object in which to set the source code.
	 * @param source A string containing the GLSL source code to set.
	 */
	fun shaderSource(shader: WebGLShader,source: ,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.stencilFunc()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> sets the front and back function and reference value for stencil testing.</p>
<p>Stenciling enables and disables drawing on a per-pixel basis. It is typically used in multipass rendering to achieve special effects.</p>
	 *
	 * @param func A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the test function. The default function is <code>gl.ALWAYS</code>. The possible values are:
	 * @param mask A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying a bit-wise mask that is used to AND the reference value and the stored stencil value when the test is done. The default value is all 1.
	 * @param ref A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the reference value for the stencil test. This value is clamped to the range 0 to 2^n - 1 where n is the number of bitplanes in the stencil buffer. The default value is 0.
	 */
	fun stencilFunc(func: GLenum,mask: GLuint,ref: GLint,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.stencilFuncSeparate()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> sets the front and/or back function and reference value for stencil testing.</p>
<p>Stencilling enables and disables drawing on a per-pixel basis. It is typically used in multipass rendering to achieve special effects.</p>
	 *
	 * @param face A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying whether the front and/or back stencil state is updated. The possible values are:
	 * @param func A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the test function. The default function is <code>gl.ALWAYS</code>. The possible values are:
	 * @param mask A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying a bit-wise mask that is used to AND the reference value and the stored stencil value when the test is done. The default value is all 1.
	 * @param ref A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the reference value for the stencil test. This value is clamped to the range 0 to 2^n - 1 where n is the number of bitplanes in the stencil buffer. The default value is 0.
	 */
	fun stencilFuncSeparate(face: GLenum,func: GLenum,mask: GLuint,ref: GLint,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.stencilMask()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> controls enabling and disabling of both the front and back writing of individual bits in the stencil planes.</p>
<p>The <a href="/en-US/docs/Web/API/WebGLRenderingContext/stencilMaskSeparate"><code>WebGLRenderingContext.stencilMaskSeparate()</code></a> method can set front and back stencil writemasks to different values.</p>
	 *
	 * @param mask A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying a bit mask to enable or disable writing of individual bits in the stencil planes. By default, the mask is all 1.
	 */
	fun stencilMask(mask: GLuint,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.stencilMaskSeparate()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> controls enabling and disabling of front and/or back writing of individual bits in the stencil planes.</p>
<p>The <a href="/en-US/docs/Web/API/WebGLRenderingContext/stencilMask"><code>WebGLRenderingContext.stencilMask()</code></a> method can set both, the front and back stencil writemasks to one value at the same time.</p>
	 *
	 * @param face A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying whether the front and/or back stencil writemask is updated. The possible values are:
	 * @param mask A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying a bit mask to enable or disable writing of individual bits in the stencil planes. By default, the mask is all 1.
	 */
	fun stencilMaskSeparate(face: GLenum,mask: GLuint,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.stencilOp()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> sets both the front and back-facing stencil test actions.</p>
	 *
	 * @param fail A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the function to use when the stencil test fails. The default value is <code>gl.KEEP</code>.
	 * @param zfail A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the function to use when the stencil test passes, but the depth test fails. The default value is <code>gl.KEEP</code>.
	 * @param zpass A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the function to use when both the stencil test and the depth test pass, or when the stencil test passes and there is no depth buffer or depth testing is disabled. The default value is <code>gl.KEEP</code>.
	 */
	fun stencilOp(fail: GLenum,zfail: GLenum,zpass: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.stencilOpSeparate()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> sets the front and/or back-facing stencil test actions.</p>
	 *
	 * @param face A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying whether the front and/or back stencil state is updated. The possible values are:
	 * @param fail A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the function to use when the stencil test fails. The default value is <code>gl.KEEP</code>.
	 * @param zfail A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the function to use when the stencil test passes, but the depth test fails. The default value is <code>gl.KEEP</code>.
	 * @param zpass A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the function to use when both the stencil test and the depth test pass, or when the stencil test passes and there is no depth buffer or depth testing is disabled. The default value is <code>gl.KEEP</code>.
	 */
	fun stencilOpSeparate(face: GLenum,fail: GLenum,zfail: GLenum,zpass: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.texImage2D()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies a two-dimensional texture image.</p>
	 *
	 * @param border A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the width of the border. Must be 0.
	 * @param format A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the format of the texel data. In WebGL 1, this must be the same as <code>internalformat</code> (see above). in WebGL 2, the combinations are listed in <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE" class="external" target="_blank">this table</a>.
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the texture.
	 * @param internalformat A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the color components in the texture.
Possible values in both WebGL1 and WebGL2
Other possible values in WebGL2 for the versions of <code>texImage2D</code> that take a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a>, or a <code>GLintptr offset</code>
Possible values in WebGL2 for the versions of <code>texImage2D</code> that take a texture an <code>HTMLImageElement</code>, <code>HTMLCanvasElement</code>, <code>HTMLVideoElement</code>, <code>ImageBitmap</code>, or <code>ImageData</code>
When using the <a href="/en-US/docs/Web/API/WEBGL_depth_texture"><code>WEBGL_depth_texture</code></a> extension:
When using the <a href="/en-US/docs/Web/API/EXT_sRGB"><code>EXT_sRGB</code></a> extension:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
	 * @param level A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.
	 * @param offset (WebGL 2 only) A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> byte offset into the <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a>'s data store. Used to upload data to the currently bound <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> from the <code>WebGLBuffer</code> bound to the <code>PIXEL_UNPACK_BUFFER</code> target.
	 * @param pixels The following types can always be used as a pixel source for the texture:
The following types can only be used as a pixel source when <code>width</code>, <code>height</code>, and <code>border</code> are specified:
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:
	 * @param type A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the data type of the texel data. Possible values:
When using the <a href="/en-US/docs/Web/API/WEBGL_depth_texture"><code>WEBGL_depth_texture</code></a> extension:
When using the <a href="/en-US/docs/Web/API/OES_texture_half_float"><code>OES_texture_half_float</code></a> extension:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the texture.
	 */
	fun texImage2D(border: GLint,format: GLenum,height: GLsizei,internalformat: GLenum,level: GLint,offset: GLintptr,pixels: ImageData,target: GLenum,type: GLenum,width: GLsizei,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.texParameter[fi]()</code></strong> methods of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> set texture parameters.</p>
	 *
	 * @param param The <code>param</code> parameter is a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> or <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the value for the specified parameter
	 * @param pname The <code>pname</code> parameter is a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture parameter to set.
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
	 */
	fun texParameter(param: GLfloat,pname: GLenum,target: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.texSubImage2D()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specifies a sub-rectangle of the current texture.</p>
	 *
	 * @param format A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the format of the texel data. Possible values:
When using the <a href="/en-US/docs/Web/API/EXT_sRGB"><code>EXT_sRGB</code></a> extension:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
	 * @param height A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the texture in texels.
	 * @param level A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.
	 * @param offset (WebGL 2 only) A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> byte offset into the <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a>'s data store. Used to upload data to the currently bound <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> from the <code>WebGLBuffer</code> bound to the <code>PIXEL_UNPACK_BUFFER</code> target.
	 * @param pixels One of the following objects can be used as a pixel source for the texture:
	 * @param target A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:
	 * @param type A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the data type of the texel data. Possible values:
When using the <a href="/en-US/docs/Web/API/OES_texture_float"><code>OES_texture_float</code></a> extension:
When using the <a href="/en-US/docs/Web/API/OES_texture_half_float"><code>OES_texture_half_float</code></a> extension:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
	 * @param width A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the texture in texels.
	 * @param xoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the lower left texel x coordinate of a width-wide by height-wide rectangular subregion of the texture array.
	 * @param yoffset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the lower left texel y coordinate of a width-wide by height-wide rectangular subregion of the texture array.
	 */
	fun texSubImage2D(format: GLenum,height: GLsizei,level: GLint,offset: GLintptr,pixels: Uint8Array,target: GLenum,type: GLenum,width: GLsizei,xoffset: GLint,yoffset: GLint,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.uniform[1234][fi][v]()</code></strong> methods of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0.</p>
<div class="notecard note" id="sect1">
 <p><strong>Note:</strong> Many of the functions described here have expanded WebGL 2 interfaces, which can be found under <a href="/en-US/docs/Web/API/WebGL2RenderingContext/uniform"><code>WebGL2RenderingContext.uniform[1234][uif][v]()</code></a>.</p>
</div>
	 *
	 * @param location A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.
	 * @param value_v0_v1_v2_v3 A new value to be used for the uniform variable. Possible types:
	 */
	fun uniform(location: WebGLUniformLocation,value_v0_v1_v2_v3: Number,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.uniformMatrix[234]fv()</code></strong> methods of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specify matrix values for uniform variables.</p>
<p>The three versions of this method (<code>uniformMatrix2fv()</code>, <code>uniformMatrix3fv()</code>, and <code>uniformMatrix4fv()</code>) take as the input value 2-component, 3-component, and 4-component square matrices, respectively. They are expected to have 4, 9 or 16 floats.</p>
	 *
	 * @param location A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify. The location is obtained using <a href="/en-US/docs/Web/API/WebGLRenderingContext/getUniformLocation" title="getUniformLocation()"><code>getUniformLocation()</code></a>.
	 * @param transpose A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether to transpose the matrix. Must be <code>false</code>.
	 * @param value A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> or sequence of <code>GLfloat</code> values. The values are assumed to be supplied in column major order.
	 */
	fun uniformMatrix(location: getUniformLocation(),transpose: GLboolean,value: Float32Array,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.useProgram()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> sets the specified <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> as part of the current rendering state.</p>
	 *
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> to use.
	 */
	fun useProgram(program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.validateProgram()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> validates a <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>. It checks if it is successfully linked and if it can be used in the current WebGL state.</p>
	 *
	 * @param program A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> to validate.
	 */
	fun validateProgram(program: WebGLProgram,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.vertexAttrib[1234]f[v]()</code></strong> methods of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> specify constant values for generic vertex attributes.</p>
	 *
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.
	 * @param v0_v1_v2_v3 A floating point <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number"><code>Number</code></a> for the vertex attribute value.
	 * @param value A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> for floating point vector vertex attribute values.
	 */
	fun vertexAttrib(index: GLuint,v0_v1_v2_v3: Number,value: Float32Array,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.vertexAttribPointer()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> binds the buffer currently bound to <code>gl.ARRAY_BUFFER</code> to a generic vertex attribute of the current vertex buffer object and specifies its layout.</p>
	 *
	 * @param index A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the vertex attribute that is to be modified.
	 * @param normalized A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether integer data values should be normalized into a certain range when being cast to a float.
	 * @param offset A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying an offset in bytes of the first component in the vertex attribute array. Must be a multiple of the byte length of <code>type</code>.
	 * @param size A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the number of components per vertex attribute. Must be 1, 2, 3, or 4.
	 * @param stride A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the offset in bytes between the beginning of consecutive vertex attributes. Cannot be negative or larger than 255. If stride is 0, the attribute is assumed to be tightly packed, that is, the attributes are not interleaved but each attribute is in a separate block, and the next vertex' attribute follows immediately after the current vertex.
	 * @param type A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the data type of each component in the array. Possible values:
When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:
	 */
	fun vertexAttribPointer(index: GLuint,normalized: GLboolean,offset: GLintptr,size: GLint,stride: GLsizei,type: GLenum,): Unit // return type, 
	
	/**
	 * <p>The <strong><code>WebGLRenderingContext.viewport()</code></strong> method of the <a href="/en-US/docs/Web/API/WebGL_API">WebGL API</a> sets the viewport, which specifies the affine transformation of x and y from normalized device coordinates to window coordinates.</p>
	 *
	 * @param height A non-negative <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the viewport. Default value: height of the canvas.
	 * @param width A non-negative <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the viewport. Default value: width of the canvas.
	 * @param x A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the horizontal coordinate for the lower left corner of the viewport origin. Default value: 0.
	 * @param y A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the vertical coordinate for the lower left corner of the viewport origin. Default value: 0.
	 */
	fun viewport(height: GLsizei,width: GLsizei,x: GLint,y: GLint,): Unit // return type, 
	
}

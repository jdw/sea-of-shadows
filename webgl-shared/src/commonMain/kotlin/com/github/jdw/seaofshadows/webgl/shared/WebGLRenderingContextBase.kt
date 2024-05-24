package com.github.jdw.seaofshadows.webgl.shared


/**
 * hej
 */
interface WebGLRenderingContextBase {
	val canvas: HTMLCanvasElement
	val drawingBufferWidth: GLsizei
	val drawingBufferHeight: GLsizei
	
	
	companion object {
		val DEPTH_BUFFER_BIT: GLenum = 0x00000100UL
		val STENCIL_BUFFER_BIT: GLenum = 0x00000400UL
		val COLOR_BUFFER_BIT: GLenum = 0x00004000UL
		val POINTS: GLenum = 0x0000UL
		val LINES: GLenum = 0x0001UL
		val LINE_LOOP: GLenum = 0x0002UL
		val LINE_STRIP: GLenum = 0x0003UL
		val TRIANGLES: GLenum = 0x0004UL
		val TRIANGLE_STRIP: GLenum = 0x0005UL
		val TRIANGLE_FAN: GLenum = 0x0006UL
		val ZERO: GLenum = 0UL
		val ONE: GLenum = 1UL
		val SRC_COLOR: GLenum = 0x0300UL
		val ONE_MINUS_SRC_COLOR: GLenum = 0x0301UL
		val SRC_ALPHA: GLenum = 0x0302UL
		val ONE_MINUS_SRC_ALPHA: GLenum = 0x0303UL
		val DST_ALPHA: GLenum = 0x0304UL
		val ONE_MINUS_DST_ALPHA: GLenum = 0x0305UL
		val DST_COLOR: GLenum = 0x0306UL
		val ONE_MINUS_DST_COLOR: GLenum = 0x0307UL
		val SRC_ALPHA_SATURATE: GLenum = 0x0308UL
		val FUNC_ADD: GLenum = 0x8006UL
		val BLEND_EQUATION: GLenum = 0x8009UL
		val BLEND_EQUATION_RGB: GLenum = 0x8009UL
		val BLEND_EQUATION_ALPHA: GLenum = 0x883DUL
		val FUNC_SUBTRACT: GLenum = 0x800AUL
		val FUNC_REVERSE_SUBTRACT: GLenum = 0x800BUL
		val BLEND_DST_RGB: GLenum = 0x80C8UL
		val BLEND_SRC_RGB: GLenum = 0x80C9UL
		val BLEND_DST_ALPHA: GLenum = 0x80CAUL
		val BLEND_SRC_ALPHA: GLenum = 0x80CBUL
		val CONSTANT_COLOR: GLenum = 0x8001UL
		val ONE_MINUS_CONSTANT_COLOR: GLenum = 0x8002UL
		val CONSTANT_ALPHA: GLenum = 0x8003UL
		val ONE_MINUS_CONSTANT_ALPHA: GLenum = 0x8004UL
		val BLEND_COLOR: GLenum = 0x8005UL
		val ARRAY_BUFFER: GLenum = 0x8892UL
		val ELEMENT_ARRAY_BUFFER: GLenum = 0x8893UL
		val ARRAY_BUFFER_BINDING: GLenum = 0x8894UL
		val ELEMENT_ARRAY_BUFFER_BINDING: GLenum = 0x8895UL
		val STREAM_DRAW: GLenum = 0x88E0UL
		val STATIC_DRAW: GLenum = 0x88E4UL
		val DYNAMIC_DRAW: GLenum = 0x88E8UL
		val BUFFER_SIZE: GLenum = 0x8764UL
		val BUFFER_USAGE: GLenum = 0x8765UL
		val CURRENT_VERTEX_ATTRIB: GLenum = 0x8626UL
		val FRONT: GLenum = 0x0404UL
		val BACK: GLenum = 0x0405UL
		val FRONT_AND_BACK: GLenum = 0x0408UL
		val CULL_FACE: GLenum = 0x0B44UL
		val BLEND: GLenum = 0x0BE2UL
		val DITHER: GLenum = 0x0BD0UL
		val STENCIL_TEST: GLenum = 0x0B90UL
		val DEPTH_TEST: GLenum = 0x0B71UL
		val SCISSOR_TEST: GLenum = 0x0C11UL
		val POLYGON_OFFSET_FILL: GLenum = 0x8037UL
		val SAMPLE_ALPHA_TO_COVERAGE: GLenum = 0x809EUL
		val SAMPLE_COVERAGE: GLenum = 0x80A0UL
		val NO_ERROR: GLenum = 0UL
		val INVALID_ENUM: GLenum = 0x0500UL
		val INVALID_VALUE: GLenum = 0x0501UL
		val INVALID_OPERATION: GLenum = 0x0502UL
		val OUT_OF_MEMORY: GLenum = 0x0505UL
		val CW: GLenum = 0x0900UL
		val CCW: GLenum = 0x0901UL
		val LINE_WIDTH: GLenum = 0x0B21UL
		val ALIASED_POINT_SIZE_RANGE: GLenum = 0x846DUL
		val ALIASED_LINE_WIDTH_RANGE: GLenum = 0x846EUL
		val CULL_FACE_MODE: GLenum = 0x0B45UL
		val FRONT_FACE: GLenum = 0x0B46UL
		val DEPTH_RANGE: GLenum = 0x0B70UL
		val DEPTH_WRITEMASK: GLenum = 0x0B72UL
		val DEPTH_CLEAR_VALUE: GLenum = 0x0B73UL
		val DEPTH_FUNC: GLenum = 0x0B74UL
		val STENCIL_CLEAR_VALUE: GLenum = 0x0B91UL
		val STENCIL_FUNC: GLenum = 0x0B92UL
		val STENCIL_FAIL: GLenum = 0x0B94UL
		val STENCIL_PASS_DEPTH_FAIL: GLenum = 0x0B95UL
		val STENCIL_PASS_DEPTH_PASS: GLenum = 0x0B96UL
		val STENCIL_REF: GLenum = 0x0B97UL
		val STENCIL_VALUE_MASK: GLenum = 0x0B93UL
		val STENCIL_WRITEMASK: GLenum = 0x0B98UL
		val STENCIL_BACK_FUNC: GLenum = 0x8800UL
		val STENCIL_BACK_FAIL: GLenum = 0x8801UL
		val STENCIL_BACK_PASS_DEPTH_FAIL: GLenum = 0x8802UL
		val STENCIL_BACK_PASS_DEPTH_PASS: GLenum = 0x8803UL
		val STENCIL_BACK_REF: GLenum = 0x8CA3UL
		val STENCIL_BACK_VALUE_MASK: GLenum = 0x8CA4UL
		val STENCIL_BACK_WRITEMASK: GLenum = 0x8CA5UL
		val VIEWPORT: GLenum = 0x0BA2UL
		val SCISSOR_BOX: GLenum = 0x0C10UL
		val COLOR_CLEAR_VALUE: GLenum = 0x0C22UL
		val COLOR_WRITEMASK: GLenum = 0x0C23UL
		val UNPACK_ALIGNMENT: GLenum = 0x0CF5UL
		val PACK_ALIGNMENT: GLenum = 0x0D05UL
		val MAX_TEXTURE_SIZE: GLenum = 0x0D33UL
		val MAX_VIEWPORT_DIMS: GLenum = 0x0D3AUL
		val SUBPIXEL_BITS: GLenum = 0x0D50UL
		val RED_BITS: GLenum = 0x0D52UL
		val GREEN_BITS: GLenum = 0x0D53UL
		val BLUE_BITS: GLenum = 0x0D54UL
		val ALPHA_BITS: GLenum = 0x0D55UL
		val DEPTH_BITS: GLenum = 0x0D56UL
		val STENCIL_BITS: GLenum = 0x0D57UL
		val POLYGON_OFFSET_UNITS: GLenum = 0x2A00UL
		val POLYGON_OFFSET_FACTOR: GLenum = 0x8038UL
		val TEXTURE_BINDING_2D: GLenum = 0x8069UL
		val SAMPLE_BUFFERS: GLenum = 0x80A8UL
		val SAMPLES: GLenum = 0x80A9UL
		val SAMPLE_COVERAGE_VALUE: GLenum = 0x80AAUL
		val SAMPLE_COVERAGE_INVERT: GLenum = 0x80ABUL
		val COMPRESSED_TEXTURE_FORMATS: GLenum = 0x86A3UL
		val DONT_CARE: GLenum = 0x1100UL
		val FASTEST: GLenum = 0x1101UL
		val NICEST: GLenum = 0x1102UL
		val GENERATE_MIPMAP_HINT: GLenum = 0x8192UL
		val BYTE: GLenum = 0x1400UL
		val UNSIGNED_BYTE: GLenum = 0x1401UL
		val SHORT: GLenum = 0x1402UL
		val UNSIGNED_SHORT: GLenum = 0x1403UL
		val INT: GLenum = 0x1404UL
		val UNSIGNED_INT: GLenum = 0x1405UL
		val FLOAT: GLenum = 0x1406UL
		val DEPTH_COMPONENT: GLenum = 0x1902UL
		val ALPHA: GLenum = 0x1906UL
		val RGB: GLenum = 0x1907UL
		val RGBA: GLenum = 0x1908UL
		val LUMINANCE: GLenum = 0x1909UL
		val LUMINANCE_ALPHA: GLenum = 0x190AUL
		val UNSIGNED_SHORT_4_4_4_4: GLenum = 0x8033UL
		val UNSIGNED_SHORT_5_5_5_1: GLenum = 0x8034UL
		val UNSIGNED_SHORT_5_6_5: GLenum = 0x8363UL
		val FRAGMENT_SHADER: GLenum = 0x8B30UL
		val VERTEX_SHADER: GLenum = 0x8B31UL
		val MAX_VERTEX_ATTRIBS: GLenum = 0x8869UL
		val MAX_VERTEX_UNIFORM_VECTORS: GLenum = 0x8DFBUL
		val MAX_VARYING_VECTORS: GLenum = 0x8DFCUL
		val MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum = 0x8B4DUL
		val MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum = 0x8B4CUL
		val MAX_TEXTURE_IMAGE_UNITS: GLenum = 0x8872UL
		val MAX_FRAGMENT_UNIFORM_VECTORS: GLenum = 0x8DFDUL
		val SHADER_TYPE: GLenum = 0x8B4FUL
		val DELETE_STATUS: GLenum = 0x8B80UL
		val LINK_STATUS: GLenum = 0x8B82UL
		val VALIDATE_STATUS: GLenum = 0x8B83UL
		val ATTACHED_SHADERS: GLenum = 0x8B85UL
		val ACTIVE_UNIFORMS: GLenum = 0x8B86UL
		val ACTIVE_ATTRIBUTES: GLenum = 0x8B89UL
		val SHADING_LANGUAGE_VERSION: GLenum = 0x8B8CUL
		val CURRENT_PROGRAM: GLenum = 0x8B8DUL
		val NEVER: GLenum = 0x0200UL
		val LESS: GLenum = 0x0201UL
		val EQUAL: GLenum = 0x0202UL
		val LEQUAL: GLenum = 0x0203UL
		val GREATER: GLenum = 0x0204UL
		val NOTEQUAL: GLenum = 0x0205UL
		val GEQUAL: GLenum = 0x0206UL
		val ALWAYS: GLenum = 0x0207UL
		val KEEP: GLenum = 0x1E00UL
		val REPLACE: GLenum = 0x1E01UL
		val INCR: GLenum = 0x1E02UL
		val DECR: GLenum = 0x1E03UL
		val INVERT: GLenum = 0x150AUL
		val INCR_WRAP: GLenum = 0x8507UL
		val DECR_WRAP: GLenum = 0x8508UL
		val VENDOR: GLenum = 0x1F00UL
		val RENDERER: GLenum = 0x1F01UL
		val VERSION: GLenum = 0x1F02UL
		val NEAREST: GLenum = 0x2600UL
		val LINEAR: GLenum = 0x2601UL
		val NEAREST_MIPMAP_NEAREST: GLenum = 0x2700UL
		val LINEAR_MIPMAP_NEAREST: GLenum = 0x2701UL
		val NEAREST_MIPMAP_LINEAR: GLenum = 0x2702UL
		val LINEAR_MIPMAP_LINEAR: GLenum = 0x2703UL
		val TEXTURE_MAG_FILTER: GLenum = 0x2800UL
		val TEXTURE_MIN_FILTER: GLenum = 0x2801UL
		val TEXTURE_WRAP_S: GLenum = 0x2802UL
		val TEXTURE_WRAP_T: GLenum = 0x2803UL
		val TEXTURE_2D: GLenum = 0x0DE1UL
		val TEXTURE: GLenum = 0x1702UL
		val TEXTURE_CUBE_MAP: GLenum = 0x8513UL
		val TEXTURE_BINDING_CUBE_MAP: GLenum = 0x8514UL
		val TEXTURE_CUBE_MAP_POSITIVE_X: GLenum = 0x8515UL
		val TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum = 0x8516UL
		val TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum = 0x8517UL
		val TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum = 0x8518UL
		val TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum = 0x8519UL
		val TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum = 0x851AUL
		val MAX_CUBE_MAP_TEXTURE_SIZE: GLenum = 0x851CUL
		val TEXTURE0: GLenum = 0x84C0UL
		val TEXTURE1: GLenum = 0x84C1UL
		val TEXTURE2: GLenum = 0x84C2UL
		val TEXTURE3: GLenum = 0x84C3UL
		val TEXTURE4: GLenum = 0x84C4UL
		val TEXTURE5: GLenum = 0x84C5UL
		val TEXTURE6: GLenum = 0x84C6UL
		val TEXTURE7: GLenum = 0x84C7UL
		val TEXTURE8: GLenum = 0x84C8UL
		val TEXTURE9: GLenum = 0x84C9UL
		val TEXTURE10: GLenum = 0x84CAUL
		val TEXTURE11: GLenum = 0x84CBUL
		val TEXTURE12: GLenum = 0x84CCUL
		val TEXTURE13: GLenum = 0x84CDUL
		val TEXTURE14: GLenum = 0x84CEUL
		val TEXTURE15: GLenum = 0x84CFUL
		val TEXTURE16: GLenum = 0x84D0UL
		val TEXTURE17: GLenum = 0x84D1UL
		val TEXTURE18: GLenum = 0x84D2UL
		val TEXTURE19: GLenum = 0x84D3UL
		val TEXTURE20: GLenum = 0x84D4UL
		val TEXTURE21: GLenum = 0x84D5UL
		val TEXTURE22: GLenum = 0x84D6UL
		val TEXTURE23: GLenum = 0x84D7UL
		val TEXTURE24: GLenum = 0x84D8UL
		val TEXTURE25: GLenum = 0x84D9UL
		val TEXTURE26: GLenum = 0x84DAUL
		val TEXTURE27: GLenum = 0x84DBUL
		val TEXTURE28: GLenum = 0x84DCUL
		val TEXTURE29: GLenum = 0x84DDUL
		val TEXTURE30: GLenum = 0x84DEUL
		val TEXTURE31: GLenum = 0x84DFUL
		val ACTIVE_TEXTURE: GLenum = 0x84E0UL
		val REPEAT: GLenum = 0x2901UL
		val CLAMP_TO_EDGE: GLenum = 0x812FUL
		val MIRRORED_REPEAT: GLenum = 0x8370UL
		val FLOAT_VEC2: GLenum = 0x8B50UL
		val FLOAT_VEC3: GLenum = 0x8B51UL
		val FLOAT_VEC4: GLenum = 0x8B52UL
		val INT_VEC2: GLenum = 0x8B53UL
		val INT_VEC3: GLenum = 0x8B54UL
		val INT_VEC4: GLenum = 0x8B55UL
		val BOOL: GLenum = 0x8B56UL
		val BOOL_VEC2: GLenum = 0x8B57UL
		val BOOL_VEC3: GLenum = 0x8B58UL
		val BOOL_VEC4: GLenum = 0x8B59UL
		val FLOAT_MAT2: GLenum = 0x8B5AUL
		val FLOAT_MAT3: GLenum = 0x8B5BUL
		val FLOAT_MAT4: GLenum = 0x8B5CUL
		val SAMPLER_2D: GLenum = 0x8B5EUL
		val SAMPLER_CUBE: GLenum = 0x8B60UL
		val VERTEX_ATTRIB_ARRAY_ENABLED: GLenum = 0x8622UL
		val VERTEX_ATTRIB_ARRAY_SIZE: GLenum = 0x8623UL
		val VERTEX_ATTRIB_ARRAY_STRIDE: GLenum = 0x8624UL
		val VERTEX_ATTRIB_ARRAY_TYPE: GLenum = 0x8625UL
		val VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum = 0x886AUL
		val VERTEX_ATTRIB_ARRAY_POINTER: GLenum = 0x8645UL
		val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum = 0x889FUL
		val IMPLEMENTATION_COLOR_READ_TYPE: GLenum = 0x8B9AUL
		val IMPLEMENTATION_COLOR_READ_FORMAT: GLenum = 0x8B9BUL
		val COMPILE_STATUS: GLenum = 0x8B81UL
		val LOW_FLOAT: GLenum = 0x8DF0UL
		val MEDIUM_FLOAT: GLenum = 0x8DF1UL
		val HIGH_FLOAT: GLenum = 0x8DF2UL
		val LOW_INT: GLenum = 0x8DF3UL
		val MEDIUM_INT: GLenum = 0x8DF4UL
		val HIGH_INT: GLenum = 0x8DF5UL
		val FRAMEBUFFER: GLenum = 0x8D40UL
		val RENDERBUFFER: GLenum = 0x8D41UL
		val RGBA4: GLenum = 0x8056UL
		val RGB5_A1: GLenum = 0x8057UL
		val RGB565: GLenum = 0x8D62UL
		val DEPTH_COMPONENT16: GLenum = 0x81A5UL
		val STENCIL_INDEX: GLenum = 0x1901UL
		val STENCIL_INDEX8: GLenum = 0x8D48UL
		val DEPTH_STENCIL: GLenum = 0x84F9UL
		val RENDERBUFFER_WIDTH: GLenum = 0x8D42UL
		val RENDERBUFFER_HEIGHT: GLenum = 0x8D43UL
		val RENDERBUFFER_INTERNAL_FORMAT: GLenum = 0x8D44UL
		val RENDERBUFFER_RED_SIZE: GLenum = 0x8D50UL
		val RENDERBUFFER_GREEN_SIZE: GLenum = 0x8D51UL
		val RENDERBUFFER_BLUE_SIZE: GLenum = 0x8D52UL
		val RENDERBUFFER_ALPHA_SIZE: GLenum = 0x8D53UL
		val RENDERBUFFER_DEPTH_SIZE: GLenum = 0x8D54UL
		val RENDERBUFFER_STENCIL_SIZE: GLenum = 0x8D55UL
		val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum = 0x8CD0UL
		val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum = 0x8CD1UL
		val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum = 0x8CD2UL
		val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum = 0x8CD3UL
		val COLOR_ATTACHMENT0: GLenum = 0x8CE0UL
		val DEPTH_ATTACHMENT: GLenum = 0x8D00UL
		val STENCIL_ATTACHMENT: GLenum = 0x8D20UL
		val DEPTH_STENCIL_ATTACHMENT: GLenum = 0x821AUL
		val NONE: GLenum = 0UL
		val FRAMEBUFFER_COMPLETE: GLenum = 0x8CD5UL
		val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum = 0x8CD6UL
		val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum = 0x8CD7UL
		val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum = 0x8CD9UL
		val FRAMEBUFFER_UNSUPPORTED: GLenum = 0x8CDDUL
		val FRAMEBUFFER_BINDING: GLenum = 0x8CA6UL
		val RENDERBUFFER_BINDING: GLenum = 0x8CA7UL
		val MAX_RENDERBUFFER_SIZE: GLenum = 0x84E8UL
		val INVALID_FRAMEBUFFER_OPERATION: GLenum = 0x0506UL
		val UNPACK_FLIP_Y_WEBGL: GLenum = 0x9240UL
		val UNPACK_PREMULTIPLY_ALPHA_WEBGL: GLenum = 0x9241UL
		val CONTEXT_LOST_WEBGL: GLenum = 0x9242UL
		val UNPACK_COLORSPACE_CONVERSION_WEBGL: GLenum = 0x9243UL
		val BROWSER_DEFAULT_WEBGL: GLenum = 0x9244UL
	}
	
	/**
	 * nullThe WebGLRenderingContext.getContextAttributes() method returns a WebGLContextAttributes object that contains the actual context parameters. Might return null, if the context is lost.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getContextAttributes) official docs.
	 *
	 */
	public fun getContextAttributes();
	/**
	 * nullThe WebGLRenderingContext.isContextLost() method returns a boolean value indicating whether or not the WebGL context has been lost and must be re-established before rendering can resume.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isContextLost) official docs.
	 *
	 */
	public fun isContextLost();
	/**
	 * nullThe WebGLRenderingContext.getSupportedExtensions() method returns a list of all the supported WebGL extensions.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getSupportedExtensions) official docs.
	 *
	 */
	public fun getSupportedExtensions();
	/**
	 * nullThe WebGLRenderingContext.getExtension() method enables a WebGL extension.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getExtension) official docs.
	 *
	 * @param name <p>A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/String"><code>String</code></a> for the name of the WebGL extension to enable.</p>
	 */
	public fun getExtension(name: DOMString);
	/**
	 * nullThe WebGLRenderingContext.activeTexture() method of the WebGL API specifies which texture unit to make active.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/activeTexture) official docs.
	 *
	 * @param texture <p>The texture unit to make active. The value is a <code>gl.TEXTUREI</code> where <em>I</em> is within the range from 0 to <code>gl.MAX_COMBINED_TEXTURE_IMAGE_UNITS - 1</code>.</p>
	 */
	public fun activeTexture(texture: GLenum);
	/**
	 * nullThe WebGLRenderingContext.attachShader() method of the WebGL API attaches either a fragment or vertex WebGLShader to a WebGLProgram.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/attachShader) official docs.
	 *
	 * @param program <p>A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.</p>
	 * @param shader <p>A fragment or vertex <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a>.</p>
	 */
	public fun attachShader(program: WebGLProgram, shader: WebGLShader);
	/**
	 * nullThe WebGLRenderingContext.bindAttribLocation() method of the WebGL API binds a generic vertex index to an attribute variable.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindAttribLocation) official docs.
	 *
	 * @param program <p>A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> object to bind.</p>
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the generic vertex to bind.</p>
	 * @param name <p>A string specifying the name of the variable to bind to the generic vertex index. This name cannot start with "webgl_" or "_webgl_", as these are reserved for use by WebGL.</p>
	 */
	public fun bindAttribLocation(program: WebGLProgram, index: GLuint, name: DOMString);
	/**
	 * nullThe WebGLRenderingContext.bindBuffer() method of the WebGL API binds a given WebGLBuffer to a target.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindBuffer) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:</p>
<dl>
 <dt id="gl.array_buffer">
  <a href="#gl.array_buffer"><code>gl.ARRAY_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data.</p>
 </dd>
 <dt id="gl.element_array_buffer">
  <a href="#gl.element_array_buffer"><code>gl.ELEMENT_ARRAY_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for element indices.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.copy_read_buffer">
  <a href="#gl.copy_read_buffer"><code>gl.COPY_READ_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for copying from one buffer object to another.</p>
 </dd>
 <dt id="gl.copy_write_buffer">
  <a href="#gl.copy_write_buffer"><code>gl.COPY_WRITE_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for copying from one buffer object to another.</p>
 </dd>
 <dt id="gl.transform_feedback_buffer">
  <a href="#gl.transform_feedback_buffer"><code>gl.TRANSFORM_FEEDBACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for transform feedback operations.</p>
 </dd>
 <dt id="gl.uniform_buffer">
  <a href="#gl.uniform_buffer"><code>gl.UNIFORM_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for storing uniform blocks.</p>
 </dd>
 <dt id="gl.pixel_pack_buffer">
  <a href="#gl.pixel_pack_buffer"><code>gl.PIXEL_PACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for pixel transfer operations.</p>
 </dd>
 <dt id="gl.pixel_unpack_buffer">
  <a href="#gl.pixel_unpack_buffer"><code>gl.PIXEL_UNPACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for pixel transfer operations.</p>
 </dd>
</dl>
	 * @param buffer <p>A <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a> to bind.</p>
	 */
	public fun bindBuffer(target: GLenum, buffer: WebGLBuffer);
	/**
	 * nullThe WebGLRenderingContext.bindFramebuffer() method of the WebGL API binds to the specified target the provided WebGLFramebuffer, or, if the framebuffer argument is null, the default WebGLFramebuffer, which is associated with the canvas rendering context.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindFramebuffer) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:</p>
<dl>
 <dt id="gl.framebuffer">
  <a href="#gl.framebuffer"><code>gl.FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Collection buffer data storage of color, alpha, depth and stencil buffers used as both a destination for drawing and as a source for reading (see below).</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.draw_framebuffer">
  <a href="#gl.draw_framebuffer"><code>gl.DRAW_FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Used as a destination for drawing operations such as <code>gl.draw*</code>, <code>gl.clear*</code> and <code>gl.blitFramebuffer</code>.</p>
 </dd>
 <dt id="gl.read_framebuffer">
  <a href="#gl.read_framebuffer"><code>gl.READ_FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Used as a source for reading operations such as <code>gl.readPixels</code> and <code>gl.blitFramebuffer</code>.</p>
 </dd>
</dl>
	 * @param framebuffer <p>A <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> object to bind, or <a href="/en-US/docs/Web/JavaScript/Reference/Operators/null"><code>null</code></a> for binding the <a href="/en-US/docs/Web/API/HTMLCanvasElement"><code>HTMLCanvasElement</code></a> or <a href="/en-US/docs/Web/API/OffscreenCanvas"><code>OffscreenCanvas</code></a> object associated with the rendering context.</p>
	 */
	public fun bindFramebuffer(target: GLenum, framebuffer: WebGLFramebuffer);
	/**
	 * nullThe WebGLRenderingContext.bindRenderbuffer() method of the WebGL API binds a given WebGLRenderbuffer to a target, which must be gl.RENDERBUFFER.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindRenderbuffer) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:</p>
<dl>
 <dt id="gl.renderbuffer">
  <a href="#gl.renderbuffer"><code>gl.RENDERBUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer data storage for single images in a renderable internal format.</p>
 </dd>
</dl>
	 * @param renderbuffer <p>A <a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> object to bind.</p>
	 */
	public fun bindRenderbuffer(target: GLenum, renderbuffer: WebGLRenderbuffer);
	/**
	 * nullThe WebGLRenderingContext.bindTexture() method of the WebGL API binds a given WebGLTexture to a target (binding point).
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindTexture) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A two-dimensional texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP</code>: A cube-mapped texture. When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally: 
  <ul>
   <li><code>gl.TEXTURE_3D</code>: A three-dimensional texture.</li>
   <li><code>gl.TEXTURE_2D_ARRAY</code>: A two-dimensional array texture.</li>
  </ul></li>
</ul>
	 * @param texture <p>A <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> object to bind.</p>
	 */
	public fun bindTexture(target: GLenum, texture: WebGLTexture);
	/**
	 * nullThe WebGLRenderingContext.blendColor() method of the WebGL API is used to set the source and destination blending factors.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendColor) official docs.
	 *
	 * @param red <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> for the red component in the range of 0 to 1. Default value is 0.</p>
	 * @param green <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> for the green component in the range of 0 to 1. Default value is 0.</p>
	 * @param blue <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> for the blue component in the range of 0 to 1. Default value is 0.</p>
	 * @param alpha <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> for the alpha component (transparency) in the range of 0. to 1. Default value is 0.</p>
	 */
	public fun blendColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf);
	/**
	 * nullThe WebGLRenderingContext.blendEquation() method of the WebGL API is used to set both the RGB blend equation and alpha blend equation to a single equation. The blend equation determines how a new pixel is combined with a pixel already in the WebGLFramebuffer.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendEquation) official docs.
	 *
	 * @param mode <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying how source and destination colors are combined. Must be either:</p>
<ul>
 <li><code>gl.FUNC_ADD</code>: source + destination (default value)</li>
 <li><code>gl.FUNC_SUBTRACT</code>: source - destination</li>
 <li><code>gl.FUNC_REVERSE_SUBTRACT</code>: destination - source</li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/EXT_blend_minmax"><code>EXT_blend_minmax</code></a> extension:</p>
<ul>
 <li><code>ext.MIN_EXT</code>: Minimum of source and destination</li>
 <li><code>ext.MAX_EXT</code>: Maximum of source and destination</li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.MIN</code>: Minimum of source and destination</li>
 <li><code>gl.MAX</code>: Maximum of source and destination</li>
</ul>
	 */
	public fun blendEquation(mode: GLenum);
	/**
	 * nullThe WebGLRenderingContext.blendEquationSeparate() method of the WebGL API is used to set the RGB blend equation and alpha blend equation separately. The blend equation determines how a new pixel is combined with a pixel already in the WebGLFramebuffer.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendEquationSeparate) official docs.
	 *
	 * @param modeRGB <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying how the red, green and blue components of source and destination colors are combined. Must be either:</p>
<ul>
 <li><code>gl.FUNC_ADD</code>: source + destination (default value),</li>
 <li><code>gl.FUNC_SUBTRACT</code>: source - destination,</li>
 <li><code>gl.FUNC_REVERSE_SUBTRACT</code>: destination - source,</li>
 <li>When using the <a href="/en-US/docs/Web/API/EXT_blend_minmax"><code>EXT_blend_minmax</code></a> extension: 
  <ul>
   <li><code>ext.MIN_EXT</code>: Minimum of source and destination,</li>
   <li><code>ext.MAX_EXT</code>: Maximum of source and destination.</li>
  </ul></li>
 <li>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally: 
  <ul>
   <li><code>gl.MIN</code>: Minimum of source and destination,</li>
   <li><code>gl.MAX</code>: Maximum of source and destination.</li>
  </ul></li>
</ul>
	 * @param modeAlpha <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying how the alpha component (transparency) of source and destination colors are combined. Must be either:</p>
<ul>
 <li><code>gl.FUNC_ADD</code>: source + destination (default value),</li>
 <li><code>gl.FUNC_SUBTRACT</code>: source - destination,</li>
 <li><code>gl.FUNC_REVERSE_SUBTRACT</code>: destination - source,</li>
 <li>When using the <a href="/en-US/docs/Web/API/EXT_blend_minmax"><code>EXT_blend_minmax</code></a> extension: 
  <ul>
   <li><code>ext.MIN_EXT</code>: Minimum of source and destination,</li>
   <li><code>ext.MAX_EXT</code>: Maximum of source and destination.</li>
  </ul></li>
 <li>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally: 
  <ul>
   <li><code>gl.MIN</code>: Minimum of source and destination,</li>
   <li><code>gl.MAX</code>: Maximum of source and destination.</li>
  </ul></li>
</ul>
	 */
	public fun blendEquationSeparate(modeRGB: GLenum, modeAlpha: GLenum);
	/**
	 * nullThe WebGLRenderingContext.blendFunc() method of the WebGL API defines which function is used for blending pixel arithmetic.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendFunc) official docs.
	 *
	 * @param sfactor <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types"><code>WebGL_API.Types</code></a> specifying a multiplier for the source blending factors. The default value is <code>gl.ONE</code>. For possible values, see below.</p>
	 * @param dfactor <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types"><code>WebGL_API.Types</code></a> specifying a multiplier for the destination blending factors. The default value is <code>gl.ZERO</code>. For possible values, see below.</p>
	 */
	public fun blendFunc(sfactor: GLenum, dfactor: GLenum);
	/**
	 * nullThe WebGLRenderingContext.blendFuncSeparate() method of the WebGL API defines which function is used for blending pixel arithmetic for RGB and alpha components separately.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendFuncSeparate) official docs.
	 *
	 * @param srcRGB <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types"><code>WebGL_API.Types</code></a> specifying a multiplier for the red, green and blue (RGB) source blending factors. The default value is <code>gl.ONE</code>. For possible values, see below.</p>
	 * @param dstRGB <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types"><code>WebGL_API.Types</code></a> specifying a multiplier for the red, green and blue (RGB) destination blending factors. The default value is <code>gl.ZERO</code>. For possible values, see below.</p>
	 * @param srcAlpha <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types"><code>WebGL_API.Types</code></a> specifying a multiplier for the alpha source blending factor. The default value is <code>gl.ONE</code>. For possible values, see below.</p>
	 * @param dstAlpha <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types"><code>WebGL_API.Types</code></a> specifying a multiplier for the alpha destination blending factor. The default value is <code>gl.ZERO</code>. For possible values, see below.</p>
	 */
	public fun blendFuncSeparate(srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum);
	/**
	 * nullThe WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:</p>
<dl>
 <dt id="gl.array_buffer">
  <a href="#gl.array_buffer"><code>gl.ARRAY_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data.</p>
 </dd>
 <dt id="gl.element_array_buffer">
  <a href="#gl.element_array_buffer"><code>gl.ELEMENT_ARRAY_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for element indices.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.copy_read_buffer">
  <a href="#gl.copy_read_buffer"><code>gl.COPY_READ_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for copying from one buffer object to another.</p>
 </dd>
 <dt id="gl.copy_write_buffer">
  <a href="#gl.copy_write_buffer"><code>gl.COPY_WRITE_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for copying from one buffer object to another.</p>
 </dd>
 <dt id="gl.transform_feedback_buffer">
  <a href="#gl.transform_feedback_buffer"><code>gl.TRANSFORM_FEEDBACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for transform feedback operations.</p>
 </dd>
 <dt id="gl.uniform_buffer">
  <a href="#gl.uniform_buffer"><code>gl.UNIFORM_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for storing uniform blocks.</p>
 </dd>
 <dt id="gl.pixel_pack_buffer">
  <a href="#gl.pixel_pack_buffer"><code>gl.PIXEL_PACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for pixel transfer operations.</p>
 </dd>
 <dt id="gl.pixel_unpack_buffer">
  <a href="#gl.pixel_unpack_buffer"><code>gl.PIXEL_UNPACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for pixel transfer operations.</p>
 </dd>
</dl>
	 * @param size <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizeiptr"><code>GLsizeiptr</code></a> setting the size in bytes of the buffer object's data store.</p>
	 * @param usage <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the intended usage pattern of the data store for optimization purposes. Possible values:</p>
<dl>
 <dt id="gl.static_draw">
  <a href="#gl.static_draw"><code>gl.STATIC_DRAW</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be specified once by the application, and used many times as the source for WebGL drawing and image specification commands.</p>
 </dd>
 <dt id="gl.dynamic_draw">
  <a href="#gl.dynamic_draw"><code>gl.DYNAMIC_DRAW</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be respecified repeatedly by the application, and used many times as the source for WebGL drawing and image specification commands.</p>
 </dd>
 <dt id="gl.stream_draw">
  <a href="#gl.stream_draw"><code>gl.STREAM_DRAW</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be specified once by the application, and used at most a few times as the source for WebGL drawing and image specification commands.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.static_read">
  <a href="#gl.static_read"><code>gl.STATIC_READ</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be specified once by reading data from WebGL, and queried many times by the application.</p>
 </dd>
 <dt id="gl.dynamic_read">
  <a href="#gl.dynamic_read"><code>gl.DYNAMIC_READ</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be respecified repeatedly by reading data from WebGL, and queried many times by the application.</p>
 </dd>
 <dt id="gl.stream_read">
  <a href="#gl.stream_read"><code>gl.STREAM_READ</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be specified once by reading data from WebGL, and queried at most a few times by the application</p>
 </dd>
 <dt id="gl.static_copy">
  <a href="#gl.static_copy"><code>gl.STATIC_COPY</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be specified once by reading data from WebGL, and used many times as the source for WebGL drawing and image specification commands.</p>
 </dd>
 <dt id="gl.dynamic_copy">
  <a href="#gl.dynamic_copy"><code>gl.DYNAMIC_COPY</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be respecified repeatedly by reading data from WebGL, and used many times as the source for WebGL drawing and image specification commands.</p>
 </dd>
 <dt id="gl.stream_copy">
  <a href="#gl.stream_copy"><code>gl.STREAM_COPY</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be specified once by reading data from WebGL, and used at most a few times as the source for WebGL drawing and image specification commands.</p>
 </dd>
</dl>
	 */
	public fun bufferData(target: GLenum, size: GLsizeiptr, usage: GLenum);
	/**
	 * nullThe WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
	 *
	 * Problems found during importing:
	 * Parameter 'data' with type BufferDataSource non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:</p>
<dl>
 <dt id="gl.array_buffer">
  <a href="#gl.array_buffer"><code>gl.ARRAY_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data.</p>
 </dd>
 <dt id="gl.element_array_buffer">
  <a href="#gl.element_array_buffer"><code>gl.ELEMENT_ARRAY_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for element indices.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.copy_read_buffer">
  <a href="#gl.copy_read_buffer"><code>gl.COPY_READ_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for copying from one buffer object to another.</p>
 </dd>
 <dt id="gl.copy_write_buffer">
  <a href="#gl.copy_write_buffer"><code>gl.COPY_WRITE_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for copying from one buffer object to another.</p>
 </dd>
 <dt id="gl.transform_feedback_buffer">
  <a href="#gl.transform_feedback_buffer"><code>gl.TRANSFORM_FEEDBACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for transform feedback operations.</p>
 </dd>
 <dt id="gl.uniform_buffer">
  <a href="#gl.uniform_buffer"><code>gl.UNIFORM_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for storing uniform blocks.</p>
 </dd>
 <dt id="gl.pixel_pack_buffer">
  <a href="#gl.pixel_pack_buffer"><code>gl.PIXEL_PACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for pixel transfer operations.</p>
 </dd>
 <dt id="gl.pixel_unpack_buffer">
  <a href="#gl.pixel_unpack_buffer"><code>gl.PIXEL_UNPACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for pixel transfer operations.</p>
 </dd>
</dl>
	 * @param data This parameter caused unspecified trouble!
	 * @param usage <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the intended usage pattern of the data store for optimization purposes. Possible values:</p>
<dl>
 <dt id="gl.static_draw">
  <a href="#gl.static_draw"><code>gl.STATIC_DRAW</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be specified once by the application, and used many times as the source for WebGL drawing and image specification commands.</p>
 </dd>
 <dt id="gl.dynamic_draw">
  <a href="#gl.dynamic_draw"><code>gl.DYNAMIC_DRAW</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be respecified repeatedly by the application, and used many times as the source for WebGL drawing and image specification commands.</p>
 </dd>
 <dt id="gl.stream_draw">
  <a href="#gl.stream_draw"><code>gl.STREAM_DRAW</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be specified once by the application, and used at most a few times as the source for WebGL drawing and image specification commands.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.static_read">
  <a href="#gl.static_read"><code>gl.STATIC_READ</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be specified once by reading data from WebGL, and queried many times by the application.</p>
 </dd>
 <dt id="gl.dynamic_read">
  <a href="#gl.dynamic_read"><code>gl.DYNAMIC_READ</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be respecified repeatedly by reading data from WebGL, and queried many times by the application.</p>
 </dd>
 <dt id="gl.stream_read">
  <a href="#gl.stream_read"><code>gl.STREAM_READ</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be specified once by reading data from WebGL, and queried at most a few times by the application</p>
 </dd>
 <dt id="gl.static_copy">
  <a href="#gl.static_copy"><code>gl.STATIC_COPY</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be specified once by reading data from WebGL, and used many times as the source for WebGL drawing and image specification commands.</p>
 </dd>
 <dt id="gl.dynamic_copy">
  <a href="#gl.dynamic_copy"><code>gl.DYNAMIC_COPY</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be respecified repeatedly by reading data from WebGL, and used many times as the source for WebGL drawing and image specification commands.</p>
 </dd>
 <dt id="gl.stream_copy">
  <a href="#gl.stream_copy"><code>gl.STREAM_COPY</code></a>
 </dt>
 <dd>
  <p>The contents are intended to be specified once by reading data from WebGL, and used at most a few times as the source for WebGL drawing and image specification commands.</p>
 </dd>
</dl>
	 */
	//public fun bufferData(target: GLenum, data: BufferDataSource, usage: GLenum);
	/**
	 * nullThe WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
	 *
	 * Problems found during importing:
	 * Parameter 'offset' with type GLintptr non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData'!
	 * Parameter 'data' with type BufferDataSource non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:</p>
<dl>
 <dt id="gl.array_buffer">
  <a href="#gl.array_buffer"><code>gl.ARRAY_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data.</p>
 </dd>
 <dt id="gl.element_array_buffer">
  <a href="#gl.element_array_buffer"><code>gl.ELEMENT_ARRAY_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for element indices.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.copy_read_buffer">
  <a href="#gl.copy_read_buffer"><code>gl.COPY_READ_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for copying from one buffer object to another.</p>
 </dd>
 <dt id="gl.copy_write_buffer">
  <a href="#gl.copy_write_buffer"><code>gl.COPY_WRITE_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for copying from one buffer object to another.</p>
 </dd>
 <dt id="gl.transform_feedback_buffer">
  <a href="#gl.transform_feedback_buffer"><code>gl.TRANSFORM_FEEDBACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for transform feedback operations.</p>
 </dd>
 <dt id="gl.uniform_buffer">
  <a href="#gl.uniform_buffer"><code>gl.UNIFORM_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for storing uniform blocks.</p>
 </dd>
 <dt id="gl.pixel_pack_buffer">
  <a href="#gl.pixel_pack_buffer"><code>gl.PIXEL_PACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for pixel transfer operations.</p>
 </dd>
 <dt id="gl.pixel_unpack_buffer">
  <a href="#gl.pixel_unpack_buffer"><code>gl.PIXEL_UNPACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for pixel transfer operations.</p>
 </dd>
</dl>
	 * @param offset This parameter caused unspecified trouble!
	 * @param data This parameter caused unspecified trouble!
	 */
	//public fun bufferSubData(target: GLenum, offset: GLintptr, data: BufferDataSource);
	/**
	 * nullThe WebGLRenderingContext.checkFramebufferStatus() method of the WebGL API returns the completeness status of the WebGLFramebuffer object.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/checkFramebufferStatus) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:</p>
<dl>
 <dt id="gl.framebuffer">
  <a href="#gl.framebuffer"><code>gl.FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.draw_framebuffer">
  <a href="#gl.draw_framebuffer"><code>gl.DRAW_FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Equivalent to <code>gl.FRAMEBUFFER</code>. Used as a destination for drawing, rendering, clearing, and writing operations.</p>
 </dd>
 <dt id="gl.read_framebuffer">
  <a href="#gl.read_framebuffer"><code>gl.READ_FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Used as a source for reading operations.</p>
 </dd>
</dl>
	 */
	public fun checkFramebufferStatus(target: GLenum);
	/**
	 * nullThe WebGLRenderingContext.clear() method of the WebGL API clears buffers to preset values. The preset values can be set by clearColor(), clearDepth() or clearStencil(). The scissor box, dithering, and buffer writemasks can affect the clear() method.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clear) official docs.
	 *
	 * @param mask <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLbitfield"><code>GLbitfield</code></a> bitwise OR mask that indicates the buffers to be cleared. Possible values are:</p>
<ul>
 <li><code>gl.COLOR_BUFFER_BIT</code></li>
 <li><code>gl.DEPTH_BUFFER_BIT</code></li>
 <li><code>gl.STENCIL_BUFFER_BIT</code></li>
</ul>
	 */
	public fun clear(mask: GLbitfield);
	/**
	 * nullThe WebGLRenderingContext.clearColor() method of the WebGL API specifies the color values used when clearing color buffers. This specifies what color values to use when calling the clear() method. The values are clamped between 0 and 1.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clearColor) official docs.
	 *
	 * @param red <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the red color value used when the color buffers are cleared. Default value: 0.</p>
	 * @param green <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the green color value used when the color buffers are cleared. Default value: 0.</p>
	 * @param blue <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the blue color value used when the color buffers are cleared. Default value: 0.</p>
	 * @param alpha <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the alpha (transparency) value used when the color buffers are cleared. Default value: 0.</p>
	 */
	public fun clearColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf);
	/**
	 * nullThe WebGLRenderingContext.clearDepth() method of the WebGL API specifies the clear value for the depth buffer. This specifies what depth value to use when calling the clear() method. The value is clamped between 0 and 1.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clearDepth) official docs.
	 *
	 * @param depth <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the depth value used when the depth buffer is cleared. Default value: 1.</p>
	 */
	public fun clearDepth(depth: GLclampf);
	/**
	 * nullThe WebGLRenderingContext.clearStencil() method of the WebGL API specifies the clear value for the stencil buffer. This specifies what stencil value to use when calling the clear() method.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clearStencil) official docs.
	 *
	 * @param s <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the index used when the stencil buffer is cleared. Default value: 0.</p>
	 */
	public fun clearStencil(s: GLint);
	/**
	 * nullThe WebGLRenderingContext.colorMask() method of the WebGL API sets which color components to enable or to disable when drawing or rendering to a WebGLFramebuffer.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/colorMask) official docs.
	 *
	 * @param red <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether or not the red color component can be written into the frame buffer. Default value: <code>true</code>.</p>
	 * @param green <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether or not the green color component can be written into the frame buffer. Default value: <code>true</code>.</p>
	 * @param blue <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether or not the blue color component can be written into the frame buffer. Default value: <code>true</code>.</p>
	 * @param alpha <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether or not the alpha (transparency) component can be written into the frame buffer. Default value: <code>true</code>.</p>
	 */
	public fun colorMask(red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean);
	/**
	 * nullThe WebGLRenderingContext.compileShader() method of the WebGL API compiles a GLSL shader into binary data so that it can be used by a WebGLProgram.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compileShader) official docs.
	 *
	 * @param shader <p>A fragment or vertex <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a>.</p>
	 */
	public fun compileShader(shader: WebGLShader);
	/**
	 * nullThe WebGLRenderingContext.compressedTexImage2D() and WebGL2RenderingContext.compressedTexImage3D() methods of the WebGL API specify a two- or three-dimensional texture image in a compressed format. Compressed image formats must be enabled by WebGL extensions before using these methods.
	 *
	 * Problems found during importing:
	 * Parameter 'data' with type ArrayBufferView non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexImage2D'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexImage2D) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values for <code>compressedTexImage2D</code>:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A two-dimensional texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_X</code>: Positive X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_X</code>: Negative X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Y</code>: Positive Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Y</code>: Negative Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Z</code>: Positive Z face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Z</code>: Negative Z face for a cube-mapped texture.</li>
</ul>
<p>Possible values for <code>compressedTexImage3D</code>:</p>
<ul>
 <li><code>gl.TEXTURE_2D_ARRAY</code></li>
 <li><code>gl.TEXTURE_3D</code></li>
</ul>
	 * @param level <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.</p>
	 * @param internalformat <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the compressed image format. Compressed image formats must be enabled by <a href="/en-US/docs/Web/API/WebGL_API/Using_Extensions">WebGL extensions</a> before using this method. All values are possible for <code>compressedTexImage2D</code>. See <a href="/en-US/docs/Web/API/WebGL_API/Compressed_texture_formats">compressed texture formats</a> for which are valid for <code>compressedTexImage3D</code>. Possible values:</p>
<ul>
 <li>When using the <a href="/en-US/docs/Web/API/WEBGL_compressed_texture_s3tc"><code>WEBGL_compressed_texture_s3tc</code></a> extension: 
  <ul>
   <li><code>ext.COMPRESSED_RGB_S3TC_DXT1_EXT</code></li>
   <li><code>ext.COMPRESSED_RGBA_S3TC_DXT1_EXT</code></li>
   <li><code>ext.COMPRESSED_RGBA_S3TC_DXT3_EXT</code></li>
   <li><code>ext.COMPRESSED_RGBA_S3TC_DXT5_EXT</code></li>
  </ul></li>
 <li>When using the <a href="/en-US/docs/Web/API/WEBGL_compressed_texture_s3tc_srgb"><code>WEBGL_compressed_texture_s3tc_srgb</code></a> extension: 
  <ul>
   <li><code>ext.COMPRESSED_SRGB_S3TC_DXT1_EXT</code></li>
   <li><code>ext.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT</code></li>
   <li><code>ext.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT</code></li>
   <li><code>ext.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT</code></li>
  </ul></li>
 <li>When using the <a href="/en-US/docs/Web/API/WEBGL_compressed_texture_etc"><code>WEBGL_compressed_texture_etc</code></a> extension: 
  <ul>
   <li><code>ext.COMPRESSED_R11_EAC</code></li>
   <li><code>ext.COMPRESSED_SIGNED_R11_EAC</code></li>
   <li><code>ext.COMPRESSED_RG11_EAC</code></li>
   <li><code>ext.COMPRESSED_SIGNED_RG11_EAC</code></li>
   <li><code>ext.COMPRESSED_RGB8_ETC2</code></li>
   <li><code>ext.COMPRESSED_RGBA8_ETC2_EAC</code></li>
   <li><code>ext.COMPRESSED_SRGB8_ETC2</code></li>
   <li><code>ext.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC</code></li>
   <li><code>ext.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2</code></li>
   <li><code>ext.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2</code></li>
  </ul></li>
 <li>When using the <a href="/en-US/docs/Web/API/WEBGL_compressed_texture_pvrtc"><code>WEBGL_compressed_texture_pvrtc</code></a> extension: 
  <ul>
   <li><code>ext.COMPRESSED_RGB_PVRTC_4BPPV1_IMG</code></li>
   <li><code>ext.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG</code></li>
   <li><code>ext.COMPRESSED_RGB_PVRTC_2BPPV1_IMG</code></li>
   <li><code>ext.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG</code></li>
  </ul></li>
 <li>When using the <a href="/en-US/docs/Web/API/WEBGL_compressed_texture_etc1"><code>WEBGL_compressed_texture_etc1</code></a> extension: 
  <ul>
   <li><code>ext.COMPRESSED_RGB_ETC1_WEBGL</code></li>
  </ul></li>
 <li>When using the <a href="/en-US/docs/Web/API/WEBGL_compressed_texture_astc"><code>WEBGL_compressed_texture_astc</code></a> extension: 
  <ul>
   <li><code>ext.COMPRESSED_RGBA_ASTC_4x4_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR</code></li>
   <li><code>ext.COMPRESSED_RGBA_ASTC_5x4_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR</code></li>
   <li><code>ext.COMPRESSED_RGBA_ASTC_5x5_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR</code></li>
   <li><code>ext.COMPRESSED_RGBA_ASTC_6x5_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR</code></li>
   <li><code>ext.COMPRESSED_RGBA_ASTC_6x6_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR</code></li>
   <li><code>ext.COMPRESSED_RGBA_ASTC_8x5_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR</code></li>
   <li><code>ext.COMPRESSED_RGBA_ASTC_8x6_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR</code></li>
   <li><code>ext.COMPRESSED_RGBA_ASTC_8x8_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR</code></li>
   <li><code>ext.COMPRESSED_RGBA_ASTC_10x5_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR</code></li>
   <li><code>ext.COMPRESSED_RGBA_ASTC_10x6_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR</code></li>
   <li><code>ext.COMPRESSED_RGBA_ASTC_10x10_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR</code></li>
   <li><code>ext.COMPRESSED_RGBA_ASTC_12x10_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR</code></li>
   <li><code>ext.COMPRESSED_RGBA_ASTC_12x12_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR</code></li>
  </ul></li>
 <li>When using the <a href="/en-US/docs/Web/API/EXT_texture_compression_bptc"><code>EXT_texture_compression_bptc</code></a> extension: 
  <ul>
   <li><code>ext.COMPRESSED_RGBA_BPTC_UNORM_EXT</code></li>
   <li><code>ext.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT</code></li>
   <li><code>ext.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT</code></li>
   <li><code>ext.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT</code></li>
  </ul></li>
 <li>When using the <a href="/en-US/docs/Web/API/EXT_texture_compression_rgtc"><code>EXT_texture_compression_rgtc</code></a> extension: 
  <ul>
   <li><code>ext.COMPRESSED_RED_RGTC1_EXT</code></li>
   <li><code>ext.COMPRESSED_SIGNED_RED_RGTC1_EXT</code></li>
   <li><code>ext.COMPRESSED_RED_GREEN_RGTC2_EXT</code></li>
   <li><code>ext.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT</code></li>
  </ul></li>
</ul>
	 * @param data This parameter caused unspecified trouble!
	 */
	//public fun compressedTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, data: ArrayBufferView);
	/**
	 * nullThe WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format. Compressed image formats must be enabled by WebGL extensions before using this method or a WebGL2RenderingContext must be used.
	 *
	 * Problems found during importing:
	 * Parameter 'data' with type ArrayBufferView non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active compressed texture. Possible values:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A two-dimensional texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_X</code>: Positive X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_X</code>: Negative X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Y</code>: Positive Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Y</code>: Negative Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Z</code>: Positive Z face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Z</code>: Negative Z face for a cube-mapped texture.</li>
</ul>
	 * @param level <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.</p>
	 * @param data This parameter caused unspecified trouble!
	 */
	//public fun compressedTexSubImage2D(target: GLenum, level: GLint, data: ArrayBufferView);
	/**
	 * nullThe WebGLRenderingContext.copyTexImage2D() method of the WebGL API copies pixels from the current WebGLFramebuffer into a 2D texture image.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/copyTexImage2D) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A two-dimensional texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_X</code>: Positive X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_X</code>: Negative X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Y</code>: Positive Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Y</code>: Negative Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Z</code>: Positive Z face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Z</code>: Negative Z face for a cube-mapped texture.</li>
</ul>
	 * @param level <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.</p>
	 * @param internalformat <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the color components in the texture. Possible values:</p>
<ul>
 <li><code>gl.ALPHA</code>: Discards the red, green and blue components and reads the alpha component.</li>
 <li><code>gl.RGB</code>: Discards the alpha components and reads the red, green and blue components.</li>
 <li><code>gl.RGBA</code>: Red, green, blue and alpha components are read from the color buffer.</li>
 <li><code>gl.LUMINANCE</code>: Each color component is a luminance component, alpha is 1.0.</li>
 <li><code>gl.LUMINANCE_ALPHA</code>: Each component is a luminance/alpha component.</li>
</ul>
	 * @param border <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the width of the border. Must be 0.</p>
	 */
	public fun copyTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, border: GLint);
	/**
	 * nullThe WebGLRenderingContext.copyTexSubImage2D() method of the WebGL API copies pixels from the current WebGLFramebuffer into an existing 2D texture sub-image.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/copyTexSubImage2D) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A two-dimensional texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_X</code>: Positive X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_X</code>: Negative X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Y</code>: Positive Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Y</code>: Negative Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Z</code>: Positive Z face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Z</code>: Negative Z face for a cube-mapped texture.</li>
</ul>
	 * @param level <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.</p>
	 * @param xoffset <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the horizontal offset within the texture image.</p>
	 * @param yoffset <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the vertical offset within the texture image.</p>
	 * @param x <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the x coordinate of the lower left corner where to start copying.</p>
	 * @param y <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the y coordinate of the lower left corner where to start copying.</p>
	 * @param width <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the texture.</p>
	 * @param height <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the texture.</p>
	 */
	public fun copyTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, x: GLint, y: GLint, width: GLsizei, height: GLsizei);
	/**
	 * nullThe WebGLRenderingContext.createBuffer() method of the WebGL API creates and initializes a WebGLBuffer storing data such as vertices or colors.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createBuffer) official docs.
	 *
	 */
	public fun createBuffer();
	/**
	 * nullThe WebGLRenderingContext.createFramebuffer() method of the WebGL API creates and initializes a WebGLFramebuffer object.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createFramebuffer) official docs.
	 *
	 */
	public fun createFramebuffer();
	/**
	 * nullThe WebGLRenderingContext.createProgram() method of the WebGL API creates and initializes a WebGLProgram object.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createProgram) official docs.
	 *
	 */
	public fun createProgram();
	/**
	 * nullThe WebGLRenderingContext.createRenderbuffer() method of the WebGL API creates and initializes a WebGLRenderbuffer object.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createRenderbuffer) official docs.
	 *
	 */
	public fun createRenderbuffer();
	/**
	 * nullThe WebGLRenderingContext method createShader() of the WebGL API creates a WebGLShader that can then be configured further using WebGLRenderingContext.shaderSource() and WebGLRenderingContext.compileShader().
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createShader) official docs.
	 *
	 * @param type <p>Either <code>gl.VERTEX_SHADER</code> or <code>gl.FRAGMENT_SHADER</code></p>
	 */
	public fun createShader(type: GLenum);
	/**
	 * nullThe WebGLRenderingContext.createTexture() method of the WebGL API creates and initializes a WebGLTexture object.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createTexture) official docs.
	 *
	 */
	public fun createTexture();
	/**
	 * nullThe WebGLRenderingContext.cullFace() method of the WebGL API specifies whether or not front- and/or back-facing polygons can be culled.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/cullFace) official docs.
	 *
	 * @param mode <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying whether front- or back-facing polygons are candidates for culling. The default value is <code>gl.BACK</code>. Possible values are:</p>
<ul>
 <li><code>gl.FRONT</code></li>
 <li><code>gl.BACK</code></li>
 <li><code>gl.FRONT_AND_BACK</code></li>
</ul>
	 */
	public fun cullFace(mode: GLenum);
	/**
	 * nullThe WebGLRenderingContext.deleteBuffer() method of the WebGL API deletes a given WebGLBuffer. This method has no effect if the buffer has already been deleted. Normally you don't need to call this method yourself, when the buffer object is dereferenced it will be marked as free.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteBuffer) official docs.
	 *
	 * @param buffer <p>A <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a> object to delete.</p>
	 */
	public fun deleteBuffer(buffer: WebGLBuffer);
	/**
	 * nullThe WebGLRenderingContext.deleteFramebuffer() method of the WebGL API deletes a given WebGLFramebuffer object. This method has no effect if the frame buffer has already been deleted.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteFramebuffer) official docs.
	 *
	 * @param framebuffer <p>A <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> object to delete.</p>
	 */
	public fun deleteFramebuffer(framebuffer: WebGLFramebuffer);
	/**
	 * nullThe WebGLRenderingContext.deleteProgram() method of the WebGL API deletes a given WebGLProgram object. This method has no effect if the program has already been deleted.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteProgram) official docs.
	 *
	 * @param program <p>A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> object to delete.</p>
	 */
	public fun deleteProgram(program: WebGLProgram);
	/**
	 * nullThe WebGLRenderingContext.deleteRenderbuffer() method of the WebGL API deletes a given WebGLRenderbuffer object. This method has no effect if the render buffer has already been deleted.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteRenderbuffer) official docs.
	 *
	 * @param renderbuffer <p>A <a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> object to delete.</p>
	 */
	public fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer);
	/**
	 * nullThe WebGLRenderingContext.deleteShader() method of the WebGL API marks a given WebGLShader object for deletion. It will then be deleted whenever the shader is no longer in use. This method has no effect if the shader has already been deleted, and the WebGLShader is automatically marked for deletion when it is destroyed by the garbage collector.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteShader) official docs.
	 *
	 * @param shader <p>A <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> object to delete.</p>
	 */
	public fun deleteShader(shader: WebGLShader);
	/**
	 * nullThe WebGLRenderingContext.deleteTexture() method of the WebGL API deletes a given WebGLTexture object. This method has no effect if the texture has already been deleted.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteTexture) official docs.
	 *
	 * @param texture <p>A <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> object to delete.</p>
	 */
	public fun deleteTexture(texture: WebGLTexture);
	/**
	 * nullThe WebGLRenderingContext.depthFunc() method of the WebGL API specifies a function that compares incoming pixel depth to the current depth buffer value.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/depthFunc) official docs.
	 *
	 * @param func <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the depth comparison function, which sets the conditions under which the pixel will be drawn. The default value is <code>gl.LESS</code>. Possible values are:</p>
<ul>
 <li><code>gl.NEVER</code> (never pass)</li>
 <li><code>gl.LESS</code> (pass if the incoming value is less than the depth buffer value)</li>
 <li><code>gl.EQUAL</code> (pass if the incoming value equals the depth buffer value)</li>
 <li><code>gl.LEQUAL</code> (pass if the incoming value is less than or equal to the depth buffer value)</li>
 <li><code>gl.GREATER</code> (pass if the incoming value is greater than the depth buffer value)</li>
 <li><code>gl.NOTEQUAL</code> (pass if the incoming value is not equal to the depth buffer value)</li>
 <li><code>gl.GEQUAL</code> (pass if the incoming value is greater than or equal to the depth buffer value)</li>
 <li><code>gl.ALWAYS</code> (always pass)</li>
</ul>
	 */
	public fun depthFunc(func: GLenum);
	/**
	 * nullThe WebGLRenderingContext.depthMask() method of the WebGL API sets whether writing into the depth buffer is enabled or disabled.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/depthMask) official docs.
	 *
	 * @param flag <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether or not writing into the depth buffer is enabled. Default value: <code>true</code>, meaning that writing is enabled.</p>
	 */
	public fun depthMask(flag: GLboolean);
	/**
	 * nullThe WebGLRenderingContext.depthRange() method of the WebGL API specifies the depth range mapping from normalized device coordinates to window or viewport coordinates.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/depthRange) official docs.
	 *
	 * @param zNear <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the mapping of the near clipping plane to window or viewport coordinates. Clamped to the range 0 to 1 and must be less than or equal to <code>zFar</code>. The default value i<code>s 0.</code></p>
	 * @param zFar <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> specifying the mapping of the far clipping plane to window or viewport coordinates. Clamped to the range 0 to 1. The default value i<code>s 1.</code></p>
	 */
	public fun depthRange(zNear: GLclampf, zFar: GLclampf);
	/**
	 * nullThe WebGLRenderingContext.detachShader() method of the WebGL API detaches a previously attached WebGLShader from a WebGLProgram.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/detachShader) official docs.
	 *
	 * @param program <p>A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a>.</p>
	 * @param shader <p>A fragment or vertex <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a>.</p>
	 */
	public fun detachShader(program: WebGLProgram, shader: WebGLShader);
	/**
	 * nullThe WebGLRenderingContext.disable() method of the WebGL API disables specific WebGL capabilities for this context.
	 *
	 * Problems found during importing:
	 * Parameter 'cap' with type GLenum non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/disable'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/disable) official docs.
	 *
	 * @param cap This parameter caused unspecified trouble!
	 */
	//public fun disable(cap: GLenum);
	/**
	 * nullThe WebGLRenderingContext.disableVertexAttribArray() method of the WebGL API turns the generic vertex attribute array off at a given index position.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/disableVertexAttribArray) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the vertex attribute to disable.</p>
	 */
	public fun disableVertexAttribArray(index: GLuint);
	/**
	 * nullThe WebGLRenderingContext.drawArrays() method of the WebGL API renders primitives from array data.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawArrays) official docs.
	 *
	 * @param mode <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the type primitive to render. Possible values are:</p>
<ul>
 <li><code>gl.POINTS</code>: Draws a single dot.</li>
 <li><code>gl.LINE_STRIP</code>: Draws a straight line to the next vertex.</li>
 <li><code>gl.LINE_LOOP</code>: Draws a straight line to the next vertex, and connects the last vertex back to the first.</li>
 <li><code>gl.LINES</code>: Draws a line between a pair of vertices.</li>
 <li><a href="https://en.wikipedia.org/wiki/Triangle_strip" class="external" target="_blank"><code>gl.TRIANGLE_STRIP</code></a></li>
 <li><a href="https://en.wikipedia.org/wiki/Triangle_fan" class="external" target="_blank"><code>gl.TRIANGLE_FAN</code></a></li>
 <li><code>gl.TRIANGLES</code>: Draws a triangle for a group of three vertices.</li>
</ul>
	 * @param first <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the starting index in the array of vector points.</p>
	 * @param count <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the number of indices to be rendered.</p>
	 */
	public fun drawArrays(mode: GLenum, first: GLint, count: GLsizei);
	/**
	 * nullThe WebGLRenderingContext.drawElements() method of the WebGL API renders primitives from array data.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawElements) official docs.
	 *
	 * @param mode <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the type primitive to render. Possible values are:</p>
<ul>
 <li><code>gl.POINTS</code>: Draws a single dot.</li>
 <li><code>gl.LINE_STRIP</code>: Draws a straight line to the next vertex.</li>
 <li><code>gl.LINE_LOOP</code>: Draws a straight line to the next vertex, and connects the last vertex back to the first.</li>
 <li><code>gl.LINES</code>: Draws a line between a pair of vertices.</li>
 <li><a href="https://en.wikipedia.org/wiki/Triangle_strip" class="external" target="_blank"><code>gl.TRIANGLE_STRIP</code></a></li>
 <li><a href="https://en.wikipedia.org/wiki/Triangle_fan" class="external" target="_blank"><code>gl.TRIANGLE_FAN</code></a></li>
 <li><code>gl.TRIANGLES</code>: Draws a triangle for a group of three vertices.</li>
</ul>
	 * @param count <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the number of elements of the bound element array buffer to be rendered. For example, to draw a wireframe triangle with <code>gl.LINES</code> the count should be 2 endpoints per line × 3 lines = 6 elements. However to draw the same wireframe triangle with <code>gl.LINE_STRIP</code> the element array buffer does not repeat the indices for the end of the first line/start of the second line, and end of the second line/start of the third line, so <code>count</code> will be four. To draw the same triangle with <code>gl.LINE_LOOP</code> the element array buffer does not repeat the first/last vertex either so <code>count</code> will be three.</p>
	 * @param type <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the type of the values in the element array buffer. Possible values are:</p>
<ul>
 <li><code>gl.UNSIGNED_BYTE</code></li>
 <li><code>gl.UNSIGNED_SHORT</code></li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/OES_element_index_uint"><code>OES_element_index_uint</code></a> extension:</p>
<ul>
 <li><code>gl.UNSIGNED_INT</code></li>
</ul>
	 * @param offset <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying a byte offset in the element array buffer. Must be a valid multiple of the size of the given <code>type</code>.</p>
	 */
	public fun drawElements(mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr);
	/**
	 * nullThe WebGLRenderingContext.enable() method of the WebGL API enables specific WebGL capabilities for this context.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/enable) official docs.
	 *
	 * @param cap <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which WebGL capability to enable. Possible values:</p>
<figure class="table-container">
 <table>
  <thead>
   <tr>
    <th>Constant</th>
    <th>Description</th>
   </tr>
  </thead>
  <tbody>
   <tr>
    <td><code>gl.BLEND</code></td>
    <td>Activates blending of the computed fragment color values. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/blendFunc"><code>WebGLRenderingContext.blendFunc()</code></a>.</td>
   </tr>
   <tr>
    <td><code>gl.CULL_FACE</code></td>
    <td>Activates culling of polygons. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/cullFace"><code>WebGLRenderingContext.cullFace()</code></a>.</td>
   </tr>
   <tr>
    <td><code>gl.DEPTH_TEST</code></td>
    <td>Activates depth comparisons and updates to the depth buffer. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/depthFunc"><code>WebGLRenderingContext.depthFunc()</code></a>.</td>
   </tr>
   <tr>
    <td><code>gl.DITHER</code></td>
    <td>Activates dithering of color components before they get written to the color buffer.</td>
   </tr>
   <tr>
    <td><code>gl.POLYGON_OFFSET_FILL</code></td>
    <td>Activates adding an offset to depth values of polygon's fragments. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/polygonOffset"><code>WebGLRenderingContext.polygonOffset()</code></a>.</td>
   </tr>
   <tr>
    <td><code>gl.SAMPLE_ALPHA_TO_COVERAGE</code></td>
    <td>Activates the computation of a temporary coverage value determined by the alpha value.</td>
   </tr>
   <tr>
    <td><code>gl.SAMPLE_COVERAGE</code></td>
    <td>Activates ANDing the fragment's coverage with the temporary coverage value. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/sampleCoverage"><code>WebGLRenderingContext.sampleCoverage()</code></a>.</td>
   </tr>
   <tr>
    <td><code>gl.SCISSOR_TEST</code></td>
    <td>Activates the scissor test that discards fragments that are outside of the scissor rectangle. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/scissor"><code>WebGLRenderingContext.scissor()</code></a>.</td>
   </tr>
   <tr>
    <td><code>gl.STENCIL_TEST</code></td>
    <td>Activates stencil testing and updates to the stencil buffer. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/stencilFunc"><code>WebGLRenderingContext.stencilFunc()</code></a>.</td>
   </tr>
  </tbody>
 </table>
</figure>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<figure class="table-container">
 <table>
  <thead>
   <tr>
    <th>Constant</th>
    <th>Description</th>
   </tr>
  </thead>
  <tbody>
   <tr>
    <td><code>gl.RASTERIZER_DISCARD</code></td>
    <td>Primitives are discarded immediately before the rasterization stage, but after the optional transform feedback stage. <code>gl.clear()</code> commands are ignored.</td>
   </tr>
  </tbody>
 </table>
</figure>
	 */
	public fun enable(cap: GLenum);
	/**
	 * nullThe WebGLRenderingContext method enableVertexAttribArray(), part of the WebGL API, turns on the generic vertex attribute array at the specified index into the list of attribute arrays. Note: You can disable the attribute array by calling disableVertexAttribArray(). In WebGL, values that apply to a specific vertex are stored in attributes. These are only available to the JavaScript code and the vertex shader. Attributes are referenced by an index number into the list of attributes maintained by the GPU. Some vertex attribute indices may have predefined purposes, depending on the platform and/or the GPU. Others are assigned by the WebGL layer when you create the attributes. Either way, since attributes cannot be used unless enabled, and are disabled by default, you need to call enableVertexAttribArray() to enable individual attributes so that they can be used. Once that's been done, other methods can be used to access the attribute, including vertexAttribPointer(), vertexAttrib*(), and getVertexAttrib().
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/enableVertexAttribArray) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index number that uniquely identifies the vertex attribute to enable. If you know the name of the attribute but not its index, you can get the index by calling <a href="/en-US/docs/Web/API/WebGLRenderingContext/getAttribLocation" title="getAttribLocation()"><code>getAttribLocation()</code></a>.</p>
	 */
	public fun enableVertexAttribArray(index: GLuint);
	/**
	 * nullThe WebGLRenderingContext.finish() method of the WebGL API blocks execution until all previously called commands are finished.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/finish) official docs.
	 *
	 */
	public fun finish();
	/**
	 * nullThe WebGLRenderingContext.flush() method of the WebGL API empties different buffer commands, causing all commands to be executed as quickly as possible.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/flush) official docs.
	 *
	 */
	public fun flush();
	/**
	 * nullThe WebGLRenderingContext.framebufferRenderbuffer() method of the WebGL API attaches a WebGLRenderbuffer object to a WebGLFramebuffer object.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/framebufferRenderbuffer) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) for the framebuffer. Possible values:</p>
<dl>
 <dt id="gl.framebuffer">
  <a href="#gl.framebuffer"><code>gl.FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.draw_framebuffer">
  <a href="#gl.draw_framebuffer"><code>gl.DRAW_FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Equivalent to <code>gl.FRAMEBUFFER</code>. Used as a destination for drawing, rendering, clearing, and writing operations.</p>
 </dd>
 <dt id="gl.read_framebuffer">
  <a href="#gl.read_framebuffer"><code>gl.READ_FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Used as a source for reading operations.</p>
 </dd>
</dl>
	 * @param attachment <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the attachment point for the render buffer. Possible values:</p>
<ul>
 <li><code>gl.COLOR_ATTACHMENT0</code>: color buffer.</li>
 <li><code>gl.DEPTH_ATTACHMENT</code>: depth buffer.</li>
 <li><code>gl.DEPTH_STENCIL_ATTACHMENT</code>: depth and stencil buffer.</li>
 <li><code>gl.STENCIL_ATTACHMENT</code>: stencil buffer.</li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.COLOR_ATTACHMENT1 gl.COLOR_ATTACHMENT2 gl.COLOR_ATTACHMENT3 gl.COLOR_ATTACHMENT4 gl.COLOR_ATTACHMENT5 gl.COLOR_ATTACHMENT6 gl.COLOR_ATTACHMENT7 gl.COLOR_ATTACHMENT8 gl.COLOR_ATTACHMENT9 gl.COLOR_ATTACHMENT10 gl.COLOR_ATTACHMENT11 gl.COLOR_ATTACHMENT12 gl.COLOR_ATTACHMENT13 gl.COLOR_ATTACHMENT14 gl.COLOR_ATTACHMENT15</code></li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/WEBGL_draw_buffers"><code>WEBGL_draw_buffers</code></a> extension:</p>
<ul>
 <li><code>ext.COLOR_ATTACHMENT0_WEBGL</code> (same as <code>gl.COLOR_ATTACHMENT0</code>)</li>
 <li><code>ext.COLOR_ATTACHMENT1_WEBGL ext.COLOR_ATTACHMENT2_WEBGL ext.COLOR_ATTACHMENT3_WEBGL ext.COLOR_ATTACHMENT4_WEBGL ext.COLOR_ATTACHMENT5_WEBGL ext.COLOR_ATTACHMENT6_WEBGL ext.COLOR_ATTACHMENT7_WEBGL ext.COLOR_ATTACHMENT8_WEBGL ext.COLOR_ATTACHMENT9_WEBGL ext.COLOR_ATTACHMENT10_WEBGL ext.COLOR_ATTACHMENT11_WEBGL ext.COLOR_ATTACHMENT12_WEBGL ext.COLOR_ATTACHMENT13_WEBGL ext.COLOR_ATTACHMENT14_WEBGL ext.COLOR_ATTACHMENT15_WEBGL</code></li>
</ul>
	 * @param renderbuffer <p>A <a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> object to attach.</p>
	 */
	public fun framebufferRenderbuffer(target: GLenum, attachment: GLenum, renderbuffer: WebGLRenderbuffer);
	/**
	 * nullThe WebGLRenderingContext.framebufferTexture2D() method of the WebGL API attaches a texture to a WebGLFramebuffer.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/framebufferTexture2D) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:</p>
<dl>
 <dt id="gl.framebuffer">
  <a href="#gl.framebuffer"><code>gl.FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.draw_framebuffer">
  <a href="#gl.draw_framebuffer"><code>gl.DRAW_FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Used as a destination for drawing, rendering, clearing, and writing operations.</p>
 </dd>
 <dt id="gl.read_framebuffer">
  <a href="#gl.read_framebuffer"><code>gl.READ_FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Used as a source for reading operations.</p>
 </dd>
</dl>
<p>When binding, <code>gl.FRAMEBUFFER</code> sets both the <code>gl.DRAW_FRAMEBUFFER</code> and <code>gl.READ_FRAMEBUFFER</code> binding points. When referencing, <code>gl.FRAMEBUFFER</code> refers to the <code>gl.DRAW_FRAMEBUFFER</code> binding</p>
	 * @param attachment <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the attachment point for the <code>texture</code>. Possible values:</p>
<ul>
 <li><code>gl.COLOR_ATTACHMENT0</code>: Attaches the texture to the framebuffer's color buffer.</li>
 <li><code>gl.DEPTH_ATTACHMENT</code>: Attaches the texture to the framebuffer's depth buffer.</li>
 <li><code>gl.STENCIL_ATTACHMENT</code>: Attaches the texture to the framebuffer's stencil buffer.</li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.DEPTH_STENCIL_ATTACHMENT</code>: depth and stencil buffer.</li>
 <li><code>gl.COLOR_ATTACHMENT1 gl.COLOR_ATTACHMENT2 gl.COLOR_ATTACHMENT3 gl.COLOR_ATTACHMENT4 gl.COLOR_ATTACHMENT5 gl.COLOR_ATTACHMENT6 gl.COLOR_ATTACHMENT7 gl.COLOR_ATTACHMENT8 gl.COLOR_ATTACHMENT9 gl.COLOR_ATTACHMENT10 gl.COLOR_ATTACHMENT11 gl.COLOR_ATTACHMENT12 gl.COLOR_ATTACHMENT13 gl.COLOR_ATTACHMENT14 gl.COLOR_ATTACHMENT15</code></li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/WEBGL_draw_buffers"><code>WEBGL_draw_buffers</code></a> extension:</p>
<ul>
 <li><code>ext.COLOR_ATTACHMENT0_WEBGL</code> (same as <code>gl.COLOR_ATTACHMENT0</code>)</li>
 <li><code>ext.COLOR_ATTACHMENT1_WEBGL ext.COLOR_ATTACHMENT2_WEBGL ext.COLOR_ATTACHMENT3_WEBGL ext.COLOR_ATTACHMENT4_WEBGL ext.COLOR_ATTACHMENT5_WEBGL ext.COLOR_ATTACHMENT6_WEBGL ext.COLOR_ATTACHMENT7_WEBGL ext.COLOR_ATTACHMENT8_WEBGL ext.COLOR_ATTACHMENT9_WEBGL ext.COLOR_ATTACHMENT10_WEBGL ext.COLOR_ATTACHMENT11_WEBGL ext.COLOR_ATTACHMENT12_WEBGL ext.COLOR_ATTACHMENT13_WEBGL ext.COLOR_ATTACHMENT14_WEBGL ext.COLOR_ATTACHMENT15_WEBGL</code></li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/WEBGL_depth_texture"><code>WEBGL_depth_texture</code></a> extension:</p>
<ul>
 <li><code>gl.DEPTH_STENCIL_ATTACHMENT</code>: Depth and stencil buffer data storage.</li>
</ul>
	 * @param textarget <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture target. Possible values:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A 2D image.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_X</code>: Image for the positive X face of the cube.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_X</code>: Image for the negative X face of the cube.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Y</code>: Image for the positive Y face of the cube.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Y</code>: Image for the negative Y face of the cube.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Z</code>: Image for the positive Z face of the cube.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Z</code>: Image for the negative Z face of the cube.</li>
</ul>
	 * @param texture <p>A <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> object whose image to attach.</p>
	 * @param level <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the mipmap level of the texture image to be attached. Must be 0.</p>
	 */
	public fun framebufferTexture2D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: WebGLTexture, level: GLint);
	/**
	 * nullThe WebGLRenderingContext.frontFace() method of the WebGL API specifies whether polygons are front- or back-facing by setting a winding orientation.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/frontFace) official docs.
	 *
	 * @param mode <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types">GLenum</a> type winding orientation. The default value is <code>gl.CCW</code>. Possible values:</p>
<ul>
 <li><code>gl.CW</code>: Clock-wise winding.</li>
 <li><code>gl.CCW</code>: Counter-clock-wise winding.</li>
</ul>
	 */
	public fun frontFace(mode: GLenum);
	/**
	 * nullThe WebGLRenderingContext.generateMipmap() method of the WebGL API generates a set of mipmaps for a WebGLTexture object. Mipmaps are used to create distance with objects. A higher-resolution mipmap is used for objects that are closer, and a lower-resolution mipmap is used for objects that are farther away. It starts with the resolution of the texture image and halves the resolution until a 1x1 dimension texture image is created.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/generateMipmap) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture whose mipmaps will be generated. Possible values:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A two-dimensional texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP</code>: A cube-mapped texture.</li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.TEXTURE_3D</code>: A three-dimensional texture.</li>
 <li><code>gl.TEXTURE_2D_ARRAY</code>: A two-dimensional array texture.</li>
</ul>
	 */
	public fun generateMipmap(target: GLenum);
	/**
	 * nullThe WebGLRenderingContext.getActiveAttrib() method of the WebGL API returns a WebGLActiveInfo object containing size, type, and name of a vertex attribute. It is generally used when querying unknown attributes either for debugging or generic library creation.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getActiveAttrib) official docs.
	 *
	 * @param program <p>A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> containing the vertex attribute.</p>
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the vertex attribute to get. This value is an index 0 to N - 1 as returned by <a href="/en-US/docs/Web/API/WebGLRenderingContext/getProgramParameter" title="gl.getProgramParameter(program, gl.ACTIVE_ATTRIBUTES)"><code>gl.getProgramParameter(program, gl.ACTIVE_ATTRIBUTES)</code></a>.</p>
	 */
	public fun getActiveAttrib(program: WebGLProgram, index: GLuint);
	/**
	 * nullThe WebGLRenderingContext.getActiveUniform() method of the WebGL API returns a WebGLActiveInfo object containing size, type, and name of a uniform attribute. It is generally used when querying unknown uniforms either for debugging or generic library creation.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getActiveUniform) official docs.
	 *
	 * @param program <p>A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> specifying the WebGL shader program from which to obtain the uniform variable's information.</p>
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the uniform attribute to get. This value is an index 0 to N - 1 as returned by <a href="/en-US/docs/Web/API/WebGLRenderingContext/getProgramParameter" title="gl.getProgramParameter(program, gl.ACTIVE_UNIFORMS)"><code>gl.getProgramParameter(program, gl.ACTIVE_UNIFORMS)</code></a>.</p>
	 */
	public fun getActiveUniform(program: WebGLProgram, index: GLuint);
	/**
	 * nullThe WebGLRenderingContext.getAttachedShaders() method of the WebGL API returns a list of WebGLShader objects attached to a WebGLProgram.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getAttachedShaders) official docs.
	 *
	 * @param program <p>A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> object to get attached shaders for.</p>
	 */
	public fun getAttachedShaders(program: WebGLProgram);
	/**
	 * nullThe WebGLRenderingContext.getAttribLocation() method of the WebGL API returns the location of an attribute variable in a given WebGLProgram.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getAttribLocation) official docs.
	 *
	 * @param program <p>A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> containing the attribute variable.</p>
	 * @param name <p>A string specifying the name of the attribute variable whose location to get.</p>
	 */
	public fun getAttribLocation(program: WebGLProgram, name: DOMString);
	/**
	 * nullThe WebGLRenderingContext.getBufferParameter() method of the WebGL API returns information about the buffer.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getBufferParameter) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target buffer object. Possible values:</p>
<dl>
 <dt id="gl.array_buffer">
  <a href="#gl.array_buffer"><code>gl.ARRAY_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data.</p>
 </dd>
 <dt id="gl.element_array_buffer">
  <a href="#gl.element_array_buffer"><code>gl.ELEMENT_ARRAY_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for element indices.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.copy_read_buffer">
  <a href="#gl.copy_read_buffer"><code>gl.COPY_READ_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for copying from one buffer object to another.</p>
 </dd>
 <dt id="gl.copy_write_buffer">
  <a href="#gl.copy_write_buffer"><code>gl.COPY_WRITE_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for copying from one buffer object to another.</p>
 </dd>
 <dt id="gl.transform_feedback_buffer">
  <a href="#gl.transform_feedback_buffer"><code>gl.TRANSFORM_FEEDBACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer for transform feedback operations.</p>
 </dd>
 <dt id="gl.uniform_buffer">
  <a href="#gl.uniform_buffer"><code>gl.UNIFORM_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for storing uniform blocks.</p>
 </dd>
 <dt id="gl.pixel_pack_buffer">
  <a href="#gl.pixel_pack_buffer"><code>gl.PIXEL_PACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for pixel transfer operations.</p>
 </dd>
 <dt id="gl.pixel_unpack_buffer">
  <a href="#gl.pixel_unpack_buffer"><code>gl.PIXEL_UNPACK_BUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer used for pixel transfer operations.</p>
 </dd>
</dl>
	 * @param pname <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying information to query. Possible values:</p>
<dl>
 <dt id="gl.buffer_size">
  <a href="#gl.buffer_size"><code>gl.BUFFER_SIZE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the size of the buffer in bytes.</p>
 </dd>
 <dt id="gl.buffer_usage">
  <a href="#gl.buffer_usage"><code>gl.BUFFER_USAGE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> indicating the usage pattern of the buffer. One of the following:</p>
  <ul>
   <li><code>gl.STATIC_DRAW</code></li>
   <li><code>gl.DYNAMIC_DRAW</code></li>
   <li><code>gl.STREAM_DRAW</code></li>
  </ul>
  <p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
  <ul>
   <li><code>gl.STATIC_READ</code></li>
   <li><code>gl.DYNAMIC_READ</code></li>
   <li><code>gl.STREAM_READ</code></li>
   <li><code>gl.STATIC_COPY</code></li>
   <li><code>gl.DYNAMIC_COPY</code></li>
   <li><code>gl.STREAM_COPY</code></li>
  </ul>
 </dd>
</dl>
	 */
	public fun getBufferParameter(target: GLenum, pname: GLenum);
	/**
	 * nullThe WebGLRenderingContext.getParameter() method of the WebGL API returns a value for the passed parameter name.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getParameter) official docs.
	 *
	 * @param pname <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which parameter value to return. See below for possible values.</p>
	 */
	public fun getParameter(pname: GLenum);
	/**
	 * nullThe WebGLRenderingContext.getError() method of the WebGL API returns error information.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getError) official docs.
	 *
	 */
	public fun getError();
	/**
	 * nullThe WebGLRenderingContext.getFramebufferAttachmentParameter() method of the WebGL API returns information about a framebuffer's attachment.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getFramebufferAttachmentParameter) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:</p>
<dl>
 <dt id="gl.framebuffer">
  <a href="#gl.framebuffer"><code>gl.FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.draw_framebuffer">
  <a href="#gl.draw_framebuffer"><code>gl.DRAW_FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Equivalent to <code>gl.FRAMEBUFFER</code>. Used as a destination for drawing, rendering, clearing, and writing operations.</p>
 </dd>
 <dt id="gl.read_framebuffer">
  <a href="#gl.read_framebuffer"><code>gl.READ_FRAMEBUFFER</code></a>
 </dt>
 <dd>
  <p>Used as a source for reading operations.</p>
 </dd>
</dl>
	 * @param attachment <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the attachment point for the <code>texture</code>. Possible values:</p>
<ul>
 <li><code>gl.COLOR_ATTACHMENT0</code>: Texture attachment for the framebuffer's color buffer.</li>
 <li><code>gl.DEPTH_ATTACHMENT</code>: Texture attachment for the framebuffer's depth buffer.</li>
 <li><code>gl.STENCIL_ATTACHMENT</code>: Texture attachment for the framebuffer's stencil buffer.</li>
 <li><code>gl.DEPTH_STENCIL_ATTACHMENT</code>: Texture attachment for both, the depth and stencil buffer.</li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.COLOR_ATTACHMENT1 gl.COLOR_ATTACHMENT2 gl.COLOR_ATTACHMENT3 gl.COLOR_ATTACHMENT4 gl.COLOR_ATTACHMENT5 gl.COLOR_ATTACHMENT6 gl.COLOR_ATTACHMENT7 gl.COLOR_ATTACHMENT8 gl.COLOR_ATTACHMENT9 gl.COLOR_ATTACHMENT10 gl.COLOR_ATTACHMENT11 gl.COLOR_ATTACHMENT12 gl.COLOR_ATTACHMENT13 gl.COLOR_ATTACHMENT14 gl.COLOR_ATTACHMENT15</code></li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/WEBGL_draw_buffers"><code>WEBGL_draw_buffers</code></a> extension:</p>
<ul>
 <li><code>ext.COLOR_ATTACHMENT0_WEBGL</code> (same as <code>gl.COLOR_ATTACHMENT0</code>) <code>ext.COLOR_ATTACHMENT1_WEBGL ext.COLOR_ATTACHMENT2_WEBGL ext.COLOR_ATTACHMENT3_WEBGL ext.COLOR_ATTACHMENT4_WEBGL ext.COLOR_ATTACHMENT5_WEBGL ext.COLOR_ATTACHMENT6_WEBGL ext.COLOR_ATTACHMENT7_WEBGL ext.COLOR_ATTACHMENT8_WEBGL ext.COLOR_ATTACHMENT9_WEBGL ext.COLOR_ATTACHMENT10_WEBGL ext.COLOR_ATTACHMENT11_WEBGL ext.COLOR_ATTACHMENT12_WEBGL ext.COLOR_ATTACHMENT13_WEBGL ext.COLOR_ATTACHMENT14_WEBGL ext.COLOR_ATTACHMENT15_WEBGL</code></li>
</ul>
	 * @param pname <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying information to query. Possible values:</p>
<ul>
 <li><code>gl.FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE</code>: The type which contains the attached image.</li>
 <li><code>gl.FRAMEBUFFER_ATTACHMENT_OBJECT_NAME</code>: The texture or renderbuffer of the attached image (<a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> or <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a>).</li>
 <li><code>gl.FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL</code>: Mipmap level. Default value: 0.</li>
 <li><code>gl.FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE</code>: The name of cube-map face of the texture.</li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/EXT_sRGB"><code>EXT_sRGB</code></a> extension:</p>
<ul>
 <li><code>ext.FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT</code>: The framebuffer color encoding.</li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE</code></li>
 <li><code>gl.FRAMEBUFFER_ATTACHMENT_BLUE_SIZE</code></li>
 <li><code>gl.FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING</code></li>
 <li><code>gl.FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE</code></li>
 <li><code>gl.FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE</code></li>
 <li><code>gl.FRAMEBUFFER_ATTACHMENT_GREEN_SIZE</code></li>
 <li><code>gl.FRAMEBUFFER_ATTACHMENT_RED_SIZE</code></li>
 <li><code>gl.FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE</code></li>
 <li><code>gl.FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER</code></li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/OVR_multiview2"><code>OVR_multiview2</code></a> extension:</p>
<ul>
 <li><code>ext.FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR</code>: the number of views of the framebuffer object attachment.</li>
 <li><code>ext.FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR</code>: the base view index of the framebuffer object attachment.</li>
</ul>
	 */
	public fun getFramebufferAttachmentParameter(target: GLenum, attachment: GLenum, pname: GLenum);
	/**
	 * nullThe WebGLRenderingContext.getProgramParameter() method of the WebGL API returns information about the given program.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getProgramParameter) official docs.
	 *
	 * @param program <p>A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> to get parameter information from.</p>
	 * @param pname <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the information to query. Possible values:</p>
<dl>
 <dt id="gl.delete_status">
  <a href="#gl.delete_status"><code>gl.DELETE_STATUS</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether or not the program is flagged for deletion.</p>
 </dd>
 <dt id="gl.link_status">
  <a href="#gl.link_status"><code>gl.LINK_STATUS</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether or not the last link operation was successful.</p>
 </dd>
 <dt id="gl.validate_status">
  <a href="#gl.validate_status"><code>gl.VALIDATE_STATUS</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether or not the last validation operation was successful.</p>
 </dd>
 <dt id="gl.attached_shaders">
  <a href="#gl.attached_shaders"><code>gl.ATTACHED_SHADERS</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of attached shaders to a program.</p>
 </dd>
 <dt id="gl.active_attributes">
  <a href="#gl.active_attributes"><code>gl.ACTIVE_ATTRIBUTES</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of active attribute variables to a program.</p>
 </dd>
 <dt id="gl.active_uniforms">
  <a href="#gl.active_uniforms"><code>gl.ACTIVE_UNIFORMS</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of active uniform variables to a program.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.transform_feedback_buffer_mode">
  <a href="#gl.transform_feedback_buffer_mode"><code>gl.TRANSFORM_FEEDBACK_BUFFER_MODE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> indicating the buffer mode when transform feedback is active. May be <code>gl.SEPARATE_ATTRIBS</code> or <code>gl.INTERLEAVED_ATTRIBS</code>.</p>
 </dd>
 <dt id="gl.transform_feedback_varyings">
  <a href="#gl.transform_feedback_varyings"><code>gl.TRANSFORM_FEEDBACK_VARYINGS</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of varying variables to capture in transform feedback mode.</p>
 </dd>
 <dt id="gl.active_uniform_blocks">
  <a href="#gl.active_uniform_blocks"><code>gl.ACTIVE_UNIFORM_BLOCKS</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of uniform blocks containing active uniforms.</p>
 </dd>
</dl>
	 */
	public fun getProgramParameter(program: WebGLProgram, pname: GLenum);
	/**
	 * nullThe WebGLRenderingContext.getProgramInfoLog returns the information log for the specified WebGLProgram object. It contains errors that occurred during failed linking or validation of WebGLProgram objects.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getProgramInfoLog) official docs.
	 *
	 * @param program <p>The <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> to query.</p>
	 */
	public fun getProgramInfoLog(program: WebGLProgram);
	/**
	 * nullThe WebGLRenderingContext.getRenderbufferParameter() method of the WebGL API returns information about the renderbuffer.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getRenderbufferParameter) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target renderbuffer object. Possible values:</p>
<dl>
 <dt id="gl.renderbuffer">
  <a href="#gl.renderbuffer"><code>gl.RENDERBUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer data storage for single images in a renderable internal format.</p>
 </dd>
</dl>
	 * @param pname <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the information to query. Possible values:</p>
<dl>
 <dt id="gl.renderbuffer_width">
  <a href="#gl.renderbuffer_width"><code>gl.RENDERBUFFER_WIDTH</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the width of the image of the currently bound renderbuffer.</p>
 </dd>
 <dt id="gl.renderbuffer_height">
  <a href="#gl.renderbuffer_height"><code>gl.RENDERBUFFER_HEIGHT</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the height of the image of the currently bound renderbuffer.</p>
 </dd>
 <dt id="gl.renderbuffer_internal_format">
  <a href="#gl.renderbuffer_internal_format"><code>gl.RENDERBUFFER_INTERNAL_FORMAT</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> indicating the internal format of the currently bound renderbuffer. The default is <code>gl.RGBA4</code>. Possible return values:</p>
  <ul>
   <li><code>gl.RGBA4</code>: 4 red bits, 4 green bits, 4 blue bits 4 alpha bits.</li>
   <li><code>gl.RGB565</code>: 5 red bits, 6 green bits, 5 blue bits.</li>
   <li><code>gl.RGB5_A1</code>: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.</li>
   <li><code>gl.DEPTH_COMPONENT16</code>: 16 depth bits.</li>
   <li><code>gl.STENCIL_INDEX8</code>: 8 stencil bits.</li>
  </ul>
 </dd>
 <dt id="gl.renderbuffer_green_size">
  <a href="#gl.renderbuffer_green_size"><code>gl.RENDERBUFFER_GREEN_SIZE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> that is the resolution size (in bits) for the green color.</p>
 </dd>
 <dt id="gl.renderbuffer_blue_size">
  <a href="#gl.renderbuffer_blue_size"><code>gl.RENDERBUFFER_BLUE_SIZE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> that is the resolution size (in bits) for the blue color.</p>
 </dd>
 <dt id="gl.renderbuffer_red_size">
  <a href="#gl.renderbuffer_red_size"><code>gl.RENDERBUFFER_RED_SIZE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> that is the resolution size (in bits) for the red color.</p>
 </dd>
 <dt id="gl.renderbuffer_alpha_size">
  <a href="#gl.renderbuffer_alpha_size"><code>gl.RENDERBUFFER_ALPHA_SIZE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> that is the resolution size (in bits) for the alpha component.</p>
 </dd>
 <dt id="gl.renderbuffer_depth_size">
  <a href="#gl.renderbuffer_depth_size"><code>gl.RENDERBUFFER_DEPTH_SIZE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> that is the resolution size (in bits) for the depth component.</p>
 </dd>
 <dt id="gl.renderbuffer_stencil_size">
  <a href="#gl.renderbuffer_stencil_size"><code>gl.RENDERBUFFER_STENCIL_SIZE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> that is the resolution size (in bits) for the stencil component.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following value is available additionally:</p>
<dl>
 <dt id="gl.renderbuffer_samples">
  <a href="#gl.renderbuffer_samples"><code>gl.RENDERBUFFER_SAMPLES</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of samples of the image of the currently bound renderbuffer.</p>
 </dd>
</dl>
	 */
	public fun getRenderbufferParameter(target: GLenum, pname: GLenum);
	/**
	 * nullThe WebGLRenderingContext.getShaderParameter() method of the WebGL API returns information about the given shader.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderParameter) official docs.
	 *
	 * @param shader <p>A <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> to get parameter information from.</p>
	 * @param pname <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the information to query. Possible values:</p>
<dl>
 <dt id="gl.delete_status">
  <a href="#gl.delete_status"><code>gl.DELETE_STATUS</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether or not the shader is flagged for deletion.</p>
 </dd>
 <dt id="gl.compile_status">
  <a href="#gl.compile_status"><code>gl.COMPILE_STATUS</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether or not the last shader compilation was successful.</p>
 </dd>
 <dt id="gl.shader_type">
  <a href="#gl.shader_type"><code>gl.SHADER_TYPE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> indicating whether the shader is a vertex shader (<code>gl.VERTEX_SHADER</code>) or fragment shader (<code>gl.FRAGMENT_SHADER</code>) object.</p>
 </dd>
</dl>
	 */
	public fun getShaderParameter(shader: WebGLShader, pname: GLenum);
	/**
	 * nullThe WebGLRenderingContext.getShaderPrecisionFormat() method of the WebGL API returns a new WebGLShaderPrecisionFormat object describing the range and precision for the specified shader numeric format.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderPrecisionFormat) official docs.
	 *
	 * @param shadertype <p>Either a <code>gl.FRAGMENT_SHADER</code> or a <code>gl.VERTEX_SHADER</code>.</p>
	 * @param precisiontype <p>A precision type value. Either <code>gl.LOW_FLOAT</code>, <code>gl.MEDIUM_FLOAT</code>, <code>gl.HIGH_FLOAT</code>, <code>gl.LOW_INT</code>, <code>gl.MEDIUM_INT</code>, or <code>gl.HIGH_INT</code>.</p>
	 */
	public fun getShaderPrecisionFormat(shadertype: GLenum, precisiontype: GLenum);
	/**
	 * nullThe WebGLRenderingContext.getShaderInfoLog returns the information log for the specified WebGLShader object. It contains warnings, debugging and compile information.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderInfoLog) official docs.
	 *
	 * @param shader <p>A <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> to query.</p>
	 */
	public fun getShaderInfoLog(shader: WebGLShader);
	/**
	 * nullThe WebGLRenderingContext.getShaderSource() method of the WebGL API returns the source code of a WebGLShader as a string.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderSource) official docs.
	 *
	 * @param shader <p>A <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> object to get the source code from.</p>
	 */
	public fun getShaderSource(shader: WebGLShader);
	/**
	 * nullThe WebGLRenderingContext.getTexParameter() method of the WebGL API returns information about the given texture.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getTexParameter) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A two-dimensional texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP</code>: A cube-mapped texture.</li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.TEXTURE_3D</code>: A three-dimensional texture.</li>
 <li><code>gl.TEXTURE_2D_ARRAY</code>: A two-dimensional array texture.</li>
</ul>
	 * @param pname <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the information to query. Possible values:</p>
<figure class="table-container">
 <table class="standard-table">
  <thead>
   <tr>
    <th scope="col">pname</th>
    <th scope="col">Return type</th>
    <th scope="col">Description</th>
    <th scope="col">Possible return values</th>
   </tr>
  </thead>
  <tbody>
   <tr>
    <th colspan="4">Available in a WebGL 1 context</th>
   </tr>
   <tr>
    <td><code>gl.TEXTURE_MAG_FILTER</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a></td>
    <td>Texture magnification filter</td>
    <td><code>gl.LINEAR</code> (default value), <code>gl.NEAREST</code>.</td>
   </tr>
   <tr>
    <td><code>gl.TEXTURE_MIN_FILTER</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a></td>
    <td>Texture minification filter</td>
    <td><code>gl.LINEAR</code>, <code>gl.NEAREST</code>, <code>gl.NEAREST_MIPMAP_NEAREST</code>, <code>gl.LINEAR_MIPMAP_NEAREST</code>, <code>gl.NEAREST</code>_MIPMAP_LINEAR (default value), <code>gl.LINEAR_MIPMAP_LINEAR</code>.</td>
   </tr>
   <tr>
    <td><code>gl.TEXTURE_WRAP_S</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a></td>
    <td>Wrapping function for texture coordinate <code>s</code></td>
    <td><code>gl.REPEAT</code> (default value), <code>gl.CLAMP_TO_EDGE</code>, <code>gl.MIRRORED_REPEAT</code>.</td>
   </tr>
   <tr>
    <td><code>gl.TEXTURE_WRAP_T</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a></td>
    <td>Wrapping function for texture coordinate <code>t</code></td>
    <td><code>gl.REPEAT</code> (default value), <code>gl.CLAMP_TO_EDGE</code>, <code>gl.MIRRORED_REPEAT</code>.</td>
   </tr>
   <tr>
    <th colspan="4">Additionally available when using the <a href="/en-US/docs/Web/API/EXT_texture_filter_anisotropic"><code>EXT_texture_filter_anisotropic</code></a> extension</th>
   </tr>
   <tr>
    <td><code>ext.TEXTURE_MAX_ANISOTROPY_EXT</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a></td>
    <td>Maximum anisotropy for a texture</td>
    <td>Any float values.</td>
   </tr>
   <tr>
    <th colspan="4">Additionally available when using a WebGL 2 context</th>
   </tr>
   <tr>
    <td><code>gl.TEXTURE_BASE_LEVEL</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a></td>
    <td>Texture mipmap level</td>
    <td>Any int values.</td>
   </tr>
   <tr>
    <td><code>gl.TEXTURE_COMPARE_FUNC</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a></td>
    <td>Comparison function</td>
    <td><code>gl.LEQUAL</code> (default value), <code>gl.GEQUAL</code>, <code>gl.LESS</code>, <code>gl.GREATER</code>, <code>gl.EQUAL</code>, <code>gl.NOTEQUAL</code>, <code>gl.ALWAYS</code>, <code>gl.NEVER</code>.</td>
   </tr>
   <tr>
    <td><code>gl.TEXTURE_COMPARE_MODE</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a></td>
    <td>Texture comparison mode</td>
    <td><code>gl.NONE</code> (default value), <code>gl.COMPARE_REF_TO_TEXTURE</code>.</td>
   </tr>
   <tr>
    <td><code>gl.TEXTURE_IMMUTABLE_FORMAT</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a></td>
    <td>Immutability of the texture format and size</td>
    <td>true or false.</td>
   </tr>
   <tr>
    <td><code>gl.TEXTURE_IMMUTABLE_LEVELS</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a></td>
    <td>?</td>
    <td>Any uint values.</td>
   </tr>
   <tr>
    <td><code>gl.TEXTURE_MAX_LEVEL</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a></td>
    <td>Maximum texture mipmap array level</td>
    <td>Any int values.</td>
   </tr>
   <tr>
    <td><code>gl.TEXTURE_MAX_LOD</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a></td>
    <td>Texture maximum level-of-detail value</td>
    <td>Any float values.</td>
   </tr>
   <tr>
    <td><code>gl.TEXTURE_MIN_LOD</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a></td>
    <td>Texture minimum level-of-detail value</td>
    <td>Any float values.</td>
   </tr>
   <tr>
    <td><code>gl.TEXTURE_WRAP_R</code></td>
    <td><a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a></td>
    <td>Wrapping function for texture coordinate <code>r</code></td>
    <td><code>gl.REPEAT</code> (default value), <code>gl.CLAMP_TO_EDGE</code>, <code>gl.MIRRORED_REPEAT</code>.</td>
   </tr>
  </tbody>
 </table>
</figure>
	 */
	public fun getTexParameter(target: GLenum, pname: GLenum);
	/**
	 * nullThe WebGLRenderingContext.getUniform() method of the WebGL API returns the value of a uniform variable at a given location.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getUniform) official docs.
	 *
	 * @param program <p>A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> containing the uniform attribute.</p>
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to get.</p>
	 */
	public fun getUniform(program: WebGLProgram, location: WebGLUniformLocation);
	/**
	 * nullPart of the WebGL API, the WebGLRenderingContext method getUniformLocation() returns the location of a specific uniform variable which is part of a given WebGLProgram. The uniform variable is returned as a WebGLUniformLocation object, which is an opaque identifier used to specify where in the GPU's memory that uniform variable is located. Once you have the uniform's location, you can access the uniform itself using one of the other uniform access methods, passing in the uniform location as one of the inputs: The uniform itself is declared in the shader program using GLSL.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getUniformLocation) official docs.
	 *
	 * @param program <p>The <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> in which to locate the specified uniform variable.</p>
	 * @param name <p>A string specifying the name of the uniform variable whose location is to be returned. The name can't have any whitespace in it, and you can't use this function to get the location of any uniforms starting with the reserved string <code>"gl_"</code>, since those are internal to the WebGL layer.</p>
<p>The possible values correspond to the uniform names returned by <a href="/en-US/docs/Web/API/WebGLRenderingContext/getActiveUniform" title="getActiveUniform"><code>getActiveUniform</code></a>; see that function for specifics on how declared uniforms map to uniform location names.</p>
<p>Additionally, for uniforms declared as arrays, the following names are also valid:</p>
<ul>
 <li>The uniform name without the <code>[0]</code> suffix. E.g. the location returned for <code>arrayUniform</code> is equivalent to the one for <code>arrayUniform[0]</code>.</li>
 <li>The uniform name indexed with an integer. E.g. the location returned for <code>arrayUniform[2]</code> would point directly to the third entry of the <code>arrayUniform</code> uniform.</li>
</ul>
	 */
	public fun getUniformLocation(program: WebGLProgram, name: DOMString);
	/**
	 * nullThe WebGLRenderingContext.getVertexAttrib() method of the WebGL API returns information about a vertex attribute at a given position.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getVertexAttrib) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the vertex attribute.</p>
	 * @param pname <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the information to query. Possible values:</p>
<dl>
 <dt id="gl.vertex_attrib_array_buffer_binding">
  <a href="#gl.vertex_attrib_array_buffer_binding"><code>gl.VERTEX_ATTRIB_ARRAY_BUFFER_BINDING</code></a>
 </dt>
 <dd>
  <p>Returns the currently bound <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a>.</p>
 </dd>
 <dt id="gl.vertex_attrib_array_enabled">
  <a href="#gl.vertex_attrib_array_enabled"><code>gl.VERTEX_ATTRIB_ARRAY_ENABLED</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> that is <code>true</code> if the vertex attribute is enabled at this <code>index</code>. Otherwise <code>false</code>.</p>
 </dd>
 <dt id="gl.vertex_attrib_array_size">
  <a href="#gl.vertex_attrib_array_size"><code>gl.VERTEX_ATTRIB_ARRAY_SIZE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the size of an element of the vertex array.</p>
 </dd>
 <dt id="gl.vertex_attrib_array_stride">
  <a href="#gl.vertex_attrib_array_stride"><code>gl.VERTEX_ATTRIB_ARRAY_STRIDE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> indicating the number of bytes between successive elements in the array. 0 means that the elements are sequential.</p>
 </dd>
 <dt id="gl.vertex_attrib_array_type">
  <a href="#gl.vertex_attrib_array_type"><code>gl.VERTEX_ATTRIB_ARRAY_TYPE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> representing the array type. One of</p>
  <ul>
   <li><code>gl.BYTE</code></li>
   <li><code>gl.UNSIGNED_BYTE</code></li>
   <li><code>gl.SHORT</code>,</li>
   <li><code>gl.UNSIGNED_SHORT</code></li>
   <li><code>gl.FLOAT</code></li>
  </ul>
 </dd>
 <dt id="gl.vertex_attrib_array_normalized">
  <a href="#gl.vertex_attrib_array_normalized"><code>gl.VERTEX_ATTRIB_ARRAY_NORMALIZED</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> that is true if fixed-point data types are normalized for the vertex attribute array at the given <code>index</code>.</p>
 </dd>
 <dt id="gl.current_vertex_attrib">
  <a href="#gl.current_vertex_attrib"><code>gl.CURRENT_VERTEX_ATTRIB</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> (with 4 elements) representing the current value of the vertex attribute at the given <code>index</code>.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.vertex_attrib_array_integer">
  <a href="#gl.vertex_attrib_array_integer"><code>gl.VERTEX_ATTRIB_ARRAY_INTEGER</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> indicating whether an integer data type is in the vertex attribute array at the given <code>index</code>.</p>
 </dd>
 <dt id="gl.vertex_attrib_array_divisor">
  <a href="#gl.vertex_attrib_array_divisor"><code>gl.VERTEX_ATTRIB_ARRAY_DIVISOR</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> describing the frequency divisor used for instanced rendering.</p>
 </dd>
</dl>
<p>When using the <a href="/en-US/docs/Web/API/ANGLE_instanced_arrays"><code>ANGLE_instanced_arrays</code></a> extension:</p>
<dl>
 <dt id="ext.vertex_attrib_array_divisor_angle">
  <a href="#ext.vertex_attrib_array_divisor_angle"><code>ext.VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE</code></a>
 </dt>
 <dd>
  <p>Returns a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> describing the frequency divisor used for instanced rendering.</p>
 </dd>
</dl>
	 */
	public fun getVertexAttrib(index: GLuint, pname: GLenum);
	/**
	 * nullThe WebGLRenderingContext.getVertexAttribOffset() method of the WebGL API returns the address of a specified vertex attribute.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getVertexAttribOffset) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the vertex attribute.</p>
	 * @param pname <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> which must be <code>gl.VERTEX_ATTRIB_ARRAY_POINTER</code>.</p>
	 */
	public fun getVertexAttribOffset(index: GLuint, pname: GLenum);
	/**
	 * nullThe WebGLRenderingContext.hint() method of the WebGL API specifies hints for certain behaviors. The interpretation of these hints depend on the implementation.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/hint) official docs.
	 *
	 * @param target <p>Sets which behavior to be controlled. Possible values:</p>
<dl>
 <dt id="gl.generate_mipmap_hint">
  <a href="#gl.generate_mipmap_hint"><code>gl.GENERATE_MIPMAP_HINT</code></a>
 </dt>
 <dd>
  <p>Quality of filtering when generating mipmap images with <a href="/en-US/docs/Web/API/WebGLRenderingContext/generateMipmap"><code>WebGLRenderingContext.generateMipmap()</code></a>.</p>
 </dd>
</dl>
<p>When using the <a href="/en-US/docs/Web/API/OES_standard_derivatives"><code>OES_standard_derivatives</code></a> extension:</p>
<dl>
 <dt id="ext.fragment_shader_derivative_hint_oes">
  <a href="#ext.fragment_shader_derivative_hint_oes"><code>ext.FRAGMENT_SHADER_DERIVATIVE_HINT_OES</code></a>
 </dt>
 <dd>
  <p>Accuracy of the derivative calculation for the GLSL built-in functions: <code>dFdx</code>, <code>dFdy</code>, and <code>fwidth</code>.</p>
 </dd>
</dl>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<dl>
 <dt id="gl.fragment_shader_derivative_hint">
  <a href="#gl.fragment_shader_derivative_hint"><code>gl.FRAGMENT_SHADER_DERIVATIVE_HINT</code></a>
 </dt>
 <dd>
  <p>Same as <code>ext.FRAGMENT_SHADER_DERIVATIVE_HINT_OES</code></p>
 </dd>
</dl>
	 * @param mode <p>Sets the behavior. The default value is <code>gl.DONT_CARE</code>. The possible values are:</p>
<ul>
 <li><code>gl.FASTEST</code>: The most efficient behavior should be used.</li>
 <li><code>gl.NICEST</code>: The most correct or the highest quality option should be used.</li>
 <li><code>gl.DONT_CARE</code>: There is no preference for this behavior.</li>
</ul>
	 */
	public fun hint(target: GLenum, mode: GLenum);
	/**
	 * nullThe WebGLRenderingContext.isBuffer() method of the WebGL API returns true if the passed WebGLBuffer is valid and false otherwise.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isBuffer) official docs.
	 *
	 * @param buffer <p>A <a href="/en-US/docs/Web/API/WebGLBuffer"><code>WebGLBuffer</code></a> to check.</p>
	 */
	public fun isBuffer(buffer: WebGLBuffer);
	/**
	 * nullThe WebGLRenderingContext.isEnabled() method of the WebGL API tests whether a specific WebGL capability is enabled or not for this context. By default, all capabilities except gl.DITHER are disabled.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isEnabled) official docs.
	 *
	 * @param cap <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which WebGL capability to test. Possible values:</p>
<figure class="table-container">
 <table>
  <thead>
   <tr>
    <th>Constant</th>
    <th>Description</th>
   </tr>
  </thead>
  <tbody>
   <tr>
    <td><code>gl.BLEND</code></td>
    <td>Blending of the computed fragment color values. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/blendFunc"><code>WebGLRenderingContext.blendFunc()</code></a>.</td>
   </tr>
   <tr>
    <td><code>gl.CULL_FACE</code></td>
    <td>Culling of polygons. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/cullFace"><code>WebGLRenderingContext.cullFace()</code></a>.</td>
   </tr>
   <tr>
    <td><code>gl.DEPTH_TEST</code></td>
    <td>Depth comparisons and updates to the depth buffer. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/depthFunc"><code>WebGLRenderingContext.depthFunc()</code></a>.</td>
   </tr>
   <tr>
    <td><code>gl.DITHER</code></td>
    <td>Dithering of color components before they get written to the color buffer.</td>
   </tr>
   <tr>
    <td><code>gl.POLYGON_OFFSET_FILL</code></td>
    <td>Adding an offset to depth values of polygon's fragments. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/polygonOffset"><code>WebGLRenderingContext.polygonOffset()</code></a>.</td>
   </tr>
   <tr>
    <td><code>gl.SAMPLE_ALPHA_TO_COVERAGE</code></td>
    <td>Computation of a temporary coverage value determined by the alpha value.</td>
   </tr>
   <tr>
    <td><code>gl.SAMPLE_COVERAGE</code></td>
    <td>ANDing the fragment's coverage with the temporary coverage value. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/sampleCoverage"><code>WebGLRenderingContext.sampleCoverage()</code></a>.</td>
   </tr>
   <tr>
    <td><code>gl.SCISSOR_TEST</code></td>
    <td>Scissor test that discards fragments that are outside of the scissor rectangle. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/scissor"><code>WebGLRenderingContext.scissor()</code></a>.</td>
   </tr>
   <tr>
    <td><code>gl.STENCIL_TEST</code></td>
    <td>Stencil testing and updates to the stencil buffer. See <a href="/en-US/docs/Web/API/WebGLRenderingContext/stencilFunc"><code>WebGLRenderingContext.stencilFunc()</code></a>.</td>
   </tr>
  </tbody>
 </table>
</figure>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<figure class="table-container">
 <table>
  <thead>
   <tr>
    <th>Constant</th>
    <th>Description</th>
   </tr>
  </thead>
  <tbody>
   <tr>
    <td><code>gl.RASTERIZER_DISCARD</code></td>
    <td>Primitives are discarded immediately before the rasterization stage, but after the optional transform feedback stage. <code>gl.clear()</code> commands are ignored.</td>
   </tr>
  </tbody>
 </table>
</figure>
	 */
	public fun isEnabled(cap: GLenum);
	/**
	 * nullThe WebGLRenderingContext.isFramebuffer() method of the WebGL API returns true if the passed WebGLFramebuffer is valid and false otherwise.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isFramebuffer) official docs.
	 *
	 * @param framebuffer <p>A <a href="/en-US/docs/Web/API/WebGLFramebuffer"><code>WebGLFramebuffer</code></a> to check.</p>
	 */
	public fun isFramebuffer(framebuffer: WebGLFramebuffer);
	/**
	 * nullThe WebGLRenderingContext.isProgram() method of the WebGL API returns true if the passed WebGLProgram is valid, false otherwise.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isProgram) official docs.
	 *
	 * @param program <p>A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> to check.</p>
	 */
	public fun isProgram(program: WebGLProgram);
	/**
	 * nullThe WebGLRenderingContext.isRenderbuffer() method of the WebGL API returns true if the passed WebGLRenderbuffer is valid and false otherwise.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isRenderbuffer) official docs.
	 *
	 * @param renderbuffer <p>A <a href="/en-US/docs/Web/API/WebGLRenderbuffer"><code>WebGLRenderbuffer</code></a> to check.</p>
	 */
	public fun isRenderbuffer(renderbuffer: WebGLRenderbuffer);
	/**
	 * nullThe WebGLRenderingContext.isShader() method of the WebGL API returns true if the passed WebGLShader is valid, false otherwise.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isShader) official docs.
	 *
	 * @param shader <p>A <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> to check.</p>
	 */
	public fun isShader(shader: WebGLShader);
	/**
	 * nullThe WebGLRenderingContext.isTexture() method of the WebGL API returns true if the passed WebGLTexture is valid and false otherwise.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isTexture) official docs.
	 *
	 * @param texture <p>A <a href="/en-US/docs/Web/API/WebGLTexture"><code>WebGLTexture</code></a> to check.</p>
	 */
	public fun isTexture(texture: WebGLTexture);
	/**
	 * nullThe WebGLRenderingContext.lineWidth() method of the WebGL API sets the line width of rasterized lines. Warning: The webgl spec, based on the OpenGL ES 2.0/3.0 specs points out that the minimum and maximum width for a line is implementation defined. The maximum minimum width is allowed to be 1.0. The minimum maximum width is also allowed to be 1.0. Because of these implementation defined limits it is not recommended to use line widths other than 1.0 since there is no guarantee any user's browser will display any other width. As of January 2017 most implementations of WebGL only support a minimum of 1 and a maximum of 1 as the technology they are based on has these same limits.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/lineWidth) official docs.
	 *
	 * @param width <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> specifying the width of rasterized lines. Default value: 1.</p>
	 */
	public fun lineWidth(width: GLfloat);
	/**
	 * nullThe WebGLRenderingContext interface's linkProgram() method links a given WebGLProgram, completing the process of preparing the GPU code for the program's fragment and vertex shaders.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/linkProgram) official docs.
	 *
	 * @param program <p>The <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> to link.</p>
	 */
	public fun linkProgram(program: WebGLProgram);
	/**
	 * nullThe WebGLRenderingContext.pixelStorei() method of the WebGL API specifies the pixel storage modes.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/pixelStorei) official docs.
	 *
	 * @param pname <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying which parameter to set. See below for possible values.</p>
	 * @param param <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying a value to set the <code>pname</code> parameter to. See below for possible values.</p>
	 */
	public fun pixelStorei(pname: GLenum, param: GLint);
	/**
	 * nullThe WebGLRenderingContext.polygonOffset() method of the WebGL API specifies the scale factors and units to calculate depth values. The offset is added before the depth test is performed and before the value is written into the depth buffer.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/polygonOffset) official docs.
	 *
	 * @param factor <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> which sets the scale factor for the variable depth offset for each polygon. The default value is 0.</p>
	 * @param units <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> which sets the multiplier by which an implementation-specific value is multiplied with to create a constant depth offset. The default value is 0.</p>
	 */
	public fun polygonOffset(factor: GLfloat, units: GLfloat);
	/**
	 * nullThe WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into a TypedArray or a DataView object.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels) official docs.
	 *
	 * @param x <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the first horizontal pixel that is read from the lower left corner of a rectangular block of pixels.</p>
	 * @param y <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the first vertical pixel that is read from the lower left corner of a rectangular block of pixels.</p>
	 * @param width <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the rectangle.</p>
	 * @param height <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the rectangle.</p>
	 * @param format <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the format of the pixel data. Possible values:</p>
<dl>
 <dt id="gl.alpha">
  <a href="#gl.alpha"><code>gl.ALPHA</code></a>
 </dt>
 <dd>
  <p>Discards the red, green and blue components and reads the alpha component.</p>
 </dd>
 <dt id="gl.rgb">
  <a href="#gl.rgb"><code>gl.RGB</code></a>
 </dt>
 <dd>
  <p>Discards the alpha components and reads the red, green and blue components.</p>
 </dd>
 <dt id="gl.rgba">
  <a href="#gl.rgba"><code>gl.RGBA</code></a>
 </dt>
 <dd>
  <p>Red, green, blue and alpha components are read from the color buffer.</p>
 </dd>
</dl>
<p>WebGL2 adds</p>
<ul>
 <li><code>gl.RED</code></li>
 <li><code>gl.RG</code></li>
 <li><code>gl.RED_INTEGER</code></li>
 <li><code>gl.RG_INTEGER</code></li>
 <li><code>gl.RGB_INTEGER</code></li>
 <li><code>gl.RGBA_INTEGER</code></li>
</ul>
	 * @param type <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the data type of the pixel data. Possible values:</p>
<ul>
 <li><code>gl.UNSIGNED_BYTE</code></li>
 <li><code>gl.UNSIGNED_SHORT_5_6_5</code></li>
 <li><code>gl.UNSIGNED_SHORT_4_4_4_4</code></li>
 <li><code>gl.UNSIGNED_SHORT_5_5_5_1</code></li>
 <li><code>gl.FLOAT</code></li>
</ul>
<p>WebGL2 adds</p>
<ul>
 <li><code>gl.BYTE</code></li>
 <li><code>gl.UNSIGNED_INT_2_10_10_10_REV</code></li>
 <li><code>gl.HALF_FLOAT</code></li>
 <li><code>gl.SHORT</code></li>
 <li><code>gl.UNSIGNED_SHORT</code></li>
 <li><code>gl.INT</code></li>
 <li><code>gl.UNSIGNED_INT</code></li>
 <li><code>gl.UNSIGNED_INT_10F_11F_11F_REV</code></li>
 <li><code>gl.UNSIGNED_INT_5_9_9_9_REV</code></li>
</ul>
	 * @param pixels <p>An object to read data into. The array type must match the type of the <code>type</code> parameter:</p>
<ul>
 <li><a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array"><code>Uint8Array</code></a> for <code>gl.UNSIGNED_BYTE</code>.</li>
 <li><a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array"><code>Uint16Array</code></a> for <code>gl.UNSIGNED_SHORT_5_6_5</code>, <code>gl.UNSIGNED_SHORT_4_4_4_4</code>, or <code>gl.UNSIGNED_SHORT_5_5_5_1</code>.</li>
 <li><a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> for <code>gl.FLOAT</code>.</li>
</ul>
	 */
	public fun readPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: ArrayBufferView);
	/**
	 * nullThe WebGLRenderingContext.renderbufferStorage() method of the WebGL API creates and initializes a renderbuffer object's data store.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/renderbufferStorage) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the target renderbuffer object. Possible values:</p>
<dl>
 <dt id="gl.renderbuffer">
  <a href="#gl.renderbuffer"><code>gl.RENDERBUFFER</code></a>
 </dt>
 <dd>
  <p>Buffer data storage for single images in a renderable internal format.</p>
 </dd>
</dl>
	 * @param internalformat <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the internal format of the renderbuffer. Possible values:</p>
<ul>
 <li><code>gl.RGBA4</code>: 4 red bits, 4 green bits, 4 blue bits 4 alpha bits.</li>
 <li><code>gl.RGB565</code>: 5 red bits, 6 green bits, 5 blue bits.</li>
 <li><code>gl.RGB5_A1</code>: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.</li>
 <li><code>gl.DEPTH_COMPONENT16</code>: 16 depth bits.</li>
 <li><code>gl.STENCIL_INDEX8</code>: 8 stencil bits.</li>
 <li><code>gl.DEPTH_STENCIL</code></li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.R8</code></li>
 <li><code>gl.R8UI</code></li>
 <li><code>gl.R8I</code></li>
 <li><code>gl.R16UI</code></li>
 <li><code>gl.R16I</code></li>
 <li><code>gl.R32UI</code></li>
 <li><code>gl.R32I</code></li>
 <li><code>gl.RG8</code></li>
 <li><code>gl.RG8UI</code></li>
 <li><code>gl.RG8I</code></li>
 <li><code>gl.RG16UI</code></li>
 <li><code>gl.RG16I</code></li>
 <li><code>gl.RG32UI</code></li>
 <li><code>gl.RG32I</code></li>
 <li><code>gl.RGB8</code></li>
 <li><code>gl.RGBA8</code></li>
 <li><code>gl.SRGB8_ALPHA8</code> (also available as an extension for WebGL 1, see below)</li>
 <li><code>gl.RGB10_A2</code></li>
 <li><code>gl.RGBA8UI</code></li>
 <li><code>gl.RGBA8I</code></li>
 <li><code>gl.RGB10_A2UI</code></li>
 <li><code>gl.RGBA16UI</code></li>
 <li><code>gl.RGBA16I</code></li>
 <li><code>gl.RGBA32I</code></li>
 <li><code>gl.RGBA32UI</code></li>
 <li><code>gl.DEPTH_COMPONENT24</code></li>
 <li><code>gl.DEPTH_COMPONENT32F</code></li>
 <li><code>gl.DEPTH24_STENCIL8</code></li>
 <li><code>gl.DEPTH32F_STENCIL8</code></li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/WEBGL_color_buffer_float"><code>WEBGL_color_buffer_float</code></a> extension:</p>
<ul>
 <li><code>ext.RGBA32F_EXT</code>: RGBA 32-bit floating-point type.</li>
 <li><code>ext.RGB32F_EXT</code>: RGB 32-bit floating-point type.</li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/EXT_sRGB"><code>EXT_sRGB</code></a> extension:</p>
<ul>
 <li><code>ext.SRGB8_ALPHA8_EXT</code>: 8-bit sRGB and alpha.</li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a> and the <a href="/en-US/docs/Web/API/EXT_color_buffer_float"><code>EXT_color_buffer_float</code></a> extension:</p>
<ul>
 <li><code>gl.R16F</code></li>
 <li><code>gl.RG16F</code></li>
 <li><code>gl.RGBA16F</code></li>
 <li><code>gl.R32F</code></li>
 <li><code>gl.RG32F</code></li>
 <li><code>gl.RGBA32F</code></li>
 <li><code>gl.R11F_G11F_B10F</code></li>
</ul>
	 * @param width <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the renderbuffer in pixels.</p>
	 * @param height <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the renderbuffer in pixels.</p>
	 */
	public fun renderbufferStorage(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei);
	/**
	 * nullThe WebGLRenderingContext.sampleCoverage() method of the WebGL API specifies multi-sample coverage parameters for anti-aliasing effects.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/sampleCoverage) official docs.
	 *
	 * @param value <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLclampf"><code>GLclampf</code></a> which sets a single floating-point coverage value clamped to the range [0,1]. The default value is 1.0.</p>
	 * @param invert <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> which sets whether or not the coverage masks should be inverted. The default value is <code>false</code>.</p>
	 */
	public fun sampleCoverage(value: GLclampf, invert: GLboolean);
	/**
	 * nullThe WebGLRenderingContext.scissor() method of the WebGL API sets a scissor box, which limits the drawing to a specified rectangle.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/scissor) official docs.
	 *
	 * @param x <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the horizontal coordinate for the lower left corner of the box. Default value: 0.</p>
	 * @param y <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the vertical coordinate for the lower left corner of the box. Default value: 0.</p>
	 * @param width <p>A non-negative <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the scissor box. Default value: width of the canvas.</p>
	 * @param height <p>A non-negative <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the scissor box. Default value: height of the canvas.</p>
	 */
	public fun scissor(x: GLint, y: GLint, width: GLsizei, height: GLsizei);
	/**
	 * nullThe WebGLRenderingContext.shaderSource() method of the WebGL API sets the source code of a WebGLShader.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/shaderSource) official docs.
	 *
	 * @param shader <p>A <a href="/en-US/docs/Web/API/WebGLShader"><code>WebGLShader</code></a> object in which to set the source code.</p>
	 * @param source <p>A string containing the GLSL source code to set.</p>
	 */
	public fun shaderSource(shader: WebGLShader, source: DOMString);
	/**
	 * nullThe WebGLRenderingContext.stencilFunc() method of the WebGL API sets the front and back function and reference value for stencil testing. Stenciling enables and disables drawing on a per-pixel basis. It is typically used in multipass rendering to achieve special effects.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilFunc) official docs.
	 *
	 * @param func <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the test function. The default function is <code>gl.ALWAYS</code>. The possible values are:</p>
<ul>
 <li><code>gl.NEVER</code>: Never pass.</li>
 <li><code>gl.LESS</code>: Pass if <code>(ref &amp; mask) &lt; (stencil &amp; mask)</code>.</li>
 <li><code>gl.EQUAL</code>: Pass if <code>(ref &amp; mask) = (stencil &amp; mask)</code>.</li>
 <li><code>gl.LEQUAL</code>: Pass if <code>(ref &amp; mask) &lt;= (stencil &amp; mask)</code>.</li>
 <li><code>gl.GREATER</code>: Pass if <code>(ref &amp; mask) &gt; (stencil &amp; mask)</code>.</li>
 <li><code>gl.NOTEQUAL</code>: Pass if <code>(ref &amp; mask) !== (stencil &amp; mask)</code>.</li>
 <li><code>gl.GEQUAL</code>: Pass if <code>(ref &amp; mask) &gt;= (stencil &amp; mask)</code>.</li>
 <li><code>gl.ALWAYS</code>: Always pass.</li>
</ul>
	 * @param ref <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the reference value for the stencil test. This value is clamped to the range 0 to 2^n - 1 where n is the number of bitplanes in the stencil buffer. The default value is 0.</p>
	 * @param mask <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying a bit-wise mask that is used to AND the reference value and the stored stencil value when the test is done. The default value is all 1.</p>
	 */
	public fun stencilFunc(func: GLenum, ref: GLint, mask: GLuint);
	/**
	 * nullThe WebGLRenderingContext.stencilFuncSeparate() method of the WebGL API sets the front and/or back function and reference value for stencil testing. Stencilling enables and disables drawing on a per-pixel basis. It is typically used in multipass rendering to achieve special effects.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilFuncSeparate) official docs.
	 *
	 * @param face <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying whether the front and/or back stencil state is updated. The possible values are:</p>
<ul>
 <li><code>gl.FRONT</code></li>
 <li><code>gl.BACK</code></li>
 <li><code>gl.FRONT_AND_BACK</code></li>
</ul>
	 * @param func <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the test function. The default function is <code>gl.ALWAYS</code>. The possible values are:</p>
<ul>
 <li><code>gl.NEVER</code>: Never pass.</li>
 <li><code>gl.LESS</code>: Pass if <code>(ref &amp; mask) &lt; (stencil &amp; mask)</code>.</li>
 <li><code>gl.EQUAL</code>: Pass if <code>(ref &amp; mask) = (stencil &amp; mask)</code>.</li>
 <li><code>gl.LEQUAL</code>: Pass if <code>(ref &amp; mask) &lt;= (stencil &amp; mask)</code>.</li>
 <li><code>gl.GREATER</code>: Pass if <code>(ref &amp; mask) &gt; (stencil &amp; mask)</code>.</li>
 <li><code>gl.NOTEQUAL</code>: Pass if <code>(ref &amp; mask) !== (stencil &amp; mask)</code>.</li>
 <li><code>gl.GEQUAL</code>: Pass if <code>(ref &amp; mask) &gt;= (stencil &amp; mask)</code>.</li>
 <li><code>gl.ALWAYS</code>: Always pass.</li>
</ul>
	 * @param ref <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the reference value for the stencil test. This value is clamped to the range 0 to 2^n - 1 where n is the number of bitplanes in the stencil buffer. The default value is 0.</p>
	 * @param mask <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying a bit-wise mask that is used to AND the reference value and the stored stencil value when the test is done. The default value is all 1.</p>
	 */
	public fun stencilFuncSeparate(face: GLenum, func: GLenum, ref: GLint, mask: GLuint);
	/**
	 * nullThe WebGLRenderingContext.stencilMask() method of the WebGL API controls enabling and disabling of both the front and back writing of individual bits in the stencil planes. The WebGLRenderingContext.stencilMaskSeparate() method can set front and back stencil writemasks to different values.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilMask) official docs.
	 *
	 * @param mask <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying a bit mask to enable or disable writing of individual bits in the stencil planes. By default, the mask is all 1.</p>
	 */
	public fun stencilMask(mask: GLuint);
	/**
	 * nullThe WebGLRenderingContext.stencilMaskSeparate() method of the WebGL API controls enabling and disabling of front and/or back writing of individual bits in the stencil planes. The WebGLRenderingContext.stencilMask() method can set both, the front and back stencil writemasks to one value at the same time.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilMaskSeparate) official docs.
	 *
	 * @param face <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying whether the front and/or back stencil writemask is updated. The possible values are:</p>
<ul>
 <li><code>gl.FRONT</code></li>
 <li><code>gl.BACK</code></li>
 <li><code>gl.FRONT_AND_BACK</code></li>
</ul>
	 * @param mask <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying a bit mask to enable or disable writing of individual bits in the stencil planes. By default, the mask is all 1.</p>
	 */
	public fun stencilMaskSeparate(face: GLenum, mask: GLuint);
	/**
	 * nullThe WebGLRenderingContext.stencilOp() method of the WebGL API sets both the front and back-facing stencil test actions.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilOp) official docs.
	 *
	 * @param fail <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the function to use when the stencil test fails. The default value is <code>gl.KEEP</code>.</p>
	 * @param zfail <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the function to use when the stencil test passes, but the depth test fails. The default value is <code>gl.KEEP</code>.</p>
	 * @param zpass <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the function to use when both the stencil test and the depth test pass, or when the stencil test passes and there is no depth buffer or depth testing is disabled. The default value is <code>gl.KEEP</code>.</p>
	 */
	public fun stencilOp(fail: GLenum, zfail: GLenum, zpass: GLenum);
	/**
	 * nullThe WebGLRenderingContext.stencilOpSeparate() method of the WebGL API sets the front and/or back-facing stencil test actions.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilOpSeparate) official docs.
	 *
	 * @param face <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying whether the front and/or back stencil state is updated. The possible values are:</p>
<ul>
 <li><code>gl.FRONT</code></li>
 <li><code>gl.BACK</code></li>
 <li><code>gl.FRONT_AND_BACK</code></li>
</ul>
	 * @param fail <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the function to use when the stencil test fails. The default value is <code>gl.KEEP</code>.</p>
	 * @param zfail <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the function to use when the stencil test passes, but the depth test fails. The default value is <code>gl.KEEP</code>.</p>
	 * @param zpass <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the function to use when both the stencil test and the depth test pass, or when the stencil test passes and there is no depth buffer or depth testing is disabled. The default value is <code>gl.KEEP</code>.</p>
	 */
	public fun stencilOpSeparate(face: GLenum, fail: GLenum, zfail: GLenum, zpass: GLenum);
	/**
	 * nullThe WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A two-dimensional texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_X</code>: Positive X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_X</code>: Negative X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Y</code>: Positive Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Y</code>: Negative Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Z</code>: Positive Z face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Z</code>: Negative Z face for a cube-mapped texture.</li>
</ul>
	 * @param level <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.</p>
	 * @param internalformat <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the color components in the texture.</p>
<p>Possible values in both WebGL1 and WebGL2</p>
<figure class="table-container">
 <table>
  <thead>
   <tr>
    <td>Format</td>
    <td>Type</td>
    <td>Channels</td>
    <td>Bytes per pixel</td>
   </tr>
  </thead>
  <tbody>
   <tr>
    <td>RGBA</td>
    <td>UNSIGNED_BYTE</td>
    <td>4</td>
    <td>4</td>
   </tr>
   <tr>
    <td>RGB</td>
    <td>UNSIGNED_BYTE</td>
    <td>3</td>
    <td>3</td>
   </tr>
   <tr>
    <td>RGBA</td>
    <td>UNSIGNED_SHORT_4_4_4_4</td>
    <td>4</td>
    <td>2</td>
   </tr>
   <tr>
    <td>RGBA</td>
    <td>UNSIGNED_SHORT_5_5_5_1</td>
    <td>4</td>
    <td>2</td>
   </tr>
   <tr>
    <td>RGB</td>
    <td>UNSIGNED_SHORT_5_6_5</td>
    <td>3</td>
    <td>2</td>
   </tr>
   <tr>
    <td>LUMINANCE_ALPHA</td>
    <td>UNSIGNED_BYTE</td>
    <td>2</td>
    <td>2</td>
   </tr>
   <tr>
    <td>LUMINANCE</td>
    <td>UNSIGNED_BYTE</td>
    <td>1</td>
    <td>1</td>
   </tr>
   <tr>
    <td>ALPHA</td>
    <td>UNSIGNED_BYTE</td>
    <td>1</td>
    <td>1</td>
   </tr>
  </tbody>
 </table>
</figure>
<p>Other possible values in WebGL2 for the versions of <code>texImage2D</code> that take a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a>, or a <code>GLintptr offset</code></p>
<figure class="table-container">
 <table>
  <thead>
   <tr>
    <td><strong>Sized<br>
      Format</strong></td>
    <td><strong>Base<br>
      Format</strong></td>
    <td><strong>R<br>
      bits</strong></td>
    <td><strong>G<br>
      bits</strong></td>
    <td><strong>B<br>
      bits</strong></td>
    <td><strong>A<br>
      bits</strong></td>
    <td><strong>Shared<br>
      bits</strong></td>
    <td><strong>Color<br>
      renderable</strong></td>
    <td><strong>Texture<br>
      filterable</strong></td>
   </tr>
  </thead>
  <tbody>
   <tr>
    <td>R8</td>
    <td>RED</td>
    <td>8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>R8_SNORM</td>
    <td>RED</td>
    <td>s8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RG8</td>
    <td>RG</td>
    <td>8</td>
    <td>8</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RG8_SNORM</td>
    <td>RG</td>
    <td>s8</td>
    <td>s8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB8</td>
    <td>RGB</td>
    <td>8</td>
    <td>8</td>
    <td>8</td>
    <td></td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB8_SNORM</td>
    <td>RGB</td>
    <td>s8</td>
    <td>s8</td>
    <td>s8</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB565</td>
    <td>RGB</td>
    <td>5</td>
    <td>6</td>
    <td>5</td>
    <td></td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGBA4</td>
    <td>RGBA</td>
    <td>4</td>
    <td>4</td>
    <td>4</td>
    <td>4</td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB5_A1</td>
    <td>RGBA</td>
    <td>5</td>
    <td>5</td>
    <td>5</td>
    <td>1</td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGBA8</td>
    <td>RGBA</td>
    <td>8</td>
    <td>8</td>
    <td>8</td>
    <td>8</td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGBA8_SNORM</td>
    <td>RGBA</td>
    <td>s8</td>
    <td>s8</td>
    <td>s8</td>
    <td>s8</td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB10_A2</td>
    <td>RGBA</td>
    <td>10</td>
    <td>10</td>
    <td>10</td>
    <td>2</td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB10_A2UI</td>
    <td>RGBA</td>
    <td>ui10</td>
    <td>ui10</td>
    <td>ui10</td>
    <td>ui2</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>SRGB8</td>
    <td>RGB</td>
    <td>8</td>
    <td>8</td>
    <td>8</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>SRGB8_ALPHA8</td>
    <td>RGBA</td>
    <td>8</td>
    <td>8</td>
    <td>8</td>
    <td>8</td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>R16F</td>
    <td>RED</td>
    <td>f16</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RG16F</td>
    <td>RG</td>
    <td>f16</td>
    <td>f16</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB16F</td>
    <td>RGB</td>
    <td>f16</td>
    <td>f16</td>
    <td>f16</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGBA16F</td>
    <td>RGBA</td>
    <td>f16</td>
    <td>f16</td>
    <td>f16</td>
    <td>f16</td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>R32F</td>
    <td>RED</td>
    <td>f32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RG32F</td>
    <td>RG</td>
    <td>f32</td>
    <td>f32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGB32F</td>
    <td>RGB</td>
    <td>f32</td>
    <td>f32</td>
    <td>f32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA32F</td>
    <td>RGBA</td>
    <td>f32</td>
    <td>f32</td>
    <td>f32</td>
    <td>f32</td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>R11F_G11F_B10F</td>
    <td>RGB</td>
    <td>f11</td>
    <td>f11</td>
    <td>f10</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB9_E5</td>
    <td>RGB</td>
    <td>9</td>
    <td>9</td>
    <td>9</td>
    <td></td>
    <td>5</td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>R8I</td>
    <td>RED</td>
    <td>i8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>R8UI</td>
    <td>RED</td>
    <td>ui8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>R16I</td>
    <td>RED</td>
    <td>i16</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>R16UI</td>
    <td>RED</td>
    <td>ui16</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>R32I</td>
    <td>RED</td>
    <td>i32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>R32UI</td>
    <td>RED</td>
    <td>ui32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RG8I</td>
    <td>RG</td>
    <td>i8</td>
    <td>i8</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RG8UI</td>
    <td>RG</td>
    <td>ui8</td>
    <td>ui8</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RG16I</td>
    <td>RG</td>
    <td>i16</td>
    <td>i16</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RG16UI</td>
    <td>RG</td>
    <td>ui16</td>
    <td>ui16</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RG32I</td>
    <td>RG</td>
    <td>i32</td>
    <td>i32</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RG32UI</td>
    <td>RG</td>
    <td>ui32</td>
    <td>ui32</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RGB8I</td>
    <td>RGB</td>
    <td>i8</td>
    <td>i8</td>
    <td>i8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGB8UI</td>
    <td>RGB</td>
    <td>ui8</td>
    <td>ui8</td>
    <td>ui8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGB16I</td>
    <td>RGB</td>
    <td>i16</td>
    <td>i16</td>
    <td>i16</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGB16UI</td>
    <td>RGB</td>
    <td>ui16</td>
    <td>ui16</td>
    <td>ui16</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGB32I</td>
    <td>RGB</td>
    <td>i32</td>
    <td>i32</td>
    <td>i32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGB32UI</td>
    <td>RGB</td>
    <td>ui32</td>
    <td>ui32</td>
    <td>ui32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA8I</td>
    <td>RGBA</td>
    <td>i8</td>
    <td>i8</td>
    <td>i8</td>
    <td>i8</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA8UI</td>
    <td>RGBA</td>
    <td>ui8</td>
    <td>ui8</td>
    <td>ui8</td>
    <td>ui8</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA16I</td>
    <td>RGBA</td>
    <td>i16</td>
    <td>i16</td>
    <td>i16</td>
    <td>i16</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA16UI</td>
    <td>RGBA</td>
    <td>ui16</td>
    <td>ui16</td>
    <td>ui16</td>
    <td>ui16</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA32I</td>
    <td>RGBA</td>
    <td>i32</td>
    <td>i32</td>
    <td>i32</td>
    <td>i32</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA32UI</td>
    <td>RGBA</td>
    <td>ui32</td>
    <td>ui32</td>
    <td>ui32</td>
    <td>ui32</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
  </tbody>
 </table>
</figure>
<p>Possible values in WebGL2 for the versions of <code>texImage2D</code> that take a texture an <code>HTMLImageElement</code>, <code>HTMLCanvasElement</code>, <code>HTMLVideoElement</code>, <code>ImageBitmap</code>, or <code>ImageData</code></p>
<ul>
 <li><code>gl.ALPHA</code>: Discards the red, green and blue components and reads the alpha component.</li>
 <li><code>gl.RGB</code>: Discards the alpha components and reads the red, green and blue components.</li>
 <li><code>gl.RGBA</code>: Red, green, blue and alpha components are read from the color buffer.</li>
 <li><code>gl.LUMINANCE</code>: Each color component is a luminance component, alpha is 1.0.</li>
 <li><code>gl.LUMINANCE_ALPHA</code>: Each component is a luminance/alpha component.</li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/WEBGL_depth_texture"><code>WEBGL_depth_texture</code></a> extension:</p>
<ul>
 <li><code>gl.DEPTH_COMPONENT</code></li>
 <li><code>gl.DEPTH_STENCIL</code></li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/EXT_sRGB"><code>EXT_sRGB</code></a> extension:</p>
<ul>
 <li><code>ext.SRGB_EXT</code></li>
 <li><code>ext.SRGB_ALPHA_EXT</code></li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.R8</code></li>
 <li><code>gl.R16F</code></li>
 <li><code>gl.R32F</code></li>
 <li><code>gl.R8UI</code></li>
 <li><code>gl.RG8</code></li>
 <li><code>gl.RG16F</code></li>
 <li><code>gl.RG32F</code></li>
 <li><code>gl.RG8UI</code></li>
 <li><code>gl.RG16UI</code></li>
 <li><code>gl.RG32UI</code></li>
 <li><code>gl.RGB8</code></li>
 <li><code>gl.SRGB8</code></li>
 <li><code>gl.RGB565</code></li>
 <li><code>gl.R11F_G11F_B10F</code></li>
 <li><code>gl.RGB9_E5</code></li>
 <li><code>gl.RGB16F</code></li>
 <li><code>gl.RGB32F</code></li>
 <li><code>gl.RGB8UI</code></li>
 <li><code>gl.RGBA8</code></li>
 <li><code>gl.SRGB8_ALPHA8</code></li>
 <li><code>gl.RGB5_A1</code></li>
 <li><code>gl.RGB10_A2</code></li>
 <li><code>gl.RGBA4</code></li>
 <li><code>gl.RGBA16F</code></li>
 <li><code>gl.RGBA32F</code></li>
 <li><code>gl.RGBA8UI</code></li>
</ul>
	 * @param type <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the data type of the texel data. Possible values:</p>
<ul>
 <li><code>gl.UNSIGNED_BYTE</code>: 8 bits per channel for <code>gl.RGBA</code></li>
 <li><code>gl.UNSIGNED_SHORT_5_6_5</code>: 5 red bits, 6 green bits, 5 blue bits.</li>
 <li><code>gl.UNSIGNED_SHORT_4_4_4_4</code>: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.</li>
 <li><code>gl.UNSIGNED_SHORT_5_5_5_1</code>: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.</li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/WEBGL_depth_texture"><code>WEBGL_depth_texture</code></a> extension:</p>
<ul>
 <li><code>gl.UNSIGNED_SHORT</code></li>
 <li><code>gl.UNSIGNED_INT</code></li>
 <li><code>ext.UNSIGNED_INT_24_8_WEBGL</code> (constant provided by the extension)</li>
 <li>When using the <a href="/en-US/docs/Web/API/OES_texture_float"><code>OES_texture_float</code></a> extension: 
  <ul>
   <li><code>gl.FLOAT</code></li>
  </ul></li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/OES_texture_half_float"><code>OES_texture_half_float</code></a> extension:</p>
<ul>
 <li><code>ext.HALF_FLOAT_OES</code> (constant provided by the extension)</li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.BYTE</code></li>
 <li><code>gl.UNSIGNED_SHORT</code></li>
 <li><code>gl.SHORT</code></li>
 <li><code>gl.UNSIGNED_INT</code></li>
 <li><code>gl.INT</code></li>
 <li><code>gl.HALF_FLOAT</code></li>
 <li><code>gl.FLOAT</code></li>
 <li><code>gl.UNSIGNED_INT_2_10_10_10_REV</code></li>
 <li><code>gl.UNSIGNED_INT_10F_11F_11F_REV</code></li>
 <li><code>gl.UNSIGNED_INT_5_9_9_9_REV</code></li>
 <li><code>gl.UNSIGNED_INT_24_8</code></li>
 <li><code>gl.FLOAT_32_UNSIGNED_INT_24_8_REV</code> (pixels must be <a href="/en-US/docs/Web/JavaScript/Reference/Operators/null"><code>null</code></a>)</li>
</ul>
	 * @param pixels <p>The following types can always be used as a pixel source for the texture:</p>
<ul>
 <li><a href="/en-US/docs/Web/API/ImageData"><code>ImageData</code></a>,</li>
 <li><a href="/en-US/docs/Web/API/HTMLImageElement"><code>HTMLImageElement</code></a>,</li>
 <li><a href="/en-US/docs/Web/API/HTMLCanvasElement"><code>HTMLCanvasElement</code></a>,</li>
 <li><a href="/en-US/docs/Web/API/HTMLVideoElement"><code>HTMLVideoElement</code></a>,</li>
 <li><a href="/en-US/docs/Web/API/ImageBitmap"><code>ImageBitmap</code></a>.</li>
</ul>
<p>The following types can only be used as a pixel source when <code>width</code>, <code>height</code>, and <code>border</code> are specified:</p>
<ul>
 <li><a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array"><code>Uint8Array</code></a> (must be used if <code>type</code> is <code>gl.UNSIGNED_BYTE</code>)</li>
 <li><a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array"><code>Uint16Array</code></a> (must be used if <code>type</code> is either <code>gl.UNSIGNED_SHORT_5_6_5</code>, <code>gl.UNSIGNED_SHORT_4_4_4_4</code>, <code>gl.UNSIGNED_SHORT_5_5_5_1</code>, <code>gl.UNSIGNED_SHORT</code> or <code>ext.HALF_FLOAT_OES</code>)</li>
 <li><a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint32Array"><code>Uint32Array</code></a> (must be used if <code>type</code> is <code>gl.UNSIGNED_INT</code> or <code>ext.UNSIGNED_INT_24_8_WEBGL</code>)</li>
 <li><a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> (must be used if <code>type</code> is <code>gl.FLOAT</code>)</li>
</ul>
	 */
	public fun texImage2D(target: GLenum, level: GLint, internalformat: GLenum, type: GLenum, pixels: ArrayBufferView);
	/**
	 * nullThe WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
	 *
	 * Problems found during importing:
	 * Parameter 'source' with type TexImageSource non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A two-dimensional texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_X</code>: Positive X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_X</code>: Negative X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Y</code>: Positive Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Y</code>: Negative Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Z</code>: Positive Z face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Z</code>: Negative Z face for a cube-mapped texture.</li>
</ul>
	 * @param level <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.</p>
	 * @param internalformat <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the color components in the texture.</p>
<p>Possible values in both WebGL1 and WebGL2</p>
<figure class="table-container">
 <table>
  <thead>
   <tr>
    <td>Format</td>
    <td>Type</td>
    <td>Channels</td>
    <td>Bytes per pixel</td>
   </tr>
  </thead>
  <tbody>
   <tr>
    <td>RGBA</td>
    <td>UNSIGNED_BYTE</td>
    <td>4</td>
    <td>4</td>
   </tr>
   <tr>
    <td>RGB</td>
    <td>UNSIGNED_BYTE</td>
    <td>3</td>
    <td>3</td>
   </tr>
   <tr>
    <td>RGBA</td>
    <td>UNSIGNED_SHORT_4_4_4_4</td>
    <td>4</td>
    <td>2</td>
   </tr>
   <tr>
    <td>RGBA</td>
    <td>UNSIGNED_SHORT_5_5_5_1</td>
    <td>4</td>
    <td>2</td>
   </tr>
   <tr>
    <td>RGB</td>
    <td>UNSIGNED_SHORT_5_6_5</td>
    <td>3</td>
    <td>2</td>
   </tr>
   <tr>
    <td>LUMINANCE_ALPHA</td>
    <td>UNSIGNED_BYTE</td>
    <td>2</td>
    <td>2</td>
   </tr>
   <tr>
    <td>LUMINANCE</td>
    <td>UNSIGNED_BYTE</td>
    <td>1</td>
    <td>1</td>
   </tr>
   <tr>
    <td>ALPHA</td>
    <td>UNSIGNED_BYTE</td>
    <td>1</td>
    <td>1</td>
   </tr>
  </tbody>
 </table>
</figure>
<p>Other possible values in WebGL2 for the versions of <code>texImage2D</code> that take a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray"><code>TypedArray</code></a> or a <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView"><code>DataView</code></a>, or a <code>GLintptr offset</code></p>
<figure class="table-container">
 <table>
  <thead>
   <tr>
    <td><strong>Sized<br>
      Format</strong></td>
    <td><strong>Base<br>
      Format</strong></td>
    <td><strong>R<br>
      bits</strong></td>
    <td><strong>G<br>
      bits</strong></td>
    <td><strong>B<br>
      bits</strong></td>
    <td><strong>A<br>
      bits</strong></td>
    <td><strong>Shared<br>
      bits</strong></td>
    <td><strong>Color<br>
      renderable</strong></td>
    <td><strong>Texture<br>
      filterable</strong></td>
   </tr>
  </thead>
  <tbody>
   <tr>
    <td>R8</td>
    <td>RED</td>
    <td>8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>R8_SNORM</td>
    <td>RED</td>
    <td>s8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RG8</td>
    <td>RG</td>
    <td>8</td>
    <td>8</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RG8_SNORM</td>
    <td>RG</td>
    <td>s8</td>
    <td>s8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB8</td>
    <td>RGB</td>
    <td>8</td>
    <td>8</td>
    <td>8</td>
    <td></td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB8_SNORM</td>
    <td>RGB</td>
    <td>s8</td>
    <td>s8</td>
    <td>s8</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB565</td>
    <td>RGB</td>
    <td>5</td>
    <td>6</td>
    <td>5</td>
    <td></td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGBA4</td>
    <td>RGBA</td>
    <td>4</td>
    <td>4</td>
    <td>4</td>
    <td>4</td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB5_A1</td>
    <td>RGBA</td>
    <td>5</td>
    <td>5</td>
    <td>5</td>
    <td>1</td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGBA8</td>
    <td>RGBA</td>
    <td>8</td>
    <td>8</td>
    <td>8</td>
    <td>8</td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGBA8_SNORM</td>
    <td>RGBA</td>
    <td>s8</td>
    <td>s8</td>
    <td>s8</td>
    <td>s8</td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB10_A2</td>
    <td>RGBA</td>
    <td>10</td>
    <td>10</td>
    <td>10</td>
    <td>2</td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB10_A2UI</td>
    <td>RGBA</td>
    <td>ui10</td>
    <td>ui10</td>
    <td>ui10</td>
    <td>ui2</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>SRGB8</td>
    <td>RGB</td>
    <td>8</td>
    <td>8</td>
    <td>8</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>SRGB8_ALPHA8</td>
    <td>RGBA</td>
    <td>8</td>
    <td>8</td>
    <td>8</td>
    <td>8</td>
    <td></td>
    <td>●</td>
    <td>●</td>
   </tr>
   <tr>
    <td>R16F</td>
    <td>RED</td>
    <td>f16</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RG16F</td>
    <td>RG</td>
    <td>f16</td>
    <td>f16</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB16F</td>
    <td>RGB</td>
    <td>f16</td>
    <td>f16</td>
    <td>f16</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGBA16F</td>
    <td>RGBA</td>
    <td>f16</td>
    <td>f16</td>
    <td>f16</td>
    <td>f16</td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>R32F</td>
    <td>RED</td>
    <td>f32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RG32F</td>
    <td>RG</td>
    <td>f32</td>
    <td>f32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGB32F</td>
    <td>RGB</td>
    <td>f32</td>
    <td>f32</td>
    <td>f32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA32F</td>
    <td>RGBA</td>
    <td>f32</td>
    <td>f32</td>
    <td>f32</td>
    <td>f32</td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>R11F_G11F_B10F</td>
    <td>RGB</td>
    <td>f11</td>
    <td>f11</td>
    <td>f10</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>RGB9_E5</td>
    <td>RGB</td>
    <td>9</td>
    <td>9</td>
    <td>9</td>
    <td></td>
    <td>5</td>
    <td></td>
    <td>●</td>
   </tr>
   <tr>
    <td>R8I</td>
    <td>RED</td>
    <td>i8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>R8UI</td>
    <td>RED</td>
    <td>ui8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>R16I</td>
    <td>RED</td>
    <td>i16</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>R16UI</td>
    <td>RED</td>
    <td>ui16</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>R32I</td>
    <td>RED</td>
    <td>i32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>R32UI</td>
    <td>RED</td>
    <td>ui32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RG8I</td>
    <td>RG</td>
    <td>i8</td>
    <td>i8</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RG8UI</td>
    <td>RG</td>
    <td>ui8</td>
    <td>ui8</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RG16I</td>
    <td>RG</td>
    <td>i16</td>
    <td>i16</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RG16UI</td>
    <td>RG</td>
    <td>ui16</td>
    <td>ui16</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RG32I</td>
    <td>RG</td>
    <td>i32</td>
    <td>i32</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RG32UI</td>
    <td>RG</td>
    <td>ui32</td>
    <td>ui32</td>
    <td></td>
    <td></td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RGB8I</td>
    <td>RGB</td>
    <td>i8</td>
    <td>i8</td>
    <td>i8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGB8UI</td>
    <td>RGB</td>
    <td>ui8</td>
    <td>ui8</td>
    <td>ui8</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGB16I</td>
    <td>RGB</td>
    <td>i16</td>
    <td>i16</td>
    <td>i16</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGB16UI</td>
    <td>RGB</td>
    <td>ui16</td>
    <td>ui16</td>
    <td>ui16</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGB32I</td>
    <td>RGB</td>
    <td>i32</td>
    <td>i32</td>
    <td>i32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGB32UI</td>
    <td>RGB</td>
    <td>ui32</td>
    <td>ui32</td>
    <td>ui32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA8I</td>
    <td>RGBA</td>
    <td>i8</td>
    <td>i8</td>
    <td>i8</td>
    <td>i8</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA8UI</td>
    <td>RGBA</td>
    <td>ui8</td>
    <td>ui8</td>
    <td>ui8</td>
    <td>ui8</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA16I</td>
    <td>RGBA</td>
    <td>i16</td>
    <td>i16</td>
    <td>i16</td>
    <td>i16</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA16UI</td>
    <td>RGBA</td>
    <td>ui16</td>
    <td>ui16</td>
    <td>ui16</td>
    <td>ui16</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA32I</td>
    <td>RGBA</td>
    <td>i32</td>
    <td>i32</td>
    <td>i32</td>
    <td>i32</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
   <tr>
    <td>RGBA32UI</td>
    <td>RGBA</td>
    <td>ui32</td>
    <td>ui32</td>
    <td>ui32</td>
    <td>ui32</td>
    <td></td>
    <td>●</td>
    <td></td>
   </tr>
  </tbody>
 </table>
</figure>
<p>Possible values in WebGL2 for the versions of <code>texImage2D</code> that take a texture an <code>HTMLImageElement</code>, <code>HTMLCanvasElement</code>, <code>HTMLVideoElement</code>, <code>ImageBitmap</code>, or <code>ImageData</code></p>
<ul>
 <li><code>gl.ALPHA</code>: Discards the red, green and blue components and reads the alpha component.</li>
 <li><code>gl.RGB</code>: Discards the alpha components and reads the red, green and blue components.</li>
 <li><code>gl.RGBA</code>: Red, green, blue and alpha components are read from the color buffer.</li>
 <li><code>gl.LUMINANCE</code>: Each color component is a luminance component, alpha is 1.0.</li>
 <li><code>gl.LUMINANCE_ALPHA</code>: Each component is a luminance/alpha component.</li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/WEBGL_depth_texture"><code>WEBGL_depth_texture</code></a> extension:</p>
<ul>
 <li><code>gl.DEPTH_COMPONENT</code></li>
 <li><code>gl.DEPTH_STENCIL</code></li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/EXT_sRGB"><code>EXT_sRGB</code></a> extension:</p>
<ul>
 <li><code>ext.SRGB_EXT</code></li>
 <li><code>ext.SRGB_ALPHA_EXT</code></li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.R8</code></li>
 <li><code>gl.R16F</code></li>
 <li><code>gl.R32F</code></li>
 <li><code>gl.R8UI</code></li>
 <li><code>gl.RG8</code></li>
 <li><code>gl.RG16F</code></li>
 <li><code>gl.RG32F</code></li>
 <li><code>gl.RG8UI</code></li>
 <li><code>gl.RG16UI</code></li>
 <li><code>gl.RG32UI</code></li>
 <li><code>gl.RGB8</code></li>
 <li><code>gl.SRGB8</code></li>
 <li><code>gl.RGB565</code></li>
 <li><code>gl.R11F_G11F_B10F</code></li>
 <li><code>gl.RGB9_E5</code></li>
 <li><code>gl.RGB16F</code></li>
 <li><code>gl.RGB32F</code></li>
 <li><code>gl.RGB8UI</code></li>
 <li><code>gl.RGBA8</code></li>
 <li><code>gl.SRGB8_ALPHA8</code></li>
 <li><code>gl.RGB5_A1</code></li>
 <li><code>gl.RGB10_A2</code></li>
 <li><code>gl.RGBA4</code></li>
 <li><code>gl.RGBA16F</code></li>
 <li><code>gl.RGBA32F</code></li>
 <li><code>gl.RGBA8UI</code></li>
</ul>
	 * @param format <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the format of the texel data. In WebGL 1, this must be the same as <code>internalformat</code> (see above). in WebGL 2, the combinations are listed in <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE" class="external" target="_blank">this table</a>.</p>
	 * @param type <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the data type of the texel data. Possible values:</p>
<ul>
 <li><code>gl.UNSIGNED_BYTE</code>: 8 bits per channel for <code>gl.RGBA</code></li>
 <li><code>gl.UNSIGNED_SHORT_5_6_5</code>: 5 red bits, 6 green bits, 5 blue bits.</li>
 <li><code>gl.UNSIGNED_SHORT_4_4_4_4</code>: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.</li>
 <li><code>gl.UNSIGNED_SHORT_5_5_5_1</code>: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.</li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/WEBGL_depth_texture"><code>WEBGL_depth_texture</code></a> extension:</p>
<ul>
 <li><code>gl.UNSIGNED_SHORT</code></li>
 <li><code>gl.UNSIGNED_INT</code></li>
 <li><code>ext.UNSIGNED_INT_24_8_WEBGL</code> (constant provided by the extension)</li>
 <li>When using the <a href="/en-US/docs/Web/API/OES_texture_float"><code>OES_texture_float</code></a> extension: 
  <ul>
   <li><code>gl.FLOAT</code></li>
  </ul></li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/OES_texture_half_float"><code>OES_texture_half_float</code></a> extension:</p>
<ul>
 <li><code>ext.HALF_FLOAT_OES</code> (constant provided by the extension)</li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.BYTE</code></li>
 <li><code>gl.UNSIGNED_SHORT</code></li>
 <li><code>gl.SHORT</code></li>
 <li><code>gl.UNSIGNED_INT</code></li>
 <li><code>gl.INT</code></li>
 <li><code>gl.HALF_FLOAT</code></li>
 <li><code>gl.FLOAT</code></li>
 <li><code>gl.UNSIGNED_INT_2_10_10_10_REV</code></li>
 <li><code>gl.UNSIGNED_INT_10F_11F_11F_REV</code></li>
 <li><code>gl.UNSIGNED_INT_5_9_9_9_REV</code></li>
 <li><code>gl.UNSIGNED_INT_24_8</code></li>
 <li><code>gl.FLOAT_32_UNSIGNED_INT_24_8_REV</code> (pixels must be <a href="/en-US/docs/Web/JavaScript/Reference/Operators/null"><code>null</code></a>)</li>
</ul>
	 * @param source This parameter caused unspecified trouble!
	 */
	//public fun texImage2D(target: GLenum, level: GLint, internalformat: GLenum, format: GLenum, type: GLenum, source: TexImageSource);
	/**
	 * nullThe WebGLRenderingContext.texParameter[fi]() methods of the WebGL API set texture parameters.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texParameter) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A two-dimensional texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP</code>: A cube-mapped texture.</li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.TEXTURE_3D</code>: A three-dimensional texture.</li>
 <li><code>gl.TEXTURE_2D_ARRAY</code>: A two-dimensional array texture.</li>
</ul>
	 * @param pname <p>The <code>pname</code> parameter is a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture parameter to set.</p>
	 * @param param <p>The <code>param</code> parameter is a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> or <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the value for the specified parameter</p>
	 */
	public fun texParameterf(target: GLenum, pname: GLenum, param: GLfloat);
	/**
	 * nullThe WebGLRenderingContext.texParameter[fi]() methods of the WebGL API set texture parameters.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texParameter) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target). Possible values:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A two-dimensional texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP</code>: A cube-mapped texture.</li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.TEXTURE_3D</code>: A three-dimensional texture.</li>
 <li><code>gl.TEXTURE_2D_ARRAY</code>: A two-dimensional array texture.</li>
</ul>
	 * @param pname <p>The <code>pname</code> parameter is a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the texture parameter to set.</p>
	 * @param param <p>The <code>param</code> parameter is a <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLfloat"><code>GLfloat</code></a> or <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the value for the specified parameter</p>
	 */
	public fun texParameteri(target: GLenum, pname: GLenum, param: GLint);
	/**
	 * nullThe WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A two-dimensional texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_X</code>: Positive X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_X</code>: Negative X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Y</code>: Positive Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Y</code>: Negative Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Z</code>: Positive Z face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Z</code>: Negative Z face for a cube-mapped texture.</li>
</ul>
	 * @param level <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.</p>
	 * @param xoffset <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the lower left texel x coordinate of a width-wide by height-wide rectangular subregion of the texture array.</p>
	 * @param yoffset <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the lower left texel y coordinate of a width-wide by height-wide rectangular subregion of the texture array.</p>
	 * @param format <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the format of the texel data. Possible values:</p>
<ul>
 <li><code>gl.ALPHA</code>: Discards the red, green and blue components and reads the alpha component.</li>
 <li><code>gl.RGB</code>: Discards the alpha components and reads the red, green and blue components.</li>
 <li><code>gl.RGBA</code>: Red, green, blue and alpha components are read from the color buffer.</li>
 <li><code>gl.LUMINANCE</code>: Each color component is a luminance component, alpha is 1.0.</li>
 <li><code>gl.LUMINANCE_ALPHA</code>: Each component is a luminance/alpha component.</li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/EXT_sRGB"><code>EXT_sRGB</code></a> extension:</p>
<ul>
 <li><code>ext.SRGB_EXT</code></li>
 <li><code>ext.SRGB_ALPHA_EXT</code></li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.RED</code></li>
 <li><code>gl.RG</code></li>
 <li><code>gl.RED_INTEGER</code></li>
 <li><code>gl.RG_INTEGER</code></li>
 <li><code>gl.RGB_INTEGER</code></li>
 <li><code>gl.RGBA_INTEGER</code></li>
</ul>
	 * @param type <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the data type of the texel data. Possible values:</p>
<ul>
 <li><code>gl.UNSIGNED_BYTE</code>: 8 bits per channel for <code>gl.RGBA</code></li>
 <li><code>gl.UNSIGNED_SHORT_5_6_5</code>: 5 red bits, 6 green bits, 5 blue bits.</li>
 <li><code>gl.UNSIGNED_SHORT_4_4_4_4</code>: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.</li>
 <li><code>gl.UNSIGNED_SHORT_5_5_5_1</code>: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.</li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/OES_texture_float"><code>OES_texture_float</code></a> extension:</p>
<ul>
 <li><code>gl.FLOAT</code></li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/OES_texture_half_float"><code>OES_texture_half_float</code></a> extension:</p>
<ul>
 <li><code>gl.HALF_FLOAT_OES</code></li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.BYTE</code></li>
 <li><code>gl.UNSIGNED_SHORT</code></li>
 <li><code>gl.SHORT</code></li>
 <li><code>gl.UNSIGNED_INT</code></li>
 <li><code>gl.INT</code></li>
 <li><code>gl.HALF_FLOAT</code></li>
 <li><code>gl.FLOAT</code></li>
 <li><code>gl.UNSIGNED_INT_2_10_10_10_REV</code></li>
 <li><code>gl.UNSIGNED_INT_10F_11F_11F_REV</code></li>
 <li><code>gl.UNSIGNED_INT_5_9_9_9_REV</code></li>
 <li><code>gl.UNSIGNED_INT_24_8</code></li>
 <li><code>gl.FLOAT_32_UNSIGNED_INT_24_8_REV</code> (pixels must be <a href="/en-US/docs/Web/JavaScript/Reference/Operators/null"><code>null</code></a>)</li>
</ul>
	 * @param pixels <p>One of the following objects can be used as a pixel source for the texture:</p>
<ul>
 <li><a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array"><code>Uint8Array</code></a> (Must be used if <code>type</code> is <code>gl.UNSIGNED_BYTE</code>)</li>
 <li><a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array"><code>Uint16Array</code></a> (Must be used if <code>type</code> is either <code>gl.UNSIGNED_SHORT_5_6_5</code>, <code>gl.UNSIGNED_SHORT_4_4_4_4</code>, <code>gl.UNSIGNED_SHORT_5_5_5_1</code>, or <code>ext.HALF_FLOAT_OES</code>)</li>
 <li><a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> (Must be used if <code>type</code> is <code>gl.FLOAT</code>)</li>
 <li><a href="/en-US/docs/Web/API/ImageData"><code>ImageData</code></a>,</li>
 <li><a href="/en-US/docs/Web/API/HTMLImageElement"><code>HTMLImageElement</code></a>,</li>
 <li><a href="/en-US/docs/Web/API/HTMLCanvasElement"><code>HTMLCanvasElement</code></a>,</li>
 <li><a href="/en-US/docs/Web/API/HTMLVideoElement"><code>HTMLVideoElement</code></a>,</li>
 <li><a href="/en-US/docs/Web/API/ImageBitmap"><code>ImageBitmap</code></a>.</li>
</ul>
	 */
	public fun texSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, format: GLenum, type: GLenum, pixels: ArrayBufferView);
	/**
	 * nullThe WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
	 *
	 * Problems found during importing:
	 * Parameter 'source' with type TexImageSource non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D) official docs.
	 *
	 * @param target <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the binding point (target) of the active texture. Possible values:</p>
<ul>
 <li><code>gl.TEXTURE_2D</code>: A two-dimensional texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_X</code>: Positive X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_X</code>: Negative X face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Y</code>: Positive Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Y</code>: Negative Y face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_POSITIVE_Z</code>: Positive Z face for a cube-mapped texture.</li>
 <li><code>gl.TEXTURE_CUBE_MAP_NEGATIVE_Z</code>: Negative Z face for a cube-mapped texture.</li>
</ul>
	 * @param level <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the level of detail. Level 0 is the base image level and level <em>n</em> is the n-th mipmap reduction level.</p>
	 * @param xoffset <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the lower left texel x coordinate of a width-wide by height-wide rectangular subregion of the texture array.</p>
	 * @param yoffset <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the lower left texel y coordinate of a width-wide by height-wide rectangular subregion of the texture array.</p>
	 * @param format <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the format of the texel data. Possible values:</p>
<ul>
 <li><code>gl.ALPHA</code>: Discards the red, green and blue components and reads the alpha component.</li>
 <li><code>gl.RGB</code>: Discards the alpha components and reads the red, green and blue components.</li>
 <li><code>gl.RGBA</code>: Red, green, blue and alpha components are read from the color buffer.</li>
 <li><code>gl.LUMINANCE</code>: Each color component is a luminance component, alpha is 1.0.</li>
 <li><code>gl.LUMINANCE_ALPHA</code>: Each component is a luminance/alpha component.</li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/EXT_sRGB"><code>EXT_sRGB</code></a> extension:</p>
<ul>
 <li><code>ext.SRGB_EXT</code></li>
 <li><code>ext.SRGB_ALPHA_EXT</code></li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.RED</code></li>
 <li><code>gl.RG</code></li>
 <li><code>gl.RED_INTEGER</code></li>
 <li><code>gl.RG_INTEGER</code></li>
 <li><code>gl.RGB_INTEGER</code></li>
 <li><code>gl.RGBA_INTEGER</code></li>
</ul>
	 * @param type <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the data type of the texel data. Possible values:</p>
<ul>
 <li><code>gl.UNSIGNED_BYTE</code>: 8 bits per channel for <code>gl.RGBA</code></li>
 <li><code>gl.UNSIGNED_SHORT_5_6_5</code>: 5 red bits, 6 green bits, 5 blue bits.</li>
 <li><code>gl.UNSIGNED_SHORT_4_4_4_4</code>: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.</li>
 <li><code>gl.UNSIGNED_SHORT_5_5_5_1</code>: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.</li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/OES_texture_float"><code>OES_texture_float</code></a> extension:</p>
<ul>
 <li><code>gl.FLOAT</code></li>
</ul>
<p>When using the <a href="/en-US/docs/Web/API/OES_texture_half_float"><code>OES_texture_half_float</code></a> extension:</p>
<ul>
 <li><code>gl.HALF_FLOAT_OES</code></li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.BYTE</code></li>
 <li><code>gl.UNSIGNED_SHORT</code></li>
 <li><code>gl.SHORT</code></li>
 <li><code>gl.UNSIGNED_INT</code></li>
 <li><code>gl.INT</code></li>
 <li><code>gl.HALF_FLOAT</code></li>
 <li><code>gl.FLOAT</code></li>
 <li><code>gl.UNSIGNED_INT_2_10_10_10_REV</code></li>
 <li><code>gl.UNSIGNED_INT_10F_11F_11F_REV</code></li>
 <li><code>gl.UNSIGNED_INT_5_9_9_9_REV</code></li>
 <li><code>gl.UNSIGNED_INT_24_8</code></li>
 <li><code>gl.FLOAT_32_UNSIGNED_INT_24_8_REV</code> (pixels must be <a href="/en-US/docs/Web/JavaScript/Reference/Operators/null"><code>null</code></a>)</li>
</ul>
	 * @param source This parameter caused unspecified trouble!
	 */
	//public fun texSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, format: GLenum, type: GLenum, source: TexImageSource);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'x' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param x This parameter caused unspecified trouble!
	 */
	//public fun uniform1f(location: WebGLUniformLocation, x: GLfloat);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type Float32Array non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform1fv(location: WebGLUniformLocation, v: Float32Array);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type sequence<GLfloat> non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform1fv(location: WebGLUniformLocation, v: List<GLfloat>);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'x' with type GLint non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param x This parameter caused unspecified trouble!
	 */
	//public fun uniform1i(location: WebGLUniformLocation, x: GLint);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type Int32Array non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform1iv(location: WebGLUniformLocation, v: Int32Array);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type sequence<long> non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform1iv(location: WebGLUniformLocation, v: List<Long>);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'x' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 * Parameter 'y' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param x This parameter caused unspecified trouble!
	 * @param y This parameter caused unspecified trouble!
	 */
	//public fun uniform2f(location: WebGLUniformLocation, x: GLfloat, y: GLfloat);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type Float32Array non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform2fv(location: WebGLUniformLocation, v: Float32Array);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type sequence<GLfloat> non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform2fv(location: WebGLUniformLocation, v: List<GLfloat>);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'x' with type GLint non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 * Parameter 'y' with type GLint non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param x This parameter caused unspecified trouble!
	 * @param y This parameter caused unspecified trouble!
	 */
	//public fun uniform2i(location: WebGLUniformLocation, x: GLint, y: GLint);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type Int32Array non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform2iv(location: WebGLUniformLocation, v: Int32Array);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type sequence<long> non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform2iv(location: WebGLUniformLocation, v: List<Long>);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'x' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 * Parameter 'y' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 * Parameter 'z' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param x This parameter caused unspecified trouble!
	 * @param y This parameter caused unspecified trouble!
	 * @param z This parameter caused unspecified trouble!
	 */
	//public fun uniform3f(location: WebGLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type Float32Array non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform3fv(location: WebGLUniformLocation, v: Float32Array);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type sequence<GLfloat> non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform3fv(location: WebGLUniformLocation, v: List<GLfloat>);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'x' with type GLint non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 * Parameter 'y' with type GLint non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 * Parameter 'z' with type GLint non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param x This parameter caused unspecified trouble!
	 * @param y This parameter caused unspecified trouble!
	 * @param z This parameter caused unspecified trouble!
	 */
	//public fun uniform3i(location: WebGLUniformLocation, x: GLint, y: GLint, z: GLint);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type Int32Array non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform3iv(location: WebGLUniformLocation, v: Int32Array);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type sequence<long> non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform3iv(location: WebGLUniformLocation, v: List<Long>);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'x' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 * Parameter 'y' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 * Parameter 'z' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 * Parameter 'w' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param x This parameter caused unspecified trouble!
	 * @param y This parameter caused unspecified trouble!
	 * @param z This parameter caused unspecified trouble!
	 * @param w This parameter caused unspecified trouble!
	 */
	//public fun uniform4f(location: WebGLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type Float32Array non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform4fv(location: WebGLUniformLocation, v: Float32Array);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type sequence<GLfloat> non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform4fv(location: WebGLUniformLocation, v: List<GLfloat>);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'x' with type GLint non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 * Parameter 'y' with type GLint non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 * Parameter 'z' with type GLint non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 * Parameter 'w' with type GLint non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param x This parameter caused unspecified trouble!
	 * @param y This parameter caused unspecified trouble!
	 * @param z This parameter caused unspecified trouble!
	 * @param w This parameter caused unspecified trouble!
	 */
	//public fun uniform4i(location: WebGLUniformLocation, x: GLint, y: GLint, z: GLint, w: GLint);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type Int32Array non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform4iv(location: WebGLUniformLocation, v: Int32Array);
	/**
	 * nullThe WebGLRenderingContext.uniform[1234][fi][v]() methods of the WebGL API specify values of uniform variables. All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to this method until the next successful link operation occurs on the program object, when they are once again initialized to 0. Note: Many of the functions described here have expanded WebGL 2 interfaces, which can be found under WebGL2RenderingContext.uniform[1234][uif][v]().
	 *
	 * Problems found during importing:
	 * Parameter 'v' with type sequence<long> non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify.</p>
	 * @param v This parameter caused unspecified trouble!
	 */
	//public fun uniform4iv(location: WebGLUniformLocation, v: List<Long>);
	/**
	 * nullThe WebGLRenderingContext.uniformMatrix[234]fv() methods of the WebGL API specify matrix values for uniform variables. The three versions of this method (uniformMatrix2fv(), uniformMatrix3fv(), and uniformMatrix4fv()) take as the input value 2-component, 3-component, and 4-component square matrices, respectively. They are expected to have 4, 9 or 16 floats.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniformMatrix) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify. The location is obtained using <a href="/en-US/docs/Web/API/WebGLRenderingContext/getUniformLocation" title="getUniformLocation()"><code>getUniformLocation()</code></a>.</p>
	 * @param transpose <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether to transpose the matrix. Must be <code>false</code>.</p>
	 * @param value <p>A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> or sequence of <code>GLfloat</code> values. The values are assumed to be supplied in column major order.</p>
	 */
	public fun uniformMatrix2fv(location: WebGLUniformLocation, transpose: GLboolean, value: Float32Array);
	/**
	 * nullThe WebGLRenderingContext.uniformMatrix[234]fv() methods of the WebGL API specify matrix values for uniform variables. The three versions of this method (uniformMatrix2fv(), uniformMatrix3fv(), and uniformMatrix4fv()) take as the input value 2-component, 3-component, and 4-component square matrices, respectively. They are expected to have 4, 9 or 16 floats.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniformMatrix) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify. The location is obtained using <a href="/en-US/docs/Web/API/WebGLRenderingContext/getUniformLocation" title="getUniformLocation()"><code>getUniformLocation()</code></a>.</p>
	 * @param transpose <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether to transpose the matrix. Must be <code>false</code>.</p>
	 * @param value <p>A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> or sequence of <code>GLfloat</code> values. The values are assumed to be supplied in column major order.</p>
	 */
	public fun uniformMatrix2fv(location: WebGLUniformLocation, transpose: GLboolean, value: List<GLfloat>);
	/**
	 * nullThe WebGLRenderingContext.uniformMatrix[234]fv() methods of the WebGL API specify matrix values for uniform variables. The three versions of this method (uniformMatrix2fv(), uniformMatrix3fv(), and uniformMatrix4fv()) take as the input value 2-component, 3-component, and 4-component square matrices, respectively. They are expected to have 4, 9 or 16 floats.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniformMatrix) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify. The location is obtained using <a href="/en-US/docs/Web/API/WebGLRenderingContext/getUniformLocation" title="getUniformLocation()"><code>getUniformLocation()</code></a>.</p>
	 * @param transpose <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether to transpose the matrix. Must be <code>false</code>.</p>
	 * @param value <p>A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> or sequence of <code>GLfloat</code> values. The values are assumed to be supplied in column major order.</p>
	 */
	public fun uniformMatrix3fv(location: WebGLUniformLocation, transpose: GLboolean, value: Float32Array);
	/**
	 * nullThe WebGLRenderingContext.uniformMatrix[234]fv() methods of the WebGL API specify matrix values for uniform variables. The three versions of this method (uniformMatrix2fv(), uniformMatrix3fv(), and uniformMatrix4fv()) take as the input value 2-component, 3-component, and 4-component square matrices, respectively. They are expected to have 4, 9 or 16 floats.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniformMatrix) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify. The location is obtained using <a href="/en-US/docs/Web/API/WebGLRenderingContext/getUniformLocation" title="getUniformLocation()"><code>getUniformLocation()</code></a>.</p>
	 * @param transpose <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether to transpose the matrix. Must be <code>false</code>.</p>
	 * @param value <p>A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> or sequence of <code>GLfloat</code> values. The values are assumed to be supplied in column major order.</p>
	 */
	public fun uniformMatrix3fv(location: WebGLUniformLocation, transpose: GLboolean, value: List<GLfloat>);
	/**
	 * nullThe WebGLRenderingContext.uniformMatrix[234]fv() methods of the WebGL API specify matrix values for uniform variables. The three versions of this method (uniformMatrix2fv(), uniformMatrix3fv(), and uniformMatrix4fv()) take as the input value 2-component, 3-component, and 4-component square matrices, respectively. They are expected to have 4, 9 or 16 floats.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniformMatrix) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify. The location is obtained using <a href="/en-US/docs/Web/API/WebGLRenderingContext/getUniformLocation" title="getUniformLocation()"><code>getUniformLocation()</code></a>.</p>
	 * @param transpose <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether to transpose the matrix. Must be <code>false</code>.</p>
	 * @param value <p>A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> or sequence of <code>GLfloat</code> values. The values are assumed to be supplied in column major order.</p>
	 */
	public fun uniformMatrix4fv(location: WebGLUniformLocation, transpose: GLboolean, value: Float32Array);
	/**
	 * nullThe WebGLRenderingContext.uniformMatrix[234]fv() methods of the WebGL API specify matrix values for uniform variables. The three versions of this method (uniformMatrix2fv(), uniformMatrix3fv(), and uniformMatrix4fv()) take as the input value 2-component, 3-component, and 4-component square matrices, respectively. They are expected to have 4, 9 or 16 floats.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniformMatrix) official docs.
	 *
	 * @param location <p>A <a href="/en-US/docs/Web/API/WebGLUniformLocation"><code>WebGLUniformLocation</code></a> object containing the location of the uniform attribute to modify. The location is obtained using <a href="/en-US/docs/Web/API/WebGLRenderingContext/getUniformLocation" title="getUniformLocation()"><code>getUniformLocation()</code></a>.</p>
	 * @param transpose <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether to transpose the matrix. Must be <code>false</code>.</p>
	 * @param value <p>A <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array"><code>Float32Array</code></a> or sequence of <code>GLfloat</code> values. The values are assumed to be supplied in column major order.</p>
	 */
	public fun uniformMatrix4fv(location: WebGLUniformLocation, transpose: GLboolean, value: List<GLfloat>);
	/**
	 * nullThe WebGLRenderingContext.useProgram() method of the WebGL API sets the specified WebGLProgram as part of the current rendering state.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/useProgram) official docs.
	 *
	 * @param program <p>A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> to use.</p>
	 */
	public fun useProgram(program: WebGLProgram);
	/**
	 * nullThe WebGLRenderingContext.validateProgram() method of the WebGL API validates a WebGLProgram. It checks if it is successfully linked and if it can be used in the current WebGL state.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/validateProgram) official docs.
	 *
	 * @param program <p>A <a href="/en-US/docs/Web/API/WebGLProgram"><code>WebGLProgram</code></a> to validate.</p>
	 */
	public fun validateProgram(program: WebGLProgram);
	/**
	 * nullThe WebGLRenderingContext.vertexAttrib[1234]f[v]() methods of the WebGL API specify constant values for generic vertex attributes.
	 *
	 * Problems found during importing:
	 * Parameter 'x' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.</p>
	 * @param x This parameter caused unspecified trouble!
	 */
	//public fun vertexAttrib1f(index: GLuint, x: GLfloat);
	/**
	 * nullThe WebGLRenderingContext.vertexAttrib[1234]f[v]() methods of the WebGL API specify constant values for generic vertex attributes.
	 *
	 * Problems found during importing:
	 * Parameter 'values' with type Float32Array non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.</p>
	 * @param values This parameter caused unspecified trouble!
	 */
	//public fun vertexAttrib1fv(index: GLuint, values: Float32Array);
	/**
	 * nullThe WebGLRenderingContext.vertexAttrib[1234]f[v]() methods of the WebGL API specify constant values for generic vertex attributes.
	 *
	 * Problems found during importing:
	 * Parameter 'values' with type sequence<GLfloat> non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.</p>
	 * @param values This parameter caused unspecified trouble!
	 */
	//public fun vertexAttrib1fv(index: GLuint, values: List<GLfloat>);
	/**
	 * nullThe WebGLRenderingContext.vertexAttrib[1234]f[v]() methods of the WebGL API specify constant values for generic vertex attributes.
	 *
	 * Problems found during importing:
	 * Parameter 'x' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 * Parameter 'y' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.</p>
	 * @param x This parameter caused unspecified trouble!
	 * @param y This parameter caused unspecified trouble!
	 */
	//public fun vertexAttrib2f(index: GLuint, x: GLfloat, y: GLfloat);
	/**
	 * nullThe WebGLRenderingContext.vertexAttrib[1234]f[v]() methods of the WebGL API specify constant values for generic vertex attributes.
	 *
	 * Problems found during importing:
	 * Parameter 'values' with type Float32Array non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.</p>
	 * @param values This parameter caused unspecified trouble!
	 */
	//public fun vertexAttrib2fv(index: GLuint, values: Float32Array);
	/**
	 * nullThe WebGLRenderingContext.vertexAttrib[1234]f[v]() methods of the WebGL API specify constant values for generic vertex attributes.
	 *
	 * Problems found during importing:
	 * Parameter 'values' with type sequence<GLfloat> non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.</p>
	 * @param values This parameter caused unspecified trouble!
	 */
	//public fun vertexAttrib2fv(index: GLuint, values: List<GLfloat>);
	/**
	 * nullThe WebGLRenderingContext.vertexAttrib[1234]f[v]() methods of the WebGL API specify constant values for generic vertex attributes.
	 *
	 * Problems found during importing:
	 * Parameter 'x' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 * Parameter 'y' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 * Parameter 'z' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.</p>
	 * @param x This parameter caused unspecified trouble!
	 * @param y This parameter caused unspecified trouble!
	 * @param z This parameter caused unspecified trouble!
	 */
	//public fun vertexAttrib3f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat);
	/**
	 * nullThe WebGLRenderingContext.vertexAttrib[1234]f[v]() methods of the WebGL API specify constant values for generic vertex attributes.
	 *
	 * Problems found during importing:
	 * Parameter 'values' with type Float32Array non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.</p>
	 * @param values This parameter caused unspecified trouble!
	 */
	//public fun vertexAttrib3fv(index: GLuint, values: Float32Array);
	/**
	 * nullThe WebGLRenderingContext.vertexAttrib[1234]f[v]() methods of the WebGL API specify constant values for generic vertex attributes.
	 *
	 * Problems found during importing:
	 * Parameter 'values' with type sequence<GLfloat> non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.</p>
	 * @param values This parameter caused unspecified trouble!
	 */
	//public fun vertexAttrib3fv(index: GLuint, values: List<GLfloat>);
	/**
	 * nullThe WebGLRenderingContext.vertexAttrib[1234]f[v]() methods of the WebGL API specify constant values for generic vertex attributes.
	 *
	 * Problems found during importing:
	 * Parameter 'x' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 * Parameter 'y' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 * Parameter 'z' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 * Parameter 'w' with type GLfloat non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.</p>
	 * @param x This parameter caused unspecified trouble!
	 * @param y This parameter caused unspecified trouble!
	 * @param z This parameter caused unspecified trouble!
	 * @param w This parameter caused unspecified trouble!
	 */
	//public fun vertexAttrib4f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat);
	/**
	 * nullThe WebGLRenderingContext.vertexAttrib[1234]f[v]() methods of the WebGL API specify constant values for generic vertex attributes.
	 *
	 * Problems found during importing:
	 * Parameter 'values' with type Float32Array non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.</p>
	 * @param values This parameter caused unspecified trouble!
	 */
	//public fun vertexAttrib4fv(index: GLuint, values: Float32Array);
	/**
	 * nullThe WebGLRenderingContext.vertexAttrib[1234]f[v]() methods of the WebGL API specify constant values for generic vertex attributes.
	 *
	 * Problems found during importing:
	 * Parameter 'values' with type sequence<GLfloat> non-existent for 'https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib'!
	 *
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the position of the vertex attribute to be modified.</p>
	 * @param values This parameter caused unspecified trouble!
	 */
	//public fun vertexAttrib4fv(index: GLuint, values: List<GLfloat>);
	/**
	 * nullThe WebGLRenderingContext.vertexAttribPointer() method of the WebGL API binds the buffer currently bound to gl.ARRAY_BUFFER to a generic vertex attribute of the current vertex buffer object and specifies its layout.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttribPointer) official docs.
	 *
	 * @param index <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLuint"><code>GLuint</code></a> specifying the index of the vertex attribute that is to be modified.</p>
	 * @param size <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the number of components per vertex attribute. Must be 1, 2, 3, or 4.</p>
	 * @param type <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLenum"><code>GLenum</code></a> specifying the data type of each component in the array. Possible values:</p>
<ul>
 <li><code>gl.BYTE</code>: signed 8-bit integer, with values in [-128, 127]</li>
 <li><code>gl.SHORT</code>: signed 16-bit integer, with values in [-32768, 32767]</li>
 <li><code>gl.UNSIGNED_BYTE</code>: unsigned 8-bit integer, with values in [0, 255]</li>
 <li><code>gl.UNSIGNED_SHORT</code>: unsigned 16-bit integer, with values in [0,65535]</li>
 <li><code>gl.FLOAT</code>: 32-bit IEEE floating point number</li>
</ul>
<p>When using a <a href="/en-US/docs/Web/API/WebGL2RenderingContext" title="WebGL 2 context">WebGL 2 context</a>, the following values are available additionally:</p>
<ul>
 <li><code>gl.HALF_FLOAT</code>: 16-bit IEEE floating point number</li>
 <li><code>gl.INT</code>: 32-bit signed binary integer</li>
 <li><code>gl.UNSIGNED_INT</code>: 32-bit unsigned binary integer</li>
 <li><code>gl.INT_2_10_10_10_REV</code>: 32-bit signed integer with values in [-512, 511]</li>
 <li><code>gl.UNSIGNED_INT_2_10_10_10_REV</code>: 32-bit unsigned integer with values in [0, 1023]</li>
</ul>
	 * @param normalized <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLboolean"><code>GLboolean</code></a> specifying whether integer data values should be normalized into a certain range when being cast to a float.</p>
<ul>
 <li>For types <code>gl.BYTE</code> and <code>gl.SHORT</code>, normalizes the values to [-1, 1] if true.</li>
 <li>For types <code>gl.UNSIGNED_BYTE</code> and <code>gl.UNSIGNED_SHORT</code>, normalizes the values to [0, 1] if true.</li>
 <li>For types <code>gl.FLOAT</code> and <code>gl.HALF_FLOAT</code>, this parameter has no effect.</li>
</ul>
	 * @param stride <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the offset in bytes between the beginning of consecutive vertex attributes. Cannot be negative or larger than 255. If stride is 0, the attribute is assumed to be tightly packed, that is, the attributes are not interleaved but each attribute is in a separate block, and the next vertex' attribute follows immediately after the current vertex.</p>
	 * @param offset <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLintptr"><code>GLintptr</code></a> specifying an offset in bytes of the first component in the vertex attribute array. Must be a multiple of the byte length of <code>type</code>.</p>
	 */
	public fun vertexAttribPointer(index: GLuint, size: GLint, type: GLenum, normalized: GLboolean, stride: GLsizei, offset: GLintptr);
	/**
	 * nullThe WebGLRenderingContext.viewport() method of the WebGL API sets the viewport, which specifies the affine transformation of x and y from normalized device coordinates to window coordinates.
	 * See further:
	 * * At [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/viewport) official docs.
	 *
	 * @param x <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the horizontal coordinate for the lower left corner of the viewport origin. Default value: 0.</p>
	 * @param y <p>A <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLint"><code>GLint</code></a> specifying the vertical coordinate for the lower left corner of the viewport origin. Default value: 0.</p>
	 * @param width <p>A non-negative <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the width of the viewport. Default value: width of the canvas.</p>
	 * @param height <p>A non-negative <a href="/en-US/docs/Web/API/WebGL_API/Types" title="GLsizei"><code>GLsizei</code></a> specifying the height of the viewport. Default value: height of the canvas.</p>
	 */
	public fun viewport(x: GLint, y: GLint, width: GLsizei, height: GLsizei);
}

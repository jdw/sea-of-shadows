package com.github.jdw.seaofshadows.webgl.shared


/**
 * SiC
 */
interface WebGLRenderingContextBase {
	val canvas: HTMLCanvasElement
	val drawingBufferWidth: GLsizei
	val drawingBufferHeight: GLsizei
	
	
	companion object {
		val DEPTH_BUFFER_BIT: GLenum = 0x00000100;UL
		val STENCIL_BUFFER_BIT: GLenum = 0x00000400;UL
		val COLOR_BUFFER_BIT: GLenum = 0x00004000;UL
		val POINTS: GLenum = 0x0000;UL
		val LINES: GLenum = 0x0001;UL
		val LINE_LOOP: GLenum = 0x0002;UL
		val LINE_STRIP: GLenum = 0x0003;UL
		val TRIANGLES: GLenum = 0x0004;UL
		val TRIANGLE_STRIP: GLenum = 0x0005;UL
		val TRIANGLE_FAN: GLenum = 0x0006;UL
		val ZERO: GLenum = 0;UL
		val ONE: GLenum = 1;UL
		val SRC_COLOR: GLenum = 0x0300;UL
		val ONE_MINUS_SRC_COLOR: GLenum = 0x0301;UL
		val SRC_ALPHA: GLenum = 0x0302;UL
		val ONE_MINUS_SRC_ALPHA: GLenum = 0x0303;UL
		val DST_ALPHA: GLenum = 0x0304;UL
		val ONE_MINUS_DST_ALPHA: GLenum = 0x0305;UL
		val DST_COLOR: GLenum = 0x0306;UL
		val ONE_MINUS_DST_COLOR: GLenum = 0x0307;UL
		val SRC_ALPHA_SATURATE: GLenum = 0x0308;UL
		val FUNC_ADD: GLenum = 0x8006;UL
		val BLEND_EQUATION: GLenum = 0x8009;UL
		val BLEND_EQUATION_RGB: GLenum = 0x8009;UL
		val BLEND_EQUATION_ALPHA: GLenum = 0x883D;UL
		val FUNC_SUBTRACT: GLenum = 0x800A;UL
		val FUNC_REVERSE_SUBTRACT: GLenum = 0x800B;UL
		val BLEND_DST_RGB: GLenum = 0x80C8;UL
		val BLEND_SRC_RGB: GLenum = 0x80C9;UL
		val BLEND_DST_ALPHA: GLenum = 0x80CA;UL
		val BLEND_SRC_ALPHA: GLenum = 0x80CB;UL
		val CONSTANT_COLOR: GLenum = 0x8001;UL
		val ONE_MINUS_CONSTANT_COLOR: GLenum = 0x8002;UL
		val CONSTANT_ALPHA: GLenum = 0x8003;UL
		val ONE_MINUS_CONSTANT_ALPHA: GLenum = 0x8004;UL
		val BLEND_COLOR: GLenum = 0x8005;UL
		val ARRAY_BUFFER: GLenum = 0x8892;UL
		val ELEMENT_ARRAY_BUFFER: GLenum = 0x8893;UL
		val ARRAY_BUFFER_BINDING: GLenum = 0x8894;UL
		val ELEMENT_ARRAY_BUFFER_BINDING: GLenum = 0x8895;UL
		val STREAM_DRAW: GLenum = 0x88E0;UL
		val STATIC_DRAW: GLenum = 0x88E4;UL
		val DYNAMIC_DRAW: GLenum = 0x88E8;UL
		val BUFFER_SIZE: GLenum = 0x8764;UL
		val BUFFER_USAGE: GLenum = 0x8765;UL
		val CURRENT_VERTEX_ATTRIB: GLenum = 0x8626;UL
		val FRONT: GLenum = 0x0404;UL
		val BACK: GLenum = 0x0405;UL
		val FRONT_AND_BACK: GLenum = 0x0408;UL
		val CULL_FACE: GLenum = 0x0B44;UL
		val BLEND: GLenum = 0x0BE2;UL
		val DITHER: GLenum = 0x0BD0;UL
		val STENCIL_TEST: GLenum = 0x0B90;UL
		val DEPTH_TEST: GLenum = 0x0B71;UL
		val SCISSOR_TEST: GLenum = 0x0C11;UL
		val POLYGON_OFFSET_FILL: GLenum = 0x8037;UL
		val SAMPLE_ALPHA_TO_COVERAGE: GLenum = 0x809E;UL
		val SAMPLE_COVERAGE: GLenum = 0x80A0;UL
		val NO_ERROR: GLenum = 0;UL
		val INVALID_ENUM: GLenum = 0x0500;UL
		val INVALID_VALUE: GLenum = 0x0501;UL
		val INVALID_OPERATION: GLenum = 0x0502;UL
		val OUT_OF_MEMORY: GLenum = 0x0505;UL
		val CW: GLenum = 0x0900;UL
		val CCW: GLenum = 0x0901;UL
		val LINE_WIDTH: GLenum = 0x0B21;UL
		val ALIASED_POINT_SIZE_RANGE: GLenum = 0x846D;UL
		val ALIASED_LINE_WIDTH_RANGE: GLenum = 0x846E;UL
		val CULL_FACE_MODE: GLenum = 0x0B45;UL
		val FRONT_FACE: GLenum = 0x0B46;UL
		val DEPTH_RANGE: GLenum = 0x0B70;UL
		val DEPTH_WRITEMASK: GLenum = 0x0B72;UL
		val DEPTH_CLEAR_VALUE: GLenum = 0x0B73;UL
		val DEPTH_FUNC: GLenum = 0x0B74;UL
		val STENCIL_CLEAR_VALUE: GLenum = 0x0B91;UL
		val STENCIL_FUNC: GLenum = 0x0B92;UL
		val STENCIL_FAIL: GLenum = 0x0B94;UL
		val STENCIL_PASS_DEPTH_FAIL: GLenum = 0x0B95;UL
		val STENCIL_PASS_DEPTH_PASS: GLenum = 0x0B96;UL
		val STENCIL_REF: GLenum = 0x0B97;UL
		val STENCIL_VALUE_MASK: GLenum = 0x0B93;UL
		val STENCIL_WRITEMASK: GLenum = 0x0B98;UL
		val STENCIL_BACK_FUNC: GLenum = 0x8800;UL
		val STENCIL_BACK_FAIL: GLenum = 0x8801;UL
		val STENCIL_BACK_PASS_DEPTH_FAIL: GLenum = 0x8802;UL
		val STENCIL_BACK_PASS_DEPTH_PASS: GLenum = 0x8803;UL
		val STENCIL_BACK_REF: GLenum = 0x8CA3;UL
		val STENCIL_BACK_VALUE_MASK: GLenum = 0x8CA4;UL
		val STENCIL_BACK_WRITEMASK: GLenum = 0x8CA5;UL
		val VIEWPORT: GLenum = 0x0BA2;UL
		val SCISSOR_BOX: GLenum = 0x0C10;UL
		val COLOR_CLEAR_VALUE: GLenum = 0x0C22;UL
		val COLOR_WRITEMASK: GLenum = 0x0C23;UL
		val UNPACK_ALIGNMENT: GLenum = 0x0CF5;UL
		val PACK_ALIGNMENT: GLenum = 0x0D05;UL
		val MAX_TEXTURE_SIZE: GLenum = 0x0D33;UL
		val MAX_VIEWPORT_DIMS: GLenum = 0x0D3A;UL
		val SUBPIXEL_BITS: GLenum = 0x0D50;UL
		val RED_BITS: GLenum = 0x0D52;UL
		val GREEN_BITS: GLenum = 0x0D53;UL
		val BLUE_BITS: GLenum = 0x0D54;UL
		val ALPHA_BITS: GLenum = 0x0D55;UL
		val DEPTH_BITS: GLenum = 0x0D56;UL
		val STENCIL_BITS: GLenum = 0x0D57;UL
		val POLYGON_OFFSET_UNITS: GLenum = 0x2A00;UL
		val POLYGON_OFFSET_FACTOR: GLenum = 0x8038;UL
		val TEXTURE_BINDING_2D: GLenum = 0x8069;UL
		val SAMPLE_BUFFERS: GLenum = 0x80A8;UL
		val SAMPLES: GLenum = 0x80A9;UL
		val SAMPLE_COVERAGE_VALUE: GLenum = 0x80AA;UL
		val SAMPLE_COVERAGE_INVERT: GLenum = 0x80AB;UL
		val COMPRESSED_TEXTURE_FORMATS: GLenum = 0x86A3;UL
		val DONT_CARE: GLenum = 0x1100;UL
		val FASTEST: GLenum = 0x1101;UL
		val NICEST: GLenum = 0x1102;UL
		val GENERATE_MIPMAP_HINT: GLenum = 0x8192;UL
		val BYTE: GLenum = 0x1400;UL
		val UNSIGNED_BYTE: GLenum = 0x1401;UL
		val SHORT: GLenum = 0x1402;UL
		val UNSIGNED_SHORT: GLenum = 0x1403;UL
		val INT: GLenum = 0x1404;UL
		val UNSIGNED_INT: GLenum = 0x1405;UL
		val FLOAT: GLenum = 0x1406;UL
		val DEPTH_COMPONENT: GLenum = 0x1902;UL
		val ALPHA: GLenum = 0x1906;UL
		val RGB: GLenum = 0x1907;UL
		val RGBA: GLenum = 0x1908;UL
		val LUMINANCE: GLenum = 0x1909;UL
		val LUMINANCE_ALPHA: GLenum = 0x190A;UL
		val UNSIGNED_SHORT_4_4_4_4: GLenum = 0x8033;UL
		val UNSIGNED_SHORT_5_5_5_1: GLenum = 0x8034;UL
		val UNSIGNED_SHORT_5_6_5: GLenum = 0x8363;UL
		val FRAGMENT_SHADER: GLenum = 0x8B30;UL
		val VERTEX_SHADER: GLenum = 0x8B31;UL
		val MAX_VERTEX_ATTRIBS: GLenum = 0x8869;UL
		val MAX_VERTEX_UNIFORM_VECTORS: GLenum = 0x8DFB;UL
		val MAX_VARYING_VECTORS: GLenum = 0x8DFC;UL
		val MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum = 0x8B4D;UL
		val MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum = 0x8B4C;UL
		val MAX_TEXTURE_IMAGE_UNITS: GLenum = 0x8872;UL
		val MAX_FRAGMENT_UNIFORM_VECTORS: GLenum = 0x8DFD;UL
		val SHADER_TYPE: GLenum = 0x8B4F;UL
		val DELETE_STATUS: GLenum = 0x8B80;UL
		val LINK_STATUS: GLenum = 0x8B82;UL
		val VALIDATE_STATUS: GLenum = 0x8B83;UL
		val ATTACHED_SHADERS: GLenum = 0x8B85;UL
		val ACTIVE_UNIFORMS: GLenum = 0x8B86;UL
		val ACTIVE_ATTRIBUTES: GLenum = 0x8B89;UL
		val SHADING_LANGUAGE_VERSION: GLenum = 0x8B8C;UL
		val CURRENT_PROGRAM: GLenum = 0x8B8D;UL
		val NEVER: GLenum = 0x0200;UL
		val LESS: GLenum = 0x0201;UL
		val EQUAL: GLenum = 0x0202;UL
		val LEQUAL: GLenum = 0x0203;UL
		val GREATER: GLenum = 0x0204;UL
		val NOTEQUAL: GLenum = 0x0205;UL
		val GEQUAL: GLenum = 0x0206;UL
		val ALWAYS: GLenum = 0x0207;UL
		val KEEP: GLenum = 0x1E00;UL
		val REPLACE: GLenum = 0x1E01;UL
		val INCR: GLenum = 0x1E02;UL
		val DECR: GLenum = 0x1E03;UL
		val INVERT: GLenum = 0x150A;UL
		val INCR_WRAP: GLenum = 0x8507;UL
		val DECR_WRAP: GLenum = 0x8508;UL
		val VENDOR: GLenum = 0x1F00;UL
		val RENDERER: GLenum = 0x1F01;UL
		val VERSION: GLenum = 0x1F02;UL
		val NEAREST: GLenum = 0x2600;UL
		val LINEAR: GLenum = 0x2601;UL
		val NEAREST_MIPMAP_NEAREST: GLenum = 0x2700;UL
		val LINEAR_MIPMAP_NEAREST: GLenum = 0x2701;UL
		val NEAREST_MIPMAP_LINEAR: GLenum = 0x2702;UL
		val LINEAR_MIPMAP_LINEAR: GLenum = 0x2703;UL
		val TEXTURE_MAG_FILTER: GLenum = 0x2800;UL
		val TEXTURE_MIN_FILTER: GLenum = 0x2801;UL
		val TEXTURE_WRAP_S: GLenum = 0x2802;UL
		val TEXTURE_WRAP_T: GLenum = 0x2803;UL
		val TEXTURE_2D: GLenum = 0x0DE1;UL
		val TEXTURE: GLenum = 0x1702;UL
		val TEXTURE_CUBE_MAP: GLenum = 0x8513;UL
		val TEXTURE_BINDING_CUBE_MAP: GLenum = 0x8514;UL
		val TEXTURE_CUBE_MAP_POSITIVE_X: GLenum = 0x8515;UL
		val TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum = 0x8516;UL
		val TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum = 0x8517;UL
		val TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum = 0x8518;UL
		val TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum = 0x8519;UL
		val TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum = 0x851A;UL
		val MAX_CUBE_MAP_TEXTURE_SIZE: GLenum = 0x851C;UL
		val TEXTURE0: GLenum = 0x84C0;UL
		val TEXTURE1: GLenum = 0x84C1;UL
		val TEXTURE2: GLenum = 0x84C2;UL
		val TEXTURE3: GLenum = 0x84C3;UL
		val TEXTURE4: GLenum = 0x84C4;UL
		val TEXTURE5: GLenum = 0x84C5;UL
		val TEXTURE6: GLenum = 0x84C6;UL
		val TEXTURE7: GLenum = 0x84C7;UL
		val TEXTURE8: GLenum = 0x84C8;UL
		val TEXTURE9: GLenum = 0x84C9;UL
		val TEXTURE10: GLenum = 0x84CA;UL
		val TEXTURE11: GLenum = 0x84CB;UL
		val TEXTURE12: GLenum = 0x84CC;UL
		val TEXTURE13: GLenum = 0x84CD;UL
		val TEXTURE14: GLenum = 0x84CE;UL
		val TEXTURE15: GLenum = 0x84CF;UL
		val TEXTURE16: GLenum = 0x84D0;UL
		val TEXTURE17: GLenum = 0x84D1;UL
		val TEXTURE18: GLenum = 0x84D2;UL
		val TEXTURE19: GLenum = 0x84D3;UL
		val TEXTURE20: GLenum = 0x84D4;UL
		val TEXTURE21: GLenum = 0x84D5;UL
		val TEXTURE22: GLenum = 0x84D6;UL
		val TEXTURE23: GLenum = 0x84D7;UL
		val TEXTURE24: GLenum = 0x84D8;UL
		val TEXTURE25: GLenum = 0x84D9;UL
		val TEXTURE26: GLenum = 0x84DA;UL
		val TEXTURE27: GLenum = 0x84DB;UL
		val TEXTURE28: GLenum = 0x84DC;UL
		val TEXTURE29: GLenum = 0x84DD;UL
		val TEXTURE30: GLenum = 0x84DE;UL
		val TEXTURE31: GLenum = 0x84DF;UL
		val ACTIVE_TEXTURE: GLenum = 0x84E0;UL
		val REPEAT: GLenum = 0x2901;UL
		val CLAMP_TO_EDGE: GLenum = 0x812F;UL
		val MIRRORED_REPEAT: GLenum = 0x8370;UL
		val FLOAT_VEC2: GLenum = 0x8B50;UL
		val FLOAT_VEC3: GLenum = 0x8B51;UL
		val FLOAT_VEC4: GLenum = 0x8B52;UL
		val INT_VEC2: GLenum = 0x8B53;UL
		val INT_VEC3: GLenum = 0x8B54;UL
		val INT_VEC4: GLenum = 0x8B55;UL
		val BOOL: GLenum = 0x8B56;UL
		val BOOL_VEC2: GLenum = 0x8B57;UL
		val BOOL_VEC3: GLenum = 0x8B58;UL
		val BOOL_VEC4: GLenum = 0x8B59;UL
		val FLOAT_MAT2: GLenum = 0x8B5A;UL
		val FLOAT_MAT3: GLenum = 0x8B5B;UL
		val FLOAT_MAT4: GLenum = 0x8B5C;UL
		val SAMPLER_2D: GLenum = 0x8B5E;UL
		val SAMPLER_CUBE: GLenum = 0x8B60;UL
		val VERTEX_ATTRIB_ARRAY_ENABLED: GLenum = 0x8622;UL
		val VERTEX_ATTRIB_ARRAY_SIZE: GLenum = 0x8623;UL
		val VERTEX_ATTRIB_ARRAY_STRIDE: GLenum = 0x8624;UL
		val VERTEX_ATTRIB_ARRAY_TYPE: GLenum = 0x8625;UL
		val VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum = 0x886A;UL
		val VERTEX_ATTRIB_ARRAY_POINTER: GLenum = 0x8645;UL
		val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum = 0x889F;UL
		val IMPLEMENTATION_COLOR_READ_TYPE: GLenum = 0x8B9A;UL
		val IMPLEMENTATION_COLOR_READ_FORMAT: GLenum = 0x8B9B;UL
		val COMPILE_STATUS: GLenum = 0x8B81;UL
		val LOW_FLOAT: GLenum = 0x8DF0;UL
		val MEDIUM_FLOAT: GLenum = 0x8DF1;UL
		val HIGH_FLOAT: GLenum = 0x8DF2;UL
		val LOW_INT: GLenum = 0x8DF3;UL
		val MEDIUM_INT: GLenum = 0x8DF4;UL
		val HIGH_INT: GLenum = 0x8DF5;UL
		val FRAMEBUFFER: GLenum = 0x8D40;UL
		val RENDERBUFFER: GLenum = 0x8D41;UL
		val RGBA4: GLenum = 0x8056;UL
		val RGB5_A1: GLenum = 0x8057;UL
		val RGB565: GLenum = 0x8D62;UL
		val DEPTH_COMPONENT16: GLenum = 0x81A5;UL
		val STENCIL_INDEX: GLenum = 0x1901;UL
		val STENCIL_INDEX8: GLenum = 0x8D48;UL
		val DEPTH_STENCIL: GLenum = 0x84F9;UL
		val RENDERBUFFER_WIDTH: GLenum = 0x8D42;UL
		val RENDERBUFFER_HEIGHT: GLenum = 0x8D43;UL
		val RENDERBUFFER_INTERNAL_FORMAT: GLenum = 0x8D44;UL
		val RENDERBUFFER_RED_SIZE: GLenum = 0x8D50;UL
		val RENDERBUFFER_GREEN_SIZE: GLenum = 0x8D51;UL
		val RENDERBUFFER_BLUE_SIZE: GLenum = 0x8D52;UL
		val RENDERBUFFER_ALPHA_SIZE: GLenum = 0x8D53;UL
		val RENDERBUFFER_DEPTH_SIZE: GLenum = 0x8D54;UL
		val RENDERBUFFER_STENCIL_SIZE: GLenum = 0x8D55;UL
		val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum = 0x8CD0;UL
		val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum = 0x8CD1;UL
		val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum = 0x8CD2;UL
		val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum = 0x8CD3;UL
		val COLOR_ATTACHMENT0: GLenum = 0x8CE0;UL
		val DEPTH_ATTACHMENT: GLenum = 0x8D00;UL
		val STENCIL_ATTACHMENT: GLenum = 0x8D20;UL
		val DEPTH_STENCIL_ATTACHMENT: GLenum = 0x821A;UL
		val NONE: GLenum = 0;UL
		val FRAMEBUFFER_COMPLETE: GLenum = 0x8CD5;UL
		val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum = 0x8CD6;UL
		val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum = 0x8CD7;UL
		val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum = 0x8CD9;UL
		val FRAMEBUFFER_UNSUPPORTED: GLenum = 0x8CDD;UL
		val FRAMEBUFFER_BINDING: GLenum = 0x8CA6;UL
		val RENDERBUFFER_BINDING: GLenum = 0x8CA7;UL
		val MAX_RENDERBUFFER_SIZE: GLenum = 0x84E8;UL
		val INVALID_FRAMEBUFFER_OPERATION: GLenum = 0x0506;UL
		val UNPACK_FLIP_Y_WEBGL: GLenum = 0x9240;UL
		val UNPACK_PREMULTIPLY_ALPHA_WEBGL: GLenum = 0x9241;UL
		val CONTEXT_LOST_WEBGL: GLenum = 0x9242;UL
		val UNPACK_COLORSPACE_CONVERSION_WEBGL: GLenum = 0x9243;UL
		val BROWSER_DEFAULT_WEBGL: GLenum = 0x9244;UL
	}
	
	/**
	 * The [WebGLRenderingContext].getContextAttributes() method returns a [WebGLContextAttributes] object that contains the actual context parameters. Might return null, if the context is lost.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getContextAttributes)
	 *
	 */
	fun getContextAttributes()
	
	
	/**
	 * The [WebGLRenderingContext].isContextLost() method returns a boolean value indicating whether or not the WebGL context has been lost and must be re-established before rendering can resume.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/isContextLost)
	 *
	 */
	fun isContextLost()
	
	
	/**
	 * The [WebGLRenderingContext].getSupportedExtensions() method returns a list of all the supported WebGL extensions.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getSupportedExtensions)
	 *
	 */
	fun getSupportedExtensions()
	
	
	/**
	 * The [WebGLRenderingContext].getExtension() method enables a WebGL extension.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getExtension)
	 *
	 * @param name A String for the name of the WebGL extension to enable.
	 */
	fun getExtension(name: DOMString)
	
	
	/**
	 * The [WebGLRenderingContext].activeTexture() method of the WebGL API specifies which texture unit to make active.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/activeTexture)
	 *
	 * @param texture The texture unit to make active. The value is a gl.TEXTUREI where I is within the range from 0 to gl.MAX_COMBINED_TEXTURE_IMAGE_UNITS - 1.
	 */
	fun activeTexture(texture: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].attachShader() method of the WebGL API attaches either a fragment or vertex [WebGLShader] to a [WebGLProgram].
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/attachShader)
	 *
	 * @param program A [WebGLProgram].
	 * @param shader A fragment or vertex [WebGLShader].
	 */
	fun attachShader(program: WebGLProgram, shader: WebGLShader)
	
	
	/**
	 * The [WebGLRenderingContext].bindAttribLocation() method of the WebGL API binds a generic vertex index to an attribute variable.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/bindAttribLocation)
	 *
	 * @param program A [WebGLProgram] object to bind.
	 * @param index A [GLuint] specifying the index of the generic vertex to bind.
	 * @param name A string specifying the name of the variable to bind to the generic vertex index. This name cannot start with "webgl_" or "_webgl_", as these are reserved for use by WebGL.
	 */
	fun bindAttribLocation(program: WebGLProgram, index: GLuint, name: DOMString)
	
	
	/**
	 * The [WebGLRenderingContext].bindBuffer() method of the WebGL API binds a given [WebGLBuffer] to a target.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/bindBuffer)
	 *
	 * @param target A [GLenum] specifying the binding point (target). Possible values: gl.ARRAY_BUFFER Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data. gl.ELEMENT_ARRAY_BUFFER Buffer used for element indices. When using a WebGL 2 context, the following values are available additionally: gl.COPY_READ_BUFFER Buffer for copying from one buffer object to another. gl.COPY_WRITE_BUFFER Buffer for copying from one buffer object to another. gl.TRANSFORM_FEEDBACK_BUFFER Buffer for transform feedback operations. gl.UNIFORM_BUFFER Buffer used for storing uniform blocks. gl.PIXEL_PACK_BUFFER Buffer used for pixel transfer operations. gl.PIXEL_UNPACK_BUFFER Buffer used for pixel transfer operations.
	 * @param buffer A [WebGLBuffer] to bind.
	 */
	fun bindBuffer(target: GLenum, buffer: WebGLBuffer)
	
	
	/**
	 * The [WebGLRenderingContext].bindFramebuffer() method of the WebGL API binds to the specified target the provided [WebGLFramebuffer], or, if the framebuffer argument is null, the default [WebGLFramebuffer], which is associated with the canvas rendering context.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/bindFramebuffer)
	 *
	 * @param target A [GLenum] specifying the binding point (target). Possible values: gl.FRAMEBUFFER Collection buffer data storage of color, alpha, depth and stencil buffers used as both a destination for drawing and as a source for reading (see below). When using a WebGL 2 context, the following values are available additionally: gl.DRAW_FRAMEBUFFER Used as a destination for drawing operations such as gl.draw*, gl.clear* and gl.blitFramebuffer. gl.READ_FRAMEBUFFER Used as a source for reading operations such as gl.readPixels and gl.blitFramebuffer.
	 * @param framebuffer A [WebGLFramebuffer] object to bind, or null for binding the [HTMLCanvasElement] or OffscreenCanvas object associated with the rendering context.
	 */
	fun bindFramebuffer(target: GLenum, framebuffer: WebGLFramebuffer)
	
	
	/**
	 * The [WebGLRenderingContext].bindRenderbuffer() method of the WebGL API binds a given [WebGLRenderbuffer] to a target, which must be gl.RENDERBUFFER.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/bindRenderbuffer)
	 *
	 * @param target A [GLenum] specifying the binding point (target). Possible values: gl.RENDERBUFFER Buffer data storage for single images in a renderable internal format.
	 * @param renderbuffer A [WebGLRenderbuffer] object to bind.
	 */
	fun bindRenderbuffer(target: GLenum, renderbuffer: WebGLRenderbuffer)
	
	
	/**
	 * The [WebGLRenderingContext].bindTexture() method of the WebGL API binds a given [WebGLTexture] to a target (binding point).
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/bindTexture)
	 *
	 * @param target A [GLenum] specifying the binding point (target). Possible values: gl.TEXTURE_2D: A two-dimensional texture. gl.TEXTURE_CUBE_MAP: A cube-mapped texture. When using a WebGL 2 context, the following values are available additionally: gl.TEXTURE_3D: A three-dimensional texture. gl.TEXTURE_2D_ARRAY: A two-dimensional array texture.
	 * @param texture A [WebGLTexture] object to bind.
	 */
	fun bindTexture(target: GLenum, texture: WebGLTexture)
	
	
	/**
	 * The [WebGLRenderingContext].blendColor() method of the WebGL API is used to set the source and destination blending factors.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/blendColor)
	 *
	 * @param red A [GLclampf] for the red component in the range of 0 to 1. Default value is 0.
	 * @param green A [GLclampf] for the green component in the range of 0 to 1. Default value is 0.
	 * @param blue A [GLclampf] for the blue component in the range of 0 to 1. Default value is 0.
	 * @param alpha A [GLclampf] for the alpha component (transparency) in the range of 0. to 1. Default value is 0.
	 */
	fun blendColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf)
	
	
	/**
	 * The [WebGLRenderingContext].blendEquation() method of the WebGL API is used to set both the RGB blend equation and alpha blend equation to a single equation. The blend equation determines how a new pixel is combined with a pixel already in the [WebGLFramebuffer].
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/blendEquation)
	 *
	 * @param mode A [GLenum] specifying how source and destination colors are combined. Must be either: gl.FUNC_ADD: source + destination (default value) gl.FUNC_SUBTRACT: source - destination gl.FUNC_REVERSE_SUBTRACT: destination - source When using the EXT_blend_minmax extension: ext.MIN_EXT: Minimum of source and destination ext.MAX_EXT: Maximum of source and destination When using a WebGL 2 context, the following values are available additionally: gl.MIN: Minimum of source and destination gl.MAX: Maximum of source and destination
	 */
	fun blendEquation(mode: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].blendEquationSeparate() method of the WebGL API is used to set the RGB blend equation and alpha blend equation separately. The blend equation determines how a new pixel is combined with a pixel already in the [WebGLFramebuffer].
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/blendEquationSeparate)
	 *
	 * @param modeRGB A [GLenum] specifying how the red, green and blue components of source and destination colors are combined. Must be either: gl.FUNC_ADD: source + destination (default value), gl.FUNC_SUBTRACT: source - destination, gl.FUNC_REVERSE_SUBTRACT: destination - source, When using the EXT_blend_minmax extension: ext.MIN_EXT: Minimum of source and destination, ext.MAX_EXT: Maximum of source and destination. When using a WebGL 2 context, the following values are available additionally: gl.MIN: Minimum of source and destination, gl.MAX: Maximum of source and destination.
	 * @param modeAlpha A [GLenum] specifying how the alpha component (transparency) of source and destination colors are combined. Must be either: gl.FUNC_ADD: source + destination (default value), gl.FUNC_SUBTRACT: source - destination, gl.FUNC_REVERSE_SUBTRACT: destination - source, When using the EXT_blend_minmax extension: ext.MIN_EXT: Minimum of source and destination, ext.MAX_EXT: Maximum of source and destination. When using a WebGL 2 context, the following values are available additionally: gl.MIN: Minimum of source and destination, gl.MAX: Maximum of source and destination.
	 */
	fun blendEquationSeparate(modeRGB: GLenum, modeAlpha: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].blendFunc() method of the WebGL API defines which function is used for blending pixel arithmetic.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/blendFunc)
	 *
	 * @param sfactor A WebGL_API.Types specifying a multiplier for the source blending factors. The default value is gl.ONE. For possible values, see below.
	 * @param dfactor A WebGL_API.Types specifying a multiplier for the destination blending factors. The default value is gl.ZERO. For possible values, see below.
	 */
	fun blendFunc(sfactor: GLenum, dfactor: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].blendFuncSeparate() method of the WebGL API defines which function is used for blending pixel arithmetic for RGB and alpha components separately.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/blendFuncSeparate)
	 *
	 * @param srcRGB A WebGL_API.Types specifying a multiplier for the red, green and blue (RGB) source blending factors. The default value is gl.ONE. For possible values, see below.
	 * @param dstRGB A WebGL_API.Types specifying a multiplier for the red, green and blue (RGB) destination blending factors. The default value is gl.ZERO. For possible values, see below.
	 * @param srcAlpha A WebGL_API.Types specifying a multiplier for the alpha source blending factor. The default value is gl.ONE. For possible values, see below.
	 * @param dstAlpha A WebGL_API.Types specifying a multiplier for the alpha destination blending factor. The default value is gl.ZERO. For possible values, see below.
	 */
	fun blendFuncSeparate(srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].bufferData() method of the WebGL API initializes and creates the buffer object's data store.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/bufferData)
	 *
	 * @param target A [GLenum] specifying the binding point (target). Possible values: gl.ARRAY_BUFFER Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data. gl.ELEMENT_ARRAY_BUFFER Buffer used for element indices. When using a WebGL 2 context, the following values are available additionally: gl.COPY_READ_BUFFER Buffer for copying from one buffer object to another. gl.COPY_WRITE_BUFFER Buffer for copying from one buffer object to another. gl.TRANSFORM_FEEDBACK_BUFFER Buffer for transform feedback operations. gl.UNIFORM_BUFFER Buffer used for storing uniform blocks. gl.PIXEL_PACK_BUFFER Buffer used for pixel transfer operations. gl.PIXEL_UNPACK_BUFFER Buffer used for pixel transfer operations.
	 * @param size A [GLsizei]ptr setting the size in bytes of the buffer object's data store.
	 * @param usage A [GLenum] specifying the intended usage pattern of the data store for optimization purposes. Possible values: gl.STATIC_DRAW The contents are intended to be specified once by the application, and used many times as the source for WebGL drawing and image specification commands. gl.DYNAMIC_DRAW The contents are intended to be respecified repeatedly by the application, and used many times as the source for WebGL drawing and image specification commands. gl.STREAM_DRAW The contents are intended to be specified once by the application, and used at most a few times as the source for WebGL drawing and image specification commands. When using a WebGL 2 context, the following values are available additionally: gl.STATIC_READ The contents are intended to be specified once by reading data from WebGL, and queried many times by the application. gl.DYNAMIC_READ The contents are intended to be respecified repeatedly by reading data from WebGL, and queried many times by the application. gl.STREAM_READ The contents are intended to be specified once by reading data from WebGL, and queried at most a few times by the application gl.STATIC_COPY The contents are intended to be specified once by reading data from WebGL, and used many times as the source for WebGL drawing and image specification commands. gl.DYNAMIC_COPY The contents are intended to be respecified repeatedly by reading data from WebGL, and used many times as the source for WebGL drawing and image specification commands. gl.STREAM_COPY The contents are intended to be specified once by reading data from WebGL, and used at most a few times as the source for WebGL drawing and image specification commands.
	 */
	fun bufferData(target: GLenum, size: GLsizeiptr, usage: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].bufferData() method of the WebGL API initializes and creates the buffer object's data store.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/bufferData)
	 *
	 * @param target A [GLenum] specifying the binding point (target). Possible values: gl.ARRAY_BUFFER Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data. gl.ELEMENT_ARRAY_BUFFER Buffer used for element indices. When using a WebGL 2 context, the following values are available additionally: gl.COPY_READ_BUFFER Buffer for copying from one buffer object to another. gl.COPY_WRITE_BUFFER Buffer for copying from one buffer object to another. gl.TRANSFORM_FEEDBACK_BUFFER Buffer for transform feedback operations. gl.UNIFORM_BUFFER Buffer used for storing uniform blocks. gl.PIXEL_PACK_BUFFER Buffer used for pixel transfer operations. gl.PIXEL_UNPACK_BUFFER Buffer used for pixel transfer operations.
	 * @param data TODO: Importing this parameters documentation caused troube!
	 * @param usage A [GLenum] specifying the intended usage pattern of the data store for optimization purposes. Possible values: gl.STATIC_DRAW The contents are intended to be specified once by the application, and used many times as the source for WebGL drawing and image specification commands. gl.DYNAMIC_DRAW The contents are intended to be respecified repeatedly by the application, and used many times as the source for WebGL drawing and image specification commands. gl.STREAM_DRAW The contents are intended to be specified once by the application, and used at most a few times as the source for WebGL drawing and image specification commands. When using a WebGL 2 context, the following values are available additionally: gl.STATIC_READ The contents are intended to be specified once by reading data from WebGL, and queried many times by the application. gl.DYNAMIC_READ The contents are intended to be respecified repeatedly by reading data from WebGL, and queried many times by the application. gl.STREAM_READ The contents are intended to be specified once by reading data from WebGL, and queried at most a few times by the application gl.STATIC_COPY The contents are intended to be specified once by reading data from WebGL, and used many times as the source for WebGL drawing and image specification commands. gl.DYNAMIC_COPY The contents are intended to be respecified repeatedly by reading data from WebGL, and used many times as the source for WebGL drawing and image specification commands. gl.STREAM_COPY The contents are intended to be specified once by reading data from WebGL, and used at most a few times as the source for WebGL drawing and image specification commands.
	 */
	fun bufferData(target: GLenum, data: BufferDataSource, usage: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/bufferSubData)
	 *
	 * @param target A [GLenum] specifying the binding point (target). Possible values: gl.ARRAY_BUFFER Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data. gl.ELEMENT_ARRAY_BUFFER Buffer used for element indices. When using a WebGL 2 context, the following values are available additionally: gl.COPY_READ_BUFFER Buffer for copying from one buffer object to another. gl.COPY_WRITE_BUFFER Buffer for copying from one buffer object to another. gl.TRANSFORM_FEEDBACK_BUFFER Buffer for transform feedback operations. gl.UNIFORM_BUFFER Buffer used for storing uniform blocks. gl.PIXEL_PACK_BUFFER Buffer used for pixel transfer operations. gl.PIXEL_UNPACK_BUFFER Buffer used for pixel transfer operations.
	 * @param offset TODO: Importing this parameters documentation caused troube!
	 * @param data TODO: Importing this parameters documentation caused troube!
	 */
	fun bufferSubData(target: GLenum, offset: GLintptr, data: BufferDataSource)
	
	
	/**
	 * The [WebGLRenderingContext].checkFramebufferStatus() method of the WebGL API returns the completeness status of the [WebGLFramebuffer] object.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/checkFramebufferStatus)
	 *
	 * @param target A [GLenum] specifying the binding point (target). Possible values: gl.FRAMEBUFFER Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image. When using a WebGL 2 context, the following values are available additionally: gl.DRAW_FRAMEBUFFER Equivalent to gl.FRAMEBUFFER. Used as a destination for drawing, rendering, clearing, and writing operations. gl.READ_FRAMEBUFFER Used as a source for reading operations.
	 */
	fun checkFramebufferStatus(target: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].clear() method of the WebGL API clears buffers to preset values. The preset values can be set by clearColor(), clearDepth() or clearStencil(). The scissor box, dithering, and buffer writemasks can affect the clear() method.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/clear)
	 *
	 * @param mask A [GLbitfield] bitwise OR mask that indicates the buffers to be cleared. Possible values are: gl.COLOR_BUFFER_BIT gl.DEPTH_BUFFER_BIT gl.STENCIL_BUFFER_BIT
	 */
	fun clear(mask: GLbitfield)
	
	
	/**
	 * The [WebGLRenderingContext].clearColor() method of the WebGL API specifies the color values used when clearing color buffers. This specifies what color values to use when calling the clear() method. The values are clamped between 0 and 1.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/clearColor)
	 *
	 * @param red A [GLclampf] specifying the red color value used when the color buffers are cleared. Default value: 0.
	 * @param green A [GLclampf] specifying the green color value used when the color buffers are cleared. Default value: 0.
	 * @param blue A [GLclampf] specifying the blue color value used when the color buffers are cleared. Default value: 0.
	 * @param alpha A [GLclampf] specifying the alpha (transparency) value used when the color buffers are cleared. Default value: 0.
	 */
	fun clearColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf)
	
	
	/**
	 * The [WebGLRenderingContext].clearDepth() method of the WebGL API specifies the clear value for the depth buffer. This specifies what depth value to use when calling the clear() method. The value is clamped between 0 and 1.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/clearDepth)
	 *
	 * @param depth A [GLclampf] specifying the depth value used when the depth buffer is cleared. Default value: 1.
	 */
	fun clearDepth(depth: GLclampf)
	
	
	/**
	 * The [WebGLRenderingContext].clearStencil() method of the WebGL API specifies the clear value for the stencil buffer. This specifies what stencil value to use when calling the clear() method.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/clearStencil)
	 *
	 * @param s A [GLint] specifying the index used when the stencil buffer is cleared. Default value: 0.
	 */
	fun clearStencil(s: GLint)
	
	
	/**
	 * The [WebGLRenderingContext].colorMask() method of the WebGL API sets which color components to enable or to disable when drawing or rendering to a [WebGLFramebuffer].
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/colorMask)
	 *
	 * @param red A [GLboolean] specifying whether or not the red color component can be written into the frame buffer. Default value: true.
	 * @param green A [GLboolean] specifying whether or not the green color component can be written into the frame buffer. Default value: true.
	 * @param blue A [GLboolean] specifying whether or not the blue color component can be written into the frame buffer. Default value: true.
	 * @param alpha A [GLboolean] specifying whether or not the alpha (transparency) component can be written into the frame buffer. Default value: true.
	 */
	fun colorMask(red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean)
	
	
	/**
	 * The [WebGLRenderingContext].compileShader() method of the WebGL API compiles a GLSL shader into binary data so that it can be used by a [WebGLProgram].
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/compileShader)
	 *
	 * @param shader A fragment or vertex [WebGLShader].
	 */
	fun compileShader(shader: WebGLShader)
	
	
	/**
	 * The [WebGLRenderingContext].compressedTexImage2D() and WebGL2RenderingContext.compressedTexImage3D() methods of the WebGL API specify a two- or three-dimensional texture image in a compressed format. Compressed image formats must be enabled by WebGL extensions before using these methods.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/compressedTexImage2D)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D: gl.TEXTURE_2D: A two-dimensional texture. gl.TEXTURE_CUBE_MAP_POSITIVE_X: Positive X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_X: Negative X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Y: Positive Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Y: Negative Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Z: Positive Z face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Z: Negative Z face for a cube-mapped texture. Possible values for compressedTexImage3D: gl.TEXTURE_2D_ARRAY gl.TEXTURE_3D
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction level.
	 * @param internalformat A [GLenum] specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for which are valid for compressedTexImage3D. Possible values: When using the WEBGL_compressed_texture_s3tc extension: ext.COMPRESSED_RGB_S3TC_DXT1_EXT ext.COMPRESSED_RGBA_S3TC_DXT1_EXT ext.COMPRESSED_RGBA_S3TC_DXT3_EXT ext.COMPRESSED_RGBA_S3TC_DXT5_EXT When using the WEBGL_compressed_texture_s3tc_srgb extension: ext.COMPRESSED_SRGB_S3TC_DXT1_EXT ext.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT ext.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT ext.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT When using the WEBGL_compressed_texture_etc extension: ext.COMPRESSED_R11_EAC ext.COMPRESSED_SIGNED_R11_EAC ext.COMPRESSED_RG11_EAC ext.COMPRESSED_SIGNED_RG11_EAC ext.COMPRESSED_RGB8_ETC2 ext.COMPRESSED_RGBA8_ETC2_EAC ext.COMPRESSED_SRGB8_ETC2 ext.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC ext.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 ext.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 When using the WEBGL_compressed_texture_pvrtc extension: ext.COMPRESSED_RGB_PVRTC_4BPPV1_IMG ext.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG ext.COMPRESSED_RGB_PVRTC_2BPPV1_IMG ext.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG When using the WEBGL_compressed_texture_etc1 extension: ext.COMPRESSED_RGB_ETC1_WEBGL When using the WEBGL_compressed_texture_astc extension: ext.COMPRESSED_RGBA_ASTC_4x4_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR ext.COMPRESSED_RGBA_ASTC_5x4_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR ext.COMPRESSED_RGBA_ASTC_5x5_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR ext.COMPRESSED_RGBA_ASTC_6x5_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR ext.COMPRESSED_RGBA_ASTC_6x6_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR ext.COMPRESSED_RGBA_ASTC_8x5_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR ext.COMPRESSED_RGBA_ASTC_8x6_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR ext.COMPRESSED_RGBA_ASTC_8x8_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR ext.COMPRESSED_RGBA_ASTC_10x5_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR ext.COMPRESSED_RGBA_ASTC_10x6_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR ext.COMPRESSED_RGBA_ASTC_10x10_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR ext.COMPRESSED_RGBA_ASTC_12x10_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR ext.COMPRESSED_RGBA_ASTC_12x12_KHR ext.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR When using the EXT_texture_compression_bptc extension: ext.COMPRESSED_RGBA_BPTC_UNORM_EXT ext.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT ext.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT ext.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT When using the EXT_texture_compression_rgtc extension: ext.COMPRESSED_RED_RGTC1_EXT ext.COMPRESSED_SIGNED_RED_RGTC1_EXT ext.COMPRESSED_RED_GREEN_RGTC2_EXT ext.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT
	 * @param data TODO: Importing this parameters documentation caused troube!
	 */
	fun compressedTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, data: ArrayBufferView)
	
	
	/**
	 * The [WebGLRenderingContext].compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format. Compressed image formats must be enabled by WebGL extensions before using this method or a WebGL2RenderingContext must be used.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/compressedTexSubImage2D)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active compressed texture. Possible values: gl.TEXTURE_2D: A two-dimensional texture. gl.TEXTURE_CUBE_MAP_POSITIVE_X: Positive X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_X: Negative X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Y: Positive Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Y: Negative Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Z: Positive Z face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Z: Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction level.
	 * @param data TODO: Importing this parameters documentation caused troube!
	 */
	fun compressedTexSubImage2D(target: GLenum, level: GLint, data: ArrayBufferView)
	
	
	/**
	 * The [WebGLRenderingContext].copyTexImage2D() method of the WebGL API copies pixels from the current [WebGLFramebuffer] into a 2D texture image.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/copyTexImage2D)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture. Possible values: gl.TEXTURE_2D: A two-dimensional texture. gl.TEXTURE_CUBE_MAP_POSITIVE_X: Positive X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_X: Negative X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Y: Positive Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Y: Negative Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Z: Positive Z face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Z: Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction level.
	 * @param internalformat A [GLenum] specifying the color components in the texture. Possible values: gl.ALPHA: Discards the red, green and blue components and reads the alpha component. gl.RGB: Discards the alpha components and reads the red, green and blue components. gl.RGBA: Red, green, blue and alpha components are read from the color buffer. gl.LUMINANCE: Each color component is a luminance component, alpha is 1.0. gl.LUMINANCE_ALPHA: Each component is a luminance/alpha component.
	 * @param border A [GLint] specifying the width of the border. Must be 0.
	 */
	fun copyTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, border: GLint)
	
	
	/**
	 * The [WebGLRenderingContext].copyTexSubImage2D() method of the WebGL API copies pixels from the current [WebGLFramebuffer] into an existing 2D texture sub-image.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/copyTexSubImage2D)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture. Possible values: gl.TEXTURE_2D: A two-dimensional texture. gl.TEXTURE_CUBE_MAP_POSITIVE_X: Positive X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_X: Negative X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Y: Positive Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Y: Negative Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Z: Positive Z face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Z: Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction level.
	 * @param xoffset A [GLint] specifying the horizontal offset within the texture image.
	 * @param yoffset A [GLint] specifying the vertical offset within the texture image.
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 * @param v1 TODO: Importing this parameters documentation caused troube!
	 * @param width A [GLsizei] specifying the width of the texture.
	 * @param height A [GLsizei] specifying the height of the texture.
	 */
	fun copyTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, v0: GLint, v1: GLint, width: GLsizei, height: GLsizei)
	
	
	/**
	 * The [WebGLRenderingContext].createBuffer() method of the WebGL API creates and initializes a [WebGLBuffer] storing data such as vertices or colors.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/createBuffer)
	 *
	 */
	fun createBuffer()
	
	
	/**
	 * The [WebGLRenderingContext].createFramebuffer() method of the WebGL API creates and initializes a [WebGLFramebuffer] object.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/createFramebuffer)
	 *
	 */
	fun createFramebuffer()
	
	
	/**
	 * The [WebGLRenderingContext].createProgram() method of the WebGL API creates and initializes a [WebGLProgram] object.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/createProgram)
	 *
	 */
	fun createProgram()
	
	
	/**
	 * The [WebGLRenderingContext].createRenderbuffer() method of the WebGL API creates and initializes a [WebGLRenderbuffer] object.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/createRenderbuffer)
	 *
	 */
	fun createRenderbuffer()
	
	
	/**
	 * The [WebGLRenderingContext] method createShader() of the WebGL API creates a [WebGLShader] that can then be configured further using [WebGLRenderingContext].shaderSource() and [WebGLRenderingContext].compileShader().
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/createShader)
	 *
	 * @param type Either gl.VERTEX_SHADER or gl.FRAGMENT_SHADER
	 */
	fun createShader(type: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].createTexture() method of the WebGL API creates and initializes a [WebGLTexture] object.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/createTexture)
	 *
	 */
	fun createTexture()
	
	
	/**
	 * The [WebGLRenderingContext].cullFace() method of the WebGL API specifies whether or not front- and/or back-facing polygons can be culled.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/cullFace)
	 *
	 * @param mode A [GLenum] specifying whether front- or back-facing polygons are candidates for culling. The default value is gl.BACK. Possible values are: gl.FRONT gl.BACK gl.FRONT_AND_BACK
	 */
	fun cullFace(mode: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].deleteBuffer() method of the WebGL API deletes a given [WebGLBuffer]. This method has no effect if the buffer has already been deleted. Normally you don't need to call this method yourself, when the buffer object is dereferenced it will be marked as free.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/deleteBuffer)
	 *
	 * @param buffer A [WebGLBuffer] object to delete.
	 */
	fun deleteBuffer(buffer: WebGLBuffer)
	
	
	/**
	 * The [WebGLRenderingContext].deleteFramebuffer() method of the WebGL API deletes a given [WebGLFramebuffer] object. This method has no effect if the frame buffer has already been deleted.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/deleteFramebuffer)
	 *
	 * @param framebuffer A [WebGLFramebuffer] object to delete.
	 */
	fun deleteFramebuffer(framebuffer: WebGLFramebuffer)
	
	
	/**
	 * The [WebGLRenderingContext].deleteProgram() method of the WebGL API deletes a given [WebGLProgram] object. This method has no effect if the program has already been deleted.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/deleteProgram)
	 *
	 * @param program A [WebGLProgram] object to delete.
	 */
	fun deleteProgram(program: WebGLProgram)
	
	
	/**
	 * The [WebGLRenderingContext].deleteRenderbuffer() method of the WebGL API deletes a given [WebGLRenderbuffer] object. This method has no effect if the render buffer has already been deleted.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/deleteRenderbuffer)
	 *
	 * @param renderbuffer A [WebGLRenderbuffer] object to delete.
	 */
	fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer)
	
	
	/**
	 * The [WebGLRenderingContext].deleteShader() method of the WebGL API marks a given [WebGLShader] object for deletion. It will then be deleted whenever the shader is no longer in use. This method has no effect if the shader has already been deleted, and the [WebGLShader] is automatically marked for deletion when it is destroyed by the garbage collector.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/deleteShader)
	 *
	 * @param shader A [WebGLShader] object to delete.
	 */
	fun deleteShader(shader: WebGLShader)
	
	
	/**
	 * The [WebGLRenderingContext].deleteTexture() method of the WebGL API deletes a given [WebGLTexture] object. This method has no effect if the texture has already been deleted.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/deleteTexture)
	 *
	 * @param texture A [WebGLTexture] object to delete.
	 */
	fun deleteTexture(texture: WebGLTexture)
	
	
	/**
	 * The [WebGLRenderingContext].depthFunc() method of the WebGL API specifies a function that compares incoming pixel depth to the current depth buffer value.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/depthFunc)
	 *
	 * @param func A [GLenum] specifying the depth comparison function, which sets the conditions under which the pixel will be drawn. The default value is gl.LESS. Possible values are: gl.NEVER (never pass) gl.LESS (pass if the incoming value is less than the depth buffer value) gl.EQUAL (pass if the incoming value equals the depth buffer value) gl.LEQUAL (pass if the incoming value is less than or equal to the depth buffer value) gl.GREATER (pass if the incoming value is greater than the depth buffer value) gl.NOTEQUAL (pass if the incoming value is not equal to the depth buffer value) gl.GEQUAL (pass if the incoming value is greater than or equal to the depth buffer value) gl.ALWAYS (always pass)
	 */
	fun depthFunc(func: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].depthMask() method of the WebGL API sets whether writing into the depth buffer is enabled or disabled.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/depthMask)
	 *
	 * @param flag A [GLboolean] specifying whether or not writing into the depth buffer is enabled. Default value: true, meaning that writing is enabled.
	 */
	fun depthMask(flag: GLboolean)
	
	
	/**
	 * The [WebGLRenderingContext].depthRange() method of the WebGL API specifies the depth range mapping from normalized device coordinates to window or viewport coordinates.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/depthRange)
	 *
	 * @param zNear A [GLclampf] specifying the mapping of the near clipping plane to window or viewport coordinates. Clamped to the range 0 to 1 and must be less than or equal to zFar. The default value is 0.
	 * @param zFar A [GLclampf] specifying the mapping of the far clipping plane to window or viewport coordinates. Clamped to the range 0 to 1. The default value is 1.
	 */
	fun depthRange(zNear: GLclampf, zFar: GLclampf)
	
	
	/**
	 * The [WebGLRenderingContext].detachShader() method of the WebGL API detaches a previously attached [WebGLShader] from a [WebGLProgram].
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/detachShader)
	 *
	 * @param program A [WebGLProgram].
	 * @param shader A fragment or vertex [WebGLShader].
	 */
	fun detachShader(program: WebGLProgram, shader: WebGLShader)
	
	
	/**
	 * The [WebGLRenderingContext].disable() method of the WebGL API disables specific WebGL capabilities for this context.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/disable)
	 *
	 * @param cap TODO: Importing this parameters documentation caused troube!
	 */
	fun disable(cap: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].disableVertexAttribArray() method of the WebGL API turns the generic vertex attribute array off at a given index position.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/disableVertexAttribArray)
	 *
	 * @param index A [GLuint] specifying the index of the vertex attribute to disable.
	 */
	fun disableVertexAttribArray(index: GLuint)
	
	
	/**
	 * The [WebGLRenderingContext].drawArrays() method of the WebGL API renders primitives from array data.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/drawArrays)
	 *
	 * @param mode A [GLenum] specifying the type primitive to render. Possible values are: gl.POINTS: Draws a single dot. gl.LINE_STRIP: Draws a straight line to the next vertex. gl.LINE_LOOP: Draws a straight line to the next vertex, and connects the last vertex back to the first. gl.LINES: Draws a line between a pair of vertices. gl.TRIANGLE_STRIP gl.TRIANGLE_FAN gl.TRIANGLES: Draws a triangle for a group of three vertices.
	 * @param first A [GLint] specifying the starting index in the array of vector points.
	 * @param count A [GLsizei] specifying the number of indices to be rendered.
	 */
	fun drawArrays(mode: GLenum, first: GLint, count: GLsizei)
	
	
	/**
	 * The [WebGLRenderingContext].drawElements() method of the WebGL API renders primitives from array data.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/drawElements)
	 *
	 * @param mode A [GLenum] specifying the type primitive to render. Possible values are: gl.POINTS: Draws a single dot. gl.LINE_STRIP: Draws a straight line to the next vertex. gl.LINE_LOOP: Draws a straight line to the next vertex, and connects the last vertex back to the first. gl.LINES: Draws a line between a pair of vertices. gl.TRIANGLE_STRIP gl.TRIANGLE_FAN gl.TRIANGLES: Draws a triangle for a group of three vertices.
	 * @param count A [GLsizei] specifying the number of elements of the bound element array buffer to be rendered. For example, to draw a wireframe triangle with gl.LINES the count should be 2 endpoints per line × 3 lines = 6 elements. However to draw the same wireframe triangle with gl.LINE_STRIP the element array buffer does not repeat the indices for the end of the first line/start of the second line, and end of the second line/start of the third line, so count will be four. To draw the same triangle with gl.LINE_LOOP the element array buffer does not repeat the first/last vertex either so count will be three.
	 * @param type A [GLenum] specifying the type of the values in the element array buffer. Possible values are: gl.UNSIGNED_BYTE gl.UNSIGNED_SHORT When using the OES_element_index_uint extension: gl.UNSIGNED_INT
	 * @param offset A [GLint]ptr specifying a byte offset in the element array buffer. Must be a valid multiple of the size of the given type.
	 */
	fun drawElements(mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr)
	
	
	/**
	 * The [WebGLRenderingContext].enable() method of the WebGL API enables specific WebGL capabilities for this context.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/enable)
	 *
	 * @param cap A [GLenum] specifying which WebGL capability to enable. Possible values: Constant Description gl.BLEND Activates blending of the computed fragment color values. See [WebGLRenderingContext].blendFunc(). gl.CULL_FACE Activates culling of polygons. See [WebGLRenderingContext].cullFace(). gl.DEPTH_TEST Activates depth comparisons and updates to the depth buffer. See [WebGLRenderingContext].depthFunc(). gl.DITHER Activates dithering of color components before they get written to the color buffer. gl.POLYGON_OFFSET_FILL Activates adding an offset to depth values of polygon's fragments. See [WebGLRenderingContext].polygonOffset(). gl.SAMPLE_ALPHA_TO_COVERAGE Activates the computation of a temporary coverage value determined by the alpha value. gl.SAMPLE_COVERAGE Activates ANDing the fragment's coverage with the temporary coverage value. See [WebGLRenderingContext].sampleCoverage(). gl.SCISSOR_TEST Activates the scissor test that discards fragments that are outside of the scissor rectangle. See [WebGLRenderingContext].scissor(). gl.STENCIL_TEST Activates stencil testing and updates to the stencil buffer. See [WebGLRenderingContext].stencilFunc(). When using a WebGL 2 context, the following values are available additionally: Constant Description gl.RASTERIZER_DISCARD Primitives are discarded immediately before the rasterization stage, but after the optional transform feedback stage. gl.clear() commands are ignored.
	 */
	fun enable(cap: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext] method enableVertexAttribArray(), part of the WebGL API, turns on the generic vertex attribute array at the specified index into the list of attribute arrays. Note: You can disable the attribute array by calling disableVertexAttribArray(). In WebGL, values that apply to a specific vertex are stored in attributes. These are only available to the JavaScript code and the vertex shader. Attributes are referenced by an index number into the list of attributes maintained by the GPU. Some vertex attribute indices may have predefined purposes, depending on the platform and/or the GPU. Others are assigned by the WebGL layer when you create the attributes. Either way, since attributes cannot be used unless enabled, and are disabled by default, you need to call enableVertexAttribArray() to enable individual attributes so that they can be used. Once that's been done, other methods can be used to access the attribute, including vertexAttribPointer(), vertexAttrib*(), and getVertexAttrib().
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/enableVertexAttribArray)
	 *
	 * @param index A [GLuint] specifying the index number that uniquely identifies the vertex attribute to enable. If you know the name of the attribute but not its index, you can get the index by calling getAttribLocation().
	 */
	fun enableVertexAttribArray(index: GLuint)
	
	
	/**
	 * The [WebGLRenderingContext].finish() method of the WebGL API blocks execution until all previously called commands are finished.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/finish)
	 *
	 */
	fun finish()
	
	
	/**
	 * The [WebGLRenderingContext].flush() method of the WebGL API empties different buffer commands, causing all commands to be executed as quickly as possible.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/flush)
	 *
	 */
	fun flush()
	
	
	/**
	 * The [WebGLRenderingContext].framebufferRenderbuffer() method of the WebGL API attaches a [WebGLRenderbuffer] object to a [WebGLFramebuffer] object.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/framebufferRenderbuffer)
	 *
	 * @param target A [GLenum] specifying the binding point (target) for the framebuffer. Possible values: gl.FRAMEBUFFER Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image. When using a WebGL 2 context, the following values are available additionally: gl.DRAW_FRAMEBUFFER Equivalent to gl.FRAMEBUFFER. Used as a destination for drawing, rendering, clearing, and writing operations. gl.READ_FRAMEBUFFER Used as a source for reading operations.
	 * @param attachment A [GLenum] specifying the attachment point for the render buffer. Possible values: gl.COLOR_ATTACHMENT0: color buffer. gl.DEPTH_ATTACHMENT: depth buffer. gl.DEPTH_STENCIL_ATTACHMENT: depth and stencil buffer. gl.STENCIL_ATTACHMENT: stencil buffer. When using a WebGL 2 context, the following values are available additionally: gl.COLOR_ATTACHMENT1 gl.COLOR_ATTACHMENT2 gl.COLOR_ATTACHMENT3 gl.COLOR_ATTACHMENT4 gl.COLOR_ATTACHMENT5 gl.COLOR_ATTACHMENT6 gl.COLOR_ATTACHMENT7 gl.COLOR_ATTACHMENT8 gl.COLOR_ATTACHMENT9 gl.COLOR_ATTACHMENT10 gl.COLOR_ATTACHMENT11 gl.COLOR_ATTACHMENT12 gl.COLOR_ATTACHMENT13 gl.COLOR_ATTACHMENT14 gl.COLOR_ATTACHMENT15 When using the WEBGL_draw_buffers extension: ext.COLOR_ATTACHMENT0_WEBGL (same as gl.COLOR_ATTACHMENT0) ext.COLOR_ATTACHMENT1_WEBGL ext.COLOR_ATTACHMENT2_WEBGL ext.COLOR_ATTACHMENT3_WEBGL ext.COLOR_ATTACHMENT4_WEBGL ext.COLOR_ATTACHMENT5_WEBGL ext.COLOR_ATTACHMENT6_WEBGL ext.COLOR_ATTACHMENT7_WEBGL ext.COLOR_ATTACHMENT8_WEBGL ext.COLOR_ATTACHMENT9_WEBGL ext.COLOR_ATTACHMENT10_WEBGL ext.COLOR_ATTACHMENT11_WEBGL ext.COLOR_ATTACHMENT12_WEBGL ext.COLOR_ATTACHMENT13_WEBGL ext.COLOR_ATTACHMENT14_WEBGL ext.COLOR_ATTACHMENT15_WEBGL
	 * @param renderbuffer A [WebGLRenderbuffer] object to attach.
	 */
	fun framebufferRenderbuffer(target: GLenum, attachment: GLenum, renderbuffer: WebGLRenderbuffer)
	
	
	/**
	 * The [WebGLRenderingContext].framebufferTexture2D() method of the WebGL API attaches a texture to a [WebGLFramebuffer].
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/framebufferTexture2D)
	 *
	 * @param target A [GLenum] specifying the binding point (target). Possible values: gl.FRAMEBUFFER Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image. When using a WebGL 2 context, the following values are available additionally: gl.DRAW_FRAMEBUFFER Used as a destination for drawing, rendering, clearing, and writing operations. gl.READ_FRAMEBUFFER Used as a source for reading operations. When binding, gl.FRAMEBUFFER sets both the gl.DRAW_FRAMEBUFFER and gl.READ_FRAMEBUFFER binding points. When referencing, gl.FRAMEBUFFER refers to the gl.DRAW_FRAMEBUFFER binding
	 * @param attachment A [GLenum] specifying the attachment point for the texture. Possible values: gl.COLOR_ATTACHMENT0: Attaches the texture to the framebuffer's color buffer. gl.DEPTH_ATTACHMENT: Attaches the texture to the framebuffer's depth buffer. gl.STENCIL_ATTACHMENT: Attaches the texture to the framebuffer's stencil buffer. When using a WebGL 2 context, the following values are available additionally: gl.DEPTH_STENCIL_ATTACHMENT: depth and stencil buffer. gl.COLOR_ATTACHMENT1 gl.COLOR_ATTACHMENT2 gl.COLOR_ATTACHMENT3 gl.COLOR_ATTACHMENT4 gl.COLOR_ATTACHMENT5 gl.COLOR_ATTACHMENT6 gl.COLOR_ATTACHMENT7 gl.COLOR_ATTACHMENT8 gl.COLOR_ATTACHMENT9 gl.COLOR_ATTACHMENT10 gl.COLOR_ATTACHMENT11 gl.COLOR_ATTACHMENT12 gl.COLOR_ATTACHMENT13 gl.COLOR_ATTACHMENT14 gl.COLOR_ATTACHMENT15 When using the WEBGL_draw_buffers extension: ext.COLOR_ATTACHMENT0_WEBGL (same as gl.COLOR_ATTACHMENT0) ext.COLOR_ATTACHMENT1_WEBGL ext.COLOR_ATTACHMENT2_WEBGL ext.COLOR_ATTACHMENT3_WEBGL ext.COLOR_ATTACHMENT4_WEBGL ext.COLOR_ATTACHMENT5_WEBGL ext.COLOR_ATTACHMENT6_WEBGL ext.COLOR_ATTACHMENT7_WEBGL ext.COLOR_ATTACHMENT8_WEBGL ext.COLOR_ATTACHMENT9_WEBGL ext.COLOR_ATTACHMENT10_WEBGL ext.COLOR_ATTACHMENT11_WEBGL ext.COLOR_ATTACHMENT12_WEBGL ext.COLOR_ATTACHMENT13_WEBGL ext.COLOR_ATTACHMENT14_WEBGL ext.COLOR_ATTACHMENT15_WEBGL When using the WEBGL_depth_texture extension: gl.DEPTH_STENCIL_ATTACHMENT: Depth and stencil buffer data storage.
	 * @param textarget A [GLenum] specifying the texture target. Possible values: gl.TEXTURE_2D: A 2D image. gl.TEXTURE_CUBE_MAP_POSITIVE_X: Image for the positive X face of the cube. gl.TEXTURE_CUBE_MAP_NEGATIVE_X: Image for the negative X face of the cube. gl.TEXTURE_CUBE_MAP_POSITIVE_Y: Image for the positive Y face of the cube. gl.TEXTURE_CUBE_MAP_NEGATIVE_Y: Image for the negative Y face of the cube. gl.TEXTURE_CUBE_MAP_POSITIVE_Z: Image for the positive Z face of the cube. gl.TEXTURE_CUBE_MAP_NEGATIVE_Z: Image for the negative Z face of the cube.
	 * @param texture A [WebGLTexture] object whose image to attach.
	 * @param level A [GLint] specifying the mipmap level of the texture image to be attached. Must be 0.
	 */
	fun framebufferTexture2D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: WebGLTexture, level: GLint)
	
	
	/**
	 * The [WebGLRenderingContext].frontFace() method of the WebGL API specifies whether polygons are front- or back-facing by setting a winding orientation.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/frontFace)
	 *
	 * @param mode A [GLenum] type winding orientation. The default value is gl.CCW. Possible values: gl.CW: Clock-wise winding. gl.CCW: Counter-clock-wise winding.
	 */
	fun frontFace(mode: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].generateMipmap() method of the WebGL API generates a set of mipmaps for a [WebGLTexture] object. Mipmaps are used to create distance with objects. A higher-resolution mipmap is used for objects that are closer, and a lower-resolution mipmap is used for objects that are farther away. It starts with the resolution of the texture image and halves the resolution until a 1x1 dimension texture image is created.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/generateMipmap)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture whose mipmaps will be generated. Possible values: gl.TEXTURE_2D: A two-dimensional texture. gl.TEXTURE_CUBE_MAP: A cube-mapped texture. When using a WebGL 2 context, the following values are available additionally: gl.TEXTURE_3D: A three-dimensional texture. gl.TEXTURE_2D_ARRAY: A two-dimensional array texture.
	 */
	fun generateMipmap(target: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].getActiveAttrib() method of the WebGL API returns a [WebGLActiveInfo] object containing size, type, and name of a vertex attribute. It is generally used when querying unknown attributes either for debugging or generic library creation.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getActiveAttrib)
	 *
	 * @param program A [WebGLProgram] containing the vertex attribute.
	 * @param index A [GLuint] specifying the index of the vertex attribute to get. This value is an index 0 to N - 1 as returned by gl.getProgramParameter(program, gl.ACTIVE_ATTRIBUTES).
	 */
	fun getActiveAttrib(program: WebGLProgram, index: GLuint)
	
	
	/**
	 * The [WebGLRenderingContext].getActiveUniform() method of the WebGL API returns a [WebGLActiveInfo] object containing size, type, and name of a uniform attribute. It is generally used when querying unknown uniforms either for debugging or generic library creation.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getActiveUniform)
	 *
	 * @param program A [WebGLProgram] specifying the WebGL shader program from which to obtain the uniform variable's information.
	 * @param index A [GLuint] specifying the index of the uniform attribute to get. This value is an index 0 to N - 1 as returned by gl.getProgramParameter(program, gl.ACTIVE_UNIFORMS).
	 */
	fun getActiveUniform(program: WebGLProgram, index: GLuint)
	
	
	/**
	 * The [WebGLRenderingContext].getAttachedShaders() method of the WebGL API returns a list of [WebGLShader] objects attached to a [WebGLProgram].
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getAttachedShaders)
	 *
	 * @param program A [WebGLProgram] object to get attached shaders for.
	 */
	fun getAttachedShaders(program: WebGLProgram)
	
	
	/**
	 * The [WebGLRenderingContext].getAttribLocation() method of the WebGL API returns the location of an attribute variable in a given [WebGLProgram].
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getAttribLocation)
	 *
	 * @param program A [WebGLProgram] containing the attribute variable.
	 * @param name A string specifying the name of the attribute variable whose location to get.
	 */
	fun getAttribLocation(program: WebGLProgram, name: DOMString)
	
	
	/**
	 * The [WebGLRenderingContext].getBufferParameter() method of the WebGL API returns information about the buffer.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getBufferParameter)
	 *
	 * @param target A [GLenum] specifying the target buffer object. Possible values: gl.ARRAY_BUFFER Buffer containing vertex attributes, such as vertex coordinates, texture coordinate data, or vertex color data. gl.ELEMENT_ARRAY_BUFFER Buffer used for element indices. When using a WebGL 2 context, the following values are available additionally: gl.COPY_READ_BUFFER Buffer for copying from one buffer object to another. gl.COPY_WRITE_BUFFER Buffer for copying from one buffer object to another. gl.TRANSFORM_FEEDBACK_BUFFER Buffer for transform feedback operations. gl.UNIFORM_BUFFER Buffer used for storing uniform blocks. gl.PIXEL_PACK_BUFFER Buffer used for pixel transfer operations. gl.PIXEL_UNPACK_BUFFER Buffer used for pixel transfer operations.
	 * @param pname A [GLenum] specifying information to query. Possible values: gl.BUFFER_SIZE Returns a [GLint] indicating the size of the buffer in bytes. gl.BUFFER_USAGE Returns a [GLenum] indicating the usage pattern of the buffer. One of the following: gl.STATIC_DRAW gl.DYNAMIC_DRAW gl.STREAM_DRAW When using a WebGL 2 context, the following values are available additionally: gl.STATIC_READ gl.DYNAMIC_READ gl.STREAM_READ gl.STATIC_COPY gl.DYNAMIC_COPY gl.STREAM_COPY
	 */
	fun getBufferParameter(target: GLenum, pname: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].getParameter() method of the WebGL API returns a value for the passed parameter name.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getParameter)
	 *
	 * @param pname A [GLenum] specifying which parameter value to return. See below for possible values.
	 */
	fun getParameter(pname: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].getError() method of the WebGL API returns error information.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getError)
	 *
	 */
	fun getError()
	
	
	/**
	 * The [WebGLRenderingContext].getFramebufferAttachmentParameter() method of the WebGL API returns information about a framebuffer's attachment.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getFramebufferAttachmentParameter)
	 *
	 * @param target A [GLenum] specifying the binding point (target). Possible values: gl.FRAMEBUFFER Collection buffer data storage of color, alpha, depth and stencil buffers used to render an image. When using a WebGL 2 context, the following values are available additionally: gl.DRAW_FRAMEBUFFER Equivalent to gl.FRAMEBUFFER. Used as a destination for drawing, rendering, clearing, and writing operations. gl.READ_FRAMEBUFFER Used as a source for reading operations.
	 * @param attachment A [GLenum] specifying the attachment point for the texture. Possible values: gl.COLOR_ATTACHMENT0: Texture attachment for the framebuffer's color buffer. gl.DEPTH_ATTACHMENT: Texture attachment for the framebuffer's depth buffer. gl.STENCIL_ATTACHMENT: Texture attachment for the framebuffer's stencil buffer. gl.DEPTH_STENCIL_ATTACHMENT: Texture attachment for both, the depth and stencil buffer. When using a WebGL 2 context, the following values are available additionally: gl.COLOR_ATTACHMENT1 gl.COLOR_ATTACHMENT2 gl.COLOR_ATTACHMENT3 gl.COLOR_ATTACHMENT4 gl.COLOR_ATTACHMENT5 gl.COLOR_ATTACHMENT6 gl.COLOR_ATTACHMENT7 gl.COLOR_ATTACHMENT8 gl.COLOR_ATTACHMENT9 gl.COLOR_ATTACHMENT10 gl.COLOR_ATTACHMENT11 gl.COLOR_ATTACHMENT12 gl.COLOR_ATTACHMENT13 gl.COLOR_ATTACHMENT14 gl.COLOR_ATTACHMENT15 When using the WEBGL_draw_buffers extension: ext.COLOR_ATTACHMENT0_WEBGL (same as gl.COLOR_ATTACHMENT0) ext.COLOR_ATTACHMENT1_WEBGL ext.COLOR_ATTACHMENT2_WEBGL ext.COLOR_ATTACHMENT3_WEBGL ext.COLOR_ATTACHMENT4_WEBGL ext.COLOR_ATTACHMENT5_WEBGL ext.COLOR_ATTACHMENT6_WEBGL ext.COLOR_ATTACHMENT7_WEBGL ext.COLOR_ATTACHMENT8_WEBGL ext.COLOR_ATTACHMENT9_WEBGL ext.COLOR_ATTACHMENT10_WEBGL ext.COLOR_ATTACHMENT11_WEBGL ext.COLOR_ATTACHMENT12_WEBGL ext.COLOR_ATTACHMENT13_WEBGL ext.COLOR_ATTACHMENT14_WEBGL ext.COLOR_ATTACHMENT15_WEBGL
	 * @param pname A [GLenum] specifying information to query. Possible values: gl.FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: The type which contains the attached image. gl.FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: The texture or renderbuffer of the attached image ([WebGLRenderbuffer] or [WebGLTexture]). gl.FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Mipmap level. Default value: 0. gl.FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: The name of cube-map face of the texture. When using the EXT_sRGB extension: ext.FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: The framebuffer color encoding. When using a WebGL 2 context, the following values are available additionally: gl.FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE gl.FRAMEBUFFER_ATTACHMENT_BLUE_SIZE gl.FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING gl.FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE gl.FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE gl.FRAMEBUFFER_ATTACHMENT_GREEN_SIZE gl.FRAMEBUFFER_ATTACHMENT_RED_SIZE gl.FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE gl.FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER When using the OVR_multiview2 extension: ext.FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR: the number of views of the framebuffer object attachment. ext.FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR: the base view index of the framebuffer object attachment.
	 */
	fun getFramebufferAttachmentParameter(target: GLenum, attachment: GLenum, pname: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].getProgramParameter() method of the WebGL API returns information about the given program.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getProgramParameter)
	 *
	 * @param program A [WebGLProgram] to get parameter information from.
	 * @param pname A [GLenum] specifying the information to query. Possible values: gl.DELETE_STATUS Returns a [GLboolean] indicating whether or not the program is flagged for deletion. gl.LINK_STATUS Returns a [GLboolean] indicating whether or not the last link operation was successful. gl.VALIDATE_STATUS Returns a [GLboolean] indicating whether or not the last validation operation was successful. gl.ATTACHED_SHADERS Returns a [GLint] indicating the number of attached shaders to a program. gl.ACTIVE_ATTRIBUTES Returns a [GLint] indicating the number of active attribute variables to a program. gl.ACTIVE_UNIFORMS Returns a [GLint] indicating the number of active uniform variables to a program. When using a WebGL 2 context, the following values are available additionally: gl.TRANSFORM_FEEDBACK_BUFFER_MODE Returns a [GLenum] indicating the buffer mode when transform feedback is active. May be gl.SEPARATE_ATTRIBS or gl.INTERLEAVED_ATTRIBS. gl.TRANSFORM_FEEDBACK_VARYINGS Returns a [GLint] indicating the number of varying variables to capture in transform feedback mode. gl.ACTIVE_UNIFORM_BLOCKS Returns a [GLint] indicating the number of uniform blocks containing active uniforms.
	 */
	fun getProgramParameter(program: WebGLProgram, pname: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].getProgramInfoLog returns the information log for the specified [WebGLProgram] object. It contains errors that occurred during failed linking or validation of [WebGLProgram] objects.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getProgramInfoLog)
	 *
	 * @param program The [WebGLProgram] to query.
	 */
	fun getProgramInfoLog(program: WebGLProgram)
	
	
	/**
	 * The [WebGLRenderingContext].getRenderbufferParameter() method of the WebGL API returns information about the renderbuffer.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getRenderbufferParameter)
	 *
	 * @param target A [GLenum] specifying the target renderbuffer object. Possible values: gl.RENDERBUFFER Buffer data storage for single images in a renderable internal format.
	 * @param pname A [GLenum] specifying the information to query. Possible values: gl.RENDERBUFFER_WIDTH Returns a [GLint] indicating the width of the image of the currently bound renderbuffer. gl.RENDERBUFFER_HEIGHT Returns a [GLint] indicating the height of the image of the currently bound renderbuffer. gl.RENDERBUFFER_INTERNAL_FORMAT Returns a [GLenum] indicating the internal format of the currently bound renderbuffer. The default is gl.RGBA4. Possible return values: gl.RGBA4: 4 red bits, 4 green bits, 4 blue bits 4 alpha bits. gl.RGB565: 5 red bits, 6 green bits, 5 blue bits. gl.RGB5_A1: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit. gl.DEPTH_COMPONENT16: 16 depth bits. gl.STENCIL_INDEX8: 8 stencil bits. gl.RENDERBUFFER_GREEN_SIZE Returns a [GLint] that is the resolution size (in bits) for the green color. gl.RENDERBUFFER_BLUE_SIZE Returns a [GLint] that is the resolution size (in bits) for the blue color. gl.RENDERBUFFER_RED_SIZE Returns a [GLint] that is the resolution size (in bits) for the red color. gl.RENDERBUFFER_ALPHA_SIZE Returns a [GLint] that is the resolution size (in bits) for the alpha component. gl.RENDERBUFFER_DEPTH_SIZE Returns a [GLint] that is the resolution size (in bits) for the depth component. gl.RENDERBUFFER_STENCIL_SIZE Returns a [GLint] that is the resolution size (in bits) for the stencil component. When using a WebGL 2 context, the following value is available additionally: gl.RENDERBUFFER_SAMPLES Returns a [GLint] indicating the number of samples of the image of the currently bound renderbuffer.
	 */
	fun getRenderbufferParameter(target: GLenum, pname: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].getShaderParameter() method of the WebGL API returns information about the given shader.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getShaderParameter)
	 *
	 * @param shader A [WebGLShader] to get parameter information from.
	 * @param pname A [GLenum] specifying the information to query. Possible values: gl.DELETE_STATUS Returns a [GLboolean] indicating whether or not the shader is flagged for deletion. gl.COMPILE_STATUS Returns a [GLboolean] indicating whether or not the last shader compilation was successful. gl.SHADER_TYPE Returns a [GLenum] indicating whether the shader is a vertex shader (gl.VERTEX_SHADER) or fragment shader (gl.FRAGMENT_SHADER) object.
	 */
	fun getShaderParameter(shader: WebGLShader, pname: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].getShaderPrecisionFormat() method of the WebGL API returns a new [WebGLShader]PrecisionFormat object describing the range and precision for the specified shader numeric format.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getShaderPrecisionFormat)
	 *
	 * @param shadertype Either a gl.FRAGMENT_SHADER or a gl.VERTEX_SHADER.
	 * @param precisiontype A precision type value. Either gl.LOW_FLOAT, gl.MEDIUM_FLOAT, gl.HIGH_FLOAT, gl.LOW_INT, gl.MEDIUM_INT, or gl.HIGH_INT.
	 */
	fun getShaderPrecisionFormat(shadertype: GLenum, precisiontype: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].getShaderInfoLog returns the information log for the specified [WebGLShader] object. It contains warnings, debugging and compile information.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getShaderInfoLog)
	 *
	 * @param shader A [WebGLShader] to query.
	 */
	fun getShaderInfoLog(shader: WebGLShader)
	
	
	/**
	 * The [WebGLRenderingContext].getShaderSource() method of the WebGL API returns the source code of a [WebGLShader] as a string.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getShaderSource)
	 *
	 * @param shader A [WebGLShader] object to get the source code from.
	 */
	fun getShaderSource(shader: WebGLShader)
	
	
	/**
	 * The [WebGLRenderingContext].getTexParameter() method of the WebGL API returns information about the given texture.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getTexParameter)
	 *
	 * @param target A [GLenum] specifying the binding point (target). Possible values: gl.TEXTURE_2D: A two-dimensional texture. gl.TEXTURE_CUBE_MAP: A cube-mapped texture. When using a WebGL 2 context, the following values are available additionally: gl.TEXTURE_3D: A three-dimensional texture. gl.TEXTURE_2D_ARRAY: A two-dimensional array texture.
	 * @param pname A [GLenum] specifying the information to query. Possible values: pname Return type Description Possible return values Available in a WebGL 1 context gl.TEXTURE_MAG_FILTER [GLenum] Texture magnification filter gl.LINEAR (default value), gl.NEAREST. gl.TEXTURE_MIN_FILTER [GLenum] Texture minification filter gl.LINEAR, gl.NEAREST, gl.NEAREST_MIPMAP_NEAREST, gl.LINEAR_MIPMAP_NEAREST, gl.NEAREST_MIPMAP_LINEAR (default value), gl.LINEAR_MIPMAP_LINEAR. gl.TEXTURE_WRAP_S [GLenum] Wrapping function for texture coordinate s gl.REPEAT (default value), gl.CLAMP_TO_EDGE, gl.MIRRORED_REPEAT. gl.TEXTURE_WRAP_T [GLenum] Wrapping function for texture coordinate t gl.REPEAT (default value), gl.CLAMP_TO_EDGE, gl.MIRRORED_REPEAT. Additionally available when using the EXT_texture_filter_anisotropic extension ext.TEXTURE_MAX_ANISOTROPY_EXT [GLfloat] Maximum anisotropy for a texture Any float values. Additionally available when using a WebGL 2 context gl.TEXTURE_BASE_LEVEL [GLint] Texture mipmap level Any int values. gl.TEXTURE_COMPARE_FUNC [GLenum] Comparison function gl.LEQUAL (default value), gl.GEQUAL, gl.LESS, gl.GREATER, gl.EQUAL, gl.NOTEQUAL, gl.ALWAYS, gl.NEVER. gl.TEXTURE_COMPARE_MODE [GLenum] Texture comparison mode gl.NONE (default value), gl.COMPARE_REF_TO_TEXTURE. gl.TEXTURE_IMMUTABLE_FORMAT [GLboolean] Immutability of the texture format and size true or false. gl.TEXTURE_IMMUTABLE_LEVELS [GLuint] ? Any uint values. gl.TEXTURE_MAX_LEVEL [GLint] Maximum texture mipmap array level Any int values. gl.TEXTURE_MAX_LOD [GLfloat] Texture maximum level-of-detail value Any float values. gl.TEXTURE_MIN_LOD [GLfloat] Texture minimum level-of-detail value Any float values. gl.TEXTURE_WRAP_R [GLenum] Wrapping function for texture coordinate r gl.REPEAT (default value), gl.CLAMP_TO_EDGE, gl.MIRRORED_REPEAT.
	 */
	fun getTexParameter(target: GLenum, pname: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].getUniform() method of the WebGL API returns the value of a uniform variable at a given location.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getUniform)
	 *
	 * @param program A [WebGLProgram] containing the uniform attribute.
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to get.
	 */
	fun getUniform(program: WebGLProgram, location: WebGLUniformLocation)
	
	
	/**
	 * Part of the WebGL API, the [WebGLRenderingContext] method getUniformLocation() returns the location of a specific uniform variable which is part of a given [WebGLProgram]. The uniform variable is returned as a [WebGLUniformLocation] object, which is an opaque identifier used to specify where in the GPU's memory that uniform variable is located. Once you have the uniform's location, you can access the uniform itself using one of the other uniform access methods, passing in the uniform location as one of the inputs: The uniform itself is declared in the shader program using GLSL.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getUniformLocation)
	 *
	 * @param program The [WebGLProgram] in which to locate the specified uniform variable.
	 * @param name A string specifying the name of the uniform variable whose location is to be returned. The name can't have any whitespace in it, and you can't use this function to get the location of any uniforms starting with the reserved string "gl_", since those are internal to the WebGL layer. The possible values correspond to the uniform names returned by getActiveUniform; see that function for specifics on how declared uniforms map to uniform location names. Additionally, for uniforms declared as arrays, the following names are also valid: The uniform name without the [0] suffix. E.g. the location returned for arrayUniform is equivalent to the one for arrayUniform[0]. The uniform name indexed with an integer. E.g. the location returned for arrayUniform[2] would point directly to the third entry of the arrayUniform uniform.
	 */
	fun getUniformLocation(program: WebGLProgram, name: DOMString)
	
	
	/**
	 * The [WebGLRenderingContext].getVertexAttrib() method of the WebGL API returns information about a vertex attribute at a given position.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getVertexAttrib)
	 *
	 * @param index A [GLuint] specifying the index of the vertex attribute.
	 * @param pname A [GLenum] specifying the information to query. Possible values: gl.VERTEX_ATTRIB_ARRAY_BUFFER_BINDING Returns the currently bound [WebGLBuffer]. gl.VERTEX_ATTRIB_ARRAY_ENABLED Returns a [GLboolean] that is true if the vertex attribute is enabled at this index. Otherwise false. gl.VERTEX_ATTRIB_ARRAY_SIZE Returns a [GLint] indicating the size of an element of the vertex array. gl.VERTEX_ATTRIB_ARRAY_STRIDE Returns a [GLint] indicating the number of bytes between successive elements in the array. 0 means that the elements are sequential. gl.VERTEX_ATTRIB_ARRAY_TYPE Returns a [GLenum] representing the array type. One of gl.BYTE gl.UNSIGNED_BYTE gl.SHORT, gl.UNSIGNED_SHORT gl.FLOAT gl.VERTEX_ATTRIB_ARRAY_NORMALIZED Returns a [GLboolean] that is true if fixed-point data types are normalized for the vertex attribute array at the given index. gl.CURRENT_VERTEX_ATTRIB Returns a [Float32Array] (with 4 elements) representing the current value of the vertex attribute at the given index. When using a WebGL 2 context, the following values are available additionally: gl.VERTEX_ATTRIB_ARRAY_INTEGER Returns a [GLboolean] indicating whether an integer data type is in the vertex attribute array at the given index. gl.VERTEX_ATTRIB_ARRAY_DIVISOR Returns a [GLint] describing the frequency divisor used for instanced rendering. When using the ANGLE_instanced_arrays extension: ext.VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE Returns a [GLint] describing the frequency divisor used for instanced rendering.
	 */
	fun getVertexAttrib(index: GLuint, pname: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].getVertexAttribOffset() method of the WebGL API returns the address of a specified vertex attribute.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/getVertexAttribOffset)
	 *
	 * @param index A [GLuint] specifying the index of the vertex attribute.
	 * @param pname A [GLenum] which must be gl.VERTEX_ATTRIB_ARRAY_POINTER.
	 */
	fun getVertexAttribOffset(index: GLuint, pname: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].hint() method of the WebGL API specifies hints for certain behaviors. The interpretation of these hints depend on the implementation.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/hint)
	 *
	 * @param target Sets which behavior to be controlled. Possible values: gl.GENERATE_MIPMAP_HINT Quality of filtering when generating mipmap images with [WebGLRenderingContext].generateMipmap(). When using the OES_standard_derivatives extension: ext.FRAGMENT_SHADER_DERIVATIVE_HINT_OES Accuracy of the derivative calculation for the GLSL built-in functions: dFdx, dFdy, and fwidth. When using a WebGL 2 context, the following values are available additionally: gl.FRAGMENT_SHADER_DERIVATIVE_HINT Same as ext.FRAGMENT_SHADER_DERIVATIVE_HINT_OES
	 * @param mode Sets the behavior. The default value is gl.DONT_CARE. The possible values are: gl.FASTEST: The most efficient behavior should be used. gl.NICEST: The most correct or the highest quality option should be used. gl.DONT_CARE: There is no preference for this behavior.
	 */
	fun hint(target: GLenum, mode: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].isBuffer() method of the WebGL API returns true if the passed [WebGLBuffer] is valid and false otherwise.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/isBuffer)
	 *
	 * @param buffer A [WebGLBuffer] to check.
	 */
	fun isBuffer(buffer: WebGLBuffer)
	
	
	/**
	 * The [WebGLRenderingContext].isEnabled() method of the WebGL API tests whether a specific WebGL capability is enabled or not for this context. By default, all capabilities except gl.DITHER are disabled.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/isEnabled)
	 *
	 * @param cap A [GLenum] specifying which WebGL capability to test. Possible values: Constant Description gl.BLEND Blending of the computed fragment color values. See [WebGLRenderingContext].blendFunc(). gl.CULL_FACE Culling of polygons. See [WebGLRenderingContext].cullFace(). gl.DEPTH_TEST Depth comparisons and updates to the depth buffer. See [WebGLRenderingContext].depthFunc(). gl.DITHER Dithering of color components before they get written to the color buffer. gl.POLYGON_OFFSET_FILL Adding an offset to depth values of polygon's fragments. See [WebGLRenderingContext].polygonOffset(). gl.SAMPLE_ALPHA_TO_COVERAGE Computation of a temporary coverage value determined by the alpha value. gl.SAMPLE_COVERAGE ANDing the fragment's coverage with the temporary coverage value. See [WebGLRenderingContext].sampleCoverage(). gl.SCISSOR_TEST Scissor test that discards fragments that are outside of the scissor rectangle. See [WebGLRenderingContext].scissor(). gl.STENCIL_TEST Stencil testing and updates to the stencil buffer. See [WebGLRenderingContext].stencilFunc(). When using a WebGL 2 context, the following values are available additionally: Constant Description gl.RASTERIZER_DISCARD Primitives are discarded immediately before the rasterization stage, but after the optional transform feedback stage. gl.clear() commands are ignored.
	 */
	fun isEnabled(cap: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].isFramebuffer() method of the WebGL API returns true if the passed [WebGLFramebuffer] is valid and false otherwise.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/isFramebuffer)
	 *
	 * @param framebuffer A [WebGLFramebuffer] to check.
	 */
	fun isFramebuffer(framebuffer: WebGLFramebuffer)
	
	
	/**
	 * The [WebGLRenderingContext].isProgram() method of the WebGL API returns true if the passed [WebGLProgram] is valid, false otherwise.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/isProgram)
	 *
	 * @param program A [WebGLProgram] to check.
	 */
	fun isProgram(program: WebGLProgram)
	
	
	/**
	 * The [WebGLRenderingContext].isRenderbuffer() method of the WebGL API returns true if the passed [WebGLRenderbuffer] is valid and false otherwise.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/isRenderbuffer)
	 *
	 * @param renderbuffer A [WebGLRenderbuffer] to check.
	 */
	fun isRenderbuffer(renderbuffer: WebGLRenderbuffer)
	
	
	/**
	 * The [WebGLRenderingContext].isShader() method of the WebGL API returns true if the passed [WebGLShader] is valid, false otherwise.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/isShader)
	 *
	 * @param shader A [WebGLShader] to check.
	 */
	fun isShader(shader: WebGLShader)
	
	
	/**
	 * The [WebGLRenderingContext].isTexture() method of the WebGL API returns true if the passed [WebGLTexture] is valid and false otherwise.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/isTexture)
	 *
	 * @param texture A [WebGLTexture] to check.
	 */
	fun isTexture(texture: WebGLTexture)
	
	
	/**
	 * The [WebGLRenderingContext].lineWidth() method of the WebGL API sets the line width of rasterized lines. Warning: The webgl spec, based on the OpenGL ES 2.0/3.0 specs points out that the minimum and maximum width for a line is implementation defined. The maximum minimum width is allowed to be 1.0. The minimum maximum width is also allowed to be 1.0. Because of these implementation defined limits it is not recommended to use line widths other than 1.0 since there is no guarantee any user's browser will display any other width. As of January 2017 most implementations of WebGL only support a minimum of 1 and a maximum of 1 as the technology they are based on has these same limits.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/lineWidth)
	 *
	 * @param width A [GLfloat] specifying the width of rasterized lines. Default value: 1.
	 */
	fun lineWidth(width: GLfloat)
	
	
	/**
	 * The [WebGLRenderingContext] interface's linkProgram() method links a given [WebGLProgram], completing the process of preparing the GPU code for the program's fragment and vertex shaders.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/linkProgram)
	 *
	 * @param program The [WebGLProgram] to link.
	 */
	fun linkProgram(program: WebGLProgram)
	
	
	/**
	 * The [WebGLRenderingContext].pixelStorei() method of the WebGL API specifies the pixel storage modes.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/pixelStorei)
	 *
	 * @param pname A [GLenum] specifying which parameter to set. See below for possible values.
	 * @param param A [GLint] specifying a value to set the pname parameter to. See below for possible values.
	 */
	fun pixelStorei(pname: GLenum, param: GLint)
	
	
	/**
	 * The [WebGLRenderingContext].polygonOffset() method of the WebGL API specifies the scale factors and units to calculate depth values. The offset is added before the depth test is performed and before the value is written into the depth buffer.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/polygonOffset)
	 *
	 * @param factor A [GLfloat] which sets the scale factor for the variable depth offset for each polygon. The default value is 0.
	 * @param units A [GLfloat] which sets the multiplier by which an implementation-specific value is multiplied with to create a constant depth offset. The default value is 0.
	 */
	fun polygonOffset(factor: GLfloat, units: GLfloat)
	
	
	/**
	 * The [WebGLRenderingContext].readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into a [TypedArray] or a [DataView] object.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/readPixels)
	 *
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 * @param v1 TODO: Importing this parameters documentation caused troube!
	 * @param width A [GLsizei] specifying the width of the rectangle.
	 * @param height A [GLsizei] specifying the height of the rectangle.
	 * @param format A [GLenum] specifying the format of the pixel data. Possible values: gl.ALPHA Discards the red, green and blue components and reads the alpha component. gl.RGB Discards the alpha components and reads the red, green and blue components. gl.RGBA Red, green, blue and alpha components are read from the color buffer. WebGL2 adds gl.RED gl.RG gl.RED_INTEGER gl.RG_INTEGER gl.RGB_INTEGER gl.RGBA_INTEGER
	 * @param type A [GLenum] specifying the data type of the pixel data. Possible values: gl.UNSIGNED_BYTE gl.UNSIGNED_SHORT_5_6_5 gl.UNSIGNED_SHORT_4_4_4_4 gl.UNSIGNED_SHORT_5_5_5_1 gl.FLOAT WebGL2 adds gl.BYTE gl.UNSIGNED_INT_2_10_10_10_REV gl.HALF_FLOAT gl.SHORT gl.UNSIGNED_SHORT gl.INT gl.UNSIGNED_INT gl.UNSIGNED_INT_10F_11F_11F_REV gl.UNSIGNED_INT_5_9_9_9_REV
	 * @param pixels An object to read data into. The array type must match the type of the type parameter: Uint8Array for gl.UNSIGNED_BYTE. Uint16Array for gl.UNSIGNED_SHORT_5_6_5, gl.UNSIGNED_SHORT_4_4_4_4, or gl.UNSIGNED_SHORT_5_5_5_1. [Float32Array] for gl.FLOAT.
	 */
	fun readPixels(v0: GLint, v1: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: ArrayBufferView)
	
	
	/**
	 * The [WebGLRenderingContext].renderbufferStorage() method of the WebGL API creates and initializes a renderbuffer object's data store.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/renderbufferStorage)
	 *
	 * @param target A [GLenum] specifying the target renderbuffer object. Possible values: gl.RENDERBUFFER Buffer data storage for single images in a renderable internal format.
	 * @param internalformat A [GLenum] specifying the internal format of the renderbuffer. Possible values: gl.RGBA4: 4 red bits, 4 green bits, 4 blue bits 4 alpha bits. gl.RGB565: 5 red bits, 6 green bits, 5 blue bits. gl.RGB5_A1: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit. gl.DEPTH_COMPONENT16: 16 depth bits. gl.STENCIL_INDEX8: 8 stencil bits. gl.DEPTH_STENCIL When using a WebGL 2 context, the following values are available additionally: gl.R8 gl.R8UI gl.R8I gl.R16UI gl.R16I gl.R32UI gl.R32I gl.RG8 gl.RG8UI gl.RG8I gl.RG16UI gl.RG16I gl.RG32UI gl.RG32I gl.RGB8 gl.RGBA8 gl.SRGB8_ALPHA8 (also available as an extension for WebGL 1, see below) gl.RGB10_A2 gl.RGBA8UI gl.RGBA8I gl.RGB10_A2UI gl.RGBA16UI gl.RGBA16I gl.RGBA32I gl.RGBA32UI gl.DEPTH_COMPONENT24 gl.DEPTH_COMPONENT32F gl.DEPTH24_STENCIL8 gl.DEPTH32F_STENCIL8 When using the WEBGL_color_buffer_float extension: ext.RGBA32F_EXT: RGBA 32-bit floating-point type. ext.RGB32F_EXT: RGB 32-bit floating-point type. When using the EXT_sRGB extension: ext.SRGB8_ALPHA8_EXT: 8-bit sRGB and alpha. When using a WebGL 2 context and the EXT_color_buffer_float extension: gl.R16F gl.RG16F gl.RGBA16F gl.R32F gl.RG32F gl.RGBA32F gl.R11F_G11F_B10F
	 * @param width A [GLsizei] specifying the width of the renderbuffer in pixels.
	 * @param height A [GLsizei] specifying the height of the renderbuffer in pixels.
	 */
	fun renderbufferStorage(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei)
	
	
	/**
	 * The [WebGLRenderingContext].sampleCoverage() method of the WebGL API specifies multi-sample coverage parameters for anti-aliasing effects.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/sampleCoverage)
	 *
	 * @param value A [GLclampf] which sets a single floating-point coverage value clamped to the range [0,1]. The default value is 1.0.
	 * @param invert A [GLboolean] which sets whether or not the coverage masks should be inverted. The default value is false.
	 */
	fun sampleCoverage(value: GLclampf, invert: GLboolean)
	
	
	/**
	 * The [WebGLRenderingContext].scissor() method of the WebGL API sets a scissor box, which limits the drawing to a specified rectangle.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/scissor)
	 *
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 * @param v1 TODO: Importing this parameters documentation caused troube!
	 * @param width A non-negative [GLsizei] specifying the width of the scissor box. Default value: width of the canvas.
	 * @param height A non-negative [GLsizei] specifying the height of the scissor box. Default value: height of the canvas.
	 */
	fun scissor(v0: GLint, v1: GLint, width: GLsizei, height: GLsizei)
	
	
	/**
	 * The [WebGLRenderingContext].shaderSource() method of the WebGL API sets the source code of a [WebGLShader].
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/shaderSource)
	 *
	 * @param shader A [WebGLShader] object in which to set the source code.
	 * @param source A string containing the GLSL source code to set.
	 */
	fun shaderSource(shader: WebGLShader, source: DOMString)
	
	
	/**
	 * The [WebGLRenderingContext].stencilFunc() method of the WebGL API sets the front and back function and reference value for stencil testing. Stenciling enables and disables drawing on a per-pixel basis. It is typically used in multipass rendering to achieve special effects.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/stencilFunc)
	 *
	 * @param func A [GLenum] specifying the test function. The default function is gl.ALWAYS. The possible values are: gl.NEVER: Never pass. gl.LESS: Pass if (ref & mask) < (stencil & mask). gl.EQUAL: Pass if (ref & mask) = (stencil & mask). gl.LEQUAL: Pass if (ref & mask) <= (stencil & mask). gl.GREATER: Pass if (ref & mask) > (stencil & mask). gl.NOTEQUAL: Pass if (ref & mask) !== (stencil & mask). gl.GEQUAL: Pass if (ref & mask) >= (stencil & mask). gl.ALWAYS: Always pass.
	 * @param ref A [GLint] specifying the reference value for the stencil test. This value is clamped to the range 0 to 2^n - 1 where n is the number of bitplanes in the stencil buffer. The default value is 0.
	 * @param mask A [GLuint] specifying a bit-wise mask that is used to AND the reference value and the stored stencil value when the test is done. The default value is all 1.
	 */
	fun stencilFunc(func: GLenum, ref: GLint, mask: GLuint)
	
	
	/**
	 * The [WebGLRenderingContext].stencilFuncSeparate() method of the WebGL API sets the front and/or back function and reference value for stencil testing. Stencilling enables and disables drawing on a per-pixel basis. It is typically used in multipass rendering to achieve special effects.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/stencilFuncSeparate)
	 *
	 * @param face A [GLenum] specifying whether the front and/or back stencil state is updated. The possible values are: gl.FRONT gl.BACK gl.FRONT_AND_BACK
	 * @param func A [GLenum] specifying the test function. The default function is gl.ALWAYS. The possible values are: gl.NEVER: Never pass. gl.LESS: Pass if (ref & mask) < (stencil & mask). gl.EQUAL: Pass if (ref & mask) = (stencil & mask). gl.LEQUAL: Pass if (ref & mask) <= (stencil & mask). gl.GREATER: Pass if (ref & mask) > (stencil & mask). gl.NOTEQUAL: Pass if (ref & mask) !== (stencil & mask). gl.GEQUAL: Pass if (ref & mask) >= (stencil & mask). gl.ALWAYS: Always pass.
	 * @param ref A [GLint] specifying the reference value for the stencil test. This value is clamped to the range 0 to 2^n - 1 where n is the number of bitplanes in the stencil buffer. The default value is 0.
	 * @param mask A [GLuint] specifying a bit-wise mask that is used to AND the reference value and the stored stencil value when the test is done. The default value is all 1.
	 */
	fun stencilFuncSeparate(face: GLenum, func: GLenum, ref: GLint, mask: GLuint)
	
	
	/**
	 * The [WebGLRenderingContext].stencilMask() method of the WebGL API controls enabling and disabling of both the front and back writing of individual bits in the stencil planes. The [WebGLRenderingContext].stencilMaskSeparate() method can set front and back stencil writemasks to different values.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/stencilMask)
	 *
	 * @param mask A [GLuint] specifying a bit mask to enable or disable writing of individual bits in the stencil planes. By default, the mask is all 1.
	 */
	fun stencilMask(mask: GLuint)
	
	
	/**
	 * The [WebGLRenderingContext].stencilMaskSeparate() method of the WebGL API controls enabling and disabling of front and/or back writing of individual bits in the stencil planes. The [WebGLRenderingContext].stencilMask() method can set both, the front and back stencil writemasks to one value at the same time.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/stencilMaskSeparate)
	 *
	 * @param face A [GLenum] specifying whether the front and/or back stencil writemask is updated. The possible values are: gl.FRONT gl.BACK gl.FRONT_AND_BACK
	 * @param mask A [GLuint] specifying a bit mask to enable or disable writing of individual bits in the stencil planes. By default, the mask is all 1.
	 */
	fun stencilMaskSeparate(face: GLenum, mask: GLuint)
	
	
	/**
	 * The [WebGLRenderingContext].stencilOp() method of the WebGL API sets both the front and back-facing stencil test actions.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/stencilOp)
	 *
	 * @param fail A [GLenum] specifying the function to use when the stencil test fails. The default value is gl.KEEP.
	 * @param zfail A [GLenum] specifying the function to use when the stencil test passes, but the depth test fails. The default value is gl.KEEP.
	 * @param zpass A [GLenum] specifying the function to use when both the stencil test and the depth test pass, or when the stencil test passes and there is no depth buffer or depth testing is disabled. The default value is gl.KEEP.
	 */
	fun stencilOp(fail: GLenum, zfail: GLenum, zpass: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].stencilOpSeparate() method of the WebGL API sets the front and/or back-facing stencil test actions.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/stencilOpSeparate)
	 *
	 * @param face A [GLenum] specifying whether the front and/or back stencil state is updated. The possible values are: gl.FRONT gl.BACK gl.FRONT_AND_BACK
	 * @param fail A [GLenum] specifying the function to use when the stencil test fails. The default value is gl.KEEP.
	 * @param zfail A [GLenum] specifying the function to use when the stencil test passes, but the depth test fails. The default value is gl.KEEP.
	 * @param zpass A [GLenum] specifying the function to use when both the stencil test and the depth test pass, or when the stencil test passes and there is no depth buffer or depth testing is disabled. The default value is gl.KEEP.
	 */
	fun stencilOpSeparate(face: GLenum, fail: GLenum, zfail: GLenum, zpass: GLenum)
	
	
	/**
	 * The [WebGLRenderingContext].texImage2D() method of the WebGL API specifies a two-dimensional texture image.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/texImage2D)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture. Possible values: gl.TEXTURE_2D: A two-dimensional texture. gl.TEXTURE_CUBE_MAP_POSITIVE_X: Positive X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_X: Negative X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Y: Positive Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Y: Negative Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Z: Positive Z face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Z: Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction level.
	 * @param internalformat A [GLenum] specifying the color components in the texture. Possible values in both WebGL1 and WebGL2 Format Type Channels Bytes per pixel RGBA UNSIGNED_BYTE 4 4 RGB UNSIGNED_BYTE 3 3 RGBA UNSIGNED_SHORT_4_4_4_4 4 2 RGBA UNSIGNED_SHORT_5_5_5_1 4 2 RGB UNSIGNED_SHORT_5_6_5 3 2 LUMINANCE_ALPHA UNSIGNED_BYTE 2 2 LUMINANCE UNSIGNED_BYTE 1 1 ALPHA UNSIGNED_BYTE 1 1 Other possible values in WebGL2 for the versions of texImage2D that take a [TypedArray] or a [DataView], or a [GLint]ptr offset Sized Format Base Format R bits G bits B bits A bits Shared bits Color renderable Texture filterable R8 RED 8 ● ● R8_SNORM RED s8 ● RG8 RG 8 8 ● ● RG8_SNORM RG s8 s8 ● RGB8 RGB 8 8 8 ● ● RGB8_SNORM RGB s8 s8 s8 ● RGB565 RGB 5 6 5 ● ● RGBA4 RGBA 4 4 4 4 ● ● RGB5_A1 RGBA 5 5 5 1 ● ● RGBA8 RGBA 8 8 8 8 ● ● RGBA8_SNORM RGBA s8 s8 s8 s8 ● RGB10_A2 RGBA 10 10 10 2 ● ● RGB10_A2UI RGBA ui10 ui10 ui10 ui2 ● SRGB8 RGB 8 8 8 ● SRGB8_ALPHA8 RGBA 8 8 8 8 ● ● R16F RED f16 ● RG16F RG f16 f16 ● RGB16F RGB f16 f16 f16 ● RGBA16F RGBA f16 f16 f16 f16 ● R32F RED f32 RG32F RG f32 f32 RGB32F RGB f32 f32 f32 RGBA32F RGBA f32 f32 f32 f32 R11F_G11F_B10F RGB f11 f11 f10 ● RGB9_E5 RGB 9 9 9 5 ● R8I RED i8 ● R8UI RED ui8 ● R16I RED i16 ● R16UI RED ui16 ● R32I RED i32 ● R32UI RED ui32 ● RG8I RG i8 i8 ● RG8UI RG ui8 ui8 ● RG16I RG i16 i16 ● RG16UI RG ui16 ui16 ● RG32I RG i32 i32 ● RG32UI RG ui32 ui32 ● RGB8I RGB i8 i8 i8 RGB8UI RGB ui8 ui8 ui8 RGB16I RGB i16 i16 i16 RGB16UI RGB ui16 ui16 ui16 RGB32I RGB i32 i32 i32 RGB32UI RGB ui32 ui32 ui32 RGBA8I RGBA i8 i8 i8 i8 ● RGBA8UI RGBA ui8 ui8 ui8 ui8 ● RGBA16I RGBA i16 i16 i16 i16 ● RGBA16UI RGBA ui16 ui16 ui16 ui16 ● RGBA32I RGBA i32 i32 i32 i32 ● RGBA32UI RGBA ui32 ui32 ui32 ui32 ● Possible values in WebGL2 for the versions of texImage2D that take a texture an HTMLImageElement, [HTMLCanvasElement], HTMLVideoElement, ImageBitmap, or ImageData gl.ALPHA: Discards the red, green and blue components and reads the alpha component. gl.RGB: Discards the alpha components and reads the red, green and blue components. gl.RGBA: Red, green, blue and alpha components are read from the color buffer. gl.LUMINANCE: Each color component is a luminance component, alpha is 1.0. gl.LUMINANCE_ALPHA: Each component is a luminance/alpha component. When using the WEBGL_depth_texture extension: gl.DEPTH_COMPONENT gl.DEPTH_STENCIL When using the EXT_sRGB extension: ext.SRGB_EXT ext.SRGB_ALPHA_EXT When using a WebGL 2 context, the following values are available additionally: gl.R8 gl.R16F gl.R32F gl.R8UI gl.RG8 gl.RG16F gl.RG32F gl.RG8UI gl.RG16UI gl.RG32UI gl.RGB8 gl.SRGB8 gl.RGB565 gl.R11F_G11F_B10F gl.RGB9_E5 gl.RGB16F gl.RGB32F gl.RGB8UI gl.RGBA8 gl.SRGB8_ALPHA8 gl.RGB5_A1 gl.RGB10_A2 gl.RGBA4 gl.RGBA16F gl.RGBA32F gl.RGBA8UI
	 * @param type A [GLenum] specifying the data type of the texel data. Possible values: gl.UNSIGNED_BYTE: 8 bits per channel for gl.RGBA gl.UNSIGNED_SHORT_5_6_5: 5 red bits, 6 green bits, 5 blue bits. gl.UNSIGNED_SHORT_4_4_4_4: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits. gl.UNSIGNED_SHORT_5_5_5_1: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit. When using the WEBGL_depth_texture extension: gl.UNSIGNED_SHORT gl.UNSIGNED_INT ext.UNSIGNED_INT_24_8_WEBGL (constant provided by the extension) When using the OES_texture_float extension: gl.FLOAT When using the OES_texture_half_float extension: ext.HALF_FLOAT_OES (constant provided by the extension) When using a WebGL 2 context, the following values are available additionally: gl.BYTE gl.UNSIGNED_SHORT gl.SHORT gl.UNSIGNED_INT gl.INT gl.HALF_FLOAT gl.FLOAT gl.UNSIGNED_INT_2_10_10_10_REV gl.UNSIGNED_INT_10F_11F_11F_REV gl.UNSIGNED_INT_5_9_9_9_REV gl.UNSIGNED_INT_24_8 gl.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)
	 * @param pixels The following types can always be used as a pixel source for the texture: ImageData, HTMLImageElement, [HTMLCanvasElement], HTMLVideoElement, ImageBitmap. The following types can only be used as a pixel source when width, height, and border are specified: Uint8Array (must be used if type is gl.UNSIGNED_BYTE) Uint16Array (must be used if type is either gl.UNSIGNED_SHORT_5_6_5, gl.UNSIGNED_SHORT_4_4_4_4, gl.UNSIGNED_SHORT_5_5_5_1, gl.UNSIGNED_SHORT or ext.HALF_FLOAT_OES) Uint32Array (must be used if type is gl.UNSIGNED_INT or ext.UNSIGNED_INT_24_8_WEBGL) [Float32Array] (must be used if type is gl.FLOAT)
	 */
	fun texImage2D(target: GLenum, level: GLint, internalformat: GLenum, type: GLenum, pixels: ArrayBufferView)
	
	
	/**
	 * The [WebGLRenderingContext].texImage2D() method of the WebGL API specifies a two-dimensional texture image.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/texImage2D)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture. Possible values: gl.TEXTURE_2D: A two-dimensional texture. gl.TEXTURE_CUBE_MAP_POSITIVE_X: Positive X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_X: Negative X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Y: Positive Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Y: Negative Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Z: Positive Z face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Z: Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction level.
	 * @param internalformat A [GLenum] specifying the color components in the texture. Possible values in both WebGL1 and WebGL2 Format Type Channels Bytes per pixel RGBA UNSIGNED_BYTE 4 4 RGB UNSIGNED_BYTE 3 3 RGBA UNSIGNED_SHORT_4_4_4_4 4 2 RGBA UNSIGNED_SHORT_5_5_5_1 4 2 RGB UNSIGNED_SHORT_5_6_5 3 2 LUMINANCE_ALPHA UNSIGNED_BYTE 2 2 LUMINANCE UNSIGNED_BYTE 1 1 ALPHA UNSIGNED_BYTE 1 1 Other possible values in WebGL2 for the versions of texImage2D that take a [TypedArray] or a [DataView], or a [GLint]ptr offset Sized Format Base Format R bits G bits B bits A bits Shared bits Color renderable Texture filterable R8 RED 8 ● ● R8_SNORM RED s8 ● RG8 RG 8 8 ● ● RG8_SNORM RG s8 s8 ● RGB8 RGB 8 8 8 ● ● RGB8_SNORM RGB s8 s8 s8 ● RGB565 RGB 5 6 5 ● ● RGBA4 RGBA 4 4 4 4 ● ● RGB5_A1 RGBA 5 5 5 1 ● ● RGBA8 RGBA 8 8 8 8 ● ● RGBA8_SNORM RGBA s8 s8 s8 s8 ● RGB10_A2 RGBA 10 10 10 2 ● ● RGB10_A2UI RGBA ui10 ui10 ui10 ui2 ● SRGB8 RGB 8 8 8 ● SRGB8_ALPHA8 RGBA 8 8 8 8 ● ● R16F RED f16 ● RG16F RG f16 f16 ● RGB16F RGB f16 f16 f16 ● RGBA16F RGBA f16 f16 f16 f16 ● R32F RED f32 RG32F RG f32 f32 RGB32F RGB f32 f32 f32 RGBA32F RGBA f32 f32 f32 f32 R11F_G11F_B10F RGB f11 f11 f10 ● RGB9_E5 RGB 9 9 9 5 ● R8I RED i8 ● R8UI RED ui8 ● R16I RED i16 ● R16UI RED ui16 ● R32I RED i32 ● R32UI RED ui32 ● RG8I RG i8 i8 ● RG8UI RG ui8 ui8 ● RG16I RG i16 i16 ● RG16UI RG ui16 ui16 ● RG32I RG i32 i32 ● RG32UI RG ui32 ui32 ● RGB8I RGB i8 i8 i8 RGB8UI RGB ui8 ui8 ui8 RGB16I RGB i16 i16 i16 RGB16UI RGB ui16 ui16 ui16 RGB32I RGB i32 i32 i32 RGB32UI RGB ui32 ui32 ui32 RGBA8I RGBA i8 i8 i8 i8 ● RGBA8UI RGBA ui8 ui8 ui8 ui8 ● RGBA16I RGBA i16 i16 i16 i16 ● RGBA16UI RGBA ui16 ui16 ui16 ui16 ● RGBA32I RGBA i32 i32 i32 i32 ● RGBA32UI RGBA ui32 ui32 ui32 ui32 ● Possible values in WebGL2 for the versions of texImage2D that take a texture an HTMLImageElement, [HTMLCanvasElement], HTMLVideoElement, ImageBitmap, or ImageData gl.ALPHA: Discards the red, green and blue components and reads the alpha component. gl.RGB: Discards the alpha components and reads the red, green and blue components. gl.RGBA: Red, green, blue and alpha components are read from the color buffer. gl.LUMINANCE: Each color component is a luminance component, alpha is 1.0. gl.LUMINANCE_ALPHA: Each component is a luminance/alpha component. When using the WEBGL_depth_texture extension: gl.DEPTH_COMPONENT gl.DEPTH_STENCIL When using the EXT_sRGB extension: ext.SRGB_EXT ext.SRGB_ALPHA_EXT When using a WebGL 2 context, the following values are available additionally: gl.R8 gl.R16F gl.R32F gl.R8UI gl.RG8 gl.RG16F gl.RG32F gl.RG8UI gl.RG16UI gl.RG32UI gl.RGB8 gl.SRGB8 gl.RGB565 gl.R11F_G11F_B10F gl.RGB9_E5 gl.RGB16F gl.RGB32F gl.RGB8UI gl.RGBA8 gl.SRGB8_ALPHA8 gl.RGB5_A1 gl.RGB10_A2 gl.RGBA4 gl.RGBA16F gl.RGBA32F gl.RGBA8UI
	 * @param format A [GLenum] specifying the format of the texel data. In WebGL 1, this must be the same as internalformat (see above). in WebGL 2, the combinations are listed in this table.
	 * @param type A [GLenum] specifying the data type of the texel data. Possible values: gl.UNSIGNED_BYTE: 8 bits per channel for gl.RGBA gl.UNSIGNED_SHORT_5_6_5: 5 red bits, 6 green bits, 5 blue bits. gl.UNSIGNED_SHORT_4_4_4_4: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits. gl.UNSIGNED_SHORT_5_5_5_1: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit. When using the WEBGL_depth_texture extension: gl.UNSIGNED_SHORT gl.UNSIGNED_INT ext.UNSIGNED_INT_24_8_WEBGL (constant provided by the extension) When using the OES_texture_float extension: gl.FLOAT When using the OES_texture_half_float extension: ext.HALF_FLOAT_OES (constant provided by the extension) When using a WebGL 2 context, the following values are available additionally: gl.BYTE gl.UNSIGNED_SHORT gl.SHORT gl.UNSIGNED_INT gl.INT gl.HALF_FLOAT gl.FLOAT gl.UNSIGNED_INT_2_10_10_10_REV gl.UNSIGNED_INT_10F_11F_11F_REV gl.UNSIGNED_INT_5_9_9_9_REV gl.UNSIGNED_INT_24_8 gl.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)
	 * @param source TODO: Importing this parameters documentation caused troube!
	 */
	fun texImage2D(target: GLenum, level: GLint, internalformat: GLenum, format: GLenum, type: GLenum, source: TexImageSource)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/texParameter)
	 *
	 * @param target A [GLenum] specifying the binding point (target). Possible values: gl.TEXTURE_2D: A two-dimensional texture. gl.TEXTURE_CUBE_MAP: A cube-mapped texture. When using a WebGL 2 context, the following values are available additionally: gl.TEXTURE_3D: A three-dimensional texture. gl.TEXTURE_2D_ARRAY: A two-dimensional array texture.
	 * @param pname The pname parameter is a [GLenum] specifying the texture parameter to set.
	 * @param param The param parameter is a [GLfloat] or [GLint] specifying the value for the specified parameter
	 */
	fun texParameterf(target: GLenum, pname: GLenum, param: GLfloat)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/texParameter)
	 *
	 * @param target A [GLenum] specifying the binding point (target). Possible values: gl.TEXTURE_2D: A two-dimensional texture. gl.TEXTURE_CUBE_MAP: A cube-mapped texture. When using a WebGL 2 context, the following values are available additionally: gl.TEXTURE_3D: A three-dimensional texture. gl.TEXTURE_2D_ARRAY: A two-dimensional array texture.
	 * @param pname The pname parameter is a [GLenum] specifying the texture parameter to set.
	 * @param param The param parameter is a [GLfloat] or [GLint] specifying the value for the specified parameter
	 */
	fun texParameteri(target: GLenum, pname: GLenum, param: GLint)
	
	
	/**
	 * The [WebGLRenderingContext].texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/texSubImage2D)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture. Possible values: gl.TEXTURE_2D: A two-dimensional texture. gl.TEXTURE_CUBE_MAP_POSITIVE_X: Positive X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_X: Negative X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Y: Positive Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Y: Negative Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Z: Positive Z face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Z: Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction level.
	 * @param xoffset A [GLint] specifying the lower left texel x coordinate of a width-wide by height-wide rectangular subregion of the texture array.
	 * @param yoffset A [GLint] specifying the lower left texel y coordinate of a width-wide by height-wide rectangular subregion of the texture array.
	 * @param format A [GLenum] specifying the format of the texel data. Possible values: gl.ALPHA: Discards the red, green and blue components and reads the alpha component. gl.RGB: Discards the alpha components and reads the red, green and blue components. gl.RGBA: Red, green, blue and alpha components are read from the color buffer. gl.LUMINANCE: Each color component is a luminance component, alpha is 1.0. gl.LUMINANCE_ALPHA: Each component is a luminance/alpha component. When using the EXT_sRGB extension: ext.SRGB_EXT ext.SRGB_ALPHA_EXT When using a WebGL 2 context, the following values are available additionally: gl.RED gl.RG gl.RED_INTEGER gl.RG_INTEGER gl.RGB_INTEGER gl.RGBA_INTEGER
	 * @param type A [GLenum] specifying the data type of the texel data. Possible values: gl.UNSIGNED_BYTE: 8 bits per channel for gl.RGBA gl.UNSIGNED_SHORT_5_6_5: 5 red bits, 6 green bits, 5 blue bits. gl.UNSIGNED_SHORT_4_4_4_4: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits. gl.UNSIGNED_SHORT_5_5_5_1: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit. When using the OES_texture_float extension: gl.FLOAT When using the OES_texture_half_float extension: gl.HALF_FLOAT_OES When using a WebGL 2 context, the following values are available additionally: gl.BYTE gl.UNSIGNED_SHORT gl.SHORT gl.UNSIGNED_INT gl.INT gl.HALF_FLOAT gl.FLOAT gl.UNSIGNED_INT_2_10_10_10_REV gl.UNSIGNED_INT_10F_11F_11F_REV gl.UNSIGNED_INT_5_9_9_9_REV gl.UNSIGNED_INT_24_8 gl.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)
	 * @param pixels One of the following objects can be used as a pixel source for the texture: Uint8Array (Must be used if type is gl.UNSIGNED_BYTE) Uint16Array (Must be used if type is either gl.UNSIGNED_SHORT_5_6_5, gl.UNSIGNED_SHORT_4_4_4_4, gl.UNSIGNED_SHORT_5_5_5_1, or ext.HALF_FLOAT_OES) [Float32Array] (Must be used if type is gl.FLOAT) ImageData, HTMLImageElement, [HTMLCanvasElement], HTMLVideoElement, ImageBitmap.
	 */
	fun texSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, format: GLenum, type: GLenum, pixels: ArrayBufferView)
	
	
	/**
	 * The [WebGLRenderingContext].texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/texSubImage2D)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture. Possible values: gl.TEXTURE_2D: A two-dimensional texture. gl.TEXTURE_CUBE_MAP_POSITIVE_X: Positive X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_X: Negative X face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Y: Positive Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Y: Negative Y face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_POSITIVE_Z: Positive Z face for a cube-mapped texture. gl.TEXTURE_CUBE_MAP_NEGATIVE_Z: Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction level.
	 * @param xoffset A [GLint] specifying the lower left texel x coordinate of a width-wide by height-wide rectangular subregion of the texture array.
	 * @param yoffset A [GLint] specifying the lower left texel y coordinate of a width-wide by height-wide rectangular subregion of the texture array.
	 * @param format A [GLenum] specifying the format of the texel data. Possible values: gl.ALPHA: Discards the red, green and blue components and reads the alpha component. gl.RGB: Discards the alpha components and reads the red, green and blue components. gl.RGBA: Red, green, blue and alpha components are read from the color buffer. gl.LUMINANCE: Each color component is a luminance component, alpha is 1.0. gl.LUMINANCE_ALPHA: Each component is a luminance/alpha component. When using the EXT_sRGB extension: ext.SRGB_EXT ext.SRGB_ALPHA_EXT When using a WebGL 2 context, the following values are available additionally: gl.RED gl.RG gl.RED_INTEGER gl.RG_INTEGER gl.RGB_INTEGER gl.RGBA_INTEGER
	 * @param type A [GLenum] specifying the data type of the texel data. Possible values: gl.UNSIGNED_BYTE: 8 bits per channel for gl.RGBA gl.UNSIGNED_SHORT_5_6_5: 5 red bits, 6 green bits, 5 blue bits. gl.UNSIGNED_SHORT_4_4_4_4: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits. gl.UNSIGNED_SHORT_5_5_5_1: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit. When using the OES_texture_float extension: gl.FLOAT When using the OES_texture_half_float extension: gl.HALF_FLOAT_OES When using a WebGL 2 context, the following values are available additionally: gl.BYTE gl.UNSIGNED_SHORT gl.SHORT gl.UNSIGNED_INT gl.INT gl.HALF_FLOAT gl.FLOAT gl.UNSIGNED_INT_2_10_10_10_REV gl.UNSIGNED_INT_10F_11F_11F_REV gl.UNSIGNED_INT_5_9_9_9_REV gl.UNSIGNED_INT_24_8 gl.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)
	 * @param source TODO: Importing this parameters documentation caused troube!
	 */
	fun texSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, format: GLenum, type: GLenum, source: TexImageSource)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform1f(location: WebGLUniformLocation, v0: GLfloat)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform1fv(location: WebGLUniformLocation, value: Float32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform1fv(location: WebGLUniformLocation, value: List<GLfloat>)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform1i(location: WebGLUniformLocation, v0: GLint)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform1iv(location: WebGLUniformLocation, value: Int32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform1iv(location: WebGLUniformLocation, value: List<Long>)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 * @param v1 TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform2f(location: WebGLUniformLocation, v0: GLfloat, v1: GLfloat)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform2fv(location: WebGLUniformLocation, value: Float32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform2fv(location: WebGLUniformLocation, value: List<GLfloat>)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 * @param v1 TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform2i(location: WebGLUniformLocation, v0: GLint, v1: GLint)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform2iv(location: WebGLUniformLocation, value: Int32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform2iv(location: WebGLUniformLocation, value: List<Long>)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 * @param v1 TODO: Importing this parameters documentation caused troube!
	 * @param v2 TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform3f(location: WebGLUniformLocation, v0: GLfloat, v1: GLfloat, v2: GLfloat)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform3fv(location: WebGLUniformLocation, value: Float32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform3fv(location: WebGLUniformLocation, value: List<GLfloat>)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 * @param v1 TODO: Importing this parameters documentation caused troube!
	 * @param v2 TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform3i(location: WebGLUniformLocation, v0: GLint, v1: GLint, v2: GLint)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform3iv(location: WebGLUniformLocation, value: Int32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform3iv(location: WebGLUniformLocation, value: List<Long>)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 * @param v1 TODO: Importing this parameters documentation caused troube!
	 * @param v2 TODO: Importing this parameters documentation caused troube!
	 * @param v3 TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform4f(location: WebGLUniformLocation, v0: GLfloat, v1: GLfloat, v2: GLfloat, v3: GLfloat)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform4fv(location: WebGLUniformLocation, value: Float32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform4fv(location: WebGLUniformLocation, value: List<GLfloat>)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 * @param v1 TODO: Importing this parameters documentation caused troube!
	 * @param v2 TODO: Importing this parameters documentation caused troube!
	 * @param v3 TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform4i(location: WebGLUniformLocation, v0: GLint, v1: GLint, v2: GLint, v3: GLint)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform4iv(location: WebGLUniformLocation, value: Int32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniform)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value TODO: Importing this parameters documentation caused troube!
	 */
	fun uniform4iv(location: WebGLUniformLocation, value: List<Long>)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniformMatrix)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify. The location is obtained using getUniformLocation().
	 * @param transpose A [GLboolean] specifying whether to transpose the matrix. Must be false.
	 * @param value A [Float32Array] or sequence of [GLfloat] values. The values are assumed to be supplied in column major order.
	 */
	fun uniformMatrix2fv(location: WebGLUniformLocation, transpose: GLboolean, value: Float32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniformMatrix)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify. The location is obtained using getUniformLocation().
	 * @param transpose A [GLboolean] specifying whether to transpose the matrix. Must be false.
	 * @param value A [Float32Array] or sequence of [GLfloat] values. The values are assumed to be supplied in column major order.
	 */
	fun uniformMatrix2fv(location: WebGLUniformLocation, transpose: GLboolean, value: List<GLfloat>)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniformMatrix)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify. The location is obtained using getUniformLocation().
	 * @param transpose A [GLboolean] specifying whether to transpose the matrix. Must be false.
	 * @param value A [Float32Array] or sequence of [GLfloat] values. The values are assumed to be supplied in column major order.
	 */
	fun uniformMatrix3fv(location: WebGLUniformLocation, transpose: GLboolean, value: Float32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniformMatrix)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify. The location is obtained using getUniformLocation().
	 * @param transpose A [GLboolean] specifying whether to transpose the matrix. Must be false.
	 * @param value A [Float32Array] or sequence of [GLfloat] values. The values are assumed to be supplied in column major order.
	 */
	fun uniformMatrix3fv(location: WebGLUniformLocation, transpose: GLboolean, value: List<GLfloat>)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniformMatrix)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify. The location is obtained using getUniformLocation().
	 * @param transpose A [GLboolean] specifying whether to transpose the matrix. Must be false.
	 * @param value A [Float32Array] or sequence of [GLfloat] values. The values are assumed to be supplied in column major order.
	 */
	fun uniformMatrix4fv(location: WebGLUniformLocation, transpose: GLboolean, value: Float32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/uniformMatrix)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify. The location is obtained using getUniformLocation().
	 * @param transpose A [GLboolean] specifying whether to transpose the matrix. Must be false.
	 * @param value A [Float32Array] or sequence of [GLfloat] values. The values are assumed to be supplied in column major order.
	 */
	fun uniformMatrix4fv(location: WebGLUniformLocation, transpose: GLboolean, value: List<GLfloat>)
	
	
	/**
	 * The [WebGLRenderingContext].useProgram() method of the WebGL API sets the specified [WebGLProgram] as part of the current rendering state.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/useProgram)
	 *
	 * @param program A [WebGLProgram] to use.
	 */
	fun useProgram(program: WebGLProgram)
	
	
	/**
	 * The [WebGLRenderingContext].validateProgram() method of the WebGL API validates a [WebGLProgram]. It checks if it is successfully linked and if it can be used in the current WebGL state.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/validateProgram)
	 *
	 * @param program A [WebGLProgram] to validate.
	 */
	fun validateProgram(program: WebGLProgram)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/vertexAttrib)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 */
	fun vertexAttrib1f(index: GLuint, v0: GLfloat)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/vertexAttrib)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param values TODO: Importing this parameters documentation caused troube!
	 */
	fun vertexAttrib1fv(index: GLuint, values: Float32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/vertexAttrib)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param values TODO: Importing this parameters documentation caused troube!
	 */
	fun vertexAttrib1fv(index: GLuint, values: List<GLfloat>)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/vertexAttrib)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 * @param v1 TODO: Importing this parameters documentation caused troube!
	 */
	fun vertexAttrib2f(index: GLuint, v0: GLfloat, v1: GLfloat)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/vertexAttrib)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param values TODO: Importing this parameters documentation caused troube!
	 */
	fun vertexAttrib2fv(index: GLuint, values: Float32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/vertexAttrib)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param values TODO: Importing this parameters documentation caused troube!
	 */
	fun vertexAttrib2fv(index: GLuint, values: List<GLfloat>)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/vertexAttrib)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 * @param v1 TODO: Importing this parameters documentation caused troube!
	 * @param v2 TODO: Importing this parameters documentation caused troube!
	 */
	fun vertexAttrib3f(index: GLuint, v0: GLfloat, v1: GLfloat, v2: GLfloat)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/vertexAttrib)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param values TODO: Importing this parameters documentation caused troube!
	 */
	fun vertexAttrib3fv(index: GLuint, values: Float32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/vertexAttrib)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param values TODO: Importing this parameters documentation caused troube!
	 */
	fun vertexAttrib3fv(index: GLuint, values: List<GLfloat>)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/vertexAttrib)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 * @param v1 TODO: Importing this parameters documentation caused troube!
	 * @param v2 TODO: Importing this parameters documentation caused troube!
	 * @param v3 TODO: Importing this parameters documentation caused troube!
	 */
	fun vertexAttrib4f(index: GLuint, v0: GLfloat, v1: GLfloat, v2: GLfloat, v3: GLfloat)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/vertexAttrib)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param values TODO: Importing this parameters documentation caused troube!
	 */
	fun vertexAttrib4fv(index: GLuint, values: Float32Array)
	
	
	/**
	 * 
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/vertexAttrib)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param values TODO: Importing this parameters documentation caused troube!
	 */
	fun vertexAttrib4fv(index: GLuint, values: List<GLfloat>)
	
	
	/**
	 * The [WebGLRenderingContext].vertexAttribPointer() method of the WebGL API binds the buffer currently bound to gl.ARRAY_BUFFER to a generic vertex attribute of the current vertex buffer object and specifies its layout.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/vertexAttribPointer)
	 *
	 * @param index A [GLuint] specifying the index of the vertex attribute that is to be modified.
	 * @param size A [GLint] specifying the number of components per vertex attribute. Must be 1, 2, 3, or 4.
	 * @param type A [GLenum] specifying the data type of each component in the array. Possible values: gl.BYTE: signed 8-bit integer, with values in [-128, 127] gl.SHORT: signed 16-bit integer, with values in [-32768, 32767] gl.UNSIGNED_BYTE: unsigned 8-bit integer, with values in [0, 255] gl.UNSIGNED_SHORT: unsigned 16-bit integer, with values in [0,65535] gl.FLOAT: 32-bit IEEE floating point number When using a WebGL 2 context, the following values are available additionally: gl.HALF_FLOAT: 16-bit IEEE floating point number gl.INT: 32-bit signed binary integer gl.UNSIGNED_INT: 32-bit unsigned binary integer gl.INT_2_10_10_10_REV: 32-bit signed integer with values in [-512, 511] gl.UNSIGNED_INT_2_10_10_10_REV: 32-bit unsigned integer with values in [0, 1023]
	 * @param normalized A [GLboolean] specifying whether integer data values should be normalized into a certain range when being cast to a float. For types gl.BYTE and gl.SHORT, normalizes the values to [-1, 1] if true. For types gl.UNSIGNED_BYTE and gl.UNSIGNED_SHORT, normalizes the values to [0, 1] if true. For types gl.FLOAT and gl.HALF_FLOAT, this parameter has no effect.
	 * @param stride A [GLsizei] specifying the offset in bytes between the beginning of consecutive vertex attributes. Cannot be negative or larger than 255. If stride is 0, the attribute is assumed to be tightly packed, that is, the attributes are not interleaved but each attribute is in a separate block, and the next vertex' attribute follows immediately after the current vertex.
	 * @param offset A [GLint]ptr specifying an offset in bytes of the first component in the vertex attribute array. Must be a multiple of the byte length of type.
	 */
	fun vertexAttribPointer(index: GLuint, size: GLint, type: GLenum, normalized: GLboolean, stride: GLsizei, offset: GLintptr)
	
	
	/**
	 * The [WebGLRenderingContext].viewport() method of the WebGL API sets the viewport, which specifies the affine transformation of x and y from normalized device coordinates to window coordinates.
	 *
	 * See further documentation:
	 * * [Mozilla's](https://developer.mozilla.org/en-US/docs/Web/API/[WebGLRenderingContext]/viewport)
	 *
	 * @param v0 TODO: Importing this parameters documentation caused troube!
	 * @param v1 TODO: Importing this parameters documentation caused troube!
	 * @param width A non-negative [GLsizei] specifying the width of the viewport. Default value: width of the canvas.
	 * @param height A non-negative [GLsizei] specifying the height of the viewport. Default value: height of the canvas.
	 */
	fun viewport(v0: GLint, v1: GLint, width: GLsizei, height: GLsizei)
	
	
}

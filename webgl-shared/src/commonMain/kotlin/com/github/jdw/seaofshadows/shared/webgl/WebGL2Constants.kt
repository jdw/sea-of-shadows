package com.github.jdw.seaofshadows.shared.webgl

/**
 * These constants are defined on the [WebGL2RenderingContext] interface. All WebGL1 constants are also available in a WebGL2 context.
 */
abstract class WebGL2Constants(): WebGLConstants() {
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#getting_gl_parameter_information_2
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val READ_BUFFER = 0x0C02
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val UNPACK_ROW_LENGTH = 0x0CF2
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val UNPACK_SKIP_ROWS = 0x0CF3
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val UNPACK_SKIP_PIXELS = 0x0CF4
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val PACK_ROW_LENGTH = 0x0D02
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val PACK_SKIP_ROWS = 0x0D03
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val PACK_SKIP_PIXELS = 0x0D04
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val TEXTURE_BINDING_3D = 0x806A
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val UNPACK_SKIP_IMAGES = 0x806D
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val UNPACK_IMAGE_HEIGHT = 0x806E
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MAX_3D_TEXTURE_SIZE = 0x8073
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MAX_ELEMENTS_VERTICES = 0x80E8
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MAX_ELEMENTS_INDICES = 0x80E9
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MAX_TEXTURE_LOD_BIAS = 0x84FD
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MAX_VERTEX_UNIFORM_COMPONENTS = 0x8B4A
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MAX_ARRAY_TEXTURE_LAYERS = 0x88FF
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MIN_PROGRAM_TEXEL_OFFSET = 0x8904
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MAX_PROGRAM_TEXEL_OFFSET = 0x8905
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MAX_VARYING_COMPONENTS = 0x8B4B
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val RASTERIZER_DISCARD = 0x8C89
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val VERTEX_ARRAY_BINDING = 0x85B5
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MAX_SERVER_WAIT_TIMEOUT = 0x9111
	
	/**
	 * Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return.
	 */
	val MAX_ELEMENT_INDEX = 0x8D6B
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#textures_2
	val RED = 0x1903
	
	val RGB8 = 0x8051
	
	val RGBA8 = 0x8058
	
	val RGB10_A2 = 0x8059
	
	val TEXTURE_3D = 0x806F
	
	val TEXTURE_WRAP_R = 0x8072
	
	val TEXTURE_MIN_LOD = 0x813A
	
	val TEXTURE_MAX_LOD = 0x813B
	
	val TEXTURE_BASE_LEVEL = 0x813C
	
	val TEXTURE_MAX_LEVEL = 0x813D
	
	val TEXTURE_COMPARE_MODE = 0x884C
	
	val TEXTURE_COMPARE_FUNC = 0x884D
	
	val SRGB = 0x8C40
	
	val SRGB8 = 0x8C41
	
	val SRGB8_ALPHA8 = 0x8C43
	
	val COMPARE_REF_TO_TEXTURE = 0x884E
	
	val RGBA32F = 0x8814
	
	val RGB32F = 0x8815
	
	val RGBA16F = 0x881A
	
	val RGB16F = 0x881B
	
	val TEXTURE_2D_ARRAY = 0x8C1A
	
	val TEXTURE_BINDING_2D_ARRAY = 0x8C1D
	
	val R11F_G11F_B10F = 0x8C3A
	
	val RGB9_E5 = 0x8C3D
	
	val RGBA32UI = 0x8D70
	
	val RGB32UI = 0x8D71
	
	val RGBA16UI = 0x8D76
	
	val RGB16UI = 0x8D77
	
	val RGBA8UI = 0x8D7C
	
	val RGB8UI = 0x8D7D
	
	val RGBA32I = 0x8D82
	
	val RGB32I = 0x8D83
	
	val RGBA16I = 0x8D88
	
	val RGB16I = 0x8D89
	
	val RGBA8I = 0x8D8E
	
	val RGB8I = 0x8D8F
	
	val RED_INTEGER = 0x8D94
	
	val RGB_INTEGER = 0x8D98
	
	val RGBA_INTEGER = 0x8D99
	
	val R8 = 0x8229
	
	val RG8 = 0x822B
	
	val R16F = 0x822D
	
	val R32F = 0x822E
	
	val RG16F = 0x822F
	
	val RG32F = 0x8230
	
	val R8I = 0x8231
	
	val R8UI = 0x8232
	
	val R16I = 0x8233
	
	val R16UI = 0x8234
	
	val R32I = 0x8235
	
	val R32UI = 0x8236
	
	val RG8I = 0x8237
	
	val RG8UI = 0x8238
	
	val RG16I = 0x8239
	
	val RG16UI = 0x823A
	
	val RG32I = 0x823B
	
	val RG32UI = 0x823C
	
	val R8_SNORM = 0x8F94
	
	val RG8_SNORM = 0x8F95
	
	val RGB8_SNORM = 0x8F96
	
	val RGBA8_SNORM = 0x8F97
	
	val RGB10_A2UI = 0x906F
	
	val TEXTURE_IMMUTABLE_FORMAT = 0x912F
	
	val TEXTURE_IMMUTABLE_LEVELS = 0x82DF
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#pixel_types_2
	val UNSIGNED_INT_2_10_10_10_REV = 0x8368
	
	val UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B
	
	val UNSIGNED_INT_5_9_9_9_REV = 0x8C3E
	
	val FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD
	
	val UNSIGNED_INT_24_8 = 0x84FA
	
	val HALF_FLOAT = 0x140B
	
	val RG = 0x8227
	
	val RG_INTEGER = 0x8228
	
	val INT_2_10_10_10_REV = 0x8D9F
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#buffers_2
	val PIXEL_PACK_BUFFER = 0x88EB
	
	val PIXEL_UNPACK_BUFFER = 0x88EC
	
	val PIXEL_PACK_BUFFER_BINDING = 0x88ED
	
	val PIXEL_UNPACK_BUFFER_BINDING = 0x88EF
	
	val COPY_READ_BUFFER = 0x8F36
	
	val COPY_WRITE_BUFFER = 0x8F37
	
	val COPY_READ_BUFFER_BINDING = 0x8F36
	
	val COPY_WRITE_BUFFER_BINDING = 0x8F37
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#data_types_2
	val FLOAT_MAT2x3 = 0x8B65
	
	val FLOAT_MAT2x4 = 0x8B66
	
	val FLOAT_MAT3x2 = 0x8B67
	
	val FLOAT_MAT3x4 = 0x8B68
	
	val FLOAT_MAT4x2 = 0x8B69
	
	val FLOAT_MAT4x3 = 0x8B6A
	
	val UNSIGNED_INT_VEC2 = 0x8DC6
	
	val UNSIGNED_INT_VEC3 = 0x8DC7
	
	val UNSIGNED_INT_VEC4 = 0x8DC8
	
	val UNSIGNED_NORMALIZED = 0x8C17
	
	val SIGNED_NORMALIZED = 0x8F9C
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#vertex_attributes_2
	val VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD
	
	val VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#framebuffers_and_renderbuffers_2
	val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210
	
	val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211
	
	val FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212
	
	val FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213
	
	val FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214
	
	val FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215
	
	val FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216
	
	val FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217
	
	val FRAMEBUFFER_DEFAULT = 0x8218
	
	
	
	val DEPTH24_STENCIL8 = 0x88F0
	
	val DRAW_FRAMEBUFFER_BINDING = 0x8CA6
	
	val READ_FRAMEBUFFER = 0x8CA8
	
	val DRAW_FRAMEBUFFER = 0x8CA9
	
	val READ_FRAMEBUFFER_BINDING = 0x8CAA
	
	val RENDERBUFFER_SAMPLES = 0x8CAB
	
	val FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4
	
	val FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56
	
}

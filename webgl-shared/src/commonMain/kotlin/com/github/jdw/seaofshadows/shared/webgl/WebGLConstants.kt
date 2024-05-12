package com.github.jdw.seaofshadows.shared.webgl

abstract class WebGLConstants() {
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#clearing_buffers
	/**
	 * Passed to [clear] to clear the current depth buffer.
	 */
	val DEPTH_BUFFER_BIT = 0x00000100
	
	/**
	 * Passed to [clear] to clear the current stencil buffer.
	 */
	val STENCIL_BUFFER_BIT = 0x00000400
	
	/**
	 * Passed to [clear] to clear the current color buffer.
	 */
	val COLOR_BUFFER_BIT = 0x00004000
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#rendering_primitives
	/**
	 * Passed to [drawElements] or [drawArrays] to draw single points.
	 */
	val POINTS = 0x0000
	
	/**
	 * Passed to [drawElements] or [drawArrays] to draw lines. Each vertex connects to the one after it.
	 */
	val LINES = 0x0001
	
	/**
	 * Passed to [drawElements] or [drawArrays] to draw lines. Each set of two vertices is treated as a separate line segment.
	 */
	val LINE_LOOP = 0x0002
	
	/**
	 * Passed to [drawElements] or [drawArrays] to draw a connected group of line segments from the first vertex to the last.
	 */
	val LINE_STRIP = 0x0003
	
	/**
	 * Passed to [drawElements] or [drawArrays] to draw triangles. Each set of three vertices creates a separate triangle.
	 */
	val TRIANGLES = 0x0004
	
	/**
	 * Passed to [drawElements] or [drawArrays] to draw a connected group of triangles.
	 */
	val TRIANGLE_STRIP = 0x0005
	
	/**
	 * Passed to [drawElements] or [drawArrays] to draw a connected group of triangles. Each vertex connects to the previous and the first vertex in the fan.
	 */
	val TRIANGLE_FAN = 0x0006
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#blending_modes
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to turn off a component.
	 */
	val ZERO = 0
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to turn on a component.
	 */
	val ONE = 1
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by the source elements color.
	 */
	val SRC_COLOR = 0x0300
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by one minus the source elements color.
	 */
	val ONE_MINUS_SRC_COLOR = 0x0301
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by the source's alpha.
	 */
	val SRC_ALPHA = 0x0302
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by one minus the source's alpha.
	 */
	val ONE_MINUS_SRC_ALPHA = 0x0303
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by the destination's alpha.
	 */
	val DST_ALPHA = 0x0304
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by one minus the destination's alpha.
	 */
	val ONE_MINUS_DST_ALPHA = 0x0305
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by the destination's color.
	 */
	val DST_COLOR = 0x0306
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by one minus the destination's color.
	 */
	val ONE_MINUS_DST_COLOR = 0x0307
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by the minimum of source's alpha or one minus the destination's alpha.
	 */
	val SRC_ALPHA_SATURATE = 0x0308
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to specify a constant color blend function.
	 */
	val CONSTANT_COLOR = 0x8001
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to specify one minus a constant color blend function.
	 */
	val ONE_MINUS_CONSTANT_COLOR = 0x8002
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to specify a constant alpha blend function.
	 */
	val CONSTANT_ALPHA = 0x8003
	
	/**
	 * Passed to [blendFunc] or [blendFuncSeparate] to specify one minus a constant alpha blend function.
	 */
	val ONE_MINUS_CONSTANT_ALPHA = 0x8004
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#blending_equations
	/**
	 * Passed to [blendEquation] or [blendEquationSeparate] to set an addition blend function.
	 */
	val FUNC_ADD = 0x8006
	
	/**
	 * Passed to [blendEquation] or [blendEquationSeparate] to specify a subtraction blend function (source - destination).
	 */
	val FUNC_SUBTRACT = 0x800A
	
	/**
	 * Passed to [blendEquation] or [blendEquationSeparate] to specify a reverse subtraction blend function (destination - source).
	 */
	val FUNC_REVERSE_SUBTRACT = 0x800B
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#getting_gl_parameter_information
	/**
	 * Passed to [getParameter] to get the current RGB blend function.
	 */
	val BLEND_EQUATION = 0x8009
	
	/**
	 * Passed to [getParameter] to get the current RGB blend function. Same as BLEND_EQUATION
	 */
	val BLEND_EQUATION_RGB = 0x8009
	
	/**
	 * Passed to [getParameter] to get the current alpha blend function.
	 */
	val BLEND_EQUATION_ALPHA = 0x883D
	
	/**
	 * Passed to [getParameter] to get the current destination RGB blend function.
	 */
	val BLEND_DST_RGB = 0x80C8
	
	/**
	 * Passed to [getParameter] to get the current destination RGB blend function.
	 */
	val BLEND_SRC_RGB = 0x80C9
	
	/**
	 * Passed to [getParameter] to get the current destination alpha blend function.
	 */
	val BLEND_DST_ALPHA = 0x80CA
	
	/**
	 * Passed to [getParameter] to get the current source alpha blend function.
	 */
	val BLEND_SRC_ALPHA = 0x80CB
	
	/**
	 * Passed to [getParameter] to return a the current blend color.
	 */
	val BLEND_COLOR = 0x8005
	
	/**
	 * Passed to [getParameter] to get the array buffer binding.
	 */
	val ARRAY_BUFFER_BINDING = 0x8894
	
	/**
	 * Passed to [getParameter] to get the current element array buffer.
	 */
	val ELEMENT_ARRAY_BUFFER_BINDING = 0x8895
	
	/**
	 * Passed to [getParameter] to get the current [lineWidth] (set by the [lineWidth] method).
	 */
	val LINE_WIDTH = 0x0B21
	
	/**
	 * Passed to [getParameter] to get the current size of a point drawn with [gl.POINTS]
	 */
	val ALIASED_POINT_SIZE_RANGE = 0x846D
	
	/**
	 * Passed to [getParameter] to get the range of available widths for a line. The [getParameter] method then returns an array with two elements: the first element is the minimum width value and the second element is the maximum width value.
	 */
	val ALIASED_LINE_WIDTH_RANGE = 0x846E
	
	/**
	 * Passed to [getParameter] to get the current value of [cullFace]. Should return [FRONT], [BACK], or [FRONT_AND_BACK]
	 */
	val CULL_FACE_MODE = 0x0B45
	
	/**
	 * Passed to [getParameter] to determine the current value of [frontFace]. Should return [CW] or [CCW].
	 */
	val FRONT_FACE = 0x0B46
	
	/**
	 * Passed to [getParameter] to return a length-2 array of floats giving the current depth range.
	 */
	val DEPTH_RANGE = 0x0B70
	
	/**
	 * Passed to [getParameter] to determine if the depth write mask is enabled.
	 */
	val DEPTH_WRITEMASK = 0x0B72
	
	/**
	 * Passed to [getParameter] to determine the current depth clear value.
	 */
	val DEPTH_CLEAR_VALUE = 0x0B73
	
	/**
	 * Passed to [getParameter] to get the current depth function. Returns [NEVER], [ALWAYS], [LESS], [EQUAL], [LEQUAL], [GREATER], [GEQUAL], or [NOTEQUAL].
	 */
	val DEPTH_FUNC = 0x0B74
	
	/**
	 * Passed to [getParameter] to get the value the stencil will be cleared to.
	 */
	val STENCIL_CLEAR_VALUE = 0x0B91
	
	/**
	 * Passed to [getParameter] to get the current stencil function. Returns [NEVER], [ALWAYS], [LESS], [EQUAL], [LEQUAL], [GREATER], [GEQUAL], or [NOTEQUAL].
	 */
	val STENCIL_FUNC = 0x0B92
	
	/**
	 * Passed to [getParameter] to get the current stencil fail function. Should return [KEEP], [REPLACE], [INCR], [DECR], [INVERT], [INCR_WRAP], or [DECR_WRAP].
	 */
	val STENCIL_FAIL = 0x0B94
	
	/**
	 * Passed to [getParameter] to get the current stencil fail function should the depth buffer test fail. Should return [KEEP], [REPLACE], [INCR], [DECR], [INVERT], [INCR_WRAP], or [DECR_WRAP].
	 */
	val STENCIL_PASS_DEPTH_FAIL = 0x0B95
	
	/**
	 * Passed to [getParameter] to get the current stencil fail function should the depth buffer test pass. Should return KEEP, REPLACE, INCR, DECR, INVERT, INCR_WRAP, or DECR_WRAP.
	 */
	val STENCIL_PASS_DEPTH_PASS = 0x0B96
	
	/**
	 * Passed to [getParameter] to get the reference value used for stencil tests.
	 */
	val STENCIL_REF = 0x0B97
	
	val STENCIL_VALUE_MASK = 0x0B93
	
	val STENCIL_WRITEMASK = 0x0B98
	
	val STENCIL_BACK_FUNC = 0x8800
	
	val STENCIL_BACK_FAIL = 0x8801
	
	val STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802
	
	val STENCIL_BACK_PASS_DEPTH_PASS = 0x8803
	
	val STENCIL_BACK_REF = 0x8CA3
	
	val STENCIL_BACK_VALUE_MASK = 0x8CA4
	
	val STENCIL_BACK_WRITEMASK = 0x8CA5
	
	/**
	 * Returns an <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array">[Int32Array]</a> with four elements for the current viewport dimensions.
	 */
	val VIEWPORT = 0x0BA2
	
	/**
	 * Returns an <a href="/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array">[Int32Array]</a> with four elements for the current scissor box dimensions.
	 */
	val SCISSOR_BOX = 0x0C10
	
	val COLOR_CLEAR_VALUE = 0x0C22
	
	val COLOR_WRITEMASK = 0x0C23
	
	val UNPACK_ALIGNMENT = 0x0CF5
	
	val PACK_ALIGNMENT = 0x0D05
	
	val MAX_TEXTURE_SIZE = 0x0D33
	
	val MAX_VIEWPORT_DIMS = 0x0D3A
	
	val SUBPIXEL_BITS = 0x0D50
	
	val RED_BITS = 0x0D52
	
	val GREEN_BITS = 0x0D53
	
	val BLUE_BITS = 0x0D54
	
	val ALPHA_BITS = 0x0D55
	
	val DEPTH_BITS = 0x0D56
	
	val STENCIL_BITS = 0x0D57
	
	val POLYGON_OFFSET_UNITS = 0x2A00
	
	val POLYGON_OFFSET_FACTOR = 0x8038
	
	val TEXTURE_BINDING_2D = 0x8069
	
	val SAMPLE_BUFFERS = 0x80A8
	
	val SAMPLES = 0x80A9
	
	val SAMPLE_COVERAGE_VALUE = 0x80AA
	
	val SAMPLE_COVERAGE_INVERT = 0x80AB
	
	val COMPRESSED_TEXTURE_FORMATS = 0x86A3
	
	val VENDOR = 0x1F00
	
	val RENDERER = 0x1F01
	
	val VERSION = 0x1F02
	
	val IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A
	
	val IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B
	
	val BROWSER_DEFAULT_WEBGL = 0x9244
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#buffers
	/**
	 * Passed to [bufferData] as a hint about whether the contents of the buffer are likely to be used often and not change often.
	 */
	val STATIC_DRAW = 0x88E4
	
	/**
	 * Passed to [bufferData] as a hint about whether the contents of the buffer are likely to not be used often.
	 */
	val STREAM_DRAW = 0x88E0
	
	/**
	 * Passed to [bufferData] as a hint about whether the contents of the buffer are likely to be used often and change often.
	 */
	val DYNAMIC_DRAW = 0x88E8
	
	/**
	 * Passed to [bindBuffer] or [bufferData] to specify the type of buffer being used.
	 */
	val ARRAY_BUFFER = 0x8892
	
	/**
	 * Passed to [bindBuffer] or [bufferData] to specify the type of buffer being used.
	 */
	val ELEMENT_ARRAY_BUFFER = 0x8893
	
	/**
	 * Passed to [getBufferParameter] to get a buffer's size.
	 */
	val BUFFER_SIZE = 0x8764
	
	/**
	 * Passed to [getBufferParameter] to get the hint for the buffer passed in when it was created.
	 */
	val BUFFER_USAGE = 0x8765
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#vertex_attributes
	/**
	 * Passed to [getVertexAttrib] to read back the current vertex attribute.
	 */
	val CURRENT_VERTEX_ATTRIB = 0x8626
	
	val VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622
	
	val VERTEX_ATTRIB_ARRAY_SIZE = 0x8623
	
	val VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624
	
	val VERTEX_ATTRIB_ARRAY_TYPE = 0x8625
	
	val VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A
	
	val VERTEX_ATTRIB_ARRAY_POINTER = 0x8645
	
	val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#culling
	/**
	 * Passed to [enable]/[disable] to turn on/off culling. Can also be used with [getParameter] to find the current culling method.
	 */
	val CULL_FACE = 0x0B44
	
	/**
	 * Passed to [cullFace] to specify that only front faces should be culled.
	 */
	val FRONT = 0x0404
	
	/**
	 * Passed to [cullFace] to specify that only back faces should be culled.
	 */
	val BACK = 0x0405
	
	/**
	 * Passed to [cullFace] to specify that front and back faces should be culled.
	 */
	val FRONT_AND_BACK = 0x0408
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#enabling_and_disabling
	/**
	 * Passed to [enable]/[disable] to turn on/off blending. Can also be used with [getParameter] to find the current blending method.
	 */
	val BLEND = 0x0BE2
	
	/**
	 * Passed to [enable]/[disable] to turn on/off the depth test. Can also be used with [getParameter] to query the depth test.
	 */
	val DEPTH_TEST = 0x0B71
	
	/**
	 * Passed to [enable]/[disable] to turn on/off dithering. Can also be used with [getParameter] to find the current dithering method.
	 */
	val DITHER = 0x0BD0
	
	/**
	 * Passed to [enable]/[disable] to turn on/off the polygon offset. Useful for rendering hidden-line images, decals, and or solids with highlighted edges. Can also be used with [getParameter] to query the scissor test.
	 */
	val POLYGON_OFFSET_FILL = 0x8037
	
	/**
	 * Passed to [enable]/[disable] to turn on/off the alpha to coverage. Used in multi-sampling alpha channels.
	 */
	val SAMPLE_ALPHA_TO_COVERAGE = 0x809E
	
	/**
	 * Passed to [enable]/[disable] to turn on/off the sample coverage. Used in multi-sampling.
	 */
	val SAMPLE_COVERAGE = 0x80A0
	
	/**
	 * Passed to [enable]/[disable] to turn on/off the scissor test. Can also be used with [getParameter] to query the scissor test.
	 */
	val SCISSOR_TEST = 0x0C11
	
	/**
	 * Passed to [enable]/[disable] to turn on/off the stencil test. Can also be used with [getParameter] to query the stencil test.
	 */
	val STENCIL_TEST = 0x0B90
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#errors
	/**
	 * Returned from [getError].
	 */
	val NO_ERROR = 0
	
	/**
	 * Returned from [getError].
	 */
	val INVALID_ENUM = 0x0500
	
	/**
	 * Returned from [getError].
	 */
	val INVALID_VALUE = 0x0501
	
	/**
	 * Returned from [getError].
	 */
	val INVALID_OPERATION = 0x0502
	
	/**
	 * Returned from [getError].
	 */
	val OUT_OF_MEMORY = 0x0505
	
	/**
	 * Returned from [getError].
	 */
	val CONTEXT_LOST_WEBGL = 0x9242
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#front_face_directions
	/**
	 * Passed to [frontFace] to specify the front face of a polygon is drawn in the clockwise direction
	 */
	val CW = 0x0900
	
	/**
	 * Passed to [frontFace] to specify the front face of a polygon is drawn in the counter clockwise direction
	 */
	val CCW = 0x0901
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#hints
	/**
	 * There is no preference for this behavior.
	 */
	val DONT_CARE = 0x1100
	
	/**
	 * The most efficient behavior should be used.
	 */
	val FASTEST = 0x1101
	
	/**
	 * The most correct or the highest quality option should be used.
	 */
	val NICEST = 0x1102
	
	/**
	 * Hint for the quality of filtering when generating mipmap images with <a href="/en-US/docs/Web/API/WebGLRenderingContext/generateMipmap">[WebGLRenderingContext.generateMipmap()]</a>.
	 */
	val GENERATE_MIPMAP_HINT = 0x8192
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#data_types
	val BYTE = 0x1400
	
	val SHORT = 0x1402
	
	val UNSIGNED_SHORT = 0x1403
	
	val INT = 0x1404
	
	val UNSIGNED_INT = 0x1405
	
	val FLOAT = 0x1406
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#pixel_formats
	val DEPTH_COMPONENT = 0x1902
	
	val ALPHA = 0x1906
	
	val RGB = 0x1907
	
	val RGBA = 0x1908
	
	val LUMINANCE = 0x1909
	
	val LUMINANCE_ALPHA = 0x190A
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#pixel_types
	val UNSIGNED_BYTE = 0x1401
	
	val UNSIGNED_SHORT_4_4_4_4 = 0x8033
	
	val UNSIGNED_SHORT_5_5_5_1 = 0x8034
	
	val UNSIGNED_SHORT_5_6_5 = 0x8363
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#shaders
	/**
	 * Passed to [createShader] to define a fragment shader.
	 */
	val FRAGMENT_SHADER = 0x8B30
	
	/**
	 * Passed to [createShader] to define a vertex shader
	 */
	val VERTEX_SHADER = 0x8B31
	
	/**
	 * Passed to [getShaderParameter] to get the status of the compilation. Returns false if the shader was not compiled. You can then query [getShaderInfoLog] to find the exact error
	 */
	val COMPILE_STATUS = 0x8B81
	
	/**
	 * Passed to [getShaderParameter] to determine if a shader was deleted via [deleteShader]. Returns true if it was, false otherwise.
	 */
	val DELETE_STATUS = 0x8B80
	
	/**
	 * Passed to [getProgramParameter] after calling [linkProgram] to determine if a program was linked correctly. Returns false if there were errors. Use [getProgramInfoLog] to find the exact error.
	 */
	val LINK_STATUS = 0x8B82
	
	/**
	 * Passed to [getProgramParameter] after calling [validateProgram] to determine if it is valid. Returns false if errors were found.
	 */
	val VALIDATE_STATUS = 0x8B83
	
	/**
	 * Passed to [getProgramParameter] after calling [attachShader] to determine if the shader was attached correctly. Returns false if errors occurred.
	 */
	val ATTACHED_SHADERS = 0x8B85
	
	/**
	 * Passed to [getProgramParameter] to get the number of attributes active in a program.
	 */
	val ACTIVE_ATTRIBUTES = 0x8B89
	
	/**
	 * Passed to [getProgramParameter] to get the number of uniforms active in a program.
	 */
	val ACTIVE_UNIFORMS = 0x8B86
	
	/**
	 * The maximum number of entries possible in the vertex attribute list.
	 */
	val MAX_VERTEX_ATTRIBS = 0x8869
	
	val MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB
	
	val MAX_VARYING_VECTORS = 0x8DFC
	
	val MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D
	
	val MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C
	
	/**
	 * Implementation dependent number of maximum texture units. At least 8.
	 */
	val MAX_TEXTURE_IMAGE_UNITS = 0x8872
	
	val MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD
	
	val SHADER_TYPE = 0x8B4F
	
	val SHADING_LANGUAGE_VERSION = 0x8B8C
	
	val CURRENT_PROGRAM = 0x8B8D
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#depth_or_stencil_tests
	/**
	 * Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will never pass, i.e., nothing will be drawn.
	 */
	val NEVER = 0x0200
	
	/**
	 * Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will pass if the new depth value is less than the stored value.
	 */
	val LESS = 0x0201
	
	/**
	 * Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will pass if the new depth value is equals to the stored value.
	 */
	val EQUAL = 0x0202
	
	/**
	 * Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will pass if the new depth value is less than or equal to the stored value.
	 */
	val LEQUAL = 0x0203
	
	/**
	 * Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will pass if the new depth value is greater than the stored value.
	 */
	val GREATER = 0x0204
	
	/**
	 * Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will pass if the new depth value is not equal to the stored value.
	 */
	val NOTEQUAL = 0x0205
	
	/**
	 * Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will pass if the new depth value is greater than or equal to the stored value.
	 */
	val GEQUAL = 0x0206
	
	/**
	 * Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will always pass, i.e., pixels will be drawn in the order they are drawn.
	 */
	val ALWAYS = 0x0207
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#stencil_actions
	val KEEP = 0x1E00
	
	val REPLACE = 0x1E01
	
	val INCR = 0x1E02
	
	val DECR = 0x1E03
	
	val INVERT = 0x150A
	
	val INCR_WRAP = 0x8507
	
	val DECR_WRAP = 0x8508
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#textures
	val NEAREST = 0x2600
	
	val LINEAR = 0x2601
	
	val NEAREST_MIPMAP_NEAREST = 0x2700
	
	val LINEAR_MIPMAP_NEAREST = 0x2701
	
	val NEAREST_MIPMAP_LINEAR = 0x2702
	
	val LINEAR_MIPMAP_LINEAR = 0x2703
	
	val TEXTURE_MAG_FILTER = 0x2800
	
	val TEXTURE_MIN_FILTER = 0x2801
	
	val TEXTURE_WRAP_S = 0x2802
	
	val TEXTURE_WRAP_T = 0x2803
	
	val TEXTURE_2D = 0x0DE1
	
	val TEXTURE = 0x1702
	
	val TEXTURE_CUBE_MAP = 0x8513
	
	val TEXTURE_BINDING_CUBE_MAP = 0x8514
	
	val TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515
	
	val TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516
	
	val TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517
	
	val TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518
	
	val TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519
	
	val TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A
	
	val MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C
	
	/**
	 * Texture unit #0.
	 */
	val TEXTURE0 = 0x84C0
	
	/**
	 * Texture unit #1.
	 */
	val TEXTURE1 = 0x84C1
	
	/**
	 * Texture unit #2.
	 */
	val TEXTURE2 = 0x84C2
	
	/**
	 * Texture unit #3.
	 */
	val TEXTURE3 = 0x84C3
	
	/**
	 * Texture unit #4.
	 */
	val TEXTURE4 = 0x84C4
	
	/**
	 * Texture unit #5.
	 */
	val TEXTURE5 = 0x84C5
	
	/**
	 * Texture unit #6.
	 */
	val TEXTURE6 = 0x84C6
	
	/**
	 * Texture unit #7.
	 */
	val TEXTURE7 = 0x84C7
	
	/**
	 * Texture unit #8.
	 */
	val TEXTURE8 = 0x84C8
	
	/**
	 * Texture unit #9.
	 */
	val TEXTURE9 = 0x84C9
	
	/**
	 * Texture unit #10.
	 */
	val TEXTURE10 = 0x84CA
	
	/**
	 * Texture unit #11.
	 */
	val TEXTURE11 = 0x84CB
	
	/**
	 * Texture unit #12.
	 */
	val TEXTURE12 = 0x84CC
	
	/**
	 * Texture unit #13.
	 */
	val TEXTURE13 = 0x84CD
	
	/**
	 * Texture unit #14.
	 */
	val TEXTURE14 = 0x84CE
	
	/**
	 * Texture unit #15.
	 */
	val TEXTURE15 = 0x84CF
	
	/**
	 * Texture unit #16.
	 */
	val TEXTURE16 = 0x84D0
	
	/**
	 * Texture unit #17.
	 */
	val TEXTURE17 = 0x84D1
	
	/**
	 * Texture unit #18.
	 */
	val TEXTURE18 = 0x84D2
	
	/**
	 * Texture unit #19.
	 */
	val TEXTURE19 = 0x84D3
	
	/**
	 * Texture unit #20.
	 */
	val TEXTURE20 = 0x84D4
	
	/**
	 * Texture unit #21.
	 */
	val TEXTURE21 = 0x84D5
	
	/**
	 * Texture unit #22.
	 */
	val TEXTURE22 = 0x84D6
	
	/**
	 * Texture unit #23.
	 */
	val TEXTURE23 = 0x84D7
	
	/**
	 * Texture unit #24.
	 */
	val TEXTURE24 = 0x84D8
	
	/**
	 * Texture unit #25.
	 */
	val TEXTURE25 = 0x84D9
	
	/**
	 * Texture unit #26.
	 */
	val TEXTURE26 = 0x84DA
	
	/**
	 * Texture unit #27.
	 */
	val TEXTURE27 = 0x84DB
	
	/**
	 * Texture unit #28.
	 */
	val TEXTURE28 = 0x84DC
	
	/**
	 * Texture unit #29.
	 */
	val TEXTURE29 = 0x84DD
	
	/**
	 * Texture unit #30.
	 */
	val TEXTURE30 = 0x84DE
	
	/**
	 * Texture unit #31.
	 */
	val TEXTURE31 = 0x84DF
	
	/**
	 * The current active texture unit.
	 */
	val ACTIVE_TEXTURE = 0x84E0
	
	val REPEAT = 0x2901
	
	val CLAMP_TO_EDGE = 0x812F
	
	val MIRRORED_REPEAT = 0x8370
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#uniform_types
	val FLOAT_VEC2 = 0x8B50
	
	val FLOAT_VEC3 = 0x8B51
	
	val FLOAT_VEC4 = 0x8B52
	
	val INT_VEC2 = 0x8B53
	
	val INT_VEC3 = 0x8B54
	
	val INT_VEC4 = 0x8B55
	
	val BOOL = 0x8B56
	
	val BOOL_VEC2 = 0x8B57
	
	val BOOL_VEC3 = 0x8B58
	
	val BOOL_VEC4 = 0x8B59
	
	val FLOAT_MAT2 = 0x8B5A
	
	val FLOAT_MAT3 = 0x8B5B
	
	val FLOAT_MAT4 = 0x8B5C
	
	val SAMPLER_2D = 0x8B5E
	
	val SAMPLER_CUBE = 0x8B60
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#shader_precision-specified_types
	val LOW_FLOAT = 0x8DF0
	
	val MEDIUM_FLOAT = 0x8DF1
	
	val HIGH_FLOAT = 0x8DF2
	
	val LOW_INT = 0x8DF3
	
	val MEDIUM_INT = 0x8DF4
	
	val HIGH_INT = 0x8DF5
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#framebuffers_and_renderbuffers
	val FRAMEBUFFER = 0x8D40
	
	val RENDERBUFFER = 0x8D41
	
	val RGBA4 = 0x8056
	
	val RGB5_A1 = 0x8057
	
	val RGB565 = 0x8D62
	
	val DEPTH_COMPONENT16 = 0x81A5
	
	val STENCIL_INDEX8 = 0x8D48
	
	val DEPTH_STENCIL = 0x84F9
	
	val RENDERBUFFER_WIDTH = 0x8D42
	
	val RENDERBUFFER_HEIGHT = 0x8D43
	
	val RENDERBUFFER_INTERNAL_FORMAT = 0x8D44
	
	val RENDERBUFFER_RED_SIZE = 0x8D50
	
	val RENDERBUFFER_GREEN_SIZE = 0x8D51
	
	val RENDERBUFFER_BLUE_SIZE = 0x8D52
	
	val RENDERBUFFER_ALPHA_SIZE = 0x8D53
	
	val RENDERBUFFER_DEPTH_SIZE = 0x8D54
	
	val RENDERBUFFER_STENCIL_SIZE = 0x8D55
	
	val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0
	
	val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1
	
	val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2
	
	val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3
	
	val COLOR_ATTACHMENT0 = 0x8CE0
	
	val DEPTH_ATTACHMENT = 0x8D00
	
	val STENCIL_ATTACHMENT = 0x8D20
	
	val DEPTH_STENCIL_ATTACHMENT = 0x821A
	
	val NONE = 0
	
	val FRAMEBUFFER_COMPLETE = 0x8CD5
	
	val FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6
	
	val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7
	
	val FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 0x8CD9
	
	val FRAMEBUFFER_UNSUPPORTED = 0x8CDD
	
	val FRAMEBUFFER_BINDING = 0x8CA6
	
	val RENDERBUFFER_BINDING = 0x8CA7
	
	val MAX_RENDERBUFFER_SIZE = 0x84E8
	
	val INVALID_FRAMEBUFFER_OPERATION = 0x0506
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#pixel_storage_modes
	val UNPACK_FLIP_Y_WEBGL = 0x9240
	
	val UNPACK_PREMULTIPLY_ALPHA_WEBGL = 0x9241
	
	val UNPACK_COLORSPACE_CONVERSION_WEBGL = 0x9243
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#queries
	val CURRENT_QUERY = 0x8865
	
	val QUERY_RESULT = 0x8866
	
	val QUERY_RESULT_AVAILABLE = 0x8867
	
	val ANY_SAMPLES_PASSED = 0x8C2F
	
	val ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#draw_buffers
	val MAX_DRAW_BUFFERS = 0x8824
	
	val DRAW_BUFFER0 = 0x8825
	
	val DRAW_BUFFER1 = 0x8826
	
	val DRAW_BUFFER2 = 0x8827
	
	val DRAW_BUFFER3 = 0x8828
	
	val DRAW_BUFFER4 = 0x8829
	
	val DRAW_BUFFER5 = 0x882A
	
	val DRAW_BUFFER6 = 0x882B
	
	val DRAW_BUFFER7 = 0x882C
	
	val DRAW_BUFFER8 = 0x882D
	
	val DRAW_BUFFER9 = 0x882E
	
	val DRAW_BUFFER10 = 0x882F
	
	val DRAW_BUFFER11 = 0x8830
	
	val DRAW_BUFFER12 = 0x8831
	
	val DRAW_BUFFER13 = 0x8832
	
	val DRAW_BUFFER14 = 0x8833
	
	val DRAW_BUFFER15 = 0x8834
	
	val MAX_COLOR_ATTACHMENTS = 0x8CDF
	
	val COLOR_ATTACHMENT1 = 0x8CE1
	
	val COLOR_ATTACHMENT2 = 0x8CE2
	
	val COLOR_ATTACHMENT3 = 0x8CE3
	
	val COLOR_ATTACHMENT4 = 0x8CE4
	
	val COLOR_ATTACHMENT5 = 0x8CE5
	
	val COLOR_ATTACHMENT6 = 0x8CE6
	
	val COLOR_ATTACHMENT7 = 0x8CE7
	
	val COLOR_ATTACHMENT8 = 0x8CE8
	
	val COLOR_ATTACHMENT9 = 0x8CE9
	
	val COLOR_ATTACHMENT10 = 0x8CEA
	
	val COLOR_ATTACHMENT11 = 0x8CEB
	
	val COLOR_ATTACHMENT12 = 0x8CEC
	
	val COLOR_ATTACHMENT13 = 0x8CED
	
	val COLOR_ATTACHMENT14 = 0x8CEE
	
	val COLOR_ATTACHMENT15 = 0x8CEF
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#samplers
	val SAMPLER_3D = 0x8B5F
	
	val SAMPLER_2D_SHADOW = 0x8B62
	
	val SAMPLER_2D_ARRAY = 0x8DC1
	
	val SAMPLER_2D_ARRAY_SHADOW = 0x8DC4
	
	val SAMPLER_CUBE_SHADOW = 0x8DC5
	
	val INT_SAMPLER_2D = 0x8DCA
	
	val INT_SAMPLER_3D = 0x8DCB
	
	val INT_SAMPLER_CUBE = 0x8DCC
	
	val INT_SAMPLER_2D_ARRAY = 0x8DCF
	
	val UNSIGNED_INT_SAMPLER_2D = 0x8DD2
	
	val UNSIGNED_INT_SAMPLER_3D = 0x8DD3
	
	val UNSIGNED_INT_SAMPLER_CUBE = 0x8DD4
	
	val UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7
	
	val MAX_SAMPLES = 0x8D57
	
	val SAMPLER_BINDING = 0x8919
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#transform_feedback
	val TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F
	
	val MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80
	
	val TRANSFORM_FEEDBACK_VARYINGS = 0x8C83
	
	val TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84
	
	val TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85
	
	val TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88
	
	val MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A
	
	val MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B
	
	val INTERLEAVED_ATTRIBS = 0x8C8C
	
	val SEPARATE_ATTRIBS = 0x8C8D
	
	val TRANSFORM_FEEDBACK_BUFFER = 0x8C8E
	
	val TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F
	
	val TRANSFORM_FEEDBACK = 0x8E22
	
	val TRANSFORM_FEEDBACK_PAUSED = 0x8E23
	
	val TRANSFORM_FEEDBACK_ACTIVE = 0x8E24
	
	val TRANSFORM_FEEDBACK_BINDING = 0x8E25
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#uniforms
	val UNIFORM_BUFFER = 0x8A11
	
	val UNIFORM_BUFFER_BINDING = 0x8A28
	
	val UNIFORM_BUFFER_START = 0x8A29
	
	val UNIFORM_BUFFER_SIZE = 0x8A2A
	
	val MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B
	
	val MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8A2D
	
	val MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E
	
	val MAX_UNIFORM_BUFFER_BINDINGS = 0x8A2F
	
	val MAX_UNIFORM_BLOCK_SIZE = 0x8A30
	
	val MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31
	
	val MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33
	
	val UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34
	
	val ACTIVE_UNIFORM_BLOCKS = 0x8A36
	
	val UNIFORM_TYPE = 0x8A37
	
	val UNIFORM_SIZE = 0x8A38
	
	val UNIFORM_BLOCK_INDEX = 0x8A3A
	
	val UNIFORM_OFFSET = 0x8A3B
	
	val UNIFORM_ARRAY_STRIDE = 0x8A3C
	
	val UNIFORM_MATRIX_STRIDE = 0x8A3D
	
	val UNIFORM_IS_ROW_MAJOR = 0x8A3E
	
	val UNIFORM_BLOCK_BINDING = 0x8A3F
	
	val UNIFORM_BLOCK_DATA_SIZE = 0x8A40
	
	val UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8A42
	
	val UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43
	
	val UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44
	
	val UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#sync_objects
	val OBJECT_TYPE = 0x9112
	
	val SYNC_CONDITION = 0x9113
	
	val SYNC_STATUS = 0x9114
	
	val SYNC_FLAGS = 0x9115
	
	val SYNC_FENCE = 0x9116
	
	val SYNC_GPU_COMMANDS_COMPLETE = 0x9117
	
	val UNSIGNALED = 0x9118
	
	val SIGNALED = 0x9119
	
	val ALREADY_SIGNALED = 0x911A
	
	val TIMEOUT_EXPIRED = 0x911B
	
	val CONDITION_SATISFIED = 0x911C
	
	val WAIT_FAILED = 0x911D
	
	val SYNC_FLUSH_COMMANDS_BIT = 0x00000001
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#miscellaneous_constants
	val COLOR = 0x1800
	
	val DEPTH = 0x1801
	
	val STENCIL = 0x1802
	
	val MIN = 0x8007
	
	val MAX = 0x8008
	
	val DEPTH_COMPONENT24 = 0x81A6
	
	val STREAM_READ = 0x88E1
	
	val STREAM_COPY = 0x88E2
	
	val STATIC_READ = 0x88E5
	
	val STATIC_COPY = 0x88E6
	
	val DYNAMIC_READ = 0x88E9
	
	val DYNAMIC_COPY = 0x88EA
	
	val DEPTH_COMPONENT32F = 0x8CAC
	
	val DEPTH32F_STENCIL8 = 0x8CAD
	
	val INVALID_INDEX = 0xFFFFFFFF
	
	val TIMEOUT_IGNORED = -1
	
	val MAX_CLIENT_WAIT_TIMEOUT_WEBGL = 0x9247
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#constants_defined_in_webgl_extensions
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#angle_instanced_arrays
	/**
	 * Describes the frequency divisor used for instanced rendering.
	 */
	val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE = 0x88FE
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#webgl_debug_renderer_info
	/**
	 * Passed to [getParameter] to get the vendor string of the graphics driver.
	 */
	val UNMASKED_VENDOR_WEBGL = 0x9245
	
	/**
	 * Passed to [getParameter] to get the renderer string of the graphics driver.
	 */
	val UNMASKED_RENDERER_WEBGL = 0x9246
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#ext_texture_filter_anisotropic
	/**
	 * Returns the maximum available anisotropy.
	 */
	val MAX_TEXTURE_MAX_ANISOTROPY_EXT = 0x84FF
	
	/**
	 * Passed to [texParameter] to set the desired maximum anisotropy for a texture.
	 */
	val TEXTURE_MAX_ANISOTROPY_EXT = 0x84FE
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#webgl_compressed_texture_s3tc
	/**
	 * A DXT1-compressed image in an RGB image format.
	 */
	val COMPRESSED_RGB_S3TC_DXT1_EXT = 0x83F0
	
	/**
	 * A DXT1-compressed image in an RGB image format with a simple on/off alpha value.
	 */
	val COMPRESSED_RGBA_S3TC_DXT1_EXT = 0x83F1
	
	/**
	 * A DXT3-compressed image in an RGBA image format. Compared to a 32-bit RGBA texture, it offers 4:1 compression.
	 */
	val COMPRESSED_RGBA_S3TC_DXT3_EXT = 0x83F2
	
	/**
	 * A DXT5-compressed image in an RGBA image format. It also provides a 4:1 compression, but differs to the DXT3 compression in how the alpha compression is done.
	 */
	val COMPRESSED_RGBA_S3TC_DXT5_EXT = 0x83F3
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#webgl_compressed_texture_etc
	/**
	 * One-channel (red) unsigned format compression.
	 */
	val COMPRESSED_R11_EAC = 0x9270
	
	/**
	 * One-channel (red) signed format compression.
	 */
	val COMPRESSED_SIGNED_R11_EAC = 0x9271
	
	/**
	 * Two-channel (red and green) unsigned format compression.
	 */
	val COMPRESSED_RG11_EAC = 0x9272
	
	/**
	 * Two-channel (red and green) signed format compression.
	 */
	val COMPRESSED_SIGNED_RG11_EAC = 0x9273
	
	/**
	 * Compresses RGB8 data with no alpha channel.
	 */
	val COMPRESSED_RGB8_ETC2 = 0x9274
	
	/**
	 * Compresses RGBA8 data. The RGB part is encoded the same as [RGB_ETC2], but the alpha part is encoded separately.
	 */
	val COMPRESSED_RGBA8_ETC2_EAC = 0x9275
	
	/**
	 * Compresses sRGB8 data with no alpha channel.
	 */
	val COMPRESSED_SRGB8_ETC2 = 0x9276
	
	/**
	 * Compresses sRGBA8 data. The sRGB part is encoded the same as [SRGB_ETC2], but the alpha part is encoded separately.
	 */
	val COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x9277
	
	/**
	 * Similar to [RGB8_ETC], but with ability to punch through the alpha channel, which means to make it completely opaque or transparent.
	 */
	val COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9278
	
	/**
	 * Similar to [SRGB8_ETC], but with ability to punch through the alpha channel, which means to make it completely opaque or transparent.
	 */
	val COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9279
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#webgl_compressed_texture_pvrtc
	/**
	 * RGB compression in 4-bit mode. One block for each 4×4 pixels.
	 */
	val COMPRESSED_RGB_PVRTC_4BPPV1_IMG = 0x8C00
	
	/**
	 * RGBA compression in 4-bit mode. One block for each 4×4 pixels.
	 */
	val COMPRESSED_RGBA_PVRTC_4BPPV1_IMG = 0x8C02
	
	/**
	 * RGB compression in 2-bit mode. One block for each 8×4 pixels.
	 */
	val COMPRESSED_RGB_PVRTC_2BPPV1_IMG = 0x8C01
	
	/**
	 * RGBA compression in 2-bit mode. One block for each 8×4 pixels.
	 */
	val COMPRESSED_RGBA_PVRTC_2BPPV1_IMG = 0x8C03
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#webgl_compressed_texture_etc1
	/**
	 * Compresses 24-bit RGB data with no alpha channel.
	 */
	val COMPRESSED_RGB_ETC1_WEBGL = 0x8D64
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#webgl_depth_texture
	/**
	 * Unsigned integer type for 24-bit depth texture data.
	 */
	val UNSIGNED_INT_24_8_WEBGL = 0x84FA
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#oes_texture_half_float
	/**
	 * Half floating-point type (16-bit).
	 */
	val HALF_FLOAT_OES = 0x8D61
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#webgl_color_buffer_float
	/**
	 * RGBA 32-bit floating-point color-renderable format.
	 */
	val RGBA32F_EXT = 0x8814
	
	/**
	 * RGB 32-bit floating-point color-renderable format.
	 */
	val RGB32F_EXT = 0x8815
	
	val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = 0x8211
	
	val UNSIGNED_NORMALIZED_EXT = 0x8C17
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#ext_blend_minmax
	/**
	 * Produces the minimum color components of the source and destination colors.
	 */
	val MIN_EXT = 0x8007
	
	/**
	 * Produces the maximum color components of the source and destination colors.
	 */
	val MAX_EXT = 0x8008
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#ext_srgb
	/**
	 * Unsized sRGB format that leaves the precision up to the driver.
	 */
	val SRGB_EXT = 0x8C40
	
	/**
	 * Unsized sRGB format with unsized alpha component.
	 */
	val SRGB_ALPHA_EXT = 0x8C42
	
	/**
	 * Sized (8-bit) sRGB and alpha formats.
	 */
	val SRGB8_ALPHA8_EXT = 0x8C43
	
	/**
	 * Returns the framebuffer color encoding.
	 */
	val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT = 0x8210
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#oes_standard_derivatives
	/**
	 * Indicates the accuracy of the derivative calculation for the GLSL built-in functions: [dFdx], [dFdy], and [fwidth].
	 */
	val FRAGMENT_SHADER_DERIVATIVE_HINT_OES = 0x8B8B
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#webgl_draw_buffers
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT0_WEBGL = 0x8CE0
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT1_WEBGL = 0x8CE1
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT2_WEBGL = 0x8CE2
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT3_WEBGL = 0x8CE3
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT4_WEBGL = 0x8CE4
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT5_WEBGL = 0x8CE5
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT6_WEBGL = 0x8CE6
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT7_WEBGL = 0x8CE7
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT8_WEBGL = 0x8CE8
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT9_WEBGL = 0x8CE9
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT10_WEBGL = 0x8CEA
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT11_WEBGL = 0x8CEB
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT12_WEBGL = 0x8CEC
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT13_WEBGL = 0x8CED
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT14_WEBGL = 0x8CEE
	
	/**
	 * Framebuffer color attachment point
	 */
	val COLOR_ATTACHMENT15_WEBGL = 0x8CEF
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER0_WEBGL = 0x8825
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER1_WEBGL = 0x8826
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER2_WEBGL = 0x8827
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER3_WEBGL = 0x8828
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER4_WEBGL = 0x8829
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER5_WEBGL = 0x882A
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER6_WEBGL = 0x882B
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER7_WEBGL = 0x882C
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER8_WEBGL = 0x882D
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER9_WEBGL = 0x882E
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER10_WEBGL = 0x882F
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER11_WEBGL = 0x8830
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER12_WEBGL = 0x8831
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER13_WEBGL = 0x8832
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER14_WEBGL = 0x8833
	
	/**
	 * Draw buffer
	 */
	val DRAW_BUFFER15_WEBGL = 0x8834
	
	/**
	 * Maximum number of framebuffer color attachment points
	 */
	val MAX_COLOR_ATTACHMENTS_WEBGL = 0x8CDF
	
	/**
	 * Maximum number of draw buffers
	 */
	val MAX_DRAW_BUFFERS_WEBGL = 0x8824
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#oes_vertex_array_object
	/**
	 * The bound vertex array object (VAO).
	 */
	val VERTEX_ARRAY_BINDING_OES = 0x85B5
	
	// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#ext_disjoint_timer_query
	/**
	 * The number of bits used to hold the query result for the given target.
	 */
	val QUERY_COUNTER_BITS_EXT = 0x8864
	
	/**
	 * The currently active query.
	 */
	val CURRENT_QUERY_EXT = 0x8865
	
	/**
	 * The query result.
	 */
	val QUERY_RESULT_EXT = 0x8866
	
	/**
	 * A Boolean indicating whether or not a query result is available.
	 */
	val QUERY_RESULT_AVAILABLE_EXT = 0x8867
	
	/**
	 * Elapsed time (in nanoseconds).
	 */
	val TIME_ELAPSED_EXT = 0x88BF
	
	/**
	 * The current time.
	 */
	val TIMESTAMP_EXT = 0x8E28
	
	/**
	 * A Boolean indicating whether or not the GPU performed any disjoint operation.
	 */
	val GPU_DISJOINT_EXT = 0x8FBB
	
}


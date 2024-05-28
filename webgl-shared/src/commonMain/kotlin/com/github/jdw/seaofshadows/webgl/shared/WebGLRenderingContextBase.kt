package com.github.jdw.seaofshadows.webgl.shared


/**
 *  The [WebGLRenderingContext] interface provides an interface to the OpenGL ES
 * 2.0 graphics rendering context for the drawing surface of an HTML [canvas]
 * element.
 * 
 *  To get access to a WebGL context for 2D and/or 3D graphics rendering, call
 * [getContext] on a [Canvas] object, supplying "webgl" as the argument:
 * 
 *  Once you have the WebGL rendering context for a [canvas] you can render within
 * it. The *WebGL tutorial* has more information, examples, and resources on how to
 * get started with WebGL.
 * 
 *  If you require a WebGL 2.0 context, see [WebGL2RenderingContext]; this supplies
 * access to an implementation of OpenGL ES 3.0 graphics.
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext)
 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14)
 * * [canvas](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/HTML/Element/canvas)
 * * [getContext](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/HTMLCanvasElement/getContext)
 * * [WebGL tutorial](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/WebGL_API/Tutorial)
 * * [WebGL2RenderingContext](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/WebGL2RenderingContext)
 */
interface WebGLRenderingContextBase {
	val canvas: HTMLCanvasElement
	val drawingBufferWidth: GLsizei
	val drawingBufferHeight: GLsizei
	
	
	companion object {
		/**
		* Passed to [clear] to clear the current depth buffer.
		 */
		val DEPTH_BUFFER_BIT: GLenum = 0x00000100UL
		
		
		/**
		* Passed to [clear] to clear the current stencil buffer.
		 */
		val STENCIL_BUFFER_BIT: GLenum = 0x00000400UL
		
		
		/**
		* Passed to [clear] to clear the current color buffer.
		 */
		val COLOR_BUFFER_BIT: GLenum = 0x00004000UL
		
		
		/**
		* Passed to [drawElements] or [drawArrays] to draw single points.
		 */
		val POINTS: GLenum = 0x0000UL
		
		
		/**
		* Passed to [drawElements] or [drawArrays] to draw lines. Each vertex connects to the one after it.
		 */
		val LINES: GLenum = 0x0001UL
		
		
		/**
		* Passed to [drawElements] or [drawArrays] to draw lines. Each set of two vertices is treated as a separate line segment.
		 */
		val LINE_LOOP: GLenum = 0x0002UL
		
		
		/**
		* Passed to [drawElements] or [drawArrays] to draw a connected group of line segments from the first vertex to the last.
		 */
		val LINE_STRIP: GLenum = 0x0003UL
		
		
		/**
		* Passed to [drawElements] or [drawArrays] to draw triangles. Each set of three vertices creates a separate triangle.
		 */
		val TRIANGLES: GLenum = 0x0004UL
		
		
		/**
		* Passed to [drawElements] or [drawArrays] to draw a connected group of triangles.
		 */
		val TRIANGLE_STRIP: GLenum = 0x0005UL
		
		
		/**
		* Passed to [drawElements] or [drawArrays] to draw a connected group of triangles. Each vertex connects to the previous and the first vertex in the fan.
		 */
		val TRIANGLE_FAN: GLenum = 0x0006UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to turn off a component.
		 */
		val ZERO: GLenum = 0UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to turn on a component.
		 */
		val ONE: GLenum = 1UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by the source elements color.
		 */
		val SRC_COLOR: GLenum = 0x0300UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by one minus the source elements color.
		 */
		val ONE_MINUS_SRC_COLOR: GLenum = 0x0301UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by the source's alpha.
		 */
		val SRC_ALPHA: GLenum = 0x0302UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by one minus the source's alpha.
		 */
		val ONE_MINUS_SRC_ALPHA: GLenum = 0x0303UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by the destination's alpha.
		 */
		val DST_ALPHA: GLenum = 0x0304UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by one minus the destination's alpha.
		 */
		val ONE_MINUS_DST_ALPHA: GLenum = 0x0305UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by the destination's color.
		 */
		val DST_COLOR: GLenum = 0x0306UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by one minus the destination's color.
		 */
		val ONE_MINUS_DST_COLOR: GLenum = 0x0307UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to multiply a component by the minimum of source's alpha or one minus the destination's alpha.
		 */
		val SRC_ALPHA_SATURATE: GLenum = 0x0308UL
		
		
		/**
		* Passed to [blendEquation] or [blendEquationSeparate] to set an addition blend function.
		 */
		val FUNC_ADD: GLenum = 0x8006UL
		
		
		/**
		* Passed to [getParameter] to get the current RGB blend function.
		 */
		val BLEND_EQUATION: GLenum = 0x8009UL
		
		
		/**
		* Passed to [getParameter] to get the current RGB blend function. Same as BLEND\_EQUATION
		 */
		val BLEND_EQUATION_RGB: GLenum = 0x8009UL
		
		
		/**
		* Passed to [getParameter] to get the current alpha blend function.
		 */
		val BLEND_EQUATION_ALPHA: GLenum = 0x883DUL
		
		
		/**
		* Passed to [blendEquation] or [blendEquationSeparate] to specify a subtraction blend function (source - destination).
		 */
		val FUNC_SUBTRACT: GLenum = 0x800AUL
		
		
		/**
		* Passed to [blendEquation] or [blendEquationSeparate] to specify a reverse subtraction blend function (destination - source).
		 */
		val FUNC_REVERSE_SUBTRACT: GLenum = 0x800BUL
		
		
		/**
		* Passed to [getParameter] to get the current destination RGB blend function.
		 */
		val BLEND_DST_RGB: GLenum = 0x80C8UL
		
		
		/**
		* Passed to [getParameter] to get the current destination RGB blend function.
		 */
		val BLEND_SRC_RGB: GLenum = 0x80C9UL
		
		
		/**
		* Passed to [getParameter] to get the current destination alpha blend function.
		 */
		val BLEND_DST_ALPHA: GLenum = 0x80CAUL
		
		
		/**
		* Passed to [getParameter] to get the current source alpha blend function.
		 */
		val BLEND_SRC_ALPHA: GLenum = 0x80CBUL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to specify a constant color blend function.
		 */
		val CONSTANT_COLOR: GLenum = 0x8001UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to specify one minus a constant color blend function.
		 */
		val ONE_MINUS_CONSTANT_COLOR: GLenum = 0x8002UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to specify a constant alpha blend function.
		 */
		val CONSTANT_ALPHA: GLenum = 0x8003UL
		
		
		/**
		* Passed to [blendFunc] or [blendFuncSeparate] to specify one minus a constant alpha blend function.
		 */
		val ONE_MINUS_CONSTANT_ALPHA: GLenum = 0x8004UL
		
		
		/**
		* Passed to [getParameter] to return a the current blend color.
		 */
		val BLEND_COLOR: GLenum = 0x8005UL
		
		
		/**
		* Passed to [bindBuffer] or [bufferData] to specify the type of buffer being used.
		 */
		val ARRAY_BUFFER: GLenum = 0x8892UL
		
		
		/**
		* Passed to [bindBuffer] or [bufferData] to specify the type of buffer being used.
		 */
		val ELEMENT_ARRAY_BUFFER: GLenum = 0x8893UL
		
		
		/**
		* Passed to [getParameter] to get the array buffer binding.
		 */
		val ARRAY_BUFFER_BINDING: GLenum = 0x8894UL
		
		
		/**
		* Passed to [getParameter] to get the current element array buffer.
		 */
		val ELEMENT_ARRAY_BUFFER_BINDING: GLenum = 0x8895UL
		
		
		/**
		* Passed to [bufferData] as a hint about whether the contents of the buffer are likely to not be used often.
		 */
		val STREAM_DRAW: GLenum = 0x88E0UL
		
		
		/**
		* Passed to [bufferData] as a hint about whether the contents of the buffer are likely to be used often and not change often.
		 */
		val STATIC_DRAW: GLenum = 0x88E4UL
		
		
		/**
		* Passed to [bufferData] as a hint about whether the contents of the buffer are likely to be used often and change often.
		 */
		val DYNAMIC_DRAW: GLenum = 0x88E8UL
		
		
		/**
		* Passed to [getBufferParameter] to get a buffer's size.
		 */
		val BUFFER_SIZE: GLenum = 0x8764UL
		
		
		/**
		* Passed to [getBufferParameter] to get the hint for the buffer passed in when it was created.
		 */
		val BUFFER_USAGE: GLenum = 0x8765UL
		
		
		/**
		* Passed to [getVertexAttrib] to read back the current vertex attribute.
		 */
		val CURRENT_VERTEX_ATTRIB: GLenum = 0x8626UL
		
		
		/**
		* Passed to [cullFace] to specify that only front faces should be culled.
		 */
		val FRONT: GLenum = 0x0404UL
		
		
		/**
		* Passed to [cullFace] to specify that only back faces should be culled.
		 */
		val BACK: GLenum = 0x0405UL
		
		
		/**
		* Passed to [cullFace] to specify that front and back faces should be culled.
		 */
		val FRONT_AND_BACK: GLenum = 0x0408UL
		
		
		/**
		* Passed to [enable]/[disable] to turn on/off culling. Can also be used with [getParameter] to find the current culling method.
		 */
		val CULL_FACE: GLenum = 0x0B44UL
		
		
		/**
		* Passed to [enable]/[disable] to turn on/off blending. Can also be used with [getParameter] to find the current blending method.
		 */
		val BLEND: GLenum = 0x0BE2UL
		
		
		/**
		* Passed to [enable]/[disable] to turn on/off dithering. Can also be used with [getParameter] to find the current dithering method.
		 */
		val DITHER: GLenum = 0x0BD0UL
		
		
		/**
		* Passed to [enable]/[disable] to turn on/off the stencil test. Can also be used with [getParameter] to query the stencil test.
		 */
		val STENCIL_TEST: GLenum = 0x0B90UL
		
		
		/**
		* Passed to [enable]/[disable] to turn on/off the depth test. Can also be used with [getParameter] to query the depth test.
		 */
		val DEPTH_TEST: GLenum = 0x0B71UL
		
		
		/**
		* Passed to [enable]/[disable] to turn on/off the scissor test. Can also be used with [getParameter] to query the scissor test.
		 */
		val SCISSOR_TEST: GLenum = 0x0C11UL
		
		
		/**
		* Passed to [enable]/[disable] to turn on/off the polygon offset. Useful for rendering hidden-line images, decals, and or solids with highlighted edges. Can also be used with [getParameter] to query the scissor test.
		 */
		val POLYGON_OFFSET_FILL: GLenum = 0x8037UL
		
		
		/**
		* Passed to [enable]/[disable] to turn on/off the alpha to coverage. Used in multi-sampling alpha channels.
		 */
		val SAMPLE_ALPHA_TO_COVERAGE: GLenum = 0x809EUL
		
		
		/**
		* Passed to [enable]/[disable] to turn on/off the sample coverage. Used in multi-sampling.
		 */
		val SAMPLE_COVERAGE: GLenum = 0x80A0UL
		
		
		/**
		* Returned from [getError].
		 */
		val NO_ERROR: GLenum = 0UL
		
		
		/**
		* Returned from [getError].
		 */
		val INVALID_ENUM: GLenum = 0x0500UL
		
		
		/**
		* Returned from [getError].
		 */
		val INVALID_VALUE: GLenum = 0x0501UL
		
		
		/**
		* Returned from [getError].
		 */
		val INVALID_OPERATION: GLenum = 0x0502UL
		
		
		/**
		* Returned from [getError].
		 */
		val OUT_OF_MEMORY: GLenum = 0x0505UL
		
		
		/**
		* Passed to [frontFace] to specify the front face of a polygon is drawn in the clockwise direction
		 */
		val CW: GLenum = 0x0900UL
		
		
		/**
		* Passed to [frontFace] to specify the front face of a polygon is drawn in the counter clockwise direction
		 */
		val CCW: GLenum = 0x0901UL
		
		
		/**
		* Passed to [getParameter] to get the current [lineWidth] (set by the [lineWidth] method).
		 */
		val LINE_WIDTH: GLenum = 0x0B21UL
		
		
		/**
		* Passed to [getParameter] to get the current size of a point drawn with [gl.POINTS]
		 */
		val ALIASED_POINT_SIZE_RANGE: GLenum = 0x846DUL
		
		
		/**
		* Passed to [getParameter] to get the range of available widths for a line. The [getParameter] method then returns an array with two elements: the first element is the minimum width value and the second element is the maximum width value.
		 */
		val ALIASED_LINE_WIDTH_RANGE: GLenum = 0x846EUL
		
		
		/**
		* Passed to [getParameter] to get the current value of [cullFace]. Should return [FRONT], [BACK], or [FRONT\_AND\_BACK]
		 */
		val CULL_FACE_MODE: GLenum = 0x0B45UL
		
		
		/**
		* Passed to [getParameter] to determine the current value of [frontFace]. Should return [CW] or [CCW].
		 */
		val FRONT_FACE: GLenum = 0x0B46UL
		
		
		/**
		* Passed to [getParameter] to return a length-2 array of floats giving the current depth range.
		 */
		val DEPTH_RANGE: GLenum = 0x0B70UL
		
		
		/**
		* Passed to [getParameter] to determine if the depth write mask is enabled.
		 */
		val DEPTH_WRITEMASK: GLenum = 0x0B72UL
		
		
		/**
		* Passed to [getParameter] to determine the current depth clear value.
		 */
		val DEPTH_CLEAR_VALUE: GLenum = 0x0B73UL
		
		
		/**
		* Passed to [getParameter] to get the current depth function. Returns [NEVER], [ALWAYS], [LESS], [EQUAL], [LEQUAL], [GREATER], [GEQUAL], or [NOTEQUAL].
		 */
		val DEPTH_FUNC: GLenum = 0x0B74UL
		
		
		/**
		* Passed to [getParameter] to get the value the stencil will be cleared to.
		 */
		val STENCIL_CLEAR_VALUE: GLenum = 0x0B91UL
		
		
		/**
		* Passed to [getParameter] to get the current stencil function. Returns [NEVER], [ALWAYS], [LESS], [EQUAL], [LEQUAL], [GREATER], [GEQUAL], or [NOTEQUAL].
		 */
		val STENCIL_FUNC: GLenum = 0x0B92UL
		
		
		/**
		* Passed to [getParameter] to get the current stencil fail function. Should return [KEEP], [REPLACE], [INCR], [DECR], [INVERT], [INCR\_WRAP], or [DECR\_WRAP].
		 */
		val STENCIL_FAIL: GLenum = 0x0B94UL
		
		
		/**
		* Passed to [getParameter] to get the current stencil fail function should the depth buffer test fail. Should return [KEEP], [REPLACE], [INCR], [DECR], [INVERT], [INCR\_WRAP], or [DECR\_WRAP].
		 */
		val STENCIL_PASS_DEPTH_FAIL: GLenum = 0x0B95UL
		
		
		/**
		* Passed to [getParameter] to get the current stencil fail function should the depth buffer test pass. Should return KEEP, REPLACE, INCR, DECR, INVERT, INCR\_WRAP, or DECR\_WRAP.
		 */
		val STENCIL_PASS_DEPTH_PASS: GLenum = 0x0B96UL
		
		
		/**
		* Passed to [getParameter] to get the reference value used for stencil tests.
		 */
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
		
		
		/**
		* Returns an [Int32Array] with four elements for the current viewport dimensions.
		 */
		val VIEWPORT: GLenum = 0x0BA2UL
		
		
		/**
		* Returns an [Int32Array] with four elements for the current scissor box dimensions.
		 */
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
		
		
		/**
		* There is no preference for this behavior.
		 */
		val DONT_CARE: GLenum = 0x1100UL
		
		
		/**
		* The most efficient behavior should be used.
		 */
		val FASTEST: GLenum = 0x1101UL
		
		
		/**
		* The most correct or the highest quality option should be used.
		 */
		val NICEST: GLenum = 0x1102UL
		
		
		/**
		* Hint for the quality of filtering when generating mipmap images with [WebGLRenderingContext.generateMipmap].
		 */
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
		
		
		/**
		* Passed to [createShader] to define a fragment shader.
		 */
		val FRAGMENT_SHADER: GLenum = 0x8B30UL
		
		
		/**
		* Passed to [createShader] to define a vertex shader
		 */
		val VERTEX_SHADER: GLenum = 0x8B31UL
		
		
		/**
		* The maximum number of entries possible in the vertex attribute list.
		 */
		val MAX_VERTEX_ATTRIBS: GLenum = 0x8869UL
		val MAX_VERTEX_UNIFORM_VECTORS: GLenum = 0x8DFBUL
		val MAX_VARYING_VECTORS: GLenum = 0x8DFCUL
		val MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum = 0x8B4DUL
		val MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum = 0x8B4CUL
		
		
		/**
		* Implementation dependent number of maximum texture units. At least 8.
		 */
		val MAX_TEXTURE_IMAGE_UNITS: GLenum = 0x8872UL
		val MAX_FRAGMENT_UNIFORM_VECTORS: GLenum = 0x8DFDUL
		val SHADER_TYPE: GLenum = 0x8B4FUL
		
		
		/**
		* Passed to [getShaderParameter] to determine if a shader was deleted via [deleteShader]. Returns true if it was, false otherwise.
		 */
		val DELETE_STATUS: GLenum = 0x8B80UL
		
		
		/**
		* Passed to [getProgramParameter] after calling [linkProgram] to determine if a program was linked correctly. Returns false if there were errors. Use [getProgramInfoLog] to find the exact error.
		 */
		val LINK_STATUS: GLenum = 0x8B82UL
		
		
		/**
		* Passed to [getProgramParameter] after calling [validateProgram] to determine if it is valid. Returns false if errors were found.
		 */
		val VALIDATE_STATUS: GLenum = 0x8B83UL
		
		
		/**
		* Passed to [getProgramParameter] after calling [attachShader] to determine if the shader was attached correctly. Returns false if errors occurred.
		 */
		val ATTACHED_SHADERS: GLenum = 0x8B85UL
		
		
		/**
		* Passed to [getProgramParameter] to get the number of uniforms active in a program.
		 */
		val ACTIVE_UNIFORMS: GLenum = 0x8B86UL
		
		
		/**
		* Passed to [getProgramParameter] to get the number of attributes active in a program.
		 */
		val ACTIVE_ATTRIBUTES: GLenum = 0x8B89UL
		val SHADING_LANGUAGE_VERSION: GLenum = 0x8B8CUL
		val CURRENT_PROGRAM: GLenum = 0x8B8DUL
		
		
		/**
		* Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will never pass, i.e., nothing will be drawn.
		 */
		val NEVER: GLenum = 0x0200UL
		
		
		/**
		* Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will pass if the new depth value is less than the stored value.
		 */
		val LESS: GLenum = 0x0201UL
		
		
		/**
		* Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will pass if the new depth value is equals to the stored value.
		 */
		val EQUAL: GLenum = 0x0202UL
		
		
		/**
		* Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will pass if the new depth value is less than or equal to the stored value.
		 */
		val LEQUAL: GLenum = 0x0203UL
		
		
		/**
		* Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will pass if the new depth value is greater than the stored value.
		 */
		val GREATER: GLenum = 0x0204UL
		
		
		/**
		* Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will pass if the new depth value is not equal to the stored value.
		 */
		val NOTEQUAL: GLenum = 0x0205UL
		
		
		/**
		* Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will pass if the new depth value is greater than or equal to the stored value.
		 */
		val GEQUAL: GLenum = 0x0206UL
		
		
		/**
		* Passed to [depthFunction] or [stencilFunction] to specify depth or stencil tests will always pass, i.e., pixels will be drawn in the order they are drawn.
		 */
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
		
		
		/**
		* The current active texture unit.
		 */
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
		
		
		/**
		* Passed to [getShaderParameter] to get the status of the compilation. Returns false if the shader was not compiled. You can then query [getShaderInfoLog] to find the exact error
		 */
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
		
		
		/**
		* Returned from [getError].
		 */
		val CONTEXT_LOST_WEBGL: GLenum = 0x9242UL
		val UNPACK_COLORSPACE_CONVERSION_WEBGL: GLenum = 0x9243UL
		val BROWSER_DEFAULT_WEBGL: GLenum = 0x9244UL
	}
	
	/**
	 *  The [WebGLRenderingContext].[getContextAttributes] method returns a
	 * [WebGLContextAttributes] object that contains the actual context parameters.
	 * Might return `null`, if the context is lost.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getContextAttributes)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.2)
	 */
	fun getContextAttributes(): WebGLContextAttributes?
	
	
	/**
	 *  The [WebGLRenderingContext].[isContextLost] method returns a boolean value
	 * indicating whether or not the WebGL context has been lost and must be
	 * re-established before rendering can resume.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isContextLost)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.13)
	 */
	fun isContextLost(): Boolean
	
	
	/**
	 *  The [WebGLRenderingContext].[getSupportedExtensions] method returns a list of
	 * all the supported WebGL extensions.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getSupportedExtensions)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.14)
	 */
	fun getSupportedExtensions(): List<DOMString>?
	
	
	/**
	 *  The [WebGLRenderingContext].[getExtension] method enables a WebGL extension.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getExtension)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.14)
	 *
	 * @param name A String for the [name] of the WebGL extension to [enable].
	 */
	fun getExtension(name: DOMString): Any?
	
	
	/**
	 *  The [WebGLRenderingContext].[activeTexture] method of the WebGL API specifies
	 * which texture unit to make active.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/activeTexture)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param texture The texture unit to make active. The value is a gl.TEXTUREI where *I* is within the range from 0 to gl.[MAX_COMBINED_TEXTURE_IMAGE_UNITS] - 1.
	 */
	fun activeTexture(texture: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[attachShader] method of the WebGL API attaches
	 * either a fragment or vertex [WebGLShader] to a [WebGLProgram].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/attachShader)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param program A [WebGLProgram].
	 * @param shader A fragment or vertex [WebGLShader].
	 */
	fun attachShader(program: WebGLProgram?, shader: WebGLShader?)
	
	
	/**
	 *  The [WebGLRenderingContext].[bindAttribLocation] method of the WebGL API binds
	 * a generic vertex index to an attribute variable.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindAttribLocation)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param program A [WebGLProgram] object to bind.
	 * @param index A [GLuint] specifying the index of the generic vertex to bind.
	 * @param name A string specifying the [name] of the variable to bind to the generic vertex index. This [name] cannot start with "webgl\_" or "\_webgl\_", as these are reserved for use by WebGL.
	 */
	fun bindAttribLocation(program: WebGLProgram?, index: GLuint, name: DOMString)
	
	
	/**
	 *  The [WebGLRenderingContext].[bindBuffer] method of the WebGL API binds a given
	 * [WebGLBuffer] to a target.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindBuffer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.5)
	 *
	 * @param target A [GLenum] specifying the binding point (target).
	 * Possible values:
	 *  gl.ARRAY_BUFFER
	 *  Buffer containing vertex attributes, such as vertex coordinates, texture
	 * coordinate data, or vertex color data.
	 *  gl.ELEMENT_ARRAY_BUFFER
	 *  Buffer used for element indices.
	 * @param buffer A [WebGLBuffer] to bind.
	 */
	fun bindBuffer(target: GLenum, buffer: WebGLBuffer?)
	
	
	/**
	 *  The [WebGLRenderingContext].[bindFramebuffer] method of the WebGL API binds to
	 * the specified target the provided [WebGLFramebuffer], or, if the `framebuffer`
	 * argument is null, the default [WebGLFramebuffer], which is associated with the
	 * [canvas] rendering context.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindFramebuffer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.6)
	 *
	 * @param target A [GLenum] specifying the binding point (target).
	 * Possible values:
	 *  gl.FRAMEBUFFER
	 *  Collection buffer data storage of color, [alpha] [depth] and [stencil] buffers
	 * used as both a destination for drawing and as a source for reading (see below).
	 * @param framebuffer A [WebGLFramebuffer] object to bind, or null for binding the [HTMLCanvasElement] or OffscreenCanvas object associated with the rendering context.
	 */
	fun bindFramebuffer(target: GLenum, framebuffer: WebGLFramebuffer?)
	
	
	/**
	 *  The [WebGLRenderingContext].[bindRenderbuffer] method of the WebGL API binds a
	 * given [WebGLRenderbuffer] to a target, which must be `gl.[RENDERBUFFER].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindRenderbuffer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.7)
	 *
	 * @param target A [GLenum] specifying the binding point (target).
	 * Possible values:
	 *  gl.RENDERBUFFER
	 *  Buffer data storage for single images in a renderable internal format.
	 * @param renderbuffer A [WebGLRenderbuffer] object to bind.
	 */
	fun bindRenderbuffer(target: GLenum, renderbuffer: WebGLRenderbuffer?)
	
	
	/**
	 *  The [WebGLRenderingContext].[bindTexture] method of the WebGL API binds a given
	 * [WebGLTexture] to a target (binding point).
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindTexture)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.8)
	 *
	 * @param target A [GLenum] specifying the binding point (target).
	 * Possible values:
	 *   *  gl.[TEXTURE_2D] A two-dimensional texture.
	 *   *  gl.[TEXTURE_CUBE_MAP] A cube-mapped texture. 
	 * @param texture A [WebGLTexture] object to bind.
	 */
	fun bindTexture(target: GLenum, texture: WebGLTexture?)
	
	
	/**
	 *  The [WebGLRenderingContext].[blendColor] method of the WebGL API is used to set
	 * the source and destination blending factors.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendColor)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param red A [GLclampf] for the red component in the range of 0 to 1. Default value is 0.
	 * @param green A [GLclampf] for the green component in the range of 0 to 1. Default value is 0.
	 * @param blue A [GLclampf] for the blue component in the range of 0 to 1. Default value is 0.
	 * @param alpha A [GLclampf] for the [alpha] component (transparency) in the range of 0. to 1. Default value is 0.
	 */
	fun blendColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf)
	
	
	/**
	 *  The [WebGLRenderingContext].[blendEquation] method of the WebGL API is used to
	 * set both the [RGB] blend equation and [alpha] blend equation to a single
	 * equation. The blend equation determines how a new pixel is combined with a pixel
	 * already in the [WebGLFramebuffer].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendEquation)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param mode A [GLenum] specifying how source and destination colors are combined. Must be either:
	 *   *  gl.[FUNC_ADD] source + destination (default value)
	 *   *  gl.[FUNC_SUBTRACT] source - destination
	 *   *  gl.[FUNC_REVERSE_SUBTRACT] destination - source
	 *  When using the EXT_blend_minmax extension:
	 *
	 *   *  ext.MIN_EXT: Minimum of source and destination
	 *   *  ext.MAX_EXT: Maximum of source and destination
	 */
	fun blendEquation(mode: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[blendEquationSeparate] method of the WebGL API is
	 * used to set the [RGB] blend equation and [alpha] blend equation separately. The
	 * blend equation determines how a new pixel is combined with a pixel already in
	 * the [WebGLFramebuffer].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendEquationSeparate)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param modergb A [GLenum] specifying how the red, green and blue components of source and destination colors are combined. Must be either:
	 *   *  gl.[FUNC_ADD] source + destination (default value),
	 *   *  gl.[FUNC_SUBTRACT] source - destination,
	 *   *  gl.[FUNC_REVERSE_SUBTRACT] destination - source,
	 * When using the EXT_blend_minmax extension:
	 *
	 *   *  ext.MIN_EXT: Minimum of source and destination,
	 *   *  ext.MAX_EXT: Maximum of source and destination.
	 *   *  
	 * @param modealpha A [GLenum] specifying how the [alpha] component (transparency) of source and destination colors are combined. Must be either:
	 *   *  gl.[FUNC_ADD] source + destination (default value),
	 *   *  gl.[FUNC_SUBTRACT] source - destination,
	 *   *  gl.[FUNC_REVERSE_SUBTRACT] destination - source,
	 * When using the EXT_blend_minmax extension:
	 *
	 *   *  ext.MIN_EXT: Minimum of source and destination,
	 *   *  ext.MAX_EXT: Maximum of source and destination.
	 *   *  
	 */
	fun blendEquationSeparate(modergb: GLenum, modealpha: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[blendFunc] method of the WebGL API defines which
	 * function is used for blending pixel arithmetic.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendFunc)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param sfactor A WebGL_API.Types specifying a multiplier for the source blending factors. The default value is gl.[ONE]. For possible values, see below.
	 * @param dfactor A WebGL_API.Types specifying a multiplier for the destination blending factors. The default value is gl.[ZERO]. For possible values, see below.
	 */
	fun blendFunc(sfactor: GLenum, dfactor: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[blendFuncSeparate] method of the WebGL API defines
	 * which function is used for blending pixel arithmetic for [RGB] and [alpha]
	 * components separately.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendFuncSeparate)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param srcrgb A WebGL_API.Types specifying a multiplier for the red, green and blue [RGB] source blending factors. The default value is gl.[ONE]. For possible values, see below.
	 * @param dstrgb A WebGL_API.Types specifying a multiplier for the red, green and blue [RGB] destination blending factors. The default value is gl.[ZERO]. For possible values, see below.
	 * @param srcalpha A WebGL_API.Types specifying a multiplier for the [alpha] source blending factor. The default value is gl.[ONE]. For possible values, see below.
	 * @param dstalpha A WebGL_API.Types specifying a multiplier for the [alpha] destination blending factor. The default value is gl.[ZERO]. For possible values, see below.
	 */
	fun blendFuncSeparate(srcrgb: GLenum, dstrgb: GLenum, srcalpha: GLenum, dstalpha: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[bufferData] method of the WebGL API initializes
	 * and creates the buffer object's data store.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.5)
	 *
	 * @param target A [GLenum] specifying the binding point (target).
	 * Possible values:
	 *  gl.ARRAY_BUFFER
	 *  Buffer containing vertex attributes, such as vertex coordinates, texture
	 * coordinate data, or vertex color data.
	 *  gl.ELEMENT_ARRAY_BUFFER
	 *  Buffer used for element indices.
	 * @param size A [GLsizeiptr] setting the [size] in bytes of the buffer object's data store.
	 * @param usage A [GLenum] specifying the intended usage pattern of the data store for optimization purposes.
	 * Possible values:
	 *  gl.STATIC_DRAW
	 *  The contents are intended to be specified once by the application, and used
	 * many times as the source for WebGL drawing and image specification commands.
	 *  gl.DYNAMIC_DRAW
	 *  The contents are intended to be respecified repeatedly by the application, and
	 * used many times as the source for WebGL drawing and image specification
	 * commands.
	 *  gl.STREAM_DRAW
	 *  The contents are intended to be specified once by the application, and used at
	 * most a few times as the source for WebGL drawing and image specification
	 * commands.
	 */
	fun bufferData(target: GLenum, size: GLsizeiptr, usage: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[bufferData] method of the WebGL API initializes
	 * and creates the buffer object's data store.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.5)
	 *
	 * @param target A [GLenum] specifying the binding point (target).
	 * Possible values:
	 *  gl.ARRAY_BUFFER
	 *  Buffer containing vertex attributes, such as vertex coordinates, texture
	 * coordinate data, or vertex color data.
	 *  gl.ELEMENT_ARRAY_BUFFER
	 *  Buffer used for element indices.
	 * @param srcdata An [ArrayBuffer] [SharedArrayBuffer] a [TypedArray] or a [DataView] that will be copied into the data store. If null, a data store is still created, but the content is uninitialized and undefined.
	 * @param usage A [GLenum] specifying the intended usage pattern of the data store for optimization purposes.
	 * Possible values:
	 *  gl.STATIC_DRAW
	 *  The contents are intended to be specified once by the application, and used
	 * many times as the source for WebGL drawing and image specification commands.
	 *  gl.DYNAMIC_DRAW
	 *  The contents are intended to be respecified repeatedly by the application, and
	 * used many times as the source for WebGL drawing and image specification
	 * commands.
	 *  gl.STREAM_DRAW
	 *  The contents are intended to be specified once by the application, and used at
	 * most a few times as the source for WebGL drawing and image specification
	 * commands.
	 */
	fun bufferData(target: GLenum, srcdata: BufferDataSource?, usage: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[bufferSubData] method of the WebGL API updates a
	 * subset of a buffer object's data store.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.5)
	 *
	 * @param target A [GLenum] specifying the binding point (target).
	 * Possible values:
	 *  gl.ARRAY_BUFFER
	 *  Buffer containing vertex attributes, such as vertex coordinates, texture
	 * coordinate data, or vertex color data.
	 *  gl.ELEMENT_ARRAY_BUFFER
	 *  Buffer used for element indices.
	 * @param offset TODO: This parameters documentation import caused unspecified trouble!
	 * @param srcdata An [ArrayBuffer] [SharedArrayBuffer] a [DataView] or a [TypedArray] that will be copied into the data store.
	 */
	fun bufferSubData(target: GLenum, offset: GLintptr, srcdata: BufferDataSource?)
	
	
	/**
	 *  The [WebGLRenderingContext].[checkFramebufferStatus] method of the WebGL API
	 * returns the completeness status of the [WebGLFramebuffer] object.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/checkFramebufferStatus)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.6)
	 *
	 * @param target A [GLenum] specifying the binding point (target).
	 * Possible values:
	 *  gl.FRAMEBUFFER
	 *  Collection buffer data storage of color, [alpha] [depth] and [stencil] buffers
	 * used to render an image.
	 */
	fun checkFramebufferStatus(target: GLenum): GLenum
	
	
	/**
	 *  The [WebGLRenderingContext].[clear] method of the WebGL API clears buffers to
	 * preset values. The preset values can be set by [clearColor], [clearDepth] or
	 * [clearStencil]. The [scissor] box, dithering, and buffer writemasks can affect
	 * the [clear] method.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clear)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.11)
	 *
	 * @param mask A [GLbitfield] bitwise OR mask that indicates the buffers to be cleared. Possible values are:
	 *   *  gl.[COLOR_BUFFER_BIT]
	 *   *  gl.[DEPTH_BUFFER_BIT]
	 *   *  gl.[STENCIL_BUFFER_BIT]
	 */
	fun clear(mask: GLbitfield)
	
	
	/**
	 *  The [WebGLRenderingContext].[clearColor] method of the WebGL API specifies the
	 * color values used when clearing color buffers. This specifies what color values
	 * to use when calling the [clear] method. The values are clamped between 0 and 1.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clearColor)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param red A [GLclampf] specifying the red color value used when the color buffers are cleared. Default value: 0.
	 * @param green A [GLclampf] specifying the green color value used when the color buffers are cleared. Default value: 0.
	 * @param blue A [GLclampf] specifying the blue color value used when the color buffers are cleared. Default value: 0.
	 * @param alpha A [GLclampf] specifying the [alpha] (transparency) value used when the color buffers are cleared. Default value: 0.
	 */
	fun clearColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf)
	
	
	/**
	 *  The [WebGLRenderingContext].[clearDepth] method of the WebGL API specifies the
	 * [clear] value for the [depth] buffer. This specifies what [depth] value to use
	 * when calling the [clear] method. The value is clamped between 0 and 1.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clearDepth)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param depth A [GLclampf] specifying the [depth] value used when the [depth] buffer is cleared. Default value: 1.
	 */
	fun clearDepth(depth: GLclampf)
	
	
	/**
	 *  The [WebGLRenderingContext].[clearStencil] method of the WebGL API specifies
	 * the [clear] value for the [stencil] buffer. This specifies what [stencil] value
	 * to use when calling the [clear] method.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clearStencil)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param s A [GLint] specifying the index used when the [stencil] buffer is cleared. Default value: 0.
	 */
	fun clearStencil(s: GLint)
	
	
	/**
	 *  The [WebGLRenderingContext].[colorMask] method of the WebGL API sets which
	 * color components to [enable] or to [disable] when drawing or rendering to a
	 * [WebGLFramebuffer].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/colorMask)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param red A [GLboolean] specifying whether or not the red color component can be written into the frame buffer. Default value: true.
	 * @param green A [GLboolean] specifying whether or not the green color component can be written into the frame buffer. Default value: true.
	 * @param blue A [GLboolean] specifying whether or not the blue color component can be written into the frame buffer. Default value: true.
	 * @param alpha A [GLboolean] specifying whether or not the [alpha] (transparency) component can be written into the frame buffer. Default value: true.
	 */
	fun colorMask(red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean)
	
	
	/**
	 *  The [WebGLRenderingContext].[compileShader] method of the WebGL API compiles a
	 * GLSL shader into binary data so that it can be used by a [WebGLProgram].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compileShader)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param shader A fragment or vertex [WebGLShader].
	 */
	fun compileShader(shader: WebGLShader?)
	
	
	/**
	 *  The [WebGLRenderingContext].[compressedTexImage2D] and
	 * [WebGL2RenderingContext].[compressedTexImage3D] methods of the WebGL API specify
	 * a two- or three-dimensional texture image in a compressed format. Compressed
	 * image formats must be enabled by WebGL extensions before using these methods.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexImage2D)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#COMPRESSEDTEXIMAGE2D)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture. Possible values for [compressedTexImage2D]
	 *   *  gl.[TEXTURE_2D] A two-dimensional texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_X] Positive X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_X] Negative X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Y] Positive Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Y] Negative Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Z] Positive Z face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Z] Negative Z face for a cube-mapped texture.
	 *  Possible values for compressedTexImage3D:
	 *   *  gl.TEXTURE_2D_ARRAY
	 *   *  gl.TEXTURE_3D
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level *n* is the n-th mipmap reduction level.
	 * @param internalformat A [GLenum] specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions before using this method. All values are possible for [compressedTexImage2D]. See compressed texture formats for which are valid for compressedTexImage3D.
	 * Possible values:
	 * When using the WEBGL_compressed_texture_s3tc extension:
	 *
	 *   *  ext.COMPRESSED_RGB_S3TC_DXT1_EXT
	 *   *  ext.COMPRESSED_RGBA_S3TC_DXT1_EXT
	 *   *  ext.COMPRESSED_RGBA_S3TC_DXT3_EXT
	 *   *  ext.COMPRESSED_RGBA_S3TC_DXT5_EXT
	 * When using the WEBGL_compressed_texture_s3tc_srgb extension:
	 *
	 *   *  ext.COMPRESSED_SRGB_S3TC_DXT1_EXT
	 *   *  ext.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT
	 *   *  ext.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT
	 *   *  ext.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT
	 * When using the WEBGL_compressed_texture_etc extension:
	 *
	 *   *  ext.COMPRESSED_R11_EAC
	 *   *  ext.COMPRESSED_SIGNED_R11_EAC
	 *   *  ext.COMPRESSED_RG11_EAC
	 *   *  ext.COMPRESSED_SIGNED_RG11_EAC
	 *   *  ext.COMPRESSED_RGB8_ETC2
	 *   *  ext.COMPRESSED_RGBA8_ETC2_EAC
	 *   *  ext.COMPRESSED_SRGB8_ETC2
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC
	 *   *  ext.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2
	 *   *  ext.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2
	 * When using the WEBGL_compressed_texture_pvrtc extension:
	 *
	 *   *  ext.COMPRESSED_RGB_PVRTC_4BPPV1_IMG
	 *   *  ext.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG
	 *   *  ext.COMPRESSED_RGB_PVRTC_2BPPV1_IMG
	 *   *  ext.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG
	 * When using the WEBGL_compressed_texture_etc1 extension:
	 *
	 *   *  ext.COMPRESSED_RGB_ETC1_WEBGL
	 * When using the WEBGL_compressed_texture_astc extension:
	 *
	 *   *  ext.COMPRESSED_RGBA_ASTC_4x4_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_5x4_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_5x5_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_6x5_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_6x6_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_8x5_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_8x6_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_8x8_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_10x5_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_10x6_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_10x10_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_12x10_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_12x12_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR
	 * When using the EXT_texture_compression_bptc extension:
	 *
	 *   *  ext.COMPRESSED_RGBA_BPTC_UNORM_EXT
	 *   *  ext.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT
	 *   *  ext.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT
	 *   *  ext.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT
	 * When using the EXT_texture_compression_rgtc extension:
	 *
	 *   *  ext.COMPRESSED_RED_RGTC1_EXT
	 *   *  ext.COMPRESSED_SIGNED_RED_RGTC1_EXT
	 *   *  ext.COMPRESSED_RED_GREEN_RGTC2_EXT
	 *   *  ext.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT
	 * @param width A [GLsizei] specifying the width of the texture.
	 * @param height A [GLsizei] specifying the height of the texture.
	 * @param border A [GLint] specifying the width of the border. Must be 0.
	 * @param pixels A [TypedArray] or a [DataView] that will be used as a data store for the compressed image data in memory.
	 */
	fun compressedTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, height: GLsizei, border: GLint, pixels: ArrayBufferView)
	
	
	/**
	 *  The [WebGLRenderingContext].[compressedTexSubImage2D] method of the WebGL API
	 * specifies a two-dimensional sub-rectangle for a texture image in a compressed
	 * format. Compressed image formats must be enabled by WebGL extensions before
	 * using this method or a `WebGL2RenderingContext` must be used.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#COMPRESSEDTEXSUBIMAGE2D)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active compressed texture.
	 * Possible values:
	 *   *  gl.[TEXTURE_2D] A two-dimensional texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_X] Positive X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_X] Negative X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Y] Positive Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Y] Negative Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Z] Positive Z face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Z] Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level *n* is the n-th mipmap reduction level.
	 * @param xoffset A [GLint] specifying the horizontal offset within the compressed texture image.
	 * @param yoffset A [GLint] specifying the vertical offset within the compressed texture image.
	 * @param width A [GLsizei] specifying the width of the compressed texture.
	 * @param height A [GLsizei] specifying the height of the compressed texture.
	 * @param format A [GLenum] specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions before using this method.
	 * Possible values:
	 * When using the WEBGL_compressed_texture_s3tc extension:
	 *
	 *   *  ext.COMPRESSED_RGB_S3TC_DXT1_EXT
	 *   *  ext.COMPRESSED_RGBA_S3TC_DXT1_EXT
	 *   *  ext.COMPRESSED_RGBA_S3TC_DXT3_EXT
	 *   *  ext.COMPRESSED_RGBA_S3TC_DXT5_EXT
	 * When using the WEBGL_compressed_texture_s3tc_srgb extension:
	 *
	 *   *  ext.COMPRESSED_SRGB_S3TC_DXT1_EXT
	 *   *  ext.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT
	 *   *  ext.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT
	 *   *  ext.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT
	 * When using the WEBGL_compressed_texture_etc extension:
	 *
	 *   *  ext.COMPRESSED_R11_EAC
	 *   *  ext.COMPRESSED_SIGNED_R11_EAC
	 *   *  ext.COMPRESSED_RG11_EAC
	 *   *  ext.COMPRESSED_SIGNED_RG11_EAC
	 *   *  ext.COMPRESSED_RGB8_ETC2
	 *   *  ext.COMPRESSED_RGBA8_ETC2_EAC
	 *   *  ext.COMPRESSED_SRGB8_ETC2
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC
	 *   *  ext.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2
	 *   *  ext.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2
	 * When using the WEBGL_compressed_texture_pvrtc extension:
	 *
	 *   *  ext.COMPRESSED_RGB_PVRTC_4BPPV1_IMG
	 *   *  ext.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG
	 *   *  ext.COMPRESSED_RGB_PVRTC_2BPPV1_IMG
	 *   *  ext.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG
	 * When using the WEBGL_compressed_texture_astc extension:
	 *
	 *   *  ext.COMPRESSED_RGBA_ASTC_4x4_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_5x4_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_5x5_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_6x5_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_6x6_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_8x5_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_8x6_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_8x8_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_10x5_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_10x6_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_10x6_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_10x10_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_12x10_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR
	 *   *  ext.COMPRESSED_RGBA_ASTC_12x12_KHR
	 *   *  ext.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR
	 * When using the EXT_texture_compression_bptc extension:
	 *
	 *   *  ext.COMPRESSED_RGBA_BPTC_UNORM_EXT
	 *   *  ext.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT
	 *   *  ext.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT
	 *   *  ext.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT
	 * When using the EXT_texture_compression_rgtc extension:
	 *
	 *   *  ext.COMPRESSED_RED_RGTC1_EXT
	 *   *  ext.COMPRESSED_SIGNED_RED_RGTC1_EXT
	 *   *  ext.COMPRESSED_RED_GREEN_RGTC2_EXT
	 *   *  ext.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT
	 * @param srcdata A [TypedArray] or a [DataView] that will be used as a data store for the compressed image data in memory.
	 */
	fun compressedTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, width: GLsizei, height: GLsizei, format: GLenum, srcdata: ArrayBufferView)
	
	
	/**
	 *  The [WebGLRenderingContext].[copyTexImage2D] method of the WebGL API copies
	 * pixels from the current [WebGLFramebuffer] into a 2D texture image.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/copyTexImage2D)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.8)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture.
	 * Possible values:
	 *   *  gl.[TEXTURE_2D] A two-dimensional texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_X] Positive X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_X] Negative X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Y] Positive Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Y] Negative Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Z] Positive Z face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Z] Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level *n* is the n-th mipmap reduction level.
	 * @param internalformat A [GLenum] specifying the color components in the texture.
	 * Possible values:
	 *   *  gl.[ALPHA] Discards the red, green and blue components and reads the
	 * [alpha] component.
	 *   *  gl.[RGB] Discards the [alpha] components and reads the red, green and blue
	 * components.
	 *   *  gl.[RGBA] Red, green, blue and [alpha] components are read from the color
	 * buffer.
	 *   *  gl.[LUMINANCE] Each color component is a luminance component, [alpha] is
	 * 1.0.
	 *   *  gl.[LUMINANCE_ALPHA] Each component is a luminance/alpha component.
	 * @param x A [GLint] specifying the x coordinate of the lower left corner where to start copying.
	 * @param y A [GLint] specifying the y coordinate of the lower left corner where to start copying.
	 * @param width A [GLsizei] specifying the width of the texture.
	 * @param height A [GLsizei] specifying the height of the texture.
	 * @param border A [GLint] specifying the width of the border. Must be 0.
	 */
	fun copyTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei, height: GLsizei, border: GLint)
	
	
	/**
	 *  The [WebGLRenderingContext].[copyTexSubImage2D] method of the WebGL API copies
	 * pixels from the current [WebGLFramebuffer] into an existing 2D texture
	 * sub-image.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/copyTexSubImage2D)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.8)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture.
	 * Possible values:
	 *   *  gl.[TEXTURE_2D] A two-dimensional texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_X] Positive X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_X] Negative X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Y] Positive Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Y] Negative Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Z] Positive Z face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Z] Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level *n* is the n-th mipmap reduction level.
	 * @param xoffset A [GLint] specifying the horizontal offset within the texture image.
	 * @param yoffset A [GLint] specifying the vertical offset within the texture image.
	 * @param x A [GLint] specifying the x coordinate of the lower left corner where to start copying.
	 * @param y A [GLint] specifying the y coordinate of the lower left corner where to start copying.
	 * @param width A [GLsizei] specifying the width of the texture.
	 * @param height A [GLsizei] specifying the height of the texture.
	 */
	fun copyTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, x: GLint, y: GLint, width: GLsizei, height: GLsizei)
	
	
	/**
	 *  The [WebGLRenderingContext].[createBuffer] method of the WebGL API creates and
	 * initializes a [WebGLBuffer] storing data such as vertices or colors.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createBuffer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.5)
	 */
	fun createBuffer(): WebGLBuffer?
	
	
	/**
	 *  The [WebGLRenderingContext].[createFramebuffer] method of the WebGL API creates
	 * and initializes a [WebGLFramebuffer] object.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createFramebuffer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.6)
	 */
	fun createFramebuffer(): WebGLFramebuffer?
	
	
	/**
	 *  The [WebGLRenderingContext].[createProgram] method of the WebGL API creates and
	 * initializes a [WebGLProgram] object.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createProgram)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 */
	fun createProgram(): WebGLProgram?
	
	
	/**
	 *  The [WebGLRenderingContext].[createRenderbuffer] method of the WebGL API
	 * creates and initializes a [WebGLRenderbuffer] object.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createRenderbuffer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.7)
	 */
	fun createRenderbuffer(): WebGLRenderbuffer?
	
	
	/**
	 *  The [WebGLRenderingContext] method [createShader] of the WebGL API creates a
	 * [WebGLShader] that can then be configured further using
	 * [WebGLRenderingContext].[shaderSource] and
	 * [WebGLRenderingContext].[compileShader].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createShader)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param type Either gl.[VERTEX_SHADER] or gl.[FRAGMENT_SHADER]
	 */
	fun createShader(type: GLenum): WebGLShader?
	
	
	/**
	 *  The [WebGLRenderingContext].[createTexture] method of the WebGL API creates and
	 * initializes a [WebGLTexture] object.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createTexture)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.8)
	 */
	fun createTexture(): WebGLTexture?
	
	
	/**
	 *  The [WebGLRenderingContext].[cullFace] method of the WebGL API specifies
	 * whether or not front- and/or back-facing polygons can be culled.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/cullFace)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param mode A [GLenum] specifying whether front- or back-facing polygons are candidates for culling. The default value is gl.[BACK]. Possible values are:
	 *   *  gl.[FRONT]
	 *   *  gl.[BACK]
	 *   *  gl.[FRONT_AND_BACK]
	 */
	fun cullFace(mode: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[deleteBuffer] method of the WebGL API deletes a
	 * given [WebGLBuffer]. This method has no effect if the buffer has already been
	 * deleted. Normally you don't need to call this method yourself, when the buffer
	 * object is dereferenced it will be marked as free.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteBuffer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.5)
	 *
	 * @param buffer A [WebGLBuffer] object to delete.
	 */
	fun deleteBuffer(buffer: WebGLBuffer?)
	
	
	/**
	 *  The [WebGLRenderingContext].[deleteFramebuffer] method of the WebGL API deletes
	 * a given [WebGLFramebuffer] object. This method has no effect if the frame buffer
	 * has already been deleted.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteFramebuffer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.6)
	 *
	 * @param framebuffer A [WebGLFramebuffer] object to delete.
	 */
	fun deleteFramebuffer(framebuffer: WebGLFramebuffer?)
	
	
	/**
	 *  The [WebGLRenderingContext].[deleteProgram] method of the WebGL API deletes a
	 * given [WebGLProgram] object. This method has no effect if the program has
	 * already been deleted.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteProgram)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param program A [WebGLProgram] object to delete.
	 */
	fun deleteProgram(program: WebGLProgram?)
	
	
	/**
	 *  The [WebGLRenderingContext].[deleteRenderbuffer] method of the WebGL API
	 * deletes a given [WebGLRenderbuffer] object. This method has no effect if the
	 * render buffer has already been deleted.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteRenderbuffer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.7)
	 *
	 * @param renderbuffer A [WebGLRenderbuffer] object to delete.
	 */
	fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer?)
	
	
	/**
	 *  The [WebGLRenderingContext].[deleteShader] method of the WebGL API marks a
	 * given [WebGLShader] object for deletion. It will then be deleted whenever the
	 * shader is no longer in use. This method has no effect if the shader has already
	 * been deleted, and the [WebGLShader] is automatically marked for deletion when it
	 * is destroyed by the garbage collector.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteShader)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param shader A [WebGLShader] object to delete.
	 */
	fun deleteShader(shader: WebGLShader?)
	
	
	/**
	 *  The [WebGLRenderingContext].[deleteTexture] method of the WebGL API deletes a
	 * given [WebGLTexture] object. This method has no effect if the texture has
	 * already been deleted.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteTexture)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.8)
	 *
	 * @param texture A [WebGLTexture] object to delete.
	 */
	fun deleteTexture(texture: WebGLTexture?)
	
	
	/**
	 *  The [WebGLRenderingContext].[depthFunc] method of the WebGL API specifies a
	 * function that compares incoming pixel [depth] to the current [depth] buffer
	 * value.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/depthFunc)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param func A [GLenum] specifying the [depth] comparison function, which sets the conditions under which the pixel will be drawn. The default value is gl.[LESS]. Possible values are:
	 *   *  gl.[NEVER] (never pass)
	 *   *  gl.[LESS] (pass if the incoming value is less than the [depth] buffer
	 * value)
	 *   *  gl.[EQUAL] (pass if the incoming value equals the [depth] buffer value)
	 *   *  gl.[LEQUAL] (pass if the incoming value is less than or equal to the
	 * [depth] buffer value)
	 *   *  gl.[GREATER] (pass if the incoming value is greater than the [depth] buffer
	 * value)
	 *   *  gl.[NOTEQUAL] (pass if the incoming value is not equal to the [depth]
	 * buffer value)
	 *   *  gl.[GEQUAL] (pass if the incoming value is greater than or equal to the
	 * [depth] buffer value)
	 *   *  gl.[ALWAYS] (always pass)
	 */
	fun depthFunc(func: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[depthMask] method of the WebGL API sets whether
	 * writing into the [depth] buffer is enabled or disabled.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/depthMask)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param flag A [GLboolean] specifying whether or not writing into the [depth] buffer is enabled. Default value: true, meaning that writing is enabled.
	 */
	fun depthMask(flag: GLboolean)
	
	
	/**
	 *  The [WebGLRenderingContext].[depthRange] method of the WebGL API specifies the
	 * [depth] range mapping from normalized device coordinates to window or [viewport]
	 * coordinates.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/depthRange)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param znear A [GLclampf] specifying the mapping of the near clipping plane to window or [viewport] coordinates. Clamped to the range 0 to 1 and must be less than or equal to zFar. The default value is 0.
	 * @param zfar A [GLclampf] specifying the mapping of the far clipping plane to window or [viewport] coordinates. Clamped to the range 0 to 1. The default value is 1.
	 */
	fun depthRange(znear: GLclampf, zfar: GLclampf)
	
	
	/**
	 *  The [WebGLRenderingContext].[detachShader] method of the WebGL API detaches a
	 * previously attached [WebGLShader] from a [WebGLProgram].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/detachShader)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param program A [WebGLProgram].
	 * @param shader A fragment or vertex [WebGLShader].
	 */
	fun detachShader(program: WebGLProgram?, shader: WebGLShader?)
	
	
	/**
	 *  The [WebGLRenderingContext].[disable] method of the WebGL API disables specific
	 * WebGL capabilities for this context.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/disable)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param capability A [GLenum] specifying which WebGL capability to [disable].
	 * Possible values:
	 *  <table> 
	 *   <thead> 
	 *    <tr> 
	 *     <th>Constant</th> 
	 *     <th>Description</th> 
	 *    </tr> 
	 *   </thead> 
	 *   <tbody> 
	 *    <tr> 
	 *     <td><code>gl.BLEND</code></td> 
	 *     <td>Deactivates blending of the computed fragment color values. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.blendFunc</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.CULL_FACE</code></td> 
	 *     <td>Deactivates culling of polygons. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.cullFace</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.DEPTH_TEST</code></td> 
	 *     <td>Deactivates [depth] comparisons and updates to the [depth] buffer. See
	 * <a rel="nofollow"><code>WebGLRenderingContext.depthFunc</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.DITHER</code></td> 
	 *     <td>Deactivates dithering of color components before they get written to the
	 * color buffer.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.POLYGON_OFFSET_FILL</code></td> 
	 *     <td>Deactivates adding an offset to [depth] values of polygon's fragments.
	 * See <a rel="nofollow"><code>WebGLRenderingContext.polygonOffset</code></a>.</td>
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.SAMPLE_ALPHA_TO_COVERAGE</code></td> 
	 *     <td>Deactivates the computation of a temporary coverage value determined by
	 * the [alpha] value.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.SAMPLE_COVERAGE</code></td> 
	 *     <td>Deactivates ANDing the fragment's coverage with the temporary coverage
	 * value. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.sampleCoverage</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.SCISSOR_TEST</code></td> 
	 *     <td>Deactivates the [scissor] test that discards fragments that are outside
	 * of the [scissor] rectangle. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.scissor</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.STENCIL_TEST</code></td> 
	 *     <td>Deactivates [stencil] testing and updates to the [stencil] buffer. See
	 * <a rel="nofollow"><code>WebGLRenderingContext.stencilFunc</code></a>.</td> 
	 *    </tr> 
	 *   </tbody> 
	 *  </table>
	 */
	fun disable(capability: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[disableVertexAttribArray] method of the WebGL API
	 * turns the generic vertex attribute array off at a given index position.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/disableVertexAttribArray)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the index of the vertex attribute to [disable].
	 */
	fun disableVertexAttribArray(index: GLuint)
	
	
	/**
	 *  The [WebGLRenderingContext].[drawArrays] method of the WebGL API renders
	 * primitives from array data.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawArrays)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.11)
	 *
	 * @param mode A [GLenum] specifying the [type] primitive to render. Possible values are:
	 *   *  gl.[POINTS] Draws a single dot.
	 *   *  gl.[LINE_STRIP] Draws a straight line to the next vertex.
	 *   *  gl.[LINE_LOOP] Draws a straight line to the next vertex, and connects the
	 * last vertex back to the first.
	 *   *  gl.[LINES] Draws a line between a pair of vertices.
	 *   *  [gl.TRIANGLE_STRIP][gl.[TRIANGLE_STRIP]
	 *   *  [gl.TRIANGLE_FAN][gl.[TRIANGLE_FAN]
	 *   *  gl.[TRIANGLES] Draws a triangle for a group of three vertices.
	 *  [gl.[TRIANGLE_STRIP] https://en.wikipedia.org/wiki/Triangle_strip
	 *  [gl.[TRIANGLE_FAN] https://en.wikipedia.org/wiki/Triangle_fan
	 * @param first A [GLint] specifying the starting index in the array of vector points.
	 * @param count A [GLsizei] specifying the number of indices to be rendered.
	 */
	fun drawArrays(mode: GLenum, first: GLint, count: GLsizei)
	
	
	/**
	 *  The [WebGLRenderingContext].[drawElements] method of the WebGL API renders
	 * primitives from array data.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawElements)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.11)
	 *
	 * @param mode A [GLenum] specifying the [type] primitive to render. Possible values are:
	 *   *  gl.[POINTS] Draws a single dot.
	 *   *  gl.[LINE_STRIP] Draws a straight line to the next vertex.
	 *   *  gl.[LINE_LOOP] Draws a straight line to the next vertex, and connects the
	 * last vertex back to the first.
	 *   *  gl.[LINES] Draws a line between a pair of vertices.
	 *   *  [gl.TRIANGLE_STRIP][gl.[TRIANGLE_STRIP]
	 *   *  [gl.TRIANGLE_FAN][gl.[TRIANGLE_FAN]
	 *   *  gl.[TRIANGLES] Draws a triangle for a group of three vertices.
	 *  [gl.[TRIANGLE_STRIP] https://en.wikipedia.org/wiki/Triangle_strip
	 *  [gl.[TRIANGLE_FAN] https://en.wikipedia.org/wiki/Triangle_fan
	 * @param count A [GLsizei] specifying the number of elements of the bound element array buffer to be rendered. For example, to draw a wireframe triangle with gl.[LINES] the count should be 2 endpoints per line × 3 lines = 6 elements. However to draw the same wireframe triangle with gl.[LINE_STRIP] the element array buffer does not repeat the indices for the end of the first line/start of the second line, and end of the second line/start of the third line, so count will be four. To draw the same triangle with gl.[LINE_LOOP] the element array buffer does not repeat the first/last vertex either so count will be three.
	 * @param type A [GLenum] specifying the [type] of the values in the element array buffer. Possible values are:
	 *   *  gl.[UNSIGNED_BYTE]
	 *   *  gl.UNSIGNED_SHORT
	 *  When using the OES_element_index_uint extension:
	 *
	 *   *  gl.[UNSIGNED_INT]
	 * @param offset A [GLintptr] specifying a byte offset in the element array buffer. Must be a valid multiple of the [size] of the given [type].
	 */
	fun drawElements(mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr)
	
	
	/**
	 *  The [WebGLRenderingContext].[enable] method of the WebGL API enables specific
	 * WebGL capabilities for this context.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/enable)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param cap A [GLenum] specifying which WebGL capability to [enable].
	 * Possible values:
	 *  <table> 
	 *   <thead> 
	 *    <tr> 
	 *     <th>Constant</th> 
	 *     <th>Description</th> 
	 *    </tr> 
	 *   </thead> 
	 *   <tbody> 
	 *    <tr> 
	 *     <td><code>gl.BLEND</code></td> 
	 *     <td>Activates blending of the computed fragment color values. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.blendFunc</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.CULL_FACE</code></td> 
	 *     <td>Activates culling of polygons. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.cullFace</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.DEPTH_TEST</code></td> 
	 *     <td>Activates [depth] comparisons and updates to the [depth] buffer. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.depthFunc</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.DITHER</code></td> 
	 *     <td>Activates dithering of color components before they get written to the
	 * color buffer.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.POLYGON_OFFSET_FILL</code></td> 
	 *     <td>Activates adding an offset to [depth] values of polygon's fragments. See
	 * <a rel="nofollow"><code>WebGLRenderingContext.polygonOffset</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.SAMPLE_ALPHA_TO_COVERAGE</code></td> 
	 *     <td>Activates the computation of a temporary coverage value determined by
	 * the [alpha] value.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.SAMPLE_COVERAGE</code></td> 
	 *     <td>Activates ANDing the fragment's coverage with the temporary coverage
	 * value. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.sampleCoverage</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.SCISSOR_TEST</code></td> 
	 *     <td>Activates the [scissor] test that discards fragments that are outside of
	 * the [scissor] rectangle. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.scissor</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.STENCIL_TEST</code></td> 
	 *     <td>Activates [stencil] testing and updates to the [stencil] buffer. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.stencilFunc</code></a>.</td> 
	 *    </tr> 
	 *   </tbody> 
	 *  </table>
	 */
	fun enable(cap: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext] method [enableVertexAttribArray], part of the WebGL
	 * API, turns on the generic vertex attribute array at the specified index into the
	 * list of attribute arrays. Note: You can [disable] the attribute array by calling
	 * [disableVertexAttribArray]. In WebGL, values that apply to a specific vertex are
	 * stored in attributes. These are only available to the JavaScript code and the
	 * vertex shader. Attributes are referenced by an index number into the list of
	 * attributes maintained by the GPU. Some vertex attribute indices may have
	 * predefined purposes, depending on the platform and/or the GPU. Others are
	 * assigned by the WebGL layer when you create the attributes. Either way, since
	 * attributes cannot be used unless enabled, and are disabled by default, you need
	 * to call [enableVertexAttribArray] to [enable] individual attributes so that they
	 * can be used. Once that's been done, other methods can be used to access the
	 * attribute, including [vertexAttribPointer], `vertexAttrib*`, and
	 * [getVertexAttrib].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/enableVertexAttribArray)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the index number that uniquely identifies the vertex attribute to [enable]. If you know the [name] of the attribute but not its index, you can get the index by calling [getAttribLocation].
	 */
	fun enableVertexAttribArray(index: GLuint)
	
	
	/**
	 *  The [WebGLRenderingContext].[finish] method of the WebGL API blocks execution
	 * until all previously called commands are finished.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/finish)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.11)
	 */
	fun finish()
	
	
	/**
	 *  The [WebGLRenderingContext].[flush] method of the WebGL API empties different
	 * buffer commands, causing all commands to be executed as quickly as possible.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/flush)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.11)
	 */
	fun flush()
	
	
	/**
	 *  The [WebGLRenderingContext].[framebufferRenderbuffer] method of the WebGL API
	 * attaches a [WebGLRenderbuffer] object to a [WebGLFramebuffer] object.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/framebufferRenderbuffer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.6)
	 *
	 * @param target A [GLenum] specifying the binding point (target) for the framebuffer.
	 * Possible values:
	 *  gl.FRAMEBUFFER
	 *  Collection buffer data storage of color, [alpha] [depth] and [stencil] buffers
	 * used to render an image.
	 * @param attachment A [GLenum] specifying the attachment point for the render buffer.
	 * Possible values:
	 *   *  gl.[COLOR_ATTACHMENT0] color buffer.
	 *   *  gl.[DEPTH_ATTACHMENT] [depth] buffer.
	 *   *  gl.[DEPTH_STENCIL_ATTACHMENT] [depth] and [stencil] buffer.
	 *   *  gl.[STENCIL_ATTACHMENT] [stencil] buffer.
	 * @param renderbuffertarget A [GLenum] specifying the binding point (target) for the render buffer.
	 * Possible values:
	 *  gl.RENDERBUFFER
	 *  Buffer data storage for single images in a renderable internal format.
	 * @param renderbuffer A [WebGLRenderbuffer] object to attach.
	 */
	fun framebufferRenderbuffer(target: GLenum, attachment: GLenum, renderbuffertarget: GLenum, renderbuffer: WebGLRenderbuffer?)
	
	
	/**
	 *  The [WebGLRenderingContext].[framebufferTexture2D] method of the WebGL API
	 * attaches a texture to a [WebGLFramebuffer].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/framebufferTexture2D)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.6)
	 *
	 * @param target A [GLenum] specifying the binding point (target).
	 * Possible values:
	 *  gl.FRAMEBUFFER
	 *  Collection buffer data storage of color, [alpha] [depth] and [stencil] buffers
	 * used to render an image.
	 * @param attachment A [GLenum] specifying the attachment point for the texture.
	 * Possible values:
	 *   *  gl.[COLOR_ATTACHMENT0] Attaches the texture to the framebuffer's color
	 * buffer.
	 *   *  gl.[DEPTH_ATTACHMENT] Attaches the texture to the framebuffer's [depth]
	 * buffer.
	 *   *  gl.[STENCIL_ATTACHMENT] Attaches the texture to the framebuffer's [stencil]
	 * buffer.
	 * @param textarget A [GLenum] specifying the texture target.
	 * Possible values:
	 *   *  gl.[TEXTURE_2D] A 2D image.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_X] Image for the positive X face of the cube.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_X] Image for the negative X face of the cube.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Y] Image for the positive Y face of the cube.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Y] Image for the negative Y face of the cube.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Z] Image for the positive Z face of the cube.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Z] Image for the negative Z face of the cube.
	 * @param texture A [WebGLTexture] object whose image to attach.
	 * @param level A [GLint] specifying the mipmap level of the texture image to be attached. Must be 0.
	 */
	fun framebufferTexture2D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: WebGLTexture?, level: GLint)
	
	
	/**
	 *  The [WebGLRenderingContext].[frontFace] method of the WebGL API specifies
	 * whether polygons are front- or back-facing by setting a winding orientation.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/frontFace)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param mode A [GLenum] [type] winding orientation. The default value is gl.[CCW].
	 * Possible values:
	 *   *  gl.[CW] Clock-wise winding.
	 *   *  gl.[CCW] Counter-clock-wise winding.
	 */
	fun frontFace(mode: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[generateMipmap] method of the WebGL API generates
	 * a set of mipmaps for a [WebGLTexture] object. Mipmaps are used to create
	 * distance with objects. A higher-resolution mipmap is used for objects that are
	 * closer, and a lower-resolution mipmap is used for objects that are farther away.
	 * It starts with the resolution of the texture image and halves the resolution
	 * until a 1x1 dimension texture image is created.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/generateMipmap)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.8)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture whose mipmaps will be generated.
	 * Possible values:
	 *   *  gl.[TEXTURE_2D] A two-dimensional texture.
	 *   *  gl.[TEXTURE_CUBE_MAP] A cube-mapped texture.
	 */
	fun generateMipmap(target: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[getActiveAttrib] method of the WebGL API returns a
	 * [WebGLActiveInfo] object containing [size] [type] and [name] of a vertex
	 * attribute. It is generally used when querying unknown attributes either for
	 * debugging or generic library creation.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getActiveAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param program A [WebGLProgram] containing the vertex attribute.
	 * @param index A [GLuint] specifying the index of the vertex attribute to get. This value is an index 0 to N - 1 as returned by gl.getProgramParameter(program, gl.[ACTIVE_ATTRIBUTES].
	 */
	fun getActiveAttrib(program: WebGLProgram?, index: GLuint): WebGLActiveInfo?
	
	
	/**
	 *  The [WebGLRenderingContext].[getActiveUniform] method of the WebGL API returns
	 * a [WebGLActiveInfo] object containing [size] [type] and [name] of a uniform
	 * attribute. It is generally used when querying unknown uniforms either for
	 * debugging or generic library creation.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getActiveUniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param program A [WebGLProgram] specifying the WebGL shader program from which to obtain the uniform variable's information.
	 * @param index A [GLuint] specifying the index of the uniform attribute to get. This value is an index 0 to N - 1 as returned by gl.getProgramParameter(program, gl.[ACTIVE_UNIFORMS].
	 */
	fun getActiveUniform(program: WebGLProgram?, index: GLuint): WebGLActiveInfo?
	
	
	/**
	 *  The [WebGLRenderingContext].[getAttachedShaders] method of the WebGL API
	 * returns a list of [WebGLShader] objects attached to a [WebGLProgram].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getAttachedShaders)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param program A [WebGLProgram] object to get attached shaders for.
	 */
	fun getAttachedShaders(program: WebGLProgram?): List<WebGLShader>?
	
	
	/**
	 *  The [WebGLRenderingContext].[getAttribLocation] method of the WebGL API returns
	 * the location of an attribute variable in a given [WebGLProgram].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getAttribLocation)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param program A [WebGLProgram] containing the attribute variable.
	 * @param name A string specifying the [name] of the attribute variable whose location to get.
	 */
	fun getAttribLocation(program: WebGLProgram?, name: DOMString): GLint
	
	
	/**
	 *  The [WebGLRenderingContext].[getBufferParameter] method of the WebGL API
	 * returns information about the buffer.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getBufferParameter)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.5)
	 *
	 * @param target A [GLenum] specifying the target buffer object.
	 * Possible values:
	 *  gl.ARRAY_BUFFER
	 *  Buffer containing vertex attributes, such as vertex coordinates, texture
	 * coordinate data, or vertex color data.
	 *  gl.ELEMENT_ARRAY_BUFFER
	 *  Buffer used for element indices.
	 * @param pname A [GLenum] specifying information to query.
	 * Possible values:
	 *  gl.BUFFER_SIZE
	 *  Returns a [GLint] indicating the [size] of the buffer in bytes.
	 *  gl.BUFFER_USAGE
	 *  Returns a [GLenum] indicating the usage pattern of the buffer. One of the
	 * following:
	 *   *  gl.[STATIC_DRAW]
	 *   *  gl.[DYNAMIC_DRAW]
	 *   *  gl.[STREAM_DRAW]
	 */
	fun getBufferParameter(target: GLenum, pname: GLenum): Any
	
	
	/**
	 *  The [WebGLRenderingContext].[getParameter] method of the WebGL API returns a
	 * value for the passed parameter [name].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getParameter)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param pname A [GLenum] specifying which parameter value to return. See below for possible values.
	 */
	fun getParameter(pname: GLenum): Any
	
	
	/**
	 *  The [WebGLRenderingContext].[getError] method of the WebGL API returns error
	 * information.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getError)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 */
	fun getError(): GLenum
	
	
	/**
	 *  The [WebGLRenderingContext].[getFramebufferAttachmentParameter] method of the
	 * WebGL API returns information about a framebuffer's attachment.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getFramebufferAttachmentParameter)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.6)
	 *
	 * @param target A [GLenum] specifying the binding point (target).
	 * Possible values:
	 *  gl.FRAMEBUFFER
	 *  Collection buffer data storage of color, [alpha] [depth] and [stencil] buffers
	 * used to render an image.
	 * @param attachment A [GLenum] specifying the attachment point for the texture.
	 * Possible values:
	 *   *  gl.[COLOR_ATTACHMENT0] Texture attachment for the framebuffer's color
	 * buffer.
	 *   *  gl.[DEPTH_ATTACHMENT] Texture attachment for the framebuffer's [depth]
	 * buffer.
	 *   *  gl.[STENCIL_ATTACHMENT] Texture attachment for the framebuffer's [stencil]
	 * buffer.
	 *   *  gl.[DEPTH_STENCIL_ATTACHMENT] Texture attachment for both, the [depth] and
	 * [stencil] buffer.
	 * @param pname A [GLenum] specifying information to query.
	 * Possible values:
	 *   *  gl.[FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE] The [type] which contains the
	 * attached image.
	 *   *  gl.[FRAMEBUFFER_ATTACHMENT_OBJECT_NAME] The texture or renderbuffer of the
	 * attached image [WebGLRenderbuffer] or [WebGLTexture].
	 *   *  gl.[FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL] Mipmap level. Default value: 0.
	 *   *  gl.[FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE] The [name] of cube-map
	 * face of the texture.
	 *  When using the EXT_sRGB extension:
	 *
	 *   *  ext.FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: The framebuffer color
	 * encoding.
	 */
	fun getFramebufferAttachmentParameter(target: GLenum, attachment: GLenum, pname: GLenum): Any
	
	
	/**
	 *  The [WebGLRenderingContext].[getProgramParameter] method of the WebGL API
	 * returns information about the given program.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getProgramParameter)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param program A [WebGLProgram] to get parameter information from.
	 * @param pname A [GLenum] specifying the information to query.
	 * Possible values:
	 *  gl.DELETE_STATUS
	 *  Returns a [GLboolean] indicating whether or not the program is flagged for
	 * deletion.
	 *  gl.LINK_STATUS
	 *  Returns a [GLboolean] indicating whether or not the last link operation was
	 * successful.
	 *  gl.VALIDATE_STATUS
	 *  Returns a [GLboolean] indicating whether or not the last validation operation
	 * was successful.
	 *  gl.ATTACHED_SHADERS
	 *  Returns a [GLint] indicating the number of attached shaders to a program.
	 *  gl.ACTIVE_ATTRIBUTES
	 *  Returns a [GLint] indicating the number of active attribute variables to a
	 * program.
	 *  gl.ACTIVE_UNIFORMS
	 *  Returns a [GLint] indicating the number of active uniform variables to a
	 * program.
	 */
	fun getProgramParameter(program: WebGLProgram?, pname: GLenum): Any
	
	
	/**
	 *  The [WebGLRenderingContext].[getProgramInfoLog] returns the information log for
	 * the specified [WebGLProgram] object. It contains errors that occurred during
	 * failed linking or validation of [WebGLProgram] objects.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getProgramInfoLog)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param program The [WebGLProgram] to query.
	 */
	fun getProgramInfoLog(program: WebGLProgram?): DOMString?
	
	
	/**
	 *  The [WebGLRenderingContext].[getRenderbufferParameter] method of the WebGL API
	 * returns information about the renderbuffer.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getRenderbufferParameter)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.7)
	 *
	 * @param target A [GLenum] specifying the target renderbuffer object.
	 * Possible values:
	 *  gl.RENDERBUFFER
	 *  Buffer data storage for single images in a renderable internal format.
	 * @param pname A [GLenum] specifying the information to query.
	 * Possible values:
	 *  gl.RENDERBUFFER_WIDTH
	 *  Returns a [GLint] indicating the width of the image of the currently bound
	 * renderbuffer.
	 *  gl.RENDERBUFFER_HEIGHT
	 *  Returns a [GLint] indicating the height of the image of the currently bound
	 * renderbuffer.
	 *  gl.RENDERBUFFER_INTERNAL_FORMAT
	 *  Returns a [GLenum] indicating the internal format of the currently bound
	 * renderbuffer. The default is gl.[RGBA4]. Possible return values:
	 *   *  gl.[RGBA4] 4 red bits, 4 green bits, 4 blue bits 4 [alpha] bits.
	 *   *  gl.[RGB565] 5 red bits, 6 green bits, 5 blue bits.
	 *   *  gl.[RGB5_A1] 5 red bits, 5 green bits, 5 blue bits, 1 [alpha] bit.
	 *   *  gl.[DEPTH_COMPONENT16] 16 [depth] bits.
	 *   *  gl.[STENCIL_INDEX8] 8 [stencil] bits.
	 *  gl.RENDERBUFFER_GREEN_SIZE
	 *  Returns a [GLint] that is the resolution [size] (in bits) for the green color.
	 *  gl.RENDERBUFFER_BLUE_SIZE
	 *  Returns a [GLint] that is the resolution [size] (in bits) for the blue color.
	 *  gl.RENDERBUFFER_RED_SIZE
	 *  Returns a [GLint] that is the resolution [size] (in bits) for the red color.
	 *  gl.RENDERBUFFER_ALPHA_SIZE
	 *  Returns a [GLint] that is the resolution [size] (in bits) for the [alpha]
	 * component.
	 *  gl.RENDERBUFFER_DEPTH_SIZE
	 *  Returns a [GLint] that is the resolution [size] (in bits) for the [depth]
	 * component.
	 *  gl.RENDERBUFFER_STENCIL_SIZE
	 *  Returns a [GLint] that is the resolution [size] (in bits) for the [stencil]
	 * component.
	 */
	fun getRenderbufferParameter(target: GLenum, pname: GLenum): Any
	
	
	/**
	 *  The [WebGLRenderingContext].[getShaderParameter] method of the WebGL API
	 * returns information about the given shader.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderParameter)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param shader A [WebGLShader] to get parameter information from.
	 * @param pname A [GLenum] specifying the information to query.
	 * Possible values:
	 *  gl.DELETE_STATUS
	 *  Returns a [GLboolean] indicating whether or not the shader is flagged for
	 * deletion.
	 *  gl.COMPILE_STATUS
	 *  Returns a [GLboolean] indicating whether or not the last shader compilation was
	 * successful.
	 *  gl.SHADER_TYPE
	 *  Returns a [GLenum] indicating whether the shader is a vertex shader
	 * (gl.[VERTEX_SHADER] or fragment shader (gl.[FRAGMENT_SHADER] object.
	 */
	fun getShaderParameter(shader: WebGLShader?, pname: GLenum): Any
	
	
	/**
	 *  The [WebGLRenderingContext].[getShaderPrecisionFormat] method of the WebGL API
	 * returns a new [WebGLShaderPrecisionFormat] object describing the range and
	 * [precision] for the specified shader numeric format.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderPrecisionFormat)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param shadertype Either a gl.[FRAGMENT_SHADER] or a gl.[VERTEX_SHADER].
	 * @param precisiontype A [precision] [type] value. Either gl.[LOW_FLOAT] gl.[MEDIUM_FLOAT] gl.[HIGH_FLOAT] gl.[LOW_INT] gl.[MEDIUM_INT] or gl.[HIGH_INT].
	 */
	fun getShaderPrecisionFormat(shadertype: GLenum, precisiontype: GLenum): WebGLShaderPrecisionFormat?
	
	
	/**
	 *  The [WebGLRenderingContext].[getShaderInfoLog] returns the information log for
	 * the specified [WebGLShader] object. It contains warnings, debugging and compile
	 * information.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderInfoLog)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param shader A [WebGLShader] to query.
	 */
	fun getShaderInfoLog(shader: WebGLShader?): DOMString?
	
	
	/**
	 *  The [WebGLRenderingContext].[getShaderSource] method of the WebGL API returns
	 * the source code of a [WebGLShader] as a string.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderSource)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param shader A [WebGLShader] object to get the source code from.
	 */
	fun getShaderSource(shader: WebGLShader?): DOMString?
	
	
	/**
	 *  The [WebGLRenderingContext].[getTexParameter] method of the WebGL API returns
	 * information about the given texture.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getTexParameter)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.8)
	 *
	 * @param target A [GLenum] specifying the binding point (target).
	 * Possible values:
	 *   *  gl.[TEXTURE_2D] A two-dimensional texture.
	 *   *  gl.[TEXTURE_CUBE_MAP] A cube-mapped texture.
	 * @param pname A [GLenum] specifying the information to query.
	 * Possible values:
	 *  <table> 
	 *   <thead> 
	 *    <tr> 
	 *     <th>pname</th> 
	 *     <th>Return type</th> 
	 *     <th>Description</th> 
	 *     <th>Possible return values</th> 
	 *    </tr> 
	 *   </thead> 
	 *   <tbody> 
	 *    <tr> 
	 *     <th colspan="4">Available in a WebGL 1 context</th> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.TEXTURE_MAG_FILTER</code></td> 
	 *     <td><a title="GLenum" rel="nofollow"><code>GLenum</code></a></td> 
	 *     <td>Texture magnification filter</td> 
	 *     <td><code>gl.LINEAR</code> (default value), <code>gl.NEAREST</code>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.TEXTURE_MIN_FILTER</code></td> 
	 *     <td><a title="GLenum" rel="nofollow"><code>GLenum</code></a></td> 
	 *     <td>Texture minification filter</td> 
	 *     <td><code>gl.LINEAR</code>, <code>gl.NEAREST</code>,
	 * <code>gl.NEAREST_MIPMAP_NEAREST</code>, <code>gl.LINEAR_MIPMAP_NEAREST</code>,
	 * <code>gl.NEAREST</code>_MIPMAP_LINEAR (default value),
	 * <code>gl.LINEAR_MIPMAP_LINEAR</code>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.TEXTURE_WRAP_S</code></td> 
	 *     <td><a title="GLenum" rel="nofollow"><code>GLenum</code></a></td> 
	 *     <td>Wrapping function for texture coordinate <code>s</code></td> 
	 *     <td><code>gl.REPEAT</code> (default value), <code>gl.CLAMP_TO_EDGE</code>,
	 * <code>gl.MIRRORED_REPEAT</code>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.TEXTURE_WRAP_T</code></td> 
	 *     <td><a title="GLenum" rel="nofollow"><code>GLenum</code></a></td> 
	 *     <td>Wrapping function for texture coordinate <code>t</code></td> 
	 *     <td><code>gl.REPEAT</code> (default value), <code>gl.CLAMP_TO_EDGE</code>,
	 * <code>gl.MIRRORED_REPEAT</code>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <th colspan="4">Additionally available when using the <a
	 * rel="nofollow"><code>EXT_texture_filter_anisotropic</code></a> extension</th> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>ext.TEXTURE_MAX_ANISOTROPY_EXT</code></td> 
	 *     <td><a title="GLfloat" rel="nofollow"><code>GLfloat</code></a></td> 
	 *     <td>Maximum anisotropy for a texture</td> 
	 *     <td>Any float values.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <th colspan="4">Additionally available when using a WebGL 2 context</th> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.TEXTURE_BASE_LEVEL</code></td> 
	 *     <td><a title="GLint" rel="nofollow"><code>GLint</code></a></td> 
	 *     <td>Texture mipmap level</td> 
	 *     <td>Any int values.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.TEXTURE_COMPARE_FUNC</code></td> 
	 *     <td><a title="GLenum" rel="nofollow"><code>GLenum</code></a></td> 
	 *     <td>Comparison function</td> 
	 *     <td><code>gl.LEQUAL</code> (default value), <code>gl.GEQUAL</code>,
	 * <code>gl.LESS</code>, <code>gl.GREATER</code>, <code>gl.EQUAL</code>,
	 * <code>gl.NOTEQUAL</code>, <code>gl.ALWAYS</code>, <code>gl.NEVER</code>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.TEXTURE_COMPARE_MODE</code></td> 
	 *     <td><a title="GLenum" rel="nofollow"><code>GLenum</code></a></td> 
	 *     <td>Texture comparison mode</td> 
	 *     <td><code>gl.NONE</code> (default value),
	 * <code>gl.COMPARE_REF_TO_TEXTURE</code>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.TEXTURE_IMMUTABLE_FORMAT</code></td> 
	 *     <td><a title="GLboolean" rel="nofollow"><code>GLboolean</code></a></td> 
	 *     <td>Immutability of the texture format and size</td> 
	 *     <td>true or false.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.TEXTURE_IMMUTABLE_LEVELS</code></td> 
	 *     <td><a title="GLuint" rel="nofollow"><code>GLuint</code></a></td> 
	 *     <td>?</td> 
	 *     <td>Any uint values.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.TEXTURE_MAX_LEVEL</code></td> 
	 *     <td><a title="GLint" rel="nofollow"><code>GLint</code></a></td> 
	 *     <td>Maximum texture mipmap array level</td> 
	 *     <td>Any int values.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.TEXTURE_MAX_LOD</code></td> 
	 *     <td><a title="GLfloat" rel="nofollow"><code>GLfloat</code></a></td> 
	 *     <td>Texture maximum level-of-detail value</td> 
	 *     <td>Any float values.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.TEXTURE_MIN_LOD</code></td> 
	 *     <td><a title="GLfloat" rel="nofollow"><code>GLfloat</code></a></td> 
	 *     <td>Texture minimum level-of-detail value</td> 
	 *     <td>Any float values.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.TEXTURE_WRAP_R</code></td> 
	 *     <td><a title="GLenum" rel="nofollow"><code>GLenum</code></a></td> 
	 *     <td>Wrapping function for texture coordinate <code>r</code></td> 
	 *     <td><code>gl.REPEAT</code> (default value), <code>gl.CLAMP_TO_EDGE</code>,
	 * <code>gl.MIRRORED_REPEAT</code>.</td> 
	 *    </tr> 
	 *   </tbody> 
	 *  </table>
	 */
	fun getTexParameter(target: GLenum, pname: GLenum): Any
	
	
	/**
	 *  The [WebGLRenderingContext].[getUniform] method of the WebGL API returns the
	 * value of a uniform variable at a given location.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getUniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param program A [WebGLProgram] containing the uniform attribute.
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to get.
	 */
	fun getUniform(program: WebGLProgram?, location: WebGLUniformLocation?): Any
	
	
	/**
	 *  Part of the WebGL API, the [WebGLRenderingContext] method [getUniformLocation]
	 * returns the location of a specific uniform variable which is part of a given
	 * [WebGLProgram]. The uniform variable is returned as a [WebGLUniformLocation]
	 * object, which is an opaque identifier used to specify where in the GPU's memory
	 * that uniform variable is located. Once you have the uniform's location, you
	 * caccess the uniform itself using one of the other uniform access methods,
	 * passing in the uniform location as one of the inputs: The uniform itself is
	 * declared in the shader program using GLSL.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getUniformLocation)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param program The [WebGLProgram] in which to locate the specified uniform variable.
	 * @param name A string specifying the [name] of the uniform variable whose location is to be returned. The [name] can't have any whitespace in it, and you can't use this function to get the location of any uniforms starting with the reserved string "gl_", since those are internal to the WebGL layer.
	 *  The possible values correspond to the uniform names returned by
	 * [getActiveUniform] see that function for specifics on how declared uniforms map
	 * to uniform location names.
	 *  Additionally, for uniforms declared as arrays, the following names are also
	 * valid:
	 *   *  The uniform [name] without the [0] suffix. E.g. the location returned for
	 * arrayUniform is equivalent to the one for arrayUniform[0].
	 *   *  The uniform [name] indexed with an integer. E.g. the location returned for
	 * arrayUniform[2] would point directly to the third entry of the arrayUniform
	 * uniform.
	 */
	fun getUniformLocation(program: WebGLProgram?, name: DOMString): WebGLUniformLocation?
	
	
	/**
	 *  The [WebGLRenderingContext].[getVertexAttrib] method of the WebGL API returns
	 * information about a vertex attribute at a given position.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getVertexAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the index of the vertex attribute.
	 * @param pname A [GLenum] specifying the information to query.
	 * Possible values:
	 *  gl.VERTEX_ATTRIB_ARRAY_BUFFER_BINDING
	 *  Returns the currently bound [WebGLBuffer].
	 *  gl.VERTEX_ATTRIB_ARRAY_ENABLED
	 *  Returns a [GLboolean] that is true if the vertex attribute is enabled at this
	 * index. Otherwise false.
	 *  gl.VERTEX_ATTRIB_ARRAY_SIZE
	 *  Returns a [GLint] indicating the [size] of an element of the vertex array.
	 *  gl.VERTEX_ATTRIB_ARRAY_STRIDE
	 *  Returns a [GLint] indicating the number of bytes between successive elements in
	 * the array. 0 means that the elements are sequential.
	 *  gl.VERTEX_ATTRIB_ARRAY_TYPE
	 *  Returns a [GLenum] representing the array [type]. One of
	 *   *  gl.[BYTE]
	 *   *  gl.[UNSIGNED_BYTE]
	 *   *  gl.[SHORT]
	 *   *  gl.[UNSIGNED_SHORT]
	 *   *  gl.FLOAT
	 *  gl.VERTEX_ATTRIB_ARRAY_NORMALIZED
	 *  Returns a [GLboolean] that is true if fixed-point data types are normalized for
	 * the vertex attribute array at the given index.
	 *  gl.CURRENT_VERTEX_ATTRIB
	 *  Returns a [Float32Array] (with 4 elements) representing the current value of
	 * the vertex attribute at the given index.
	 */
	fun getVertexAttrib(index: GLuint, pname: GLenum): Any
	
	
	/**
	 *  The [WebGLRenderingContext].[getVertexAttribOffset] method of the WebGL API
	 * returns the address of a specified vertex attribute.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getVertexAttribOffset)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the index of the vertex attribute.
	 * @param pname A [GLenum] which must be gl.[VERTEX_ATTRIB_ARRAY_POINTER].
	 */
	fun getVertexAttribOffset(index: GLuint, pname: GLenum): GLsizeiptr
	
	
	/**
	 *  The [WebGLRenderingContext].[hint] method of the WebGL API specifies hints for
	 * certain behaviors. The interpretation of these hints depend on the
	 * implementation.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/hint)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param target Sets which behavior to be controlled.
	 * Possible values:
	 *  gl.GENERATE_MIPMAP_HINT
	 *  Quality of filtering when generating mipmap images with
	 * [WebGLRenderingContext].[generateMipmap].
	 *  When using the OES_standard_derivatives extension:
	 *
	 *  ext.FRAGMENT_SHADER_DERIVATIVE_HINT_OES
	 *  Accuracy of the derivative calculation for the GLSL built-in functions: dFdx,
	 * dFdy, and fwidth.
	 * @param mode Sets the behavior. The default value is gl.[DONT_CARE]. The possible values are:
	 *   *  gl.[FASTEST] The most efficient behavior should be used.
	 *   *  gl.[NICEST] The most correct or the highest quality option should be used.
	 *   *  gl.[DONT_CARE] There is no preference for this behavior.
	 */
	fun hint(target: GLenum, mode: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[isBuffer] method of the WebGL API returns `true`
	 * if the passed [WebGLBuffer] is valid and `false` otherwise.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isBuffer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.5)
	 *
	 * @param buffer A [WebGLBuffer] to check.
	 */
	fun isBuffer(buffer: WebGLBuffer?): GLboolean
	
	
	/**
	 *  The [WebGLRenderingContext].[isEnabled] method of the WebGL API tests whether a
	 * specific WebGL capability is enabled or not for this context. By default, all
	 * capabilities except `gl.[DITHER] are disabled.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isEnabled)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param cap A [GLenum] specifying which WebGL capability to test.
	 * Possible values:
	 *  <table> 
	 *   <thead> 
	 *    <tr> 
	 *     <th>Constant</th> 
	 *     <th>Description</th> 
	 *    </tr> 
	 *   </thead> 
	 *   <tbody> 
	 *    <tr> 
	 *     <td><code>gl.BLEND</code></td> 
	 *     <td>Blending of the computed fragment color values. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.blendFunc</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.CULL_FACE</code></td> 
	 *     <td>Culling of polygons. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.cullFace</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.DEPTH_TEST</code></td> 
	 *     <td>Depth comparisons and updates to the [depth] buffer. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.depthFunc</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.DITHER</code></td> 
	 *     <td>Dithering of color components before they get written to the color
	 * buffer.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.POLYGON_OFFSET_FILL</code></td> 
	 *     <td>Adding an offset to [depth] values of polygon's fragments. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.polygonOffset</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.SAMPLE_ALPHA_TO_COVERAGE</code></td> 
	 *     <td>Computation of a temporary coverage value determined by the [alpha]
	 * value.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.SAMPLE_COVERAGE</code></td> 
	 *     <td>ANDing the fragment's coverage with the temporary coverage value. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.sampleCoverage</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.SCISSOR_TEST</code></td> 
	 *     <td>Scissor test that discards fragments that are outside of the [scissor]
	 * rectangle. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.scissor</code></a>.</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td><code>gl.STENCIL_TEST</code></td> 
	 *     <td>Stencil testing and updates to the [stencil] buffer. See <a
	 * rel="nofollow"><code>WebGLRenderingContext.stencilFunc</code></a>.</td> 
	 *    </tr> 
	 *   </tbody> 
	 *  </table>
	 */
	fun isEnabled(cap: GLenum): GLboolean
	
	
	/**
	 *  The [WebGLRenderingContext].[isFramebuffer] method of the WebGL API returns
	 * `true` if the passed [WebGLFramebuffer] is valid and `false` otherwise.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isFramebuffer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.6)
	 *
	 * @param framebuffer A [WebGLFramebuffer] to check.
	 */
	fun isFramebuffer(framebuffer: WebGLFramebuffer?): GLboolean
	
	
	/**
	 *  The [WebGLRenderingContext].[isProgram] method of the WebGL API returns `true`
	 * if the passed [WebGLProgram] is valid, `false` otherwise.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isProgram)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param program A [WebGLProgram] to check.
	 */
	fun isProgram(program: WebGLProgram?): GLboolean
	
	
	/**
	 *  The [WebGLRenderingContext].[isRenderbuffer] method of the WebGL API returns
	 * `true` if the passed [WebGLRenderbuffer] is valid and `false` otherwise.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isRenderbuffer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.7)
	 *
	 * @param renderbuffer A [WebGLRenderbuffer] to check.
	 */
	fun isRenderbuffer(renderbuffer: WebGLRenderbuffer?): GLboolean
	
	
	/**
	 *  The [WebGLRenderingContext].[isShader] method of the WebGL API returns `true`
	 * if the passed [WebGLShader] is valid, `false` otherwise.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isShader)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param shader A [WebGLShader] to check.
	 */
	fun isShader(shader: WebGLShader?): GLboolean
	
	
	/**
	 *  The [WebGLRenderingContext].[isTexture] method of the WebGL API returns `true`
	 * if the passed [WebGLTexture] is valid and `false` otherwise.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isTexture)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.8)
	 *
	 * @param texture A [WebGLTexture] to check.
	 */
	fun isTexture(texture: WebGLTexture?): GLboolean
	
	
	/**
	 *  The [WebGLRenderingContext].[lineWidth] method of the WebGL API sets the line
	 * width of rasterized lines. Warning: The webgl spec, based on the OpenGL ES
	 * 2.0/3.0 specs points out that the minimum and maximum width for a line is
	 * implementation defined. The maximum minimum width is allowed to be 1.0. The
	 * minimum maximum width is also allowed to be 1.0. Because of these implementation
	 * defined limits it is not recommended to use line widths other than 1.0 since
	 * there is no guarantee any user's browser will display any other width. As of
	 * January 2017 most implementations of WebGL only support a minimum of 1 and a
	 * maximum of 1 as the technology they are based on has these same limits.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/lineWidth)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param width A [GLfloat] specifying the width of rasterized lines. Default value: 1.
	 */
	fun lineWidth(width: GLfloat)
	
	
	/**
	 *  The [WebGLRenderingContext] interface's [linkProgram] method links a given
	 * [WebGLProgram], completing the process of preparing the GPU code for the
	 * program's fragment and vertex shaders.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/linkProgram)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param program The [WebGLProgram] to link.
	 */
	fun linkProgram(program: WebGLProgram?)
	
	
	/**
	 *  The [WebGLRenderingContext].[pixelStorei] method of the WebGL API specifies the
	 * pixel storage modes.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/pixelStorei)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param pname A [GLenum] specifying which parameter to set. See below for possible values.
	 * @param param A [GLint] specifying a value to set the pname parameter to. See below for possible values.
	 */
	fun pixelStorei(pname: GLenum, param: GLint)
	
	
	/**
	 *  The [WebGLRenderingContext].[polygonOffset] method of the WebGL API specifies
	 * the scale factors and units to calculate [depth] values. The offset is added
	 * before the [depth] test is performed and before the value is written into the
	 * [depth] buffer.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/polygonOffset)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param factor A [GLfloat] which sets the scale factor for the variable [depth] offset for each polygon. The default value is 0.
	 * @param units A [GLfloat] which sets the multiplier by which an implementation-specific value is multiplied with to create a constant [depth] offset. The default value is 0.
	 */
	fun polygonOffset(factor: GLfloat, units: GLfloat)
	
	
	/**
	 *  The [WebGLRenderingContext].[readPixels] method of the WebGL API reads a block
	 * of pixels from a specified rectangle of the current color framebuffer into a
	 * [TypedArray] or a [DataView] object.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.12)
	 *
	 * @param x A [GLint] specifying the first horizontal pixel that is read from the lower left corner of a rectangular block of pixels.
	 * @param y A [GLint] specifying the first vertical pixel that is read from the lower left corner of a rectangular block of pixels.
	 * @param width A [GLsizei] specifying the width of the rectangle.
	 * @param height A [GLsizei] specifying the height of the rectangle.
	 * @param format A [GLenum] specifying the format of the pixel data.
	 * Possible values:
	 *  gl.ALPHA
	 *  Discards the red, green and blue components and reads the [alpha] component.
	 *  gl.RGB
	 *  Discards the [alpha] components and reads the red, green and blue components.
	 *  gl.RGBA
	 *  Red, green, blue and [alpha] components are read from the color buffer.
	 *  WebGL2 adds
	 *   *  gl.RED
	 *   *  gl.RG
	 *   *  gl.RED_INTEGER
	 *   *  gl.RG_INTEGER
	 *   *  gl.RGB_INTEGER
	 *   *  gl.RGBA_INTEGER
	 * @param type A [GLenum] specifying the data [type] of the pixel data.
	 * Possible values:
	 *   *  gl.[UNSIGNED_BYTE]
	 *   *  gl.[UNSIGNED_SHORT_5_6_5]
	 *   *  gl.[UNSIGNED_SHORT_4_4_4_4]
	 *   *  gl.[UNSIGNED_SHORT_5_5_5_1]
	 *   *  gl.FLOAT
	 *  WebGL2 adds
	 *   *  gl.[BYTE]
	 *   *  gl.UNSIGNED_INT_2_10_10_10_REV
	 *   *  gl.HALF_FLOAT
	 *   *  gl.[SHORT]
	 *   *  gl.[UNSIGNED_SHORT]
	 *   *  gl.[INT]
	 *   *  gl.[UNSIGNED_INT]
	 *   *  gl.UNSIGNED_INT_10F_11F_11F_REV
	 *   *  gl.UNSIGNED_INT_5_9_9_9_REV
	 * @param pixels An object to read data into. The array [type] must match the [type] of the [type] parameter:
	 *   *  Uint8Array for gl.[UNSIGNED_BYTE].
	 *   *  Uint16Array for gl.[UNSIGNED_SHORT_5_6_5] gl.[UNSIGNED_SHORT_4_4_4_4] or
	 * gl.[UNSIGNED_SHORT_5_5_5_1].
	 *   *  [Float32Array] for gl.[FLOAT].
	 */
	fun readPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: ArrayBufferView?)
	
	
	/**
	 *  The [WebGLRenderingContext].[renderbufferStorage] method of the WebGL API
	 * creates and initializes a renderbuffer object's data store.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/renderbufferStorage)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.7)
	 *
	 * @param target A [GLenum] specifying the target renderbuffer object.
	 * Possible values:
	 *  gl.RENDERBUFFER
	 *  Buffer data storage for single images in a renderable internal format.
	 * @param internalformat A [GLenum] specifying the internal format of the renderbuffer.
	 * Possible values:
	 *   *  gl.[RGBA4] 4 red bits, 4 green bits, 4 blue bits 4 [alpha] bits.
	 *   *  gl.[RGB565] 5 red bits, 6 green bits, 5 blue bits.
	 *   *  gl.[RGB5_A1] 5 red bits, 5 green bits, 5 blue bits, 1 [alpha] bit.
	 *   *  gl.[DEPTH_COMPONENT16] 16 [depth] bits.
	 *   *  gl.[STENCIL_INDEX8] 8 [stencil] bits.
	 *   *  gl.[DEPTH_STENCIL]
	 * @param width A [GLsizei] specifying the width of the renderbuffer in pixels.
	 * @param height A [GLsizei] specifying the height of the renderbuffer in pixels.
	 */
	fun renderbufferStorage(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei)
	
	
	/**
	 *  The [WebGLRenderingContext].[sampleCoverage] method of the WebGL API specifies
	 * multi-sample coverage parameters for anti-aliasing effects.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/sampleCoverage)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param value A [GLclampf] which sets a single floating-point coverage value clamped to the range [0,1]. The default value is 1.0.
	 * @param invert A [GLboolean] which sets whether or not the coverage masks should be inverted. The default value is false.
	 */
	fun sampleCoverage(value: GLclampf, invert: GLboolean)
	
	
	/**
	 *  The [WebGLRenderingContext].[scissor] method of the WebGL API sets a [scissor]
	 * box, which limits the drawing to a specified rectangle.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/scissor)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.4)
	 *
	 * @param x A [GLint] specifying the horizontal coordinate for the lower left corner of the box. Default value: 0.
	 * @param y A [GLint] specifying the vertical coordinate for the lower left corner of the box. Default value: 0.
	 * @param width A non-negative [GLsizei] specifying the width of the [scissor] box. Default value: width of the [canvas].
	 * @param height A non-negative [GLsizei] specifying the height of the [scissor] box. Default value: height of the [canvas].
	 */
	fun scissor(x: GLint, y: GLint, width: GLsizei, height: GLsizei)
	
	
	/**
	 *  The [WebGLRenderingContext].[shaderSource] method of the WebGL API sets the
	 * source code of a [WebGLShader].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/shaderSource)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param shader A [WebGLShader] object in which to set the source code.
	 * @param source A string containing the GLSL source code to set.
	 */
	fun shaderSource(shader: WebGLShader?, source: DOMString)
	
	
	/**
	 *  The [WebGLRenderingContext].[stencilFunc] method of the WebGL API sets the
	 * front and back function and reference value for [stencil] testing. Stenciling
	 * enables and disables drawing on a per-pixel basis. It is typically used in
	 * multipass rendering to achieve special effects.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilFunc)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param func A [GLenum] specifying the test function. The default function is gl.[ALWAYS]. The possible values are:
	 *   *  gl.[NEVER] Never pass.
	 *   *  gl.[LESS] Pass if (ref & mask) < [stencil] & mask).
	 *   *  gl.[EQUAL] Pass if (ref & mask) = [stencil] & mask).
	 *   *  gl.[LEQUAL] Pass if (ref & mask) <= [stencil] & mask).
	 *   *  gl.[GREATER] Pass if (ref & mask) > [stencil] & mask).
	 *   *  gl.[NOTEQUAL] Pass if (ref & mask) !== [stencil] & mask).
	 *   *  gl.[GEQUAL] Pass if (ref & mask) >= [stencil] & mask).
	 *   *  gl.[ALWAYS] Always pass.
	 * @param ref A [GLint] specifying the reference value for the [stencil] test. This value is clamped to the range 0 to 2^n - 1 where n is the number of bitplanes in the [stencil] buffer. The default value is 0.
	 * @param mask A [GLuint] specifying a bit-wise mask that is used to AND the reference value and the stored [stencil] value when the test is done. The default value is all 1.
	 */
	fun stencilFunc(func: GLenum, ref: GLint, mask: GLuint)
	
	
	/**
	 *  The [WebGLRenderingContext].[stencilFuncSeparate] method of the WebGL API sets
	 * the front and/or back function and reference value for [stencil] testing.
	 * Stencilling enables and disables drawing on a per-pixel basis. It is typically
	 * used in multipass rendering to achieve special effects.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilFuncSeparate)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param face A [GLenum] specifying whether the front and/or back [stencil] state is updated. The possible values are:
	 *   *  gl.[FRONT]
	 *   *  gl.[BACK]
	 *   *  gl.[FRONT_AND_BACK]
	 * @param func A [GLenum] specifying the test function. The default function is gl.[ALWAYS]. The possible values are:
	 *   *  gl.[NEVER] Never pass.
	 *   *  gl.[LESS] Pass if (ref & mask) < [stencil] & mask).
	 *   *  gl.[EQUAL] Pass if (ref & mask) = [stencil] & mask).
	 *   *  gl.[LEQUAL] Pass if (ref & mask) <= [stencil] & mask).
	 *   *  gl.[GREATER] Pass if (ref & mask) > [stencil] & mask).
	 *   *  gl.[NOTEQUAL] Pass if (ref & mask) !== [stencil] & mask).
	 *   *  gl.[GEQUAL] Pass if (ref & mask) >= [stencil] & mask).
	 *   *  gl.[ALWAYS] Always pass.
	 * @param ref A [GLint] specifying the reference value for the [stencil] test. This value is clamped to the range 0 to 2^n - 1 where n is the number of bitplanes in the [stencil] buffer. The default value is 0.
	 * @param mask A [GLuint] specifying a bit-wise mask that is used to AND the reference value and the stored [stencil] value when the test is done. The default value is all 1.
	 */
	fun stencilFuncSeparate(face: GLenum, func: GLenum, ref: GLint, mask: GLuint)
	
	
	/**
	 *  The [WebGLRenderingContext].[stencilMask] method of the WebGL API controls
	 * enabling and disabling of both the front and back writing of individual bits in
	 * the [stencil] planes. The [WebGLRenderingContext].[stencilMaskSeparate] method
	 * can set front and back [stencil] writemasks to different values.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilMask)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param mask A [GLuint] specifying a bit mask to [enable] or [disable] writing of individual bits in the [stencil] planes. By default, the mask is all 1.
	 */
	fun stencilMask(mask: GLuint)
	
	
	/**
	 *  The [WebGLRenderingContext].[stencilMaskSeparate] method of the WebGL API
	 * controls enabling and disabling of front and/or back writing of individual bits
	 * in the [stencil] planes. The [WebGLRenderingContext].[stencilMask] method can
	 * set both, the front and back [stencil] writemasks to one value at the same time.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilMaskSeparate)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param face A [GLenum] specifying whether the front and/or back [stencil] writemask is updated. The possible values are:
	 *   *  gl.[FRONT]
	 *   *  gl.[BACK]
	 *   *  gl.[FRONT_AND_BACK]
	 * @param mask A [GLuint] specifying a bit mask to [enable] or [disable] writing of individual bits in the [stencil] planes. By default, the mask is all 1.
	 */
	fun stencilMaskSeparate(face: GLenum, mask: GLuint)
	
	
	/**
	 *  The [WebGLRenderingContext].[stencilOp] method of the WebGL API sets both the
	 * front and back-facing [stencil] test actions.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilOp)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param fail A [GLenum] specifying the function to use when the [stencil] test fails. The default value is gl.[KEEP].
	 * @param zfail A [GLenum] specifying the function to use when the [stencil] test passes, but the [depth] test fails. The default value is gl.[KEEP].
	 * @param zpass A [GLenum] specifying the function to use when both the [stencil] test and the [depth] test pass, or when the [stencil] test passes and there is no [depth] buffer or [depth] testing is disabled. The default value is gl.[KEEP].
	 */
	fun stencilOp(fail: GLenum, zfail: GLenum, zpass: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[stencilOpSeparate] method of the WebGL API sets
	 * the front and/or back-facing [stencil] test actions.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilOpSeparate)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.3)
	 *
	 * @param face A [GLenum] specifying whether the front and/or back [stencil] state is updated. The possible values are:
	 *   *  gl.[FRONT]
	 *   *  gl.[BACK]
	 *   *  gl.[FRONT_AND_BACK]
	 * @param fail A [GLenum] specifying the function to use when the [stencil] test fails. The default value is gl.[KEEP].
	 * @param zfail A [GLenum] specifying the function to use when the [stencil] test passes, but the [depth] test fails. The default value is gl.[KEEP].
	 * @param zpass A [GLenum] specifying the function to use when both the [stencil] test and the [depth] test pass, or when the [stencil] test passes and there is no [depth] buffer or [depth] testing is disabled. The default value is gl.[KEEP].
	 */
	fun stencilOpSeparate(face: GLenum, fail: GLenum, zfail: GLenum, zpass: GLenum)
	
	
	/**
	 *  The [WebGLRenderingContext].[texImage2D] method of the WebGL API specifies a
	 * two-dimensional texture image.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.8)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture.
	 * Possible values:
	 *   *  gl.[TEXTURE_2D] A two-dimensional texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_X] Positive X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_X] Negative X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Y] Positive Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Y] Negative Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Z] Positive Z face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Z] Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level *n* is the n-th mipmap reduction level.
	 * @param internalformat A [GLenum] specifying the color components in the texture.
	 *  Possible values in both WebGL1 and WebGL2
	 *  <table> 
	 *   <thead> 
	 *    <tr> 
	 *     <td>Format</td> 
	 *     <td>Type</td> 
	 *     <td>Channels</td> 
	 *     <td>Bytes per pixel</td> 
	 *    </tr> 
	 *   </thead> 
	 *   <tbody> 
	 *    <tr> 
	 *     <td>RGBA</td> 
	 *     <td>UNSIGNED_BYTE</td> 
	 *     <td>4</td> 
	 *     <td>4</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB</td> 
	 *     <td>UNSIGNED_BYTE</td> 
	 *     <td>3</td> 
	 *     <td>3</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA</td> 
	 *     <td>UNSIGNED_SHORT_4_4_4_4</td> 
	 *     <td>4</td> 
	 *     <td>2</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA</td> 
	 *     <td>UNSIGNED_SHORT_5_5_5_1</td> 
	 *     <td>4</td> 
	 *     <td>2</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB</td> 
	 *     <td>UNSIGNED_SHORT_5_6_5</td> 
	 *     <td>3</td> 
	 *     <td>2</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>LUMINANCE_ALPHA</td> 
	 *     <td>UNSIGNED_BYTE</td> 
	 *     <td>2</td> 
	 *     <td>2</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>LUMINANCE</td> 
	 *     <td>UNSIGNED_BYTE</td> 
	 *     <td>1</td> 
	 *     <td>1</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>ALPHA</td> 
	 *     <td>UNSIGNED_BYTE</td> 
	 *     <td>1</td> 
	 *     <td>1</td> 
	 *    </tr> 
	 *   </tbody> 
	 *  </table>
	 *  Other possible values in WebGL2 for the versions of [texImage2D] that take a
	 * [TypedArray] or a [DataView] or a [GLintptr] offset
	 *  <table> 
	 *   <thead> 
	 *    <tr> 
	 *     <td><strong>Sized<br /> Format</strong></td> 
	 *     <td><strong>Base<br /> Format</strong></td> 
	 *     <td><strong>R<br /> bits</strong></td> 
	 *     <td><strong>G<br /> bits</strong></td> 
	 *     <td><strong>B<br /> bits</strong></td> 
	 *     <td><strong>A<br /> bits</strong></td> 
	 *     <td><strong>Shared<br /> bits</strong></td> 
	 *     <td><strong>Color<br /> renderable</strong></td> 
	 *     <td><strong>Texture<br /> filterable</strong></td> 
	 *    </tr> 
	 *   </thead> 
	 *   <tbody> 
	 *    <tr> 
	 *     <td>R8</td> 
	 *     <td>RED</td> 
	 *     <td>8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R8_SNORM</td> 
	 *     <td>RED</td> 
	 *     <td>s8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG8</td> 
	 *     <td>RG</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG8_SNORM</td> 
	 *     <td>RG</td> 
	 *     <td>s8</td> 
	 *     <td>s8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB8</td> 
	 *     <td>RGB</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB8_SNORM</td> 
	 *     <td>RGB</td> 
	 *     <td>s8</td> 
	 *     <td>s8</td> 
	 *     <td>s8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB565</td> 
	 *     <td>RGB</td> 
	 *     <td>5</td> 
	 *     <td>6</td> 
	 *     <td>5</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA4</td> 
	 *     <td>RGBA</td> 
	 *     <td>4</td> 
	 *     <td>4</td> 
	 *     <td>4</td> 
	 *     <td>4</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB5_A1</td> 
	 *     <td>RGBA</td> 
	 *     <td>5</td> 
	 *     <td>5</td> 
	 *     <td>5</td> 
	 *     <td>1</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA8</td> 
	 *     <td>RGBA</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA8_SNORM</td> 
	 *     <td>RGBA</td> 
	 *     <td>s8</td> 
	 *     <td>s8</td> 
	 *     <td>s8</td> 
	 *     <td>s8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB10_A2</td> 
	 *     <td>RGBA</td> 
	 *     <td>10</td> 
	 *     <td>10</td> 
	 *     <td>10</td> 
	 *     <td>2</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB10_A2UI</td> 
	 *     <td>RGBA</td> 
	 *     <td>ui10</td> 
	 *     <td>ui10</td> 
	 *     <td>ui10</td> 
	 *     <td>ui2</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>SRGB8</td> 
	 *     <td>RGB</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>SRGB8_ALPHA8</td> 
	 *     <td>RGBA</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R16F</td> 
	 *     <td>RED</td> 
	 *     <td>f16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG16F</td> 
	 *     <td>RG</td> 
	 *     <td>f16</td> 
	 *     <td>f16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB16F</td> 
	 *     <td>RGB</td> 
	 *     <td>f16</td> 
	 *     <td>f16</td> 
	 *     <td>f16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA16F</td> 
	 *     <td>RGBA</td> 
	 *     <td>f16</td> 
	 *     <td>f16</td> 
	 *     <td>f16</td> 
	 *     <td>f16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R32F</td> 
	 *     <td>RED</td> 
	 *     <td>f32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG32F</td> 
	 *     <td>RG</td> 
	 *     <td>f32</td> 
	 *     <td>f32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB32F</td> 
	 *     <td>RGB</td> 
	 *     <td>f32</td> 
	 *     <td>f32</td> 
	 *     <td>f32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA32F</td> 
	 *     <td>RGBA</td> 
	 *     <td>f32</td> 
	 *     <td>f32</td> 
	 *     <td>f32</td> 
	 *     <td>f32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R11F_G11F_B10F</td> 
	 *     <td>RGB</td> 
	 *     <td>f11</td> 
	 *     <td>f11</td> 
	 *     <td>f10</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB9_E5</td> 
	 *     <td>RGB</td> 
	 *     <td>9</td> 
	 *     <td>9</td> 
	 *     <td>9</td> 
	 *     <td></td> 
	 *     <td>5</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R8I</td> 
	 *     <td>RED</td> 
	 *     <td>i8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R8UI</td> 
	 *     <td>RED</td> 
	 *     <td>ui8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R16I</td> 
	 *     <td>RED</td> 
	 *     <td>i16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R16UI</td> 
	 *     <td>RED</td> 
	 *     <td>ui16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R32I</td> 
	 *     <td>RED</td> 
	 *     <td>i32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R32UI</td> 
	 *     <td>RED</td> 
	 *     <td>ui32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG8I</td> 
	 *     <td>RG</td> 
	 *     <td>i8</td> 
	 *     <td>i8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG8UI</td> 
	 *     <td>RG</td> 
	 *     <td>ui8</td> 
	 *     <td>ui8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG16I</td> 
	 *     <td>RG</td> 
	 *     <td>i16</td> 
	 *     <td>i16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG16UI</td> 
	 *     <td>RG</td> 
	 *     <td>ui16</td> 
	 *     <td>ui16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG32I</td> 
	 *     <td>RG</td> 
	 *     <td>i32</td> 
	 *     <td>i32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG32UI</td> 
	 *     <td>RG</td> 
	 *     <td>ui32</td> 
	 *     <td>ui32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB8I</td> 
	 *     <td>RGB</td> 
	 *     <td>i8</td> 
	 *     <td>i8</td> 
	 *     <td>i8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB8UI</td> 
	 *     <td>RGB</td> 
	 *     <td>ui8</td> 
	 *     <td>ui8</td> 
	 *     <td>ui8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB16I</td> 
	 *     <td>RGB</td> 
	 *     <td>i16</td> 
	 *     <td>i16</td> 
	 *     <td>i16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB16UI</td> 
	 *     <td>RGB</td> 
	 *     <td>ui16</td> 
	 *     <td>ui16</td> 
	 *     <td>ui16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB32I</td> 
	 *     <td>RGB</td> 
	 *     <td>i32</td> 
	 *     <td>i32</td> 
	 *     <td>i32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB32UI</td> 
	 *     <td>RGB</td> 
	 *     <td>ui32</td> 
	 *     <td>ui32</td> 
	 *     <td>ui32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA8I</td> 
	 *     <td>RGBA</td> 
	 *     <td>i8</td> 
	 *     <td>i8</td> 
	 *     <td>i8</td> 
	 *     <td>i8</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA8UI</td> 
	 *     <td>RGBA</td> 
	 *     <td>ui8</td> 
	 *     <td>ui8</td> 
	 *     <td>ui8</td> 
	 *     <td>ui8</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA16I</td> 
	 *     <td>RGBA</td> 
	 *     <td>i16</td> 
	 *     <td>i16</td> 
	 *     <td>i16</td> 
	 *     <td>i16</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA16UI</td> 
	 *     <td>RGBA</td> 
	 *     <td>ui16</td> 
	 *     <td>ui16</td> 
	 *     <td>ui16</td> 
	 *     <td>ui16</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA32I</td> 
	 *     <td>RGBA</td> 
	 *     <td>i32</td> 
	 *     <td>i32</td> 
	 *     <td>i32</td> 
	 *     <td>i32</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA32UI</td> 
	 *     <td>RGBA</td> 
	 *     <td>ui32</td> 
	 *     <td>ui32</td> 
	 *     <td>ui32</td> 
	 *     <td>ui32</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *   </tbody> 
	 *  </table>
	 *  Possible values in WebGL2 for the versions of [texImage2D] that take a texture
	 * an HTMLImageElement, [HTMLCanvasElement] HTMLVideoElement, ImageBitmap, or
	 * ImageData
	 *   *  gl.[ALPHA] Discards the red, green and blue components and reads the
	 * [alpha] component.
	 *   *  gl.[RGB] Discards the [alpha] components and reads the red, green and blue
	 * components.
	 *   *  gl.[RGBA] Red, green, blue and [alpha] components are read from the color
	 * buffer.
	 *   *  gl.[LUMINANCE] Each color component is a luminance component, [alpha] is
	 * 1.0.
	 *   *  gl.[LUMINANCE_ALPHA] Each component is a luminance/alpha component.
	 *  When using the WEBGL_depth_texture extension:
	 *
	 *   *  gl.[DEPTH_COMPONENT]
	 *   *  gl.DEPTH_STENCIL
	 *  When using the EXT_sRGB extension:
	 *
	 *   *  ext.SRGB_EXT
	 *   *  ext.SRGB_ALPHA_EXT
	 * @param width A [GLsizei] specifying the width of the texture.
	 * @param height A [GLsizei] specifying the height of the texture.
	 * @param border A [GLint] specifying the width of the border. Must be 0.
	 * @param format A [GLenum] specifying the format of the texel data. In WebGL 1, this must be the same as internalformat (see above). in WebGL 2, the combinations are listed in [this table][].
	 *  [this table]:
	 * https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE
	 * @param type A [GLenum] specifying the data [type] of the texel data.
	 * Possible values:
	 *   *  gl.[UNSIGNED_BYTE] 8 bits per channel for gl.[RGBA]
	 *   *  gl.[UNSIGNED_SHORT_5_6_5] 5 red bits, 6 green bits, 5 blue bits.
	 *   *  gl.[UNSIGNED_SHORT_4_4_4_4] 4 red bits, 4 green bits, 4 blue bits, 4
	 * [alpha] bits.
	 *   *  gl.[UNSIGNED_SHORT_5_5_5_1] 5 red bits, 5 green bits, 5 blue bits, 1
	 * [alpha] bit.
	 *  When using the WEBGL_depth_texture extension:
	 *
	 *   *  gl.[UNSIGNED_SHORT]
	 *   *  gl.[UNSIGNED_INT]
	 *   *  ext.UNSIGNED_INT_24_8_WEBGL (constant provided by the extension)
	 * When using the OES_texture_float extension:
	 *
	 *   *  gl.FLOAT
	 *  When using the OES_texture_half_float extension:
	 *
	 *   *  ext.HALF_FLOAT_OES (constant provided by the extension)
	 * @param pixels The following types can always be used as a pixel source for the texture:
	 *   *  ImageData,
	 *   *  HTMLImageElement,
	 *   *  [HTMLCanvasElement]
	 *   *  HTMLVideoElement,
	 *   *  ImageBitmap.
	 *  The following types can only be used as a pixel source when width, height, and
	 * border are specified:
	 *   *  Uint8Array (must be used if [type] is gl.[UNSIGNED_BYTE]
	 *   *  Uint16Array (must be used if [type] is either gl.[UNSIGNED_SHORT_5_6_5]
	 * gl.[UNSIGNED_SHORT_4_4_4_4] gl.[UNSIGNED_SHORT_5_5_5_1] gl.[UNSIGNED_SHORT] or
	 *   *  ext.HALF_FLOAT_OES)
	 *   *  Uint32Array (must be used if [type] is gl.[UNSIGNED_INT] or
	 *   *  ext.UNSIGNED_INT_24_8_WEBGL)
	 *   *  [Float32Array] (must be used if [type] is gl.[FLOAT]
	 */
	fun texImage2D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, height: GLsizei, border: GLint, format: GLenum, type: GLenum, pixels: ArrayBufferView?)
	
	
	/**
	 *  The [WebGLRenderingContext].[texImage2D] method of the WebGL API specifies a
	 * two-dimensional texture image.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.8)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture.
	 * Possible values:
	 *   *  gl.[TEXTURE_2D] A two-dimensional texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_X] Positive X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_X] Negative X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Y] Positive Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Y] Negative Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Z] Positive Z face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Z] Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level *n* is the n-th mipmap reduction level.
	 * @param internalformat A [GLenum] specifying the color components in the texture.
	 *  Possible values in both WebGL1 and WebGL2
	 *  <table> 
	 *   <thead> 
	 *    <tr> 
	 *     <td>Format</td> 
	 *     <td>Type</td> 
	 *     <td>Channels</td> 
	 *     <td>Bytes per pixel</td> 
	 *    </tr> 
	 *   </thead> 
	 *   <tbody> 
	 *    <tr> 
	 *     <td>RGBA</td> 
	 *     <td>UNSIGNED_BYTE</td> 
	 *     <td>4</td> 
	 *     <td>4</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB</td> 
	 *     <td>UNSIGNED_BYTE</td> 
	 *     <td>3</td> 
	 *     <td>3</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA</td> 
	 *     <td>UNSIGNED_SHORT_4_4_4_4</td> 
	 *     <td>4</td> 
	 *     <td>2</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA</td> 
	 *     <td>UNSIGNED_SHORT_5_5_5_1</td> 
	 *     <td>4</td> 
	 *     <td>2</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB</td> 
	 *     <td>UNSIGNED_SHORT_5_6_5</td> 
	 *     <td>3</td> 
	 *     <td>2</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>LUMINANCE_ALPHA</td> 
	 *     <td>UNSIGNED_BYTE</td> 
	 *     <td>2</td> 
	 *     <td>2</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>LUMINANCE</td> 
	 *     <td>UNSIGNED_BYTE</td> 
	 *     <td>1</td> 
	 *     <td>1</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>ALPHA</td> 
	 *     <td>UNSIGNED_BYTE</td> 
	 *     <td>1</td> 
	 *     <td>1</td> 
	 *    </tr> 
	 *   </tbody> 
	 *  </table>
	 *  Other possible values in WebGL2 for the versions of [texImage2D] that take a
	 * [TypedArray] or a [DataView] or a [GLintptr] offset
	 *  <table> 
	 *   <thead> 
	 *    <tr> 
	 *     <td><strong>Sized<br /> Format</strong></td> 
	 *     <td><strong>Base<br /> Format</strong></td> 
	 *     <td><strong>R<br /> bits</strong></td> 
	 *     <td><strong>G<br /> bits</strong></td> 
	 *     <td><strong>B<br /> bits</strong></td> 
	 *     <td><strong>A<br /> bits</strong></td> 
	 *     <td><strong>Shared<br /> bits</strong></td> 
	 *     <td><strong>Color<br /> renderable</strong></td> 
	 *     <td><strong>Texture<br /> filterable</strong></td> 
	 *    </tr> 
	 *   </thead> 
	 *   <tbody> 
	 *    <tr> 
	 *     <td>R8</td> 
	 *     <td>RED</td> 
	 *     <td>8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R8_SNORM</td> 
	 *     <td>RED</td> 
	 *     <td>s8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG8</td> 
	 *     <td>RG</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG8_SNORM</td> 
	 *     <td>RG</td> 
	 *     <td>s8</td> 
	 *     <td>s8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB8</td> 
	 *     <td>RGB</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB8_SNORM</td> 
	 *     <td>RGB</td> 
	 *     <td>s8</td> 
	 *     <td>s8</td> 
	 *     <td>s8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB565</td> 
	 *     <td>RGB</td> 
	 *     <td>5</td> 
	 *     <td>6</td> 
	 *     <td>5</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA4</td> 
	 *     <td>RGBA</td> 
	 *     <td>4</td> 
	 *     <td>4</td> 
	 *     <td>4</td> 
	 *     <td>4</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB5_A1</td> 
	 *     <td>RGBA</td> 
	 *     <td>5</td> 
	 *     <td>5</td> 
	 *     <td>5</td> 
	 *     <td>1</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA8</td> 
	 *     <td>RGBA</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA8_SNORM</td> 
	 *     <td>RGBA</td> 
	 *     <td>s8</td> 
	 *     <td>s8</td> 
	 *     <td>s8</td> 
	 *     <td>s8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB10_A2</td> 
	 *     <td>RGBA</td> 
	 *     <td>10</td> 
	 *     <td>10</td> 
	 *     <td>10</td> 
	 *     <td>2</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB10_A2UI</td> 
	 *     <td>RGBA</td> 
	 *     <td>ui10</td> 
	 *     <td>ui10</td> 
	 *     <td>ui10</td> 
	 *     <td>ui2</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>SRGB8</td> 
	 *     <td>RGB</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>SRGB8_ALPHA8</td> 
	 *     <td>RGBA</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td>8</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R16F</td> 
	 *     <td>RED</td> 
	 *     <td>f16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG16F</td> 
	 *     <td>RG</td> 
	 *     <td>f16</td> 
	 *     <td>f16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB16F</td> 
	 *     <td>RGB</td> 
	 *     <td>f16</td> 
	 *     <td>f16</td> 
	 *     <td>f16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA16F</td> 
	 *     <td>RGBA</td> 
	 *     <td>f16</td> 
	 *     <td>f16</td> 
	 *     <td>f16</td> 
	 *     <td>f16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R32F</td> 
	 *     <td>RED</td> 
	 *     <td>f32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG32F</td> 
	 *     <td>RG</td> 
	 *     <td>f32</td> 
	 *     <td>f32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB32F</td> 
	 *     <td>RGB</td> 
	 *     <td>f32</td> 
	 *     <td>f32</td> 
	 *     <td>f32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA32F</td> 
	 *     <td>RGBA</td> 
	 *     <td>f32</td> 
	 *     <td>f32</td> 
	 *     <td>f32</td> 
	 *     <td>f32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R11F_G11F_B10F</td> 
	 *     <td>RGB</td> 
	 *     <td>f11</td> 
	 *     <td>f11</td> 
	 *     <td>f10</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB9_E5</td> 
	 *     <td>RGB</td> 
	 *     <td>9</td> 
	 *     <td>9</td> 
	 *     <td>9</td> 
	 *     <td></td> 
	 *     <td>5</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R8I</td> 
	 *     <td>RED</td> 
	 *     <td>i8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R8UI</td> 
	 *     <td>RED</td> 
	 *     <td>ui8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R16I</td> 
	 *     <td>RED</td> 
	 *     <td>i16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R16UI</td> 
	 *     <td>RED</td> 
	 *     <td>ui16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R32I</td> 
	 *     <td>RED</td> 
	 *     <td>i32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>R32UI</td> 
	 *     <td>RED</td> 
	 *     <td>ui32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG8I</td> 
	 *     <td>RG</td> 
	 *     <td>i8</td> 
	 *     <td>i8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG8UI</td> 
	 *     <td>RG</td> 
	 *     <td>ui8</td> 
	 *     <td>ui8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG16I</td> 
	 *     <td>RG</td> 
	 *     <td>i16</td> 
	 *     <td>i16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG16UI</td> 
	 *     <td>RG</td> 
	 *     <td>ui16</td> 
	 *     <td>ui16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG32I</td> 
	 *     <td>RG</td> 
	 *     <td>i32</td> 
	 *     <td>i32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RG32UI</td> 
	 *     <td>RG</td> 
	 *     <td>ui32</td> 
	 *     <td>ui32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB8I</td> 
	 *     <td>RGB</td> 
	 *     <td>i8</td> 
	 *     <td>i8</td> 
	 *     <td>i8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB8UI</td> 
	 *     <td>RGB</td> 
	 *     <td>ui8</td> 
	 *     <td>ui8</td> 
	 *     <td>ui8</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB16I</td> 
	 *     <td>RGB</td> 
	 *     <td>i16</td> 
	 *     <td>i16</td> 
	 *     <td>i16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB16UI</td> 
	 *     <td>RGB</td> 
	 *     <td>ui16</td> 
	 *     <td>ui16</td> 
	 *     <td>ui16</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB32I</td> 
	 *     <td>RGB</td> 
	 *     <td>i32</td> 
	 *     <td>i32</td> 
	 *     <td>i32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGB32UI</td> 
	 *     <td>RGB</td> 
	 *     <td>ui32</td> 
	 *     <td>ui32</td> 
	 *     <td>ui32</td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA8I</td> 
	 *     <td>RGBA</td> 
	 *     <td>i8</td> 
	 *     <td>i8</td> 
	 *     <td>i8</td> 
	 *     <td>i8</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA8UI</td> 
	 *     <td>RGBA</td> 
	 *     <td>ui8</td> 
	 *     <td>ui8</td> 
	 *     <td>ui8</td> 
	 *     <td>ui8</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA16I</td> 
	 *     <td>RGBA</td> 
	 *     <td>i16</td> 
	 *     <td>i16</td> 
	 *     <td>i16</td> 
	 *     <td>i16</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA16UI</td> 
	 *     <td>RGBA</td> 
	 *     <td>ui16</td> 
	 *     <td>ui16</td> 
	 *     <td>ui16</td> 
	 *     <td>ui16</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA32I</td> 
	 *     <td>RGBA</td> 
	 *     <td>i32</td> 
	 *     <td>i32</td> 
	 *     <td>i32</td> 
	 *     <td>i32</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *    <tr> 
	 *     <td>RGBA32UI</td> 
	 *     <td>RGBA</td> 
	 *     <td>ui32</td> 
	 *     <td>ui32</td> 
	 *     <td>ui32</td> 
	 *     <td>ui32</td> 
	 *     <td></td> 
	 *     <td>●</td> 
	 *     <td></td> 
	 *    </tr> 
	 *   </tbody> 
	 *  </table>
	 *  Possible values in WebGL2 for the versions of [texImage2D] that take a texture
	 * an HTMLImageElement, [HTMLCanvasElement] HTMLVideoElement, ImageBitmap, or
	 * ImageData
	 *   *  gl.[ALPHA] Discards the red, green and blue components and reads the
	 * [alpha] component.
	 *   *  gl.[RGB] Discards the [alpha] components and reads the red, green and blue
	 * components.
	 *   *  gl.[RGBA] Red, green, blue and [alpha] components are read from the color
	 * buffer.
	 *   *  gl.[LUMINANCE] Each color component is a luminance component, [alpha] is
	 * 1.0.
	 *   *  gl.[LUMINANCE_ALPHA] Each component is a luminance/alpha component.
	 *  When using the WEBGL_depth_texture extension:
	 *
	 *   *  gl.[DEPTH_COMPONENT]
	 *   *  gl.DEPTH_STENCIL
	 *  When using the EXT_sRGB extension:
	 *
	 *   *  ext.SRGB_EXT
	 *   *  ext.SRGB_ALPHA_EXT
	 * @param format A [GLenum] specifying the format of the texel data. In WebGL 1, this must be the same as internalformat (see above). in WebGL 2, the combinations are listed in [this table][].
	 *  [this table]:
	 * https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE
	 * @param type A [GLenum] specifying the data [type] of the texel data.
	 * Possible values:
	 *   *  gl.[UNSIGNED_BYTE] 8 bits per channel for gl.[RGBA]
	 *   *  gl.[UNSIGNED_SHORT_5_6_5] 5 red bits, 6 green bits, 5 blue bits.
	 *   *  gl.[UNSIGNED_SHORT_4_4_4_4] 4 red bits, 4 green bits, 4 blue bits, 4
	 * [alpha] bits.
	 *   *  gl.[UNSIGNED_SHORT_5_5_5_1] 5 red bits, 5 green bits, 5 blue bits, 1
	 * [alpha] bit.
	 *  When using the WEBGL_depth_texture extension:
	 *
	 *   *  gl.[UNSIGNED_SHORT]
	 *   *  gl.[UNSIGNED_INT]
	 *   *  ext.UNSIGNED_INT_24_8_WEBGL (constant provided by the extension)
	 * When using the OES_texture_float extension:
	 *
	 *   *  gl.FLOAT
	 *  When using the OES_texture_half_float extension:
	 *
	 *   *  ext.HALF_FLOAT_OES (constant provided by the extension)
	 * @param pixels The following types can always be used as a pixel source for the texture:
	 *   *  ImageData,
	 *   *  HTMLImageElement,
	 *   *  [HTMLCanvasElement]
	 *   *  HTMLVideoElement,
	 *   *  ImageBitmap.
	 *  The following types can only be used as a pixel source when width, height, and
	 * border are specified:
	 *   *  Uint8Array (must be used if [type] is gl.[UNSIGNED_BYTE]
	 *   *  Uint16Array (must be used if [type] is either gl.[UNSIGNED_SHORT_5_6_5]
	 * gl.[UNSIGNED_SHORT_4_4_4_4] gl.[UNSIGNED_SHORT_5_5_5_1] gl.[UNSIGNED_SHORT] or
	 *   *  ext.HALF_FLOAT_OES)
	 *   *  Uint32Array (must be used if [type] is gl.[UNSIGNED_INT] or
	 *   *  ext.UNSIGNED_INT_24_8_WEBGL)
	 *   *  [Float32Array] (must be used if [type] is gl.[FLOAT]
	 */
	fun texImage2D(target: GLenum, level: GLint, internalformat: GLenum, format: GLenum, type: GLenum, pixels: TexImageSource?)
	
	
	/**
	 *  The [WebGLRenderingContext].texParameter[fi]] methods of the WebGL API set
	 * texture parameters.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texParameter)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.8)
	 *
	 * @param target A [GLenum] specifying the binding point (target).
	 * Possible values:
	 *   *  gl.[TEXTURE_2D] A two-dimensional texture.
	 *   *  gl.[TEXTURE_CUBE_MAP] A cube-mapped texture.
	 * @param pname The pname parameter is a [GLenum] specifying the texture parameter to set.
	 * @param param The param parameter is a [GLfloat] or [GLint] specifying the value for the specified parameter
	 */
	fun texParameterf(target: GLenum, pname: GLenum, param: GLfloat)
	
	
	/**
	 *  The [WebGLRenderingContext].texParameter[fi]] methods of the WebGL API set
	 * texture parameters.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texParameter)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.8)
	 *
	 * @param target A [GLenum] specifying the binding point (target).
	 * Possible values:
	 *   *  gl.[TEXTURE_2D] A two-dimensional texture.
	 *   *  gl.[TEXTURE_CUBE_MAP] A cube-mapped texture.
	 * @param pname The pname parameter is a [GLenum] specifying the texture parameter to set.
	 * @param param The param parameter is a [GLfloat] or [GLint] specifying the value for the specified parameter
	 */
	fun texParameteri(target: GLenum, pname: GLenum, param: GLint)
	
	
	/**
	 *  The [WebGLRenderingContext].[texSubImage2D] method of the WebGL API specifies a
	 * sub-rectangle of the current texture.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#TEXSUBIMAGE2D)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture.
	 * Possible values:
	 *   *  gl.[TEXTURE_2D] A two-dimensional texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_X] Positive X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_X] Negative X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Y] Positive Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Y] Negative Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Z] Positive Z face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Z] Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level *n* is the n-th mipmap reduction level.
	 * @param xoffset A [GLint] specifying the lower left texel x coordinate of a width-wide by height-wide rectangular subregion of the texture array.
	 * @param yoffset A [GLint] specifying the lower left texel y coordinate of a width-wide by height-wide rectangular subregion of the texture array.
	 * @param width A [GLsizei] specifying the width of the texture in texels.
	 * @param height A [GLsizei] specifying the height of the texture in texels.
	 * @param format A [GLenum] specifying the format of the texel data.
	 * Possible values:
	 *   *  gl.[ALPHA] Discards the red, green and blue components and reads the
	 * [alpha] component.
	 *   *  gl.[RGB] Discards the [alpha] components and reads the red, green and blue
	 * components.
	 *   *  gl.[RGBA] Red, green, blue and [alpha] components are read from the color
	 * buffer.
	 *   *  gl.[LUMINANCE] Each color component is a luminance component, [alpha] is
	 * 1.0.
	 *   *  gl.[LUMINANCE_ALPHA] Each component is a luminance/alpha component.
	 *  When using the EXT_sRGB extension:
	 *
	 *   *  ext.SRGB_EXT
	 *   *  ext.SRGB_ALPHA_EXT
	 * @param type A [GLenum] specifying the data [type] of the texel data.
	 * Possible values:
	 *   *  gl.[UNSIGNED_BYTE] 8 bits per channel for gl.[RGBA]
	 *   *  gl.[UNSIGNED_SHORT_5_6_5] 5 red bits, 6 green bits, 5 blue bits.
	 *   *  gl.[UNSIGNED_SHORT_4_4_4_4] 4 red bits, 4 green bits, 4 blue bits, 4
	 * [alpha] bits.
	 *   *  gl.[UNSIGNED_SHORT_5_5_5_1] 5 red bits, 5 green bits, 5 blue bits, 1
	 * [alpha] bit.
	 *  When using the OES_texture_float extension:
	 *
	 *   *  gl.FLOAT
	 *  When using the OES_texture_half_float extension:
	 *
	 *   *  gl.HALF_FLOAT_OES
	 * @param pixels One of the following objects can be used as a pixel source for the texture:
	 *   *  Uint8Array (Must be used if [type] is gl.[UNSIGNED_BYTE]
	 *   *  Uint16Array (Must be used if [type] is either gl.[UNSIGNED_SHORT_5_6_5]
	 * gl.[UNSIGNED_SHORT_4_4_4_4] gl.[UNSIGNED_SHORT_5_5_5_1] or ext.HALF_FLOAT_OES)
	 *   *  [Float32Array] (Must be used if [type] is gl.[FLOAT]
	 *   *  ImageData,
	 *   *  HTMLImageElement,
	 *   *  [HTMLCanvasElement]
	 *   *  HTMLVideoElement,
	 *   *  ImageBitmap.
	 */
	fun texSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: ArrayBufferView?)
	
	
	/**
	 *  The [WebGLRenderingContext].[texSubImage2D] method of the WebGL API specifies a
	 * sub-rectangle of the current texture.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#TEXSUBIMAGE2D)
	 *
	 * @param target A [GLenum] specifying the binding point (target) of the active texture.
	 * Possible values:
	 *   *  gl.[TEXTURE_2D] A two-dimensional texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_X] Positive X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_X] Negative X face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Y] Positive Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Y] Negative Y face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_POSITIVE_Z] Positive Z face for a cube-mapped texture.
	 *   *  gl.[TEXTURE_CUBE_MAP_NEGATIVE_Z] Negative Z face for a cube-mapped texture.
	 * @param level A [GLint] specifying the level of detail. Level 0 is the base image level and level *n* is the n-th mipmap reduction level.
	 * @param xoffset A [GLint] specifying the lower left texel x coordinate of a width-wide by height-wide rectangular subregion of the texture array.
	 * @param yoffset A [GLint] specifying the lower left texel y coordinate of a width-wide by height-wide rectangular subregion of the texture array.
	 * @param format A [GLenum] specifying the format of the texel data.
	 * Possible values:
	 *   *  gl.[ALPHA] Discards the red, green and blue components and reads the
	 * [alpha] component.
	 *   *  gl.[RGB] Discards the [alpha] components and reads the red, green and blue
	 * components.
	 *   *  gl.[RGBA] Red, green, blue and [alpha] components are read from the color
	 * buffer.
	 *   *  gl.[LUMINANCE] Each color component is a luminance component, [alpha] is
	 * 1.0.
	 *   *  gl.[LUMINANCE_ALPHA] Each component is a luminance/alpha component.
	 *  When using the EXT_sRGB extension:
	 *
	 *   *  ext.SRGB_EXT
	 *   *  ext.SRGB_ALPHA_EXT
	 * @param type A [GLenum] specifying the data [type] of the texel data.
	 * Possible values:
	 *   *  gl.[UNSIGNED_BYTE] 8 bits per channel for gl.[RGBA]
	 *   *  gl.[UNSIGNED_SHORT_5_6_5] 5 red bits, 6 green bits, 5 blue bits.
	 *   *  gl.[UNSIGNED_SHORT_4_4_4_4] 4 red bits, 4 green bits, 4 blue bits, 4
	 * [alpha] bits.
	 *   *  gl.[UNSIGNED_SHORT_5_5_5_1] 5 red bits, 5 green bits, 5 blue bits, 1
	 * [alpha] bit.
	 *  When using the OES_texture_float extension:
	 *
	 *   *  gl.FLOAT
	 *  When using the OES_texture_half_float extension:
	 *
	 *   *  gl.HALF_FLOAT_OES
	 * @param pixels One of the following objects can be used as a pixel source for the texture:
	 *   *  Uint8Array (Must be used if [type] is gl.[UNSIGNED_BYTE]
	 *   *  Uint16Array (Must be used if [type] is either gl.[UNSIGNED_SHORT_5_6_5]
	 * gl.[UNSIGNED_SHORT_4_4_4_4] gl.[UNSIGNED_SHORT_5_5_5_1] or ext.HALF_FLOAT_OES)
	 *   *  [Float32Array] (Must be used if [type] is gl.[FLOAT]
	 *   *  ImageData,
	 *   *  HTMLImageElement,
	 *   *  [HTMLCanvasElement]
	 *   *  HTMLVideoElement,
	 *   *  ImageBitmap.
	 */
	fun texSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, format: GLenum, type: GLenum, pixels: TexImageSource?)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param x A new value to be used for the uniform variable.
	 */
	fun uniform1f(location: WebGLUniformLocation?, x: GLfloat)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform1fv(location: WebGLUniformLocation?, value: Float32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform1fv(location: WebGLUniformLocation?, value: List<GLfloat>)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param x A new value to be used for the uniform variable.
	 */
	fun uniform1i(location: WebGLUniformLocation?, x: GLint)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform1iv(location: WebGLUniformLocation?, value: Int32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform1iv(location: WebGLUniformLocation?, value: List<Long>)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param x A new value to be used for the uniform variable.
	 * @param y A new value to be used for the uniform variable.
	 */
	fun uniform2f(location: WebGLUniformLocation?, x: GLfloat, y: GLfloat)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform2fv(location: WebGLUniformLocation?, value: Float32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform2fv(location: WebGLUniformLocation?, value: List<GLfloat>)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param x A new value to be used for the uniform variable.
	 * @param y A new value to be used for the uniform variable.
	 */
	fun uniform2i(location: WebGLUniformLocation?, x: GLint, y: GLint)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform2iv(location: WebGLUniformLocation?, value: Int32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform2iv(location: WebGLUniformLocation?, value: List<Long>)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param x A new value to be used for the uniform variable.
	 * @param y A new value to be used for the uniform variable.
	 * @param z A new value to be used for the uniform variable.
	 */
	fun uniform3f(location: WebGLUniformLocation?, x: GLfloat, y: GLfloat, z: GLfloat)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform3fv(location: WebGLUniformLocation?, value: Float32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform3fv(location: WebGLUniformLocation?, value: List<GLfloat>)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param x A new value to be used for the uniform variable.
	 * @param y A new value to be used for the uniform variable.
	 * @param z A new value to be used for the uniform variable.
	 */
	fun uniform3i(location: WebGLUniformLocation?, x: GLint, y: GLint, z: GLint)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform3iv(location: WebGLUniformLocation?, value: Int32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform3iv(location: WebGLUniformLocation?, value: List<Long>)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param x A new value to be used for the uniform variable.
	 * @param y A new value to be used for the uniform variable.
	 * @param z A new value to be used for the uniform variable.
	 * @param w A new value to be used for the uniform variable.
	 */
	fun uniform4f(location: WebGLUniformLocation?, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform4fv(location: WebGLUniformLocation?, value: Float32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform4fv(location: WebGLUniformLocation?, value: List<GLfloat>)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param x A new value to be used for the uniform variable.
	 * @param y A new value to be used for the uniform variable.
	 * @param z A new value to be used for the uniform variable.
	 * @param w A new value to be used for the uniform variable.
	 */
	fun uniform4i(location: WebGLUniformLocation?, x: GLint, y: GLint, z: GLint, w: GLint)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform4iv(location: WebGLUniformLocation?, value: Int32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].uniform[1234][fi][v]] methods of the WebGL API
	 * specify values of uniform variables. All active uniform variables defined in a
	 * program object are initialized to 0 when the program object is linked
	 * successfully. They retain the values assigned to them by a call to this method
	 * until the next successful link operation occurs on the program object, when they
	 * are once again initialized to 0. Note: Many of the functions described here have
	 * expanded WebGL 2 interfaces, which can be found under
	 * `WebGL2RenderingContext.uniform[1234][uif][v]`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify.
	 * @param value A new value to be used for the uniform variable.
	 */
	fun uniform4iv(location: WebGLUniformLocation?, value: List<Long>)
	
	
	/**
	 *  The [WebGLRenderingContext].uniformMatrix[234]fv] methods of the WebGL API
	 * specify matrix values for uniform variables. The three versions of this method
	 * ([uniformMatrix2fv], [uniformMatrix3fv], and [uniformMatrix4fv]) take as the
	 * input value 2-component, 3-component, and 4-component square matrices,
	 * respectively. They are expected to have 4, 9 or 16 floats.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniformMatrix)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify. The location is obtained using [getUniformLocation].
	 * @param transpose A [GLboolean] specifying whether to transpose the matrix. Must be false.
	 * @param value A [Float32Array] or sequence of [GLfloat] values. The values are assumed to be supplied in column major order.
	 */
	fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: GLboolean, value: Float32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].uniformMatrix[234]fv] methods of the WebGL API
	 * specify matrix values for uniform variables. The three versions of this method
	 * ([uniformMatrix2fv], [uniformMatrix3fv], and [uniformMatrix4fv]) take as the
	 * input value 2-component, 3-component, and 4-component square matrices,
	 * respectively. They are expected to have 4, 9 or 16 floats.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniformMatrix)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify. The location is obtained using [getUniformLocation].
	 * @param transpose A [GLboolean] specifying whether to transpose the matrix. Must be false.
	 * @param value A [Float32Array] or sequence of [GLfloat] values. The values are assumed to be supplied in column major order.
	 */
	fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: GLboolean, value: List<GLfloat>)
	
	
	/**
	 *  The [WebGLRenderingContext].uniformMatrix[234]fv] methods of the WebGL API
	 * specify matrix values for uniform variables. The three versions of this method
	 * ([uniformMatrix2fv], [uniformMatrix3fv], and [uniformMatrix4fv]) take as the
	 * input value 2-component, 3-component, and 4-component square matrices,
	 * respectively. They are expected to have 4, 9 or 16 floats.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniformMatrix)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify. The location is obtained using [getUniformLocation].
	 * @param transpose A [GLboolean] specifying whether to transpose the matrix. Must be false.
	 * @param value A [Float32Array] or sequence of [GLfloat] values. The values are assumed to be supplied in column major order.
	 */
	fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: GLboolean, value: Float32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].uniformMatrix[234]fv] methods of the WebGL API
	 * specify matrix values for uniform variables. The three versions of this method
	 * ([uniformMatrix2fv], [uniformMatrix3fv], and [uniformMatrix4fv]) take as the
	 * input value 2-component, 3-component, and 4-component square matrices,
	 * respectively. They are expected to have 4, 9 or 16 floats.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniformMatrix)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify. The location is obtained using [getUniformLocation].
	 * @param transpose A [GLboolean] specifying whether to transpose the matrix. Must be false.
	 * @param value A [Float32Array] or sequence of [GLfloat] values. The values are assumed to be supplied in column major order.
	 */
	fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: GLboolean, value: List<GLfloat>)
	
	
	/**
	 *  The [WebGLRenderingContext].uniformMatrix[234]fv] methods of the WebGL API
	 * specify matrix values for uniform variables. The three versions of this method
	 * ([uniformMatrix2fv], [uniformMatrix3fv], and [uniformMatrix4fv]) take as the
	 * input value 2-component, 3-component, and 4-component square matrices,
	 * respectively. They are expected to have 4, 9 or 16 floats.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniformMatrix)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify. The location is obtained using [getUniformLocation].
	 * @param transpose A [GLboolean] specifying whether to transpose the matrix. Must be false.
	 * @param value A [Float32Array] or sequence of [GLfloat] values. The values are assumed to be supplied in column major order.
	 */
	fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: GLboolean, value: Float32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].uniformMatrix[234]fv] methods of the WebGL API
	 * specify matrix values for uniform variables. The three versions of this method
	 * ([uniformMatrix2fv], [uniformMatrix3fv], and [uniformMatrix4fv]) take as the
	 * input value 2-component, 3-component, and 4-component square matrices,
	 * respectively. They are expected to have 4, 9 or 16 floats.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniformMatrix)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param location A [WebGLUniformLocation] object containing the location of the uniform attribute to modify. The location is obtained using [getUniformLocation].
	 * @param transpose A [GLboolean] specifying whether to transpose the matrix. Must be false.
	 * @param value A [Float32Array] or sequence of [GLfloat] values. The values are assumed to be supplied in column major order.
	 */
	fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: GLboolean, value: List<GLfloat>)
	
	
	/**
	 *  The [WebGLRenderingContext].[useProgram] method of the WebGL API sets the
	 * specified [WebGLProgram] as part of the current rendering state.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/useProgram)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param program A [WebGLProgram] to use.
	 */
	fun useProgram(program: WebGLProgram?)
	
	
	/**
	 *  The [WebGLRenderingContext].[validateProgram] method of the WebGL API validates
	 * a [WebGLProgram]. It checks if it is successfully linked and if it can be used
	 * in the current WebGL state.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/validateProgram)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.9)
	 *
	 * @param program A [WebGLProgram] to validate.
	 */
	fun validateProgram(program: WebGLProgram?)
	
	
	/**
	 *  The [WebGLRenderingContext].vertexAttrib[1234]f[v]] methods of the WebGL API
	 * specify constant values for generic vertex attributes.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param x A floating point number for the vertex attribute value.
	 */
	fun vertexAttrib1f(index: GLuint, x: GLfloat)
	
	
	/**
	 *  The [WebGLRenderingContext].vertexAttrib[1234]f[v]] methods of the WebGL API
	 * specify constant values for generic vertex attributes.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param value A [Float32Array] for floating point vector vertex attribute values.
	 */
	fun vertexAttrib1fv(index: GLuint, value: Float32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].vertexAttrib[1234]f[v]] methods of the WebGL API
	 * specify constant values for generic vertex attributes.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param value A [Float32Array] for floating point vector vertex attribute values.
	 */
	fun vertexAttrib1fv(index: GLuint, value: List<GLfloat>)
	
	
	/**
	 *  The [WebGLRenderingContext].vertexAttrib[1234]f[v]] methods of the WebGL API
	 * specify constant values for generic vertex attributes.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param x A floating point number for the vertex attribute value.
	 * @param y A floating point number for the vertex attribute value.
	 */
	fun vertexAttrib2f(index: GLuint, x: GLfloat, y: GLfloat)
	
	
	/**
	 *  The [WebGLRenderingContext].vertexAttrib[1234]f[v]] methods of the WebGL API
	 * specify constant values for generic vertex attributes.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param value A [Float32Array] for floating point vector vertex attribute values.
	 */
	fun vertexAttrib2fv(index: GLuint, value: Float32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].vertexAttrib[1234]f[v]] methods of the WebGL API
	 * specify constant values for generic vertex attributes.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param value A [Float32Array] for floating point vector vertex attribute values.
	 */
	fun vertexAttrib2fv(index: GLuint, value: List<GLfloat>)
	
	
	/**
	 *  The [WebGLRenderingContext].vertexAttrib[1234]f[v]] methods of the WebGL API
	 * specify constant values for generic vertex attributes.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param x A floating point number for the vertex attribute value.
	 * @param y A floating point number for the vertex attribute value.
	 * @param z A floating point number for the vertex attribute value.
	 */
	fun vertexAttrib3f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat)
	
	
	/**
	 *  The [WebGLRenderingContext].vertexAttrib[1234]f[v]] methods of the WebGL API
	 * specify constant values for generic vertex attributes.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param value A [Float32Array] for floating point vector vertex attribute values.
	 */
	fun vertexAttrib3fv(index: GLuint, value: Float32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].vertexAttrib[1234]f[v]] methods of the WebGL API
	 * specify constant values for generic vertex attributes.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param value A [Float32Array] for floating point vector vertex attribute values.
	 */
	fun vertexAttrib3fv(index: GLuint, value: List<GLfloat>)
	
	
	/**
	 *  The [WebGLRenderingContext].vertexAttrib[1234]f[v]] methods of the WebGL API
	 * specify constant values for generic vertex attributes.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param x A floating point number for the vertex attribute value.
	 * @param y A floating point number for the vertex attribute value.
	 * @param z A floating point number for the vertex attribute value.
	 * @param w A floating point number for the vertex attribute value.
	 */
	fun vertexAttrib4f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat)
	
	
	/**
	 *  The [WebGLRenderingContext].vertexAttrib[1234]f[v]] methods of the WebGL API
	 * specify constant values for generic vertex attributes.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param value A [Float32Array] for floating point vector vertex attribute values.
	 */
	fun vertexAttrib4fv(index: GLuint, value: Float32Array)
	
	
	/**
	 *  The [WebGLRenderingContext].vertexAttrib[1234]f[v]] methods of the WebGL API
	 * specify constant values for generic vertex attributes.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttrib)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the position of the vertex attribute to be modified.
	 * @param value A [Float32Array] for floating point vector vertex attribute values.
	 */
	fun vertexAttrib4fv(index: GLuint, value: List<GLfloat>)
	
	
	/**
	 *  The [WebGLRenderingContext].[vertexAttribPointer] method of the WebGL API binds
	 * the buffer currently bound to `gl.[ARRAY_BUFFER] to a generic vertex attribute
	 * of the current vertex buffer object and specifies its layout.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttribPointer)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.10)
	 *
	 * @param index A [GLuint] specifying the index of the vertex attribute that is to be modified.
	 * @param size A [GLint] specifying the number of components per vertex attribute. Must be 1, 2, 3, or 4.
	 * @param type A [GLenum] specifying the data [type] of each component in the array.
	 * Possible values:
	 *   *  gl.[BYTE] signed 8-bit integer, with values in [-128, 127]
	 *   *  gl.[SHORT] signed 16-bit integer, with values in [-32768, 32767]
	 *   *  gl.[UNSIGNED_BYTE] unsigned 8-bit integer, with values in [0, 255]
	 *   *  gl.[UNSIGNED_SHORT] unsigned 16-bit integer, with values in [0,65535]
	 *   *  gl.[FLOAT] 32-bit IEEE floating point number
	 * @param normalized A [GLboolean] specifying whether integer data values should be normalized into a certain range when being cast to a float.
	 *   *  For types gl.[BYTE] and gl.[SHORT] normalizes the values to [-1, 1] if
	 * true.
	 *   *  For types gl.[UNSIGNED_BYTE] and gl.[UNSIGNED_SHORT] normalizes the values
	 * to [0, 1] if true.
	 *   *  For types gl.[FLOAT] and gl.HALF_FLOAT, this parameter has no effect.
	 * @param stride A [GLsizei] specifying the offset in bytes between the beginning of consecutive vertex attributes. Cannot be negative or larger than 255. If stride is 0, the attribute is assumed to be tightly packed, that is, the attributes are not interleaved but each attribute is in a separate block, and the next vertex' attribute follows immediately after the current vertex.
	 * @param offset A [GLintptr] specifying an offset in bytes of the first component in the vertex attribute array. Must be a multiple of the byte length of [type].
	 */
	fun vertexAttribPointer(index: GLuint, size: GLint, type: GLenum, normalized: GLboolean, stride: GLsizei, offset: GLintptr)
	
	
	/**
	 *  The [WebGLRenderingContext].[viewport] method of the WebGL API sets the
	 * [viewport] which specifies the affine transformation of x and y from normalized
	 * device coordinates to window coordinates.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/viewport)
	 * * [Khronos Group](https://registry.khronos.org/webgl/specs/latest/1.0/#5.14.4)
	 *
	 * @param x A [GLint] specifying the horizontal coordinate for the lower left corner of the [viewport] origin. Default value: 0.
	 * @param y A [GLint] specifying the vertical coordinate for the lower left corner of the [viewport] origin. Default value: 0.
	 * @param width A non-negative [GLsizei] specifying the width of the [viewport]. Default value: width of the [canvas].
	 * @param height A non-negative [GLsizei] specifying the height of the [viewport]. Default value: height of the [canvas].
	 */
	fun viewport(x: GLint, y: GLint, width: GLsizei, height: GLsizei)
	
	
}

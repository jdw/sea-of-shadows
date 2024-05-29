package com.github.jdw.seaofshadows.canvas2d.shared


/**
 *  Note: This feature is available in [Web Workers][].
 * 
 *  When using the [canvas] element or the [Canvas API][], rendering, animation,
 * and user interaction usually happen on the main execution thread of a web
 * application. The computation relating to [canvas] animations and rendering can
 * have a significant impact on application performance.
 * 
 *  The [OffscreenCanvas] interface provides a [canvas] that can be rendered off
 * screen, decoupling the DOM and the Canvas API so that the [canvas] element is no
 * longer entirely dependent on the DOM. Rendering operations can also be run
 * inside a [worker][Web Workers] context, allowing you to run some tasks in a
 * separate thread and avoid heavy work on the main thread.
 * 
 *  [OffscreenCanvas] is a [transferable object][].
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas)
 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#the-offscreencanvas-interface)
 * * [Web Workers](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/Web_Workers_API)
 * * [canvas](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/HTML/Element/canvas)
 * * [Canvas API](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/Canvas_API)
 * * [transferable object](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/Web_Workers_API/Transferable_objects)
 */
interface OffscreenCanvas {
	var height: String
	var width: String
	
	/**
	 *  Note: This feature is available in Web Workers. The
	 * [OffscreenCanvas].[convertToBlob] method creates a `Blob` object representing
	 * the image contained in the [canvas]. The desired file format and image quality
	 * may be specified. If the file format is not specified, or if the given format is
	 * not supported, then the [data] will be exported as `image/png`. Browsers are
	 * required to support `image/png`; many will support additional formats including
	 * `image/jpeg` and `image/webp`. The created image will have a resolution of 96dpi
	 * for file formats that support encoding resolution metadata.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/convertToBlob)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-offscreencanvas-converttoblob-dev)
	 */
	fun convertToBlob()
	
	
	/**
	 *  Note: This feature is available in Web Workers. The
	 * [OffscreenCanvas].[transferToImageBitmap] method creates an `ImageBitmap` object
	 * from the most recently rendered image of the [OffscreenCanvas]. The
	 * [OffscreenCanvas] allocates a new image for its subsequent rendering.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/transferToImageBitmap)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-offscreencanvas-transfertoimagebitmap-dev)
	 */
	fun transferToImageBitmap()
	
	
	/**
	 *  Note: This feature is available in Web Workers. The
	 * [OffscreenCanvas].[getContext] method returns a drawing context for an offscreen
	 * [canvas] or `null` if the context identifier is not supported.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-offscreencanvas-getcontext-dev)
	 *
	 * @param contextType A string containing the context identifier defining the drawing context associated to the [canvas]. Possible values are: 2d Creates a OffscreenCanvasRenderingContext2D object representing a two-dimensional rendering context. webgl Creates a [WebGLRenderingContext] object representing a three-dimensional rendering context. This context is only available on browsers that implement WebGL version 1 (OpenGL ES 2.0). webgl2 Creates a WebGL2RenderingContext object representing a three-dimensional rendering context. This context is only available on browsers that implement WebGL version 2 (OpenGL ES 3.0). bitmaprenderer Creates a ImageBitmapRenderingContext which only provides functionality to replace the content of the [canvas] with a given ImageBitmap. Note: The identifiers "experimental-webgl" or "experimental-webgl2" are also used in implementations of WebGL. These implementations have not reached test suite conformance, or the graphic drivers situation on the platform is not yet stable. The Khronos Group certifies WebGL implementations under certain conformance rules.
	 * @param contextAttributes You can use several context attributes when creating your rendering context, for example: js offscreen.getContext("webgl", { antialias: false, depth: false });
	 *   2d context attributes: alpha Boolean that indicates if the [canvas] contains
	 * an alpha channel. If set to false, the browser now knows that the backdrop is
	 * always opaque, which can speed up drawing of transparent content and images
	 * then. willReadFrequently Non-standard (Firefox only) Boolean that indicates
	 * whether or not a lot of read-back operations are planned. This will force the
	 * use of a software (instead of hardware accelerated) 2D [canvas] and can [save]
	 * memory when calling [getImageData] frequently. This option is only available, if
	 * the flag gfx.[canvas].willReadFrequently.enable is set to true (which, by
	 * default, is only the case for B2G/Firefox OS). storage Non-standard (Blink only)
	 * String that indicates which storage is used ("persistent" by default). WebGL
	 * context attributes: alpha Boolean that indicates if the [canvas] contains an
	 * alpha buffer. depth Boolean that indicates that the drawing buffer is requested
	 * to have a depth buffer of at least 16 bits. stencil Boolean that indicates that
	 * the drawing buffer is requested to have a stencil buffer of at least 8 bits.
	 * antialias Boolean that indicates whether or not to perform anti-aliasing if
	 * possible. premultipliedAlpha Boolean that indicates that the page compositor
	 * will assume the drawing buffer contains colors with pre-multiplied alpha.
	 * preserveDrawingBuffer If the value is true the buffers will not be cleared and
	 * will preserve their values until cleared or overwritten by the author.
	 * failIfMajorPerformanceCaveat Boolean that indicates if a context will be created
	 * if the system performance is low.
	 */
	fun getContext(contextType: Number, contextAttributes: Number)
	
	
}

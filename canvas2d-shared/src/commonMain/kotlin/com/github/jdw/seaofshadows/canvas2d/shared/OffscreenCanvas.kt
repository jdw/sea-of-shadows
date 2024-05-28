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
	 * [OffscreenCanvas].[getContext] method returns a drawing context for an offscreen
	 * [canvas] or `null` if the context identifier is not supported.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-offscreencanvas-getcontext-dev)
	 */
	fun getContext()
	
	
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
	
	
}

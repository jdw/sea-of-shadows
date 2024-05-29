package com.github.jdw.seaofshadows.canvas2d.shared


/**
 *  The [HTMLCanvasElement] interface provides properties and methods for
 * manipulating the layout and presentation of [canvas] elements. The
 * [HTMLCanvasElement] interface also inherits the properties and methods of the
 * [`HTMLElement`][HTMLElement] interface.
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement)
 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#htmlcanvaselement)
 * * [canvas](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/HTML/Element/canvas)
 * * [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/HTMLElement)
 */
interface HTMLCanvasElement {
	var height: Int
	var width: Int
	
	/**
	 *  The [captureStream] method of the [HTMLCanvasElement] interface returns a
	 * `MediaStream` which includes a `CanvasCaptureMediaStreamTrack` containing a
	 * real-time video capture of the canvas's contents.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/captureStream)
	 * * [Khronos Group](https://w3c.github.io/mediacapture-fromelement/#dom-htmlcanvaselement-capturestream)
	 */
	fun captureStream()
	
	
	/**
	 *  The [HTMLCanvasElement].[toDataURL] method returns a [data] URL containing a
	 * representation of the image in the format specified by the `type` parameter. The
	 * desired file format and image quality may be specified. If the file format is
	 * not specified, or if the given format is not supported, then the [data] will be
	 * exported as `image/png`. In other words, if the returned value starts with
	 * `data:image/png` for any other requested `type`, then that format is not
	 * supported. Browsers are required to support `image/png`; many will support
	 * additional formats including `image/jpeg` and `image/webp`. The created image
	 * [data] will have a resolution of 96dpi for file formats that support encoding
	 * resolution metadata.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toDataURL)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-canvas-todataurl-dev)
	 */
	fun toDataURL()
	
	
	/**
	 *  The [HTMLCanvasElement].[transferControlToOffscreen] method transfers control
	 * to an [OffscreenCanvas] object, either on the main thread or on a worker.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/transferControlToOffscreen)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-canvas-transfercontroltooffscreen-dev)
	 */
	fun transferControlToOffscreen()
	
	
	/**
	 *  The [HTMLCanvasElement].[getContext] method returns a drawing context on the
	 * [canvas] or `null` if the context identifier is not supported, or the [canvas]
	 * has already been set to a different context mode. Later calls to this method on
	 * the same [canvas] element, with the same `contextType` argument, will always
	 * return the same drawing context instance as was returned the first time the
	 * method was invoked. It is not possible to get a different drawing context object
	 * on a given [canvas] element.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-canvas-getcontext-dev)
	 *
	 * @param contextType A string containing the context identifier defining the drawing context associated to the [canvas]. Possible values are: "2d", leading to the creation of a CanvasRenderingContext2D object representing a two-dimensional rendering context. "webgl" (or "experimental-webgl") which will create a [WebGLRenderingContext] object representing a three-dimensional rendering context. This context is only available on browsers that implement WebGL version 1 (OpenGL ES 2.0). "webgl2" which will create a WebGL2RenderingContext object representing a three-dimensional rendering context. This context is only available on browsers that implement WebGL version 2 (OpenGL ES 3.0). Experimental "webgpu", which will create a GPUCanvasContext object representing a three-dimensional rendering context for WebGPU render pipelines. This context is only available on browsers that implement The WebGPU API. "bitmaprenderer" which will create an [ImageBitmapRenderingContext] which only provides functionality to replace the content of the [canvas] with a given [ImageBitmap]. Note: The identifier "experimental-webgl" is used in new implementations of WebGL. These implementations have either not reached test suite conformance, or the graphics drivers on the platform are not yet stable. The Khronos Group certifies WebGL implementations under certain conformance rules.
	 */
	fun getContext(contextType: String)
	
	
	/**
	 *  The [HTMLCanvasElement].[toBlob] method creates a `Blob` object representing
	 * the image contained in the [canvas]. This file may be cached on the disk or
	 * stored in memory at the discretion of the user agent. The desired file format
	 * and image quality may be specified. If the file format is not specified, or if
	 * the given format is not supported, then the [data] will be exported as
	 * `image/png`. Browsers are required to support `image/png`; many will support
	 * additional formats including `image/jpeg` and `image/webp`. The created image
	 * will have a resolution of 96dpi for file formats that support encoding
	 * resolution metadata.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toBlob)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-canvas-toblob-dev)
	 *
	 * @param callback A callback function with the resulting Blob object as a single argument. null may be passed if the image cannot be created for any reason.
	 */
	fun toBlob(callback: String)
	
	
}

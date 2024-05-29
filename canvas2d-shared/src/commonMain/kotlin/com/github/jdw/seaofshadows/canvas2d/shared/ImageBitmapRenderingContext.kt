package com.github.jdw.seaofshadows.canvas2d.shared


/**
 *  Note: This feature is available in [Web Workers][].
 * 
 *  The [ImageBitmapRenderingContext] interface is a [canvas] rendering context
 * that provides the functionality to replace the canvas's contents with the given
 * [`ImageBitmap`][ImageBitmap]. Its context id (the first argument to
 * [HTMLCanvasElement].getContext`][HTMLCanvasElement.[getContext] or
 * [OffscreenCanvas].getContext`][OffscreenCanvas.[getContext]) is
 * `"bitmaprenderer"`.
 * 
 *  This interface is available in both the window and the [worker][Web Workers]
 * context.
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmapRenderingContext)
 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#the-imagebitmaprenderingcontext-interface)
 * * [Web Workers](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/Web_Workers_API)
 * * [ImageBitmap](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/ImageBitmap)
 * * [HTMLCanvasElement.getContext](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/HTMLCanvasElement/getContext)
 * * [OffscreenCanvas.getContext](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/OffscreenCanvas/getContext)
 */
interface ImageBitmapRenderingContext {
	
	/**
	 *  Note: This feature is available in Web Workers. The
	 * [ImageBitmapRenderingContext].[transferFromImageBitmap] method displays the
	 * given `ImageBitmap` in the [canvas] associated with this rendering context. The
	 * ownership of the `ImageBitmap` is transferred to the [canvas] as well. This
	 * method was previously named `transferImageBitmap`, but was renamed in a spec
	 * change. The old name is being kept as an alias to avoid code breakage.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmapRenderingContext/transferFromImageBitmap)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-imagebitmaprenderingcontext-transferfromimagebitmap-dev)
	 */
	fun transferFromImageBitmap()
	
	
}

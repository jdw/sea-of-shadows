package com.github.jdw.seaofshadows.canvas2d.shared


/**
 *  The [ImageBitmap] interface represents a bitmap image which can be drawn to a
 * [canvas] without undue latency. It can be created from a variety of source
 * objects using the [`createImageBitmap`][createImageBitmap] factory method.
 * [ImageBitmap] provides an asynchronous and resource efficient pathway to prepare
 * textures for rendering in WebGL.
 * 
 *  [ImageBitmap] is a [transferable object][].
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap)
 * * [Khronos Group](https://html.spec.whatwg.org/multipage/imagebitmap-and-animations.html#imagebitmap)
 * * [canvas](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/HTML/Element/canvas)
 * * [createImageBitmap](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/createImageBitmap)
 * * [transferable object](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/Web_Workers_API/Transferable_objects)
 */
interface ImageBitmap {
	var height: String
	var width: String
	
	/**
	 *  The [ImageBitmap].[close] method disposes of all graphical resources associated
	 * with an [ImageBitmap].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap/close)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/imagebitmap-and-animations.html#dom-imagebitmap-close-dev)
	 */
	fun close()
	
	
}

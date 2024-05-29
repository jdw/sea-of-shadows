package com.github.jdw.seaofshadows.canvas2d.shared


/**
 *  Note: This feature is available in [Web Workers][].
 * 
 *  The [Path2D] interface of the Canvas 2D API is used to declare a path that can
 * then be used on a [`CanvasRenderingContext2D`][CanvasRenderingContext2D] object.
 * The [path methods][] of the `CanvasRenderingContext2D` interface are also
 * present on this interface, which gives you the convenience of being able to
 * retain and replay your path whenever desired.
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/Path2D)
 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#path2d-objects)
 * * [Web Workers](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/Web_Workers_API)
 * * [CanvasRenderingContext2D](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D)
 * * [path methods](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D#paths)
 */
interface Path2D {
	
	/**
	 *  Note: This feature is available in Web Workers. The [Path2D].[addPath] method
	 * of the Canvas 2D API adds one [Path2D] object to another [Path2D] object.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/Path2D/addPath)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-path2d-addpath-dev)
	 *
	 * @param path A [Path2D] path to add.
	 */
	fun addPath(path: String)
	
	
}

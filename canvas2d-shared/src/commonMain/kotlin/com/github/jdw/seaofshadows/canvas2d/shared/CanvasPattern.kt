package com.github.jdw.seaofshadows.canvas2d.shared


/**
 *  Note: This feature is available in [Web Workers][].
 * 
 *  The [CanvasPattern] interface represents an [opaque object][] describing a
 * pattern, based on an image, a [canvas] or a video, created by the
 * [CanvasRenderingContext2D].createPattern`][CanvasRenderingContext2D.[createPattern]
 * method.
 * 
 *  It can be used as a [`fillStyle`][fillStyle] or [`strokeStyle`][strokeStyle].
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasPattern)
 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#canvaspattern)
 * * [Web Workers](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/Web_Workers_API)
 * * [opaque object](https://developer.mozilla.org/en-US/docs/Web/APIhttps://en.wikipedia.org/wiki/Opaque_data_type)
 * * [CanvasRenderingContext2D.createPattern](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D/createPattern)
 * * [fillStyle](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D/fillStyle)
 * * [strokeStyle](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D/strokeStyle)
 */
interface CanvasPattern {
	
	/**
	 *  Note: This feature is available in Web Workers. The
	 * [CanvasPattern].[setTransform] method uses a `DOMMatrix` object as the pattern's
	 * transformation matrix and invokes it on the pattern.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasPattern/setTransform)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-canvaspattern-settransform-dev)
	 *
	 * @param matrix A DOMMatrix to use as the pattern's transformation matrix.
	 */
	fun setTransform(matrix: Number)
	
	
}

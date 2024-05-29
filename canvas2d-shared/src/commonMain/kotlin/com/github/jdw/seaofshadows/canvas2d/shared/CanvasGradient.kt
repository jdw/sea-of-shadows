package com.github.jdw.seaofshadows.canvas2d.shared


/**
 *  Note: This feature is available in [Web Workers][].
 * 
 *  The [CanvasGradient] interface represents an [opaque object][] describing a
 * gradient. It is returned by the methods
 * [CanvasRenderingContext2D].createLinearGradient`][CanvasRenderingContext2D.[createLinearGradient],
 * [CanvasRenderingContext2D].createConicGradient`][CanvasRenderingContext2D.[createConicGradient]
 * or
 * [CanvasRenderingContext2D].createRadialGradient`][CanvasRenderingContext2D.[createRadialGradient].
 * 
 *  It can be used as a [`fillStyle`][fillStyle] or [`strokeStyle`][strokeStyle].
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasGradient)
 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#canvasgradient)
 * * [Web Workers](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/Web_Workers_API)
 * * [opaque object](https://developer.mozilla.org/en-US/docs/Web/APIhttps://en.wikipedia.org/wiki/Opaque_data_type)
 * * [CanvasRenderingContext2D.createLinearGradient](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D/createLinearGradient)
 * * [CanvasRenderingContext2D.createConicGradient](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D/createConicGradient)
 * * [CanvasRenderingContext2D.createRadialGradient](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D/createRadialGradient)
 * * [fillStyle](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D/fillStyle)
 * * [strokeStyle](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D/strokeStyle)
 */
interface CanvasGradient {
	
	/**
	 *  Note: This feature is available in Web Workers. The
	 * [CanvasGradient].[addColorStop] method adds a new color stop, defined by an
	 * `offset` and a `color`, to a given [canvas] gradient.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasGradient/addColorStop)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-canvasgradient-addcolorstop-dev)
	 *
	 * @param offset A number between 0 and 1, inclusive, representing the position of the color stop. 0 represents the start of the gradient and 1 represents the end.
	 * @param color A CSS <color> value representing the color of the stop.
	 */
	fun addColorStop(offset: Number, color: Number)
	
	
}

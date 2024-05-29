package com.github.jdw.seaofshadows.canvas2d.shared


/**
 *  Note: This feature is available in [Web Workers][].
 * 
 *  The [TextMetrics] interface represents the dimensions of a piece of text in the
 * [canvas] a [TextMetrics] instance can be retrieved using the
 * [`CanvasRenderingContext2D.measureText`][CanvasRenderingContext2D.[measureText]
 * method.
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics)
 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#textmetrics)
 * * [Web Workers](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/Web_Workers_API)
 * * [CanvasRenderingContext2D.measureText](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D/measureText)
 */
interface TextMetrics {
	var actualBoundingBoxAscent: Double
	var actualBoundingBoxDescent: Double
	var actualBoundingBoxLeft: Double
	var actualBoundingBoxRight: Double
	var alphabeticBaseline: Double
	val emHeightAscent: Int
	val emHeightDescent: Int
	val fontBoundingBoxAscent: Int
	val fontBoundingBoxDescent: Int
	var hangingBaseline: Double
	var ideographicBaseline: Int
	var width: Int
	
}

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
	var actualBoundingBoxAscent: String
	var actualBoundingBoxDescent: String
	var actualBoundingBoxLeft: String
	var actualBoundingBoxRight: String
	var alphabeticBaseline: String
	var emHeightAscent: String
	var emHeightDescent: String
	var fontBoundingBoxAscent: String
	var fontBoundingBoxDescent: String
	var hangingBaseline: String
	var ideographicBaseline: String
	var width: String
	
}

package com.github.jdw.seaofshadows.canvas2d.shared


/**
 *  Note: This feature is available in [Web Workers][].
 * 
 *  The [ImageData] interface represents the underlying pixel [data] of an area of
 * a [canvas] element.
 * 
 *  It is created using the [`ImageData`][ImageData] constructor or creator methods
 * on the [`CanvasRenderingContext2D`][CanvasRenderingContext2D] object associated
 * with a [canvas] [`createImageData`][createImageData] and
 * [`getImageData`][getImageData]. It can also be used to set a part of the
 * [canvas] by using [`putImageData`][putImageData].
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/ImageData)
 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#imagedata)
 * * [Web Workers](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/Web_Workers_API)
 * * [canvas](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/HTML/Element/canvas)
 * * [ImageData](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/ImageData/ImageData)
 * * [CanvasRenderingContext2D](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D)
 * * [createImageData](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D/createImageData)
 * * [getImageData](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D/getImageData)
 * * [putImageData](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/CanvasRenderingContext2D/putImageData)
 */
interface ImageData {
	var colorSpace: String
	var data: String
	var height: String
	var width: String
	
}

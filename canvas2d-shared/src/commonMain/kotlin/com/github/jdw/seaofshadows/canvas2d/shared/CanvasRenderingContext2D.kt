package com.github.jdw.seaofshadows.canvas2d.shared


/**
 *  The [CanvasRenderingContext2D] interface, part of the [Canvas API][], provides
 * the 2D rendering context for the drawing surface of a [canvas] element. It is
 * used for drawing shapes, text, images, and other objects.
 * 
 *  The interface's properties and methods are described in the reference section
 * of this page. The [Canvas tutorial][] has more explanation, examples, and
 * resources, as well.
 * 
 *  For [OffscreenCanvas], there is an equivalent interface that provides the
 * rendering context. The offscreen rendering context inherits most of the same
 * properties and methods as the [CanvasRenderingContext2D] and is described in
 * more detail in the [OffscreenCanvasRenderingContext2D] reference page.
 *
 * See further documentation:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D)
 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#2dcontext)
 * * [Canvas API](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/Canvas_API)
 * * [canvas](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/HTML/Element/canvas)
 * * [Canvas tutorial](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/Canvas_API/Tutorial)
 * * [OffscreenCanvas](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/OffscreenCanvas)
 * * [OffscreenCanvasRenderingContext2D](https://developer.mozilla.org/en-US/docs/Web/API/en-US/docs/Web/API/OffscreenCanvasRenderingContext2D)
 */
interface CanvasRenderingContext2D {
	var canvas: HTMLCanvasElement
	var direction: String
	var fillStyle: String
	var filter: String
	var font: String
	enum class FontKerningValue {
		/**
		 * The browser determines whether font kerning should be used or not. For example, some browsers will disable kerning on small fonts, since applying it could harm the readability of text.
		 */
		AUTO,
		
		
		/**
		 * Font kerning information stored in the font is disabled.
		 */
		NONE,
		
		
		/**
		 * Font kerning information stored in the font must be applied.
		 */
		NORMAL
	}
	var fontKerning: String
	var fontStretch: String
	enum class FontVariantCapsValue {
		/**
		 * Enables display of petite capitals for both upper and lowercase letters (OpenType features: c2pc, pcap).
		 */
		ALL_PETITE_CAPS,
		
		
		/**
		 * Enables display of small capitals for both upper and lowercase letters (OpenType features: c2sc, smcp).
		 */
		ALL_SMALL_CAPS,
		
		
		/**
		 * Deactivates of the use of alternate glyphs.
		 */
		NORMAL,
		
		
		/**
		 * Enables display of petite capitals (OpenType feature: pcap).
		 */
		PETITE_CAPS,
		
		
		/**
		 * Enables display of small capitals (OpenType feature: smcp). Small-caps glyphs typically use the form of uppercase letters but are reduced to the size of lowercase letters.
		 */
		SMALL_CAPS,
		
		
		/**
		 * Enables display of titling capitals (OpenType feature: titl). Uppercase letter glyphs are often designed for use with lowercase letters. When used in all uppercase titling sequences they can appear too strong. Titling capitals are designed specifically for this situation.
		 */
		TITLING_CAPS,
		
		
		/**
		 * Enables display of mixture of small capitals for uppercase letters with normal lowercase letters (OpenType feature: unic).
		 */
		UNICASE
	}
	var fontVariantCaps: String
	var globalAlpha: String
	enum class GlobalCompositeOperationValue {
		/**
		 * Preserves the luma of the bottom layer, while adopting the hue and chroma of the top layer.
		 */
		COLOR,
		
		
		/**
		 * Divides the inverted bottom layer by the top layer, and then inverts the result.
		 */
		COLOR_BURN,
		
		
		/**
		 * Divides the bottom layer by the inverted top layer.
		 */
		COLOR_DODGE,
		
		
		/**
		 * Only the new shape is shown.
		 */
		COPY,
		
		
		/**
		 * Retains the darkest pixels of both layers.
		 */
		DARKEN,
		
		
		/**
		 * The existing canvas is only kept where it overlaps the new shape. The new shape is drawn behind the canvas content.
		 */
		DESTINATION_ATOP,
		
		
		/**
		 * The existing canvas content is kept where both the new shape and existing canvas content overlap. Everything else is made transparent.
		 */
		DESTINATION_IN,
		
		
		/**
		 * The existing content is kept where it doesn't overlap the new shape.
		 */
		DESTINATION_OUT,
		
		
		/**
		 * New shapes are drawn behind the existing canvas content.
		 */
		DESTINATION_OVER,
		
		
		/**
		 * Subtracts the bottom layer from the top layer — or the other way round — to always get a positive value.
		 */
		DIFFERENCE,
		
		
		/**
		 * Like difference, but with lower contrast.
		 */
		EXCLUSION,
		
		
		/**
		 * Like overlay, a combination of multiply and screen — but instead with the top layer and bottom layer swapped.
		 */
		HARD_LIGHT,
		
		
		/**
		 * Preserves the luma and chroma of the bottom layer, while adopting the hue of the top layer.
		 */
		HUE,
		
		
		/**
		 * Retains the lightest pixels of both layers.
		 */
		LIGHTEN,
		
		
		/**
		 * Where both shapes overlap, the color is determined by adding color values.
		 */
		LIGHTER,
		
		
		/**
		 * Preserves the hue and chroma of the bottom layer, while adopting the luma of the top layer.
		 */
		LUMINOSITY,
		
		
		/**
		 * The pixels of the top layer are multiplied with the corresponding pixels of the bottom layer. A darker picture is the result.
		 */
		MULTIPLY,
		
		
		/**
		 * A combination of multiply and screen. Dark parts on the base layer become darker, and light parts become lighter.
		 */
		OVERLAY,
		
		
		/**
		 * Preserves the luma and hue of the bottom layer, while adopting the chroma of the top layer.
		 */
		SATURATION,
		
		
		/**
		 * The pixels are inverted, multiplied, and inverted again. A lighter picture is the result (opposite of multiply)
		 */
		SCREEN,
		
		
		/**
		 * A softer version of hard-light. Pure black or white does not result in pure black or white.
		 */
		SOFT_LIGHT,
		
		
		/**
		 * The new shape is only drawn where it overlaps the existing canvas content.
		 */
		SOURCE_ATOP,
		
		
		/**
		 * The new shape is drawn only where both the new shape and the destination canvas overlap. Everything else is made transparent.
		 */
		SOURCE_IN,
		
		
		/**
		 * The new shape is drawn where it doesn't overlap the existing canvas content.
		 */
		SOURCE_OUT,
		
		
		/**
		 * This is the default setting and draws new shapes on top of the existing canvas content.
		 */
		SOURCE_OVER,
		
		
		/**
		 * Shapes are made transparent where both overlap and drawn normal everywhere else.
		 */
		XOR
	}
	var globalCompositeOperation: String
	var imageSmoothingEnabled: String
	var imageSmoothingQuality: String
	var letterSpacing: String
	enum class LineCapValue {
		/**
		 * The ends of lines are squared off at the endpoints. Default value.
		 */
		BUTT,
		
		
		/**
		 * The ends of lines are rounded.
		 */
		ROUND,
		
		
		/**
		 * The ends of lines are squared off by adding a box with an equal width and half the height of the line's thickness.
		 */
		SQUARE
	}
	var lineCap: String
	var lineDashOffset: Number = 0.0
	enum class LineJoinValue {
		/**
		 * Fills an additional triangular area between the common endpoint of connected segments, and the separate outside rectangular corners of each segment.
		 */
		BEVEL,
		
		
		/**
		 * Connected segments are joined by extending their outside edges to connect at a single point, with the effect of filling an additional lozenge-shaped area. This setting is affected by the miterLimit property. Default value.
		 */
		MITER,
		
		
		/**
		 * Rounds off the corners of a shape by filling an additional sector of disc centered at the common endpoint of connected segments. The radius for these rounded corners is equal to the line width.
		 */
		ROUND
	}
	var lineJoin: String = LineJoinValue.MITER
	var lineWidth: Number = 1.0
	var miterLimit: String
	var shadowBlur: Number = 0
	var shadowColor: String
	var shadowOffsetX: Number = 0
	var shadowOffsetY: Number = 0
	enum class StrokeStyleValue {
		/**
		 * A string parsed as CSS <color> value.
		 */
		COLOR,
		
		
		/**
		 * A CanvasGradient object (a linear or radial gradient).
		 */
		GRADIENT,
		
		
		/**
		 * A CanvasPattern object (a repeating image).
		 */
		PATTERN
	}
	var strokeStyle: String
	enum class TextAlignValue {
		/**
		 * The text is centered.
		 */
		CENTER,
		
		
		/**
		 * The text is aligned at the normal end of the line (right-aligned for left-to-right locales, left-aligned for right-to-left locales).
		 */
		END,
		
		
		/**
		 * The text is left-aligned.
		 */
		LEFT,
		
		
		/**
		 * The text is right-aligned.
		 */
		RIGHT,
		
		
		/**
		 * The text is aligned at the normal start of the line (left-aligned for left-to-right locales, right-aligned for right-to-left locales).
		 */
		START
	}
	var textAlign: String
	enum class TextBaselineValue {
		/**
		 * The text baseline is the normal alphabetic baseline. Default value.
		 */
		ALPHABETIC,
		
		
		/**
		 * The text baseline is the bottom of the bounding box. This differs from the ideographic baseline in that the ideographic baseline doesn't consider descenders.
		 */
		BOTTOM,
		
		
		/**
		 * The text baseline is the hanging baseline. (Used by Tibetan and other Indic scripts.)
		 */
		HANGING,
		
		
		/**
		 * The text baseline is the ideographic baseline; this is the bottom of the body of the characters, if the main body of characters protrudes beneath the alphabetic baseline. (Used by Chinese, Japanese, and Korean scripts.)
		 */
		IDEOGRAPHIC,
		
		
		/**
		 * The text baseline is the middle of the em square.
		 */
		MIDDLE,
		
		
		/**
		 * The text baseline is the top of the em square.
		 */
		TOP
	}
	var textBaseline: String
	enum class TextRenderingValue {
		/**
		 * The browser makes educated guesses about when to optimize for speed, legibility, and geometric precision while drawing text.
		 */
		AUTO,
		
		
		/**
		 * The browser emphasizes geometric precision over rendering speed and legibility. Certain aspects of fonts — such as kerning — don't scale linearly. For large scale factors, you might see less-than-beautiful text rendering, but the size is what you would expect (neither rounded up nor down to the nearest font size supported by the underlying operating system).
		 */
		GEOMETRICPRECISION,
		
		
		/**
		 * The browser emphasizes legibility over rendering speed and geometric precision. This enables kerning and optional ligatures.
		 */
		OPTIMIZELEGIBILITY,
		
		
		/**
		 * The browser emphasizes rendering speed over legibility and geometric precision when drawing text. It disables kerning and ligatures.
		 */
		OPTIMIZESPEED
	}
	var textRendering: String
	var wordSpacing: String
	
	/**
	 *  The [CanvasRenderingContext2D].[arc] method of the Canvas 2D API adds a
	 * circular [arc] to the current sub-path.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/arc)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-arc-dev)
	 */
	fun arc()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[arcTo] method of the Canvas 2D API adds a
	 * circular [arc] to the current sub-path, using the given control points and
	 * radius. The [arc] is automatically connected to the path's latest point with a
	 * straight line if necessary, for example if the starting point and control points
	 * are in a line. This method is commonly used for making rounded corners. Note:
	 * You may get unexpected results when using a relatively large radius: the arc's
	 * connecting line will go in whatever [direction] it must to meet the specified
	 * radius.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/arcTo)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-arcto-dev)
	 */
	fun arcTo()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[beginPath] method of the Canvas 2D API starts a
	 * new path by emptying the list of sub-paths. Call this method when you want to
	 * create a new path. Note: To create a new sub-path, i.e., one matching the
	 * current [canvas] state, you can use [CanvasRenderingContext2D].[moveTo].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/beginPath)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-beginpath-dev)
	 */
	fun beginPath()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[bezierCurveTo] method of the Canvas 2D API adds
	 * a cubic Bézier curve to the current sub-path. It requires three points: the
	 * first two are control points and the third one is the end point. The starting
	 * point is the latest point in the current path, which can be changed using
	 * [moveTo] before creating the Bézier curve.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/bezierCurveTo)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-beziercurveto-dev)
	 */
	fun bezierCurveTo()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[clearRect] method of the Canvas 2D API erases
	 * the pixels in a rectangular area by setting them to transparent black. Note: Be
	 * aware that [clearRect] may cause unintended side effects if you're not using
	 * paths properly. Make sure to call [beginPath] before starting to draw new items
	 * after calling [clearRect].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/clearRect)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-clearrect-dev)
	 */
	fun clearRect()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[clip] method of the Canvas 2D API turns the
	 * current or given path into the current clipping region. The previous clipping
	 * region, if any, is intersected with the current or given path to create the new
	 * clipping region. In the image below, the red outline represents a clipping
	 * region shaped like a star. Only those parts of the checkerboard pattern that are
	 * within the clipping region get drawn. ![Star-shaped clipping region][] Note: Be
	 * aware that the clipping region is only constructed from shapes added to the
	 * path. It doesn't work with shape primitives drawn directly to the [canvas] such
	 * as [fillRect]. Instead, you'd have to use [rect] to add a rectangular shape to
	 * the path before calling [clip]. Note: Clip paths cannot be reverted directly.
	 * You must [save] your [canvas] state using [save] before calling [clip], and
	 * [restore] it once you have finished drawing in the clipped area using
	 * [restore].[Star-shaped clipping region]:
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/clip)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-clip-dev)
	 */
	fun clip()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[closePath] method of the Canvas 2D API attempts
	 * to add a straight line from the current point to the start of the current
	 * sub-path. If the shape has already been closed or has only one point, this
	 * function does nothing. This method doesn't draw anything to the [canvas]
	 * directly. You can render the path using the [stroke] or [fill] methods.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/closePath)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-closepath-dev)
	 */
	fun closePath()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[createConicGradient] method of the Canvas 2D
	 * API creates a gradient around a point with given coordinates. This method
	 * returns a conic `CanvasGradient`. To be applied to a shape, the gradient must
	 * first be assigned to the [fillStyle] or [strokeStyle] properties. Note: Gradient
	 * coordinates are global, i.e., relative to the current coordinate space. When
	 * applied to a shape, the coordinates are NOT relative to the shape's coordinates.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createConicGradient)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-createconicgradient-dev)
	 */
	fun createConicGradient()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[createImageData] method of the Canvas 2D API
	 * creates a new, blank [ImageData] object with the specified dimensions. All of
	 * the pixels in the new object are transparent black.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createImageData)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-createimagedata-dev)
	 */
	fun createImageData()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[createLinearGradient] method of the Canvas 2D
	 * API creates a gradient along the line connecting two given coordinates. ![The
	 * gradient transitions colors along the gradient line, starting at point x0, y0
	 * and going to x1, y1, even if those points extend the gradient line beyond the
	 * edges of the element on which the gradient is drawn.][The gradient transitions
	 * colors along the gradient line_ starting at point x0_ y0 and going to x1_ y1_
	 * even if those points extend the gradient line beyond the edges of the element on
	 * which the gradient is drawn.] This method returns a linear `CanvasGradient`. To
	 * be applied to a shape, the gradient must first be assigned to the [fillStyle] or
	 * [strokeStyle] properties. Note: Gradient coordinates are global, i.e., relative
	 * to the current coordinate space. When applied to a shape, the coordinates are
	 * NOT relative to the shape's coordinates.[The gradient transitions colors along
	 * the gradient line_ starting at point x0_ y0 and going to x1_ y1_ even if those
	 * points extend the gradient line beyond the edges of the element on which the
	 * gradient is drawn.]:
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createLinearGradient)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-createlineargradient-dev)
	 */
	fun createLinearGradient()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[createPattern] method of the Canvas 2D API
	 * creates a pattern using the specified image and repetition. This method returns
	 * a `CanvasPattern`. This method doesn't draw anything to the [canvas] directly.
	 * The pattern it creates must be assigned to the
	 * [CanvasRenderingContext2D].[fillStyle] or
	 * [CanvasRenderingContext2D].[strokeStyle] properties, after which it is applied
	 * to any subsequent drawing.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createPattern)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-createpattern-dev)
	 */
	fun createPattern()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[createRadialGradient] method of the Canvas 2D
	 * API creates a radial gradient using the size and coordinates of two circles.
	 * This method returns a `CanvasGradient`. To be applied to a shape, the gradient
	 * must first be assigned to the [fillStyle] or [strokeStyle] properties. Note:
	 * Gradient coordinates are global, i.e., relative to the current coordinate space.
	 * When applied to a shape, the coordinates are NOT relative to the shape's
	 * coordinates.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createRadialGradient)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-createradialgradient-dev)
	 */
	fun createRadialGradient()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[drawFocusIfNeeded] method of the Canvas 2D API
	 * draws a focus ring around the current or given path, if the specified element is
	 * focused.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawFocusIfNeeded)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-drawfocusifneeded-dev)
	 */
	fun drawFocusIfNeeded()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[drawImage] method of the Canvas 2D API provides
	 * different ways to draw an image onto the [canvas].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-drawimage-dev)
	 */
	fun drawImage()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[ellipse] method of the Canvas 2D API adds an
	 * elliptical [arc] to the current sub-path.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/ellipse)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-ellipse-dev)
	 */
	fun ellipse()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[fill] method of the Canvas 2D API fills the
	 * current or given path with the current [fillStyle].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fill)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-fill-dev)
	 */
	fun fill()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[fillRect] method of the Canvas 2D API draws a
	 * rectangle that is filled according to the current [fillStyle]. This method draws
	 * directly to the [canvas] without modifying the current path, so any subsequent
	 * [fill] or [stroke] calls will have no effect on it.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillRect)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-fillrect-dev)
	 */
	fun fillRect()
	
	
	/**
	 *  The [CanvasRenderingContext2D] method [fillText], part of the Canvas 2D API,
	 * draws a text string at the specified coordinates, filling the string's
	 * characters with the current [fillStyle]. An optional parameter allows specifying
	 * a maximum [width] for the rendered text, which the user agent will achieve by
	 * condensing the text or by using a lower [font] size. This method draws directly
	 * to the [canvas] without modifying the current path, so any subsequent [fill] or
	 * [stroke] calls will have no effect on it. The text is rendered using the [font]
	 * and text layout configuration as defined by the [font], [textAlign],
	 * [textBaseline], and [direction] properties. Note: To draw the outlines of the
	 * characters in a string, call the context's [strokeText] method.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillText)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-filltext-dev)
	 */
	fun fillText()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[getContextAttributes] method returns an object
	 * that contains attributes used by the context. Note that context attributes may
	 * be requested when creating the context with [HTMLCanvasElement].[getContext],
	 * but the attributes that are actually supported and used may differ.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/getContextAttributes)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#2dcontext:dom-context-2d-canvas-getcontextattributes-2)
	 */
	fun getContextAttributes()
	
	
	/**
	 *  The [CanvasRenderingContext2D] method [getImageData] of the Canvas 2D API
	 * returns an [ImageData] object representing the underlying pixel [data] for a
	 * specified portion of the [canvas]. This method is not affected by the canvas's
	 * transformation matrix. If the specified rectangle extends outside the bounds of
	 * the [canvas] the pixels outside the [canvas] are transparent black in the
	 * returned [ImageData] object. Note: Image [data] can be painted onto a [canvas]
	 * using the [putImageData] method. You can find more information about
	 * [getImageData] and general manipulation of [canvas] contents in Pixel
	 * manipulation with [canvas].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/getImageData)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-getimagedata-dev)
	 */
	fun getImageData()
	
	
	/**
	 *  The [getLineDash] method of the Canvas 2D API's [CanvasRenderingContext2D]
	 * interface gets the current line dash pattern.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/getLineDash)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-getlinedash-dev)
	 */
	fun getLineDash()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[getTransform] method of the Canvas 2D API
	 * retrieves the current transformation matrix being applied to the context.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/getTransform)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-gettransform-dev)
	 */
	fun getTransform()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[isContextLost] method of the Canvas 2D API
	 * returns `true` if the rendering context is lost (and has not yet been [reset].
	 * This might occur due to driver crashes, running out of memory, and so on. If the
	 * user agent detects that the [canvas] backing storage is lost it will fire the
	 * `contextlost` event at the associated [HTMLCanvasElement]. If this event is not
	 * cancelled it will attempt to [reset] the backing storage to the default state
	 * (this is equivalent to calling [CanvasRenderingContext2D].[reset]). On success
	 * it will fire the `contextrestored` event, indicating that the context is ready
	 * to reinitialize and redraw.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/isContextLost)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-iscontextlost)
	 */
	fun isContextLost()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[isPointInPath] method of the Canvas 2D API
	 * reports whether or not the specified point is contained in the current path.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/isPointInPath)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-ispointinpath-dev)
	 */
	fun isPointInPath()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[isPointInStroke] method of the Canvas 2D API
	 * reports whether or not the specified point is inside the area contained by the
	 * stroking of a path.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/isPointInStroke)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-ispointinstroke-dev)
	 */
	fun isPointInStroke()
	
	
	/**
	 *  The [CanvasRenderingContext2D] method [lineTo], part of the Canvas 2D API, adds
	 * a straight line to the current sub-path by connecting the sub-path's last point
	 * to the specified `(x, y)` coordinates. Like other methods that modify the
	 * current path, this method does not directly render anything. To draw the path
	 * onto a [canvas] you can use the [fill] or [stroke] methods.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineTo)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-lineto-dev)
	 */
	fun lineTo()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[measureText] method returns a [TextMetrics]
	 * object that contains information about the measured text (such as its [width]
	 * for example).
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/measureText)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-measuretext-dev)
	 */
	fun measureText()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[moveTo] method of the Canvas 2D API begins a
	 * new sub-path at the point specified by the given `(x, y)` coordinates.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/moveTo)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-moveto-dev)
	 */
	fun moveTo()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[putImageData] method of the Canvas 2D API
	 * paints [data] from the given [ImageData] object onto the [canvas]. If a dirty
	 * rectangle is provided, only the pixels from that rectangle are painted. This
	 * method is not affected by the [canvas] transformation matrix. Note: Image [data]
	 * can be retrieved from a [canvas] using the [getImageData] method. You can find
	 * more information about [putImageData] and general manipulation of [canvas]
	 * contents in the article Pixel manipulation with [canvas].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/putImageData)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-putimagedata-dev)
	 */
	fun putImageData()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[quadraticCurveTo] method of the Canvas 2D API
	 * adds a quadratic Bézier curve to the current sub-path. It requires two points:
	 * the first one is a control point and the second one is the end point. The
	 * starting point is the latest point in the current path, which can be changed
	 * using [moveTo] before creating the quadratic Bézier curve.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/quadraticCurveTo)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-quadraticcurveto-dev)
	 */
	fun quadraticCurveTo()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[rect] method of the Canvas 2D API adds a
	 * rectangle to the current path. Like other methods that modify the current path,
	 * this method does not directly render anything. To draw the rectangle onto a
	 * [canvas] you can use the [fill] or [stroke] methods. Note: To both create and
	 * render a rectangle in one step, use the [fillRect] or [strokeRect] methods.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/rect)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-rect-dev)
	 */
	fun rect()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[reset] method of the Canvas 2D API resets the
	 * rendering context to its default state, allowing it to be reused for drawing
	 * something else without having to explicitly [reset] all the properties.
	 * Resetting clears the backing buffer, drawing state stack, any defined paths, and
	 * styles. This includes the current transformation matrix, compositing properties,
	 * clipping region, dash list, line styles, text styles, shadows, image smoothing,
	 * filters, and so on.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/reset)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-reset)
	 */
	fun reset()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[resetTransform] method of the Canvas 2D API
	 * resets the current [transform] to the identity matrix.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/resetTransform)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-resettransform-dev)
	 */
	fun resetTransform()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[restore] method of the Canvas 2D API restores
	 * the most recently saved [canvas] state by popping the top entry in the drawing
	 * state stack. If there is no saved state, this method does nothing. For more
	 * information about the drawing state, see [CanvasRenderingContext2D].[save].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/restore)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-restore-dev)
	 */
	fun restore()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[rotate] method of the Canvas 2D API adds a
	 * rotation to the transformation matrix.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/rotate)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-rotate-dev)
	 */
	fun rotate()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[roundRect] method of the Canvas 2D API adds a
	 * rounded rectangle to the current path. The radii of the corners can be specified
	 * in much the same way as the CSS `border-radius` property. Like other methods
	 * that modify the current path, this method does not directly render anything. To
	 * draw the rounded rectangle onto a [canvas] you can use the [fill] or [stroke]
	 * methods.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/roundRect)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-roundrect)
	 */
	fun roundRect()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[save] method of the Canvas 2D API saves the
	 * entire state of the [canvas] by pushing the current state onto a stack.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/save)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-save-dev)
	 */
	fun save()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[scale] method of the Canvas 2D API adds a
	 * scaling transformation to the [canvas] units horizontally and/or vertically. By
	 * default, one unit on the [canvas] is exactly one pixel. A scaling transformation
	 * modifies this behavior. For instance, a scaling factor of 0.5 results in a unit
	 * size of 0.5 pixels; shapes are thus drawn at half the normal size. Similarly, a
	 * scaling factor of 2.0 increases the unit size so that one unit becomes two
	 * pixels; shapes are thus drawn at twice the normal size.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/scale)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-scale-dev)
	 */
	fun scale()
	
	
	/**
	 *  Experimental: This is an experimental technology  Check the Browser
	 * compatibility table carefully before using this in production. The
	 * [CanvasRenderingContext2D].[scrollPathIntoView] method of the Canvas 2D API
	 * scrolls the current or given path into view. It is similar to
	 * `Element.scrollIntoView`.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/scrollPathIntoView)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-scrollpathintoview-dev)
	 */
	fun scrollPathIntoView()
	
	
	/**
	 *  The [setLineDash] method of the Canvas 2D API's [CanvasRenderingContext2D]
	 * interface sets the line dash pattern used when stroking lines. It uses an array
	 * of values that specify alternating lengths of lines and gaps which describe the
	 * pattern. Note: To return to using solid lines, set the line dash list to an
	 * empty array.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setLineDash)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-setlinedash-dev)
	 */
	fun setLineDash()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[setTransform] method of the Canvas 2D API
	 * resets (overrides) the current transformation to the identity matrix, and then
	 * invokes a transformation described by the arguments of this method. This lets
	 * you [scale] [rotate] [translate] (move), and skew the context. Note: See also
	 * the [transform] method; instead of overriding the current [transform] matrix, it
	 * multiplies it with a given one.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setTransform)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-settransform-dev)
	 */
	fun setTransform()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[stroke] method of the Canvas 2D API strokes
	 * (outlines) the current or given path with the current [stroke] style. Strokes
	 * are aligned to the center of a path; in other words, half of the [stroke] is
	 * drawn on the inner side, and half on the outer side. The [stroke] is drawn using
	 * the [non-zero winding rule][], which means that path intersections will still
	 * get filled.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/stroke)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-stroke-dev)
	 * * [[non-zero winding rule](https://en.wikipedia.org/wiki/Nonzero-rule)
	 */
	fun stroke()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[strokeRect] method of the Canvas 2D API draws a
	 * rectangle that is stroked (outlined) according to the current [strokeStyle] and
	 * other context settings. This method draws directly to the [canvas] without
	 * modifying the current path, so any subsequent [fill] or [stroke] calls will have
	 * no effect on it.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/strokeRect)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-strokerect-dev)
	 */
	fun strokeRect()
	
	
	/**
	 *  The [CanvasRenderingContext2D] method [strokeText], part of the Canvas 2D API,
	 * strokes — that is, draws the outlines of — the characters of a text string at
	 * the specified coordinates. An optional parameter allows specifying a maximum
	 * [width] for the rendered text, which the user agent will achieve by condensing
	 * the text or by using a lower [font] size. This method draws directly to the
	 * [canvas] without modifying the current path, so any subsequent [fill] or
	 * [stroke] calls will have no effect on it. Note: Use the [fillText] method to
	 * [fill] the text characters rather than having just their outlines drawn.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/strokeText)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-stroketext-dev)
	 */
	fun strokeText()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[transform] method of the Canvas 2D API
	 * multiplies the current transformation with the matrix described by the arguments
	 * of this method. This lets you [scale] [rotate] [translate] (move), and skew the
	 * context. Note: See also the [setTransform] method, which resets the current
	 * [transform] to the identity matrix and then invokes [transform].
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/transform)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-transform-dev)
	 */
	fun transform()
	
	
	/**
	 *  The [CanvasRenderingContext2D].[translate] method of the Canvas 2D API adds a
	 * translation transformation to the current matrix.
	 *
	 * See further documentation:
	 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/translate)
	 * * [Khronos Group](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-translate-dev)
	 */
	fun translate()
	
	
}

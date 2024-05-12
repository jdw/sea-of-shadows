package com.github.jdw.seaofshadows.shared.webgl.interfaces

/**
 * The WebGLShaderPrecisionFormat interface is part of the WebGL API and represents the information returned by calling the [WebGLRenderingContext.getShaderPrecisionFormat] method.
 *
 * See more: https://developer.mozilla.org/en-US/docs/Web/API/WebGLShaderPrecisionFormat
 */
interface WebGLShaderPrecisionFormat {
    /**
     * The base 2 log of the absolute value of the minimum value that can be represented.
     */
    val rangeMin: Int

    /**
     * The base 2 log of the absolute value of the maximum value that can be represented.
     */
    val rangeMax: Int

    /**
     * The number of bits of precision that can be represented. For integer formats this value is always 0.
     */
    val precision: Int
}

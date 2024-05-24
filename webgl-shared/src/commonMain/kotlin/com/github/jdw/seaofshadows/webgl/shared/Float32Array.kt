package com.github.jdw.seaofshadows.webgl.shared
//PROTECT_FROM_AUTODELETE

/**
 * Copy from [Kotlin 2.0.0](https://github.com/JetBrains/kotlin/blob/037b3697ed635a52c283da7b2bf6ecd0961ce8f4/libraries/stdlib/js/src/org.w3c/org.khronos.webgl.kt#L1214) STDLib for JS
 *
 * More over at [ECMA internationals](https://262.ecma-international.org/6.0/#sec-typedarray-objects) official homepage.
 * Exposes the JavaScript [Float32Array](https://developer.mozilla.org/en/docs/Web/API/Float32Array) to Kotlin
 *
 * Changes:
 * * Modifier "external" was removed
 * * Modifier "open" was removed in favour for "abstract"
 * * For both functions "set(" was given the "abstract" modifier and the parameter "offset" had it's default value of "definedExternally" removed
 * * Function "subarray" was given the "abstract" modifier
 * * Properties "buffer", "byteOffset" and "byteLength" where all given the "abstract" modifier.
 * * For the constructors the default parameter values "definedExternally" was removed.
 * * Property "BYTES_PER_ELEMENT" where given the "abstract" modifier and moved out of companion object definition
 */
public abstract class Float32Array : ArrayBufferView, TypedArray {
    constructor(length: Int)
    constructor(array: Float32Array)
    constructor(array: Array<Float>)
    constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)

    abstract val length: Int
    abstract override val buffer: ArrayBuffer
    abstract override val byteOffset: Int
    abstract override val byteLength: Int
    abstract val BYTES_PER_ELEMENT: Int //TODO Should be 4? Move back to companion object?

    abstract fun set(array: Float32Array, offset: Int)
    abstract fun set(array: Array<Float>, offset: Int)
    abstract fun subarray(start: Int, end: Int): Float32Array
}
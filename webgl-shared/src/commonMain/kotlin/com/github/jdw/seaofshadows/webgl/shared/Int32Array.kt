package com.github.jdw.seaofshadows.webgl.shared
//PROTECT_FROM_AUTODELETE

/**
 * Copy from [Kotlin 2.0.0](https://github.com/JetBrains/kotlin/blob/037b3697ed635a52c283da7b2bf6ecd0961ce8f4/libraries/stdlib/js/src/org.w3c/org.khronos.webgl.kt#L1214) STDLib for JS
 *
 * More over at [ECMA internationals](https://262.ecma-international.org/6.0/#sec-typedarray-objects) official homepage.
 * Exposes the JavaScript [Float32Array](https://developer.mozilla.org/en/docs/Web/API/Float32Array) to Kotlin
 *
 * Changes made:
 * * All "definedExternally" default parameter values removed.
 * * The class' modifiers "external" and "open" was removed in favour for "abstract"
 * * "abstract" modifier applied to all members - both functions and properties.
 * * Property "BYTES_PER_ELEMENT" where given the "abstract" modifier and moved out of companion object definition
 */
public abstract class Int32Array : ArrayBufferView, TypedArray {
    constructor(length: Int)
    constructor(array: Int32Array)
    constructor(array: Array<Int>)
    constructor(buffer: ArrayBuffer, byteOffset: Int , length: Int)

    abstract val length: Int
    abstract override val buffer: ArrayBuffer
    abstract override val byteOffset: Int
    abstract override val byteLength: Int
    abstract fun set(array: Int32Array, offset: Int)
    abstract fun set(array: Array<Int>, offset: Int)
    abstract fun subarray(start: Int, end: Int): Int32Array
    abstract val BYTES_PER_ELEMENT: Int
}
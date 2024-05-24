package com.github.jdw.seaofshadows.webgl.shared
//PROTECT_FROM_AUTODELETE

/**
 * Copy from [Kotlin 2.0.0](https://github.com/JetBrains/kotlin/blob/037b3697ed635a52c283da7b2bf6ecd0961ce8f4/libraries/stdlib/js/src/org.w3c/org.khronos.webgl.kt#L1214)
 * STDLib for JS
 *
 * External docs:
 * * [Mozilla](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer)
 *
 * Changes:
 * * "external" modifier was removed.
 * * "open" was removed in favour for "abstract".
 * * "slice" method was made abstract and "end" parameter had its default value removed (it used to be "definedExternally").
 * * "isView" method was given a body.
 */
public abstract class ArrayBuffer(length: Int) : BufferDataSource {
    abstract val byteLength: Int
    abstract fun slice(begin: Int, end: Int): ArrayBuffer

    companion object {
        fun isView(value: Any?): Boolean = value is ArrayBufferView
    }
}
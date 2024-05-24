package com.github.jdw.seaofshadows.webgl.shared
//PROTECT_FROM_AUTODELETE

/**
 * Copy from [Kotlin 2.0.0](https://github.com/JetBrains/kotlin/blob/037b3697ed635a52c283da7b2bf6ecd0961ce8f4/libraries/stdlib/js/src/org.w3c/org.khronos.webgl.kt#L1214)
 * STDLib for JS
 *
 * Changes:
 * * only "external" modifier was removed.
 */
public interface ArrayBufferView : BufferDataSource {
    val buffer: ArrayBuffer
    val byteOffset: Int
    val byteLength: Int
}
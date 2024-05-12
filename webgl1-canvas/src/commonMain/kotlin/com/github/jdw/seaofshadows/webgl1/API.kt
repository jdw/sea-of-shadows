package com.github.jdw.seaofshadows.webgl1

import com.github.jdw.seaofshadows.core.Context
import com.github.jdw.seaofshadows.core.dom.Canvas
import com.github.jdw.seaofshadows.core.dom.RenderContext
import com.github.jdw.seaofshadows.core.messaging.Render
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


class WebGL1(canvas: Canvas): RenderContext(Context.WEBGL1, canvas) {
    @OptIn(ExperimentalSerializationApi::class)
    suspend fun clear(mask: Int) {
        val parameters = Json.encodeToString(mask)
        sendRenderMessage(Render.Method.CLEAR, parameters)
    }

    @OptIn(ExperimentalSerializationApi::class)
    suspend fun clearColor(red: Double, green: Double, blue: Double, alpha: Double) {
        val parameters = Json.encodeToString(listOf(red, green, blue, alpha))
        sendRenderMessage(Render.Method.CLEAR_COLOR, parameters)
    }

    // Constants
    val DEPTH_BUFFER_BIT = 0x00000100

    /**
     * Passed to clear to clear the current color buffer.
     */
    val COLOR_BUFFER_BIT = 0x00004000
}


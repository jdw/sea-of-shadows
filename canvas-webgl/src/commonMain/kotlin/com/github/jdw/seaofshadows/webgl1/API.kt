package com.github.jdw.seaofshadows.webgl1

import com.github.jdw.seaofshadows.core.Context
import com.github.jdw.seaofshadows.core.dom.Canvas
import com.github.jdw.seaofshadows.core.dom.RenderContext
import com.github.jdw.seaofshadows.core.messages.Render
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.protobuf.ProtoBuf

var state: Long = 0

class WebGL(canvas: Canvas): RenderContext(Context.WEBGL1, canvas) {
    @OptIn(ExperimentalSerializationApi::class)
    fun clear(mask: Int) {
        val payload = ProtoBuf.encodeToByteArray(Payload.Clear(mask))
        state += 1
        val message = Render.Message(canvas.id, Render.Method.CLEAR, state, payload)

    }

    @OptIn(ExperimentalSerializationApi::class)
    fun clearColor(red: Double, green: Double, blue: Double, alpha: Double) {
        val payload = ProtoBuf.encodeToByteArray(Payload.ClearColor(red.toFloat(), green.toFloat(), blue.toFloat(), alpha.toFloat()))
        state += 1
        val message = Render.Message(canvas.id, Render.Method.CLEAR_COLOR, state, payload)
//        throw Exception("SiC")
    }
}

package com.github.jdw.seaofshadows.core.dom

import com.github.jdw.seaofshadows.core.Context
import com.github.jdw.seaofshadows.core.messaging.Render
import com.github.jdw.seaofshadows.core.messaging.ResultMessage
import kotlinx.serialization.ExperimentalSerializationApi

abstract class RenderContext(val context: Context, val canvas: Canvas) {
    var state: Long = 0

    @OptIn(ExperimentalSerializationApi::class)
    suspend fun sendRenderMessage(method: Render.Method, parameters: String) {
        val rm = Render.Message(method, state, parameters)
        state += 1

        canvas.send(rm) { em: ResultMessage ->
            println("Recieved result message: $em")
            em.throwOrNull()
        }
    }
}
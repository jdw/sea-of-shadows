package com.github.jdw.seaofshadows

import com.github.jdw.seaofshadows.core.MeansOfCommunication
import com.github.jdw.seaofshadows.core.Settings
import com.github.jdw.seaofshadows.core.messages.Render
import com.github.jdw.seaofshadows.webgl1.Payload
import io.ktor.client.*
import io.ktor.client.plugins.websocket.*
import io.ktor.http.*
import io.ktor.websocket.*
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.await
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromDynamic
import kotlinx.serialization.protobuf.ProtoBuf
import org.khronos.webgl.WebGLRenderingContext
import kotlin.js.Promise

class Terminal {
    @OptIn(ExperimentalSerializationApi::class)
    suspend fun run(settingsUrl: String) {
        val json = Promise.resolve(window.fetch(settingsUrl).then {response->
            response.json()
        }.then {
            it
        }).await()

        val settings = Json.decodeFromDynamic<Settings>(json)

        val client = HttpClient {
            install(WebSockets) {
                maxFrameSize = Long.MAX_VALUE
            }
        }

        client.webSocket(method = HttpMethod.Get, host = "localhost", port = 9000, path = settings.endpoints[MeansOfCommunication.WEBSOCKET]!!) {
            while(true) {
                println("Waiting for incoming message...")
                val incomingMessage = incoming.receive() as? Frame.Binary
                val renderMessagePayload = incomingMessage!!.readBytes()

                val renderMessage: Render.Message = ProtoBuf.decodeFromByteArray(renderMessagePayload)
                val canvas = document.getElementById(renderMessage.id)!!.asDynamic()

                val gl: WebGLRenderingContext = canvas.getContext("webgl")
                when (renderMessage.method) {
                    Render.Method.CLEAR -> {
                        println("Received clear method message...")
                        val clear: Payload.Clear = ProtoBuf.decodeFromByteArray(renderMessage.payload)
                        gl.clear(clear.mask)
                    }
                    Render.Method.CLEAR_COLOR -> {
                        println("Received clearColor method message...")
                        val clearColor: Payload.ClearColor = ProtoBuf.decodeFromByteArray(renderMessage.payload)
                        gl.clearColor(clearColor.red, clearColor.green, clearColor.blue, clearColor.alpha)
                    }
                }

                println("Sending ack for state ${renderMessage.state}...")
                val ack = ProtoBuf.encodeToByteArray(Render.Ack(renderMessage.state))
                send(Frame.Binary(false, ack))
            }
        }

        client.close()

    }
}
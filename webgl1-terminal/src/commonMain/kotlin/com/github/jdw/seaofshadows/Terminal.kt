package com.github.jdw.seaofshadows

import com.github.jdw.seaofshadows.core.Settings
import com.github.jdw.seaofshadows.core.messaging.Protocol
import com.github.jdw.seaofshadows.core.messaging.Render
import com.github.jdw.seaofshadows.core.messaging.ResultMessage
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
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromDynamic
import kotlinx.serialization.protobuf.ProtoBuf
import org.khronos.webgl.WebGLRenderingContext
import org.w3c.dom.HTMLCanvasElement
import kotlin.js.Promise

class Terminal {
    @OptIn(ExperimentalSerializationApi::class)
    suspend fun fetchSettings(url: String): Settings {
        val json = Promise.resolve(window.fetch(url).then {response->
            response.json()
        }.then {
            it
        }).await()

        // println(json)
        return Json.decodeFromDynamic(json)
    }
    @OptIn(ExperimentalSerializationApi::class)
    suspend fun run(settings: Settings) {
        val client = HttpClient {
            install(WebSockets) {
                maxFrameSize = Long.MAX_VALUE
            }
        }

        val host = window.location.host.split(":").first()
        println("host = $host")
        println("port = ${window.location.port}")
        println("path = ${settings.endpoints[Protocol.Supported.WEBSOCKET]!!}")

        client.webSocket(method = HttpMethod.Get, host = host, port = window.location.port.toInt(), path = settings.endpoints[Protocol.Supported.WEBSOCKET]!!) {
            println("Inside client.webSocket...")
            val canvas = document.getElementById(settings.expectedCanvasIds.first()) as HTMLCanvasElement
            val gl = canvas.getContext("webgl") as WebGLRenderingContext

            // No exception so far so must be OK
            outgoing.send(Frame.Text(Protocol.SystemTalk.TALK_PROTOBUF.name))
            outgoing.send(Frame.Text(Protocol.SystemTalk.CONTEXT_WEBGL1_OK.name))

            for (frame in incoming) {
                (frame as? Frame.Text)?.let { text ->
                    //SerializationTarget.PROTOBUF -> ProtoBuf.encodeToByteArray(rm).decodeToString()
                    val rm: Render.Message = ProtoBuf.decodeFromByteArray(text.readBytes())

                    var result = "OK"
                    try {
                        when (rm.method) {
                            Render.Method.CLEAR -> {
                                val mask: Int = Json.decodeFromString(rm.parameters)
                                gl.clear(mask)
                            }

                            Render.Method.CLEAR_COLOR -> {
                                val parameters: List<Float> = Json.decodeFromString(rm.parameters)
                                gl.clearColor(parameters[0], parameters[1], parameters[2], parameters[3])
                            }
                        }
                    }
                    catch(e: Exception) {
                        result = e.message
                            ?: "Exception without message set found!"
                        result = Json.encodeToString(result)
                    }

                    outgoing.send(Frame.Text(ProtoBuf.encodeToByteArray(ResultMessage(result, rm.state)).decodeToString()))
                }
            }
        }

        client.close()
    }
}
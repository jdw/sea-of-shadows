package com.github.jdw.seaofshadows.core.dom

import com.github.jdw.seaofshadows.core.messaging.Render
import com.github.jdw.seaofshadows.core.messaging.ResultMessage
import com.github.jdw.seaofshadows.core.messaging.SerializationTarget
import kotlinx.coroutines.channels.Channel
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.protobuf.ProtoBuf

class Canvas(val id: String, val renderChannel: Channel<String>, val serializationTarget: SerializationTarget) {
    @OptIn(ExperimentalSerializationApi::class)
    suspend fun send(rm: Render.Message, block: (ResultMessage) -> Unit) {
        val payload = when (serializationTarget) {
            SerializationTarget.JSON -> {
                val format = Json {
                    encodeDefaults = true
                    prettyPrint = true
                }
                format.encodeToString(rm)
            }
            SerializationTarget.PROTOBUF -> ProtoBuf.encodeToByteArray(rm).decodeToString()
        }

        renderChannel.send(payload)

        val receivedData = renderChannel.receive()

        val resultMessage: ResultMessage = when (serializationTarget) {
            SerializationTarget.PROTOBUF -> ProtoBuf.decodeFromByteArray(receivedData.encodeToByteArray())
            SerializationTarget.JSON -> Json.decodeFromString(receivedData)
        }

        block.invoke(resultMessage)
    }
}
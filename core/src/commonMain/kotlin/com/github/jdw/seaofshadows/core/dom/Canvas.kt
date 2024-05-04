package com.github.jdw.seaofshadows.core.dom

import com.github.jdw.seaofshadows.core.messages.Render
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.protobuf.ProtoBuf


class Canvas(val id: String, val document: Document) {
    @OptIn(ExperimentalSerializationApi::class)
    suspend fun send(message: Render.Message, block: (EventResult) -> Unit) {
        document.send(
            event = Event.METHOD_CALL,
            payload = ProtoBuf.encodeToByteArray(message),
            block = { eventResult: EventResult ->
                block.invoke(eventResult)
            })


    }
}
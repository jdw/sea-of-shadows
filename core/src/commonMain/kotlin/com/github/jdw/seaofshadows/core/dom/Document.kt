package com.github.jdw.seaofshadows.core.dom

import com.github.jdw.seaofshadows.core.Session
import com.github.jdw.seaofshadows.core.dom.Document.Method
import com.github.jdw.seaofshadows.core.dom.Document.GetElementById
import kotlinx.coroutines.channels.Channel
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.protobuf.ProtoBuf

/**
 * @param c The channel to render to
 * @param session The users session
 */
class Document(val c: Channel<ByteArray>, val session: Session) {
    enum class Method {
        GET_ELEMENT_BY_ID
    }

    data class Message(val method: Document.Method, val payload: ByteArray)

    suspend fun send(event: Event, payload: ByteArray, block: (EventResult) -> Unit) {
        throw Exception("No code here!")
    }

    class GetElementById {
        @Serializable
        data class Request(val id: String)

        @Serializable
        data class Result(val status: Response)

        enum class Response {
            OK,
            NULL
        }
    }
}

/**
 * @see https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementById
 * @param id The ID of the requested element
 */
@OptIn(ExperimentalSerializationApi::class)
suspend fun Document.getElementById(id: String): Canvas {
    val message = GetElementById.Request(id)
    val payload = ProtoBuf.encodeToByteArray(message)
    val event = Document.Message(Method.GET_ELEMENT_BY_ID, payload)

    c.send(ProtoBuf.encodeToByteArray(event))
    val result = ProtoBuf.decodeFromByteArray<GetElementById.Result>(c.receive())

    return when (result.status) {
        GetElementById.Response.OK -> Canvas(id, this)
        GetElementById.Response.NULL -> throw Exception("No such element '$id'!")
    }
}

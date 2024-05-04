package com.github.jdw.seaofshadows.core.messages

import com.github.jdw.seaofshadows.core.Context
import kotlinx.serialization.Serializable

class Render {
    @Serializable
    data class Ack(val state: Long)

    @Serializable
    data class Message(val id: String, val method: Method, val state: Long, val payload: ByteArray)

    enum class Method {
        CLEAR,
        CLEAR_COLOR;
    }
}
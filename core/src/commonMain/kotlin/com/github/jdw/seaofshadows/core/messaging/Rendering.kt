package com.github.jdw.seaofshadows.core.messaging

import kotlinx.serialization.Serializable

class Render {
    @Serializable
    data class Message(val method: Method, val state: Long, val parameters: String)

    enum class Method {
        CLEAR,
        CLEAR_COLOR;
    }
}
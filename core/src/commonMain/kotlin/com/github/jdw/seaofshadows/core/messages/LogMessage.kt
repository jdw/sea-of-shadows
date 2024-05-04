package com.github.jdw.seaofshadows.core.messages

import kotlinx.serialization.Serializable

class Log {
    @Serializable
    data class Message(val payload: ByteArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class != other::class) return false

            other as Message

            return payload.contentEquals(other.payload)
        }

        override fun hashCode(): Int {
            return payload.contentHashCode()
        }
    }
}
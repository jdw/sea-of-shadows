package com.github.jdw.seaofshadows.core.messages

import kotlinx.serialization.Serializable

class Base {
    enum class Classifications {
        STATUS,
        RENDER_2D,
        RENDER_WEBGL,
        RENDER_WEBGPU,
        LOG,
        INPUT,
        STREAM;
    }

    @Serializable
    data class Message(val classification: Classifications, val payload: ByteArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class != other::class) return false

            other as Message

            if (classification != other.classification) return false
            if (!payload.contentEquals(other.payload)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = classification.hashCode()
            result = 31 * result + payload.contentHashCode()
            return result
        }
    }
}


package com.github.jdw.seaofshadows.core.messages

import com.github.jdw.seaofshadows.core.Session
import kotlinx.coroutines.channels.Channel
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.protobuf.ProtoBuf
import kotlin.native.concurrent.ThreadLocal

@ThreadLocal
internal object Passing {
    private val sessionToChannel: MutableMap<Session, Channel<ByteArray>> = mutableMapOf()

    @OptIn(ExperimentalSerializationApi::class)
    suspend fun sendTo(
        session: Session,
        message: Base.Message //TODO maybe
    ) {
        val channel = sessionToChannel[session]
            ?: throw NullPointerException("Session '$session' had no channel to send '$message' to! :(")

        channel.send(ProtoBuf.encodeToByteArray(message))
    }

    fun addRenderChannel(session: Session, channel: Channel<ByteArray>) {
        if (sessionToChannel.containsKey(session))
            throw Exception("Session '$session' already has a channel!")

        channel.invokeOnClose {
            println("invokeOnClose for session '$session'")
            sessionToChannel.remove(session)
            channel.close()
        }

        sessionToChannel[session] = channel
    }
}

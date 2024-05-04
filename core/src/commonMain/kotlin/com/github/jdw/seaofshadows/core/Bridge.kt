package com.github.jdw.seaofshadows.core

import com.github.jdw.seaofshadows.core.messages.Channels
import kotlinx.coroutines.channels.Channel

class Bridge(private val channels: Map<Channels, Channel<ByteArray>>,
             private val outgoing: ((ByteArray) -> Unit),
             private val incoming: ((ByteArray) -> Unit),
             /**
              * Server takes initiative to close socket
              */
             private val closeSocket: (() -> Unit),
             private val arcs: Map<Channels, Arc>
    ) {
    var otherSideOk: Boolean = false
        get() {
            return field
        }
        set(value) { field = value }

    /**
     * Client takes initiative to close the connection
     */
    fun onClose() {
        channels.forEach { entry: Map.Entry<Channels, Channel<ByteArray>> ->
            val channel = entry.value
            channel.close()
        }
    }

    companion object {
        class Builder() {
            private var outgoing: ((ByteArray) -> Unit)? = null
            private var incoming: ((ByteArray) -> Unit)? = null
            private var closeSocket: (() -> Unit)? = null
            private var arcs: MutableMap<Channels, Arc> = mutableMapOf()
            private var channels: MutableMap<Channels, Channel<ByteArray>> = mutableMapOf()

            fun statusArc(arc: Arc): Builder {
                arcs[Channels.STATUS] = arc
                return this
            }

            fun arcForRenderMessages(arc: Arc): Builder {
                arcs[Channels.RENDER] = arc
                return this
            }

            fun arcForLogMessages(arc: Arc): Builder {
                arcs[Channels.LOG] = arc
                return this
            }

            fun statusChannel(c: Channel<ByteArray>): Builder {
                channels[Channels.STATUS]
                return this
            }

            fun renderChannel(c: Channel<ByteArray>): Builder {
                channels[Channels.RENDER] = c
                return this
            }

            fun logChannel(c: Channel<ByteArray>): Builder {
                channels[Channels.LOG] = c
                return this
            }

            fun outgoing(block: (ByteArray) -> Unit): Builder {
                outgoing = block
                return this
            }

            fun incoming(block: (ByteArray) -> Unit): Builder {
                incoming = block
                return this
            }

            fun closeSocket(block: () -> Unit): Builder {
                closeSocket = block
                return this
            }

            fun build(): Bridge {

                val outgoing = outgoing
                    ?: throw Exception("Lambda for outgoing messages was not set!")
                val incoming = incoming
                    ?: throw Exception("Lambda for outgoing messages was not set!")
                val closeSocket = closeSocket
                    ?: throw Exception("Lambda to close socket on server side was not set!")
                arcs[Channels.RENDER]
                    ?: throw NullPointerException("Arc for rendering not set!")
                arcs[Channels.LOG]
                    ?: throw NullPointerException("Arc for logging not set!")
                arcs[Channels.STATUS]
                    ?: throw NullPointerException("Arc for status updates not set!")
                channels[Channels.RENDER]
                    ?: throw NullPointerException("Channel for rendering not set!")
                channels[Channels.LOG]
                    ?: throw NullPointerException("Channel for logging not set!")
                channels[Channels.STATUS]
                    ?: throw NullPointerException("Channel for status updates not set!")

                return Bridge(
                    channels = channels.toMap(),
                    outgoing = outgoing,
                    incoming = incoming,
                    closeSocket = closeSocket,
                    arcs = arcs.toMap())
            }
        }
    }
}
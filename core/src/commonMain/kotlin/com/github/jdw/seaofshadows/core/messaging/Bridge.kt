package com.github.jdw.seaofshadows.core.messaging

import kotlinx.coroutines.channels.Channel

class Bridge(val channels: Map<Channels, Channel<ByteArray>>,
             val outgoing: ((ByteArray) -> Unit),
             val incoming: ((ByteArray) -> Unit),
             /**
              * Server takes initiative to close socket
              */
             val closeSocket: (() -> Unit),
             val arcs: Map<Channels, Arc>
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
        fun build(): Builder = Builder()

        class Builder() {
            private var outgoing: ((ByteArray) -> Unit)? = null
            private var incoming: ((ByteArray) -> Unit)? = null
            private var closeSocket: (() -> Unit)? = null
            private var arcs: MutableMap<Channels, Arc> = mutableMapOf()
            private var channels: MutableMap<Channels, Channel<ByteArray>> = mutableMapOf()

            fun renderArc(arc: Arc): Builder {
                arcs[Channels.RENDER] = arc
                return this
            }

            fun logArc(arc: Arc): Builder {
                arcs[Channels.LOG] = arc
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
                channels[Channels.RENDER]
                    ?: throw NullPointerException("Channel for rendering not set!")
                channels[Channels.LOG]
                    ?: throw NullPointerException("Channel for logging not set!")

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
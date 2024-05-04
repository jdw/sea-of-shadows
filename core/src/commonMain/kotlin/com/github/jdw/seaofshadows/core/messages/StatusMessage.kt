package com.github.jdw.seaofshadows.core.messages

import kotlinx.serialization.Serializable

class Status {
    enum class Classifications {
        SOCKET_RECEIVING,
        CANVAS2D_NONE,
        CANVAS2D_OK,
        WEBGL_NONE,
        WEBGL_OK,
        WEBGPU_NONE,
        WEBGPU_OK,
        READY_CLIENT,
        READY_SERVER,
        RENDER_DONE,
        SERVER_DONE,
        CLIENT_DONE;
    }

    @Serializable
    data class Message(val payload: Classifications)
}



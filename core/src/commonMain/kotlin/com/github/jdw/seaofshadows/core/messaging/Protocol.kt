package com.github.jdw.seaofshadows.core.messaging

class Protocol {
    enum class SystemTalk {
        SOCKET_UP,
        SOCKET_DOWN,
        TALK_PROTOBUF,
        TALK_JSON,
        LOG_NONE,
        LOG_OK,
        CONTEXT_2D_NONE,
        CONTEXT_2D_OK,
        CONTEXT_WEBGL1_NONE,
        CONTEXT_WEBGL1_OK,
        CONTEXT_WEBGL2_NONE,
        CONTEXT_WEBGL2_OK,
        CONTEXT_WEBGPU_NONE,
        CONTEXT_WEBGPU_OK,
        READY_TERMINAL,
        READY_SERVER,
        RENDER_READY,
        RENDER_DONE,
        SERVER_DONE,
        TERMINAL_DONE,
        TERMINAL_GOODBYE,
        SERVER_GOODBYE;
    }

    enum class Supported {
        WEBSOCKET
    }
}

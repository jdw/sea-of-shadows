package com.github.jdw.seaofshadows.messages

import kotlinx.serialization.Serializable

enum class Status {
    NO_CTX,
    READY
}

@Serializable
data class Init(val status: Status)

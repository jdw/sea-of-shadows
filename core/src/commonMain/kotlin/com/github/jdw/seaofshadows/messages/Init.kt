package com.github.jdw.seaofshadows.messages

import kotlinx.serialization.Serializable

enum class Result {
    NO_CTX,
    READY
}

@Serializable
data class Init(val result: Result)


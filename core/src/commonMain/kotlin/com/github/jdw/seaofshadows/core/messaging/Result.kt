package com.github.jdw.seaofshadows.core.messaging

import kotlinx.serialization.Serializable

@Serializable
data class ResultMessage(val value: String, val state: Long = -1) {
    fun isFailure(): Boolean = value != "OK"

    fun isSuccess(): Boolean = value == "OK"

    fun throwOrNull(): Unit? {
        if (isFailure()) {
            throw Exception(value)
        }

        return null
    }
}
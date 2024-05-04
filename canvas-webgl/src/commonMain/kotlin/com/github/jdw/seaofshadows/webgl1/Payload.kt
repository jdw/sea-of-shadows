package com.github.jdw.seaofshadows.webgl1

import kotlinx.serialization.Serializable

class Payload {
    @Serializable
    data class ClearColor(val red: Float, val green: Float, val blue: Float, val alpha: Float)

    @Serializable
    data class Clear(val mask: Int)
}
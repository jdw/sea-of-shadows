package com.github.jdw.seaofshadows.messages

import kotlinx.serialization.Serializable

@Serializable
data class Noop(val nothing: Int = 0)
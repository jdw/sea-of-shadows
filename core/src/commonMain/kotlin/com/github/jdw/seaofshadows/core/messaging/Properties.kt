package com.github.jdw.seaofshadows.core.messaging

import com.github.jdw.seaofshadows.core.dom.Property
import kotlinx.serialization.Serializable

@Serializable
data class Properties(val id: String, val property: Property, val valueShouldBeEvaluated: Boolean = false, val payload: String)
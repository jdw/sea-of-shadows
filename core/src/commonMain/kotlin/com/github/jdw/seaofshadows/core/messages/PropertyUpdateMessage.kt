package com.github.jdw.seaofshadows.core.messages

import com.github.jdw.seaofshadows.core.dom.Property
import kotlinx.serialization.Serializable

@Serializable
data class PropertyUpdateMessage(val id: String, val property: Property, val valueShouldBeEvaluated: Boolean = false, val value: String)
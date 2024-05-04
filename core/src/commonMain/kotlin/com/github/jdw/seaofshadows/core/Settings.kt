package com.github.jdw.seaofshadows.core

import kotlinx.serialization.Serializable

const val seaOfShadows = "sea-of-shadows"
const val baseEndpointPath = seaOfShadows
const val defaultCanvasId = "$seaOfShadows--canvas-1"

/**
 * Default location is "example.com/sea-of-shadows/settings.json". See extension functions for validation.
 */
@Serializable
data class Settings(
    /**
     * The endpoints available for Sea of Shadows.
     *
     * *Default:* {"WEBSOCKET": "/sea-of-shadows/websocket"}
     */
    val endpoints: Map<MeansOfCommunication, String> = mapOf(MeansOfCommunication.WEBSOCKET to "/$baseEndpointPath/${MeansOfCommunication.WEBSOCKET.name.lowercase()}"),

    /**
     * Prioritization for the different means of communication. The lower the number the earlier prioritization.
     *
     * *Default:* {"0": "WEBSOCKET"}
     */
    val meansOfCommunicationPrioritizations: Map<Int, MeansOfCommunication> = mapOf(0 to MeansOfCommunication.WEBSOCKET),

    /**
     * A set of expected canvas IDs that should be available upon initialization.
     *
     * *Default*: [["sea-of-shadows--canvas-1"]]
     */
    val expectedCanvasIds: Set<String> = setOf(defaultCanvasId),

    /**
     * The expected canvas IDs must be available in 'expectedCanvasId', the context is defined in [Context] enum class.
     *
     * *Default:* {"sea-of-shadows--canvas-1": "WEBGL1"}
     */
    val expectedCanvasIdsCapabilities: Map<String, Context> = mapOf(defaultCanvasId to Context.WEBGL1),

    /**
     * If the REST endpoint is defined and used, Sea of Shadows will poll at this interval.
     * A polling that results in one or more messages being transferred will result in another poll to the endpoint when the messages has been handled, disregarding the interval setting.
     * If no messages was transferred the next poll will happen at the specified interval.
     *
     * *Default:* 100
     */
    val restEndpointPollingIntervalMillis: Int = 100,

    /**
     * The name of the Sea of Shadows cookie.
     *
     * *Default:* "sea-of-shadows"
     */
    val cookieName: String = seaOfShadows,

    /**
     * Path of the settings GET endpoint
     *
     * *Default:* "sea-of-shadows/settings"
     */
    val settingsRestGetEndpoint: String = "$baseEndpointPath/settings"
)

fun Settings.validate(endpointValidatorBlock: (String) -> Boolean = { true }) {
    if (restEndpointPollingIntervalMillis <= 0)
        throw Exception("Failed parsing polling interval!")

    endpoints.forEach { (priorizitaion, endpoint) ->
        if (!endpointValidatorBlock.invoke(endpoint))
            throw Exception("Parsing failed for $priorizitaion:$endpoint!")
    }

    expectedCanvasIds.forEach { id ->
        id.validateAsHtmlId()
    }

    if (expectedCanvasIds.size != expectedCanvasIdsCapabilities.size)
        throw Exception("Expected canvas IDs and their respective capabilities does not match!")

    expectedCanvasIds.forEach { id ->
        expectedCanvasIdsCapabilities[id]
            ?: throw Exception("'$id' does not have a mapped capability!")
    }
}

/**
 * Validates the given IDs according to https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/id
 */
fun String.validateAsHtmlId() {
    val letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val validChars = "${letters}0123456789_-"

    if (!letters.contains(this[0], ignoreCase = true))
        throw Exception("A HTML DOM ID must start with a letter.")

    this.forEach { c ->
        if (!validChars.contains(c, ignoreCase = true))
            throw Exception("'$c' is not a valid character in a HTML DOM ID!")
    }
}
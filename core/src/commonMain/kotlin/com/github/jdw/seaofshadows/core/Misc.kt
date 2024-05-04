package com.github.jdw.seaofshadows.core

typealias Session = String

fun generateSession(seed: Long): Session {
    val hexChars = ('0'..'f').plus('a'..'f') // Combine lowercase and uppercase hex digits
    val random = kotlin.random.Random(seed) // Use Kotlin random
    return buildString(32) {
        repeat(32) {
            append(hexChars.random(random)) // Get random char from hexChars using random extension
        }
    }
}

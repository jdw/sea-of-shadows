package com.github.jdw.seaofshadows.utils

/**
 * Throws a generally exceptional objection!
 *
 * @since Sea of Shadows 0.0.3-SNAPSHOT
 * @author Johannes Alexis Wirde (johannes.wirde@gmail.com)
 */
fun throws(): Nothing = throw Exception("\uD83E\uDEE1")

fun throws(vararg faults: Pair<String, Any>): Nothing {
    var message = ""
    faults.forEach { fault ->
        val name = fault.first
        val value = fault.second.toString()

        message += "$name = $value, "
    }

    throw Exception("\uD83E\uDEE1 ${message.removeSuffix(", ")}")
}


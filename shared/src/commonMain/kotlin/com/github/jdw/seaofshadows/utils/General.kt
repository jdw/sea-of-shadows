package com.github.jdw.seaofshadows.utils

internal class GeneralException(message: String = ""): Exception("\uD83E\uDEE1  $message")


/**
 * Throws a generally exceptional objection!
 *
 * @since Sea of Shadows 0.0.3-SNAPSHOT
 * @author Johannes Alexis Wirde (johannes.wirde@gmail.com)
 */
fun throws(): Nothing = throw GeneralException()


/**
 * Throws a generally exceptional objection!
 *
 * @param message The message to rally them up with!
 * @since Sea of Shadows 0.0.3-SNAPSHOT
 * @author Johannes Alexis Wirde (johannes.wirde@gmail.com)
 */
fun throws(message: String): Nothing = throw GeneralException(message)


/**
 * Throws a generally exceptional objection!
 *
 * @param faults A collection of variables, their names and their values
 * @since Sea of Shadows 0.0.3-SNAPSHOT
 * @author Johannes Alexis Wirde (johannes.wirde@gmail.com)
 */
fun throws(vararg faults: Pair<String, Any>): Nothing {
    var message = ""
    faults.forEach { fault ->
        val name = fault.first
        val value = fault.second.toString()

        message += "$name = $value, "
    }

    throw GeneralException(message.removeSuffix(", "))
}


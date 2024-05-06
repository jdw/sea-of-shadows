package com.github.jdw.seaofshadows.core.messaging

data class Arc(val incoming: suspend () -> Unit, val outgoing: suspend () -> Unit)
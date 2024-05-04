package com.github.jdw.seaofshadows.core

data class Arc(val incoming: suspend () -> Unit, val outgoing: suspend () -> Unit)
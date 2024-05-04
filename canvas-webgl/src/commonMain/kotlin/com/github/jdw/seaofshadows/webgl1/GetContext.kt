package com.github.jdw.seaofshadows.webgl1

import com.github.jdw.seaofshadows.core.dom.Canvas

fun Canvas.getContext(name: String): WebGL {
    if ("webgl" != name)
        throw Exception("Unknown rendering context!")

    return WebGL(this)
}
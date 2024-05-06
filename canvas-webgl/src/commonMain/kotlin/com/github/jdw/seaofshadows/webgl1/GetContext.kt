package com.github.jdw.seaofshadows.webgl1

import com.github.jdw.seaofshadows.core.dom.Canvas
import com.github.jdw.seaofshadows.core.dom.RenderContext

fun Canvas.getContext(name: String): WebGL1 {
    if ("webgl" != name)
        throw Exception("Unknown rendering context!")

    return WebGL1(this)
}
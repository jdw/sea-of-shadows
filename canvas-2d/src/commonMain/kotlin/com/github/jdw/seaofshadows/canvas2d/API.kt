package com.github.jdw.seaofshadows.canvas2d

import com.github.jdw.seaofshadows.core.dom.Event

class Context {
    enum class Property {
        FILLSTYLE
    }
}

var Context.fillstyle: String
    get() {
        TODO()
    }
    set(value) {
//        val payload = compilePropertyUpdate(Property.FILLSTYLE, value)
//        parent.send(Event.PROPERTY_UPDATE, payload) {
//
//        }
//
//        field = value
    }

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillRect
 */
fun Context.fillRect(x: Int, y: Int, width: Int, height: Int) {

}




package com.github.jdw.seaofshadows

import kotlinx.browser.window

actual fun alert(message: String) {
    window.alert(message)
}
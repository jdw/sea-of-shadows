package com.github.jdw.seaofshadows

import org.jetbrains.kotlin.konan.properties.loadProperties

object Glob {
    val MOZILLA_BASE_URL: String by loadProperties("gradle.properties")
    val MOZILLA_API_BASE_URL: String by loadProperties("gradle.properties")
    val MOZILLA_WEBGL_CONSTANTS_URL: String by loadProperties("gradle.properties")
    val WEBGL1_VERSION: String by loadProperties("gradle.properties")
    val WEBGL2_VERSION: String by loadProperties("gradle.properties")
    val KHRONOS_WEBGL1_IDL = loadProperties("gradle.properties").getProperty("KHRONOS_WEBGL1_IDL").replace("{WEBGL1_VERSION}", WEBGL1_VERSION)
    val KHRONOS_WEBGL2_IDL = loadProperties("gradle.properties").getProperty("KHRONOS_WEBGL2_IDL").replace("{WEBGL2_VERSION}", WEBGL2_VERSION)

    var verbose = false

    fun debug(msg: String) {
        if (verbose) println(msg)
    }
}
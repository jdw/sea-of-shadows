package com.github.jdw.seaofshadows.subcommandos.mozillaexporters

class KotlinCode {
    private val code = ArrayList<String>()
    private var dents = ""

    fun add(line: String) {
        code.add("$dents$line\n")
    }

    fun indent() {
        dents += "\t"
    }

    fun undent() {
        dents = dents.substring(0, dents.length - 1)
    }

    fun undentAll() {
        dents = ""
    }

    fun get(): String {
        return code.joinToString(separator = "")
    }
}
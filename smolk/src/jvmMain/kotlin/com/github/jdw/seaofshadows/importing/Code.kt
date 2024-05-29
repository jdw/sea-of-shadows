package com.github.jdw.seaofshadows.importing

import java.io.File

class Code() {
    private val lines = ArrayList<String>()
    private var dents = ""
    private var changesSinceLastSave = true

    fun add(line: String) {
        lines.add("$dents$line\n")
        changesSinceLastSave = true
    }

    fun add(line: String, yes: Boolean) {
        if (yes) add(line)
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

    override fun toString(): String {
        return lines.joinToString(separator = "")
    }

    fun save(file: File) {
        if (changesSinceLastSave) {
            file.writeText(toString())
            changesSinceLastSave = false
        }

    }


    private fun isOngoingKdoc(lineRaw: String) = lineRaw.startsWith(" *")
}
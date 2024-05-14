package com.github.jdw.seaofshadows.subcommandos.importers

import java.io.File

class Code(val file: File) {
    private val lines = ArrayList<String>()
    private var dents = ""
    private var changesSinceLastSave = true

    fun add(line: String) {
        lines.add("$dents$line\n")
        changesSinceLastSave = true
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

    fun save() {
        if (changesSinceLastSave) {
            file.writeText(toString())
            changesSinceLastSave = false
        }

    }
}
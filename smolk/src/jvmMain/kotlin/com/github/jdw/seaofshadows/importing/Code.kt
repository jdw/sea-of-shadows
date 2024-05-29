package com.github.jdw.seaofshadows.importing

import com.github.jdw.seaofshadows.utils.throws
import org.jetbrains.kotlin.gradle.internal.ensureParentDirsCreated
import java.io.File

class Code() {
    private val lines = ArrayList<String>()
    private var dents = ""
    private var changesSinceLastSave = true
    var file: File? = null
        get() {
            if (null == field) throws()
            return field
        }

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
            file.ensureParentDirsCreated()
            file.writeText(toString())
            changesSinceLastSave = false
        }

    }


    fun removeTrailingBlankLine() {
        while (lines.last().isBlank()) lines.removeLast()
    }


    fun addBlankLineIfLastLineIsNotBlank() {
        if (lines.last().isNotBlank()) add("")
    }
}
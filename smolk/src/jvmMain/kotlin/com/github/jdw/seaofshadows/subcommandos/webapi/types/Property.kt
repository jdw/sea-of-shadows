package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.htmlToMarkdown
import com.github.jdw.seaofshadows.utils.throws

class Property(
    val name: String,
    val type: String,
    val mutable: Boolean,
    val defaultValue: String?,
    val const: Boolean,
    val urls: Map<String, String>,
    val documentation: String,
    val allowedValues: Map<String, String>
) {
    companion object {
        fun builder(): PropertyBuilder = PropertyBuilder()
    }
}
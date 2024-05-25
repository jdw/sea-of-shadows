package com.github.jdw.seaofshadows.subcommandos.webapi.types

class Property(
    val name: String,
    val type: String,
    val mutable: Boolean,
    val defaultValue: String?,
    val const: Boolean
) {
    companion object {
        fun builder(): PropertyBuilder = PropertyBuilder()
    }
}
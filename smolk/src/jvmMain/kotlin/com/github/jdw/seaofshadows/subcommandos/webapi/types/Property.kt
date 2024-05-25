package com.github.jdw.seaofshadows.subcommandos.webapi.types

class Property(
    val name: String,
    val type: String,
    val mutable: Boolean,
    val defaultValue: String?,
    val const: Boolean
) {
    class Builder {
        var mutable: Boolean? = null
        var name: String? = null
        var type: String? = null
        var defaultValue: String? = null
        var const: Boolean? = null
    }


    companion object {
        fun builder(): Builder {
            return Builder()
        }
    }
}
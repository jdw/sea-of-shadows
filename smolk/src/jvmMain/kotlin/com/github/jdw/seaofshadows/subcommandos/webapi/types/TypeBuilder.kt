package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.github.jdw.seaofshadows.subcommandos.webapi.types.Type.Builder


fun Builder.build(): Type {
    assert(name!!
        .isNotBlank() && name!!.isNotEmpty())

    return Type(
        annotations.toList(),
        arguments.toList(),
        classifier,
        isMarkedNullable!!,
        name!!)
}
package com.github.jdw.seaofshadows.subcommandos.webapi.types


fun Property.Builder.build(): Property {
    if (type!!.isEmpty()) throw Exception("Parameter type can not be empty!")
    if (name!!.isEmpty()) throw Exception("Parameter name can not be empty!")
    if (const!!) {
        if (mutable!!) throw IllegalStateException("A property can not be both mutable and 'const'!")
        if (null == defaultValue) throw IllegalStateException("A property can not be 'const' and not have a default value set!")
    }


    return Property(
        type = type!!,
        name = name!!,
        mutable = mutable!!,
        defaultValue = defaultValue,
        const = const!!)
}
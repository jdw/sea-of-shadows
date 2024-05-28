package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.utils.echt
import com.github.jdw.seaofshadows.utils.throws


class PropertyBuilder {
    val urls: MutableSet<String> = mutableSetOf()
    var mutable: Boolean? = null
    var name: String? = null
    var type: String? = null
    var defaultValue: String? = null
    var const: Boolean? = null

    fun build(): Property {
        if (type!!.isEmpty()) throws()
        if (name!!.isEmpty()) throws()
        if (const!!) {
            if (mutable!!) throws("A property can not be both mutable and 'const'!")
            if (null == defaultValue) throws("A property can not be 'const' and not have a default value set!")
        }

        (urls.isEmpty() && const!!).echt { throws() }

        Glob.keywordsToBeBracketedInKdoc.add(name!!)

        return Property(
            urls = urls.toSet(),
            type = type!!,
            name = name!!,
            mutable = mutable!!,
            defaultValue = defaultValue,
            const = const!!
        )
    }
}
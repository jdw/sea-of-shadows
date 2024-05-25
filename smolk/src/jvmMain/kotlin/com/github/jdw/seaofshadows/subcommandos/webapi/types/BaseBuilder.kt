package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.github.jdw.seaofshadows.Glob

open class BaseBuilder {
    val seeFurtherUrls: MutableSet<String> = mutableSetOf()
    var simpleName: String? = null
    fun getMozillaUrl(): String = seeFurtherUrls.filter { it.contains(Glob.MOZILLA_API_BASE_URL) && it.contains(simpleName!!) }.first()
}
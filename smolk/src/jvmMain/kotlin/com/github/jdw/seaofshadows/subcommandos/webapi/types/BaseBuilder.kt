package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.github.jdw.seaofshadows.Glob
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.runBlocking

open class BaseBuilder {
    val seeFurtherUrls: MutableSet<String> = mutableSetOf()
    var simpleName: String? = null
    fun getMozillaUrl(): String = seeFurtherUrls.filter { it.contains(Glob.MOZILLA_API_BASE_URL) && it.contains(simpleName!!) }.first()

    val methodUri: MutableSet<String> = mutableSetOf()
        get() {
            if (field.isNotEmpty()) return field

            val baseUrl = "${Glob.MOZILLA_API_BASE_URL}/$simpleName".replace(
                "WebGLRenderingContextBase",
                "WebGLRenderingContext"
            )

            with(Glob.fetchDocument(baseUrl)) {
                runBlocking {
                    getElementsByTag("summary").asFlow().collect { summary ->
                        if (summary.html() == "Instance methods") {
                            summary.parent()!!.getElementsByTag("ol")[0]
                                .getElementsByTag("li").asFlow().collect { li ->
                                    field.add(li.getElementsByTag("a")[0].attribute("href")!!.value)
                                }

                        }
                    }
                }
            }

            return field
        }
}
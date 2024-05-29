package com.github.jdw.seaofshadows.importing.types

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.getKhronosGroupUrlFromSpecifications
import com.github.jdw.seaofshadows.htmlToMarkdown
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.runBlocking
import org.jetbrains.kotlin.util.prefixIfNot

open class BaseBuilder {
    val urls: MutableMap<String, String> = mutableMapOf()
    var simpleName: String? = null
    fun getMozillaUrl(): String = urls["Mozilla"]!!
    val methodUris: MutableSet<String> = mutableSetOf()
        get() {
            if (field.isNotEmpty()) return field

            val baseUrl = getMozillaUrl()

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

    fun getDocumentation(): String {
        var ret = ""

        val url = getMozillaUrl()

        with(Glob.fetchDocument(url)) {
            getElementById("specifications")?.let { urls["Khronos Group"] = getKhronosGroupUrlFromSpecifications() }
            val ps = getElementsByClass("section-content").first()!!.getElementsByTag("p")
            assert(ps.size == 4)
            ps.forEach {
                getElementsByTag("a").forEach { a ->
                    a.attribute("href")?.let { href ->
                        a.attr("href", href.value.prefixIfNot(Glob.MOZILLA_API_BASE_URL))
                    }
                }
            }
            ps.forEach { ret += "${it.html()}<br /><br />" }
        }

        return ret.htmlToMarkdown()
    }
}
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
    val urls: Set<String>
) {
    var documentation: String = ""
        get() {
            if (!const) return "TODO: This property is most properly not documented!"
            if ("" != field) return field
            val url = urls
                .filter { it.contains(Glob.MOZILLA_API_BASE_URL) && it.contains("Constants") }
                .apply { if (size != 1) throws() }
                .first()

            with(Glob.fetchDocument(url)) {
                getElementsByTag("code").forEach { //TODO flow single
                    if (it.text() == name) {
                        val td = it.parent()!!
                            .siblingElements()
                            .last()!!

                        field =
                            if ("" == td.text()) ""
                            else td.html().replace("<code>", "[").replace("</code>", "]")
                    }
                }
            }

            field = field.htmlToMarkdown()
            return field
        }

    companion object {
        fun builder(): PropertyBuilder = PropertyBuilder()
    }
}
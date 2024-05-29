package com.github.jdw.seaofshadows.importing.types

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.htmlToMarkdown
import com.github.jdw.seaofshadows.utils.echt
import com.github.jdw.seaofshadows.utils.throws


class PropertyBuilder {
    val urls: MutableMap<String, String> = mutableMapOf()
    var mutable: Boolean? = null
    var name: String? = null
    var type: String? = null
    var defaultValue: String? = null
    var const: Boolean? = null
    var parent: InterfaceBuilder? = null
    val allowedValues: MutableMap<String, String> = mutableMapOf()

    var documentationBlock: PropertyBuilder.() -> String = {
        if (!const!!) "TODO: This property is most properly not documented!"
        else {
            val url = urls["Mozilla"]!!
            var data = ""
            with(Glob.fetchDocument(url)) {
                getElementsByTag("code").forEach { //TODO flow single
                    if (it.text() == name) {
                        val td = it.parent()!!
                            .siblingElements()
                            .last()!!

                        data =
                            if ("" == td.text()) ""
                            else td.html().replace("<code>", "[").replace("</code>", "]")
                    }
                }
            }

            data.htmlToMarkdown()
        }
    }


    fun build(): Property {
        if (type!!.isEmpty()) throws()
        if (name!!.isEmpty()) throws()
        if (const!!) {
            if (mutable!!) throws("A property can not be both mutable and 'const'!")
            if (null == defaultValue) throws("A property can not be 'const' and not have a default value set!")
        }

        (urls.isEmpty() && const!!).echt { throws() }

        Glob.keywordsToBeBracketedInKdoc.add(name!!)
        val dox = documentationBlock.invoke(this)
        return Property(
            urls = urls.toMap(),
            type = type!!,
            name = name!!,
            mutable = mutable!!,
            defaultValue = defaultValue,
            const = const!!,
            documentation = dox,
            allowedValues = allowedValues.toMap()
        )
    }
}
package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.fleeksoft.ksoup.Ksoup
import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.utils.echt
import com.github.jdw.seaofshadows.utils.throws
import kotlin.reflect.KParameter
import kotlin.reflect.full.createType


fun Parameter.Builder.build(): Parameter {
    assert(name!!
        .isNotBlank() && name!!.isNotEmpty())
    assert(typeName!!
        .isNotBlank() && typeName!!.isNotEmpty())

    return Parameter(
        annotations = annotations.toList(),
        index = index!!,
        isOptional = isOptional!!,
        isVararg = isVararg!!,
        kind = kind!!,
        name = name!!,
        type = type!!,
        documentation = documentation!!,
        typeName = typeName!!)
}


fun Parameter.Builder.fetchDocumentation(urls: Set<String>): String {
    assert(name!!.isNotEmpty())
    assert(name!!.isNotBlank())

    urls
        .filter { it.contains(Glob.MOZILLA_BASE_URL) }
        .apply { isEmpty().echt { throws() } }
        .apply { if (this.size != 1) throws() }
        .forEach { url ->
            assert(url.isNotBlank() && url.isNotEmpty())

            val doc = Ksoup.parse(Glob.fetchCache(url))
            val dt = doc.getElementById(name!!.lowercase())
                ?: throws(
                    "name" to name!!,
                    "type" to typeName!!,
                    "url" to url
                )

            val dd = dt.nextElementSibling()!!

            assert(dd.tagName() == "dd")

            return dd.text()
        }

    return "TODO: This parameters documentation import caused unspecified trouble!"
}
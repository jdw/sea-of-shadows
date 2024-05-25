package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.utils.echt
import com.github.jdw.seaofshadows.utils.throws
import kotlin.reflect.KParameter
import kotlin.reflect.KType


class ParameterBuilder {
    var parent: MethodBuilder? = null
    var name: String? = null
    var index: Int? = null
    var annotations: MutableList<Annotation> = mutableListOf()
    var isOptional: Boolean? = null
    var isVararg: Boolean? = null
    var kind: KParameter.Kind? = null
    var type: KType? = null
    var documentation: String? = null
    var typeName: String? = null

    fun build(): Parameter {
        assert(
            name!!
                .isNotBlank() && name!!.isNotEmpty()
        )
        assert(
            typeName!!
                .isNotBlank() && typeName!!.isNotEmpty()
        )

        return Parameter(
            annotations = annotations.toList(),
            index = index!!,
            isOptional = isOptional!!,
            isVararg = isVararg!!,
            kind = kind!!,
            name = name!!,
            type = type!!,
            documentation = documentation!!,
            typeName = typeName!!
        )
    }


    fun fetchDocumentation(urls: Set<String>): String {
        assert(name!!.isNotEmpty())
        assert(name!!.isNotBlank())

        urls
            .filter { it.contains(Glob.MOZILLA_BASE_URL) }
            .apply { isEmpty().echt { throws() } }
            .apply { if (this.size != 1) throws() }
            .forEach { url ->
                assert(url.isNotBlank() && url.isNotEmpty())

                val dt = Glob.fetchDocument(url).getElementById(name!!.lowercase())
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
}
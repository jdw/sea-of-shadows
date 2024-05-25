package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.fleeksoft.ksoup.Ksoup
import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.utils.echt
import com.github.jdw.seaofshadows.utils.throws
import kotlin.reflect.KParameter
import kotlin.reflect.KType

class Parameter(
    override val annotations: List<Annotation>,
    override val index: Int,
    override val isOptional: Boolean,
    override val isVararg: Boolean,
    override val kind: KParameter.Kind,
    override val name: String?,
    override val type: KType,
    val typeName: String,
    val urls: Set<String>
): KParameter {
    var documentation: String = ""
        get() {
            if ("" != field) return field

            val url = urls
                .filter { it.contains(Glob.MOZILLA_API_BASE_URL) }
                .apply { if (this.size != 1) throws() }
                .first()
            assert(url.isNotBlank() && url.isNotEmpty())
            with(Glob.fetchDocument(url)) {
                field = try {
                    val dt = getElementById(name!!.lowercase())
                        ?: throws(
                            "name" to name!!,
                            "type" to typeName!!,
                            "url" to url
                        )

                    val dd = dt.nextElementSibling()!!

                    assert(dd.tagName() == "dd")

                    dd.text()
                }
                catch (e: Exception) {
                    "TODO: This parameters documentation import caused unspecified trouble!"
                }
            }

            return field
        }


    override fun equals(other: Any?): Boolean {
        if (other !is Parameter) return false

        return this.hashCode() == other.hashCode()
    }


    override fun hashCode(): Int {
        var result: Int = documentation.hashCode()
        result = 31 * result + annotations.hashCode()
        result = 31 * result + index.hashCode()
        result = 31 * result + isOptional.hashCode()
        result = 31 * result + isVararg.hashCode()
        result = 31 * result + kind.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + type.hashCode()

        return result
    }


    companion object {
        fun builder(): ParameterBuilder = ParameterBuilder()
    }
}
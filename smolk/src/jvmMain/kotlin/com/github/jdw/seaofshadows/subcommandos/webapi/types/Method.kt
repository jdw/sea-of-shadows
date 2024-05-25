package com.github.jdw.seaofshadows.subcommandos.webapi.types

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.utils.throws
import kotlin.reflect.KCallable
import kotlin.reflect.KParameter
import kotlin.reflect.KType
import kotlin.reflect.KTypeParameter
import kotlin.reflect.KVisibility

class Method(
    val urls: Set<String>,
    override val annotations: List<Annotation>,
    override val isAbstract: Boolean,
    override val isFinal: Boolean,
    override val isOpen: Boolean,
    override val isSuspend: Boolean,
    override val name: String,
    override val returnType: KType,
    override val typeParameters: List<KTypeParameter>,
    override val visibility: KVisibility?,
    val myParameters: List<Parameter>,
    val problems: List<String>
): KCallable<Any> {
    var documentation: String = ""
        get() {
            if ("" != field) return field

            val url = urls
                .filter { it.contains(Glob.MOZILLA_API_BASE_URL) }
                .apply { if (size != 1 ) throws() }
                .first()

            with(Glob.fetchDocument(url)) {
                field = getElementById("content")!!
                    .getElementsByClass("section-content").first()!!
                    .getElementsByTag("p")
                    .text()
            }

            return field
        }

    override val parameters: List<KParameter>
        get() {
            return myParameters
        }


    override fun call(vararg args: Any?): Any {
        TODO("Not yet implemented")
    }


    override fun callBy(args: Map<KParameter, Any?>): Any {
        TODO("Not yet implemented")
    }


    override fun equals(other: Any?): Boolean {
        if (other !is Method) return false;

        return this.hashCode() == other.hashCode();
    }


    override fun hashCode(): Int {
        var result = urls.hashCode()
        result = 31 * result + documentation.hashCode()
        result = 31 * result + annotations.hashCode()
        result = 31 * result + isAbstract.hashCode()
        result = 31 * result + isFinal.hashCode()
        result = 31 * result + isOpen.hashCode()
        result = 31 * result + isSuspend.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + parameters.hashCode()
        result = 31 * result + returnType.hashCode()
        result = 31 * result + typeParameters.hashCode()
        result = 31 * result + (visibility?.hashCode() ?: 0)

        return result
    }


    companion object {
        fun builder(): MethodBuilder = MethodBuilder()
    }
}
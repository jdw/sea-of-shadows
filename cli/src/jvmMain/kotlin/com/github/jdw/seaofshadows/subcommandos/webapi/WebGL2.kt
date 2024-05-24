package com.github.jdw.seaofshadows.subcommandos.webapi

import com.fleeksoft.ksoup.nodes.Document
import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.subcommandos.webapi.types.Method
import kotlinx.coroutines.flow.asFlow
import java.io.File

class WebGL2 {
    private val webgl2RenderingContext: suspend (Code) -> Unit = { code ->
        //renderInterfaceBasedOnMethods(code, methods.toList())
        code.undent()
        code.add("}")
    }

    private fun renderInterfaceBasedOnMethods(code: Code, methods: List<Method>) {

    }

    suspend fun run(path: File) {
        Glob.debug("Running WebGL interfaces exporter...")

        val interfaces = mapOf(
            "WebGL2RenderingContext" to webgl2RenderingContext
        ).entries.asFlow().collect { entry ->
            val id = entry.key
            val block = entry.value

            val code = Code()
            block.invoke(code)
            code.save(File("${path.absolutePath}/$id.kt"))
        }
    }

    companion object {
        fun getListOfMethods(doc: Document, url: String): List<Method> {
            val section = doc
                .getElementById("syntax")!!
                .parent()!!

            val ret: MutableList<Method> = mutableListOf()


            return ret.toList()
        }
    }
}

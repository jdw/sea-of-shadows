package com.github.jdw.seaofshadows.subcommandos.mozillaexporters

import com.fleeksoft.ksoup.Ksoup
import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.subcommandos.Webapi.Companion.MOZILLA_WEBGL_BASE_URL
import fuel.httpGet
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import java.io.File

class WebGL1Interfaces {


    suspend fun run(path: File) {
        Glob.debug("Running WebGL1 interfaces exporter...")
        //code = Code(File("${path.absolutePath}/WebGLConstants.kt"))
        val response = coroutineScope {
            async {
                MOZILLA_WEBGL_BASE_URL.httpGet()
            }
        }.await()

        with(Ksoup.parse(response.body)) {
            this.getAllElements()
                .filter { e ->
                    e.tag().name == "code"
                }
                .filter { e ->
                    e.parent().parent().tag().name == "li"
                }
                .filter { e ->
                    println(e.html())
                    true
                }
        }
    }
}
package com.github.jdw.seaofshadows.subcommandos.mozillaexporters

import com.fleeksoft.ksoup.Ksoup
import com.fleeksoft.ksoup.nodes.Document
import com.github.jdw.seaofshadows.Glob
import fuel.httpGet
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import java.io.File

class WebGL1Interfaces {
    private val webGLContextEvent: suspend (Document, Code) -> Unit = { doc, code ->
        val clazz = doc.title().split(" - Web APIs | MDN")[0]

        code.add("package com.github.jdw.seaofshadows.shared.webgl.interfaces")
        code.add("")
        code.add("/**")
        code.add(" * The WebContextEvent interface is part of the WebGL API and is an interface for an event that is generated in response to a status change to the WebGL rendering context.")
        code.add(" *")
        code.add(" * See more: https://developer.mozilla.org/en-US/docs/Web/API/WebGLContextEvent")
        code.add(" */")
        code.add("interface $clazz")
        code.save()
    }

    private val webGLActiveInfo: suspend (Document, Code) -> Unit = { doc, code ->
        val clazz = doc.title().split(" - Web APIs | MDN")[0]
        val ps = doc.getElementsByClass("section-content")[0].getElementsByTag("p")
        code.add("package com.github.jdw.seaofshadows.shared.webgl.interfaces")
        code.add("")
        code.add("/**")
        code.add(" * ${ps[0].html()}")
        code.add(" *")
        code.add(" * See more: https://developer.mozilla.org/en-US/docs/Web/API/WebGLActiveInfo")
        code.add(" */")
        code.add("interface $clazz {")
        code.indent()
        code.add("val name: String")
        code.add("val type: String")
        code.add("val size: Double")
        code.undent()
        code.add("}")
        code.save()
    }

    private val webGLObjectRender: suspend (Document, Code) -> Unit = { doc, code ->
        val clazz = doc.title().split(" - Web APIs | MDN")[0]
        val ps = doc.getElementsByClass("section-content")[0].getElementsByTag("p")
        code.add("package com.github.jdw.seaofshadows.shared.webgl.interfaces")
        code.add("")
        code.add("/**")
        code.add(" * ${ps[0].html()}")
        code.add(" *")
        code.add(" * ${ps[1].html()}")
        code.add(" *")
        code.add(" * ${ps[2].html()}")
        code.add(" *")
        code.add(" * See more: https://developer.mozilla.org/en-US/docs/Web/API/WebGLObject")
        code.add(" */")
        code.add("interface $clazz")
        code.save()
    }

    private val webGLQueryRender: suspend (Document, Code) -> Unit = { doc, code ->
        val clazz = doc.title().split(" - Web APIs | MDN")[0]
        val ps = doc.getElementsByClass("section-content")[0].getElementsByTag("p")
        code.add("package com.github.jdw.seaofshadows.shared.webgl.interfaces")
        code.add("")
        code.add("/**")
        code.add(" * ${ps[0].html()}")
        code.add(" *")
        code.add(" * ${ps[1].html()}")
        code.add(" *")
        code.add(" * See more: https://developer.mozilla.org/en-US/docs/Web/API/WebGLQuery")
        code.add(" */")
        code.add("interface $clazz: WebGLObject")
        code.save()
    }

    private val defaultRenderInterface: suspend (Document, Code) -> Unit = { doc, code ->
        val interfaze = doc.title().split(" - Web APIs | MDN")[0]

        code.add("package com.github.jdw.seaofshadows.shared.webgl.interfaces")
        code.add("")
        code.add("interface $interfaze {")
        code.indent()
        val methods = mutableListOf<String>()
            doc.getAllElements().asFlow()
            .filter { e ->
                e.tag().name == "summary"
            }
            .filter { e ->
                e.html() == "Instance methods"
            }
            .collect { e ->
                e.parent()!!.getAllElements()
                    .filter { e ->
                        e.tag().name == "code"
                    }
                    .forEach { c ->
                        methods.add(c.parent()!!.attr("href").split("/").last())
                    }
            }

        data class Method(val doc: Document, val name: String) {
            var returnValue: String = ""
            val parametersNameToType: MutableMap<String, String> = mutableMapOf()
            val parametersNameToDoc: MutableMap<String, String> = mutableMapOf()
            var docBase: String = ""
            val uncertainties: MutableList<String> = mutableListOf()
        }
        val methodNameToMethod: MutableMap<String, Method?> = mutableMapOf()

        methods.asFlow().map { methodName ->
            Glob.debug("Running flow for '$interfaze.$methodName'...")

            val methodUrl = "https://developer.mozilla.org/en-US/docs/Web/API/$interfaze/$methodName"
            Glob.debug("Fetching '$methodUrl'...")
            val m = Method(Ksoup.parse(methodUrl.httpGet().body), methodName)

            val sectionContent = m.doc.getElementsByClass("section-content")
            assert(sectionContent.size == 1)
            m.docBase = sectionContent[0].html()
            val parameters = m.doc.getElementById("parameters")!!
            val dts = parameters.parent()!!.getElementsByTag("dt")
            val dds = parameters.parent()!!.getElementsByTag("dd")
            assert(dts.size == dds.size)

            for (i in dts.indices) {
                val parameterName = dts[i].id()
                if (parameterName.startsWith("gl."))
                    continue
                Glob.debug("Found a parameter named '$parameterName'...")
                val parameterDoc = dds[i].getElementsByTag("p").html()

                // Finding type
                var parameterType = dds[i].getElementsByTag("a").attr("title")
                if ("" == parameterType && dds[i].getElementsByTag("a").size != 0)
                    parameterType = dds[i].getElementsByTag("a")[0].getElementsByTag("code").html()

                m.parametersNameToDoc[parameterName] = parameterDoc
                m.parametersNameToType[parameterName] = parameterType
            }

            val returnValueRaw = m.doc.getElementById("return_value")?.getElementsByTag("p")?.html()
                ?: ""
            m.returnValue =
                if (returnValueRaw.contains("None (") && returnValueRaw.contains("undefined")) "Unit"
                else {
                    m.uncertainties += "return type"
                    "Unit"
                }

            methodNameToMethod[methodName] = m
        }.collect()

        methodNameToMethod.keys.sorted().forEach { name ->
            val m = methodNameToMethod[name]!!

            code.add("/**")
            code.add(" * ${m.docBase}")
            code.add(" *")
            var signature = "fun ${m.name}("
            m.parametersNameToDoc.keys.sorted().forEach { key ->
                code.add(" * @param $key ${m.parametersNameToDoc[key]}")
                signature += "$key: ${m.parametersNameToType[key]},"
            }
            signature.removeSuffix(",")
            signature += "): ${m.returnValue}"
            code.add(" */")
            var uncertain =
                if (m.uncertainties.size == 0) ""
                else "// "
            m.uncertainties.forEach { uncertain += "$it, "}
            code.add("$signature $uncertain")
            code.add("")
        }
        code.undent()
        code.add("}")
        code.save()
    }

    suspend fun run(path: File) {
        Glob.debug("Running WebGL interfaces exporter...")
        val interfaces = mapOf(
            "WebGLRenderingContext" to defaultRenderInterface,
            "WebGLActiveInfo" to webGLActiveInfo,
            "WebGLContextEvent" to webGLContextEvent,
            "WebGLQuery" to webGLQueryRender,
            "WebGL2RenderingContext" to defaultRenderInterface)

        interfaces.entries.asFlow().map { entry ->
            val id = entry.key
            val block = entry.value

            val response = "https://developer.mozilla.org/en-US/docs/Web/API/$id".httpGet()

            val doc = Ksoup.parse(response.body)
            val code = Code(File("${path.absolutePath}/$id.kt"))
            block.invoke(doc, code)
        }.collect()
    }
}
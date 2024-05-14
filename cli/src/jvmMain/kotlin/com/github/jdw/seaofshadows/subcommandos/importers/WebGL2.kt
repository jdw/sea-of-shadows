package com.github.jdw.seaofshadows.subcommandos.importers

import com.fleeksoft.ksoup.Ksoup
import com.fleeksoft.ksoup.nodes.Document
import com.github.jdw.seaofshadows.Glob

import com.github.jdw.seaofshadows.subcommandos.Webapi.Companion.fetchCache
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import java.io.File

class WebGL2 {
    private val webGLActiveInfo: suspend (Code) -> Unit = { code ->
        val doc = Ksoup.parse(fetchCache("https://developer.mozilla.org/en-US/docs/Web/API/WebGLActiveInfo"))
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
    }

    private val webGLObjectRender: suspend (Code) -> Unit = { code ->
        val doc = Ksoup.parse(fetchCache("https://developer.mozilla.org/en-US/docs/Web/API/WebGLObjectRender"))
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
    }

    private val webGLQueryRender: suspend (Code) -> Unit = { code ->
        val doc = Ksoup.parse(fetchCache("https://developer.mozilla.org/en-US/docs/Web/API/WebGLQueryRender"))
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
    }

    private val webgl2RenderingContext: suspend (Code) -> Unit = { code ->
        val doc = Ksoup.parse(fetchCache("https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext"))
        code.add("package com.github.jdw.seaofshadows.shared.webgl.interfaces")
        code.add("")
        code.add("import com.github.jdw.seaofshadows.shared.webgl.GLbitfield")
        code.add("import com.github.jdw.seaofshadows.shared.webgl.GLboolean")
        code.add("import com.github.jdw.seaofshadows.shared.webgl.GLenum")
        code.add("import com.github.jdw.seaofshadows.shared.webgl.GLfloat")
        code.add("import com.github.jdw.seaofshadows.shared.webgl.GLint")
        code.add("import com.github.jdw.seaofshadows.shared.webgl.GLint64")
        code.add("import com.github.jdw.seaofshadows.shared.webgl.GLintptr")
        code.add("import com.github.jdw.seaofshadows.shared.webgl.GLsizei")
        code.add("import com.github.jdw.seaofshadows.shared.webgl.GLsizeiptr")
        code.add("import com.github.jdw.seaofshadows.shared.webgl.GLuint")
        code.add("")
        val interfaze = "WebGL1RenderingContext"
        code.add("interface $interfaze {")
        code.indent()
        val methods = mutableListOf<Method>()
        doc.getElementsByTag("summary")
            .filter { e ->
                e.html() == "Instance methods"
            }
            .map { e ->
                e.parent()!!.getAllElements().asFlow()
                    .filter { e ->
                        e.tag().name == "code"
                    }
                    .collect { c ->
                        val url = Glob.MOZILLA_BASE_URL + c.parent()!!.attr("href")
                        val methodDoc = Ksoup.parse(fetchCache(url))
                        Glob.debug("Getting list of method name(s) from '$url'...")

                        getListOfMethods(methodDoc, url).forEach { methods.add(it) }
                    }
            }

        methods.asFlow().collect { m ->
                    Glob.debug("Running block for '$interfaze.${m.name}'...")

                    val sectionContent = m.doc.getElementsByClass("section-content")
                    assert(sectionContent.size == 1)
                    m.kdoc = sectionContent[0].html()
                    val parameters = m.doc.getElementById("parameters")!!
                    val dts = parameters.parent()!!.getElementsByTag("dt")
                    val dds = parameters.parent()!!.getElementsByTag("dd")
                    assert(dts.size == dds.size)

                    var orderOfParam = 0
                    for (idx in dts.indices) {
                        if (dts[idx].id().startsWith("gl.")) //TODO SIC
                            continue

                        val p = m.parameters.find { it.name == dts[idx].id() }!!
                        m.parameters.add(p)
                        Glob.debug("Adding info to parameter named '${p.name}'...")
                        p.kdoc = dds[idx].getElementsByTag("p").html()

                        // Finding type
                        //TODO SIC
                        p.type = dds[idx].getElementsByTag("a").attr("title")
                        if ("" == p.type && dds[idx].getElementsByTag("a").size != 0)
                            p.type = dds[idx].getElementsByTag("a")[0].getElementsByTag("code").html()
                    }

                    var returnValueRaw = ""
                    m.doc.getElementById("return_value")
                        ?.let { // Not all function documents apparently have the return value section
                            returnValueRaw = it.parent()!!.getElementsByTag("p").html()
                        }

                    m.returnType =
                        if (returnValueRaw.contains("None")) ""
                        else {
                            m.returnTypeUncertain = true
                            ""
                        }
        }

        renderInterfaceBasedOnMethods(code, methods.toList())
        code.undent()
        code.add("}")
    }

    private fun renderInterfaceBasedOnMethods(code: Code, methods: List<Method>) {
        methods.sortedBy { it.name }.forEach { m ->
            code.add("/**")
            code.add(" * ${m.kdoc}") //TODO format to realistic length and fix href paths to Mozilla
            code.add(" *")
            var signature = "fun ${m.name}("
            m.parameters.forEach { parameter ->
                code.add(" * @param ${parameter.name} ${parameter.kdoc}")
                signature += "${parameter.name}: ${parameter.type}, "
            }
            code.add(" *")
            code.add(" * See more: ${m.url}")
            code.add(" */")

            signature = signature.removeSuffix(", ")
            signature += ")"

            if ("" != m.returnType)
                signature += ": ${m.returnType}"

            code.add("$signature ${m.getUncertainties()}")
            code.add("")
        }
    }

    suspend fun run(path: File) {
        Glob.debug("Running WebGL interfaces exporter...")

        val interfaces = mapOf(
            //"WebGLRenderingContext" to webgl1RenderingContext,
            "WebGLActiveInfo" to webGLActiveInfo,
            "WebGLQuery" to webGLQueryRender,
            "WebGL2RenderingContext" to webgl2RenderingContext
        )

        interfaces.entries.asFlow().collect { entry ->
            val id = entry.key
            val block = entry.value

            val code = Code(File("${path.absolutePath}/$id.kt"))
            block.invoke(code)
            code.save()
        }
    }

    companion object {
        private fun isValidKotlinIdentifier(name: String): Boolean {
            val keywords = listOf(
                "abstract", "as", "break", "by", "catch", "class", "continue", "const",
                "constructor", "crossinline", "data", "do", "else", "enum", "extends", "external",
                "false", "final", "finally", "for", "fun", "if", "implements", "import",
                "in", "infix", "inner", "interface", "internal", "is", "is!", "lateinit",
                "noinline", "null", "object", "out", "override", "package", "private", "protected",
                "public", "reified", "return", "rethrow", "sealed", "static", "sealed", "super",
                "suspend", "this", "throw", "true", "try", "typealias", "val", "var",
                "when", "while", "yield"
            )
            val regex = Regex("^[a-zA-Z_][a-zA-Z0-9_]*\$?".trim())  // Allowed characters and optional trailing $
            if (!regex.matches(name)) {
                return false
            }

            return !keywords.contains(name.uppercase()) // Check against reserved keywords (uppercase for case-insensitivity)
        }

        fun getListOfMethods(doc: Document, url: String): List<Method> {
            val section = doc
                .getElementById("syntax")!!
                .parent()!!

            val functions = section.getElementsByClass("token function")
            assert(functions.size > 0)

            val ret: MutableList<Method> = mutableListOf()
            functions.forEach { e ->
                val text = e.parent()!!.text().split(("// WebGL2"))[0].replace("// WebGL1:\n", "") // Removing WebGL2 specific methods
                println("- $text")
                val (methodNames, parametersRaw) = text.split("(")

                methodNames.split("\n").forEach { methodName ->
                    if (!isValidKotlinIdentifier(methodName))
                        throw Exception("Would be method name '$methodName' was found to be invalid...")
                    val m = Method(doc, methodName, url)
                    ret.add(m)

                    var order = 0
                    parametersRaw
                        .replace(")", "")
                        .split(", ")
                        .forEach { parameterName ->
                            println("-- ${parameterName}, order = $order")

                            if (!isValidKotlinIdentifier(parameterName))
                                throw Exception("Would be method name '$parameterName' was found to be invalid...")

                            val p = Parameter(parameterName, order++, m)
                            m.parameters.add(p)
                        }
                }

            }

            return ret.toList()
        }
    }
}

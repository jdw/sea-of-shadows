package com.github.jdw.seaofshadows.subcommandos.mozillaexporters

import com.fleeksoft.ksoup.Ksoup
import com.fleeksoft.ksoup.nodes.Document
import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.subcommandos.Webapi.Companion.MOZILLA_WEBGL_CONSTANTS_URL
import fuel.httpGet
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlin.math.exp

class WebGL1() {
    private val code = KotlinCode()

    suspend fun run() {
        Glob.debug("Running WebGL1 exporter...")
        val response = coroutineScope {
            async {
                MOZILLA_WEBGL_CONSTANTS_URL.httpGet()
            }
        }.await()

        val constantsIds = mutableSetOf<String>()
        val ariaLabelledBysToSkip = setOf<String>(
            "table_of_contents",
            "standard_webgl_1_constants",
            "additional_constants_defined_webgl_2",
            "getting_gl_parameter_information_2",
            "textures_2",
            "pixel_types_2",
            "buffers_2",
            "data_types_2",
            "vertex_attributes_2",
            "framebuffers_and_renderbuffers_2",
            "see_also")

        Glob.debug("Constants document fetched...")
        val constantsDoc = Ksoup.parse(response.body)
        constantsDoc
            .getElementById("content")
            ?.getAllElements()
            ?.filter { e ->
                e.tagName() == "section"
            }
            ?.filter { e ->
                val ariaLabelledBy = e.attribute("aria-labelledby").toString().split("=")[1].replace("\"", "")
                !ariaLabelledBysToSkip.contains(ariaLabelledBy)
            }
            ?.map { e ->
                val attrValue = e.attribute("aria-labelledby").toString().split("=")[1].replace("\"", "")
                constantsIds.add(attrValue)
            }

        code.add("package com.github.jdw.seaofshadows.webgl1")
        code.add("class WebGL() {")
        code.indent()
        constantsIds.forEach {
            exportConstants(constantsDoc, it)
        }
        code.undent()
        code.add("}")

        Glob.debug("Printing code...")
        println(code.get())
    }

    private fun exportConstants(doc: Document, id: String) {
        Glob.debug("id: $id")
        code.add("// https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#$id")
        doc.getElementById(id)!!.parent()!!.getAllElements()
            .filter { e ->
                e.tagName() == "tr" && e.parent()!!.tagName() == "tbody"
            }
            .map { e ->
                val trs = e.children().toList()
                val constantName =
                    if (trs[0].children().size != 0) trs[0].child(0).html()
                    else trs[0].html()
                val value = trs[1].html()
                val description = trs[2].html().replace("<code>", "[").replace("</code>", "]")

                if ("TEXTURE0 - 31" == constantName) {
                    val base = Integer.decode(value.split(" - ")[0])

                    (0..31).forEach { idx ->
                        if (description != "") {
                            code.add("/**")
                            code.add(" * Texture unit #$idx.")
                            code.add(" */")
                        }
                        code.add("val TEXTURE$idx = 0x${Integer.toHexString(base + idx).uppercase()}")
                        if (31 != idx)
                            code.add("")
                    }
                }
                else {
                    if (description != "") {
                        code.add("/**")
                        code.add(" * $description")
                        code.add(" */")
                    }
                    code.add("val $constantName = $value")
                }
                code.add("")
            }
    }
}
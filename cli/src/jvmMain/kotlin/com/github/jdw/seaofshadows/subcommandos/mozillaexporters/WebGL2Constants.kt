package com.github.jdw.seaofshadows.subcommandos.mozillaexporters

import com.fleeksoft.ksoup.Ksoup
import com.fleeksoft.ksoup.nodes.Document
import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.subcommandos.Webapi.Companion.MOZILLA_WEBGL_CONSTANTS_URL
import fuel.httpGet
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import java.io.File

class WebGL2Constants {
    private lateinit var code: Code

    suspend fun run(path: File) {
        code = Code(File("${path.absolutePath}/WebGL2Constants.kt"))
        Glob.debug("Running WebGL2Constants constants exporter...")

        val constantsSectionIds = setOf<String>(
            "getting_gl_parameter_information_2",
            "textures_2",
            "pixel_types_2",
            "buffers_2",
            "data_types_2",
            "vertex_attributes_2",
            "framebuffers_and_renderbuffers_2")

        val response = coroutineScope {
            async {
                MOZILLA_WEBGL_CONSTANTS_URL.httpGet()
            }
        }.await()

        Glob.debug("Constants document fetched...")

        code.add("package com.github.jdw.seaofshadows.shared.webgl")
        code.add("")
        code.add("/**")
        code.add(" * These constants are defined on the [WebGL2RenderingContext] interface. All WebGL1 constants are also available in a WebGL2 context.")
        code.add(" */")
        code.add("abstract class WebGL2Constants(): WebGLConstants() {")
        code.indent()
        with(Ksoup.parse(response.body)) {
            constantsSectionIds.forEach {
                exportConstants(this, it)
            }
        }
        code.undent()
        code.add("}")

        Glob.debug("Saving code to file '${code.file}'...")
        code.save()
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
                val description =
                    if ("getting_gl_parameter_information_2" == id) "Constant passed to [WebGLRenderingContext.getParameter] specifies what information to return."
                    else trs[2].html().replace("<code>", "[").replace("</code>", "]")

                // Skip already defined in WebGL1 constants class
                if (!setOf("DEPTH_STENCIL_ATTACHMENT", "DEPTH_STENCIL", "UNSIGNED_BYTE").contains(constantName)) {
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
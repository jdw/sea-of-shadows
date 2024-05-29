package com.github.jdw.seaofshadows.importing

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.importing.types.Interface
import com.github.jdw.seaofshadows.importing.types.InterfaceBuilder
import com.github.jdw.seaofshadows.importing.types.Method
import com.github.jdw.seaofshadows.importing.types.MethodBuilder
import com.github.jdw.seaofshadows.importing.types.Parameter
import com.github.jdw.seaofshadows.importing.types.ParameterBuilder
import com.github.jdw.seaofshadows.importing.types.Property
import com.github.jdw.seaofshadows.importing.types.PropertyBuilder
import com.github.jdw.seaofshadows.importing.types.Type
import com.github.jdw.seaofshadows.utils.noop
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.reflect.KParameter
import kotlin.reflect.full.createType

private val defaultRenderBlock = { interfaze: Interface ->
    Glob.error("Can not render interface '${interfaze.simpleName}' because no proper render function is set.")
}

class Canvas2dImporter(var renderBlock: (Interface) -> Unit = defaultRenderBlock) {
    fun run() = runBlocking {
        val packag3 = "${Glob.GROUP}.canvas2d.shared"

        Glob.fetchDocument(Glob.MOZILLA_CANVAS2D_BASE_URL)
            .getElementsByTag("summary")
            .forEach { summary ->
                if (summary.text() != "Interfaces") return@forEach

                summary
                    .nextElementSibling()!!
                    .getElementsByTag("li")
                    .forEach { li ->
                        launch {
                            val name = li.text()
                            val url = "${Glob.MOZILLA_BASE_URL}${li.getElementsByTag("a").first()!!.attr("href")}"
                            val builder = Interface.builder()
                                .apply { simpleName = name }
                                .apply { qualifiedName = "$packag3.$simpleName" }
                                .apply { urls["Mozilla"] = url }

                            buildInterface(builder)

                            renderBlock.invoke(builder.build())
                        }
                    }
            }
    }


    companion object {
        fun buildInterface(builder: InterfaceBuilder) = runBlocking {
            Glob
                .fetchDocument(builder.urls["Mozilla"]!!)
                .getElementsByTag("summary")
                .forEach { summary ->
                    if (summary.text() == "Instance methods") {
                        summary
                            .nextElementSibling()!!
                            .getElementsByTag("li")
                            .forEach { li ->
                                launch {
                                    val name = li.text().split("(").first()
                                    val url =
                                        "${Glob.MOZILLA_BASE_URL}${li.getElementsByTag("a").first()!!.attr("href")}"
                                    val methodBuilder = Method.builder()
                                        .apply { this.name = name }
                                        .apply { parent = builder }
                                        .apply { urls["Mozilla"] = url }
                                        .apply { isFinal = false }
                                        .apply { isAbstract = false }
                                        .apply { isOpen = false }
                                        .apply { isSuspend = false }
                                        .apply { returnType = Type.ktypeToType("Unit", Unit::class.createType()) }

                                    buildMethod(methodBuilder)
                                }
                            }
                    }
                    else if (summary.text() == "Instance properties") {
                        summary
                            .nextElementSibling()!!
                            .getElementsByTag("li")
                            .forEach { li ->
                                if (li.getElementsByClass("icon-deprecated").isEmpty()) {
                                    launch {
                                        val name = li.text()
                                        val url = "${builder.urls["Mozilla"]}/$name"
                                        val propertyBuilder = Property.builder()
                                            .apply { this.name = name }
                                            .apply { parent = builder }
                                            .apply { urls["Mozilla"] = url }
                                            .apply { type = "String" }
                                            .apply { mutable = true }
                                            .apply { const = false }

                                        buildProperty(propertyBuilder)
                                    }
                                }
                            }
                    }
                }
        }


        private fun buildProperty(builder: PropertyBuilder) {
            builder.documentationBlock = {
                var ret = ""
                val doc = Glob.fetchDocument(urls["Mozilla"]!!)
                doc
                    .getElementsByClass("section-content")
                    .first()!!
                    .getElementsByTag("p")
                    .forEach { p ->
                        ret += p.text()
                    }

                type =
                    if (ret.contains("positive integer")) "Int"
                    else if (ret.contains("This string uses")) "String"
                    else if (name == "canvas") "HTMLCanvasElement"
                    else if (name == "globalCompositeOperation") "String"
                    else type

                doc
                    .getElementById("value")?.let {
                        if ("fontStretch" == name) {
                            it
                                .getElementsByTag("code")
                                .forEach { code -> allowedValues[code.text()] = "" }
                        }
                        else if ("lineCap" == name ||
                            "textBaseline" == name ||
                            "fontKerning" == name ||
                            "fontVariantCaps" == name ||
                            "globalCompositeOperation" == name ||
                            "strokeStyle" == name ||
                            "textRendering" == name ||
                            "textAlign" == name) {
                            it
                                .nextElementSibling()!!
                                .getElementsByTag("dt")
                                .forEach { dt ->
                                    val dox = dt.nextElementSibling()!!.text()
                                    allowedValues[dt.id()] = dox
                                }
                        }
                        else if ("lineJoin" == name) {
                            builder.defaultValue = "miter"
                            it
                                .nextElementSibling()!!
                                .getElementsByTag("dt")
                                .forEach { dt ->
                                    val dox = dt.nextElementSibling()!!.text()
                                    allowedValues[dt.id()] = dox
                                }
                        }
                        else if ("lineDashOffset" == name) {
                            defaultValue = "0.0"
                            type = "Number" //TODO or Double
                        }
                        else if ("lineWidth" == name) {
                            defaultValue = "1.0"
                            type = "Number"
                        }
                        else if ("shadowBlur" == name) {
                            defaultValue = "0"
                            type = "Number"
                        }
                        else if ("shadowOffsetX" == name) {
                            defaultValue = "0"
                            type = "Number"
                        }
                        else if ("shadowOffsetY" == name) {
                            defaultValue = "0"
                            type = "Number"
                        }
                    }
                ret
            }

            builder.parent!!.properties.add(builder.build())
        }


        private fun buildMethod(builder: MethodBuilder) = runBlocking {
            val url = builder.urls["Mozilla"]!!
            val doc = Glob.fetchDocument(url)

            val text = doc
                .getElementById("syntax")!!
                .nextElementSibling()!!
                .getElementsByTag("code")
                .first()!!
                .text()

            val jobs: MutableList<Deferred<Unit>> = mutableListOf()
            if (!text.contains("()")) { // Building method with parameters
                """\(.*\)"""
                    .toRegex()
                    .find(text)!!
                    .groups[0]!!
                    .value
                    .removeSuffix(")")
                    .removePrefix("(")
                    .split(", ")
                    .forEach { name ->
                        val job = async {
                            val parameterBuilder = Parameter.builder()
                                .apply { this.name = name }
                                .apply { parent = builder }
                                .apply { type = Parameter::class.createType() } //TODO So darn dirty...
                                .apply { isVararg = false }
                                .apply { isOptional = false }
                                .apply { kind = KParameter.Kind.VALUE }
                                .apply { index = parent!!.nextParameterIndex() }
                                .apply { typeName = "Number" }
                                .apply { nullable = false }

                            buildParameter(parameterBuilder)
                        }
                        jobs.add(job)
                    }

            }
            else if (text.contains("()")) {
                noop()
            }

            jobs.awaitAll()

            builder.parent!!.members.add(builder.build())
        }

        fun buildParameter(builder: ParameterBuilder) {
            builder.builderBlock = builder.builderBlockForCanvas2d
            builder.parent!!.parameters.add(builder.build())
        }
    }
}
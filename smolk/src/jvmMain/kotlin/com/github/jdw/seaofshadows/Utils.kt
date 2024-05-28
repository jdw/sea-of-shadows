package com.github.jdw.seaofshadows

import com.fleeksoft.ksoup.nodes.Document
import com.github.jdw.seaofshadows.utils.throws
import com.overzealous.remark.Options
import com.overzealous.remark.Remark

fun Document.getKhronosGroupUrlFromSpecifications(): String {
    val specifications = getElementById("specifications")!!
    val table = specifications
        .nextElementSibling()!!

    val a = table.getElementsByTag("a").first()!!

    return a.attr("href")
}


fun String.htmlToMarkdown(): String {
    if ("" == this) return ""

    val remark = Remark(Options.markdown())

    return remark.convert(this)
        .replace("\\[", "[").replace("\\]", "]")
        .replace("**`", "[").replace("`**", "]")
        .replace("`<canvas>` element", "[Canvas] object")
        .replace("[`getContext()`][getContext]", "[getContext]")
        .replace("[`WebGL2RenderingContext`]", "[WebGL2RenderingContext]")
        .replace("[`<canvas>`][canvas]", "`canvas`")
        .replace("an access", "access")
        .replace("[WebGL tutorial][]", "*WebGL tutorial*")
        .replace("[WebGL API][]", "*WebGL API*")
        .replace("**", "")
        .replace("[`WebGLRenderingContext.getActiveAttrib()`]", "[WebGLRenderingContext].[getActiveAttrib]")
        .replace("[WebGLRenderingContext.getActiveAttrib]", "[WebGLRenderingContext].[getActiveAttrib]")
        .replace("[`WebGLRenderingContext.getActiveUniform()`]", "")
        .replace("[WebGLRenderingContext.getActiveUniform]", "[WebGLRenderingContext].[getActiveUniform]")
        .replace("[`attachShader()`][attachShader]", "[attachShader]")
        .replace("[`WebGLProgram`][WebGLProgram]", "[WebGLProgram]")
        .replace("[`WebGLShader`][WebGLShader]", "[WebGLShader]")
        .replace("]s", "]")
        .replace("()", "")
        .replace("[`WebGLRenderingContext.getShaderPrecisionFormat()`][WebGLRenderingContext.getShaderPrecisionFormat]", "[WebGLRenderingContext].[getShaderPrecisionFormat]")
        .replace("[WebGLRenderingContext].[getActiveAttrib][WebGLRenderingContext].[getActiveAttrib]", "[WebGLRenderingContext].[getActiveAttrib]")
        .replace("[WebGL2RenderingContext][WebGL2RenderingContext]", "[WebGL2RenderingContext]")
        .replace("[WebGL2RenderingContext.compressedTexImage3D]", "[WebGL2RenderingContext].[compressedTexImage3D]")
}


fun String.formatAfterFirstKeywordMatch(keywords: List<String>): String {
    if ("" == this) return ""
    if (keywords.isEmpty()) return this
    if ("enables" == this && keywords.size == 1 && keywords.contains("enable")) return "enables"
    if ("TEXTUREI" == this && keywords.size == 1 && keywords.contains("TEXTURE")) return "TEXTUREI"
    if (1 == keywords.size && this == "[${keywords[0]}]") return this

    val newlineWasRemoved = this != this.removeSuffix("\n")
    val that = this.removeSuffix("\n")

    keywords.forEach { keyword ->
        if (that == "[enableVertexAttribArray],")
            return this

        var newPiece = when (that) {
            keyword,
            "[$keyword",
            "[`$keyword",
            "[`$keyword`][$keyword]s",
            "[`$keyword`][$keyword]",
            "[`$keyword()`][$keyword]",
            "$keyword()]",
            "$keyword]",
            "$keyword]:",
            "$keyword:",
            "$keyword;",
            "$keyword,",
            "$keyword()",
            "[$keyword()]",
            "`$keyword()`",
            "`$keyword`",
            "`$keyword",
            "`[$keyword]`",
            "[$keyword]",
            "**$keyword**",
            "$keyword`",
            "($keyword)",
            "$keyword()`",
            "$keyword)",
            "($keyword",
            "`$keyword()`" -> "[$keyword]"
            "$keyword,",
            "`$keyword()`,",
            "[$keyword()],",
            "(`$keyword()`,",
            "[$keyword],",
            "`$keyword`," -> "[$keyword],"
            "`$keyword`)",
            "`$keyword()`)" -> "[$keyword])"
            "$keyword][gl" -> "[$keyword][gl"
            "$keyword\nBuffer" -> "[$keyword] Buffer"
            "$keyword\nCollection" -> "[$keyword] Collection"
            "(`$keyword`," -> "([$keyword],"
            else -> that
        }

        if (that != newPiece) {
            if (newlineWasRemoved) newPiece += "\n"
            return newPiece
        }

    }

    throws("'$this' failed matching any of $keywords")
}


fun String.applyKeywords(): String {
    if ("" == this) return ""

    val ret = mutableListOf<String>()
    this.split(" ").forEach { splitOnSpace ->
        if (" " == splitOnSpace) {
            ret.add(splitOnSpace)
            return@forEach
        }

        if (!splitOnSpace.contains(".")) {
            val keywords = splitOnSpace.keywordsContained(Glob.keywordsToBeBracketedInKdoc)
            ret.add(splitOnSpace.formatAfterFirstKeywordMatch(keywords))
        }
        else {
            val pieces = mutableListOf<String>()
            splitOnSpace
                .split(".")
                .forEach {
                    val keywords = it.keywordsContained(Glob.keywordsToBeBracketedInKdoc)
                    pieces.add(it.formatAfterFirstKeywordMatch(keywords))
                }
            ret.add(pieces.joinToString(separator = ".") { it })
        }
    }

    return ret.joinToString(separator = " ") { it }
}


fun String.keywordsContained(collection: Collection<String>): List<String> {
    if ("" == this) return emptyList()

    val shortestWord = collection.minByOrNull { it.length }!!
    if (this.length < shortestWord.length) return emptyList()

    val regex = Regex("[a-zA-Z0-9_]".trim())
    var that = ""
    this.forEach {
        if (regex.matches("$it"))
            that += it
    }
    val ret = mutableListOf<String>()

    collection.forEach { keyword ->
//        if (this.contains(" $keyword") ||
//            this.contains(".$keyword") ||
//            this.contains("`$keyword") ||
//            this.contains("[$keyword") ||
//            this.contains("$keyword]"))
        //if (this.contains(keyword)) ret.add(keyword)
        if (that == keyword) ret.add(keyword)
    }

    return ret.sortedBy { it.length }.reversed().toList()
}


fun String.formatAfterMaxWidth(maxWidth: Int = 81): List<String> {
    if ("" == this) return emptyList()

    val paragraphs = this.split("    ")
    val ret: MutableList<String> = mutableListOf()

    paragraphs.forEach { paragraph ->
        var row = ""
        paragraph.split(" ").forEach { piece ->
            if ("$row $piece".length < maxWidth) {
                row = "$row $piece"
                return@forEach
            }

            ret.add(row)
            row = piece
        }
        if ("" != row) ret.add(row)
        ret.add("")
    }

    return if (ret.last() == "") ret.subList(0, ret.size - 1).toList() // Remove the trailing empty row
        else ret.toList()
}
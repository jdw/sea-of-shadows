package com.github.jdw.seaofshadows.subcommandos.importers

import com.fleeksoft.ksoup.nodes.Document
import com.github.jdw.seaofshadows.Glob

data class Method(val doc: Document, val name: String, var url: String) {
    var returnTypeUncertain: Boolean = false
    var returnType: String = ""
    val parameters = mutableListOf<Parameter>()
        get() {
            field.sortBy { it.order }
            return field
        }
    var kdoc: String = ""

    fun getUncertainties(): String {
        Glob.debug("Getting uncertainties for function: $name...")
        var ret = ""
        parameters.toList().forEach { p ->
            assert("" != p.name)
            if ("" == p.type) ret += "${p.name} = empty type, "
            if (p.typeChanged) ret += "${p.name} type changed, "
            if ("" != p.kdoc) ret += "${p.name} = empty kdoc, "

            var order = 0
            val size = parameters.size
            (parameters.first().order..parameters.last().order).forEach { idx ->
                if (idx < 0 || size < idx) ret += "idx = $idx"
                if (parameters[idx].order != order) ret += "${p.name} = OOO (${p.order} != $order), "
                order++
            }
        }
        if ("" == kdoc) ret += "kdoc empty, "
        if (returnTypeUncertain) ret += "return = uncertain, "

        return if ("" == ret) ret
        else {
            "// $ret".removeSuffix(", ")
        }
    }
}
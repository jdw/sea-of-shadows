package com.github.jdw.seaofshadows.subcommandos.importers

data class Parameter(
    val name: String,
    val order: Int, // Maintain the same order as in the API doc!
    val parent: Method
) {
    var typeChanged = false
    var type: String = ""
        //TODO "Array" should be supported by kotlin-stdlib SIC
        get() = when (field) {
            "Array" -> {
                typeChanged = true
                "Array<String>"
            }
            else -> {
                typeChanged = false
                field
            }
        }
    var kdoc: String = ""
}
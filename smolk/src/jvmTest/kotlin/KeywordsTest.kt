package com.github.jdw.seaofshadows

import org.junit.Test

class KeywordsTest {
    @Test
    fun `Testing GLuint`() {
        assert("A [GLuint] specifying the index of the generic vertex to bind." == "A GLuint specifying the index of the generic vertex to bind.".applyKeywords())
    }
}
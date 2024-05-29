package com.github.jdw.seaofshadows

import spock.lang.Specification

class KeywordTests extends Specification {
    def "Testing GLuint"() {

        expect:
        "A [GLuint] specifying the index of the generic vertex to bind." == "A GLuint specifying the index of the generic vertex to bind."
    }
}
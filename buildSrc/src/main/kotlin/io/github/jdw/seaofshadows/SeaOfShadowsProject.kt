package com.github.jdw.seaofshadows

import org.gradle.kotlin.dsl.provideDelegate
import org.jetbrains.kotlin.konan.properties.loadProperties

object SeaOfShadowsProject {
    val version: String by loadProperties("gradle.properties")
    val name: String by loadProperties("gradle.properties")
    val group: String by loadProperties("gradle.properties")

    object Dependencies {
        val kotlinVersion: String by loadProperties("gradle.properties")
        val javaVersion: String by loadProperties("gradle.properties")
        val kotlinxSerializationVersion: String by loadProperties("gradle.properties")
        val kotlinxCoroutinesVersion: String by loadProperties("gradle.properties")
        val foojayResolverConventionVersion: String by loadProperties("gradle.properties")
        val ktorVersion: String by loadProperties("gradle.properties")
        val cliktVersion: String by loadProperties("gradle.properties")
    }
}
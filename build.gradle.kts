import com.github.jdw.seaofshadows.SeaOfShadowsProject

buildscript {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}

plugins {
    id("org.jetbrains.kotlin.multiplatform") apply false
    id("maven-publish")
    id("org.jetbrains.kotlin.plugin.serialization")
}

allprojects {
    apply {
        plugin("java")
        plugin("idea")
    }

    version = SeaOfShadowsProject.version
    group = SeaOfShadowsProject.group

    repositories {
        mavenLocal()
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.multiplatform")
        plugin("org.jetbrains.kotlin.plugin.serialization")
    }

    //val implementation by configurations
}

tasks.forEach { task ->
    if (task.name == "clean") {
        task.doFirst {
            delete(setOf("${task.project.projectDir}/output"))
        }
    }
}

//tasks.create("listRepos") {
//    doLast {
//        println("Repositories: ")
//        project.repositories.forEach {
//            println(" * Name: " + it.name + "\n * info: " + it)
//        }
//    }
//}
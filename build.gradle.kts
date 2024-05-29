buildscript {
    repositories {
        mavenCentral()
        mavenLocal()
        gradlePluginPortal()
        google()
    }
}

plugins {
    id("org.jetbrains.kotlin.multiplatform") apply false
    id("maven-publish")
    id("org.jetbrains.kotlin.plugin.serialization")
    id("com.toasttab.protokt")
    //id("protokt.multiplatform-conventions") apply false
}

val VERSION: String by properties
val GROUP: String by properties


allprojects {
    apply {
        plugin("java")
        plugin("idea")
    }

    version = VERSION
    group = GROUP

    dependencies {

    }
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

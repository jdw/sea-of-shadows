plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("java-library")
}

val javaVersion: String by properties

kotlin {
    jvm()
    js() {
        browser()
    }

    applyDefaultHierarchyTemplate()

    sourceSets {
        val commonMain by getting {

        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(javaVersion))
    }

    sourceCompatibility = JavaVersion.toVersion(javaVersion)
    targetCompatibility = JavaVersion.toVersion(javaVersion)
}
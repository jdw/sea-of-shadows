import com.google.protobuf.gradle.protobuf
import protokt.v1.gradle.protokt

buildscript {
    repositories {
        mavenLocal()
    }
}

plugins {
    id("com.toasttab.protokt")
    //id("protokt.multiplatform-conventions")
}

val javaVersion: String by properties
val kotlinVersion: String by properties


kotlin {
    js(IR) {
        nodejs()
        binaries.library()
    }
    jvm() {
        withJava()
    }

    applyDefaultHierarchyTemplate()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":seaofshadows-core"))
                implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
            }
        }
        val jsMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-js:$kotlinVersion")
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
                implementation("com.google.protobuf:protobuf-javalite:4.27.0")
            }
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

dependencies {
    //protobuf(libs.protobuf.java)
    protobuf(files("../protocol/protobuf-v3/canvas2d"))

}

buildscript {
    repositories {
        mavenLocal()
    }
}

plugins {

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
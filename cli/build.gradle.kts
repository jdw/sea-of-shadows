//import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.cliktVersion
//import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.javaVersion
//import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.kotlinxCoroutinesVersion
//import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.kotlinxSerializationVersion
//import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.kotlinVersion
import java.net.URI

plugins {
    id("application")
}

repositories {
    maven { url = URI("https://repo.repsy.io/mvn/chrynan/public") }
}

val kotlinxSerializationVersion: String by properties
val cliktVersion: String by properties
val kotlinVersion: String by properties
val kotlinxCoroutinesVersion: String by properties
val javaVersion: String by properties

kotlin {
    jvm() {
        withJava()
    }

    applyDefaultHierarchyTemplate()

    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":seaofshadows-core"))

                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$kotlinxSerializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:$kotlinxSerializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinxSerializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:$kotlinxCoroutinesVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-html:0.11.0")
                implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.11.0")
                implementation("com.github.ajalt.clikt:clikt:$cliktVersion")
                implementation("com.fleeksoft.ksoup:ksoup:0.1.2")
                implementation("com.github.kittinunf.fuel:fuel-jvm:3.0.0-alpha1")
                implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

                implementation("com.chrynan.uri:uri-core:0.4.0")
                implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
            }
        }
    }
}

application {
    mainClass.set("com.github.jdw.seaofshadows.Main")
}

tasks.withType<Jar> {
    // Otherwise you'll get a "No main manifest attribute" error
    manifest {
        attributes["Main-Class"] = "com.github.jdw.seaofshadows.MainKt"
    }

    // To avoid the duplicate handling strategy error
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    destinationDirectory.set(File("${project.projectDir}/output/"))
    // To add all of the dependencies
    //from(sourceSets.main.get().output)

    dependsOn(configurations.runtimeClasspath)
    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(javaVersion))
    }

    sourceCompatibility = JavaVersion.toVersion(javaVersion)
    targetCompatibility = JavaVersion.toVersion(javaVersion)
}
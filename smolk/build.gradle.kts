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
val kotlinxHtmlVersion: String by properties
val ksoupVersion: String by properties
val fuelVersion: String by properties

kotlin {
    jvm() {
        withJava()
    }

    applyDefaultHierarchyTemplate()

    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation(project(":seaofshadows-core"))
                implementation(project(":webgl-shared"))

                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$kotlinxSerializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:$kotlinxSerializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinxSerializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:$kotlinxCoroutinesVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-html:$kotlinxHtmlVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:$kotlinxHtmlVersion")
                implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
                implementation("com.github.ajalt.clikt:clikt:$cliktVersion")
                implementation("com.fleeksoft.ksoup:ksoup:$ksoupVersion")
                implementation("com.github.kittinunf.fuel:fuel-jvm:$fuelVersion")
                implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
                implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")
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

tasks.forEach { task ->
    if (task.name == "clean") {
        task.doFirst {
            delete(setOf("${project.projectDir}/output"))
        }
    }
}
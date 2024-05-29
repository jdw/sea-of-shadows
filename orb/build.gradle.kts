import java.net.URI

plugins {
    id("application")
    id("groovy")
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
    js {
        nodejs()
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
                implementation("com.overzealous:remark:1.1.0")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-css:1.0.0-pre.754")
            }
        }
        val jvmTest by getting {
            dependencies {
//                implementation("org.jetbrains.kotlin:kotlin-test:$kotlinVersion")
//                implementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
//                //implementation(kotlin("test-junit"))
//                implementation("org.junit.jupiter:junit-jupiter:5.10.2")
//                implementation("org.junit.platform:junit-platform-launcher:1.10.2")
//                implementation("org.spockframework:spock-core:2.4-M4-groovy-2.5")
//                implementation("org.codehaus.groovy:groovy-all:3.0.21")
////                implementation("io.kotest:kotest-bom:5.9.0")
////                implementation("io.kotest:kotest-framework-api")
////                implementation("io.kotest:kotest-runner-junit5")
////                implementation("io.kotest:kotest-assertions-core")
////                implementation("io.mockk:mockk:1.13.5")
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

tasks.withType<Test> {
    useJUnitPlatform()

    testLogging {
        events("started", "passed", "skipped", "failed")
    }
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
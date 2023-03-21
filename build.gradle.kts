plugins {
    kotlin("jvm") version "1.8.0"
    id("io.kotest.multiplatform") version "5.0.2"
    id("io.gitlab.arturbosch.detekt") version "1.22.0"
    id("org.jetbrains.dokka") version "1.7.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    //kotest
    testImplementation("io.kotest:kotest-runner-junit5-jvm:5.5.4")
    testImplementation("io.kotest:kotest-runner-junit5:5.5.4")
    testImplementation("io.kotest:kotest-assertions-core:5.5.4")
    testImplementation("io.kotest:kotest-property:5.5.4")
    //detekt
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.22.0")
    //mockk
    testImplementation("io.mockk:mockk:1.13.4")
    testImplementation("org.testng:testng:7.1.0")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)

}
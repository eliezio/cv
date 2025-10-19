plugins {
    kotlin("jvm") version "2.2.20"
    application
}

group = "io.eliez"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.asciidoctor:asciidoctorj:3.0.0")
    implementation("org.asciidoctor:asciidoctorj-pdf:2.3.19")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("MainKt")
}

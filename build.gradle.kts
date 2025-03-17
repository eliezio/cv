plugins {
    kotlin("jvm") version "1.9.0"
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
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}

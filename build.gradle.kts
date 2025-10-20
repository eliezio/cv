plugins {
    id("org.asciidoctor.jvm.pdf") version "4.0.5"
}

group = "io.eliez"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.asciidoctorPdf {
    fontsDirs(listOf("src/docs/asciidoc/fonts"))
    setTheme("cv")
    setOutputDir(file("cv"))
}

tasks.build {
    dependsOn(tasks.asciidoctorPdf)
}

pdfThemes {
    local("cv") {
        themeDir = file("src/docs/asciidoc/themes")
        themeName = "cv.yml"
    }
}
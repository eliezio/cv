import org.asciidoctor.Asciidoctor
import org.asciidoctor.Attributes
import org.asciidoctor.Options
import java.io.File

fun main() {
    val attributes = Attributes.builder()
        .attribute("pdf-themesdir", "src/main/asciidoc/themes")
        .attribute("pdf-theme", "cv.yml")
        .build()
    val asciidoctor = Asciidoctor.Factory.create();
    asciidoctor.convertFile(
        File("src/main/asciidoc/eliezio.adoc"),
        Options.builder()
            .attributes(attributes)
            .backend("pdf")
            .toDir(File("./cv"))
            .build()
    )
}

plugins {
    id("java")

    id("application")
    id("org.openjfx.javafxplugin") version "0.0.14"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("org.jsoup:jsoup:1.16.1")
    implementation("org.json", "json", "20230227")

    implementation("org.jfxtras:jmetro:11.6.14")
    implementation("com.dlsc.formsfx", "formsfx-core", "1.2.1")

    implementation("net.harawata:appdirs:1.2.1")

}

application {
    mainModule.set("shibbyExplorer")
    mainClass.set("ui.Main")
}

javafx {
    version = "20"
    modules( "javafx.controls", "javafx.fxml" )
}



tasks.test {
    useJUnitPlatform()
}
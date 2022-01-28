import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm") version "1.6.10"
    id("org.jetbrains.compose") version "1.0.1"
}

tasks.compileKotlin {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    compileOnly(compose.desktop.currentOs)
}

compose.desktop {

    application {
        mainClass = "TestCompose"

        nativeDistributions {
            packageName = "TestCompose"
            version = "1.0.0"
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)

            appResourcesRootDir.set(project.layout.projectDirectory.dir("resources"))
        }
    }
}

repositories {
    mavenCentral()
}






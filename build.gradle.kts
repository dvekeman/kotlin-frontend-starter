import org.jetbrains.kotlin.gradle.frontend.webpack.WebPackExtension
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

group = "org.example"
version = "1.0-SNAPSHOT"

plugins {
    id("kotlin2js") version "1.3.31"
    id("org.jetbrains.kotlin.frontend") version "0.0.45"
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))

    implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.6.10")
}

tasks {
    "compileKotlin2Js"(Kotlin2JsCompile::class) {
        kotlinOptions {
            outputFile = "${project.buildDir.path}/js/main.js"
            moduleKind = "umd"
            metaInfo = true
            sourceMap = true
            main = "call"
        }
    }
}

kotlinFrontend {
    downloadNodeJsVersion = "latest"

    npm {
        dependency("style-loader")
    }

    bundle<WebPackExtension>("webpack") {
        this as WebPackExtension
        bundleName = "main"
        mode = "development"
    }
}



plugins {
    kotlin("multiplatform") version "2.0.21"
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.21"
    id("org.jetbrains.compose") version "1.7.1"
}

kotlin {
    js(IR) {
        browser {
            commonWebpackConfig {
                outputFileName = "app.js"
            }
        }
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.html.core)
            }
        }
    }
}


plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

gradlePlugin {
    plugins {
        register("publishConvention") {
            id = "komposto.publish"
            implementationClass = "com.trendyol.design.buildlogic.PublishConvention"
        }
        register("androidLibrary") {
            id = "komposto.library"
            implementationClass = "com.trendyol.design.buildlogic.LibraryConventionPlugin"
        }
        register("androidApplication") {
            id = "komposto.application"
            implementationClass = "com.trendyol.design.buildlogic.ApplicationConventionPlugin"
        }
    }
}

dependencies {
    implementation(libs.gradleMavenPublishPlugin)
    implementation(libs.detektGradlePlugin)
    implementation(libs.kspGradlePlugin)
    implementation(libs.shot)
    implementation(libs.dokkaDocumentationPlugin)
    compileOnly(libs.androidGradlePlugin)
    compileOnly(libs.kotlinGradlePlugin)
}

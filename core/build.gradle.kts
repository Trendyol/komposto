import io.gitlab.arturbosch.detekt.extensions.DetektExtension

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("io.gitlab.arturbosch.detekt")
    id("maven-publish")
    id("kotlin-parcelize")
}

android {
    namespace = "com.trendyol.design.core"
    compileSdk = 34

    defaultConfig {
        minSdk = 23

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    kotlin {
        explicitApi()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
    }
}

publishing {
    repositories {
        maven {
            name = "Nexus"
            url = uri("http://10.84.105.74/repository/maven-releases")
            isAllowInsecureProtocol = true
            credentials {
                username = properties["NEXUS_USER"]?.toString() ?: System.getenv("NEXUS_USER")
                password = properties["NEXUS_PASS"]?.toString() ?: System.getenv("NEXUS_PASS")
            }
        }
    }
    publications {
        register<MavenPublication>("release") {
            groupId = "com.trendyol"
            artifactId = "design-core"
            version = publishedLibs.versions.design.get()

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}

configure<DetektExtension> {
    buildUponDefaultConfig = true
    config.from.add("$rootDir/config/detekt/detekt.yml")
    config.from.add("$rootDir/config/detekt/detekt-compose.yml")
}

dependencies {

    api(projects.theme)

    implementation(libs.androidx.core)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.ui.tooling)
    implementation(libs.androidx.compose.ui.util)
    implementation(libs.kotlinXImmutableCollections)

    detektPlugins(libs.detekt.formatting)
    detektPlugins(libs.detekt.composeRules)
}

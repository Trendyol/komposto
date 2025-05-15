import io.gitlab.arturbosch.detekt.extensions.DetektExtension

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("io.gitlab.arturbosch.detekt")
    id("maven-publish")
    id("org.jetbrains.dokka")
}

android {
    namespace = "com.trendyol.theme"
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
            name = "GithubPackages"
            url = uri("https://maven.pkg.github.com/Trendyol/design-android")
            credentials {
                username = System.getenv("GPR_USER")
                password = System.getenv("GPR_API_KEY")
            }
        }
    }
    publications {
        register<MavenPublication>("release") {
            groupId = "com.trendyol"
            artifactId = "design-theme"
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

    implementation(libs.androidx.core)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.ui.tooling)

    detektPlugins(libs.detekt.formatting)
    detektPlugins(libs.detekt.composeRules)
}

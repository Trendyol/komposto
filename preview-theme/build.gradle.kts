import io.gitlab.arturbosch.detekt.extensions.DetektExtension

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("io.gitlab.arturbosch.detekt")
}

android {
    namespace = "com.trendyol.design.previewtheme"
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
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

    detektPlugins(libs.detekt.formatting)
    detektPlugins(libs.detekt.composeRules)
}
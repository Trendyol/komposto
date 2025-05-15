import io.gitlab.arturbosch.detekt.extensions.DetektExtension

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("io.gitlab.arturbosch.detekt")
    id("shot")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.trendyol.design"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.trendyol.design"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testApplicationId = "com.trendyol.design.screenshot.test"
        testInstrumentationRunner = "com.karumi.shot.ShotTestRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

shot {
    applicationId = "com.trendyol.design.screenshot.test"
    showOnlyFailingTestsInReports = true
}

configure<DetektExtension> {
    buildUponDefaultConfig = true
    config.from.add("$rootDir/config/detekt/detekt.yml")
    config.from.add("$rootDir/config/detekt/detekt-compose.yml")
}

ksp {
    arg("skipPrivatePreviews", "true")
}

dependencies {

    implementation(projects.core)
    implementation(projects.bottomsheet)

    implementation(libs.androidx.core)
    implementation(libs.androidx.lifecycle.runtime)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.appCompat)
    implementation(libs.android.material)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.ui.tooling)
    implementation(libs.androidx.compose.ui.googleFonts)

    implementation(libs.showkase)
    ksp(libs.showkaseProcessor)

    detektPlugins(libs.detekt.formatting)
    detektPlugins(libs.detekt.composeRules)

    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.test.rules)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}

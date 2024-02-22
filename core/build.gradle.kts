import io.gitlab.arturbosch.detekt.extensions.DetektExtension

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("io.gitlab.arturbosch.detekt")
    id("maven-publish")
}

android {
    namespace = "com.trendyol.design.core"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

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

publishing {
    repositories {
        maven {
            name = "Nexus"
            url = uri("http://10.10.42.172:8082/repository/maven-releases")
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
            version = properties["VERSION"]?.toString() ?: System.getenv("VERSION")

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

    api(project(":theme"))

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.compose.material:material:1.5.1")
    implementation("androidx.compose.ui:ui-tooling:1.5.1")

    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.22.0")
    detektPlugins("io.nlopez.compose.rules:detekt:0.1.13")
}

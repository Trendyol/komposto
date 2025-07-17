plugins {
    id("komposto.library")
    id("komposto.publish")
}

android {
    namespace = "com.trendyol.theme"
}

dependencies {

    implementation(libs.androidxCore)

    implementation(platform(libs.androidxComposeBOM))
    implementation(libs.androidxComposeMaterial)
    implementation(libs.androidxComposeUiTooling)
}

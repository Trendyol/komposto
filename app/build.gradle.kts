plugins {
    id("komposto.application")
}

android {
    namespace = "com.trendyol.design"

    defaultConfig {
        applicationId = "com.trendyol.design"
    }
}

dependencies {

    implementation(projects.core)
    implementation(projects.bottomsheet)

    implementation(libs.androidxCore)
    implementation(libs.androidxLifecycleRuntime)
    implementation(libs.androidxActivityCompose)
    implementation(libs.androidxAppCompat)
    implementation(libs.androidMaterial)

    implementation(platform(libs.androidxComposeBOM))
    implementation(libs.androidxComposeUiUi)
    implementation(libs.androidxComposeUiGraphics)
    implementation(libs.androidxComposeMaterial)
    implementation(libs.androidxComposeMaterialIconsCore)
    implementation(libs.androidxComposeUiTooling)
    implementation(libs.androidxComposeUiGoogleFonts)

    implementation(libs.showkase)
    ksp(libs.showkaseProcessor)

    androidTestImplementation(libs.androidxComposeUiTestJunit4)
    androidTestImplementation(libs.androidxTestRules)
    debugImplementation(libs.androidxComposeUiTestManifest)
}

// Top-level build.gradle.kts

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.tiktokxsleppify"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.tiktokxsleppify"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
}

plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.qrcode"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.qrcode"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    // Define the CameraX version
    val camerax_version = "1.2.2"

    // CameraX core library using the camera2 implementation
    implementation(libs.camera.core)
    implementation(libs.camera.camera2)

    // Optional CameraX Lifecycle library
    implementation(libs.camera.lifecycle)

    // CameraX View class
    implementation(libs.camera.view)

    // CameraX Extensions library
    implementation(libs.camera.extensions)

    // Other dependencies
    implementation(libs.appcompat.v161)
    implementation(libs.material.v190)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(libs.barcode.scanning)
//Without google play store
    implementation(libs.barcode.scanning)

//with google play store

    implementation(libs.play.services.mlkit.barcode.scanning)

    // Kotlin BOM (Bill of Materials)
    implementation(platform(libs.kotlin.bom))

    implementation(libs.concurrent.futures.ktx)

}
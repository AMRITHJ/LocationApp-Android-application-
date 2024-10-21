plugins {
    id("com.android.application")
    id("com.google.gms.google-services") // Firebase services
}

android {
    namespace = "com.example.endsemlab"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.endsemlab"
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
    implementation("androidx.appcompat:appcompat:1.7.0") // Check for the latest version
    implementation("com.google.android.material:material:1.10.0") // Latest version
    implementation("androidx.activity:activity:1.7.0") // Latest version
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") // Latest version
    testImplementation("junit:junit:4.13.2") // Latest version
    androidTestImplementation("androidx.test.ext:junit:1.1.5") // Latest version
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1") // Latest version

    // Firebase Realtime Database and Analytics dependencies
    implementation("com.google.firebase:firebase-database:20.3.0")
    implementation("com.google.firebase:firebase-analytics:21.3.0")

    // Optional: Firebase Authentication (if needed)
    implementation("com.google.firebase:firebase-auth:22.1.1")

    // Google Play Services Location dependency
    implementation("com.google.android.gms:play-services-location:21.0.1") // Ensure you have the latest version
}

apply(plugin = "com.google.gms.google-services")

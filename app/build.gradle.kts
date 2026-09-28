plugins {
    alias(libs.plugins.android.application)
}

android {
<<<<<<< HEAD
    namespace = "com.teo.aplicacionsaludos"
=======
    namespace = "com.teo.bottoncillo"
>>>>>>> 81516ffaaf6423e182981d88ff5f8a40189040c2
    compileSdk {
        version = release(37)
    }

    defaultConfig {
<<<<<<< HEAD
        applicationId = "com.teo.aplicacionsaludos"
=======
        applicationId = "com.teo.bottoncillo"
>>>>>>> 81516ffaaf6423e182981d88ff5f8a40189040c2
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
<<<<<<< HEAD
}

=======
}
>>>>>>> 81516ffaaf6423e182981d88ff5f8a40189040c2

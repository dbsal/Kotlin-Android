plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.app_project"
    compileSdk = 35 // 최신 버전으로 유지

    defaultConfig {
        applicationId = "com.example.app_project"
        minSdk = 24
        targetSdk = 35 // compileSdk와 동일하게 설정 권장

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

}

dependencies {


    // View Binding 활성화 (레이아웃 요소에 쉽게 접근하기 위해 권장)
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)


    // Fragment 지원 라이브러리 및 KTX 확장 추가
    // libs.versions.toml에 정의되어 있다면 alias를 사용하세요 (예: libs.androidx.fragment.ktx)
    implementation("androidx.fragment:fragment-ktx:1.6.2") // 최신 안정화 버전으로 변경하세요.

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
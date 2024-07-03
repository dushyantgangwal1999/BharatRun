plugins {
    alias(libs.plugins.bharatrun.android.feature.ui)
}

android {
    namespace = "com.example.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}
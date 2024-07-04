plugins {
    alias(libs.plugins.bharatrun.android.library)
    alias(libs.plugins.bharatrun.jvm.ktor)
}

android {
    namespace = "com.example.data"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
    implementation(projects.core.data) // If we are in feature data module. then, we are also allowed to access feature data module
}
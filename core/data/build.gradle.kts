plugins {
    alias(libs.plugins.bharatrun.android.library)
    alias(libs.plugins.bharatrun.jvm.ktor)
}

android {
    namespace = "com.example.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(projects.core.domain)
    implementation(projects.core.database)
}
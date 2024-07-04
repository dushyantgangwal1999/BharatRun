plugins {
    alias(libs.plugins.bharatrun.android.library)
    alias(libs.plugins.bharatrun.jvm.ktor)
}

android {
    namespace = "com.example.run.network"
}
dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.database)
}
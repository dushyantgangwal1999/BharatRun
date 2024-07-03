plugins {
    alias(libs.plugins.bharatrun.android.library.compose)
}

android {
    namespace = "com.example.core.presentation.designsystem"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    debugImplementation(libs.androidx.compose.ui.tooling)
    api(libs.androidx.compose.material3)
    /** api(libs.androidx.compose.material3) this will help us to access functions of
    material3 inside the modules that are implementing this designSystem Module.
     If we have used implementaion(..) then we can use functions of material3
    but only in designSystem Module
     **/

}
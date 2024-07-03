package com.example.convention

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*,*,*,*,*>
){
    commonExtension.run {
        buildFeatures {
            compose = true
        }


        composeOptions {
            kotlinCompilerExtensionVersion = libs
                .findVersion("composeCompiler")
                .get()
                .toString()
        }
        /**
         * This setup ensures that your project uses a consistent set of
         * Jetpack Compose libraries that are known to work well together.
         * Using a BOM simplifies version management and compatibility,
         * and the debugImplementation ensures you have tools for UI
         * preview during development.
         */
        dependencies {
            val bom = libs.findLibrary("androidx.compose.bom").get()
            "implementation"(platform(bom))
            "androidTestImplementation"(platform(bom))
            "debugImplementation"(libs.findLibrary("androidx.compose.ui.tooling.preview").get())
        }
    }
}
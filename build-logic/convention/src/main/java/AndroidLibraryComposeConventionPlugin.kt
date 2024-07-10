import com.android.build.api.dsl.LibraryExtension
import com.example.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("bharatrun.android.library")
                apply("org.jetbrains.kotlin.plugin.compose")
            }

            val extensions = extensions.getByType<LibraryExtension>()
            configureAndroidCompose(extensions)
        }
    }
}
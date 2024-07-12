import com.android.build.api.dsl.LibraryExtension
import com.kreativmynds.convention.ExtensionType
import com.kreativmynds.convention.configureBuildTypes
import com.kreativmynds.convention.configureKotlinAndroid
import com.kreativmynds.convention.configureKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

class JvmLibraryConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("org.jetbrains.kotlin.jvm")
            }

            configureKotlinJvm()
        }
    }

}
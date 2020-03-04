import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin3 implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('MyTask3',group:'demo_plugin').doLast {
            println 'MyTask3  in plugin from rootProject(src/main)) class'
        }
    }
}

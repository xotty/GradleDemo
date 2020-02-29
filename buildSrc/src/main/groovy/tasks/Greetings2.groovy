import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class Greetings2 extends DefaultTask {
    String xName="Gradle"
    @TaskAction
    void myAction1(){
        println "Hello $xName!"
    }
    @TaskAction
    def myAction2(){
        println "Hi $xName!"
    }
}

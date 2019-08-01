package example

import com.intellij.openapi.components.ProjectComponent
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages

class MyComponent(private val currentProject: Project) : ProjectComponent {

    override fun getComponentName(): String {
        return "component: ${currentProject.name}"
    }

    override fun initComponent() {
        println("component: initComponent when IDEA is starting, $currentProject")
    }

    fun helloInComponent() {
        Messages.showInfoMessage("Hello from MyComponent", "Hello $currentProject")
    }

}
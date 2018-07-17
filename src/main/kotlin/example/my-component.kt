package example

import com.intellij.openapi.components.ApplicationComponent
import com.intellij.openapi.ui.Messages

class MyComponent : ApplicationComponent {

    override fun getComponentName(): String {
        return "component: idea-plugin-component-init-demo"
    }

    override fun disposeComponent() {
        println("component: disposeComponent")
    }

    override fun initComponent() {
        println("component: initComponent when IDEA is starting")
    }

    fun helloInComponent() {
        Messages.showInfoMessage("Hello from MyComponent", "Hello")
    }

}
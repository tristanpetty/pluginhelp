package com.github.tristanpetty.pluginhelp.services

import com.intellij.openapi.project.Project
import com.github.tristanpetty.pluginhelp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

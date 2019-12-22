package com.gzd.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class John implements Plugin<Project> {

    @Override
    void apply(Project target) {
        def extension  = target.extensions.create("myDefine", MyExtension) //定义成一个方法，默认是修改属性值
        println("hello ${extension.p1}")
        target.afterEvaluate { //全部的配置跑完后执行
            println("hello ${extension.p1}")
        }
    }
}

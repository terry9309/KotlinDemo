package com.terry.base3

import java.io.File


/**
 *   Kotlin 中的apply 的 使用
 */
fun main() {

    val  info = "JAMES is Best"


    //普通用法：apply 始终返回 info 本身
    val info1 = info.apply {

        println("info 的内容是$this")   //this指的是info本身
        println("info 的长度是${this.length}")
    }

    println("apply 返回值是：$info1") //返回自身



    //apply 用法精髓： 链式调用

    info.apply {
        println("info 的长度是${this.length}")
    }.apply {
        println("info 的最后一个字母是${this[length-1]}")
    }.apply {
        println("info 转换为小写之后为${this.toLowerCase()}")
    }


}
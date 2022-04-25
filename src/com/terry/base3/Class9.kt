package com.terry.base3

/**
 *  Kotlin 中的Run 函数
 */
fun main() {

    val info = "Orving is best"

    val  result = info.run {   //this 为info 本身

        true

        17.8               //返回值为匿名函数最后一行的值

    }

    println(result)



}
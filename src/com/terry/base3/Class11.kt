package com.terry.base3


/**
 *
 * Kotlin 中的also 函数
 *
 */

fun main() {


     val  str = "杜兰特"

    val newStr =  str.also {
        it.length
    }

    println(newStr) //newStr 的值与str 的值相同，也就是返回 str 本身，跟{} 内部无关  it 指的是str

}
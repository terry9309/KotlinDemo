package com.terry.base3


/**
 * Kotlin 语言中的 == 与 === 比较
 *        字符串的遍历
 */


fun main() {

    val name1  = "Terry"
    val name2 = "Terry"

    println(name1.equals(name2)) //java 中的写法
    println(name2 == name1)  //  true   内容的比较


    println(name2 === name1 ) // 引用的比较   在常量池中只有一个Terry name1与name2 都是 Terry 的引用

    val  name3 = "terry".capitalize()
    println(name3 ===  name1)  //false  因为name3 不是对Terry 的引用 会重新在常量池中开辟一个空间 存另一个Terry


    /**
     *  字符串的遍历
     */
    var  str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    str.forEach {
        println(it)
    }

}
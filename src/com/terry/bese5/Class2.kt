package com.terry.bese5


/**
 *  Kotlin 中的Any类   Any == Object(java)
 *
 *  默认继承Any类
 *
 *  Kotlin 中的Any 类只提供标准
 */

class  MyClass :Any(){}

fun main() {
    println(MyClass().toString())
}
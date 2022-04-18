package com.terry.base3



const val INFO = "James is best in NBA"

/**
 *  Kotlin 中的substring,split
 */

fun main(){

    var  indexOf = INFO.indexOf('i') //第一个字母i 的索引
    println(INFO.substring(0,indexOf)) // 范围截取，与java 相同
    println(INFO.substring(0 until indexOf)) // 范围截取同上，常用方式




    val  name = "JAMES,DURANT,KOBE"
    val  list = name.split(",")

    println(list)


    //解构
    val(v1,v2,v3) =list
    println("v1:$v1,v2:$v2,v3:$v3") //解构之后的结果



}
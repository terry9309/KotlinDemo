package com.terry.base4


/**
 *  Kotlin 中的数组
 *
 */

fun main() {

    //数组申明
    val intArray = intArrayOf(1,2,3,4,5)

    //取值
    println(intArray[0])


    //数组越界
   // println(intArray[8])//Index 8 out of bounds for length 5

    //越界处理1：
    println(intArray.elementAtOrElse(9){-1})

    //越界处理2：
    println(intArray.elementAtOrNull(10)?: -1)



    //集合转数组
    val charArray = listOf('A','B').toCharArray()

    println(charArray)
}
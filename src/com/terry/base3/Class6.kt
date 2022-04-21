package com.terry.base3

import kotlin.math.roundToInt

/**
 *  Kotlin 中的数值类型的转换
 *
 *
 */


fun main() {


    //String 转 Int
    val  num :Int  = "666".toInt()
    println(num)



    //字符串为Double 类型会崩溃
  //  val  num2:Int = "666.6".toInt()

    val num3: Int? = "666.6".toIntOrNull()
    println(num3)  // 因为不是Int 类型，所以返回null


    val num4 :Int ? = "888".toIntOrNull()  //推荐使用 toIntOrNull() 做Int 转换
    println(num4  ?: "null")



    println(3.1415926.toInt()) // 3    四舍五入

    println(3.5415926.roundToInt())  //4  四舍五入  用roundToInt() 保证 Double 转Int 四舍五入





    val  r1 = "%.2f".format(3.1465926)  // 3.15
    val  r2 = "%.2f".format(3.0)  // 3.00  注意不能用此方法 将 Int 转 double
    println(r1)
    println(r2)


}


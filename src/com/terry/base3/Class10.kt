package com.terry.base3


/**
 *  Kotlin 中的with 函数
 *
 *
 */

fun main() {

     val str = "詹姆斯"

    with(str,::println)  //::println 为具名函数


    val  len = with(str,::getStrLen)



    //具名操作
   with(with(len, ::getLenInfo),::println)//嵌套使用


  //匿名操作

   val result = with(with(str){
        length
    }){
        "你的字符串长度为$this"
    }
    println(result)
}


fun  getStrLen(str:String) = str.length


fun  getLenInfo(len:Int)= "字符串长度是$len"
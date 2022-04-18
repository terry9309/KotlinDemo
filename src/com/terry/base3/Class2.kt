package com.terry.base3

import java.lang.Exception
import java.lang.IllegalArgumentException


/**
 *
 * Kotlin 中的try catch  异常
 */



fun main() {
    try {
        var info:String? = null
        checkException(info)
        println(info!!.length)

    }catch (e:Exception){
        println("有异常：$e")
    }


    //null 检查


    var val1:String? = null

   // checkNotNull(val1) //IllegalStateException: Required value was null.

   // requireNotNull(val1) //IllegalArgumentException: Required value was null.


    var  result:Boolean =false

    // 当result = false 时会抛出异常
    require(result)  //java.lang.IllegalArgumentException: Failed requirement.




}

fun  checkException(info:String?){
    info?: throw CustomException()
}


class  CustomException : IllegalArgumentException("垃圾代码")
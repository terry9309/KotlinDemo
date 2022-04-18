package com.terry.base3

/**
 *   Kotlin 中的 replace
 */
fun main() {

    val originPsw= "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    // replace : 加密
    val newPsw = originPsw.replace(Regex("[ADH]")){
        when(it.value){
            "A"-> "1"
            "D"-> "2"
            "H"-> "3"

            else ->
                it.value

        }

    }

    println(newPsw)
    //replace : 解密
    val  originPswNew = newPsw.replace(Regex("[1,2,3]")){
        when(it.value){
            "1" -> "A"
            "2" -> "D"
            "3" -> "H"
            else -> it.value
        }
    }


    println(originPswNew)
}
package com.terry.base2



fun main() {
    /**
     *  lambda
     */

    val add = {
            num1:Int,num2:Int ->
        "结果为：${num1+num2}"
    }



    println(add(100,99))


}
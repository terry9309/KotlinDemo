package com.terry.base4


class Class8 {

    val num = 8;


    //覆盖了get()
    val  num2 :Int
        get() = (1..1000).shuffled().first() //从1到1000 取出随机值，并赋值给num2


    //防范竞态条件
    private var  info:String ?= null
    fun  getInfo():String {

        //防范竞态条件
        return  info?.also {
            "结果是：$it"
        }?: "值为null"
    }
}

/**
 *  Kotlin 语言的 计算属性 与防范竞态条件
 */


fun main() {


   // Class8().num =10  //报错： 因为num 是只读变量所以没有 set 方法


    println(Class8().num2)

    println(Class8().getInfo())
}
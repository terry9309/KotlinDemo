package com.terry.base4


/**
 *
 * Kotlin 中的mutator 函数学习
 */

fun main() {



    val list : MutableList<String> = mutableListOf("詹姆斯","威少","浓眉哥")

    //添加元素 ： 运算符重载
    list += "安东尼"
    list += "霍华德"

    //移除元素
    list -= "威少"

    println(list)


    //2.removeIf
   // list.removeIf { true }//自动遍历，移除所有元素

    /**
     * 常用
     */
    list.removeIf { it == "安东尼" } // 条件删除
    println(list)


}
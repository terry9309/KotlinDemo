package com.terry.base4


/**
 *  Kotlin 中的set 元素的创建 与 元素的获取
 *
 */

fun main() {

    val  set:Set<String> = setOf("詹姆斯","杜兰特","乔治","乔治")

    println(set)


    //取元素
    println(set.elementAt(0))

    //数组越界
   // println(set.elementAt(4))   //Collection doesn't contain element at index 4.


    /**
     *  推荐使用
     */
    //越界处理1
    println(set.elementAtOrElse(11){"越界"})
    //越界处理2
    println(set.elementAtOrNull(10) ?: "越界了")



    /**
     *  可变set
     */


    val  setS = mutableSetOf<String>("格林","哈登")

    //添加，移除元素
    setS += "恩比德"
    setS -= "格林"


    println(setS)


    /**
     *
     * list 转 set
     */

    val list = mutableListOf("库里","维金斯","汤普森","库里")

    println(list)

    //list 转 set 可去重
    val setL = list.toSet()

    println(setL)


    //快捷函数 去重
    println(list.distinct())


}
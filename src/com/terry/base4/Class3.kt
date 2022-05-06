package com.terry.base4


/**
 *
 * Kotlin 中list 集合的遍历  与  解构
 *
 */


fun main() {

    /**
     *  遍历
     *
     *
     */


    val list = listOf(2,3,3,4,5,6)
    println(list)


    //方式一
    for (i in list){
        print("元素：$i   ")
    }

    println()

    //方式二
    list.forEach{ s->

        print("元素:$s   ")
    }

    println()

    //方式三：
    list.forEachIndexed{i,it ->
        print("索引：$i,元素:$it      ")

    }


    println()
    /**
     *  解构
     *
     */
    val listS :List<String>  = listOf("詹姆斯","欧文")
    val (v1,v2) = listS
    println("$v1,$v2")


}
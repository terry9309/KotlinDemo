package com.terry.base4


/**
 *   Kotlin 中的List
 *
 */

fun main() {

    //list 定义 (不可变)
    val list = listOf("curry", "James", "Book", "Durant")

    //取值：
    println(list[0])

    // println(list[5])  //ArrayIndexOutOfBoundsException:索引溢出

    //防止崩溃
    println(list.getOrElse(4) { "越界" }) //越界

    println(list.getOrNull(4)) //null

    // getOrNull + ?:
    println(list.getOrNull(4) ?: "你越界了") //你越界了


    /**
     *  定义可变的集合
     */
    val listS = mutableListOf<String>("James", "curry", "booker")

    //添加元素
    listS.add("Kobe")

    //移除元素
    listS.remove("James")

    println(listS)


    val list2 = listOf(1, 2, 3)

    //将不可变集合转化为可变集合
    val list3 = list2.toMutableList()

    list3.add(4)

    println(list3)


    val  list4 = list3.toList() //将可变集合转换为不可变集合

    //list4.add   无法进行添加操作




}
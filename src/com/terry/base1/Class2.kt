package com.terry.base1

fun main() {


    /**
     *  1.range 表达式
     */
    val num = 148
    if (num in 10..190){        //判断在范围内
        println("在范围内")
    }


    /**
     *   2.when 表达式
     */


    val  week =8
    val info = when(week){
        1-> "今天是周一"
        2-> "今天是周二"
        3-> "今天是周三"
        4-> "今天是周四"
        5-> "今天是周五"
        6-> "今天是周六"
        7-> "今天是周七"

        else -> {
            "啥也不是"
        }
    }
    println(info)


    /**
     *  3. ${} 在String 中的使用
     *
     */
    val address = "良渚文化遗址公园"
    println("今天天气不错，我在${address}参观")

    val  goHome = false
    println("我${if (goHome)"现在回家了" else "现在还没回家"}")





}
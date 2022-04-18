package com.terry.base3

/**
 *  Kotlin 中的空安全
 *
 */


fun main() {

    var name = "Terry"

    //默认是非空类型String 值
    // name = null


    //主动声明为非空类型
    var name2: String? = "Terry"
    name2 = null
    println(name2)  //结果为null


    var name3: String? = "kobe"
    name3?.capitalize() //name3 是可空类型，想要使用必须添加？
    println(name3?.capitalize()) // capitalize()函数是首字母改为大写；


    /**
     *  let 函数的使用
     */
    var name4: String? = null
    name4 = ""
    val re = name4?.let {
        if (it.isBlank()) {    //判断是不是空字符串
            "默认值"
        } else {
            it
        }
    }
    println(re)


    /**
     *  空处理
     */

    var name5: String? = null
    // val  r = name5!!.capitalize() //程序崩溃: 空指针异常， !! 不管为不为null capitalize()都会执行
    //  println(r)
    //如果能保证name5 一定有值，才能使用!! ,否则有空指针异常的风险


    /**
     *  空合并操作符 ?:
     */
    var  name6:String?="James"
    println(name6?:"NBA")
    /**
     *  let +  空合并操作符
     */
    println(name6?.let { "【$it】"} ?:"空值")

}
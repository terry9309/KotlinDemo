package com.terry.base4


/**
 *
 * Kotlin 中的  field
 */


class Class7 {

    var  name = "Terry"
    //内部默认生成get 和 set函数


    var  value = "ABC"

        //默认存在的get() ,set()
    get() = field
    set(value) {
        field = value
    }


    var  info = "abc"
        //对get () 函数 和 set（）进行自定义
    get() = field.capitalize()
    set(value) {
        field = "b[$value]"
    }
}


fun main() {

    Class7().name = "Terry2"

    println(Class7().name)


    println(Class7().info)


    //set 和 get 的调用
    var class7 = Class7()
    class7.info = "dfg"
    println(class7.info)

}
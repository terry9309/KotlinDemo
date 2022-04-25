package com.terry.base3


/**
 *  kotlin 中的let 内置函数
 *
 */
fun main() {
    //例：int数组 第一个元素相加
    val list = listOf(1,2,3,4,5)
    val value1 = list.first()
    val  result = value1 +value1;
    println(result)


    //let 写法
    val result2 = listOf(1,2,3,4,5).let {  //it 指的是list 集合本身；
        it.first() +it.first()   //let 函数的返回值为匿名函数的最后一行，

       // true   //若 最后一行为 true  则result2 的值为true;
    }
    println(result2)


    println(setValue2(null))

}


//使用 let  做空值处理
fun  setValue(value:String?):String {
    return value?.let { "值为$value" } ?: "传的是null"
}

//简化版本
fun  setValue2(value: String?) = value?.let { "值为$value" } ?: "传的是null"
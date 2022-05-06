package com.terry.base4


/**
 *
 * Kotlin 中的map
 */
fun main() {


    /**
     * map 的声明
     */
    //声明1：
    var map1: Map<String, Double> = mapOf<String, Double>("JAMES" to 37.5, "CURRY" to 34.5)


    //声明2：
    var map2 = mapOf(Pair("paul", 36.5))


    //读取方式一；
    println(map1["JAMES"])

    println(map1["ddd"])// 返回null 不会崩溃


    //读取方式二; 推荐使用
    println(map1.getOrDefault("JAME", -1))

    //读取方式三;  推荐使用
    println(map1.getOrElse("JAME") { -1 })


    //读取方式四 等价方式一
    println(map1.get("J"))


    //读取方式五   不推荐使用，会发生崩溃
    //println(map1.getValue("J"))


    /**
     *  map 的遍历
     */

    //方式一：
    map1.forEach{
        //it  == Entry
        println("key: ${it.key},value: ${it.value}")
    }

    println()

    //方式二：
    map1.forEach{
        key,value ->
        println("key: ${key},value: ${value}")
    }

    println()

    //方式三：
    map1.forEach{
            (key,value)->
        println("key: ${key},value: $value")
    }


    //方式四
    for (item in map1){
        println("key: ${item.key},value: ${item.value}")
    }


    /**
     * 可变Map
     */
    val map3 = mutableMapOf<String, String>("JAMES" to "湖人", "CURRY"  to "勇士")

    //添加1
    map3 += "Paul" to "太阳"
    //移除
    map3 -= "CURRY"
    println(map3)

    //添加2
    map3["HADUN"] = "75人"
    println(map3)


    //添加3
    map3.put("Orving","篮网")
    println(map3)


    //如果没有这个元素，就先存进去，再取出来   //如果有key 就直接取出来
    val  s = map3.getOrPut("约老师"){"掘金"}

    println(s)



}
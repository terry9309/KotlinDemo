package com.terry.bese5


/**
 * Kotlin 中的object 单例
 */
object Class3{

    /**
     * Object 类背后生成
     *
     *  public static final Class3 INSTANCE;
     *
     *  public Class3(){} 主构造
     *
     *  public final show(){}
     */



    init {

        println("Class3 初始化")

    }

    fun  show() = println("show 函数")
}

fun main() {


    //Class3 初始化 只执行了一次  所以是单例实例  即是单例 又是类名，只有一次创建

    println(Class3) //com.terry.bese5.Class3@6bdf28bb
    println(Class3) //com.terry.bese5.Class3@6bdf28bb




}
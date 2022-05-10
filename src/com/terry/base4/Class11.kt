package com.terry.base4


/**
 *
 * kotlin
 *
 */

class Class11 {


    val  dataBase :String = getByDataSql()


    //用到的时候才会去加载
    val dataBase2 by lazy { getByDataSql() }


    private fun getByDataSql(): String {

       return "get Data Success"

    }

}


fun main() {

    val  p = Class11()
    println(p.dataBase)
    println(p.dataBase2)
}
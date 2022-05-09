package com.terry.base4


/**
 *
 * Kotlin 中的主构造
 *
 */


//主构造函数，规范是以_+变量名方式命名，变量为临时变量，不能直接使用，需要接受
class Class9 (_name:String,_age:Int){ //主构造函数

    val name = _name
    val age = _age






    fun show(){

       // print(_name)  //不能直接使用
       print(name)
    }

}


fun main() {

    Class9("James",37).show()
}
package com.terry.base4


/**
 *
 * Kotlin 中的构造 函数
 *
 */


//主构造函数，规范是以_+变量名方式命名，变量为临时变量，不能直接使用，需要接受
class Class9 (_name:String,_age:Int){ //主构造函数

    val name = _name
    val age = _age

    fun show(){
        // print(_name)  //不能直接使用
       println(name+age)
    }

    //次构造， this(name,age) 表示调用主构造， 主要是目的是由主构造统一管理。
    constructor(name:String,age:Int,dec:String):this(name,age){
        println("$name,$age,$dec")

    }


    //此构造默认参数
    constructor(name:String="JAMES",age:Int=35,dec:String="属于",team:String="湖人"):this(name,age){
        println("$name,$age,$dec,$team")

    }




}


fun main() {

    Class9("James",37).show()


    Class9("Kobe",34,"真厉害").show()


    //调用有默认值的次构造函数
    Class9()


}
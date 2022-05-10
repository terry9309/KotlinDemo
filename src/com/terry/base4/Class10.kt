package com.terry.base4


/**
 *   Kotlin 中的初始化代码块
 */



class Class10 (userName:String,userPsw:String){



    //延迟初始化
    lateinit var response :String




    //初始化块， init代码块
    init{

         println("init 被调用了 $userName,$userPsw")  //先执行，可以使用主构造中的参数
    }


    constructor(name:String,psw:String,age:Int):this(name,psw){

        println("次构造 被执行")    //后执行
    }


    fun  request(){

       // println(response)  //报错lateinit property response has not been initialized
        response = "收到回复了"

        println(response)
    }


    fun showResponse(){

        //安全方式：
        if (::response.isInitialized) { //判断response 是否被初始化过
            println(response)
        }
    }


}


fun main() {

    Class10("Terry","123456",27)


    Class10("Terry","123456",27).request()


    Class10("Terry","123456",27).showResponse()

}
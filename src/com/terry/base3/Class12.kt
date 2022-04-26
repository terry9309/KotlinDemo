package com.terry.base3


/**
 *  kotlin 中的take if 与 takeUnless内置函数
 */
fun main() {

  val result = checkPermission("Terry","123456")

    if (result != null){
        println("欢迎${result}登录")
    }else{
        println("登录失败")
    }


  val  result2 = checkPermission2("Terry","123456")
    println(result2) // result2 == null



    val  manager = Manager()



    //manager.getValue() == null     --->      it.isNullOrBlank() == true

    //    takeUnless(返回true 返回null，否则返回manager.getValue())

    // ---> manager.getValue().takeUnless { it.isNullOrBlank()} == null --->  re == "未初始化"

    val re = manager.getValue().takeUnless { it.isNullOrBlank()} ?: "未初始化"

    println(re)
}




fun  checkPermission(name:String,psw: String):String?{
    return  name.takeIf { login(name,psw) }  //若login()返回true 返回name 本身，否则返回null
    //takeIf 一般和 ?:  混合使用
}


fun checkPermission2(name:String,psw: String):String?{
    return  name.takeUnless { login(name,psw) }  //若login()返回true 返回null  本身，否则返回name

}

fun login(userName:String,psw:String):Boolean{

    return  userName == "Terry" && psw == "123456"
}



class  Manager{

    private var value:String? = null


    fun  getValue() = value

    fun  setValue(str:String){
        this.value = str
    }

}
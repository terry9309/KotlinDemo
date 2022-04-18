package com.terry.base2

fun main() {

    val method = show("This")
    //调用匿名函数
    println(method("Terry", 27))


}




/**
 *   以匿名函数作为返回值的函数
 */
fun show(info:String) :(String,Int) -> String{
     println("我是show$info")

     return  {name:String,age:Int ->
         "我的名字是¥$name,我的年龄是$age"
     }


}




inline  fun  showPeronInfo(name:String,age:Int,showResult:(String) -> Unit){
    val str = "name:$name,age:$age"
    showResult(str)
}


package com.terry.base2


/**
 *  匿名函数
 */
fun main() {

      //返回长度
      val len = "Terry".count()
      println(len)


     //匿名函数 ； 这里返回的是  Terry 中包含r  的个数
     val len2 = "Terry".count(){
         it == 'r'
     }
     println(len2)


    // lamda 函数  () 是入参  ，String 为返回类型
    val methodAction : () ->  String


       methodAction = {
          val  intput = 9999
           "$intput Terry"
           // 匿名函数没有Return ,最后一行为返回值
       }


    println(methodAction())



    // 匿名函数声明
    val  methodAction01 :(Int,Int,Int) -> String = {
        n1,n2,n3 ->
        "n1:$n1,n2:$n2,n3:$n3"
    }
    println(methodAction01(1,2,3))


    /**
     *  it 关键字
     */
    val  methodAction02 :(String) -> String = {"$it Terry"}
    println(methodAction02("this is "))


    /**
     *  匿名函数返回值类型自动推断     类型为最后一行的值的类型
     */
    val methodAction03 ={v1:Int,v2:Float,v3:Double ->
        v1+v2+v3
    }
    println(methodAction03.invoke(1,1.1f,1.20))




}


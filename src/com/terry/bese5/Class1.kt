package com.terry.bese5


/**
 *  Kotlin 中的 继承 和 重载  open 关键字
 *
 */

//Kotlin 中的类 默认是private 不能被继承 需要添加open 关键字


open  class  Person( val name:String) {

   private  fun   show() = "姓名：$name"

    //Kotlin 中的方法 默认也是private 不能直接被重写 ，需要添加open 关键字
   open fun  myPrintln() = println(show())


}



class  Student ( val  myName: String) :Person(myName){

    private  fun showMyName() = "子类的名字是:$myName"

    override fun myPrintln() = println(showMyName())
}


fun main() {

    val person:Person = Student("Terry");
    person.myPrintln()

    println(person is Person) //判断类型
    println(person is Student)

    person as Student //类型转换


}
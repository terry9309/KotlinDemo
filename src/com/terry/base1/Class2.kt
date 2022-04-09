package com.terry.base1

fun main() {


    /**
     *  1.range 表达式
     */
    val num = 148
    if (num in 10..190){        //判断在范围内
        println("在范围内")
    }


    /**
     *   2.when 表达式
     */


    val  week =8
    val info = when(week){
        1-> "今天是周一"
        2-> "今天是周二"
        3-> "今天是周三"
        4-> "今天是周四"
        5-> "今天是周五"
        6-> "今天是周六"
        7-> "今天是周七"

        else -> {
            "啥也不是"
        }
    }
    println(info)


    /**
     *  3. ${} 在String 中的使用
     *
     */
    val address = "良渚文化遗址公园"
    println("今天天气不错，我在${address}参观")

    val  goHome = false
    println("我${if (goHome)"现在回家了" else "现在还没回家"}")


    /**
     *  4. 函数的定义
     */
    method("Terry",19)


    /****
     *  5.函数的默认参数
     */
    method01()


    /**
     * 6.具名函数  传入的参数的顺序可随意调整
     */
    loginAction(tel = "16522228888",userName = "Terry",psw = "12345")


    /**
     *  7.函数返回类型 Unit 相当于Java 中的void   若不指定返回类型则默认为Unit 类型
     *
     */
    method03()


    /**
     *  8.Nothing
     */
    method04(9)


    /**
     *  9.反引号的使用
     */
       //  JavaClass.in() 这里直接调用会报错 ， 因为in 在Kotlin 是关键字 可以加反引号调用
       JavaClass.`in`()
       //  也可以用反引号  直接中文  命名函数
       登录("Terry","123456")



}


fun method(name:String,age:Int){
    println("我叫$name,我今年${age}岁")
}


//函数定义时默认给值
fun method01(name:String = "JAMES",age:Int = 37){
    println("我叫$name,我今年${age}岁")
}


fun method03():Unit{
    println()
}



fun  method04(num:Int){
    when(num){

        -1  -> TODO("分数不能为负数") //这个不是提示，会让程序崩溃，终止程序

        in 0..59 -> "不及格"

        in 60..70 -> "及格"

        in 71..100-> "优秀"
    }

}


private  fun  loginAction(userName:String,psw:String,tel:String){
    println("userName:$userName,psw:$psw,tel:$tel")
}

private fun `登录`(userName: String,psw: String){
    println("userName:$userName,psw:$psw")
}

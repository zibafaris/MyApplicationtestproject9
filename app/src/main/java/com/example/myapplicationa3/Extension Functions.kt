package com.example.myapplicationa3

// حذف کاراکتر اول و دوم رشته به کمک Extension Function
fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

fun main(args: Array<String>) {
    val myString= "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("First character is: $result")
}



// Extension Function تبدیل ثانیه به ساعت به کمک
fun Int.secoundTOHour():Int{
    if (this<36_000) return 0
    return this/36_000
}
package com.example.myapplicationa3

import android.content.Context

// حذف کاراکتر اول و دوم رشته به کمک Extension Function
fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

fun main(args: Array<String>) {
    val myString= "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("First character is: $result")
}

fun Context.showToast(message:String, duration:Int= android.widget.Toast.LENGTH_SHORT){
    android.widget.Toast.makeText(this, message , duration).show()
}



// Extension Function تبدیل ثانیه به ساعت به کمک
fun Int.secoundTOHour():Int{
    if (this<36_000) return 0
    return this/36_000
}
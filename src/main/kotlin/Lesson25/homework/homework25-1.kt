package org.splague.kotlincourse.Lesson25.homework

const val text = "Это обычный текст, не привлекающий внимания и не вызывающий подозрений"
fun funkziya() {
    println(text)
}
fun main() {
    val anonimFunkziya = fun() {
        println(text)
    }
    val lyambdasTipom: () -> Unit = {
        println(text)
    }
    val lyambdaBezTipa = {
        println(text)
    }
    funkziya()
    anonimFunkziya()
    lyambdasTipom()
    lyambdaBezTipa()
}

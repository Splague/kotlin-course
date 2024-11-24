package org.splague.kotlincourse.Lesson24.homework

class ExclusiveVipException(exception: IndexOutOfBoundsException) :
    RuntimeException("А вот и исключение!", exception)

fun main() {
    val list = listOf(1, 2, 3)
    try {
        println(list[3])
    } catch (e: IndexOutOfBoundsException) {
        throw ExclusiveVipException(e)
    }
}
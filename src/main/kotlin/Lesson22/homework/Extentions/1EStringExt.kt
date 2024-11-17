package org.splague.kotlincourse.Lesson22.homework.Extentions

fun Long?.e1Extention(): String {
    return this?.let {
        if (it % 2 == 0L) "Число $it чётное"
        else "Число $it нечётное"
    } ?: "Введено значение типа null"
}
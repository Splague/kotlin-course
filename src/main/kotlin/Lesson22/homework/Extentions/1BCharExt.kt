package org.splague.kotlincourse.Lesson22.homework.Extentions

fun Char?.b1Extention(chislo1: Int, chislo2: Double, flag: Boolean) {
    if (this == null) {
        println("Введён равный null символ")
    } else {
        println("Введён символ: $this")
        if (flag) {
            println("Мы договорились, результат союза = ${chislo1 + chislo2}")
        } else {
            println("Мы не договорились, результат войны = ${chislo1 - chislo2}")
        }
    }
}
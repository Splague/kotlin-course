package org.splague.kotlincourse.Lesson22.homework.Extentions

fun Array<Int>.a1Extention(): Pair<Int, Int> {
    val min = this.minOrNull() ?: 0
    val max = this.maxOrNull() ?: 0
    return Pair(min, max)
}
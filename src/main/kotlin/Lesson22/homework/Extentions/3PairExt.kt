package org.splague.kotlincourse.Lesson22.homework.Extentions

fun <T, R> Pair<T, R>.revert(): Pair<R, T> {
    return Pair(this.second, this.first)
}
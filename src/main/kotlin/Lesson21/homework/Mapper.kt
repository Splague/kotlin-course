package org.splague.kotlincourse.Lesson21.homework

interface Mapper<T, R> {
    fun transform(elem: T): R

    fun transformList(list: List<T>): List<R>
}
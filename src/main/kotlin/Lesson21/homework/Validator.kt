package org.splague.kotlincourse.Lesson21.homework

interface Validator<T> {
    fun check(value: T): Boolean
}
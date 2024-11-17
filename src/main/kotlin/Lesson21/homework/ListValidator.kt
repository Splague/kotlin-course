package org.splague.kotlincourse.Lesson21.homework

class ListValidator<T: Number> : Validator<List<T?>> {
    override fun check(list: List<T?>): Boolean {
        return !list.contains(null) && list.all { it?.toDouble() != 0.0 }
    }
}
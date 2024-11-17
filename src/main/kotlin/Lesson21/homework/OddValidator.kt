package org.splague.kotlincourse.Lesson21.homework

class OddValidator : Validator<Int> {
    override fun check(int: Int) = int % 2 == 0
}
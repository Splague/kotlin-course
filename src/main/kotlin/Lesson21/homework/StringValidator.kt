package org.splague.kotlincourse.Lesson21.homework

class StringValidator : Validator<String?> {
    override fun check(str: String?) = !str.isNullOrBlank()
}
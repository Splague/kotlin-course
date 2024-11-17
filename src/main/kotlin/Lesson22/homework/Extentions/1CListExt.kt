package org.splague.kotlincourse.Lesson22.homework.Extentions

fun <T> MutableList<T>.c1Extention(element: T?, index: Int): T? {
    if (index in 0..this.size) {
        if (element != null) {
            this.add(index, element)
        }
    }
    return this.lastOrNull()
}
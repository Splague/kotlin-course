package org.splague.kotlincourse.Lesson21.homework

class ListHolder<T>(private val items: MutableList<T>) {
    fun addItem(item: T) {
        items.add(item)
    }

    fun getItems() = items
}
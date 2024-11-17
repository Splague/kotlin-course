package org.splague.kotlincourse.Lesson22.homework

import org.splague.kotlincourse.Lesson22.homework.Extentions.*


fun main() {
    println("Задача 1a")
    val arrayA1 = arrayOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val minMaxPair = arrayA1.a1Extention()
    println("Min: ${minMaxPair.first}, Max: ${minMaxPair.second}")

    println("Задача 1b")
    val char: Char? = 'A'
    char.b1Extention(12, 6.5, true)

    println("Задача 1c")
    val list = mutableListOf("Kotlin", "Java", "Python")
    val result = list.c1Extention("C#", 1)
    println("Последний элемент после добавления: $result")
    val resultWithNull = list.c1Extention(null, 2)
    println("Последний элемент после попытки добавить null: $resultWithNull")

    println("Задача 1d")
    val map: Map<Int, List<String>>? = mapOf(
        1 to listOf("Котлин", "Java"),
        2 to listOf("Python", "C#")
    )
    val transformedMap = map.d1Extention(1)
    println("Преобразованный словарь: $transformedMap")
    val nullMap: Map<Int, List<String>>? = null
    val transformedNullMap = nullMap.d1Extention(0)
    println("Преобразованный словарь из null: $transformedNullMap")

    println("Задача 1e")
    val number: Long? = 42
    println(number.e1Extention())

    println("Задача 3")
    println(Pair(null, 1).revert())
    println(Pair(12, "тест").revert())
}
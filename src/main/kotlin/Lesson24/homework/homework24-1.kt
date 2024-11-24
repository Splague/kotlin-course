package org.splague.kotlincourse.Lesson24.homework

fun main() {

// NullPointerException
    val str: String? = null
    println(str!!.length)

// ArrayIndexOutOfBoundsException
    val massiv = arrayOf(1, 2, 3)
    println(massiv[3])

// ClassCastException
    val obj: Any = "Это число"
    val chislo: Int = obj as Int

// NumberFormatException
    val num = "Это точно число".toInt()

// IllegalArgumentException
    fun setZifra(zifra: Int) {
        require(zifra > 0) { "Введите цифру" }
    }
    setZifra(-11)

// IllegalStateException
    val spisok = mutableListOf<Int>()
    if (spisok.isEmpty()) {
        throw IllegalStateException("Список не должен быть пустым")
    }

// OutOfMemoryError
    val list = mutableListOf<String>()
    while (true) {
        list.add("This will definitely cause an OutOfMemoryError")
    }

//  StackOverflowError
    fun recursive() {
        recursive()
    }
    recursive()
}


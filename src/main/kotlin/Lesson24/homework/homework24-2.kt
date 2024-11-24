package org.splague.kotlincourse.Lesson24.homework

fun main() {

// NullPointerException
    try {
        val str: String? = null
        println(str!!.length)
    } catch (e: NullPointerException) {
        println("Caught NullPointerException: ${e.message}")
    }

    // ArrayIndexOutOfBoundsException
    try {
        val massiv = arrayOf(1, 2, 3)
        println(massiv[3])
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Caught ArrayIndexOutOfBoundsException: ${e.message}")
    }

    // ClassCastException
    try {
        val obj: Any = "Это число"
        val chislo: Int = obj as Int
    } catch (e: ClassCastException) {
        println("Caught ClassCastException: ${e.message}")
    }

    // NumberFormatException
    try {
        val num = "Это точно число".toInt()
    } catch (e: NumberFormatException) {
        println("Caught NumberFormatException: ${e.message}")
    }

    // IllegalArgumentException
    try {
        fun setZifra(zifra: Int) {
            require(zifra > 0) { "Введите цифру" }
        }
        setZifra(-11)
    } catch (e: IllegalArgumentException) {
        println("Caught IllegalArgumentException: ${e.message}")
    }

    // IllegalStateException
    try {
        val spisok = mutableListOf<Int>()
        if (spisok.isEmpty()) {
            throw IllegalStateException("Список не должен быть пустым")
        }
    } catch (e: IllegalStateException) {
        println("Caught IllegalStateException: ${e.message}")
    }

    // OutOfMemoryError
    try {
        val list = mutableListOf<String>()
        while (true) {
            list.add("This will definitely cause an OutOfMemoryError")
        }
    } catch (e: OutOfMemoryError) {
        println("Caught OutOfMemoryError: ${e.message}")
    }

    // StackOverflowError
    try {
        fun recursive() {
            recursive()
        }
        recursive()
    } catch (e: StackOverflowError) {
        println("Caught StackOverflowError: ${e.message}")
    }
}
fun main() {

// Задание 1: Создание Пустого Множества
// Создайте пустое неизменяемое множество целых чисел.

    val mnojestvo1 = setOf<Int>()

// Задание 2: Создание и Инициализация Множества
// Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).

    val mnojestvo2 = setOf(1, 2, 3)

// Задание 3: Создание Изменяемого Множества
// Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").

    val mnojestvo3 = mutableSetOf("Kotlin", "Java", "Scala")

// Задание 4: Добавление Элементов в Множество
// Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").

    val mnojestvo4 = mutableSetOf("Kotlin", "Java", "Scala")
    mnojestvo4.add("Swift")
    mnojestvo4.add("Go")

// Задание 5: Удаление Элементов из Множества
// Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).

    val mnojestvo5 = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    mnojestvo5.remove(2)

// Задание 6: Перебор Множества в Цикле
// Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.

    val mnojestvo6 = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in mnojestvo6){
        println(i)
    }

// Задание 7: Проверка Наличия Элемента в Множестве
// Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.

    fun poiskStrokivMnojestve(mnojestvo7: Set<String>, stroka: String): Boolean {
        for (i in mnojestvo7) {
            if (i == stroka) {
                return true
            }
        }
        return false
    }

// Задание 8: Объединение Двух Множеств
// Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.

    val mnojestvo8_1 = mutableSetOf("chai", "cofe", "potantzuem")
    val mnojestvo8_2 = mutableSetOf("pivo", "semki", "potantzuem")
    val mnojestvo8 = mutableSetOf<String>()
    for (i in mnojestvo8_1){
        mnojestvo8.add(i)
    }
    for (i in mnojestvo8_2){
        mnojestvo8.add(i)
    }

// Задание 9: Нахождение Пересечения Множеств
// Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.

    val mnojestvo9_1 = mutableSetOf(1, 2, 3, 4, 5, 6, 7)
    val mnojestvo9_2 = mutableSetOf(3, 4, 5, 6, 7, 8, 9)
    val mnojestvo9  = mutableSetOf<Int>()
    for (i in mnojestvo9_1){
        for (j in mnojestvo9_2){
            if (i == j){
                mnojestvo9.add(i)
            }
        }
    }

// Задание 10: Нахождение Разности Множеств
// Создайте два множества строк и найдите разность первого множества относительно второго (элементы, присутствующие в первом множестве, но отсутствующие во втором). Реши задачу через вложенные циклы и переменные флаги.

    val mnojestvo10_1 = mutableSetOf("chai", "cofe", "potantzuem")
    val mnojestvo10_2 = mutableSetOf("pivo", "semki", "potantzuem")
    val mnojestvo10 = mutableSetOf<String>()
    for (i1 in mnojestvo10_1) {
        var raznitzaElementov = false
        for (i2 in mnojestvo10_2) {
            if (i1 == i2) {
                raznitzaElementov = true
                break
            }
        }
        if (!raznitzaElementov) {
            mnojestvo10.add(i1)
        }
    }

// Задание 11: Конвертация Множества в Список
// Создайте множество строк и конвертируйте его в список с использованием цикла.

    val mnojestvo11 = mutableSetOf("kon`", "stul", "dvadzat` vosem`")
    val spisok11 = mutableListOf<String>()
    for (i in mnojestvo11) {
        spisok11.add(i)
    }

}
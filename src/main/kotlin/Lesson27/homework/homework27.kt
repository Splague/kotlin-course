package org.splague.kotlincourse.Lesson27.homework


// Задание 1.

fun timeTracker(funktziya1: () -> Unit): Long {
    val vremyaNachala = System.currentTimeMillis()
    funktziya1()
    return System.currentTimeMillis() - vremyaNachala
}

val myFunction = {
    val list = List(10_000_000) { (0..10_000).random() }
    list.sorted()
}

fun main() {
    val vremyaVypolneniya = timeTracker(myFunction)
    println("Время выполнения функции: $vremyaVypolneniya миллисекунд")
}

//Задание 2: Использование apply для инициализации объекта Employee
//Создайте объект Employee и используйте apply для инициализации его полей email и department.

val employee = Employee(
    name = "Иван Фёдорович Крузенштерн",
    age = 42,
    position = "человек и пароход",
).apply {
    email = "kruzenshtern@mail.ru"
    department = "человеко-пароходный"
}

// Задание 3: Использование also для логирования
// Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в красивом, отформатированном виде.
// Создайте объект Person и используйте also для печати данных в консоль с помощью метода который только что создали.

val persona = Person(
    name = "Борис Палыч",
    age = 118,
).apply {
    email = "demidovich@krut.ru"
}

fun krasivyitext(obj: Person) {
    obj.also {
        println("Наш лучший сотрудник ${it.name} на этом свете уже ${it.age} лет")
        println("Адрес его электронной почты: ${it.email}")
    }
}






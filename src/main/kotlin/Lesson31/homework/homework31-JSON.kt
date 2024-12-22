package org.splague.kotlincourse.Lesson31.homework

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

enum class CharacterTypes {
    CTO,
    UX_UI,
    TEAM_LEAD,
    BACKEND_DEV,
    QA,
    ;
}

// Создай дата класс сотрудника компании Employee, содержащий:
// - имя
// - статус трудоустройства (булево)
// - дата рождения (строка)
// - должность CharacterTypes (enum из прошлого урока)
// - список подчинённых с типом Employee

data class Employee(
    val imya: String,
    val status: Boolean,
    val dataRozhdenya: String,
    val dolzhnost: CharacterTypes,
    val minions: List<Employee>
)

// Создай небольшую иерархию из сотрудников где во главе CTO. Это значит что в объект сотрудника с должностью CTO в поле списка подчинённых должны попасть пара тим лидов, в списке подчинённых которых есть разработчики, дизайнеры и тестировщики. Чтобы было немного но и была вложенность.

fun main() {
    val back1 = Employee("Biba", true, "1989-03-19", CharacterTypes.BACKEND_DEV, emptyList())
    val back2 = Employee("Boba", true, "1995-07-01", CharacterTypes.BACKEND_DEV, emptyList())
    val designer = Employee("Geniy", true, "1996-08-10", CharacterTypes.UX_UI, emptyList())
    val tester1 = Employee("Pupa", true, "1978-11-11", CharacterTypes.QA, emptyList())
    val tester2 = Employee("Lupa", true, "2004-08-01", CharacterTypes.QA, emptyList())
    val bossofgym1 = Employee("Lelek", true, "1990-12-25", CharacterTypes.TEAM_LEAD, listOf(back1, tester1))
    val bossofgym2 = Employee("Bolek", true, "1979-02-14", CharacterTypes.TEAM_LEAD, listOf(designer, back2, tester2))
    val bigboss =
        Employee("Ivanovich", true, "1980-01-28", CharacterTypes.CTO, listOf(bossofgym1, bossofgym2))

    // Сериализуй CTO в текст с настройкой prettyPrinting и текст запиши в файл в корне проекта.
    // Прочитай текст из файла, десериализуй его в объект класса Employee и распечатай в консоль.

    saveEmployeeToFile(bigboss, "cto.json")
    val deserializedCto = readEmployeeFromFile("cto.json")
    println("Десериализованный объект:")
    println(deserializedCto)
}

fun saveEmployeeToFile(employee: Employee, fileName: String) {
    val gson: Gson = GsonBuilder().setPrettyPrinting().create()
    File(fileName).writeText(gson.toJson(employee))
    println("JSON записан в файл $fileName")
}

fun readEmployeeFromFile(fileName: String): Employee {
    val gson: Gson = GsonBuilder().setPrettyPrinting().create()
    return gson.fromJson(File(fileName).readText(), Employee::class.java)
}

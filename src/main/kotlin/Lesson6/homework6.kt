import java.time.Month
import kotlin.time.TimeMark

fun main () {
    println(sezon(mesyaz))
    println(vozrastPitomza(vozrastPsa))
    println(vidTransporta(marshrut))
    println(raschetBonusa(summaPokupki))
    println(tipFaila(razreshenieFaila))
    println(temperatura(15.0, "C"))
    println(temperatura(78.2, "F"))
    println(vyborOdezhdu(pogoda))
    println(kategoriyaFilma(vozrast))
}

// Задача 1, условие: Напишите функцию, которая на основе номера месяца возвращает сезон года.
// Решение задачи 1:
val mesyaz: Int = 9
fun sezon(mesyaz: Int): String {
    return if (mesyaz in 1..2 || mesyaz == 12) {
        "Zima"
    } else if (mesyaz in 3..5) {
        "Vesna"
    } else if (mesyaz in 6..8) {
        "Leto"
    } else if (mesyaz in 9..11) {
        "Osen"
    } else {
        "Nekorrektnui nomer"
    }
}

// Задача 2: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
// Решение задачи 2:

val vozrastPsa: Int = 3
fun vozrastPitomza(vozrastPsa: Int) : Any {
    return if (vozrastPsa <= 2) {
        vozrastPsa * 10.5
    }
    else {
        (vozrastPsa - 2) * 4 + 21
    }
}

// Задача 3: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута.
// Решение задачи 3:

val marshrut: Int = 7
fun vidTransporta(marshrut: Int) : String {
    return if (marshrut < 1)  {
        "Peshkom"
    } else if (marshrut in 1..4) {
        "Velosiped"
    } else {
        "Avto"
    }
}

// Задача 4: Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов: 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.
// Решение задачи 4:

val summaPokupki: Int = 9000
fun raschetBonusa(summaPokupki: Int) : Int {
    return when  {
        summaPokupki < 1000 -> summaPokupki / 100 * 2
        summaPokupki >= 1000 -> summaPokupki / 100 * 5
        else -> 0
    }
}

// Задача 5: Напишите функцию, которая на основе расширения файла возвращает его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".
// Решение задачи 5:

val razreshenieFaila: String = "jpg"
fun tipFaila(razreshenieFaila: String) : String {
    return if (razreshenieFaila == "txt") {
        "Текстовый документ"
    } else if (razreshenieFaila == "jpg") {
        "Изображение"
    } else if (razreshenieFaila == "xl") {
        "Таблица"
    } else {
        "Неизвестный тип"
    }
}

// Задача 6: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции. Несколько аргументов передаются через запятую. Возвращать нужно строку.
// Решение задачи 6:

fun conversion(temperatura: Double, shkala: String): String {
    return if (shkala == "C") {
        val result = temperatura * 9 / 5 + 32
        "$result F"
    } else if (shkala == "F") {
        val result = (temperatura - 32) * 5 / 9
        "$result C"
    } else {
        "Nekorrektnue dannue"
    }
}

// Задача 7: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка" при температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15. При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.
// Решение задачи 7:

val pogoda: Int = 15
fun vyborOdezhdu(pogoda: Int) : String {
    return if (pogoda in -30..-1) {
        "куртка и шапка"
    } else if (pogoda in 0..14)  {
        "ветровка"
    } else if (pogoda in 15..35)  {
        "футболка и шорты"
    } else {
        "не выходи из дома, не совершай ошибку"
    }
}

// Задача 8: Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов: "детские", "подростковые", "18+".
// Решение задачи 8:

val vozrast: Int = 25
fun kategoriyaFilma(vozrast: Int) : String {
    return when  {
        vozrast in 0..12 -> "детские"
        vozrast in 13..17 -> "подростковые"
        else -> "18+"
    }
}






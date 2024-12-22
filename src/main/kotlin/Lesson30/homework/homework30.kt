
// Задание 1.
// Создай Enum со статусами прохождения теста (pass, broken, failure).

enum class StatusTesta() {
    PASS,
    BROKEN,
    FAILURE,
    ;
}

// Создай Enum с типами жилой недвижимости для сайта аренды, включая человекопонятные названия этих типов.

enum class TipyNedvigimosti (val ateperponyatno: String) {
    OCHEN_GRUSTNO_FLAT ("студия"),
    ONE_ROOM_FLAT ("однушка"),
    TWO_ROOM_FLAT ("двушка"),
    POBOLSHE_FLAT ("квартира для семьи"),
    HOUSE ("жилой дом"),
    DEAD_HOUSE ("дача"),
    GELENDJIK_HOUSE ("очень впечатляющая дача"),
    ;
}

// Создай Enum с планетами солнечной системы, включая расстояние до солнца в астрономических единицах и вес планеты.

enum class Planety(val rasstoyanieDoSolntsa: Double, val ves: Double) {
    MERCURII (0.387, 0.330e24),
    VENERA (0.723, 4.87e24),
    ZEMLYA (1.0, 5.97e24),
    MARS (1.524, 0.642e24),
    JUPITER (5.203, 1898e24),
    SATURN (9.582, 568e24),
    URAN (19.218, 86.8e24),
    NEPTUN (30.070, 102e24),
    ;
}

//Задание 2
//Создай функцию, которая выводит на печать человекочитаемые названия типов недвижимости в порядке возрастания длины названия enum.

fun pechatNedvigimosti() {
    TipyNedvigimosti.entries
        .sortedBy { it.name.length }
        .forEach { println(it.ateperponyatno) }
}

// Задание 4
// Создай функцию, которая принимает лямбду и возвращает enum планеты. Лямбда должна принимать планету и возвращать булево значение. Лямбда здесь выступает в качестве фильтра, который должен отфильтровать список всех планет по какому-либо признаку (расстояние или вес). Вернуть нужно первый элемент из отфильтрованного списка или выкинуть исключение если список пустой.

fun filterPlanet(planeta: (Planety) -> Boolean): Planety {
    return Planety.entries.firstOrNull(planeta)
        ?: throw NoSuchElementException("Нет подходящей планеты или она была признана планетоидом")
}

fun main() {
    // Задание 2
    pechatNedvigimosti()

    // Задание 4

    val blizhekSolntsy = filterPlanet { it.rasstoyanieDoSolntsa > 15 }
    println("Первая планета на расстоянии дальше 15 а.е. от Солнца — $blizhekSolntsy")

    val vesPlanet = filterPlanet { it.ves > 2e20}
    println("Первая планета, которая весит больше 5e24: $vesPlanet")

    val hochuisklychenii = filterPlanet { it.ves < 1e20 && it.rasstoyanieDoSolntsa > 35}

}
fun main() {
    printZatukhanie(100.0, null)
    printZatukhanie(100.0, 0.4)
    PrintDostavkaZena(dostavka = null)
    PrintDostavkaZena(dostavka = 60.0)
    PrintAtmospheraDavlenie(atmospheraDavlenie = 740)
    PrintAtmospheraDavlenie(atmospheraDavlenie = null)
}

// Задача 1, условие: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.
// Решение задачи 1:

fun printZatukhanie(intensivnostZvuka: Double, koef: Double?) {
    val zatukhanie = (intensivnostZvuka * (koef ?: 0.5))
    println(zatukhanie)
}

// Задача 2, условие: Рассчитать полную стоимость доставки.
// Решение задачи 2:

fun PrintDostavkaZena(strahovka: Double = 0.5, dostavka: Double?) {
    val stoimost = (((strahovka / 100.0) * (dostavka ?: 50.0)) + (dostavka ?: 50.0))
    println(stoimost)
}

// Задача 3: Сообщить об ошибке в случае отсутствия показаний атмосферного давления.
// Решение задачи 3:

fun PrintAtmospheraDavlenie(atmospheraDavlenie: Any?) {
    val atmospheraDavlenie = (atmospheraDavlenie ?: "Error")
    println(atmospheraDavlenie)
}

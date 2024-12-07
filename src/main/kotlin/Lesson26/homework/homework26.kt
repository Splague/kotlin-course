package org.splague.kotlincourse.Lesson26.homework

fun funktziya1(funktziyapomenbshe1: () -> Unit) {
    funktziyapomenbshe1 ()
}

fun funktziya2(funktziyapomenbshe2: (Int) -> String): String {
    val number2 = 42
    return funktziyapomenbshe2(number2)
}

fun funktziya3(funktziyapomenbshe3: Int.(String) -> Boolean) {
    val number3 = 42
    println(number3.funktziyapomenbshe3("42"))
}

fun funktziya4(kakayabol: (Double, Double) -> Boolean): Boolean {
    val argentina = 5.0
    val yamaika = 0.0
    return kakayabol(argentina, yamaika)
}

fun <T> funktziya5(funktziyapomenbshe5: (T) -> List<T>){}

fun funktziya6(funktziyapomenbshe6: (String) -> Int): (Int) -> Boolean = { number6 ->
    number6 > funktziyapomenbshe6("Zagadochnaya stroka")
}

fun funktziya7(
    spisokchisel: List<Int>,
    stroki: Set<String>,
    funktziyapomenbshe7: (List<Int>, Set<String>) -> Map<String, Int>
): Map<String, Int> {
    return funktziyapomenbshe7(spisokchisel, stroki)
}

fun funktziya8(chislo8: Int, funktziyapomenbshe8: (Int) -> String): String {
    return funktziyapomenbshe8(chislo8)
}

fun funktziya9(funktziyapomenbshe9: () -> () -> Unit) {}

fun funktziya10(funktziyapomenbshe10: () -> () -> Unit) {
    val malenkayafunktziyazhest10 = funktziyapomenbshe10()
    malenkayafunktziyazhest10()
}

fun filterStrings(list: List<String>, funstion: (String) -> Boolean): List<String> {
    return list.filter { funstion(it) }
}

fun applyToNumbers(list: List<Number>, funstion: (Number) -> Number): List<Number> {
    return list.map(funstion)
}

val elementary: (Number) -> Number = {
    (it.toDouble() + 1).toInt()
}

fun sumByCondition (list: List<Int>, funstion11: (Int) -> Boolean): Int {
    return list.filter { funstion11(it) }.sum()
}

val for11: (Int) -> Boolean = {
    it > 0
}

fun combineAndTransform(array1: Array<Int>, array2: Array<Int>, funstion12: (Int) -> String): Array<String>{
    return (array1 + array2).map{funstion12(it)}.toTypedArray()
}

val for12: (Int) -> String = {
    it.toString()
}

fun main(){

    // Задание 1: Создание и Инициализация Массива
    // Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.

    val massiv1 = Array(5) { 0+1 }
    for (i in massiv1.indices) {
        massiv1[i] = i + 1
    }
    for (i in massiv1) {
        println(i)
    }

    // Задание 2: Создание Пустого Массива
    // Создайте пустой массив строк размером 10 элементов.

    val massiv2 = Array<String>(10) { "" }
    for (i in massiv2.indices){
    }

    // Задание 3: Заполнение Массива в Цикле
    // Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.

    val massiv3 = Array<Double>(5){ 0.0 }
    for (i in massiv3.indices){
        massiv3[i] = i * 2.00
    }

    // Задание 4: Изменение Элементов Массива
    // Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.

    val massiv4 = Array(5){ 0 }
    for (i in massiv4.indices){
        massiv4[i] = i * 3
    }

    // Задание 5: Работа с Nullable Элементами
    // Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.

    val massiv5 = arrayOfNulls<String>(3)
    massiv5[0] = null
    massiv5[1] = "Stroka 1"
    massiv5[2] = "Stroka 2"

    // Задание 6: Копирование Массива
    // Создайте массив целых чисел и скопируйте его в новый массив в цикле.

    val massiv6 = arrayOf(1, 2, 3)
    val massiv6double = Array(massiv6.size) { 0 }
    for (i in massiv6.indices) {
        massiv6double[i] = massiv6[i]
    }

    // Задание 7: Разница Двух Массивов
    // Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.

    val massiv7_1 = arrayOf(6, 7, 8, 9, 10)
    val massiv7_2 = arrayOf(1, 2, 3, 4, 5)
    val massiv7minus = Array(massiv7_1.size) { 0 }
    for (i in massiv7_1.indices) {
        massiv7minus[i] = massiv7_1[i] - massiv7_2[i]
    }

    // Задание 8: Поиск Индекса Элемента
    // Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.

    val massiv8 = arrayOf(1, 2, 3, 4, 5, 7, 8, 9, 10)
    var i = 0
    while (i < massiv8.size) {
        if (massiv8[i] == 5) {
            println("Индекс элемента со значением 5: $")
            break
        }
        i++
    }
    if (i == massiv8.size) {
        println("-1")
    }

    // Задание 9: Перебор Массива
    // Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.

    val massiv9 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in massiv9){
        if(i % 2 == 0){
            println("чётное $i")
        }
        else
        {
            println("нечётное $i")
        }
    }

    // Задание 10: Поиск Значения в Массиве по вхождению
    // Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.

    fun poiskStroki(massiv: Array<String>, stroka: String): String? {
        return massiv.find { it.contains(stroka) }
    }
    val massiv10 = arrayOf("kon`", "stul", "dvadzat` vosem`")
    val poisk = "stul"
    val resultat = poiskStroki(massiv10, poisk)
    if (resultat != null) {
        println("Найден элемент: $resultat")
    } else {
        println("Элемент не найден")
    }
}
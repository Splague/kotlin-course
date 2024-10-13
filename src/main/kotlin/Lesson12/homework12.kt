fun main() {

// Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.

    fun neOchenPolezno(){
    }

// Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.

    fun summaChisel(chislo1: Int, chislo2: Int): Int{
        return chislo1 + chislo2
    }

// Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.

    fun strokoed(stroka1: String){
    }

// Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.

    fun sredneeZnachenie(chisla: List<Int>): Double {
        return chisla.average()
    }

// Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.

    fun dlinaStroki(stroka2: String?): Int? {
        return stroka2?.length
    }

// Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.

    fun onlyNullable(): Double?{
        return null
    }

// Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.

    fun allOfNumbersBeMine(allOfNumbersBeMine: List<Int>?){
    }

// Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.

    fun chisloVStroku(chislo3: Int): String? {
        return chislo3.toString()
    }

// Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.

    fun votTebeStroki(): List<String>{
        return listOf()
    }

// Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.

    fun dontBullyMe(stroka3: String?, chislo4: Int?): Boolean?
    {
        return null
    }

// Задача 1:
// Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

    fun multiplyByTwo(chislo: Int): Int {
        return chislo * 2
    }

// Задача 2:
// Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.

    fun isEven(tozhechislo: Int): Boolean {
        return tozhechislo % 2 == 0
    }

// Задача 3:
// Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

    fun printNumbersUntil(n: Int) {
        if (n < 1) return
        for (i in 1..n) {
            println(i)
        }
    }

// Задача 4:
// Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(spisokChisel: List<Int>): Int? {
    for (i in spisokChisel) {
        if (i < 0) {
            return i
        }
    }
    return null
}

// Задача 5:
// Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.

    fun processList(spisokStrok: List<String?>) {
        for (i in spisokStrok) {
            if (i == null) return
            println(i)
        }
    }

// Рефакторинг:

    fun drawRectangle(width: Int, height: Int) {
        proverkaZnachenii(width, height)
        printLine(width, isBorder = true) // Верхняя граница
        printMiddleLines(width, height) // Боковые границы
        printLine(width, isBorder = true) // Нижняя граница
    }

    private fun proverkaZnachenii(width: Int, height: Int) {
        if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
        if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")
    }

    private fun printLine(width: Int, isBorder: Boolean) {
        val line = if (isBorder) {
            "+" + "-".repeat(width - 2) + "+"
        } else {
            "|" + " ".repeat(width - 2) + "|"
        }
        println(line)
    }

    private fun printMiddleLines(width: Int, height: Int) {
        for (i in 1 until height - 1) {
            printLine(width, isBorder = false)
        }
    }
}
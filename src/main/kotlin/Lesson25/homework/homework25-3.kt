package org.splague.kotlincourse.Lesson25.homework

fun strokiDlinneeChem(stroki: List<String>, chislo: Int): List<String> {
    val result = stroki.filter { it.length >= chislo }
    require(result.isNotEmpty()){"Ты выбрал или очень большое число, или очень короткие строки"}
    return result
}
fun main() {
    val strokiDlinneeChemAnon = fun(stroki: List<String>, chislo: Int): List<String> {
        val result = stroki.filter { it.length >= chislo }
        require(result.isNotEmpty()) { "Ты выбрал или очень большое число, или очень короткие строки" }
        return result
    }
    val sdcNoEtoLyambdasTipom: (stroki: List<String>, chislo: Int) -> List<String> = { stroki, chislo ->
        val result = stroki.filter { it.length >= chislo }
        require(result.isNotEmpty()) { "Ты выбрал или очень большое число, или очень короткие строки" }
        result
    }
    val sdcNoEtoLyambdaBezTipa = {stroki: List<String>, chislo: Int ->
        val result = stroki.filter { it.length >= chislo }
        require(result.isNotEmpty()){"Ты выбрал или очень большое число, или очень короткие строки"}
        result
    }
    println(strokiDlinneeChem(listOf("Я","помню","чудное","мгновенье"),7))
    println(strokiDlinneeChemAnon(listOf("Передо","мной","явилась","ты"),5))
    println(sdcNoEtoLyambdasTipom(listOf("Как","мимолётное","виденье"),8))
    println(sdcNoEtoLyambdaBezTipa(listOf("Как","гений","чистой","красоты"),42))
}

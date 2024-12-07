package org.splague.kotlincourse.Lesson25.homework

fun sredneeSpiskaChisel(list: List<Int>): Double {
    require(list.isNotEmpty()) { "Ты предлагаешь мне пустой список, придумай что-нибудь получше" }
    return list.average()
}
fun main() {
    val sredneeSpiskaChiselAnon = fun(list: List<Int>): Double {
        require(list.isNotEmpty()) { "Ты предлагаешь мне пустой список, придумай что-нибудь получше" }
        return list.average()
    }
    val sscNoEtoLyambdasTipom: (List<Int>) -> Double = {
        require(it.isNotEmpty()) { "Ты предлагаешь мне пустой список, придумай что-нибудь получше" }
        it.average()
    }
    val sscNoEtoLyambdaBezTipa = { list: List<Int> ->
        require(list.isNotEmpty()) { "Ты предлагаешь мне пустой список, придумай что-нибудь получше" }
        list.average()
    }

println(sredneeSpiskaChisel(listOf(1, 2, 3, 4, 5)))
println(sredneeSpiskaChiselAnon(listOf(10, 15, 25, 40, 55)))
println(sscNoEtoLyambdasTipom(listOf(-3, -2, -1, 0, 1, 2, 3)))
println(sscNoEtoLyambdaBezTipa(listOf()))
}
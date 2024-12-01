package org.splague.kotlincourse.Lesson25.homework

fun summaZifrChisla(chislo: Long): Int{
    val chisloCtrokoi = chislo.toString()
    return chisloCtrokoi.map { it.digitToInt()}.sum()
}
fun main() {
    val summaZifrChislaAnon = fun (chislo: Long): Int{
        val chisloCtrokoi = chislo.toString()
        return chisloCtrokoi.map { it.digitToInt()}.sum()
    }
    val szcNoEtoLyambdasTipom: (Long) -> Int = {chislo ->
        chislo.toString().map { it.digitToInt()}.sum()
    }
    val szcNoEtoLyambdaBezTipa = {chislo: Long ->
        chislo.toString().map { it.digitToInt()}.sum()
    }
    println(summaZifrChisla(123456789))
    println(summaZifrChislaAnon(987654321))
    println(szcNoEtoLyambdasTipom(13579))
    println(szcNoEtoLyambdaBezTipa(24680))
}

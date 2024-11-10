package org.splague.kotlincourse.lesson19.main
fun main() {

    val ChildrenClass = ChildrenClass(
        "privateVal_2",
        "protectedVal_2",
        "publicVal_2"
    )

    ChildrenClass.printText()

    println("----------")
    ChildrenClass.publicField = "Антонио Бандерас"

    // вопрос для урока childrenClass.protectedField = "not work"


    println(ChildrenClass.getAll())


}
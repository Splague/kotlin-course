package org.splague.kotlincourse.Lesson18.homework18.Printer

class InkjetPrinter : Printer() {
    override fun print(text: String) {
        splitText(text).forEach { word ->
            println(word)
        }
    }
}
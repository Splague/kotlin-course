package org.splague.kotlincourse.Lesson18.homework18.Printer

fun main() {
    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()

    val text = "Съешь ещё этих мягких французских булок да выпей чаю"
    laserPrinter.print(text)
    inkjetPrinter.print(text)
}
package org.splague.kotlincourse.Lesson18.homework18.GeometricShapes

fun main() {

    val shapes: List<Shape> = listOf(
        Circle(10.0),
        Square(4.0),
        Triangle(3.0, 4.0, 90.0)
    )

    // Выводим площади фигур
    for (shape in shapes) {
        println("Площадь фигуры: ${shape.area()}")
    }

}
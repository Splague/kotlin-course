package org.splague.kotlincourse.Lesson18.homework18.GeometricShapes


class Circle(private val radius: Double) : Shape() {
    private val PI: Double = 3.14159
    override fun area(): Double {
        return PI * radius * radius
    }
}
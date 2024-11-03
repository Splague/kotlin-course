package org.splague.kotlincourse.Lesson18.homework18.GeometricShapes

class Triangle(private val a: Double, private val b: Double, private val angle: Double) : Shape() {
    override fun area(): Double {
        // Площадь треугольника = (1/2) * a * b * sin(angle)
        // Угол в градусах, переводим в радианы
        val angleInRadians = Math.toRadians(angle)
        return 0.5 * a * b * kotlin.math.sin(angleInRadians)
    }
}
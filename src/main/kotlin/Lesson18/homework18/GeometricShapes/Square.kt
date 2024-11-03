package org.splague.kotlincourse.Lesson18.homework18.GeometricShapes

class Square(private val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}
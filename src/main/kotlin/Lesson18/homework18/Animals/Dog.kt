package org.splague.kotlincourse.Lesson18.homework18.Animals

class Dog : Animal() {
    override fun makeSound() {
        println("${Colors.BLACK}Bark${Colors.RESET}")
    }
}
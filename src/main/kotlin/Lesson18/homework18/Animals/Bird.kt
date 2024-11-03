package org.splague.kotlincourse.Lesson18.homework18.Animals

class Bird : Animal() {
    override fun makeSound() {
        println("${Colors.CYAN}Tweet${Colors.RESET}")
    }
}
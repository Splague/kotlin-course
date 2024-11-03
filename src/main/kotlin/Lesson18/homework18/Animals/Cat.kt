package org.splague.kotlincourse.Lesson18.homework18.Animals

class Cat : Animal() {
    override fun makeSound() {
        println("${Colors.WHITE}Meow${Colors.RESET}")
    }
}
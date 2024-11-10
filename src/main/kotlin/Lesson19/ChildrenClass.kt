package org.splague.kotlincourse.lesson19.ChildrenClass

open class ChildrenClass(
    private val privateVal: String,
    protectedVal: String,

    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // Это публичное поле родительского метода

    publicVal: String


) : BaseClass(privateVal, protectedVal, privateVal) {

    // объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // И функция, и класс публичные

    // проверь, что выводится на печать при вызове функции printText()
    // Печать из класса BaseClass

    // и объясни, почему не происходит переопределение метода privatePrint()
    // Приватный метод невозможно переопределить в подклассе


    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun verifyPublicField(value: String): Boolean {
        return value == "Антонио Бандерас"
    }

    override var protectedField
        get() = super.protectedField
        set(value) {
            super.protectedField = value
        }
}
package org.splague.kotlincourse.lesson20

abstract class AbstractClassForPowerable :
    org.splague.kotlincourse.lesson20.Powerable {

    override fun powerOn() {
        println("Устройство включено")
    }

    override fun powerOff() {
        println("Устройство выключено")
    }
}
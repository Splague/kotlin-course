package org.splague.kotlincourse.lesson20
abstract class AbstractClassForProgrammable : AbstractClassForPowerable(), Programmable {
    override fun programAction(action: String) {}
    override fun powerOn() {}
    override fun powerOff() {}
}
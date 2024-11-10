package org.splague.kotlincourse.lesson19.IgrovoyAvtomat

open class IgrovoyAvtomat(

    val zcvet: String,

    val model: String,

    private var vkluchen: Boolean,

    private var osZagrujena: Boolean,

    val spisokIgr: List<String>,

    val joystickRabotaet: Boolean,

    private var balanceVuiruchki: Float,

    private var master: String,

    private var telephonPodderjki: String

)
{


    fun vkluichit() {

        vkluchen = true
        zapustitOS()

    }

    fun vuikluichit() {

        vuikluichitOS()
        vkluchen = false

    }

    private fun zagruzitOS() {}

    private fun zavershitOS() {}

    fun pokazatIgry() {}

    fun nachatIgry() {}

    fun oplatitSeans() {}

    fun vuidatNalichku() {}

    protected fun oplatitVuigruish() {}


}
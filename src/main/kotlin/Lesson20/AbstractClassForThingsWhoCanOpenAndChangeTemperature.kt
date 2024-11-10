abstract class AbstractClassForThingsWhoCanOpenAndChangeTemperature :  org.splague.kotlincourse.lesson20.AbstractClassForProgrammable(),
    org.splague.kotlincourse.lesson20.TemperatureRegulatable,
    org.splague.kotlincourse.lesson20.Openable {
    override val maxTemperature: Int = 100
    private var currentTemperature: Int = 0
    private var isOpen: Boolean = false

    override fun setTemperature(temp: Int) {}

    override fun open() {}

    override fun close() {}
}
package org.splague.kotlincourse.lesson20
abstract class WashingMachine :
    org.splague.kotlincourse.lesson20.Powerable,
    org.splague.kotlincourse.lesson20.WaterContainer,
    org.splague.kotlincourse.lesson20.Drainable,
    org.splague.kotlincourse.lesson20.Timable,
    org.splague.kotlincourse.lesson20.TemperatureRegulatable,
    org.splague.kotlincourse.lesson20.AutomaticShutdown{}
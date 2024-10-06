import java.time.temporal.ChronoUnit
import java.time.LocalDate
fun main() {
    val tekushayaData = LocalDate.now()
    val predydushayaData = LocalDate.of(2024, 10, 2)
    val dneyProshlo = ChronoUnit.DAYS.between(predydushayaData, tekushayaData).toInt()
    pozdravlenie(dneyProshlo)
}
fun pozdravlenie(dneyProshlo: Int) {
    val pozhelaniya = arrayOf(
        "С прошедшим днём рождения, о Великий Учитель!",
        "Надеюсь, у вас была отличная вечеринка!",
        "Пусть в новом году будет масса новых приключений!"
    )
    if (dneyProshlo == 0) {
        println("С днём рождения, о Могучий Сенсей!")
    } else if (dneyProshlo in 1..364) {
        println(pozhelaniya[0])
        println("Прошло уже $dneyProshlo дней после вашего дня рождения.")
    } else {
        println(pozhelaniya[1])
        println(pozhelaniya[2])
    }
}

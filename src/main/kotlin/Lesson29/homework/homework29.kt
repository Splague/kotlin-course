import java.time.Instant
import java.time.LocalDate
import java.time.LocalTime
import java.time.Period
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun zadacha1() {
    val currentTimestamp = Instant.now()
    println("Текущая временная метка: $currentTimestamp")
}

fun zadacha2(year: Int = 1995, month: Int = 7, day: Int = 9) {
    val birthDate = LocalDate.of(year, month, day)
    println("Дата моего рождения: $birthDate")
}

fun zadacha3() {
    val birthDate = LocalDate.of(1995, 7, 9)
    val currentDate = LocalDate.now()
    val period = Period.between(birthDate, currentDate)

    println("Прошло лет с моего рождения: ${period.years}")
}

// Задача 4:

fun <LocalDateTime, ZonedDateTime, OffsetDateTime> formatAnyDate(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> println("Дата: ${temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))}")
        is LocalTime -> println("Время: ${temporal.format(DateTimeFormatter.ofPattern("HH:mm:ss"))}")
        is LocalDateTime -> println("Дата и время: ${temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))}")
        is ZonedDateTime -> println("Дата, время и часовой пояс: ${temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))}")
        is OffsetDateTime -> println("Дата, время и часовой пояс: ${temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))}")
        else -> println("Неизвестный формат: $temporal")
    }
}

fun formatAnyDateByIso(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> println("ISO LocalDate: ${temporal.format(DateTimeFormatter.ISO_LOCAL_DATE)}")
        is LocalTime -> println("ISO LocalTime: ${temporal.format(DateTimeFormatter.ISO_TIME)}")
        is LocalDateTime -> println("ISO LocalDateTime: ${temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}")
        is ZonedDateTime -> println("ISO ZonedDateTime: ${temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)}")
        is OffsetDateTime -> println("ISO OffsetDateTime: ${temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)}")
        else -> println("Неизвестный ISO формат: ${temporal::class.simpleName}")
    }
}

fun zadacha7() {
    val date1 = LocalDate.of(2023, 2, 25) // Не високосный год
    val date2 = LocalDate.of(2024, 2, 25) // Високосный год

    val formatter = DateTimeFormatter.ofPattern("dd MMMM")

    val updatedDate1 = date1.plusDays(10)
    val updatedDate2 = date2.plusDays(10)

    println("Первая дата: ${updatedDate1.format(formatter)}") // Вывод: 07 марта
    println("Вторая дата: ${updatedDate2.format(formatter)}") // Вывод: 06 марта
}
open class UchebnyeZavedeniya(
    val nazvanie: String,
    val adres: String
)

class School(
    nazvanie: String,
    adres: String,
    val chisloUchenikov: Int
) : UchebnyeZavedeniya(nazvanie, adres)
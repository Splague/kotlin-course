open class Mebel(
    val material: String,
    val razmer: Double)

class Chair(
    material: String,
    razmer: Double,
    val kolichestvoBrilliantov: Int
) : Mebel(material, razmer)

class Table(
    material: String,
    razmer: Double,
    val kolichestvoUglov: Int
) : Mebel(material, razmer)
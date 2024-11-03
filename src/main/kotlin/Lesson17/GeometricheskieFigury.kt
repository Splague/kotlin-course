open class GeometricheskieFigury(
    val name: String
)

open class Mnogougolnik(
    name: String,
    val sides: Int
) : GeometricheskieFigury(name)

class Krug(
    name: String,
    val radius: Double
) : GeometricheskieFigury(name)

class Treugolnik(
    name: String,
    sides: Int,
    val base: Double,
    val height: Double
) : Mnogougolnik(name, sides)

class Cheturehugolnik(
    name: String,
    sides: Int,
    val width: Double,
    val height: Double
) : Mnogougolnik(name, sides)
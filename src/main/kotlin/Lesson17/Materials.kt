abstract class Materials {
    protected val materials = mutableListOf<String>()
    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }
    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
    abstract fun addMaterial(material: String)
}

class BottomContainer : Materials() {
    override fun addMaterial(material: String) {
        materials.add(0, material)
    }
}

class InterleaveContainer : Materials() {
    fun addMaterials(materialsList: List<String>) {
        var index = 0
        for (material in materialsList) {
            if (index < materials.size) {
                materials.add(index, material)
            } else {
                materials.add(material)
            }
            index += 2
        }
    }
    override fun addMaterial(material: String) {
        addMaterials(listOf(material))
    }
}

class AlphabeticalContainer : Materials() {
    override fun addMaterial(material: String) {
        materials.add(material)
        materials.sort()
    }
}

class KeyValueContainer : Materials() {
    fun addKeyValuePairs(pairs: Map<String, String>) {
        for ((key, value) in pairs) {
            materials.add(0, key)
            materials.add(value)
        }
    }
    override fun addMaterial(material: String) {
        addKeyValuePairs(mapOf(material to material))
    }
}



val ordinalNumbers = listOf(
    "first", "second", "third", "fourth", "fifth",
    "sixth", "seventh", "eighth", "ninth", "tenth",
    "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
    "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
)

fun main() {
    val bottomContainer = BottomContainer()
    bottomContainer.addMaterial("base")
    bottomContainer.printContainer()

    val interleaveContainer = InterleaveContainer()
    interleaveContainer.addMaterials(ordinalNumbers)
    interleaveContainer.printContainer()

    val alphabeticalContainer = AlphabeticalContainer()
    ordinalNumbers.forEach { alphabeticalContainer.addMaterial(it) }
    alphabeticalContainer.printContainer()

    val keyValueContainer = KeyValueContainer()
    keyValueContainer.addKeyValuePairs(mapOf("one" to "1", "two" to "2", "three" to "3"))
    keyValueContainer.printContainer()
}
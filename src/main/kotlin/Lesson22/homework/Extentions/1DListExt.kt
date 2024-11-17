package org.splague.kotlincourse.Lesson22.homework.Extentions

fun <K, V> Map<K, List<V>>?.d1Extention(number: Int): Map<String, V?>? {
    if (this == null) return null

    val result = mutableMapOf<String, V?>()
    for ((key, valueList) in this) {
        val newKey = key.toString()
        val newValue = if (number in valueList.indices) valueList[number] else null
        result[newKey] = newValue
    }
    return result
}
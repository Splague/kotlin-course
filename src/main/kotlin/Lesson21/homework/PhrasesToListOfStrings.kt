package org.splague.kotlincourse.Lesson21.homework

class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun transform(str: String) = str.split(" ")

    override fun transformList(list: List<String>) = list.map { transform(it) }
}
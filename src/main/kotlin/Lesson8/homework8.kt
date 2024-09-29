fun main () {
    println(preobrazovanie1(text1))
    println(preobrazovanie2 (text2))
    println(preobrazovanie3 (text3))
    println(preobrazovanie4(text4))
    println(preobrazovanie5(text5))
    vremyaVhoda()
    maskirovka()
    preobrazovaniePochtu()
    imyaFayla ()
    sozdanieAbbreviatury()
}

// Преобразование 1: Если фраза содержит слово «невозможно», замените "невозможно" на "совершенно точно возможно, просто требует времени".
var text1 = "Это невозможно выполнить за один день"
fun preobrazovanie1 (inputText1: String): String {
    return when {
        inputText1.contains("невозможно") ->
            inputText1.replace("невозможно","совершенно точно возможно, просто требует времени")
        else -> ""
    }
}

// Преобразование 2: Если фраза начинается с "Я не уверен", добавьте в конец фразы ", но моя интуиция говорит об обратном".
var text2 = "Я не уверен в успехе этого проекта"
fun preobrazovanie2 (inputText2: String): String {
    return when {
        inputText2.startsWith("Я не уверен") ->
        { "$text2 ... ,но моя интуиция говорит об обратном"}
        else -> ""
    }
}

// Преобразование 3: Если фраза содержит слово "катастрофа", замените "катастрофа" на "интересное событие".
var text3 = "Произошла катастрофа на сервере"
fun preobrazovanie3 (inputText3: String): String {
    return inputText3.replace("катастрофа", "интересное событие")
}

// Преобразование 4: Если фраза заканчивается на "без проблем", замените "без проблем" на "с парой интересных вызовов на пути".
var text4 = "Этот код работает без проблем"
fun preobrazovanie4 (inputText4: String): String {
    return when {
        inputText4.endsWith("без проблем") ->
            inputText4.replace("без проблем", "с парой интересных вызовов на пути")
        else -> ""
    }
}

//Преобразование 5: Если фраза содержит только одно слово, добавьте перед словом "Иногда," и после слова ", но не всегда".
var text5 = "Удача"
fun preobrazovanie5 (inputText5: String): String {
    return when {
        inputText5.endsWith(" ") -> ""
        else -> "Иногда $inputText5, но не всегда"
    }
}

// Задание 1: Извлечение даты из строки лога. У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23". Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.
fun vremyaVhoda () {
    val strokaloga = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val dannieloga = strokaloga.split(" ")
    val data = dannieloga[5]
    val vremya = dannieloga[6]
    println(data)
    println(vremya)
}

// Задание 2: Маскирование личных данных. Дана строка с номером кредитной карты "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".
fun maskirovka () {
    val nomercartu = "4539 1488 0343 6467"
    val changenomer = nomercartu.split(" ")
    val zvezdochki = changenomer[3]
    println("****-****-****-${zvezdochki}")
}

// Задание 3: Форматирование адреса электронной почты. У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".
fun preobrazovaniePochtu () {
    val pochta = "username@example.com"
    val changepochta1 = pochta.replace("@", " [at] ")
    val changepochta2 = changepochta1.replace(".", " [dot] ")
    println(changepochta1)
}

// Задание 4: Извлечение имени файла из пути. Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.
fun imyaFayla () {
    val textputi = "C:/Пользователи/Документы/report.txt"
    val nachaloimeni = textputi.split("/")
    val konetzimeni = nachaloimeni[3].split(".")
    println(konetzimeni[0])
}

// Задание 5: У вас есть фраза, например "Объектно-ориентированное программирование". Создайте аббревиатуру из начальных букв слов (например, "ООП").
fun sozdanieAbbreviatury(fraza: String): String {
    var abbreviatura = ""
    for (slovo in fraza.split(' ', '-', '_')) {
        if (slovo.isNotEmpty()) {
            abbreviatura += slovo[0].uppercaseChar()
        }
    }
    return abbreviatura
}
    val abbreviatura = sozdanieAbbreviatury("Объектно-ориентированное программирование")
    println("Аббревиатура: $abbreviatura")
}
}
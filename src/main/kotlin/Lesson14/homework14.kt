fun main() {

// Задача 1.
// Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.

    val map1 = mapOf<String, Int>("Test 1" to 1, "Test 2" to 2, "Test 3" to 3)
    println(map1.values.average())

// Задача 2.
// Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов, а значения - строка с метаданными. Выведите список всех тестовых методов.

    val map2 = mutableMapOf<String, String>("Stroka 1" to "Name 1", "Stroka 2" to "Name 2", "Stroka 3" to "Name 3")
    val testMethods = map2.keys.toList()
    println(testMethods)

// Задача 3.
// В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.

    val map3 = mutableMapOf("Test 1" to "Passed", "Test 2" to "Failed")
    map3["Test 3"] = "Passed"
    println(map3)

// Задача 4.
// Посчитайте количество успешных тестов в словаре с результатами.

    val map4 = mutableMapOf("Test 1" to "Passed", "Test 2" to "Failed", "Test 3" to "Passed")
    val testZaschitan = map4.values.count { it == "passed" }
    println(testZaschitan)

// Задача 5.
// Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.

    val map5 = mutableMapOf("Bug 1" to "Done", " Bug 2" to "Open", "Bug 3" to "Hold")
    map5.remove("Bug 1")
    println(map5)

// Задача 6.
// Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.

    val map6 = mapOf("demoqa.com" to "1", "uitestingplayground.com" to "0", "saucedemo.com" to "1")
    map6.forEach { println("${it.key} is ${it.value}") }

// Задача 7.
// Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.

    val map7 = mapOf("playground.epizy.com/" to 100, "practice-automation.com/" to 200, "uitestingplayground.com/" to 300)
    println(map7.filterValues { it > 150 })

// Задача 8.
// В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.

    val map8 = mapOf("Api test 1" to "Hehe", "Api test 2" to "Not hehe")
    val endpoint = "Api test 1"
    val status = map8[endpoint] ?: "Не был протестирован"
    println(status)

// Задача 9.
// Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации), получите значение для "browserType". Ответ не может быть null.

    val map9 = mapOf("browserType" to "Chrome", "versionOS" to "Windows")
    val browserType = map9.getValue("browserType")
    println(browserType)

// Задача 10.
// Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.

    val map10 = mapOf("Test.exe" to "1.1.1", "TozheTest.exe" to "2.1.1")
    val poVersions = map10 + ("Esche odin test" to "2.2.1")
    println(poVersions)

// Задача 11.
// Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства), получите настройки для конкретной модели или верните настройки по умолчанию.

    val map11 = mapOf(
        "iPhone 15" to "iOS 15",
        "Xiaomi Redmi  7" to "Android 11"
    )
    val model = "Nokia 3310"
    val defaultSettings = "Android 2000"
    val settings = map11[model] ?: defaultSettings
    println(settings)

// Задача 12.
// Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.

    val map12 = mapOf(
        "404" to "Not Found",
        "500" to "Internal Server Error"
    )

    val codOshibki = "404"
    val oshibkaVSlovare = codOshibki in map12
    println(oshibkaVSlovare)

// Задача 13.
// Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.

    val map13 = mapOf("Test1_1.1" to "Passed", "Test2_1.2" to "Failed", "Test3_1.1" to "Skipped")
    println(map13.filterKeys { it.endsWith("1.1") })

// Задача 14.
// У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.

    val map14 = mapOf(
        "Test 1" to "success",
        "Test 2" to "failure",
        "Test 3" to "success"
    )
    val estKosyak = "failure" in map4.values
    println(estKosyak)

// Задача 15.
// Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.

    val map15_1 = mutableMapOf(
        "Nastroika 1" to "1",
        "Nastroika 2" to "2"
    )
    val map15_2 = mutableMapOf(
        "Nastroika 3" to "3",
        "Nastroika 4" to "4"
    )
    val map15 = map15_1 + map15_2
    println(map15)

// Задача 16.
// Объедините два неизменяемых словаря с данными о багах.

    val map16_1 = mapOf(
        "Bug 1" to "AAA",
        "Bug 2" to "BBB"
    )
    val map16_2 = mapOf(
        "Bug 3" to "CCC",
        "Bug 4" to "DDD"
    )
    val map16 = map16_1.toMutableMap().apply {
        putAll(map16_2)
    }.toMap()
    println(map16)

// Задача 17.
// Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.

    val map17 = mutableMapOf(
        "Test 1" to "1",
        "Test 2" to 2,
        "Test 2" to 3
    )
    map17.clear()

// Задача 18.
// Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)

    val map18 = mutableMapOf(
        "Test 1" to "passed",
        "Test 2" to "skipped",
        "Test 3" to "failed"
    )
    val bezPropuschennuh = map18.filterValues { it != "skipped" }
    println(bezPropuschennuh)

// Задача 19.
// Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.

    val map19 = mutableMapOf(
        "Test 1" to "Configuration 1",
        "Test 2" to "Configuration 2",
        "Test 3" to "Configuration 3"
    )
    val ustareliConfigi = listOf("Test 2", "Test 3")
    ustareliConfigi.forEach { map19.remove(it) }
    println(map19)

// Задача 20.
// Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".

    val map20 = mapOf(
        "Test 1" to "passed",
        "Test 2" to "failed",
        "Test 3" to "skipped"
    )
    val otchet = map20.map { (id, result) -> "$id: $result" }
    println(otchet)
}
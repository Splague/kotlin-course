fun main() {

// Задание 1: Создание Пустого Словаря
// Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.

    val map1: Map<Int, Int> = mapOf()

// Задание 2: Создание и Инициализация Словаря
// Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double

    val map2: Map<Float, Double> = mapOf(1.1f to 1.0, 2.2f to 2.0)

// Задание 3: Создание Изменяемого Словаря
// Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.

    val map3: Map<Int, String> = mutableMapOf(1 to "etostroka", 2 to "ietostroka")

// Задание 4: Добавление Элементов в Словарь
// Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".

    val map4: MutableMap<Int, String> = mutableMapOf(1 to "element1", 2 to "element2")
    map4[3] = "element3"
    map4[4] = "element4"
    map4[5] = "element5"

// Задание 5: Получение Значений из Словаря
// Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.

    println(map4[1])
    println(map4[42])

// Задание 6: Удаление Элементов из Словаря
// Удалите определенный элемент из изменяемого словаря по его ключу.

    val map6: MutableMap<Int, String> = mutableMapOf(1 to "a", 2 to "i", 3 to "b")
    map6.remove(2)

// Задание 7: Перебор Словаря в Цикле
// Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)

    val map7: MutableMap<Double, Int> = mutableMapOf(1.1 to 1, 2.2 to 2, 3.3 to 3, 4.4 to 4, 66.6 to 0)
    for ((key, value) in map7) {
        if (value != 0) {
            println("частное от деления ключа на значение: ${key / value}")
        } else {
            println("бесконечность")
        }
    }

// Задание 8: Перезапись Элементов Словаря
// Измените значение для существующего ключа в изменяемом словаре.

    val map8: MutableMap<Int, String> = mutableMapOf(1 to "a", 2 to "i", 3 to "b")
    map8[2] = "nikakogo i zdes net"

// Задание 9: Сложение Двух Словарей
// Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.

    val map9_1: Map<Int, String> = mutableMapOf(1 to "etostroka", 2 to "ietostroka")
    val map9_2: Map<Int, String> = mutableMapOf(3 to "etotozhestroka", 4 to "o, i tut stroka")
    val map9: MutableMap<Int,String> = mutableMapOf()
    for ((key,value) in map9_1){
        map9[key] = value
    }
    for ((key, value) in map9_2){
        map9[key] = value
    }

// Задание 10: Словарь с Сложными Типами
// Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.

    val map10: MutableMap<String, List<Int>> = mutableMapOf(
        "stroka raz" to listOf(1, 2, 3),
        "stroka dva" to listOf(4, 5, 6),
    )
    map10["stroka tri"] = listOf(7, 8, 9)

// Задание 11: Использование Множества в Качестве Значения
// Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.

    val map11: MutableMap<Int, MutableSet<String>> = mutableMapOf(
        1 to mutableSetOf("slovo1", "slovo2", "slovo3"),
        2 to mutableSetOf("slovo4", "slovo5", "slovo6")
    )
    map11[2]?.add("slovo7")

// Задание 12: Поиск Элемента по Значению
// Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.

    val map12: MutableMap<Int, Int> = mutableMapOf(1 to 2, 3 to 4, 5 to 6)
    for ((key, value) in map12) {
        if (key == 5 || value == 5) {
            println("Ключ пары, содержащей 5: $key, Значение: $value")
        }
    }

// Задание 6: Словарь Библиотека
// Ключи - автор книги, значения - список книг

    val mapBiblioteka: MutableMap<String, MutableList<String>> = mutableMapOf(
        "Хаксли" to mutableListOf("Остров", "О дивный новый мир", "Слепец в Газе"),
        "Оруэлл" to mutableListOf("1984", "Скотный двор", "Дни в Бирме"),
        "Замятин" to mutableListOf("Мы", "Пещера", "Бич божий")
    )

// Задание 12: Справочник Растений
// Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений

    val mapBotanika: MutableMap<String, MutableList<String>> = mutableMapOf(
        "Цветы" to mutableListOf("Ромашка", "Лютик", "Незабудка"),
        "Деревья" to mutableListOf("Дуб", "Ясень", "Остролист"),
        "А вот это я б не ел" to mutableListOf("Аконит", "Белладонна", "Бледная поганка")
    )

// Задание 8: Четвертьфинала
// Ключи - названия спортивных команд, значения - списки игроков каждой команды

    val oleOleOle : MutableMap<String, MutableList<String>> = mutableMapOf(
    "ЦСКА" to mutableListOf("Игорь Акинфеев", "Георгий Ярцев", "Александр Бубнов"),
    "Зенит" to mutableListOf("Вячеслав Малафеев", "Александр Анюков", "Николас Ломбертс")
    )

// Задание 9: Курс лечения
// Ключи - даты, значения - список препаратов принимаемых в дату

    val Tabletnitza: MutableMap<String, MutableList<String>> = mutableMapOf(
        "2024-10-11" to mutableListOf("Лоперамид", "Эспумизан"),
        "2024-10-12" to mutableListOf("Но-шпа", "Найз"),
        "2024-10-13" to mutableListOf("Активированный уголь")
    )

// Задание 10: Словарь Путешественника
// Ключи - страны, значения - словари из городов со списком интересных мест.

    val Dostoprimechatelnosti: MutableMap<String, MutableMap<String, MutableList<String>>> = mutableMapOf(
        "Россия" to mutableMapOf(
            "Москва" to mutableListOf("Красная площадь", "Собор Василия Блаженного", "ВДНХ", "Московский Кремль", "Большой Театр"),
            "Санкт-Петербург" to mutableListOf("Спас-на-Крови", "Исаакиевский собор", "Мариинский Театр", "Эрмитаж")
        ),
        "Грузия" to mutableMapOf(
            "Тбилиси" to mutableListOf("Мост Мира", "Крепость Нарикала", "Площадь Свободы", "Сионский собор"),
            "Батуми" to mutableListOf("Башня Азбуки", "Площадь Пьяцца", "Ботанический сад")
        )
    )
}
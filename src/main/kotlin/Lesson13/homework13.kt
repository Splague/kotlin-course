fun main() {
    val collection = listOf(22, 23, 24, 17)
    val strings = listOf("de", "bc", "cd", "cd")
    printAll(
        collection.size > 5, // Проверить, что размер коллекции больше 5 элементов.
        collection.isEmpty(), //Проверить, что коллекция пустая
        collection.isNotEmpty(), //Проверить, что коллекция не пустая
        collection.getOrElse(2) { 5 }, //Взять элемент по индексу или создать значение если индекса не существует
        collection.joinToString(" "), //Собрать коллекцию в строку
        collection.sum(), //Посчитать сумму всех значений
        collection.average(), //Посчитать среднее
        collection.max(), //Взять максимальное число
        collection.min(), //Взять минимальное число
        collection.firstOrNull(), //Взять первое число или null
        collection.contains(3), //Проверить что коллекция содержит элемент
        collection.filter { it in 18..30 }, // Отфильтровать коллекцию по диапазону 18-30
        collection.filterNot { it % 2 == 0 && it % 3 == 0 }, //Выбрать числа, не делящиеся на 2 и 3 одновременно
        collection.filterNotNull(), //Очистить текстовую коллекцию от null элементов
        collection.map { "$it".length }, //Преобразовать текстовую коллекцию в коллекцию длин слов
        strings.associate { it to it.reversed() }, //текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
        strings.sorted(), //Отсортировать список в алфавитном порядке
        strings.sortedDescending(), //Отсортировать список по убыванию
        collection.forEach { println(it * it) }, //Распечатать квадраты элементов списка
        strings.groupBy { it.firstOrNull() }, //Группировать список по первой букве слов
        strings.distinct(), //Очистить список от дублей
        collection.take(3), //Взять первые 3 элемента списка
        collection.takeLast(3) //Взять последние 3 элемента списка
    )

    /*
    Задание 2: Характеристика числовой коллекции
    Написать метод, который принимает коллекцию чисел и возвращает строку с текущим состоянием коллекции
    используя конструкцию when
    Если коллекция пустая - “Пусто”
    Если количество элементов меньше пяти - “Короткая”
    Если коллекция начинается с 0 - “Стартовая”
    Если сумма всех чисел больше 10000 - “Массивная”
    Если среднее значение равно 10 - “Сбалансированная”
    Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
    Если максимальное число меньше -10 - “Отрицательная”
    Если минимальное число больше 1000 - “Положительная”
    Если содержит одновременно числа 3 и 14 - “Пи***тая”
    Иначе - “Уникальная”

    Вызвать метод с данными, подходящими под каждую из веток
     */
    printAll(
        condition(listOf()),
        condition(listOf(1, 2)),
        condition(listOf(0, 1, 1, 1, 1)),
        condition(listOf(10000, 1, 1, 1, 1)),
        condition(listOf(10, 10, 10, 10, 10)),
        condition(listOf(1111, 11, 11, 11, 11, 11, 1111, 11)),
        condition(listOf(-11, -12, -11, -11, -11)),
        condition(listOf(1001, 1001, 1001, 1001, 1001, 1001)),
        condition(listOf(3, 14, 159, 265, 35)),
        condition(listOf(1, 1, 2, 3, 5, 8)),
    )

    /*
    Задание 3: Анализ Учебных Оценок
Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию и взять первые 3.
     */
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(
        grades.filter { it >= 60 }
            .sorted()
            .take(3)
    )

    /*
    Задание 4: Создание каталога по первой букве.
Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве.
     */
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра",
        "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка",
        "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка",
        "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка",
        "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник",
        "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер",
        "Этажерка"
    )
    for (i in list.map { it.lowercase() }.groupBy { it.first() }) {
        println(i)
    }

    /*
    Задание 5: Подсчёт средней длины слов в списке.
Начальные значения из задачи 3???
Цель: Перевести все слова в количество букв, подсчитать среднее значение.
Вывести форматированный текст с двумя знаками после запятой.
     */
    println("%.2f".format(list.map { it.length }.average()))

    /*
    Задание 6: Категоризация чисел.
Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности
(“четные” и “нечетные”).
     */
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(numbers.distinct()
        .sortedDescending()
        .groupBy { if (it % 2 == 0) "even" else "odd"})

    /*
    Задание 7: Поиск первого подходящего элемента
Цель: Найти первый возраст в списке, который соответствует условию (больше 18),
преобразовать его к строке, или вернуть сообщение "Подходящий возраст не найден".
     */
    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    println(ages.firstOrNull { it != null && it > 18 }?.toString() ?: "Подходящий возраст не найден")
}

fun condition(numbers: List<Int>): String {
    return when {
        numbers.isEmpty() -> "empty"
        numbers.size < 5 -> "short"
        numbers.first() == 0 -> "standard"
        numbers.sum() > 10000 -> "massive"
        numbers.average() == 10.0 -> "balanced"
        numbers.joinToString("").length == 20 -> "sticky"
        numbers.max() < -10 -> "negative"
        numbers.min() > 1000 -> "positive"
        numbers.contains(3) && numbers.contains(14) -> "cool"
        else -> "unique"
    }
}

fun printAll(vararg args: Any?) {
    for (i in args) {
        println(i)
    }
}
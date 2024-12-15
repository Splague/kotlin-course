import java.io.File

fun zadacha1() {
    val filePath = "workspace/task1/example.txt"
    val file = File(filePath)

    file.parentFile.mkdirs()
    file.writeText("Hello, Kotlin!")

    if (file.exists()) {
        println("Файл $filePath существует.")
    } else {
        println("Файл $filePath не существует.")
    }
}

fun zadacha2() {
    val dirPath = "workspace/task2/testDir"
    val dir = File(dirPath)

    if (dir.mkdirs() || dir.exists()) {
        if (dir.isDirectory) {
            println("Директория $dirPath существует.")
            println("Абсолютный путь: ${dir.absolutePath}")
        }
    } else {
        println("$dirPath не удалось создать.")
    }
}

fun zadacha3() {
    val baseDir = File("workspace/task3/structure/myDir")
    val subDir1 = File(baseDir, "subDir1")
    val subDir2 = File(baseDir, "subDir2")

    subDir1.mkdirs()
    subDir2.mkdirs()

    val contents = baseDir.listFiles()?.filter { it.isDirectory }?.map { it.name } ?: emptyList()
    println("Директория myDir содержит: $contents")
}

fun zadacha4() {
    val tempDir = File("workspace/task4/temp")
    if (tempDir.mkdirs()) {
        println("Директория temp создана.")
    }

    File(tempDir, "file1.txt").createNewFile()
    File(tempDir, "subDir/file2.txt").apply {
        parentFile.mkdirs()
        createNewFile()
    }

    val rootDir = File("workspace/task4")
    if (rootDir.deleteRecursively()) {
        println("Директория $rootDir успешно удалена.")
    } else {
        println("Ошибка при удалении директории $rootDir.")
    }
}

fun zadacha5() {
    val configFile = File("workspace/task5/config/config.txt")
    configFile.parentFile.mkdirs()
    configFile.writeText("key1=value1\nkey2=value2\nkey3=value3")

    configFile.readLines().forEach { line ->
        val value = line.substringAfter("=")
        println(value)
    }
}

fun zadacha6() {
    val rootDir = File("workspace")
    if (rootDir.exists()) {
        val (dirs, files) = rootDir.walkTopDown().partition { it.isDirectory }

        println("Директории:")
        dirs.forEach { println(it.absolutePath) }

        println("Файлы:")
        files.forEach { println(it.absolutePath) }
    } else {
        println("Директория workspace не существует.")
    }
}
fun zadacha7() {
    val readmeFile = File("workspace/task9/docs/readme.md")
    if (!readmeFile.exists()) {
        readmeFile.parentFile.mkdirs()
        readmeFile.writeText("This is a README file.")
        println("Файл ${readmeFile.name} создан с содержимым.")
    } else {
        println("Файл ${readmeFile.name} уже существует.")
    }
}

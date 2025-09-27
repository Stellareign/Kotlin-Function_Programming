package org.example.lessons.less_5_12_dictionary

import kotlinx.serialization.json.Json
import java.io.File
import java.util.Dictionary

fun main() {
    val file = File("dictionary.json")
    val content = file.readText().trim()
    val dictionary = Json.decodeFromString<List<Entry>>(content)
//    dictionary.forEach { entry -> println(entry.value + " - " + entry.description) }
    showDescription(dictionary)
}

fun showDescription(dictionary: List<Entry>) {
    while (true) {
        print("Введите слово или 0 для выхода: ")
        val result = readln().lowercase()
        dictionary.find { it.value == result }?.let {println(it.description)} ?: println("Слово не найдено")
        if (result == "0") {
            break
        }
    }

}
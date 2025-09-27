package org.example.lessons.less_5_12_dictionary

import kotlinx.serialization.json.Json
import java.io.File
import java.util.Dictionary

fun main() {
    val file = File("dictionary.json")
    val content = file.readText().trim()
    val dictionary = Json.decodeFromString<Map<String, String>>(content)
//    val dictionaryMap  = dictionary.associate { it.value to it.description }
//    val mapAsString = Json.encodeToString(dictionaryMap)
//    file.writeText(mapAsString)
//    dictionary.forEach { entry -> println(entry.value + " - " + entry.description) }
//    println(mapAsString)
    showDescription(dictionary)
}

fun showDescription(dictionary: Map<String, String>) {
    while (true) {
        print("Введите слово или 0 для выхода: ")
        val result = readln().lowercase()
        dictionary[result]?.let {println(it)} ?: println("Слово не найдено")
        if (result == "0") {
            break
        }
    }

}
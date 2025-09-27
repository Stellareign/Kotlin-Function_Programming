package org.example.lessons.less_5_12_dictionary

fun main() {
    val dictionary1: Map<String, String> = mapOf<String, String>( // далее примеры добавления в коллекцию
        Pair ("hello", "привет"), // запись в мап через объект Pair
        "thank you" to "спасибо") // добавление в мап Pair через инфиксную функцию

    val dictionary = mutableMapOf<String, String>()
    dictionary["hello"] = "привет" // добавление по индексу
    dictionary.put("thank you", "спасибо") // добавление через метод put()
    println(dictionary["hello"])
    println(dictionary["thank you"])
    dictionary.keys.forEach {println(it)}
    dictionary.values.forEach {println(it)}
}
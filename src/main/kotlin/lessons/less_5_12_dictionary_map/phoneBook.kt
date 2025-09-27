package org.example.lessons.less_5_12_dictionary_map

fun main() {
    val phoneBook = mutableMapOf<String, Long>()
    phoneBook["Ann Can"] = 89126394515
    phoneBook["Mann Low "] = 89126394578
    putToPhoneBook(phoneBook)
    getFromPhoneBook(phoneBook)
}

fun putToPhoneBook(phoneBook: MutableMap<String, Long>) {
    while (true) {
        print("Введите имя или 0 для выхода: ")
        val name = readln()
        if (name == "0") {
            break
        }
        print("Введите номер или 0 для выхода: ")
        val number = readln().toLong()
        if (number.toInt() == 0) {
            break
        }
        phoneBook[name] = number
    }
}

fun getFromPhoneBook(phoneBook: MutableMap<String, Long>) {
    while (true) {
        println("Поиск в телефонной книге")
        print("Введите имя или 0 для выхода: ")
        val name = readln()
        if (name == "0") break

        if (phoneBook.containsKey(name)) {
            println(phoneBook[name])
        } else {
            println("Номер не найден")
        }
    }
}
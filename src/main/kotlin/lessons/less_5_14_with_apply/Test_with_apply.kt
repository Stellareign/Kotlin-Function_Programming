package org.example.lessons.less_5_14_with_apply

import org.example.lessons.extensionFunctions.myApply
import org.example.lessons.extensionFunctions.myWith

fun main() {
    /**
     * запись в обычном стиле:
     */
//    val numbers  = mutableListOf<Int>()
//    while (true) {
//        print("Enter your number or 0 for exit: ")
//        val number = readln().toInt()
//        if (number == 0) break
//        numbers.add(number)
//    }
//    println(numbers)
    exampleWith()
}
    /**
     * функция with()
     */
    fun exampleWith() {
        with(mutableListOf<Int>()) { // или apply()
            while (true) {
                print("Enter your number or 0 for exit: ")
                val number = readln().toInt().takeIf { it != 0 }
                    ?: break //takeIf() возвращает null, если условие не выполнено, и мы его обрабатывает элвисом
                add(number) // здесь обращение через this, п.э. не нужно указывать явно аргумент
            }
            println("Max: ${max()}") // выполняем действия с коллекцией, возвращается макс.зн
            println("Min: ${min()}")// выполняем действия с коллекцией, возвращается мин.зн
            this // возвращаем коллекцию для дальнейшей работы с ней
        }.forEach { print("$it ") }
    }


/**
 * запись через apply() в более функциональном стиле
 */
fun exampleApply() {
    mutableListOf<Int>().myApply { // или apply()
        while (true) {
            print("Enter your number or 0 for exit: ")
            val number = readln().toInt().takeIf { it != 0 }
                ?: break //takeIf() возвращает null, если условие не выполнено, и мы его обрабатывает элвисом
            add(number) // здесь обращение через this, п.э. не нужно указывать явно аргумент
        }
    }.forEach { print("$it ") }
    }


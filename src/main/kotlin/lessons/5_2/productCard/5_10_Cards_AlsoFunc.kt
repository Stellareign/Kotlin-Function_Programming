package org.example.lessons.`5_2`.productCard

import org.example.lessons.`5_2`.productCard.enums.ClothingSize
import org.example.lessons.`5_2`.productCard.enums.Color
import org.example.lessons.extensionFunctions.filterList
import org.example.lessons.extensionFunctions.myAlso
import org.example.lessons.extensionFunctions.transformElement

fun main() {

    ProductRepository.clothingCards
        .also { println("Фильтруем коллекцию")}
        .filterList { it.size == ClothingSize.SMALL && it.color == Color.BLUE } // запись в одном блоке позволяет отфильтровать коллекцию за один "проход"
        .also { println("Трансформируем в строку") }
        .transformElement { "${it.id} - ${it.category} - ${it.size} - ${it.color}\n" }
        .myAlso { println("Выводим на печать") }
        .forEach(::println ) // ссылка на метод
}


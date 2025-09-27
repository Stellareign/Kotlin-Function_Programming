package org.example.tasks.task_5_12_map

fun main() {
    val scores = mapOf(
        "Alice" to 95,
        "Bob" to 87,
        "Charlie" to 78
    )

    // Преобразуем оценки в текстовые категории
    val categorizedScores = scores.transformValues { score ->
        when {
            score >= 90 -> "Отлично"
            score >= 80 -> "Хорошо"
            score >= 70 -> "Удовлетворительно"
            else -> "Неудовлетворительно"
        }
    }
    // Ожидаемый результат: {Alice=Отлично, Bob=Хорошо, Charlie=Удовлетворительно}
    println(categorizedScores)
}

/**
 * Расширение для преобразования значений в `Map`.
 * @param transform Функция для преобразования значений.
 * @return Новый `Map` с теми же ключами, но преобразованными значениями.
 */
fun <K, V, R> Map<K, V>.transformValues(transform: (V) -> R): Map<K, R> {
    // Реализуйте функцию здесь
    val result = mutableMapOf<K, R>()
    for ((k, v) in this) {
        result[k] = transform(v)
    }
    return result
}
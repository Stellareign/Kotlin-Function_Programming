package org.example.lessons.extensionFunctions

/**
 * Функции вынесены в отдельный файл; добавлено ключевое слово inline (для опыта)
 */
inline fun <T, R> Iterable<T>.transformElement(operation: (T) -> R): List<R> { // более универсальный метод, принимающий на вход любые коллекции
    val result = mutableListOf<R>()
    for (element in this) {
        result.add(operation(element))
    }
    return result
}

inline fun <T> Iterable<T>.filterList(isSuitable: (T) -> Boolean): List<T> {
    val filterList = mutableListOf<T>()
    for (element in this) {
        if (isSuitable(element)) {
            filterList.add(element)
        }
    }
    return filterList
}

inline fun <T, R> T.myLet(block: (T) -> R): R { // аналог функции let()
    return block(this) // возвращает объект, указанный последним явно или результат операции
}

inline fun <T> T.myAlso(operation: (T) -> Unit): T { // аналог функции also()
    operation(this)
    return this // по умолчанию возвращает объект, с которым работала, п.э. не надо ничего указывать явно
}

inline fun <T> T.myApply(operation: T.() -> Unit): T { // аналог функции apply()
    operation()
    return this // по умолчанию возвращает объект, с которым работала, п.э. не надо ничего указывать явно
}

inline fun <T, R> myWith(r: T, operation:T.() -> R): R { // аналог функции with() (сама не сообразила :/)
    return r.operation()
}
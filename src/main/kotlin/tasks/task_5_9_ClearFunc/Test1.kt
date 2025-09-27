package org.example.tasks.task_5_9_ClearFunc

/**
 * В приложении, над которым вы работаете, нужно реализовать функциональность для отображения списка продуктов.
 * Эти данные поступают из репозитория и должны быть обработаны перед отправкой в пользовательский интерфейс.
 * Каждый продукт представлен объектом класса Product, содержащим:
 * id — уникальный идентификатор продукта (целое число).
 * name — название продукта (строка).
 * price — цена продукта (вещественное число).
 * category — категория продукта (строка).
 * Вам нужно написать метод, который выполнит следующие действия:
 *
 * Исключит из списка продукты, у которых цена меньше 100.
 * Оставит только продукты из категорий "Electronics" или "Books".
 * Отсортирует оставшиеся продукты по цене в порядке возрастания.
 * Преобразует каждый продукт в строку формата:
 * "Product ID: <id> | Name: <name> | Price: $<price>".
 * Вернёт итоговый список строк, который будет отображён в пользовательском интерфейсе.
 */
fun main() {
    val products = listOf(
        Product(1, "Laptop", 999.99, "Electronics"),
        Product(2, "Notebook", 12.99, "Books"),
        Product(3, "Tablet", 299.99, "Electronics"),
        Product(4, "Novel", 15.49, "Books"),
        Product(5, "Pen", 2.99, "Stationery")
    )
    processProductsForUI(products).forEach { println(it) }
}

/**
 * Класс для представления информации о продукте.
 *
 * @property id Уникальный идентификатор продукта.
 * @property name Название продукта.
 * @property price Цена продукта.
 * @property category Категория продукта.
 */
data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val category: String
)

/**
 * Метод, который обрабатывает список продуктов для отображения в UI.
 *
 * @param products Список продуктов, полученных из репозитория.
 * @return Список строк, готовых для отображения в UI.
 */
fun processProductsForUI(products: List<Product>): List<String> {
    // Реализуйте логику здесь
    return products
        .filter { it.price > 100.0 && (it.category == "Electronics" || it.category == "Books") }
        .sortedBy { it.price }
        .map { "Product ID: ${it.id} | Name: ${it.name} | Price: $${it.price}"}

}
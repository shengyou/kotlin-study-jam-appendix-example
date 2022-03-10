package tips.kotlin.appendix.topic10

fun main() {
    // 從 Kotlin 使用 Java 物件
    val fruit = JavaFruit(1, "Apple", 100.0)
    fruit.price = 10.0
    println(fruit.price)

    println(fruit.isApple)
}
package tips.kotlin.appendix.topic9.classes

class ShoppingCart {
    private val products = mutableListOf<Product>()

    fun add(product: Product) {
        products.add(product)
    }

    fun amount(): Int = products.size
}

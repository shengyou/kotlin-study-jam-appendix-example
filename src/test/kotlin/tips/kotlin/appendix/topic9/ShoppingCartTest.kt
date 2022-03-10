package tips.kotlin.appendix.topic9

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import tips.kotlin.appendix.topic9.classes.Product
import tips.kotlin.appendix.topic9.classes.ShoppingCart

class ShoppingCartTest : FunSpec({

    test("加 2 個商品到購物車後，購物車的總數會是 2") {
        val cart = ShoppingCart()
        val apple = Product(1, "Apple", 100.0)
        val banana = Product(2, "Banana", 10.0)

        cart.add(apple)
        cart.add(banana)

        cart.amount() shouldBe 2
    }

})

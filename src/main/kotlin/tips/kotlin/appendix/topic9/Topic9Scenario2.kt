package tips.kotlin.appendix.topic9

import tips.kotlin.appendix.topic9.functions.greaterThan

fun main() {
    // infix function
    println(2 greaterThan 1)
    println(2 greaterThan 3)

    println(2.greaterThan(1))
    println(2.greaterThan(3))
}

package tips.kotlin.appendix.topic9

import tips.kotlin.appendix.topic9.functions.convert

fun main() {
    // inline function
    val result  = convert(2.2) {
        it * 100.0
    }

    println(result)
}

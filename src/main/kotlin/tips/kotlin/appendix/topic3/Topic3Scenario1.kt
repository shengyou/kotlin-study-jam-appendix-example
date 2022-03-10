package tips.kotlin.appendix.topic3

import tips.kotlin.appendix.topic3.classes.Ide
import tips.kotlin.appendix.topic3.classes.warmup

fun main() {
    warmup(Ide.Idea) {
        println("Warmup IDE!")
    }

    val goland = Ide.GoLand
    println(goland.code())

    val phpStorm = Ide.PhpStorm
    println(phpStorm.code())
}

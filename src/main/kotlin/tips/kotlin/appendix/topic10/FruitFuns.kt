package tips.kotlin.appendix.topic10

fun countFruits(vararg fruit: KotlinFruit): String {
    return "I got ${fruit.size} fruits!"
}

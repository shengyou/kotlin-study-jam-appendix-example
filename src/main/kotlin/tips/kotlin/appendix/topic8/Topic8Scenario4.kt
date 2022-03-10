package tips.kotlin.appendix.topic8

fun main() {
    listOf("A", "B", "C", "D").forEach {
        if (it == "C") return@forEach
        println(it)
    }
    println("Finished lambda")
}

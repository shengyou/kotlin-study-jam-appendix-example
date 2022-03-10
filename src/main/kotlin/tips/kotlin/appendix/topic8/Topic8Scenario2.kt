package tips.kotlin.appendix.topic8

fun main() {
    var x = 0
    var y = 0
    while (x < 10) {
        x++
        continue
        y++
    }
    println(x)
    println(y)
}

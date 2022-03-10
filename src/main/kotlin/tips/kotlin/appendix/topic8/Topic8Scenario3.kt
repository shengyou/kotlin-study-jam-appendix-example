package tips.kotlin.appendix.topic8

fun main() {
    var x = 0
    var y = 0

    myloop@ while (x < 20) {
        while (y < 20) {
            x++
            break@myloop
        }
    }

    println(x)
    println(y)
}

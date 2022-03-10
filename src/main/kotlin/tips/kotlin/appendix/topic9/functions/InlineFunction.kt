package tips.kotlin.appendix.topic9.functions

inline fun convert(x: Double, converter: (Double) -> Double): Int {
    val result = converter(x).toInt()

    println("$x is converted to $result")

    return result
}

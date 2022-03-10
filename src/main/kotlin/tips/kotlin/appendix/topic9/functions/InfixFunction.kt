package tips.kotlin.appendix.topic9.functions

infix fun Int.greaterThan(target: Int): Boolean {
    return (this > target)
}

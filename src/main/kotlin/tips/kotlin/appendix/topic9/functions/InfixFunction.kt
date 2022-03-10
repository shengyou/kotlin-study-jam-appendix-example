package tips.kotlin.appendix.topic9

infix fun Int.greaterThan(target: Int): Boolean {
    return (this > target)
}

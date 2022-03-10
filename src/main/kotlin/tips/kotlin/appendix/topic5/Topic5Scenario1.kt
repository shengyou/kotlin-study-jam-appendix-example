package tips.kotlin.appendix.topic5

import tips.kotlin.appendix.topic5.classes.Outer

fun main() {
    val nested = Outer.Nested()
    println(nested.y)
    println(nested.myFun())

    val inner = Outer().Inner()
    println(inner.y)
    println(inner.myFun())
    println(inner.getX())

    val innerFromOuter = Outer().myInner
    println(innerFromOuter.y)
}

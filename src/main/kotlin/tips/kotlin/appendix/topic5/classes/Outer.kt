package tips.kotlin.appendix.topic5.classes

class Outer {
    val x = "This is in the Outer class"
    val myInner = Inner()

    class Nested {
        val y = "This is in the Nested class"

        fun myFun() = "This is the Nested function"

        fun getX() = "Value of x is $" // can't see $x
    }

    inner class Inner {
        val y = "This is in the Inner class"

        fun myFun() = "This is the Inner function"

        fun getX() = "Value of x is $x"
    }
}
package tips.kotlin.appendix.topic7

import tips.kotlin.appendix.topic7.classes.SpiderMan
import tips.kotlin.appendix.topic7.extensions.*

fun main() {
    val md5Hash = "test".md5
    println(md5Hash) // 098f6bcd4621d373cade4e832627b4f6

    val sha1Hash = "test".sha1
    println(sha1Hash) // a94a8fe5ccb19ba61c4c0873d391e987982fbbd3

    println("Contains letters".containsLatinLetter) // true
    println("12345".containsLatinLetter) // false
    println("Contains digits 123".containsDigit) // true
    println("123".isIntegerNumber) // true
    println("12.9".toDecimalNumber) // true

    val email = "test@email.com"
    if (email.isEmailValid()) {
        println("Email is valid.")
    } else {
        println("Email is not validate.")
    }

    val hero = SpiderMan()
    hero.spin()
    hero.climb()
}

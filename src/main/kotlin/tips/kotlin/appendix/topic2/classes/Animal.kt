package tips.kotlin.appendix.topic2.classes

open class Animal {
    var id: Int = 0
    private val codeName: String = "Secret Code Name"
    protected open val name: String = "Animal"
    internal var age: Int = 0
}

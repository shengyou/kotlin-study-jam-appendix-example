package tips.kotlin.appendix.topic3.classes

enum class Ide(val language: String) {
    Idea("Kotlin"),
    PyCharm("Python"),
    PhpStorm("PHP") {
        override fun code() = "PHP is the BEST language in the world"
    },
    WebStorm("JavaScript"),
    CLion("C"),
    GoLand("Go"),
    Fleet("All");

    open fun code() = "Let's write some $language code!"
}

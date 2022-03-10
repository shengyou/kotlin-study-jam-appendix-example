package tips.kotlin.appendix.topic3.classes

fun warmup(ide: Ide, init: () -> Unit) {
    init()

    if (ide == Ide.Idea) {
        println("Good kids use IntelliJ IDEA")
    }
}

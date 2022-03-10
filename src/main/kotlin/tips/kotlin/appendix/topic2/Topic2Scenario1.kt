package tips.kotlin.appendix.topic2

import tips.kotlin.appendix.topic2.classes.Animal
import tips.kotlin.appendix.topic2.classes.Otter

fun main() {
    val animal = Animal()
    println(animal.id)
    println(animal.age)

    val otter = Otter()
    otter.id = 1
    otter.age = 5
    println(otter.id)
    println(otter.name)
    println(otter.age)
}

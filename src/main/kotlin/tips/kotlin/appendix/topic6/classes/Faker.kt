package tips.kotlin.appendix.topic6.classes

class Faker {
    object FakerFactory {
        fun create(): Faker = Faker()
    }

    companion object {
        fun build(): Faker = Faker()
    }
}

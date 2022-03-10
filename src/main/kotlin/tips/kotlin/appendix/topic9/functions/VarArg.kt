package tips.kotlin.appendix.topic9

fun gradlew(image: String, vararg args: String, init: (() -> Unit)? = null): String {
    if (init != null) init()

    return "I will use $image image and run command ${args.joinToString(" ")}"
}

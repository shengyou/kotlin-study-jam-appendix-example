package tips.kotlin.appendix.topic9

import tips.kotlin.appendix.topic9.functions.gradlew

fun main() {
    // 使用有 vararg 的 Function
    val result1 = gradlew("openjdk:17", "build", "--scan") {
        (1..10).forEach {
            println("Preparing environment: ${it * 10} %")
        }
    }

    println(result1)

    // 使用 spread operator 展開值陣列傳入
    val args = listOf("clean", "check", "build")
    val result2 = gradlew("openjdk:11", *args.toTypedArray())

    println(result2)
}

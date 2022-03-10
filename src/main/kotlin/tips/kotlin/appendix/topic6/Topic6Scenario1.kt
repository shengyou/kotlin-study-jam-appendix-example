package tips.kotlin.appendix.topic6

import tips.kotlin.appendix.topic6.classes.DatabaseManager
import tips.kotlin.appendix.topic6.classes.Faker

fun main() {
    // 直接使用 object 上的方法
    DatabaseManager.connect()

    // 類別物件
    val faker = Faker.FakerFactory.create()

    // 伴生物件
    val fakerByBuild = Faker.build()

}
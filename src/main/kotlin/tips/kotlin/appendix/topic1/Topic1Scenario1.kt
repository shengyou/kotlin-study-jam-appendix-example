package tips.kotlin.appendix.topic1

import tips.kotlin.appendix.topic1.xinyi.Takeshi as XinyiTakeshi
import tips.kotlin.appendix.topic1.sanchong.Takeshi as SanchongTakeshi

fun main() {
    // ∵ 不知道是哪位金城武？
    // ∴ 要先寫「全名」或用「匯入」
//    val takeshi = tips.kotlin.appendix.topic1.sanchong.Takeshi(1)

    // 然後就可以使用金城武身上的屬性了
//    println(takeshi.skill)

    // 萬一兩位金城武同時出場時…
//    val takeshi1 = XinyiTakeshi("小武")
//    val takeshi2 = SanchongTakeshi(1)
//    println(takeshi1.habit)
//    println(takeshi2.skill)
}
package tips.kotlin.appendix.topic10;

public class Topic10Scenario2 {
    public static void main(String[] args) {
        // 從 Java 使用 Kotlin 物件
        KotlinFruit fruit = new KotlinFruit(1, "Apple", 150.0);


        // 從 Java 呼叫 Kotlin Package Level Function
        KotlinFruit oneFruit = new KotlinFruit(1, "Apple", 150.0);
        KotlinFruit twoFruit = new KotlinFruit(2, "Banana", 10.0);

    }
}

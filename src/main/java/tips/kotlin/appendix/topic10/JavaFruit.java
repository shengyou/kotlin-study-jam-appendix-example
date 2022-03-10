package tips.kotlin.appendix.topic10;

public class JavaFruit {

    private final int id;
    private final String name;
    private double price;

    public JavaFruit(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isApple() {
        return this.name.equals("Apple");
    }
}

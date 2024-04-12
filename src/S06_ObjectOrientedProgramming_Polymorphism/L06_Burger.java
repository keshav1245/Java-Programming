package S06_ObjectOrientedProgramming_Polymorphism;

public class L06_Burger {
    private String type;
    private double price;
    private L06_Topping topping1, topping2, topping3;

    public L06_Burger(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "L06_Burger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", topping1=" + topping1 +
                ", topping2=" + topping2 +
                ", topping3=" + topping3 +
                '}';
    }
}

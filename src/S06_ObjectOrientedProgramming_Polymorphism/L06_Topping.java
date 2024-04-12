package S06_ObjectOrientedProgramming_Polymorphism;

public class L06_Topping {
    private String name;
    private double price;

    public L06_Topping(){}

    public L06_Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "L06_Topping{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

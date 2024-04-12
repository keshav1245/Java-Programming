package S06_ObjectOrientedProgramming_Polymorphism;

public class L06_DeluxeBurger extends L06_Burger{
    private L06_Topping topping4, topping5;

    public L06_DeluxeBurger(String type, double price) {
        super(type, price);
    }

    @Override
    public String toString() {
        return "L06_DeluxeBurger{" +
                "topping4=" + topping4 +
                ", topping5=" + topping5 +
                "} " + super.toString();
    }
}

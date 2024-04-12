package S06_ObjectOrientedProgramming_Polymorphism;

public class L06_MealOrder {

    private L06_Burger burger;
    private L06_Drink drink;
    private L06_SideItem sideItem;

    public L06_MealOrder(){
        this.burger = new L06_Burger("Regular", 5.5);
        this.drink = new L06_Drink("Coke", "Small");
        this.sideItem = new L06_SideItem("Fries");
    }

    public L06_MealOrder(L06_Burger burger, L06_Drink drink, L06_SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }


    @Override
    public String toString() {
        return "L06_MealOrder{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", sideItem=" + sideItem +
                '}';
    }
}

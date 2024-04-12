package S06_ObjectOrientedProgramming_Polymorphism;

public class L06_SideItem {
    private String type;
    private double price;

    public L06_SideItem() {}

    public L06_SideItem(String type) {
        this.type = type;
        this.price = calculatePrice(type);
    }


    private double calculatePrice(String type){
        double basePrice = 0;

        if (type.equals("Fries")) {
            basePrice += 1.5;
        }else if (type.equals("Calzone pockets")) {
            basePrice += 3.0;
        }else if (type.equals("Potato Wedges")) {
            basePrice += 2.5;
        }

        return basePrice;

    }

    @Override
    public String toString() {
        return "L06_SideItem{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

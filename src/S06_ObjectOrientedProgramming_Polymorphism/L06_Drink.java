package S06_ObjectOrientedProgramming_Polymorphism;

public class L06_Drink {

    private String type;
    private String size;
    private double price;

    public  L06_Drink(){}

    public L06_Drink(String type, String size) {
        this.type = type;
        this.size = size;
        this.price = calculatePrice(type, size);
    }


    private double calculatePrice(String type, String size){
        double basePrice = 0;

        if (type.equals("Coke")) {
            basePrice += 1.5;
        }else if (type.equals("Ginger Ale")) {
            basePrice += 3.0;
        }else if (type.equals("Fanta")) {
            basePrice += 1.0;
        }


        if (size.equals("Small")) {
            basePrice += 0.5;
        }else if (size.equals("Medium")) {
            basePrice += 1.0;
        }else if (size.equals("Large")) {
            basePrice += 2.0;
        }

        return basePrice;

    }

    @Override
    public String toString() {
        return "L06_Drink{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}

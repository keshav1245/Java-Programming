package S02_Conditionals;

public class L04_Ternary {
    public static void main(String[] args) {
        String makeOfCar = "Volkswagen";

        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        System.out.println(isDomestic);
        if(isDomestic){
            System.out.println("This car is domestic to our country!");
        }

        isDomestic = !(makeOfCar == "Volkswagen");
        System.out.println(isDomestic);

    }
}

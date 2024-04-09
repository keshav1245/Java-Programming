package S06_ObjectOrientedProgramming_Polymorphism;

public class L01_Composition_Main {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theBoard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        L01_PersonalComputer thePC = new L01_PersonalComputer("2208", "Dell", theCase, theMonitor, theBoard);

//        thePC.getComputerCase().pressPowerButton();
//        thePC.getMonitor().drawPixel(10, 10, "red");
//        thePC.getMotherboard().loadProgram("Ubuntu 22.04 LTS");

        thePC.powerUp();

        /*
        * Composition Challenge - IOT Smart Kitchen
        * */

        System.out.println("\n\nSmart Kitchen Challenge\n");

        Refrigerator refrigerator = new Refrigerator(false);
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);
        DishWasher dishWasher = new DishWasher(false);

        L01_SmartKitchen smartKitchen = new L01_SmartKitchen(coffeeMaker, dishWasher, refrigerator);

        smartKitchen.setKitchenState(true, true, true);
        //Method 1
        System.out.println("\nMethod 1\n");
        smartKitchen.getIceBox().orderFood();
        smartKitchen.getBrewMaster().brewCoffee();
        smartKitchen.getDishWasher().doDishes();

        smartKitchen.setKitchenState(true, true, false);
        //Method 2
        System.out.println("\nMethod 2\n");
        smartKitchen.doKitchenWork();

    }


}

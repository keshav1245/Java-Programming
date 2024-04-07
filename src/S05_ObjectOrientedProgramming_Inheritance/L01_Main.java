package S05_ObjectOrientedProgramming_Inheritance;

public class L01_Main {

    public static void main(String[] args) {

        L01_Car car = new L01_Car();
        car.describeCar();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Red");
        car.setConvertible(true);
        car.setDoors(2);
//        System.out.println(car.getMake());
//        System.out.println(car.getModel());

        car.describeCar();


        /*
        * Bank Account challenge
        * */

        L01_BankAccount bank = new L01_BankAccount("1234567890", 0, "Keshav", "tangri57@gmail.com", "1023456789");

        bank.withdrawAmount(100);
        bank.depositAmount(1245);
        bank.withdrawAmount(500);

    }

}

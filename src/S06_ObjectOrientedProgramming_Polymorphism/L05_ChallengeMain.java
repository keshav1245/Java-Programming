package S06_ObjectOrientedProgramming_Polymorphism;

public class L05_ChallengeMain {

    public static void main(String[] args) {

        L05_Car car = new L05_Car("Just a car with 4 wheels !");
        car.startEngine();
        car.runEngine();
        car.drive();

        car = new L05_GasPoweredCar("Gas Powered Car", 20.5, 6);
        car.startEngine();
        car.runEngine();
        car.drive();

        car = new L05_ElectricCar("Electric Powered Car", 350, 8000);
        car.startEngine();
        car.runEngine();
        car.drive();

        car = new L05_HybridCar("Electric Powered Car", 18, 8000, 4);
        car.startEngine();
        car.runEngine();
        car.drive();


    }

}

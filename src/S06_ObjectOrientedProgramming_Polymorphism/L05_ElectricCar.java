package S06_ObjectOrientedProgramming_Polymorphism;

public class L05_ElectricCar extends L05_Car{
    private double avgKmPerCharge;
    private int batterySize;

    public L05_ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }


    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("No Engine in Electric car, starting motor");
    }

    @Override
    public String toString() {
        return "L05_ElectricCar{" +
                "avgKmPerCharge=" + avgKmPerCharge +
                ", batterySize=" + batterySize +
                "} " + super.toString();
    }
}

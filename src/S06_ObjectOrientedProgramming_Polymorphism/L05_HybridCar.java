package S06_ObjectOrientedProgramming_Polymorphism;

public class L05_HybridCar extends L05_Car{
    private double avgKmPerLitre;
    private int batterySize, cylinders;

    public L05_HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }


    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Starting Engine in hybrid car, would recommend to switch to motor!");
    }

    @Override
    public String toString() {
        return "L05_HybridCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", batterySize=" + batterySize +
                ", cylinders=" + cylinders +
                "} " + super.toString();
    }
}

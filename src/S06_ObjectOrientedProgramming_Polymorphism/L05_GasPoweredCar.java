package S06_ObjectOrientedProgramming_Polymorphism;

public class L05_GasPoweredCar extends L05_Car{

    private double avgKmPerLitre;
    private int cylinders;

    public L05_GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }


    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Starting Engine in gas powered car.");
    }

    @Override
    public String toString() {
        return "L05_GasPoweredCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", cylinders=" + cylinders +
                "} " + super.toString();
    }
}

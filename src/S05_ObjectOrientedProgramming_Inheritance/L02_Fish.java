package S05_ObjectOrientedProgramming_Inheritance;

public class L02_Fish extends L02_Animal{

    private int fins;
    private int gills;

    public L02_Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles(){
        System.out.println("Muscles moving ");
    }

    private void moveBackFins(){
        System.out.println("Backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "Fast")
            moveBackFins();

        System.out.println();
    }

    @Override
    public String toString() {
        return "L02_Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }
}

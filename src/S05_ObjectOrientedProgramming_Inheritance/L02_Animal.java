package S05_ObjectOrientedProgramming_Inheritance;

public class L02_Animal {
    protected String type;
    private String size;
    private double weight;
    public L02_Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public L02_Animal () {}

    @Override
    public String toString() {
        return "L02_Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise(){
        System.out.println(type + " makes some kind of noise!");
    }

}

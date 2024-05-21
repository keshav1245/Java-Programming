package S09_Abstraction.abstraction;

public abstract class Mammal extends Animal{


    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }


    @Override
    public void move(String speed) {
        System.out.println(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "run" );
    }


    public abstract void shedHair();

}

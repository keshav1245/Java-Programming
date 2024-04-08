package S05_ObjectOrientedProgramming_Inheritance;

public class L02_Dog extends L02_Animal{

    private String earShape;
    private String tailShape;

    public L02_Dog(){
        super("Mutt", "Big", 50);
    }

    public L02_Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public L02_Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large")
                , weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    private void bark(){
        System.out.println("Woof! ");
    }

    private void run(){
        System.out.println("Dog Running ");
    }


    private void walk(){
        System.out.println("Dog Walking! ");
    }


    private void wagTail(){
        System.out.println("Tail wagging! ");
    }


    @Override
    public void makeNoise() {
//        super.makeNoise();
//        System.out.println("Woof Woof");

        if(type == "Wolf")
            System.out.println("Ow Woooooo!");

        bark();
        System.out.println();
    }


    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail!" );

        if (speed == "Slow") {

            walk();
            wagTail();

        }else{

            run();
            bark();

        }

        System.out.println();

    }


    @Override
    public String toString() {
        return "L02_Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}

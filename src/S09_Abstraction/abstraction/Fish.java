package S09_Abstraction.abstraction;

public class Fish extends Animal{


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")){
            System.out.println(getExplicitType() + " lazily swimming!");
        }else{
            System.out.println(getExplicitType() + " darting far!");
        }
    }

    @Override
    public void makeNoise() {
        if(type == "Goldfish"){
            System.out.println("swish! ");
        }else{
            System.out.println("splash! ");
        }
    }
}

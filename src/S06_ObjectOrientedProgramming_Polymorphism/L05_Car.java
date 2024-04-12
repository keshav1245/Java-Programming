package S06_ObjectOrientedProgramming_Polymorphism;

public class L05_Car {

    private String description;

    public L05_Car(){}
    public L05_Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Inside StartEngine");
        System.out.println(this.getClass().getName());
    }

    public void drive(){
        System.out.println("Inside Drive");
        System.out.println(this.getClass().getName());
    }

    protected void runEngine(){
        System.out.println("Inside RunEngine");
        System.out.println(this.getClass().getName());
    }

    @Override
    public String toString() {
        return "L05_Car{" +
                "description='" + description + '\'' +
                '}';
    }
}

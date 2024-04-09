package S06_ObjectOrientedProgramming_Polymorphism;

public class L01_IOT_Challenge {
    protected boolean hasWorkToDo;

    public L01_IOT_Challenge(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class Refrigerator extends L01_IOT_Challenge{

    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void orderFood(){
        if(this.hasWorkToDo) {
            System.out.println("Ordering Food...");
            setHasWorkToDo(false);
        }
    }

}

class DishWasher extends L01_IOT_Challenge{

    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void doDishes(){
        if(this.hasWorkToDo) {
            System.out.println("Washing Dishes...");
            setHasWorkToDo(false);
        }
    }

}

class CoffeeMaker extends L01_IOT_Challenge{

    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void brewCoffee(){
        if(this.hasWorkToDo) {
            System.out.println("Brewing Coffee...");
            setHasWorkToDo(false);
        }
    }

}

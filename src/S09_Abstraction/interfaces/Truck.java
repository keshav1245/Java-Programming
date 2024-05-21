package S09_Abstraction.interfaces;

public class Truck implements Trackable{

    @Override
    public void track() {

        System.out.println(getClass().getSimpleName() + " coordinate recorded!");
    }

}

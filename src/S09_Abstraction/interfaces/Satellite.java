package S09_Abstraction.interfaces;

enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;


    @Override
    public void track() {
        if(this != GROUNDED){
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage(){
        FlightStages[] allStages = values();
        return allStages[ (ordinal() + 1) % allStages.length ];
    }
}

record DragonFly(String name, String type) implements FlightEnabled {
    @Override
    public void takeOff() {
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

public class Satellite implements OrbitEarth{

    FlightStages stage = FlightStages.GROUNDED;

    @Override
    public void achieveOrbit() {
        transition("Orbit achieved!");
    }

    @Override
    public void takeOff() {

        transition("Taking Off");
    }

    @Override
    public void land() {

        transition("Landing");
    }

    @Override
    public void fly() {

        achieveOrbit();
        transition("Data collection while orbiting");
    }

    public void transition(String desc){
        System.out.println(desc);
        stage = transition(stage);
        stage.track();
    }
}

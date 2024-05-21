package S09_Abstraction.interfaces;

import java.util.Date;

interface OrbitEarth extends FlightEnabled{

    void achieveOrbit();

//    static void log(String description){
//        var today = new Date();
//        System.out.println(today + " : " +description);
//    }

    private static void log(String description){
        var today = new Date();
        System.out.println(today + " : " +description);
    }


    private void logStage(FlightStages stage, String desc){
        desc = stage + ": " + desc;
        log(desc);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(nextStage, "Beginning Transition to " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled {


    //These wont be instance fields, they will be
    //public, static and final!

    double MILES_TO_KM = 1.69034;

    double KM_TO_MILES = 0.621371;

    public abstract void takeOff();

    abstract void land();

    void fly();

    // All 3 declarations are same, by default functions in
    // an interface are public and abstract.

    default FlightStages transition(FlightStages stage) {
//        System.out.println("Transition not Implemented on " + getClass().getSimpleName());
//        return null;

        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    };
}

interface Trackable {

    void track();

}

public abstract class Animal {

    public abstract void move();
}

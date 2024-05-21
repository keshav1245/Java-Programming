package S09_Abstraction.interfaces;

public class Test {
    public static void main(String[] args) {
        inFlight(new Jet());
        orbit(new Satellite());
//        OrbitEarth.log("Testing " + new Satellite());
    }

    private static void inFlight(FlightEnabled flightEnabled){
        flightEnabled.takeOff();
        flightEnabled.fly();
        flightEnabled.transition(FlightStages.LAUNCH);
        if(flightEnabled instanceof Trackable trackable){
            trackable.track();
        }
        flightEnabled.land();
    }

    private static void orbit(OrbitEarth orbitEarth){

        orbitEarth.takeOff();
        orbitEarth.fly();
        orbitEarth.land();

    }
}

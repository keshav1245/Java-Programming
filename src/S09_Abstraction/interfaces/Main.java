package S09_Abstraction.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = new Bird();
        FlightEnabled flightEnabled = new Bird();
        Trackable trackable = new Bird();

        animal.move();
        bird.move();
//        flightEnabled.move();
//        trackable.move();

//        flightEnabled.takeOff();
//        flightEnabled.takeOff();
//        trackable.track();
//        flightEnabled.land();

        inFlight(flightEnabled);

        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();


        double kms = 100;
        double miles = kms * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck travelled %.2f kms or %.2f miles %n",kms, miles);


        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        List<FlightEnabled> fliers2 = new ArrayList<>();
        fliers2.add(bird);


        LinkedList<FlightEnabled> fliers3 = new LinkedList<>();
        fliers3.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(fliers2);
        flyFliers(fliers2);
        landFliers(fliers2);

        triggerFliers(fliers3);
        flyFliers(fliers3);
        landFliers(fliers3);



    }

    private static void inFlight(FlightEnabled flightEnabled){
        flightEnabled.takeOff();
        flightEnabled.fly();
        if(flightEnabled instanceof Trackable trackable){
            trackable.track();
        }
        flightEnabled.land();
    }

    private  static void triggerFliers(List<FlightEnabled> fliers){
        for (var f : fliers){
            f.takeOff();
        }
    }

    private  static void flyFliers(List<FlightEnabled> fliers){
        for (var f : fliers){
            f.fly();
        }
    }


    private  static void landFliers(List<FlightEnabled> fliers){
        for (var f : fliers){
            f.land();
        }
    }

}

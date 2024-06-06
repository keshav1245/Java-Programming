package S10_Generics.challenge;

import java.util.Arrays;

public abstract class Line implements Mappable{

    private double[][] locations;

    public Line(String... locs){
        this.locations = new double[locs.length][];
        int index = 0;

        for (var l : locs){
            this.locations[index++] = Mappable.stringToLatLon(l);
        }

    }

    private String locations() {
        return Arrays.deepToString(locations);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as a LINE (" + locations() +")");
    }


}

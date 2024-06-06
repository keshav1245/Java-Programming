package S10_Generics.challenge;

import java.util.Arrays;

public abstract class Point implements Mappable{

    private double[] location;

    public Point(String coords) {
        this.location = Mappable.stringToLatLon(coords);
    }

    private String location() {
        return Arrays.toString(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT ("+location()+")");

    }
}

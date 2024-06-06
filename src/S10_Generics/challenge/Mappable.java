package S10_Generics.challenge;

public interface Mappable {

    void render();
    static double[] stringToLatLon(String coordinates){
        var strings = coordinates.split(",");
        double lat = Double.parseDouble(strings[0]);
        double lng = Double.parseDouble(strings[1]);

        return new double[]{lat, lng};

    }
}

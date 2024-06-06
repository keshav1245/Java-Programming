package S10_Generics.challenge;

public class Park extends Point{

    private String name;


    public Park(String name, String coords) {
        super(coords);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " National Park";
    }
}

package S10_Generics.challenge;

public class River extends Line{
    private String name;

    public River(String name, String... locs) {
        super(locs);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " River";
    }
}

package S06_ObjectOrientedProgramming_Polymorphism;

public class L03_Movie {

    private String title;

    public L03_Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film.");
    }

    /**
     * This kind of method is known as factory method.
     * This makes the main method know nothing about the subclasses
     * thus also making this as a good encapsulation technique
     * */
    public static L03_Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new L03_Movie(title);
        };
    }

}


class Adventure extends L03_Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Pleasant Scene", "Scary Music", "Something Bad Happens");
    }

    public void watchAdventure(){
        System.out.println("Watching Adventure");
    }

}


class Comedy extends L03_Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Something Funny happens", "Something even funnier happens",
                "Happy Ending");
    }

    public void watchComedy(){
        System.out.println("Watching Comedy");
    }
}


class ScienceFiction extends L03_Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Plot description", "Outer space", "Research documentary");
    }

    public void watchScienceFiction(){
        System.out.println("Watching Science Fiction");
    }
}



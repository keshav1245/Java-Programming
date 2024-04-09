package S06_ObjectOrientedProgramming_Polymorphism;

public class L03_Polymorphism_Main {
    public static void main(String[] args) {

        L03_Movie movie = new L03_Movie("3 Idiots");
        movie.watchMovie();

        movie = new Adventure("Mummy Returns");
        movie.watchMovie();

        movie = L03_Movie.getMovie("Comedy", "Carry On Jatta");
        movie.watchMovie();

        movie = L03_Movie.getMovie("ScienceFiction", "Star Wars");
        movie.watchMovie();

    }



}

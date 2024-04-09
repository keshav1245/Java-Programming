package S06_ObjectOrientedProgramming_Polymorphism;

public class L04_References_MovieMain {

    public static void main(String[] args) {
        L03_Movie movie = L03_Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        // Compile time error.
        // Adventure jaws = L03_Movie.getMovie("A", "Jaws");

        //One solution is casting
        Adventure jaws = (Adventure) L03_Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        //Run Time Exception - Class Cast Exception
        Adventure jaws2 = (Adventure) L03_Movie.getMovie("A", "Jaws");
        jaws2.watchMovie();


        /**

            Object comedy = L03_Movie.getMovie("C", "Airplane");
            comedy.watchMovie();

        // The compiler won't use the method return type to figure out what comedy really is. Once this
        // assignment is done, it just assumes that it is an Object and this variable only has access to
        // object's functionality. This is because, at any time in the code, an instance of Object itself
        // could be assigned to this variable and the code has to work for whatever object gets assigned,
        // to this variable. This means that when we are trying to call a Movie method (eg watchMovie)
        // on this object reference, we will get an error because the compiler can't locate that
        // method (watchMovie) on the Object class.
        */

        Object comedy = L03_Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();


        /**
         * This code compiles without error - so what exactly is var ?
         *
         * var, is a special contextual keyword in Java, that lets our code take advantage of Local
         * Variable Type Inference.
         */
        var airplane = L03_Movie.getMovie("C", "Airplane");
         airplane.watchMovie();

         var plane = new Comedy("Airplane");
         plane.watchComedy();


         Object unknownObject = L03_Movie.getMovie("S", "Welcome");

//        System.out.println(unknownObject.getClass().getSimpleName().contentEquals("Comedy"));
        if(unknownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if(unknownObject instanceof Adventure){
            Adventure a = (Adventure) unknownObject;
            a.watchAdventure();
        } else if(unknownObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }


    }


}

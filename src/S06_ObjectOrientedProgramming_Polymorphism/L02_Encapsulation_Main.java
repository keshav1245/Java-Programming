package S06_ObjectOrientedProgramming_Polymorphism;

public class L02_Encapsulation_Main {

    public static void main(String[] args) {

        L02_Player_BadEncapsulation player = new L02_Player_BadEncapsulation();

        // Fields are accessible as they are public
        /***
         * ISSUE -> However if any field is changed in the class, we have to change them manually at all occurrences
         * as we are accessing them directly.
         */
        player.name = "Keshav";
        player.health = 20;
        player.weapon = "Sword";
        /***
         * ISSUE -> Since we are initialising an object manually, that means it is the responsibility of the calling
         * code to run all the initial functions and checks all the time which is tedious, errorprone and sometimes unknown
         * to end user as well! Also, we don't know if the initialised data is valid or not !
         */

        int damage = 10;
        player.loseHealth(10);
        System.out.println("Remaining Health = " + player.healthRemaining());

        /**
         * ISSUE -> Due to direct access - we are potentially bypassing some gameplay checks and control
         */
        player.health = 200; // Setting the Health Manually and not as per game rules or gameplay!!
        player.loseHealth(11);
        System.out.println("Remaining Health = " + player.healthRemaining());


        /***
         * CODE FlOW for class with good encapsulation
         */

        System.out.println("\n\nGOOD ENCAPSULATION\n");

        // Despite health being 200, our validation caps it to 100 in the constructor
        // Field name changes won't affect main calss code.
        L02_Player_GoodEncapsulation playerGoodEncapsulation = new L02_Player_GoodEncapsulation("Keshav", "Sword", 200);
        System.out.println("Initial Health is : " + playerGoodEncapsulation.healthRemaining());


        /***
         * Encapsulation Challenge - Calling Code
         */

        L02_Printer_Encapsulation_Challenge printer = new L02_Printer_Encapsulation_Challenge(80, true);
        System.out.println("Initial print page count : " + printer.getPagesPrinted());
        System.out.println("Sheets required : " + printer.printPages(13));
        System.out.println("Print page count : " + printer.getPagesPrinted());
        System.out.println("Add Toner : " + printer.addToner(10));



    }



}

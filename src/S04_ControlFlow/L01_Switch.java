package S04_ControlFlow;

public class L01_Switch {

    public static void main(String[] args) {

        // Conditionals with if-else-if stmt
        int value = 3;

        if(value == 1){
            System.out.println("Value was 1");
        }else if (value == 2){
            System.out.println("Values was 2");
        }else {
            System.out.println("Neither 1 or 2");
        }


        // Using switch
        switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Either of 3, 4 or 5!");
                System.out.println("Actually iy was a : "+ value);
                break;
            default:
                System.out.println("Neither 1, 2, 3, 4, or 5!");
                break;
        }


        // Concept of Fall through!
        System.out.println();
        System.out.println("Checking out Switch Fall Through!");

        switch (value) {
            case 1:
                System.out.println("Value was 1");
            case 2:
                System.out.println("Value was 2");
            case 3: case 4: case 5:
                System.out.println("Either of 3, 4 or 5!");
                System.out.println("Actually it was a : "+ value);
            default:
                System.out.println("Neither 1, 2, 3, 4, or 5!");
        }



        // Enhanced Switch Statement

        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Either of 3, 4 or 5!");
                System.out.println("Actually iy was a : " + value);
            }
            default -> System.out.println("Neither 1, 2, 3, 4, or 5!");
        }


        switch (value){
            case 1 -> System.out.println("Val is 1");
            case 2 -> System.out.println("Val is 2");
            case 3, 4, 5 -> {
                System.out.println("Either of 3, 4, or 5!");
            }
            default -> System.out.println("Default!");
        }

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter!");
        System.out.println(getMonthQuarter(month));


        // Sample challenge #1
        // NATO phonetics for A to E

        System.out.println(NATO('A'));
        System.out.println(NATO('B'));
        System.out.println(NATO('C'));
        System.out.println(NATO('D'));
        System.out.println(NATO('E'));
        System.out.println(NATO('F'));

        /*
        * Sample Challenge #2
        * Day of the Week -> with enhanced switch
        *                 -> with if else
        * */

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
        
    }


    public static String getQuarter(String month){

        switch (month){

            case "JANUARY" : case "FEBRUARY" : case "MARCH" :
                return "1st";
            case "APRIL" : case "MAY" : case "JUNE" :
                return "2nd";
            case "JULY" : case "AUGUST" : case "SEPTEMBER" :
                return "3rd";
            case "OCTOBER" : case "NOVEMBER" : case "DECEMBER" :
                return "4th";
        }

        return "BAD";

    }

    public static String getMonthQuarter(String month){

        return switch (month){

            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {

                String badResponse = month + " IS BAD!";
                yield badResponse;

            }
        };

    }

    public static String NATO(char ch){

        switch (ch){
            case 'A' : return "Able";
            case 'B' : return "Baker";
            case 'C' : return "Charlie";
            case 'D' : return "Dog";
            case 'E' : return "Easy";
        }

        return "Not found";

    }


    public static void printDayOfWeek(int day){

        String dayOfWeek = switch (day){

            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " -> " + dayOfWeek);

    }

    public static void printWeekDay(int day){

        if(day == 0)
            System.out.println("Sunday");
        else if(day == 1)
            System.out.println("Monday");
        else if(day == 2)
            System.out.println("Tuesday");
        else if(day == 3)
            System.out.println("Wednesday");
        else if(day == 4)
            System.out.println("Thursday");
        else if(day == 5)
            System.out.println("Friday");
        else if(day == 6)
            System.out.println("Saturday");
        else
            System.out.println("Invalid Day");

    }


}

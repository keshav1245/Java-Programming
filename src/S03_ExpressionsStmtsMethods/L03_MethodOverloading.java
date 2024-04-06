package S03_ExpressionsStmtsMethods;

public class L03_MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("Keshav", 500);
        System.out.println("New Score is " + newScore);


        newScore = calculateScore(500, "Keshav");
        System.out.println("New Score is " + newScore);


        newScore = calculateScore(500);
        System.out.println("New Score is " + newScore);


        newScore = calculateScore();

        System.out.println("6ft to cm = " + convertToCentimeters(6, 0));
        System.out.println("6ft 1in to cm = " + convertToCentimeters(6, 1));
        System.out.println("12in to cm = " + convertToCentimeters(12));


        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));

    }

    public static String getDurationString(int seconds){
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds){
        int hours = minutes / 60;
        int remainingMins = minutes % 60;
        int remainingSecs = seconds % 60;

        return hours + "h " + remainingMins + "m " + remainingSecs +"s";
    }

    public static double convertToCentimeters(int in){
        return in * 2.54;
    }

    public static double convertToCentimeters(int ft, int in){
        return convertToCentimeters(((ft * 12) + in));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player : "+playerName+" scored : "+score+" points.");
        return score * 1000;
    }

    public static int calculateScore(int score){
//        System.out.println("Unnamed player scored : "+score+" points.");
//        return score * 1000;
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score!");
        return 0;
    }
    public static int calculateScore(int score, String playerName){
        System.out.println("Player : "+playerName+" scored : "+score+" points.");
        return score * 1000;
    }

}

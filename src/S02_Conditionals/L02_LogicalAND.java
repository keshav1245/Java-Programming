package S02_Conditionals;

public class L02_LogicalAND {
    public static void main(String[] args) {
        System.out.println("Hello, Keshav");

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an alien!");
            System.out.println("Do aliens exists ?");
        }

        int topScore = 80;
        if(topScore == 100){
            System.out.println("You got the highest score !");
        }

        int secondScore = 60;

        if(topScore > secondScore && topScore < 100){
            System.out.println("Greater than second top score but less than 100");
        }


    }
}

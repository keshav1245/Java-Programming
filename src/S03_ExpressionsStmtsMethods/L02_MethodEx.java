package S03_ExpressionsStmtsMethods;

public class L02_MethodEx {
    public static void main(String[] args) {

        displayHighScorePosition("Player 1", calculateHighScorePosition(1500));
        displayHighScorePosition("Player 2", calculateHighScorePosition(1000));
        displayHighScorePosition("Player 3", calculateHighScorePosition(500));
        displayHighScorePosition("Player 4", calculateHighScorePosition(100));
        displayHighScorePosition("Player 5", calculateHighScorePosition(25));

    }

    public static void displayHighScorePosition(String name, int position){

        System.out.println(name + " managed to get into position #" + position +
                " on the high score list!");

    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000)
            return 1;
        else if(score >= 500)
            return 2;
        else if(score >= 100)
            return 3;
        else
            return 4;

    }
}

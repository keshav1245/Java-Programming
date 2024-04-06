package S03_ExpressionsStmtsMethods;

public class L01_Methods {

    public static void main(String[] args) {

        boolean isGameOver = true;
        int score = 800, levelCompleted = 5, bonus = 100;


        System.out.println(calculateScore(isGameOver, score, levelCompleted, bonus));

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println(calculateScore(isGameOver, score, levelCompleted, bonus));

    }

    public static int calculateScore(boolean isGameOver, int score, int level, int bonus){

        int finalScore = score;

        if (isGameOver)
            return finalScore + (level * bonus) + 1000;

        return finalScore;
    }
}

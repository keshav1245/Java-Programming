package S02_Conditionals;

public class L03_LogicalOR {
    public static void main(String[] args) {

        int topScore = 80;
        int secondTopScore = 81;

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both conditions are true!");
        }
    }
}

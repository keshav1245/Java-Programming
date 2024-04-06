package S02_Conditionals;

public class L05_OperatorPrecedenceChallenge {
    public static void main(String[] args) {
        double var1 = 20.00;
        double var2 = 80.00;

        double op1 = var1 + var2 * 100.00;
        double op2 = op1 % 40.00;

        boolean isDivisible = (op2 == 0.00) ? true : false;
        System.out.println(isDivisible);
        if(!isDivisible){
            System.out.println("Got some remainder!");
        }
    }
}

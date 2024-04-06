package S01_FirstSteps;

public class L06_PrimitiveChallenge {
    public static void main(String[] args) {
        byte var1 = 123;
        short var2 = 5678;
        int var3 = 1234567;

        long calc = 50_000L + (10L * (var1 + var2 + var3));

        System.out.println(calc);
    }
}

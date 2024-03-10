package FirstSteps;

public class L12_Operators {
    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        // 2 operators -> + & =
        System.out.println(result);

        int prevResult = result;
        System.out.println(prevResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println(result);
        System.out.println(prevResult);

        char firstChar = 'A';
        char secondChar = 'B';

        System.out.println(firstChar + secondChar); // 131 & not AB
        System.out.println(firstChar + "" + secondChar); // AB
        System.out.println("" + firstChar + secondChar); // AB
        System.out.println(firstChar + secondChar + ""); // 131

        result = 2;
        System.out.println("Result Variable holds : " + result);
        result = result * 10; // 2 * 10 = 20
        System.out.println("Result Variable holds : " + result);
        result = result / 4; // 20 / 4 = 5
        System.out.println("Result Variable holds : " + result);
        result = result % 3; // 2
        System.out.println("Result Variable holds : " + result);

        System.out.println();

        result = 1;
        result = result + 1;
        System.out.println("Result Variable holds : " + result);
        result++;
        System.out.println("Result Variable holds : " + result);
        result--;
        System.out.println("Result Variable holds : " + result);
        result += 5;
        System.out.println("Result Variable holds : " + result);
        result -= 5;
        System.out.println("Result Variable holds : " + result);
        result += 5;
        System.out.println("Result Variable holds : " + result);
        result -= 4.5; // Works
        System.out.println("Result Variable holds : " + result);
        result += 5;
        System.out.println("Result Variable holds : " + result);

        //result = result - 5.5; // Wont WORK
        //System.out.println("Result Variable holds : " + result);


    }
}

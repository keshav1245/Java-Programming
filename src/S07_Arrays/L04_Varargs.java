package S07_Arrays;

public class L04_Varargs {
    public static void main(String... args) {

        //Difference b2 ... vs []
        System.out.println("Hello world again");

        String[] splitStrings = "Hello world again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "Again"); // Due to ..., we can have multiple ways of calling this method.

        /**
         * RESTRICTIONS ON VAR ARGS
         * 1. Only 1 vararg
         * 2. Should be the last arg.
         */

    }

    private static void printText(String... textList){
        for(String t : textList){
            System.out.println(t);
        }
    }
}

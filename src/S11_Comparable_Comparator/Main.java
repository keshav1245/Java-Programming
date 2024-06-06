package S11_Comparable_Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer i : others){
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">" ), i, val
                    );
        }

        String banana = "banana";

        String[] fruit = {"apple", "banana", "pear", "BANANA"};

        for (String i : fruit){
            int val = banana.compareTo(i);
            System.out.printf("%s %s %s: compareTo=%d%n", banana,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">" ), i, val
            );
        }

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        System.out.println("A: " + (int)'A' + " " + "a: " + (int)'a' );
        System.out.println("B: " + (int)'B' + " " + "b: " + (int)'b' );
        System.out.println("P: " + (int)'P' + " " + "p: " + (int)'p' );
        System.out.println("B: " + (int)'B' + " " + "b: " + (int)'b' );

        Student tim = new Student("Tim");
        Student[] students = {
                new Student("Zach"),
                new Student("Tim"),
                new Student("Keshav"),
                new Student("Ann")
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("Result = " + tim.compareTo(new Student("Mary")));

        Comparator<Student> gpaSorter = new StudentGPAComparator();

        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));

    }
}

package S04_ControlFlow;

import java.io.File;
import java.util.Scanner;

public class L04_ReadingUserInput {

    public static void main(String[] args) {
        String currentYear = "2024";
        String usersDOB = "1998";

        System.out.println("Age = "+ (Integer.parseInt(currentYear) - Integer.parseInt(usersDOB)));


        int year = 2024;

        try{
            System.out.println(getInputFromConsole(year));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(year));
        }


        int cnt = 1, s = 0;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Enter #"+cnt);
            String num = scanner.nextLine();

            try {

                int number = Integer.parseInt(num);
                if (number < 0) continue;
                s += number;
                cnt++;

            }catch (NumberFormatException e){
                System.out.println("Enter valid input, no chars allowed !");
            }

        }while (cnt<=5);

        System.out.println(s);


        /*
        * Min Max Challenge
        * */

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        while (true){

            System.out.println("Enter a Number or `any char` to quit");
            String data = scanner.nextLine();

            try {

                int num = Integer.parseInt(data);

                if(num <= min) min = num;

                if(num >= max) max = num;

            }catch (NumberFormatException e){
                break;
            }

            System.out.println("Max Num : "+ max);
            System.out.println("Min Num : "+ min);

        }


    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your Name? "); // Will run via terminal only!!
        System.out.println("Hi " + name + ", Thanks for learning Java!");

        String dob = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dob);

        return "" + age;
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in); // For reading uer data

        //For reading data from a file
        //Scanner scanner1 = new Scanner(new File("nameOfFileOnFilesystem"));

        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for Learning Java!");

        System.out.println("What year were you born? ");
        String dob = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dob);

        return "" + age;

    }

}

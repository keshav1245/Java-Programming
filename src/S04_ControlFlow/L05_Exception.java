package S04_ControlFlow;

public class L05_Exception {

    public static void main(String[] args) {


        try {
            System.out.println(getInputFromConsole(2024));
        }catch (NullPointerException e){
            System.out.println("Exception Handled !");
        }


    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your Name? "); // Will run via terminal only!!
        System.out.println("Hi " + name + ", Thanks for learning Java!");

        String dob = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dob);

        return "" + age;
    }

}

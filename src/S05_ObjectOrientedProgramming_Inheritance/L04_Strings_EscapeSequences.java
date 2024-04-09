package S05_ObjectOrientedProgramming_Inheritance;

public class L04_Strings_EscapeSequences {


    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);


        // NEW FEATURE AFTER JDK 15+
        String textBlock = """
            Print a Bulleted List:
                \u2022 First Point
                    \u2022 Sub  Point""";


        System.out.println(textBlock);

        int age = 25;
//        System.out.printf("Your age is %d\n", age);
        System.out.printf("Your age is %.2f%n", (float)age);

        int yob = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d\n", age,yob);

        for (int i = 1; i < 100000; i *=10) {
            System.out.printf("%6d %n", i);
        }


        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);


        /*
        * String methods
        * 1. Inspection Methods
        * 2. Comparison Methods
        * 3. Manipulation Methods
        * */

        printInformation("Hello World!");
        printInformation("");
        printInformation("      ");

        String helloworld = "Hello World";
        System.out.printf("Index of r = %d %n", helloworld.indexOf('r'));
        System.out.printf("Index of World = %d %n", helloworld.indexOf("World"));
        System.out.printf("Index of l = %d %n", helloworld.indexOf('l'));
        System.out.printf("Index of l = %d %n", helloworld.lastIndexOf('l'));

        String helloWOrldLower = helloworld.toLowerCase();

        if (helloworld.equals(helloWOrldLower)) {
            System.out.println("Values match exactly");
        }

        if(helloworld.equalsIgnoreCase(helloWOrldLower)){
            System.out.println("Values match ignoring case");
        }

        if(helloworld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }

        if(helloworld.endsWith("World")){
            System.out.println("String ends with World");
        }

        if(helloworld.contains("World")){
            System.out.println("String contains World");
        }

        if (helloworld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }


        printStringMethods();

    }


    public static void printInformation(String string){

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if(string.isEmpty()) {
            System.out.println("String is Empty!");
            return;
        }

        if(string.isBlank())
            System.out.println("String is Blank!");
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last chat = %c %n", string.charAt(length-1));

    }

    public static void printStringMethods(){
        System.out.println("\n\nSTRING MANIPULATION METHOD SECTION\n\n");

        String birthDate = "21/12/1998";
        int startIndex = birthDate.indexOf("1998");

        System.out.println("Starting Index : "+ startIndex);
        System.out.println("Birth Year = " + birthDate.substring(startIndex));
        System.out.println("Birth Month = "+ birthDate.substring(3,5));

        String newData = String.join("/", "21", "12", "1998");
        System.out.println(newData);

        newData = "01";
        newData = newData.concat("/");
        newData = newData.concat("01");
        newData = newData.concat("/");
        newData = newData.concat("2024");

        System.out.println(newData);

        newData = "18" + "/" + "02" + "/" + "1968";
        System.out.println(newData);

        //Method Chaining
        newData = "10".concat("/").concat("07").concat("/").concat("1966");
        System.out.println(newData);

        System.out.println(newData.replace('/', '-'));
        System.out.println(newData.replace("1", "00"));
        System.out.println(newData.replaceFirst("1", "00"));
        System.out.println(newData.replaceAll("1", "00"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));


    }


}

package S05_ObjectOrientedProgramming_Inheritance;

public class L05_Stringbuilder {

    public static void main(String[] args) {

        String helloWorld = "Hello " + "World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello " + "World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);


        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);


        StringBuilder builderPlus = new StringBuilder("Hello " + "World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);

    }

    public static void printInformation(String string){

        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());

    }

    public static void printInformation(StringBuilder stringBuilder){
        System.out.println("StringBuilder = " + stringBuilder);
        System.out.println("Length = " + stringBuilder.length());
        System.out.println("Capacity = " + stringBuilder.capacity());
    }



}


package FirstSteps;

public class L07_FloatAndDouble {
    public static void main(String[] args) {
        int intVal = 5;
        float floatVal = 5;
        double doubleVal = 5;

        System.out.println(intVal);
        System.out.println(floatVal);
        System.out.println(doubleVal);

        floatVal = 5f;
        doubleVal = 5d;

        System.out.println(floatVal);
        System.out.println(doubleVal);

        //float newFloatVal = 5.25;//Error, Because double is default type for real nos
        float newFloatVal = 5.25f;
        System.out.println(newFloatVal);

        float anotherFloatVal = (float) (6.25);
        System.out.println(anotherFloatVal);

        intVal = 5 / 2;
        System.out.println(intVal);

        floatVal = 5f / 2f;
        System.out.println(floatVal);

        doubleVal = 5d / 2d;
        System.out.println(doubleVal);

        intVal = 5 / 3;
        System.out.println(intVal);

        floatVal = 5f / 3f;
        System.out.println(floatVal);

        doubleVal = 5d / 3d;
        System.out.println(doubleVal);

        doubleVal = 5.00 / 3;
        System.out.println(doubleVal);

        //floatVal = 5.00 / 3f; // Error because 5.00 is double and not float

    }
}

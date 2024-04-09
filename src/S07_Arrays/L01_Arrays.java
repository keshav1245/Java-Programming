package S07_Arrays;

import java.util.Arrays;

public class L01_Arrays {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        myArray[0] = 30;
        myArray[1] = 1;
        myArray[9] = 100;

        double[] myDoubleArray = new double[10];
        myDoubleArray[0] = 5.5;

        System.out.println(myDoubleArray[0]);

        //Array Initializer
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Length of array = " + firstTen.length);
        System.out.println("First value : " + firstTen[0] +
                ", Last value : " + firstTen[firstTen.length - 1]);

        //Array Initializer can only be used during declaration!!
        //int[] newArray;
        //newArray = {5, 4, 3, 2, 1};
        //
        //The above 2 lines wont work

        int[] newArray;
        newArray = new int[] {5, 4, 3, 2, 1}; //This works

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();
        newArray = new int[5]; // initialised with default values

        System.out.println("Looping to assign the values in array");
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }

        System.out.println("Printing the values in an array");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();
        for (int element : newArray){
            System.out.print(element + " ");
        }

        System.out.println();
        String allElements = Arrays.toString(newArray);
        System.out.println(allElements);

        Object objVariable = newArray;
        if(objVariable instanceof int[])
            System.out.println("ObjVariable is really an int array");


        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = new StringBuilder("World!");
        objects[2] = newArray;

        for (Object object : objects){
            if(object instanceof int[])
                System.out.println(Arrays.toString((int[]) object));
            else
                System.out.println(object);
        }
    }
}

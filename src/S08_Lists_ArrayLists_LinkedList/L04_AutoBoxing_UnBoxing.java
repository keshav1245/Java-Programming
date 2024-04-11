package S08_Lists_ArrayLists_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class L04_AutoBoxing_UnBoxing {
    public static void main(String[] args) {

        /**
         * BOXING - primitive type to it's wrapper class
         * UNBOXING - wrapper to primitive type
         */

        Integer integer = Integer.valueOf(15); //manual boxing
        Integer integer1 = new Integer(15); //deprecated constructor boxing
        Integer integer2 = 15; //Autoboxing

        int unboxInt = integer2.intValue(); //manual unboxing
        int unbxInt2 = integer2; //Auto unboxing

        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(unboxInt);
        System.out.println(unbxInt2);

        System.out.println(integer2.getClass().getName());
//        System.out.println(unbxInt2.getClass().getName());

        //Utility
        /**
         * Do check the data type of the below variables and the calling function
         * This is the utility of autoboxing.
         * */
        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1,2,3,4,5,6,7,8,9,0);
        System.out.println(ourList);

        /**
         * CRUX is that since the arraylist, lists etc donot support primitive types, we still,
         * can create those lists via primitive types due to autoboxing and unboxing in java.
         * For eg in the function call getList above, If we change the method signature and in
         * the parameters, instead of int... varargs, we do Integer... varargs, the code in main
         * method will still work because of autoboxing of primitive to Integers and autounboxing
         * in the loop, followed by boxing again.
         */


    }

    private  static ArrayList<Integer> getList(int... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i : varargs){
            aList.add(i);
        }

        return aList;
    }

    private static int returnAnInt(Integer i){
        return i;
    }
    private static Integer returnAnInteger(int i){
        return i;
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive(){
        return 100.00;
    }

}

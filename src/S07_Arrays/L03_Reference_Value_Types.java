package S07_Arrays;

import java.util.Arrays;

public class L03_Reference_Value_Types {

    public static void main(String[] args) {
        //newArray holds a reference or an address
        //to an array in memory
        int[] newArray = new int[5];
        int[] anotherArray = newArray;
        // 2 references pointing to the same array in the
        // memory

        System.out.println(newArray);
        System.out.println(anotherArray);


        System.out.println("Before Change");
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(anotherArray);

        System.out.println("After change");
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(anotherArray));

    }

    public static void modifyArray(int[] arr){
        arr[1] = 100;
    }

}

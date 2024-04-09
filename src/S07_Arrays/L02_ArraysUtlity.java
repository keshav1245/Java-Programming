package S07_Arrays;

import java.util.Arrays;
import java.util.Random;

public class L02_ArraysUtlity {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(13);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] newFillArray = new int[10];
        System.out.println(Arrays.toString(newFillArray));
        Arrays.fill(newFillArray, 17);
        System.out.println(Arrays.toString(newFillArray));


        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] copyArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(copyArray));
        Arrays.sort(copyArray);
        System.out.println(Arrays.toString(copyArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        //Finding a match, using binary search
        // Linear search vs Interval searching
        String[] names = {"abc", "pqr", "lmn", "ijk", "xyz"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
        if(Arrays.binarySearch(names, "xyz") >= 0 ){
            System.out.println("Found xyz in the array at " +
                    Arrays.binarySearch(names, "xyz"));
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5, 6};
        if(Arrays.equals(s1, s2)){
            System.out.println("Equal Arrays");
        }else{
            System.out.println("Unequal Arrays!");
        }


    }

    private static int[] getRandomArray(int len){

        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }

}

package S07_Arrays;

import java.util.Arrays;

public class L05_TwoDimArrays {

    int[][] multiDimArray1;
    int[] multiDimArray2[];

    public static void main(String[] args) {
        int [][] array = new int[4][4];
        System.out.println(Arrays.toString(array));

        for (int[] outer : array){
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array.length; i++) {
            var innerArray = array[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (var outer : array){
            for(var element : outer){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            var innerArray = array[i];
            for (int j = 0; j < innerArray.length; j++) {
                array[i][j] = (i * 10) + (j + 1);
//                System.out.print(array[i][j] + " ");
            }
//            System.out.println();
        }

        System.out.println(Arrays.deepToString(array));

    }

}

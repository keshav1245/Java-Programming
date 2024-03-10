package FirstSteps;

public class L04_PrimitiveDataTypes {
    public static void main(String[] args) {

        System.out.println("Byte minimum value : " + Byte.MIN_VALUE);
        System.out.println("Byte maximum value : " + Byte.MAX_VALUE);

        System.out.println("Short minimum value : " + Short.MIN_VALUE);
        System.out.println("Short maximum value : " + Short.MAX_VALUE);

        System.out.println("Integer minimum value : " + Integer.MIN_VALUE);
        System.out.println("Integer maximum value : " + Integer.MAX_VALUE);

        System.out.println("Long minimum value : " + Long.MIN_VALUE);
        System.out.println("Long maximum value : " + Long.MAX_VALUE);

        System.out.println("Float minimum value : " + Float.MIN_VALUE);
        System.out.println("Float maximum value : " + Float.MAX_VALUE);

        System.out.println("Double minimum value : " + Double.MIN_VALUE);
        System.out.println("Double maximum value : " + Double.MAX_VALUE);

        int maxVal = Integer.MAX_VALUE;
        int minVal = Integer.MIN_VALUE;

        System.out.println("Overflow Max side : "+ (maxVal + 1)); // Overflow
        System.out.println("Overflow Min side : "+ (minVal - 1)); // Underflow

        int overflowTest1 = 2147483647 + 1; // Will Work
        System.out.println(overflowTest1);
//        int overflowTest2 = 2147483648; // Wont work

        System.out.println("Long has a width of : "+ Long.SIZE);

        long myLongVal = 2_147_483_647; // This will work as it is max value of Int
        //long myLongVal2 = 2_147_483_647_456; // This won't work as it is more than max value of Int
                                             // and we didn't add the L suffix
        long myLongVal3 = 2_147_483_647_456L; // Since we added L suffix, it will wrk fine

    }
}

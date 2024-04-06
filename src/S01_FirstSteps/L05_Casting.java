package S01_FirstSteps;

public class L05_Casting {

    public static void main(String[] args) {
        short minValueShort = Short.MIN_VALUE;
        int minValueInt = Integer.MIN_VALUE;
        byte minValByte = Byte.MIN_VALUE, maxValByte = Byte.MAX_VALUE;

        int myTotal = minValueInt / 2 ;
        System.out.println(myTotal);

        //byte newByteValue = minValByte / 2;
        // The above doesn't work because java compiler doesnt evaluate the value, in a
        // variable in a calculation at compile time, hence not knowing whether the result
        // will fit or not, thus raising an error.

        byte newByteValue = (-128 / 2); // However, if we will use a literal, then it
                                        // works just fine...
        System.out.println(newByteValue);

        //Fixing the problem by using the concept of casting
        newByteValue = (byte) (minValByte / 2);
        System.out.println(newByteValue);

        newByteValue = (byte) (10000 / 2);
        System.out.println(newByteValue);
    }

}

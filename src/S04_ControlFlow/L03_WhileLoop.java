package S04_ControlFlow;

public class L03_WhileLoop {
    public static void main(String[] args) {


        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        boolean isReady = false;

        while (isReady){
            System.out.println("While ont run!");
        }

        do {
            System.out.println("I will run at least Once!");
        }while (isReady);

        int k = 5, cntEven = 0, cntOdd = 0;
        while (k <= 20){
            if(isEvennumber(k)){
                System.out.println(k);
                cntEven ++;
            }else {
                cntOdd++;
            }
            if(cntEven == 5) {
                System.out.println("Number of Even : "+ cntEven);
                System.out.println("Number of Odd : "+ cntOdd);
                break;
            }
            k++;
        }

        /*
        * Sum of digits challenge
        * */

        int n = 125;
        int s = 0;
        while (n > 0){
            s += (n % 10);
            n = n / 10;
        }

        System.out.println("Sum of digits of " + n + " is : " + s);

    }

    public static boolean isEvennumber(int number) {
        return number %2 == 0;
    }

}

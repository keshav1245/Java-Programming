package S04_ControlFlow;

public class L02_ForLoop {

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }


        double amt = 10000;
        for (double i = 2; i <= 5; i++){
            System.out.println(amt + " at " + i + "% : $" + calculateInterest(amt, i));
        }

        System.out.println();

        amt = 100;
        for (double i = 7.5; i <= 10; i+=0.25){
            System.out.println(amt + " at " + i + "% : $" + calculateInterest(amt, i));
        }

        System.out.println();

        amt = 100;
        for (double i = 7.5; i <= 10; i+=0.25){
            if(i > 8.5) break;
            System.out.println(amt + " at " + i + "% : $" + calculateInterest(amt, i));
        }


        /*
        * Check if number is prime or not
        * */

        System.out.println("0 is " + ((isPrime(0)) ? "" : "NOT ") + "a prime number!" );
        System.out.println("1 is " + ((isPrime(1)) ? "" : "NOT ") + "a prime number!" );
        System.out.println("2 is " + ((isPrime(2)) ? "" : "NOT ") + "a prime number!" );
        System.out.println("3 is " + ((isPrime(3)) ? "" : "NOT ") + "a prime number!" );
        System.out.println("4 is " + ((isPrime(4)) ? "" : "NOT ") + "a prime number!" );
        System.out.println("5 is " + ((isPrime(5)) ? "" : "NOT ") + "a prime number!" );
        System.out.println("17 is " + ((isPrime(17)) ? "" : "NOT ") + "a prime number!" );
        System.out.println("49 is " + ((isPrime(49)) ? "" : "NOT ") + "a prime number!" );
        System.out.println("51 is " + ((isPrime(51)) ? "" : "NOT ") + "a prime number!" );

        int cnt = 0;

        for (int i = 700; i <= 1000; i+=17) {
            if (isPrime(i)){
                cnt++;
                System.out.println(i);
            }

            if (cnt == 3)
                break;
        }


        cnt = 0;
        int s = 0;
        for (int i = 80; i <= 1000; i+=13){
            if(i % 15 == 0){
                cnt++;
                System.out.println(i);
                s+=i;
            }

            if(cnt == 5)
                break;
        }
        System.out.println("Sum is : " + s);

    }

    public static double calculateInterest(double amt, double rate){

        return (amt * (rate / 100));

    }

    public static boolean isPrime(int number){

        if(number == 0 || number == 1)
            return false;

        for(int d = 2; d < number; d++){
            if(number % d == 0)
                return false;
        }

        return true;
    }

}

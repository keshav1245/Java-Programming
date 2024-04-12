package S05_ObjectOrientedProgramming_Inheritance;

public class L06_InheritanceChallengeMain {
    public static void main(String[] args) {

        L06_Employee kt = new L06_Employee("Keshav Tangri", "21/12/1998", "21/04/2021");
        System.out.println(kt);
        System.out.println("Age = " + kt.getAge());
        System.out.println("Pay = " + kt.collectPay());

        L06_SalariedEmployee kt2 = new L06_SalariedEmployee("Joe", "21/12/2000", "01/08/2023", 35000);
        System.out.println(kt2);
        System.out.println("Joe's paycheck = $" + kt2.collectPay());
        kt2.retire();
        System.out.println("Joe's pension = $" + kt2.collectPay());

        L06_HourlyEmployee susan = new L06_HourlyEmployee("susan", "05/05/1979", "03/03/2022", 15);
        System.out.println(susan);
        System.out.println("Paycheck : $"+susan.collectPay());
        System.out.println("Holiday Paycheck : $"+susan.getDoublePay());

    }
}

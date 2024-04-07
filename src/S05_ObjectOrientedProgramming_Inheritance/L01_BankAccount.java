package S05_ObjectOrientedProgramming_Inheritance;

public class L01_BankAccount {

    private String accountNumber;
    private double accountBalance = 0;
    private String name;
    private String email;
    private String phone;

    public  L01_BankAccount(String accountNumber, double accountBalance, String name, String email, String phone){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void depositAmount(double amount){
        this.accountBalance += amount;
        System.out.println("Money Credited : " + amount + ",\nNew Balance : " + this.accountBalance);
    }

    public void withdrawAmount(double amount){
        if(this.accountBalance - amount >= 0) {
            this.accountBalance -= amount;
            System.out.println("Money Withdrawn : " + amount + ",\nRemaining Balance : " + this.accountBalance);
        }else
            System.out.println("Insufficient Funds!");
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

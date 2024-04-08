package S05_ObjectOrientedProgramming_Inheritance;

public class L01_Customer {

    private String name, email;
    private double creditLimit;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }


    public L01_Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public L01_Customer(String name, String email) {
        this(name, email, 100000);
    }

    public L01_Customer(){
        this("Default Name", "Default Email", 100000);
    }

    @Override
    public String toString() {
        return "L01_Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", creditLimit=" + creditLimit +
                '}';
    }
}

package S05_ObjectOrientedProgramming_Inheritance;

public class L06_HourlyEmployee extends L06_Employee{
    private double hourlyPayRate;

    public L06_HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }
}

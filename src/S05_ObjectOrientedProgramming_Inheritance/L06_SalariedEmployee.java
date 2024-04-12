package S05_ObjectOrientedProgramming_Inheritance;

public class L06_SalariedEmployee extends L06_Employee{

    private double annualSalary;
    private boolean isRetired;

    public L06_SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){
        terminate("12/12/2025");
        this.isRetired = true;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustedPaycheck = isRetired ? paycheck * 0.9 : paycheck;

        return (int) adjustedPaycheck;
    }
}

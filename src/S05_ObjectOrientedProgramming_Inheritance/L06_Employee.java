package S05_ObjectOrientedProgramming_Inheritance;

public class L06_Employee extends  L06_Worker{

    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;

    public L06_Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = L06_Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "L06_Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}

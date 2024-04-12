package S05_ObjectOrientedProgramming_Inheritance;

public class L06_Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public L06_Worker(){}

    public L06_Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int year = 2024;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return year - birthYear;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "L06_Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

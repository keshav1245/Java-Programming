package S05_ObjectOrientedProgramming_Inheritance;

public class L01_STUDENT_POJO {

    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;


    public L01_STUDENT_POJO(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "L01_STUDENT_POJO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}

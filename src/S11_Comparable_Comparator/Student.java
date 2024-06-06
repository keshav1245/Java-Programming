package S11_Comparable_Comparator;

import java.util.Comparator;
import java.util.Random;

class StudentGPAComparator implements Comparator<Student>{
    @Override
    public int compare(Student student, Student t1) {
        return (student.gpa + student.name).compareTo(t1.gpa + t1.name);
    }
}

public class Student implements Comparable<Student>{

    String name;
    private static int LAST_ID = 1000;
    private static Random random = new Random();

    private int id;
    protected double gpa;


    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0,4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)%n".formatted(id, name, gpa);
    }

//    @Override
//    public int compareTo(Object o) {
//        Student other = (Student) o;
//        return name.compareTo(other.name);
//    }

    @Override
    public int compareTo(Student student) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(student.id));
    }
}

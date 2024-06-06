package S10_Generics.GenericExtras.model;

import S10_Generics.GenericExtras.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {

    private String name, course;
    private int yearStarted;
    public static int LAST_ID = 10_000;
    private int studentId;

    protected static Random random = new Random();
    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student(){
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(firstNames.length)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(courses.length)];
        yearStarted = random.nextInt(2018, 2025);
        studentId = LAST_ID++;
    }

    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(studentId, name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName){
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }

    @Override
    public int compareTo(Student student) {
        return Integer.valueOf(studentId).compareTo(Integer.valueOf(student.studentId));
    }
}


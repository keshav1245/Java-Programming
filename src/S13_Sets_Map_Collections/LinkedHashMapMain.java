package S13_Sets_Map_Collections;


import com.sun.source.tree.Tree;

import java.time.LocalDate;
import java.util.*;

public class LinkedHashMapMain {

    private static Map<String, Purchase> purchases = new LinkedHashMap<>();
    private static NavigableMap<String, Student> students = new TreeMap<>();

    public static void main(String[] args) {


        Course jmc = new Course("jmc101", "Java Master Class", "Java");
        Course python = new Course("pyt101", "Python Master Class", "Python");

        addPurchase("Mary Martin", jmc, 129.99);
        addPurchase("Mary Martin", python, 149.99);
        addPurchase("Andy Martin", python, 139.99);
        addPurchase("Joe Jones", jmc, 149.99);
        addPurchase("Bill Brown", python, 119.99);

        purchases.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("----------------------------------");
        students.forEach((key, value) -> System.out.println(key + ": " + value));

        NavigableMap<LocalDate, List<Purchase>> datedPurchases = new TreeMap<>();

        for (Purchase p: purchases.values()){
            datedPurchases.compute(p.purchaseDate(),
                    (pDate, pList) -> {
                        List<Purchase> list =
                                (pList == null) ? new ArrayList<>() : pList;

                        list.add(p);
                        return list;
                    }
                    );
        }

        datedPurchases.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    private static void addPurchase(String name, Course course, double price){
        Student existingStudent = students.get(name);
        if(existingStudent == null){

            existingStudent = new Student(name, course);
            students.put(name, existingStudent);
        }else{
            existingStudent.addCourse(course);
        }

        int day = new Random().nextInt(1,5);
        String key = course.courseId() + "_" + existingStudent.getId();
        int year = LocalDate.now().getYear();
        Purchase purchase = new Purchase(course.courseId(), existingStudent.getId(), price, year, day);

        purchases.put(key, purchase);
    }

}

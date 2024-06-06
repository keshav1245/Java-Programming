package S10_Generics.GenericExtras;

import S10_Generics.GenericExtras.model.LPAStudent;
import S10_Generics.GenericExtras.model.Student;
import S10_Generics.GenericExtras.util.QueryItem;
import S10_Generics.GenericExtras.util.QueryList;

import java.util.ArrayList;
import java.util.List;

record Employee(String name) implements QueryItem{
    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

public class Main {

    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();

        for (int i = 0 ; i < studentCount; i++){
            students.add(new Student());
        }

        printList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();

        for (int i = 0 ; i < studentCount; i++){
            lpaStudents.add(new LPAStudent());
        }

        //When used as reference types, a container of
        //one type has no relationship to the
        //same container of another tpe even if
        //the contained types do have a relationship.

        printList(lpaStudents);


        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches("course", "python");

        printList(matches);

        var student2021 = QueryList.getMatches(students, "YearStarted", "2021");

        printList(student2021);


        //If we only keep empty list, the type cant be inferred and it is taken as the upper bound
        //which is query item. This is something we cant use in our print method, so when type cant
        //be inferred, we can add it before function invocation and it tells that the list
        //which we are expecting from getMatches function will match that specific type
        var stu2021 = QueryList.<Student>getMatches(new ArrayList<>(), "YearStarted", "2021");
        printList(stu2021);


        //new
//        QueryList<Employee> employeeQueryList = new QueryList<Employee>();

    }


//    public static void printList(List<Student> students){
//        for(var student : students){
//            System.out.println(student);
//        }
//        System.out.println();
//    }

    //solution 1 - using raw usage of List
//    public static void printList(List students){
//        for(var student : students){
//            System.out.println(student);
//        }
//        System.out.println();
//    }

    //solution 2 - using generic methods
//    public static <T extends Student> void printList(List<T> students){
//        for(var student : students){
//            System.out.println(student);
//        }
//        System.out.println();
//    }
//
    //solution 3 - Wildcards.
    // ? - can be unbounded, upper bounded by extends and lower bounded by super
    // we can add element to the list inside wildcard function as the compiler throws
    // error because it cant enforce type checking
    public static void printList(List< ? extends Student> students){
        for(var student : students){
            System.out.println(student);
        }
        System.out.println();
    }


    //Type Erasure - In the java byte code, at the runtime, everywhere a type parameter
    //used in a class, it gets replaced with either the type Object, if no upper bound was
    //specified, or the upper bound type itself.


}

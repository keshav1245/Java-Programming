package S08_Lists_ArrayLists_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class L03_LinkedLists {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");

        System.out.println(placesToVisit);



        addMoreElments(placesToVisit);
        System.out.println(placesToVisit);

        printItinerary(placesToVisit);
        System.out.println();
        printItinerary2(placesToVisit);
        System.out.println();
        printItinerary3(placesToVisit);
        System.out.println();
        testIterator(placesToVisit);

//        gettingElements(placesToVisit);
//        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);


    }


    private static void addMoreElments(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");

        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        //Stack Methods
        list.push("Alice Springs");
        list.push("Queensland");
        list.push("Adelaide");
        list.push("Perth");
    }

    private static void removeElements(LinkedList<String> list){

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // Removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // Removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // Removes last element
        System.out.println(s3 + " was removed");

        //Queue Methods
        String p1 = list.poll(); // Removes first element
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst(); // Removes first element
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast(); // Removes Last element
        System.out.println(p3 + " was removed");

        //Stack Methods
        String p4 = list.pop(); // Removes first element
        System.out.println(p4 + " was removed");

    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved Element = " + list.get(4));
        System.out.println("Retrieved First Element = " + list.getFirst());
        System.out.println("Retrieved Last Element = " + list.getLast());

        System.out.println("Darwin is at position : " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position : " + list.lastIndexOf("Melbourne"));

        // Queue retrieval
        System.out.println("Element from element() : " + list.element());
        // Stack retreival methods
        System.out.println("Element from peek() : " + list.peek());
        System.out.println("Element from peekFirst() : " + list.peekFirst());
        System.out.println("Element from peeklast() : " + list.peekLast());
    }


    private static void printItinerary(LinkedList<String> list){
        System.out.println("Trip Starts at : " + list.getFirst());

        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From : " + list.get(i-1) + " to " + list.get(i) );
        }

        System.out.println("Trip Ends at : " + list.getLast());
    }

    private static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip Starts at : " + list.getFirst());
        String prevTown = list.getFirst();

        for(String town : list){
            System.out.println("--> From : " + prevTown + " to " + town );
            prevTown = town;
        }

        System.out.println("Trip Ends at : " + list.getLast());
    }

    private static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip Starts at : " + list.getFirst());
        String prevTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            String town = iterator.next();
            System.out.println("--> From : " + prevTown + " to " + town );
            prevTown = town;
        }

        System.out.println("Trip Ends at : " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){

        var iterator = list.listIterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("Brisbane")){
                iterator.add("Lake Wivenhoe");
            }
        }

        System.out.println();
        System.out.println("Printing in reverse order : ");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

    }




}

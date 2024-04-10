package S08_Lists_ArrayLists_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L02_MoreLists {
    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

//        // This belongs to nested class of immutable collections
//        System.out.println(list.getClass().getName());
//        // that means we cant add any new item
//        list.add("Check");


        // CREATING MUTABLE ARRAY LIST FROM IMMUTABLE LIST
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println(groceries);


        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese")
        );
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item = "+ groceries.get(2));

        if(groceries.contains("mustard"))
            System.out.println("List contains mustard!");

        groceries.add("Yogurt");

        System.out.println("first of yogurt : " + groceries.indexOf("Yogurt"));
        System.out.println("last of yogurt : " + groceries.lastIndexOf("Yogurt"));

        System.out.println(groceries);

        groceries.remove(1);
        System.out.println(groceries);

        groceries.remove("Yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk","mustard", "cheese"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty : " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk","mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        System.out.println("Converting List to array : ");
//        var groceryarray = groceries.toArray();
        String[] groceryarray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryarray));


        // multi d array list
        ArrayList<ArrayList<String>> multiList = new ArrayList<>();
        multiList.add(groceries);
        multiList.add(new ArrayList<>(List.of("Sunday", "Monday", "Tuesday")));
        System.out.println(multiList);


//        Converting array to list

        String[] sample = new String[]{"First", "Second", "Third"};
        var sampleList = Arrays.asList(sample);

        sampleList.set(0, "One");
        /**
         * Even though we are changing details on the list, the original
         * array gets affected as well!
         * So much so, lists from arrays are immutable as well
         */
        System.out.println("List : " + sampleList);
        System.out.println("Original Array : " + Arrays.toString(sample));

        /** This modification of the size of the List is not Allow and will lead to error*/
//        sampleList.add("Sample Check!");
//        System.out.println("List : " + sampleList);
//        System.out.println("Original Array : " + Arrays.toString(sample));

        sampleList.sort(Comparator.reverseOrder());
        System.out.println("After sorting");
        System.out.println("List : " + sampleList);
        System.out.println("Original Array : " + Arrays.toString(sample));

    }

}


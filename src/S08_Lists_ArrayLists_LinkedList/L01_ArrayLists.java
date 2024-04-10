package S08_Lists_ArrayLists_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){

    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    public GroceryItem(String name, String type, int count) {
        this.name = name;
        this.type = type;
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name, type);
    }
}

public class L01_ArrayLists {

    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apple", "Produce", 6);
        groceryArray[2] = new GroceryItem("Oranges", "Produce", 5);

        System.out.println(Arrays.toString(groceryArray));


        //If we donot specify the of arraylist, the raw usage is Object Class.
        //and due to this we can add grocerylist item as well as string item in the
        //array list
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");


        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Yogurt"));
        groceryList.add(new GroceryItem("Oranges", "Produce", 5));
        groceryList.add(0, new GroceryItem("Apple", "Produce", 6));


//        groceryList.remove(1);
        System.out.println(groceryList);



    }

}

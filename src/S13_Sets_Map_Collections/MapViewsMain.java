package S13_Sets_Map_Collections;

import java.util.*;

public class MapViewsMain {
    public static void main(String[] args) {

        Map<String, Contact> contactMap = new HashMap<>();
        ContactData.getData("phone").forEach(c -> contactMap.put(
                c.getName(), c
        ));

        ContactData.getData("email").forEach(c -> contactMap.put(
                c.getName(), c
        ));

        Set<String> keysViews = contactMap.keySet();
        System.out.println(keysViews);

        Set<String> copyOfKeys = new TreeSet<>(contactMap.keySet());
        System.out.println(copyOfKeys);

        if(contactMap.containsKey("Linus Van Pelt")){
            System.out.println("Linus and I go way back, so of course I have info");
        }

        keysViews.remove("Daffy Duck");
        System.out.println(keysViews);
        contactMap.forEach((k,v) -> System.out.println(v));

        copyOfKeys.remove("Linus Van Pelt");
        System.out.println(copyOfKeys);
        contactMap.forEach((k,v) -> System.out.println(v));

        keysViews.retainAll(List.of("Linus Van Pelt", "Charlie Brown", "Robin Hood", "Mickey Mouse"));
        System.out.println(keysViews);
        contactMap.forEach((k,v) -> System.out.println(v));

        keysViews.clear();
        System.out.println(contactMap);

//        contactMap.put("Daffy Ducky", new Contact("Daffy Duck"));
//        System.out.println(keysViews);
//        System.out.println(contactMap);

        ContactData.getData("phone").forEach(c -> contactMap.put(
                c.getName(), c
        ));

        ContactData.getData("email").forEach(c -> contactMap.put(
                c.getName(), c
        ));

        System.out.println(keysViews);


        var values = contactMap.values();
        values.forEach(System.out::println);

        values.retainAll(ContactData.getData("email"));
        System.out.println(keysViews);
        contactMap.forEach((k,v) -> System.out.println(v));

        System.out.println("------------------------------");
        List<Contact> list = new ArrayList<>(values);
        list.sort(Comparator.comparing(Contact::getNameLastFirst));
        list.forEach(c -> System.out.println(c.getNameLastFirst() + ": " + c));

        System.out.println("------------------------------");
        Contact first = list.get(0);
        contactMap.put(first.getNameLastFirst(), first);
        values.forEach(System.out::println);
        keysViews.forEach(System.out::println);


        var nodeSet = contactMap.entrySet();
        for(var node : nodeSet){
            System.out.println(nodeSet.getClass().getName());
            if(!node.getKey().equals(node.getValue().getName())){
                System.out.println("Key Doesnt match the name : " + node.getKey() + ": " + node.getValue());
            }
        }



    }
}

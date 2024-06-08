package S13_Sets_Map_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {


        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.forEach(System.out::println);
        System.out.println("----------------------------");

        Map<String, Contact> contacts = new HashMap<>();

        for (Contact c : fullList){
            contacts.put(c.getName(), c);
        }

        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value="+v));
        System.out.println("----------------------------");

        System.out.println(contacts.get("Charlie Brown"));
        System.out.println(contacts.get("Chuck Brown"));
        System.out.println(contacts.getOrDefault("Chuck Brown", new Contact("Chuck Brown")));

        System.out.println("----------------------------");

        contacts.clear();

        for (Contact c : fullList){
            Contact duplicate = contacts.put(c.getName(), c);

            if(duplicate != null){
//                System.out.println("Duplicate : " + duplicate);
//                System.out.println("Current : " + c);
                contacts.put(c.getName(), c.mergeContactData(duplicate) );
            }

        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value="+v));
        System.out.println("----------------------------");

        contacts.clear();

        for (Contact c : fullList){
            Contact duplicate = contacts.putIfAbsent(c.getName(), c);
            if(duplicate != null){
                contacts.put(c.getName(), c.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value="+v));


        System.out.println("----------------------------");

        contacts.clear();
        fullList.forEach(contact -> contacts.merge(contact.getName(), contact,
                (previous, current) -> {
                    System.out.println("prev: " + previous + " : current " + current);
                    Contact merged = previous.mergeContactData(current);
                    System.out.println("MERGED : " + merged);
                    return merged;
                }));
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value="+v));

        System.out.println("--------------------------");
        for (String contactName : new String[] {"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}){
            contacts.compute(contactName, (k, v) -> new Contact(k) );
        }

        contacts.forEach((k, v) -> System.out.println("Key="+k+", value="+v));

        System.out.println("--------------------------");
        for (String contactName : new String[] {"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}){
            contacts.computeIfAbsent(contactName, k -> new Contact(k) );
        }

        contacts.forEach((k, v) -> System.out.println("Key="+k+", value="+v));

        System.out.println("--------------------------");
        for (String contactName : new String[] {"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}){
            contacts.computeIfPresent(contactName, (k, v) -> {
                v.addEmail("Fun Place");
                return v;
            } );
        }

        contacts.forEach((k, v) -> System.out.println("Key="+k+", value="+v));



//        System.out.println("--------------------------");
//        for (String contactName : new String[] {"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}){
//            contacts.compute(contactName, (k, v) -> new Contact(k) );
//        }
//
//        contacts.forEach((k, v) -> System.out.println("Key="+k+", value="+v));

        System.out.println("--------------------------");

        contacts.replaceAll((k, v) -> {
            String newEmail = k.replaceAll(" ", "") + "@funplace.com";
            v.replaceEmailIfExists("DDuck@funplace.com", newEmail);
            return v;
        });

        contacts.forEach((k, v) -> System.out.println("Key="+k+", value="+v));

        System.out.println("--------------------------");

        Contact daisy = new Contact("Daisy Jane Duck", "daisyj@duck.com");
        Contact replacedContact = contacts.replace("Daisy Duck", daisy);
        System.out.println("Daisy = "+ daisy);
        System.out.println("ReplacedContact = " + replacedContact);
        contacts.forEach((k, v) -> System.out.println("Key="+k+", value="+v));

        System.out.println("--------------------------");

        Contact updatedDaisy = replacedContact.mergeContactData(daisy);
        System.out.println("UpdatedDaisy = " + updatedDaisy);

        boolean success = contacts.replace("Daisy Duck", daisy, updatedDaisy);

        if(success == true){
            System.out.println("Successfully replaced element");
        }else{
            System.out.printf("Did not match on both key: %s and value: %s %n". formatted("Daisy Duck", replacedContact));
        }

        contacts.forEach((k, v) -> System.out.println("Key="+k+", value="+v));


        System.out.println("--------------------------");

        success = contacts.remove("Daisy Duck", daisy);

        if(success == true){
            System.out.println("Successfully removed element");
        }else{
            System.out.printf("Did not match on both key: %s and value: %s %n". formatted("Daisy Duck", daisy));
        }

        contacts.forEach((k, v) -> System.out.println("Key="+k+", value="+v));



    }
}

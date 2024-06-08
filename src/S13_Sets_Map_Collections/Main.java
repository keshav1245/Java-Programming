package S13_Sets_Map_Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");

//        printData("Email list : ",emails);
//        printData("Phone List : ",phones);

        Set<Contact> emailContacts = new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phones);

        printData("Phone Contacts", phoneContacts);
        printData("Email Contacts", emailContacts);

        int index = emails.indexOf(new Contact("Robin Hood"));
        Contact robinHood = emails.get(index);
        robinHood.addEmail("Sherwood Forest");
        robinHood.addEmail("Sherwood Forest");
        robinHood.replaceEmailIfExists("RHood@sherwoodforest.com", "RHood@sherwoodforest.org");
        System.out.println(robinHood);

        Set<Contact> unionAB = new HashSet<>();
        unionAB.addAll(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("UNION OF AB ", unionAB);


        Set<Contact> intersectAB = new HashSet<>(emailContacts);
        intersectAB.retainAll(phoneContacts);
        printData("INTERSECTION OF AB ", intersectAB);

        Set<Contact> AminusB = new HashSet<>(emailContacts);
        AminusB.removeAll(phoneContacts);
        printData("A - B ", AminusB);

        Set<Contact> BminusA = new HashSet<>(phoneContacts);
        BminusA.removeAll(emailContacts);
        printData("B - A ", BminusA);


        Set<Contact> unionMinuses = new HashSet<>();
        unionMinuses.addAll(AminusB);
        unionMinuses.addAll(BminusA);
        printData("UNION OF AB ", unionMinuses);


    }


    public static void printData(String header, Collection<Contact> contacts){
        System.out.println("-----------------------------------");
        System.out.println(header);
        System.out.println("-----------------------------------");
        contacts.forEach(System.out::println);
    }


}

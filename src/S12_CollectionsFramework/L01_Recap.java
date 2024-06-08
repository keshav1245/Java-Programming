package S12_CollectionsFramework;

import java.util.*;

public class L01_Recap {

    public static void main(String[] args) {

        Collection<String> list = new HashSet<>();
        String[] names = {"Ann", "Bob", "Carol", "David", "Edna"};

        list.addAll(Arrays.asList(names));

        System.out.println(list);
        list.addAll(Arrays.asList("Gary", "George", "Grace"));
        System.out.println(list);
        System.out.println("Is Gary in List : " + list.contains("Gary"));

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);
        System.out.println("Is Gary in List : " + list.contains("Gary"));

    }
}

package S12_CollectionsFramework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L03_ObjectEquality {
    public static void main(String[] args) {


        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l", "He", "lo");
        String dText = "He".concat("llo");
        String eText = "hello";

        List<String> hellos = Arrays.asList(aText, bText, cText, dText, eText);
        hellos.forEach(s -> System.out.println(s + " : " + s.hashCode()));

        Set<String> mySet = new HashSet<>(hellos);

        System.out.println("mySet = " + mySet);
        System.out.println("# elements = " + mySet.size());

        for (String s : mySet){
            System.out.print(s + ": ");
            for (int i = 0; i < hellos.size(); i++){
                if(s == hellos.get(i)){
                    System.out.print(i + ", ");
                }
            }
            System.out.println();
        }


        L03_PlayingCard aceHearts = new L03_PlayingCard("Hearts", "Ace");
        L03_PlayingCard kingClubs = new L03_PlayingCard("Clubs", "King");
        L03_PlayingCard queenSpades = new L03_PlayingCard("Spades", "Queen");

        List<L03_PlayingCard> cards = Arrays.asList(aceHearts, kingClubs, queenSpades);
        cards.forEach(c -> System.out.println(c + ": " + c.hashCode() ));

        Set<L03_PlayingCard> deck = new HashSet<>();
        for(L03_PlayingCard card : cards){
            if(!deck.add(card)){
                System.out.println("Found a duplicate for " + card);
            }
        }

        System.out.println(deck);

    }
}

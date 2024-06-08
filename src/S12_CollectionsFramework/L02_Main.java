package S12_CollectionsFramework;

import java.util.*;

public class L02_Main {
    public static void main(String[] args) {

        List<L02_Card> deck = L02_Card.getStandardDeck();
        L02_Card.printDeck(deck);

        L02_Card[] cardArray = new L02_Card[13];
        L02_Card aceOfHearts = L02_Card.getFaceCard(L02_Card.Suit.HEART, 'A');

        Arrays.fill(cardArray, aceOfHearts);
        L02_Card.printDeck(Arrays.asList(cardArray), "Ace of Hearts", 1);

        List<L02_Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("Cards Size : " + cards.size());

        List<L02_Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        L02_Card.printDeck(acesOfHearts, "Ace of Hearts", 1);

        L02_Card kingOfClubs = L02_Card.getFaceCard(L02_Card.Suit.CLUB, 'K');
        List<L02_Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        L02_Card.printDeck(kingsOfClubs, "Kings of Clubs", 1);

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        L02_Card.printDeck(cards, "Aces of Hearts", 2);

        Collections.copy(cards, kingsOfClubs);
        L02_Card.printDeck(cards, null, 2);

        //unmodifiable
        cards = List.copyOf(kingsOfClubs);
        L02_Card.printDeck(cards, null, 1);


        List<L02_Card> standardDeck = L02_Card.getStandardDeck();
        L02_Card.printDeck(standardDeck);

        Collections.shuffle(standardDeck);
        L02_Card.printDeck(standardDeck, "Shuffled Deck", 4);

        Collections.reverse(standardDeck);
        L02_Card.printDeck(standardDeck, "Reversed Shuffled Deck", 4);

        var sortingAlgo = Comparator.comparing(L02_Card::rank)
                .thenComparing(L02_Card::suit);
        Collections.sort(standardDeck, sortingAlgo);
        L02_Card.printDeck(standardDeck, "Sorted Rank > Suit Deck", 13);
        Collections.reverse(standardDeck);
        L02_Card.printDeck(standardDeck, "Reversed Sorted Deck", 13);


        List<L02_Card> kings = new ArrayList<>(standardDeck.subList(4,8));
        L02_Card.printDeck(kings, "Kings", 1);
        List<L02_Card> tens = new ArrayList<>(standardDeck.subList(16,20));
        L02_Card.printDeck(tens, "Tens", 1);

//        Collections.shuffle(standardDeck);
        int sublistIndex = Collections.indexOfSubList(standardDeck, tens);
        System.out.println("Sublist index for tens = " + sublistIndex);
        System.out.println("Contains = " + standardDeck.containsAll(tens));

        boolean disjoints = Collections.disjoint(standardDeck, tens);
        System.out.println("is Disjoint ? " + disjoints);

        disjoints = Collections.disjoint(kings, tens);
        System.out.println("is Disjoint ? " + disjoints);

        L02_Card tenOfHearts = L02_Card.getNumericCard(L02_Card.Suit.HEART, 10);
        //The list should be sorted in the way of the sorting comparator algorithm
        //Since the algo here sorts in ascending order but in the above lines of code,
        //we reversed the order, then this binarysearch wont work.
        standardDeck.sort(sortingAlgo);
        int foundIndex = Collections.binarySearch(standardDeck, tenOfHearts, sortingAlgo);
        System.out.println("Found Index : " + foundIndex);
        System.out.println("Found Index : " + standardDeck.indexOf(tenOfHearts));
        System.out.println(standardDeck.get(foundIndex));

        L02_Card tenOfClubs = L02_Card.getNumericCard(L02_Card.Suit.CLUB, 10);

        Collections.replaceAll(standardDeck, tenOfClubs, tenOfHearts);
        L02_Card.printDeck(standardDeck.subList(32, 36), "Tens", 1);

        Collections.replaceAll(standardDeck, tenOfHearts, tenOfClubs);
        L02_Card.printDeck(standardDeck.subList(32, 36), "Tens", 1);

        System.out.println("Tens of clubs cards = "+
                Collections.frequency(standardDeck, tenOfClubs));

        System.out.println("Best Card = " + Collections.max(standardDeck, sortingAlgo));
        System.out.println("Worst Card = " + Collections.min(standardDeck, sortingAlgo));

        List<L02_Card> copied = new ArrayList<>(standardDeck.subList(0, 13));
        Collections.rotate(copied, 2);
        System.out.println("Un Rotated : " + standardDeck.subList(0, 13));
        System.out.println("Rotated : " + 2 + " : " + copied);

        copied = new ArrayList<>(standardDeck.subList(0, 13));
        Collections.rotate(copied, -2);
        System.out.println("Un Rotated : " + standardDeck.subList(0, 13));
        System.out.println("Rotated : " + (-2) + " : " + copied);

        copied = new ArrayList<>(standardDeck.subList(0, 13));
        for(int i = 0; i < copied.size() / 2; i++){

            Collections.swap(copied, i, copied.size() - 1 - i);

        }

        System.out.println("Manual Reverse : " + copied);
        copied = new ArrayList<>(standardDeck.subList(0, 13));
        Collections.reverse(copied);
        System.out.println("Using Reverse : " + copied);

    }
}

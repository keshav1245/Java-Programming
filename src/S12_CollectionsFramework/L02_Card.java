package S12_CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public record L02_Card(Suit suit, String face, int rank) {

    public enum Suit {
        CLUB, DIAMOND, HEART, SPADE;

        public char getImage(){
            return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];
        }
    }

    @Override
    public String toString() {
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0, index);

        return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);

    }

    public static L02_Card getNumericCard(Suit suit, int cardNumber){
        if(cardNumber > 1 && cardNumber < 11){
            return new L02_Card(suit, String.valueOf(cardNumber), cardNumber-2);
        }

        System.out.println("Invalid Numeric Card Selected");
        return null;
    }

    public static L02_Card getFaceCard (Suit suit, char abrev){
        int charIndex = "JQKA".indexOf(abrev);
        if(charIndex > -1){
            return new L02_Card(suit, ""+abrev, charIndex+9);
        }
        System.out.println("Invalid Face Card Passes");
        return null;
    }

    public static List<L02_Card> getStandardDeck(){
        List<L02_Card> deck = new ArrayList<>(52);

        for(Suit suit: Suit.values()){

            for (int i = 2; i< 11;i++){
                deck.add(getNumericCard(suit, i));
            }


            for (char c : "JQKA".toCharArray()){
                deck.add(getFaceCard(suit, c));
            }

        }

        return deck;
    }


    public static void printDeck(List<L02_Card> deck){
        printDeck(deck, null, 4);
    }


    public static void printDeck(List<L02_Card> deck, String description, int rows ){
        System.out.println("-------------------------------------");
        if(description != null){
            System.out.println(description);
        }

        int cardsInRow = deck.size() / rows;

        for (int i = 0; i< rows; i++){
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }

    }

}

package S12_CollectionsFramework;

public class L03_PlayingCard {
    private String suit;
    private String face;
    private int internalHash;

    public L03_PlayingCard(String suit, String face){
        this.suit = suit;
        this.face = face;
        this.internalHash = (suit.equals("Hearts")) ? 11 : 12;
    }

    @Override
    public String toString() {
        return face+  " of " + suit;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        L03_PlayingCard card = (L03_PlayingCard) o;
        return suit.equals(card.suit) && face.equals(card.face);
    }

    @Override
    public int hashCode() {
        int result = suit.hashCode();
        result = 31 * result + face.hashCode();
        return result;
    }
}

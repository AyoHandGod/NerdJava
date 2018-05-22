package Lessons;

public class Card {

    private static final int KING = 13;
    private static final int QUEEN = 12;
    private static final int JACK = 11;
    private static final int ACE = 1;
    /**
     * Possible CardSuits
     */
    public enum CardSuits { SPADES, HEARTS, DIAMONDS, CLUBS, JOKER };

    private final CardSuits suit;
    private final int value;

    Card(){
        suit = CardSuits.JOKER;
        value = 1;
    }

    Card(CardSuits suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args){
        Card spaceAce = new Card(CardSuits.SPADES, JACK);
        System.out.println(spaceAce.getValueAsString(spaceAce));
    }

    public String getValueAsString(Card card) {
        if (suit == CardSuits.JOKER)
            return "" + value;
        else {
            switch (card.value) {
                case 1:
                    return "Ace";
                case 2:
                    return "2";
                case 3:
                    return "3";
                case 4:
                    return "4";
                case 5:
                    return "5";
                case 6:
                    return "6";
                case 7:
                    return "7";
                case 8:
                    return "8";
                case 9:
                    return "9";
                case 10:
                    return "10";
                case 11:
                    return "Jack";
                case 12:
                    return "Queen";
                default:
                    return "King";
            }
        }
    }
}

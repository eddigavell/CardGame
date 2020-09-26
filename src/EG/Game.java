package EG;
import java.util.Arrays;
class Game {
    private static Card[] cardsHearts;
    private static Card[] cardsSpades;
    private static Card[] cardsDiamonds;
    private static Card[] cardsClubs;


    Game() {
        //Creates a deck of card. 14 of each suite.

        cardsHearts = new Card[14];
        cardsSpades = new Card[14];
        cardsDiamonds = new Card[14];
        cardsClubs = new Card[14];

        for (int i = 0; i < cardsHearts.length; i++) {
            cardsHearts[i] = new Card("1", "Hearts", "" + (i+1));
        }

        for (int i = 0; i < cardsSpades.length; i++) {
            cardsSpades[i] = new Card("1", "Spades", "" + (i+1));
        }

        for (int i = 0; i < cardsDiamonds.length; i++) {
            cardsDiamonds[i] = new Card("1", "Diamonds", "" + (i+1));
        }
        for (int i = 0; i < cardsClubs.length; i++) {
            cardsClubs[i] = new Card("1", "Clubs", "" + (i+1));
        }
    }

    public static void main(String[] args) {
        new Game();

        System.out.println("Hearts kort 2: " + cardsHearts[2].getName());

        System.out.println("Spades kort 11: " + cardsHearts[10].getName());
        System.out.println("Ruter kort 9: " + cardsDiamonds[8].getName());
    }
}

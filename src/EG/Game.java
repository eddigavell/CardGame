package EG;
import java.util.Scanner;
import java.util.Random;

class Game {
    private Hearts[] cardsHearts;
    private Spades[] cardsSpades;
    private Diamonds[] cardsDiamonds;
    private Clubs[] cardsClubs;
    private Memory[] playedCards;
    Random rand = new Random();

    Game(String numberOfDecks) {
        playedCards = new Memory[14];
        initiateNewDeck(numberOfDecks);
        newHand();
    }

    /*
    Array placements for the cards.
        Array[0] = 2
        Array[1] = 3
        Array[2] = 4
        Array[3] = 5
        Array[4] = 6
        Array[5] = 7
        Array[6] = 8
        Array[7] = 9
        Array[8] = 10
        Array[9] = Jack
        Array[10] = Queen
        Array[11] = King
        Array[12] = Ace
        Array[13] = Joker
     */

    void newHand() {
        newCardsOnTheTable();
        newPlayerCards();
        newComputerCards();
    }

    boolean checkPlayedCards(int suite, int value) {
        boolean x;
        if (suite == 0) {
            x = cardsHearts[value].checkIfCardIsPlayed();
        } else if (suite == 1) {
            x = cardsSpades[value].checkIfCardIsPlayed();
        } else if (suite ==2) {
            x = cardsClubs[value].checkIfCardIsPlayed();
        } else {
            x = cardsDiamonds[value].checkIfCardIsPlayed();
        }
        return x;
    }

    void newCardsOnTheTable() {
        //Three on the table.
        int aSuite = randomNumberSuite();
        int aValue = randomNumberValue();
        String aCard = "" + aSuite + " " + aValue;

        int bSuite = randomNumberSuite();
        int bValue = randomNumberValue();
        String bCard = "" + bSuite + " " + bValue;

        int cSuite = randomNumberSuite();
        int cValue = randomNumberValue();
        String cCard = "" + cSuite + " " + cValue;

            if () {

            } else if (!bCard.equals(cCard) && !aCard.equals(bCard) && !aCard.equals(cCard)) {
                System.out.println();
                System.out.println("On the table: ");
                playedCards[0] = new Memory(""+aSuite, ""+aValue);
                dealCard(aSuite, aValue);
                playedCards[1] = new Memory(""+bSuite, ""+bValue);
                dealCard(bSuite,bValue);
                playedCards[2] = new Memory(""+cSuite, ""+cValue);
                dealCard(cSuite,cValue);
            }  else {
                newCardsOnTheTable();
            }
    }

    void newPlayerCards() {
        //Two cards to the player.
        int aSuite = randomNumberSuite();
        int aValue = randomNumberValue();
        String aCard = "" + aSuite + " " + aValue;

        int bSuite = randomNumberSuite();
        int bValue = randomNumberValue();
        String bCard = "" + bSuite + " " + bValue;

        if (!aCard.equals(bCard)) {
            System.out.println();
            System.out.println("Player hand: ");
            playedCards[3] = new Memory(""+aSuite, ""+aValue);
            dealCard(aSuite, aValue);
            playedCards[4] = new Memory(""+aSuite, ""+aValue);
            dealCard(bSuite,bValue);
        }  else {
            newPlayerCards();
        }
    }

    void newComputerCards() {
        //Two cards to the player.
        int aSuite = randomNumberSuite();
        int aValue = randomNumberValue();
        String aCard = "" + aSuite + " " + aValue;

        int bSuite = randomNumberSuite();
        int bValue = randomNumberValue();
        String bCard = "" + bSuite + " " + bValue;

        if (!aCard.equals(bCard)) {
            System.out.println();
            System.out.println("Opponents hand: ");
            playedCards[5] = new Memory(""+aSuite, ""+aValue);
            dealCard(aSuite, aValue);
            playedCards[6] = new Memory(""+aSuite, ""+aValue);
            dealCard(bSuite,bValue);
        }  else {
            newComputerCards();
        }
    }

    int randomNumberSuite() {
        int cardSuite = rand.nextInt(3);
        return cardSuite;
    }

    int randomNumberValue() {
        int cardValue = rand.nextInt(12);
        return cardValue;
    }

    void dealCard(int suite, int value) {
        if (suite == 0) {
            cardsHearts[value].printCard();
            cardsHearts[value].removeCardFromDeck();
        } else if (suite == 1) {
            cardsSpades[value].printCard();
            cardsSpades[value].removeCardFromDeck();
        } else if (suite ==2) {
            cardsClubs[value].printCard();
            cardsClubs[value].removeCardFromDeck();
        } else {
            cardsDiamonds[value].printCard();
            cardsDiamonds[value].removeCardFromDeck();
        }
    }

    void initiateNewDeck(String deckNumber) {
        //Creates a deck of card. 14 of each suite.
        cardsHearts = new Hearts[14];
        cardsSpades = new Spades[14];
        cardsDiamonds = new Diamonds[14];
        cardsClubs = new Clubs[14];

        //Sets value on every spot in the Arrays
        for (int i = cardsHearts.length-1; i >= 0; i--) {
            if (i==9) {
                cardsHearts[i] = new Hearts(deckNumber, "Hearts", "Jack");
                cardsSpades[i] = new Spades(deckNumber, "Spades", "Jack");
                cardsDiamonds[i] = new Diamonds(deckNumber, "Diamonds", "Jack");
                cardsClubs[i] = new Clubs(deckNumber, "Clubs", "Jack");
            } else if (i == 10) {
                cardsHearts[i] = new Hearts(deckNumber, "Hearts", "Queen");
                cardsSpades[i] = new Spades(deckNumber, "Spades", "Queen");
                cardsDiamonds[i] = new Diamonds(deckNumber, "Diamonds", "Queen");
                cardsClubs[i] = new Clubs(deckNumber, "Clubs", "Queen");
            } else if (i == 11) {
                cardsHearts[i] = new Hearts(deckNumber, "Hearts", "King");
                cardsSpades[i] = new Spades(deckNumber, "Spades", "King");
                cardsDiamonds[i] = new Diamonds(deckNumber, "Diamonds", "King");
                cardsClubs[i] = new Clubs(deckNumber, "Clubs", "King");
            } else if (i == 12) {
                cardsHearts[i] = new Hearts(deckNumber, "Hearts", "Ace");
                cardsSpades[i] = new Spades(deckNumber, "Spades", "Ace");
                cardsDiamonds[i] = new Diamonds(deckNumber, "Diamonds", "Ace");
                cardsClubs[i] = new Clubs(deckNumber, "Clubs", "Ace");
            } else if (i == 13) {
                cardsHearts[i] = new Hearts(deckNumber, "Hearts", "Joker");
                cardsSpades[i] = new Spades(deckNumber, "Spades", "Joker");
                cardsDiamonds[i] = new Diamonds(deckNumber, "Diamonds", "Joker");
                cardsClubs[i] = new Clubs(deckNumber, "Clubs", "Joker");
            } else {
                cardsHearts[i] = new Hearts(deckNumber, "Hearts", "" + (i+2));
                cardsSpades[i] = new Spades(deckNumber, "Spades", "" + (i+2));
                cardsDiamonds[i] = new Diamonds(deckNumber, "Diamonds", "" + (i+2));
                cardsClubs[i] = new Clubs(deckNumber, "Clubs", "" + (i+2));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cardgame: Texas Holdem");
        System.out.println();
        System.out.print("How many decks do you want to play with?: ");
        String howManyDecks = scan.nextLine();

        new Game(howManyDecks);

        System.out.println();
        System.out.println("You have choosen to play texas holdem with: " + howManyDecks + " decks of cards. Lets start.");

    }
}

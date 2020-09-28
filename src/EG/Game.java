package EG;
import java.util.Scanner;
import java.util.Random;

class Game {
    private Hearts[] cardsHearts;
    private Spades[] cardsSpades;
    private Diamonds[] cardsDiamonds;
    private Clubs[] cardsClubs;
    private Memory[] playedCards;
    private int howManyCardsHaveBeenPlayed=0;
    Random rand = new Random();

    Game() {
        initiateNewDeck();

        drawNewRound();
        printCardsPlayedFromDeck();

        shuffleDeck();

        drawNewRound();
        printCardsPlayedFromDeck();
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
    /*
    String cardSuite = "random";
        String cardValue = "random";

        //Check what suite and place the right suite in the string
        if (suite == 0) {
            cardSuite = "Hearts";
            cardsHearts[value].setCardIsAlreadyPlayed();
        } else if (suite == 1) {
            cardSuite = "Spades";
            cardsSpades[value].setCardIsAlreadyPlayed();
        }else if (suite == 2) {
            cardSuite = "Clubs";
            cardsClubs[value].setCardIsAlreadyPlayed();
        } else if (suite == 3) {
            cardSuite = "Diamonds";
            cardsDiamonds[value].setCardIsAlreadyPlayed();
        }

        //Check what value and assign correct value to the string.
        if (value == 0) {
            cardValue = "2";
        } else if (value == 1) {
            cardValue = "3";
        } else if (value == 2) {
            cardValue = "4";
        } else if (value == 3) {
            cardValue = "5";
        } else if (value == 4) {
            cardValue = "6";
        } else if (value == 5) {
            cardValue = "7";
        } else if (value == 6) {
            cardValue = "8";
        } else if (value == 7) {
            cardValue = "9";
        } else if (value == 8) {
            cardValue = "10";
        } else if (value == 9) {
            cardValue = "Jack";
        } else if (value == 10) {
            cardValue = "Queen";
        } else if (value == 11) {
            cardValue = "King";
        } else if (value == 12) {
            cardValue = "Ace";
        }
     */

    int randomSuite() {
        return rand.nextInt(3);
    }
    int randomValueOfCard() {
        return rand.nextInt(12);
    }
    void randomNewCard(int randomSuite, int randomValue) {
        checkIfCardIsAlreadyPlayed(randomSuite, randomValue);
    }
    void randomNewCard() {
        randomNewCard(randomSuite(), randomValueOfCard());
    }
    void checkIfCardIsAlreadyPlayed(int suite, int value) {
        if (suite == 0) {
            if (cardsHearts[value].getIfCardIsAlreadyPlayed()) {
                randomNewCard();
            } else {
                playCard(suite, value);
            }
        } else if (suite == 1) {
            if (cardsSpades[value].getIfCardIsAlreadyPlayed()) {
                randomNewCard();
            } else {
                playCard(suite, value);
            }
        } else if (suite == 2) {
            if (cardsClubs[value].getIfCardIsAlreadyPlayed()) {
                randomNewCard();
            } else {
                playCard(suite, value);
            }
        } else if (suite == 3) {
            if (cardsDiamonds[value].getIfCardIsAlreadyPlayed()) {
                randomNewCard();
            } else {
                playCard(suite, value);
            }
        }
    }
    void playCard(int suite, int value) {
        String cardSuite = "random";
        String cardValue = "random";
        if (suite == 0) {
            System.out.println(cardsHearts[value].getSuiteAndValueOfCard());
            cardsHearts[value].setCardIsAlreadyPlayed();
            cardSuite = cardsHearts[value].getSuite();
            cardValue = cardsHearts[value].getValueOfCard();
        } else if (suite == 1) {
            System.out.println(cardsSpades[value].getSuiteAndValueOfCard());
            cardsSpades[value].setCardIsAlreadyPlayed();
            cardSuite = cardsSpades[value].getSuite();
            cardValue = cardsSpades[value].getValueOfCard();
        } else if (suite == 2) {
            System.out.println(cardsClubs[value].getSuiteAndValueOfCard());
            cardsClubs[value].setCardIsAlreadyPlayed();
            cardSuite = cardsClubs[value].getSuite();
            cardValue = cardsClubs[value].getValueOfCard();
        } else if (suite == 3) {
            System.out.println(cardsDiamonds[value].getSuiteAndValueOfCard());
            cardsDiamonds[value].setCardIsAlreadyPlayed();
            cardSuite = cardsDiamonds[value].getSuite();
            cardValue = cardsDiamonds[value].getValueOfCard();
        }
        playedCards[howManyCardsHaveBeenPlayed] = new Memory(cardSuite, cardValue);
        howManyCardsHaveBeenPlayed = howManyCardsHaveBeenPlayed + 1;
    }
    void shuffleDeck() {
        howManyCardsHaveBeenPlayed = 0;
        //Sets value on every spot in the Arrays
        for (int i = cardsHearts.length-1; i >= 0; i--) {
            if (i == 9) {
                cardsHearts[i].resetCard("Hearts", "Jack");
                cardsSpades[i].resetCard("Spades", "Jack");
                cardsClubs[i].resetCard("Clubs", "Jack");
                cardsDiamonds[i].resetCard("Diamonds", "Jack");
            } else if (i == 10) {
                cardsHearts[i].resetCard("Hearts", "Queen");
                cardsSpades[i].resetCard("Spades", "Queen");
                cardsClubs[i].resetCard("Clubs", "Queen");
                cardsDiamonds[i].resetCard("Diamonds", "Queen");
            } else if (i == 11) {
                cardsHearts[i].resetCard("Hearts", "King");
                cardsSpades[i].resetCard("Spades", "King");
                cardsClubs[i].resetCard("Clubs", "King");
                cardsDiamonds[i].resetCard("Diamonds", "King");
            } else if (i == 12) {
                cardsHearts[i].resetCard("Hearts", "Ace");
                cardsSpades[i].resetCard("Spades", "Ace");
                cardsClubs[i].resetCard("Clubs", "Ace");
                cardsDiamonds[i].resetCard("Diamonds", "Ace");
            } else if (i == 13) {
                cardsHearts[i].resetCard("Hearts", "Joker");
                cardsSpades[i].resetCard("Spades", "Joker");
                cardsClubs[i].resetCard("Clubs", "Joker");
                cardsDiamonds[i].resetCard("Diamonds", "Joker");
            } else {
                cardsHearts[i].resetCard("Hearts", "" + (i+2));
                cardsSpades[i].resetCard("Spades", "" + (i+2));
                cardsClubs[i].resetCard("Clubs", "" + (i+2));
                cardsDiamonds[i].resetCard("Diamonds", "" + (i+2));
            }
        }
    }
    void initiateNewDeck() {
        //Creates a deck of card. 14 of each suite.
        cardsHearts = new Hearts[14];
        cardsSpades = new Spades[14];
        cardsDiamonds = new Diamonds[14];
        cardsClubs = new Clubs[14];
        playedCards = new Memory[14];

        //Sets value on every spot in the Arrays
        for (int i = cardsHearts.length-1; i >= 0; i--) {
            if (i == 9) {
                cardsHearts[i] = new Hearts("Hearts", "Jack");
                cardsSpades[i] = new Spades("Spades", "Jack");
                cardsDiamonds[i] = new Diamonds("Diamonds", "Jack");
                cardsClubs[i] = new Clubs("Clubs", "Jack");
            } else if (i == 10) {
                cardsHearts[i] = new Hearts("Hearts", "Queen");
                cardsSpades[i] = new Spades( "Spades", "Queen");
                cardsDiamonds[i] = new Diamonds( "Diamonds", "Queen");
                cardsClubs[i] = new Clubs("Clubs", "Queen");
            } else if (i == 11) {
                cardsHearts[i] = new Hearts("Hearts", "King");
                cardsSpades[i] = new Spades("Spades", "King");
                cardsDiamonds[i] = new Diamonds("Diamonds", "King");
                cardsClubs[i] = new Clubs("Clubs", "King");
            } else if (i == 12) {
                cardsHearts[i] = new Hearts("Hearts", "Ace");
                cardsSpades[i] = new Spades( "Spades", "Ace");
                cardsDiamonds[i] = new Diamonds("Diamonds", "Ace");
                cardsClubs[i] = new Clubs("Clubs", "Ace");
            } else if (i == 13) {
                cardsHearts[i] = new Hearts("Hearts", "Joker");
                cardsSpades[i] = new Spades("Spades", "Joker");
                cardsDiamonds[i] = new Diamonds("Diamonds", "Joker");
                cardsClubs[i] = new Clubs("Clubs", "Joker");
            } else {
                cardsHearts[i] = new Hearts( "Hearts", "" + (i+2));
                cardsSpades[i] = new Spades("Spades", "" + (i+2));
                cardsDiamonds[i] = new Diamonds("Diamonds", "" + (i+2));
                cardsClubs[i] = new Clubs("Clubs", "" + (i+2));
            }
        }
    }
    void drawNewRound() {
        System.out.println("On the table: ");
        //Three for the playing board
        randomNewCard();
        randomNewCard();
        randomNewCard();
        System.out.println();

        System.out.println("Two cards to the player");
        //Two to player
        randomNewCard();
        randomNewCard();
        System.out.println();

        System.out.println("Two cards to the computer");
        //Two to the computer
        randomNewCard();
        randomNewCard();
        System.out.println();

        System.out.println("One card to the trash");
        // one for the discard
        randomNewCard();
        System.out.println();

        System.out.println("One card to the playingboard");
        //another card to the playing board
        randomNewCard();

        System.out.println("One card to the trash");
        // one for the discard
        randomNewCard();
        System.out.println();

        System.out.println("One card to the playingboard");
        //another card to the playing board
        randomNewCard();
        System.out.println();
        System.out.println("------------------round over.--------------");
        System.out.println();
    }
    void printCardsPlayedFromDeck() {
        for (int i=0; i<=10; i++) {
            System.out.println(playedCards[i].getSuiteAndValueOfCard());
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cardgame: Texas Holdem");
        System.out.println();
        System.out.println();

        new Game();
    }
}

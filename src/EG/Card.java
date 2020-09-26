package EG;

class Card {
    String deckNumber;
    String suite;
    String rankOfCard;

    Card(String deckNumber, String suite, String rankOfCard) {
        this.deckNumber = deckNumber;
        this.suite = suite;
        this.rankOfCard = rankOfCard;
    }

    String getName() {
        return rankOfCard;
    }
}

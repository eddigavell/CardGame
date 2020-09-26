package EG;

class Card {
    private String deckNumber;
    private String suite;
    private String rankOfCard;

    Card(String deckNumber, String suite, String rankOfCard) {
        this.deckNumber = deckNumber;
        this.suite = suite;
        this.rankOfCard = rankOfCard;
    }

    String getName() {
        return this.rankOfCard;
    }

    String getSuite(){
        return this.suite;
    }

    String getRankOfCard() {
        return this.rankOfCard;
    }
}

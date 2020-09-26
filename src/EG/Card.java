package EG;

abstract class  Card {
    private String deckNumber;
    private String suite;
    private String rankOfCard;

    Card(String deckNumber, String suite, String rankOfCard) {
        this.deckNumber = deckNumber;
        this.suite = suite;
        this.rankOfCard = rankOfCard;
    }

    protected String getDeckNumber() {
        return this.deckNumber;
    }

    protected String getSuite(){
        return this.suite;
    }

    protected String getRankOfCard() {
        return this.rankOfCard;
    }

    protected void printCard() {
        System.out.println(getSuite() + " " + getRankOfCard());
    }

    void removeCardFromDeck() {
        this.suite = null;
        this.rankOfCard = null;
    }
}

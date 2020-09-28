package EG;

abstract class  Card {
    private String suite;
    private String valueOfCard;
    private boolean cardIsAlreadyPlayed;

    Card(String suite, String valueOfCard) {
        this.suite = suite;
        this.valueOfCard = valueOfCard;
        this.cardIsAlreadyPlayed = false;
    }

    protected boolean getIfCardIsAlreadyPlayed() {
        return this.cardIsAlreadyPlayed;
    }

    protected String getSuite(){
        return this.suite;
    }

    protected String getValueOfCard() {
        return this.valueOfCard;
    }

    protected String getSuiteAndValueOfCard() {
        return getSuite() + " " + getValueOfCard();
    }

    protected void setCardIsAlreadyPlayed() {
        this.cardIsAlreadyPlayed = true;
    }

    protected void resetCard(String suite, String valueOfCard) {
        this.suite = suite;
        this.valueOfCard = valueOfCard;
        this.cardIsAlreadyPlayed = false;
    }
}

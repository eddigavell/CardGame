package EG;

public class Memory extends Card{
    Memory(String deckNumber, String suite, String rankOfCard) {
        super(deckNumber, suite, rankOfCard);
    }

    Memory(String suite, String rankOfCard) {
        super("", suite, rankOfCard);
    }
}

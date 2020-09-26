package EG;
import java.util.Arrays;
public class Game {
    private Card[] sCard;

    private Game() {
        sCard = new Card[14];

        for (int i = 0; i < sCard.length; i++) {
            sCard[i] = new Card("1", "Hearts", "" + (i+1));
        }

       for (int i = 0; i < sCard.length; i++){
            System.out.println(sCard[i].getName());
        }
    }

    public static void main(String[] args) {
        new Game();
    }
}

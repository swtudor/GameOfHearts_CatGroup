import java.util.Random;

public class Deck {
    private Card[] deck;
    
    private int cardsUsed;
    
    public void shuffle() {
        for (int i = deck.length-1; i > 0; i--) {
            int rand = (int) (Math.random()*(i+1));
        }
    }
    
}

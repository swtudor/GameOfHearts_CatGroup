import java.util.*;

public class Deck {
    boolean initialized;
    ArrayList<Card> allCards = new ArrayList<Card>();
    
    Deck() {
        initialized = true;
        Deck();
        shuffleDeck();
    }
    
    
    void shuffleDeck() {
        long seed = System.nanoTime();
        Collections.shuffle(allCards, new Random(seed));
    }
}

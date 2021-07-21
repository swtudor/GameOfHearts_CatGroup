import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    boolean initialized;
    ArrayList<Card> allCards = new ArrayList<Card>();

    Deck() {
        initialized = true;
        new Deck();
        shuffleDeck();
    }


    void shuffleDeck() {
        long seed = System.nanoTime();
        Collections.shuffle(allCards, new Random(seed));
    }
}


package Hearts;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    private final Deck testDeck = new Deck();
    
    @Test
    void size() {
        assertEquals(52, testDeck.getDeck().size());
    }
    
    void populateDeck() {
        Card queenAce = new Card("A", Card.Suit.HEARTS);
        Card twoSpade = new Card("2", Card.Suit.SPADES);
        Card threeDiamond = new Card("3", Card.Suit.DIAMONDS);
        Card kingClub = new Card("K", Card.Suit.CLUBS);
    
        assertTrue(testDeck.getDeck().contains(queenAce));
        assertTrue(testDeck.getDeck().contains(twoSpade));
        assertTrue(testDeck.getDeck().contains(threeDiamond));
        assertTrue(testDeck.getDeck().contains(kingClub));
    }
    @Test
    void testShuffleDeck() {
    }
}
package Hearts;

import org.junit.jupiter.api.Test;

class CardTest {
    
    @Test
    void testEquals() {
    }
    
    @Test
    void faceValueSuit() {
        Card queenAce = new Card("A", Card.Suit.HEARTS);
        Card twoSpade = new Card("2", Card.Suit.SPADES);
        Card threeDiamond = new Card("3", Card.Suit.DIAMONDS);
        Card kingClub = new Card("K", Card.Suit.CLUBS);
        
    }
    
}
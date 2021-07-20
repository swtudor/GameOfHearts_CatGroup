package Hearts;

import java.util.*;

public class Deck {
    ArrayList<Card> deck = new ArrayList<Card>();
    private String faceValue;
    
    // Create 52 unqiue cards with 13 of each suit + value
    // <-- add to deck list
    //
    public ArrayList<Card> buildsDeck() {
        //For every suit in the Card.Suit
        ArrayList<Card> tempDeck = new ArrayList<>();
        for (Card.Suit currentSuit : Card.Suit.values()) {
            for (int i = 13; i > 0; i--) {
              
                Card newCard = new Card(faceValue, currentSuit);
                tempDeck.add(newCard);
                switch (i) {
                    case 1:
                        System.out.println("2");
                    case 2:
                        System.out.println("3");
                    case 3:
                        System.out.println("4");
                    case 4:
                        System.out.println("5");
                    case 5:
                        System.out.println("6");
                    case 6:
                        System.out.println("7");
                    case 7:
                        System.out.println("8");
                    case 8:
                        System.out.println("9");
                    case 9:
                        System.out.println("10");
                    case 10:
                        System.out.println("J");
                    case 11:
                        System.out.println("Q");
                    case 12:
                        System.out.println("K");
                    case 13:
                        System.out.println("A");
                    break;
                }
                //Determine face value
                //Create a new card
                //Add a new card
                //(i = facevalue)
            }
            //Create 13 Unique Card Objects
            //add to temp deck
            }
        return tempDeck;
    }
    
    
    //Double check to be sure its 52 otherwise do it again
    boolean checkDeck() {
        if (deck.size() == 52) return true;
        return false;
    }
    
    //Shuffle deck
    void shuffleDeck() {
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
    }
}

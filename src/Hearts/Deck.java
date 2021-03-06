package Hearts;

import java.util.*;

public class Deck {
    //creates a private deck that uses buildsDeck which is down below ------>
    private ArrayList<Card> deck = buildsDeck();
    
    //Shuffle deck
    public void shuffleDeck() {
        Collections.shuffle(deck, new Random());
    }
    
    //This is for the public for other classes to use the deck
    public ArrayList<Card> getDeck() {
        return deck;
    }
    
    // Create 52 unique cards with 13 of each suit + value
    // <-- add to deck list
    public ArrayList<Card> buildsDeck() {
        //For every suit in the Card.Suit
        
        ArrayList<Card> tempDeck = new ArrayList<>();
        
        //outer loop for that holds the suit
        for (Card.Suit currentSuit : Card.Suit.values()) {
            for (int i = 13; i > 0; i--) { //the inner loop that runs through 13 and assigns a different value
                String faceValue = switch (i) {
                    case 1 -> "2";
                    case 2 -> "3";
                    case 3 -> "4";
                    case 4 -> "5";
                    case 5 -> "6";
                    case 6 -> "7";
                    case 7 -> "8";
                    case 8 -> "9";
                    case 9 -> "10";
                    case 10 -> "J";
                    case 11 -> "Q";
                    case 12 -> "K";
                    case 13 -> "A";
                    default -> "";
                };
                Card newCard = new Card(faceValue, currentSuit);
                tempDeck.add(newCard);
                //Determine face value
                //Create a new card
                //Add a new card
                //(i = faceValue)
            }
            //Create 13 Unique Card Objects
            // add to temp deck
        }
        return tempDeck;
    }
    //hand each player 13 cards
    // each player hand has to be different
    // return 4 list of 13 cards
    public ArrayList<List<Card>> dealingahand(){
        List<Card> arrlist2 = deck.subList(0,13);
        List<Card> arrlist3 = deck.subList(13,26);
        List<Card> arrlist4 = deck.subList(26,39);
        List<Card> arrlist5 = deck.subList(39,52);
        ArrayList<List<Card>> spades = new ArrayList<>();
        spades.add(arrlist2);
        spades.add(arrlist3);
        spades.add(arrlist4);
        spades.add(arrlist5);
        return spades;
    }
}

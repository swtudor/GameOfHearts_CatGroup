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
                String faceValue = "";
                        switch (i) {
                    case 1:
                        faceValue ="2";
                        break;
                    case 2:
                        faceValue ="3";
                        break;
                    case 3:
                        faceValue="4";
                        break;
                    case 4:
                        faceValue ="5";
                        break;
                    case 5:
                        faceValue ="6";
                        break;
                    case 6:
                        faceValue ="7";
                        break;
                    case 7:
                        faceValue ="8";
                        break;
                    case 8:
                        faceValue="9";
                        break;
                    case 9:
                        faceValue ="10";
                        break;
                    case 10:
                        faceValue ="J";
                        break;
                    case 11:
                        faceValue ="Q";
                        break;
                    case 12:
                        faceValue ="K";
                        break;
                    case 13:
                        faceValue ="A";
                        break;
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
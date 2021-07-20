package Hearts;

import java.util.ArrayList;

import java.util.Collections;



public class Player{
    String name;
    int points;
    
    
    ArrayList<Card> hand = new ArrayList<Card>();
    private String playerName = "Here ";
    
    
    Player(String id) {
        name = id;
        points = 0;
    }
    
    
    public String playerStand() {
        return playerName;
    }
    
    // Draw cards from the deck
    void addToHand(Card newCard) {
        hand.add(newCard);
    }
    
    // Sorts the hand by suit
    void sortHand() {
        Collections.shuffle(hand);
    }
    
    // Clear the cards in the hand (just to make sure the game is initialized properly)
    void clearHand() {
        hand.clear();
    }
    
    // Return the name of the player
    String getName() {
        return name;
    }
    
    // Add points to player
    void addPoints(int pnts) {
        points += pnts;
    }
    
    // Return the amount of points player has
    int getPoints() {
        return points;
    }
    
    // use this class to keep track of suit ranges
    // [startIndex, endIndex) or startIndex = -1 if no suit
    class SuitRange {
        int startIndex;
        int endIndex;
        
        SuitRange() {
            startIndex = -1;
            endIndex = -1;
        }
        
        // Returns how many cards of that suit exist
        int getRange() {
            return endIndex - startIndex;
        }
    }
}

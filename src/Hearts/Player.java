package Hearts;

import java.util.ArrayList;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

    public class Player {
        String name;
        List<Card> hand;
        public Player(String name) {
            this.name = name;
        }
        
        public List<Card> getHand() {
            return hand;
        }
        
        public void setHand(List<Card> hand) {
            this.hand = hand;
        }
        
    int points;
    
    // Sorts the hand by suit and faceValue
    void sortHand() {
        Collections.shuffle(hand);
    }
    
    // Add points to player
    void addPoints(int pnts) {
        points += pnts;
    }
    
    // Return the amount of points player has
    int getPoints() {
        return points;
    }
    
    // sets-CurrentCard played
//   //return card
//  //(return the declaration)
////

// return null;
//  }
    
    void collectTricks() {
        List<String> list = new ArrayList<String>();
        list.add("Spade");
        list.add("Heart");
        list.add("Diamond");
        list.add("Club");
        }
    
        
// takes in a list of 4 cards
        // adds to list
        //loop thru tricks list
        //add 1 pt for each heart/13 for Q
//   return null;
    
    //use windows+period to pull up the emoji app
    //currentHandDealt
    //currentCardPlayed
    //name
    //score if greater than statment: maybe and if else statement and a loop to determine which is higher
    //isTurn:determine who turn it is
    //tricks: walks away with the tricks? maybe do the same
    // thing as score. use sout:("player:" + numbers + "you have won this trick ")
    //list: use list for cards, scoring and
//   return the player who won suit:("player"+number+ you won the game of hearts ;
    //import cards class


// Object playCard(){

//  removes card from hand(card must be removed from the list)
    
    // use this to keep track of suit ranges
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
//



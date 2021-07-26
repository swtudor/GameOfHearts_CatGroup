package Hearts;

import java.util.ArrayList;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Player {
    
    String name;
    int points;
    //trying this but not sure
    ArrayList<Card> hand = new ArrayList<Card>();
    
    Player(String PlayerName) {
        name = PlayerName;
        points = 0;
    }
    
    static public void playerStand() {
        //player One
        System.out.println("player one:");
        System.out.println("Here are your cards ");
        System.out.println("what card would you like to play? ");
        // display the cards the random cards they have been given and what they can choose
        Scanner playerOne = new Scanner(System.in);
        String[] handPlayerOne = new String[13]; // Stores Card
        for (int i = 0; i < 13; i++) {
            handPlayerOne[i] = playerOne.nextLine();
        }
        String cardsPlayer = playerOne.nextLine();
        
        System.out.println("You have chosen:" + playerOne + cardsPlayer);
        //add if statment or forloop : if player one plays a card its player two's turn.
        System.out.println("player Two:");
        System.out.println("Here are your cards ");
        System.out.println("what card would you like to play? ");
//        Card.Suit.Diamonds.equals(Card.Suit.Diamonds );
        // display the cards the random cards they have been given and what they can choose
        
        Scanner cardsPlayerTwo = new Scanner(System.in);
        String[] handPlayerTwo = new String[13]; // Store the cards
        for (int i = 0; i < 13; i++) {
            handPlayerTwo[i] = playerOne.nextLine();
        }
        System.out.println("You have chosen:" + handPlayerTwo + cardsPlayer);
        String cardsPlayerWho = cardsPlayerTwo.nextLine();
        System.out.println("You have chosen:" + cardsPlayerWho + "Player 2");
        
        // keep player three in a loop as well to move on to player three
        
        System.out.println("player Three:");
        System.out.println("Here are your cards ");
        System.out.println("what card would you like to play? ");
        //Playerone 3(Hand)
        String[] handPlayerThree = new String[13]; // Store the cards
        for (int i = 0; i < 13; i++) {
            handPlayerThree[i] = playerOne.nextLine();
        }
        System.out.println("You have chosen:" + handPlayerThree + cardsPlayer);
        // display the cards the random cards they have been given and what they can choose
        
        Scanner cardsPlayerThree = new Scanner(System.in);
        String cardsPlayerNow = cardsPlayerThree.nextLine();
        System.out.println("You have chosen:" + cardsPlayerNow);
        
        System.out.println("Player Four:");
        System.out.println("Here are your cards ");
        System.out.println("what card would you like to play? ");
        
        Scanner cardsPlayerFour = new Scanner(System.in);
        String[] handPlayerFour = new String[13];  // Stores Card
        for (int i = 0; i < 13; i++) {
            handPlayerFour[i] = playerOne.nextLine();
        }
        System.out.println("You have chosen:" + handPlayerFour + cardsPlayer);
        String cardsPlayerStart = cardsPlayerFour.nextLine();
        System.out.println("You have chosen:" + cardsPlayerStart);
        //Playerone 4(Hand)
    }
    
    public ArrayList<Card> getDeck() {
        return getDeck();
    }
    
    // Draw cards from the deck
    void addToHand(Card newCard) {
        hand.add(newCard);
    }
    //possible of a way but not sure
    
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
        for (String Club : list) {
        
        }
// takes in a list of 4 cards
        // adds to list
        //loop thru tricks list
        //add 1 pt for each heart/13 for Q
//   return null;
    }
    
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



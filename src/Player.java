
import java.util.Scanner;

class Player {
    static public void greetPlayers() {
        System.out.println("player 1 ");
        System.out.println("what is your name?");
        Scanner player = new Scanner(System.in);
        String playerOne = player.nextLine();
        System.out.println("nice to meet you " + playerOne);
        //player 2
        System.out.println("Player 2 ");
        System.out.println("what is your name?");
        Scanner playerWho = new Scanner(System.in);
        String playerTwo = playerWho.nextLine();
        System.out.println("nice to meet you " + playerTwo);
        //player 3
        System.out.println("Player 3");
        System.out.println("what is your name?");
        Scanner playerNow = new Scanner(System.in);
        String playerThree = playerNow.nextLine();
        System.out.println("nice to meet you " + playerThree);
        //player 4
        System.out.println("Player 4");
        System.out.println("what is your name?");
        Scanner playerHere = new Scanner(System.in);
        String playerFour = playerHere.nextLine();
        System.out.println("nice to meet you " + playerFour);

        //  return system for scanner system to remember name and user it
        System.out.println("Ready players?");
        System.out.println("Lets play !");
    }


    static public void playerStand() {
        //player One
        System.out.println("player one:");
        System.out.println("Here are your cards ");
        System.out.println("what card would you like to play? ");
        // display the cards the random cards they have been given and what they can choose

        Scanner cardsPlayerOne = new Scanner(System.in);
        String cardsPlayer = cardsPlayerOne.nextLine();
        System.out.println("You have chosen:" + cardsPlayer);
        //add if statment or forloop : if player one plays a card its player two's turn.
        System.out.println("player Two:");
        System.out.println("Here are your cards ");
        System.out.println("what card would you like to play? ");
//        Card.Suit.Diamonds.equals(Card.Suit.Diamonds );
        // display the cards the random cards they have been given and what they can choose

        Scanner cardsPlayertwo = new Scanner(System.in);
        String cardsPlayerWho = cardsPlayertwo.nextLine();
        System.out.println("You have chosen:" + cardsPlayerWho + "Player 2");
        // keep player three in a loop as well to move on to player three
        System.out.println("player Three:");
        System.out.println("Here are your cards ");
        System.out.println("what card would you like to play? ");
        // display the cards the random cards they have been given and what they can choose

        Scanner cardsPlayerThree = new Scanner(System.in);
        String cardsPlayerNow = cardsPlayerThree.nextLine();
        System.out.println("You have chosen:" + cardsPlayerNow);

        System.out.println("Player Five:");
        System.out.println("Here are your cards ");
        System.out.println("what card would you like to play? ");

        Scanner cardsPlayerFour = new Scanner(System.in);
        String cardsPlayerStart = cardsPlayerFour.nextLine();
        System.out.println("You have chosen:" + cardsPlayerStart);





        //use windows+period to pull up the emoji app 
        //currentHandDealt
        //currentCardPlayed
        //name
        //score if greater than statment: maybe and if else statement and a loop to determine which is higher
        //isTurn:determine who turn it is
        //tricks: walks away with the tricks? maybe do the same
        // thing as score. use sout:("player:" + numbers + "you have won this trick ")
        //list: use list for cards, scoring and
//   return the player who won sout:("player"+number+ you won the game of hearts ;
        //import cards class

    }


//     Object playCard(){

//  removes card from hand(card must be removed from the list)

// sets-CurrentCard played
//   //return card
//  //(return the declaration)
////
// return null;
//  }
// collectTricks(){
// takes in a list of 4 cards
    // adds to list
    //loop thru tricks list
    //add 1 pt for each heart/13 for Q
//   return null;
//  }
//


}







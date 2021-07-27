package Hearts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static List<Player> players;
    static Deck clubs = new Deck();
    static  ArrayList<List<Card>> lunch;

    //Main room add the roots
    //  scanner System
    public static void main(String[] args) {
        clubs.shuffleDeck();
        clubs.getDeck().forEach(x -> System.out.println(x.value + x.suit.toString()));
        lunch = clubs.dealingahand();
        System.out.println("Hello and Welcome to the game of Hearts!😊");
        // The information below is supposed to be in the player class figure
        // that out after you have written the information in code
        players = greetPlayers();
        playerStand();
//         see if we can use this to find the card in the suit within the player file and
//  and bring it all and connect it from the deck and cards file "Card.Suit.Diamonds
//        Player player = new Player();
//        player.playerName = scan.nextLine();
//        Player player = new Player();
//        System.out.println(player.playerStand());

        System.out.println("Thank you for playing the game of hearts!");
        System.out.println("Come again next time! 😉");
    }

    static public List<Player> greetPlayers() {
        List<Player> players = new ArrayList<>();
        System.out.println("player 1 ");
        System.out.println("what is your name?");
        String playerOne = scan.nextLine();
        Player hearts = new Player(playerOne);
        players.add(hearts);
        System.out.println("nice to meet you " + playerOne);
        //player 2
        System.out.println("Player 2 ");
        System.out.println("what is your name?");
        String playerTwo = scan.nextLine();
        hearts = new Player(playerTwo);
        players.add(hearts);
        System.out.println("nice to meet you " + playerTwo);
        //player 3
        System.out.println("Player 3");
        System.out.println("what is your name?");
        String playerThree = scan.nextLine();
        hearts = new Player(playerThree);
        players.add(hearts);
        System.out.println("nice to meet you " + playerThree);
        //player 4
        System.out.println("Player 4");
        System.out.println("what is your name?");
        String playerFour = scan.nextLine();
        hearts = new Player(playerFour);
        players.add(hearts);
        System.out.println("nice to meet you " + playerFour);

        //  return system for scanner system to remember name and user it
        System.out.println("Ready players?");
        System.out.println("Lets play !");


        return players;
    }

    static public void playerStand() {
        //player One
        System.out.println("player one:");
        System.out.println("Here are your cards ");
        players.get(0).setHand(lunch.get(0));
        System.out.println("what card would you like to play? ");
        // display the cards the random cards they have been given and what they can choose
        System.out.println("Here are your cards ");

        Scanner cardsPlayerOne = new Scanner(System.in);
        String cardsPlayer = cardsPlayerOne.nextLine();
        System.out.println("You have chosen:" + cardsPlayer);
        //add if statement or for loop : if player one plays a card its player two's turn.
        System.out.println("player Two:");
        System.out.println("Here are your cards ");
        players.get(1).setHand(lunch.get(1));
        System.out.println("what card would you like to play? ");
//        Card.Suit.Diamonds.equals(Card.Suit.Diamonds );
        // display the cards the random cards they have been given and what they can choose

        Scanner cardsPlayertwo = new Scanner(System.in);
        String cardsPlayerWho = cardsPlayertwo.nextLine();
        System.out.println("You have chosen:" + cardsPlayerWho + "Player 2");
        // keep player three in a loop as well to move on to player three
        System.out.println("player one:");
        System.out.println("player Three:");
        System.out.println("Here are your cards ");
        players.get(2).setHand(lunch.get(2));
        System.out.println("what card would you like to play? ");
        // display the cards the random cards they have been given and what they can choose
        Scanner cardsPlayerThree = new Scanner(System.in);
        String cardsPlayerNow = cardsPlayerThree.nextLine();
        System.out.println("You have chosen:" + cardsPlayerNow);

        System.out.println("Player Four:");
        System.out.println("Here are your cards ");
        players.get(3).setHand(lunch.get(3));
        System.out.println("what card would you like to play? ");

        Scanner cardsPlayerFour = new Scanner(System.in);
        String cardsPlayerStart = cardsPlayerFour.nextLine();
        System.out.println("You have chosen:" + cardsPlayerStart);


        //use windows+period to pull up the emoji app
        //currentHandDealt
        //currentCardPlayed
        //name

    }

}
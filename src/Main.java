import java.util.Scanner;

public class Main {

    //Main room add the roots
    //  scanner System
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many players do you have?");
        String playerString = scan.nextLine();
        int players = Integer.parseInt(playerString);
        if (players < 4) {
            //  insert exit code
            System.out.println("Sorry you must Have at 4 players to play this game \n");
//            System.exit(0);
        } else {
            System.out.println("Hello and Welcome to the game of Hearts!");
            // The information below is supposed to be in the player class figure
            // that out after you have written the information in code
//
//            System.out.println("player 1 ");
//            System.out.println("what is your name?");
//  Scanner player = new Scanner(System.in);
//  String playerOne = player.nextLine();
//            System.out.println("nice to meet you " + playerOne);
//  //player 2
//            System.out.println("Player 2 ");
//            System.out.println("what is your name?");
//  Scanner playerWho = new Scanner(System.in);
//  String playerTwo = playerWho.nextLine();
//            System.out.println("nice to meet you " + playerTwo);
//  //player 3
//            System.out.println("Player 3");
//            System.out.println("what is your name?");
//  Scanner playerNow = new Scanner(System.in);
//  String playerThree = playerNow.nextLine();
//            System.out.println("nice to meet you " + playerThree);
//  //player 4
//            System.out.println("Player 4");
//            System.out.println("what is your name?");
//  Scanner playerHere = new Scanner(System.in);
//  String playerFour = playerHere.nextLine();
//            System.out.println("nice to meet you " + playerFour);
//            System.out.println("Ready players?");
//            System.out.println("Lets play !");
            Player.greetPlayers();
        }

//        Player player = new Player();
//        player.playerName = scan.nextLine();
//        Player player = new Player();
//        System.out.println(player.playerStand());


    }
}
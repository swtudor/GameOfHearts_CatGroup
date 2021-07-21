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
            System.out.println("Hello and Welcome to the game of Hearts!😊");
            // The information below is supposed to be in the player class figure
            // that out after you have written the information in code
            Player.greetPlayers();
            Player.playerStand();
//         see if we can use this to find the card in the suit within the player file and
//  and bring it all and connect it from the deck and cards file "Card.Suit.Diamonds"
        }

//        Player player = new Player();
//        player.playerName = scan.nextLine();
//        Player player = new Player();
//        System.out.println(player.playerStand());

        System.out.println("Thank you for playing the game of hearts!");
        System.out.println("Come again next time! 😉");
    }
}
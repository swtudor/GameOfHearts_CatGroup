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
        }
        Players.greetPlayers();
    }
}
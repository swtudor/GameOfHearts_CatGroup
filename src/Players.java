import java.util.Scanner;

public class Players {
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
}

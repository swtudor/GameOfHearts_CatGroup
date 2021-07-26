package Hearts;
import java.util.*;

class Board {
    
    //will work with Player Class scores just to display & work with win condition
    String name;
    int points;
    
    // Return the name of the player
    String getName() {
        return name;
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
    
    //For winCondition down there (public winCondition())
    Board b = new Board();
    
    public Board() {
        
        //Playerone Scores
        //Show who's turn it is
        
    }
    
    Boolean playerTurn = true;
    
    //Win Condition if 50 see who has the lowest and that's the Winner!
    public void Board(String winner) {
        do {
            winner = "";
        }
        while (points < 50);
        {
            playerTurn = true;
        }
        if (points > 50) ;
        {
            playerTurn = false;
            return;
        }
    
        //For win condition if one player hits 50 begin the count (for now the game will run like that)
        //Winner Message to either PlayerOne as 1,2,3 or 4 (Lowest Score)
        //String winner = "Congrats " + PlayerOne;
    
        public static class Main<column> {
            public static void main(String[] args) {
                System.out.println("Welcome to Heart's Hearts.Card game!");
                System.out.println("You and 3 other players try to trick each other (Hearts!) !");
            
            }
        
            public void greetPlayers() {
                System.out.println("player1 1 ");
                System.out.println("what is your name?");
                Scanner player1 = new Scanner(System.in);
                String playerOne = player1.nextLine();
                System.out.println("nice to meet you " + playerOne);
                //player1 2
                System.out.println("Player 2 ");
                System.out.println("what is your name?");
                Scanner player2 = new Scanner(System.in);
                String playerTwo = player2.nextLine();
                System.out.println("nice to meet you " + playerTwo);
                //player1 3
                System.out.println("Player 3");
                System.out.println("what is your name?");
                Scanner player3 = new Scanner(System.in);
                String playerThree = player3.nextLine();
                System.out.println("nice to meet you " + playerThree);
                //player1 4
                System.out.println("Player 4");
                System.out.println("what is your name?");
                Scanner player4 = new Scanner(System.in);
                String playerFour = player4.nextLine();
                System.out.println("nice to meet you " + playerFour);
            
                //  return system for scanner system to remember name and user it
                System.out.println("Ready players?");
                System.out.println("Lets play Hearts!");
            }
            char turn = '1' ;
	        System.out.print("Red player enter number 0 - 6 =>");
	        Scanner input = new Scanner(System.in);
             Card  = input.nextLine();
            boolean result = placeDisk(board, Card, turn);
            printBoard(board);
    
            turn = '2' ;
	        System.out.print("Yellow player enter number 0 - 6 =>");
            column = input.nextInt();
            result = placeDisk(board, column, turn);
            printBoard(board);
            
            char turn = '3' ;
	        System.out.print("Red player enter number 0 - 6 =>");
            column = input.nextInt();
            boolean result = placeDisk(board, column, turn);
            printBoard(board);
    
            turn = '4' ;
	        System.out.print("player 4 enter number 0 - 6 =>");
            column = input.nextInt();
            result = placeDisk(board, column, turn);
            printBoard(board);
    
    
    
        }
    }
}

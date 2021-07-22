package Hearts;

import java.util.*;

class Board {
    //will work with Player Class scores just to display & work with win condition
    int PlayerScore = 0;
    int smallestScore = PlayerScore;
    
    //For Board down there (public Board())
    Board b = new Board();
    
    //For win condition if one player hits 50 begin the count (for now the game will run like that)
    int Winner;
    //Winner Message to either Player 1,2,3 or 4 (Lowest Score)
    //String winner = "Congrats " + Player;
    
    public Board(String winner) {
        Winner = smallestScore;
    }
    
    public Board() {
        Card[] cards;
        
        Deck deck;
        
        //Player 1 (Hand)
        // Player 2(Hand)
        //Player 3(Hand)
        //Player 4(Hand)
        //Player Scores
        //Show who's turn it is
        
    }
    
    //Win Condition if 50 see who has the lowest and that's the Winner!
    public Object checkWinStatus() {
        if (PlayerScore == 50) {
            smallestScore = PlayerScore;
        }
        return Winner;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Heart's Hearts.Card game!");
        System.out.println("This game requires a bit more thinking.");
        System.out.println("You and 3 other players try to trick each other!");
    }
    
}

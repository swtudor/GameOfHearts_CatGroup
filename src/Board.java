import java.util.*;

public class Board {
    int Score = DisplayPlayerScore(0, 0, 0, 0);
    Board b = new Board();
    
    public int DisplayPlayerScore(int Score1, int Score2, int Score3, int Score4) {
        System.out.println("Player 1" + (Score1));
        System.out.println("Player 2" + (Score2));
        System.out.println("Player 3" + (Score3));
        System.out.println("Player 4" + (Score4));
        return Score;
    }
   String Winner = "Congrats!";
    public int checkWinStatus() {
        if (Score == 50) {
        
        }
        return Winner + DisplayPlayerScore();
    }
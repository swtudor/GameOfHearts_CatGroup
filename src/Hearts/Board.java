package Hearts;

import java.util.ArrayList;

public class Board {
    
    //will work with Player Class scores just to display & work with win condition
    int points;
    ArrayList<Player> playerOrder;
    
    // use this class to keep track of suit ranges
    // [startIndex, endIndex) or startIndex = -1 if no suit
    class SuitRange {
        int startIndex;
        int endIndex;
    
        SuitRange() {
            startIndex = -1;
            endIndex = -1;
        }
    
        //For winCondition down there (public winCondition())
        Hearts.Board b = new Hearts.Board();
    
        public void printWinner() {
            int smallestScore = playerOrder.get(0).getPoints();
            int index = 0;
            for (int i = 0; i < playerOrder.size(); i++) {
                if (smallestScore > playerOrder.get(i).getPoints()) {
                    index = i;
                    smallestScore = playerOrder.get(i).getPoints();
                }
            }
        }
    }
}
    
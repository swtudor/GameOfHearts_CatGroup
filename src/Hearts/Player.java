package Hearts;

import java.util.List;
import java.util.Scanner;

public class Player {
    String name;
    List<Card> hand;
    public Player(String name) {
        this.name = name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }
}
import java.util.*;

public class Main {
    static String turn = "Player One";
    int score = 0;
    String winner = null;
    Scanner input = new Scanner(System.in);
   
   if(turn("Player One"))
    
    {
        turn = "Player Two";
    }else(turn.equals("Player Two"))
    
    {
        turn = "Player Three";
    }else(turn.equals("Player Three")
    
    {
        turn = "Player Four";
    }
    
   while(winner ==null)
    
    {
        int numInput;
        
        try {
            numInput = input.nextInt();
            if(!(numInput>0 && numInput <= 12)) {
                System.out.println("That's not a valid number please try again. ");
                continue;
            }
            catch (InputMismatchException e) {
                System.out.println("That's not a valid number please try again. ");
                contiune;
            }
        }
    }

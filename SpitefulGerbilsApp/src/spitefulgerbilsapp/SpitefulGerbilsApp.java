package spitefulgerbilsapp;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Scanner;
import static user.accounts.TitleScreen.signIn;
import static user.accounts.TitleScreen.signUp;
/**
 *
 * @author XWP921
 */
public class SpitefulGerbilsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
            DiceRoller dice = new DiceRoller();
    
    
            //dice.roll3d6Dice(3,6);
            dice.roll5d6Dice(5,6);
            //dice.roll3d6Dice(3,6);
            //dice.roll5d6Dice(5,6);
            HeightWeight yuh = new HeightWeight();
            yuh.run();
            
            
        TitleScreen test1 = new TitleScreen(); //Jacobs shit
        
        //test1.menuSelection();
        //test1.createAccount();

    
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to sign up for user account, 2 to log in ");
        int decision = scanner.nextInt();
        if (decision == 1) 
        {
            signUp();
        } 
        else if (decision == 2) 
        {
            signIn();
        }
    }
    
}

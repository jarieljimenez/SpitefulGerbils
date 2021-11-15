package spitefulgerbilsapp;

/**
 *
 * @author Bryce A.
 */
import java.util.Random;
import java.util.Scanner;
public class DiceRoller
{   
    private int diceRoll;
    
    public static int roll1d3Dice(int number, int nSides)
    {
        int result = 0;
        int num = 0;
        int roll = 0;
        Random  r = new Random(); 
        if(nSides >=1) 
        { 
            for(int i = 0;i > 1 || i < number; i++)
            { 
                roll = r.nextInt(nSides)+1;
                System.out.println("Roll is:  "+roll);
                result = num + roll; 
            } 
        } 
        else
        { 
            System.out.println("Error num needs to be from 3"); 
        } 
        return result; 
    }
    public static int roll3d6Dice(int number, int nSides)
    { 
        int num = 0;
        int roll = 0;
        Random  r = new Random(); 
        if(number >=3) 
        { 
            for(int i = 0;i > 3 || i < number; i++)
            { 
                roll = r.nextInt(nSides)+1;
                System.out.println("Roll is:  " + roll);
                num = num + roll; 
                if(roll > num)
                {
                    num = roll;
                }
                else 
                {
                roll = num;
                }
            }  
        } 
        else
        { 
            System.out.println("Error num needs to be from 3"); 
        } 
        
        return num;  
    } 
    
     public static int roll5d6Dice(int number, int nSides)
        { 
        int num = 0;
        int roll = 0;
        Random  r = new Random(); 
        if(number >= 5) 
        { 
            for(int i = 0; i > 5 || i < number; i++)
            { 
                roll = r.nextInt(nSides)+1;
                System.out.println("Roll is:  " + roll);
                num = num + roll; 
            } 
        } 
        else
        { 
            System.out.println("Error num needs to be from 5"); 
        } 
        
        return num;  
    }        
             
    public static int rollExtra5d6Dice(int number,int nSides)
     {
        int result = 0;
        int sum = 0;
        int num = 0;
        int roll = 0;
        result = roll1d3Dice(1,3);
        Random  r = new Random(); 
        if(nSides >=5) 
        { 
            for(int i = 0;i > 5 || i < number; i++)
            { 
                roll = r.nextInt(nSides)+1;
                System.out.println("Roll is:  "+ roll);
                sum = num + roll; 
            } 
        } 
        else
        { 
            System.out.println("Error num needs to be from 5"); 
        } 
        System.out.println("\n");
        return sum; 
    }
    
    public void chooseDice()
    {
        Scanner chooseDice = new Scanner(System.in);
        System.out.println("Choose which dice to roll: " + "1: 3d6, " + "2: 5d6, " + "3: 5d6 + 1d3 Dice Roll");
        diceRoll = chooseDice.nextInt();
        
        if(diceRoll == 1)
        {
            roll3d6Dice(3,6);
            
        }
        else if(diceRoll == 2)
        {
            roll5d6Dice(5,6);
        }
        else if(diceRoll == 3)
        {
            rollExtra5d6Dice(5,6);
        }
    }
}
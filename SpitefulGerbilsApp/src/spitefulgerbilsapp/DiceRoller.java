package spitefulgerbilsapp;

/**
 *
 * @author Bryce A.
 */
import java.util.Random;
public class DiceRoller
{
    
    public static int roll1d3Dice(int number, int nSides)
    {
        int num = 0;
        int roll = 0;
        Random  r = new Random(); 
        if(nSides >=3) 
        { 
            for(int i = 0; i < number; i++)
            { 
                roll = r.nextInt(nSides)+1;
                System.out.println("Roll is:  "+roll);
                num = num + roll; 
            } 
        } 
        else
        { 
            System.out.println("Error num needs to be from 3"); 
        } 
        return num; 
    }
    public static int roll3d6Dice(int number, int nSides)
    { 
        int num = 0;
        int roll = 0;
        Random  r = new Random(); 
        if(nSides >=3) 
        { 
            for(int i = 0; i < number; i++)
            { 
                roll = r.nextInt(nSides)+1;
                System.out.println("Roll is:  " + roll);
                num = num + roll; 
            }  
        } 
        else
        { 
            System.out.println("Error num needs to be from 3"); 
        } 
        System.out.print("Total is: " + roll3d6Dice(number, nSides)+ "\n");
        return num;  
    } 
    
     public static int roll5d6Dice(int number, int nSides)
         { 
        int num = 0;
        int roll = 0;
        Random  r = new Random(); 
        if(nSides >=5) 
        { 
            for(int i = 0; i < number; i++)
            { 
                roll = r.nextInt(nSides)+1;
                System.out.println("Roll is:  "+roll);
                num = num + roll; 
            } 
        } 
        else
        { 
            System.out.println("Error num needs to be from 5"); 
        } 
        System.out.println("Total is: "+roll5d6Dice(number,nSides) + "\n");
        return num;  
    }        
             
    public static int rollExtra5d6Dice(int number,int nSides)
     {
        int sum = 0;
        int num = 0;
        int roll = 0;
        Random  r = new Random(); 
        if(nSides >=3) 
        { 
            for(int i = 0; i < number; i++)
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
        System.out.println("Total is: "+ sum + roll1d3Dice(1,3));
        return sum; 
     }
}
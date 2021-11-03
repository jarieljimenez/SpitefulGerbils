/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spitefulgerbilsapp;

/**
 *
 * @author jacob
 */
import java.util.Scanner;

public class TitleScreen 
{
    Scanner in = new Scanner(System.in);
    private int selection;
    
    public int menuSelection()
    {
        System.out.println("To sign in to an account - press 1 then Enter");
        System.out.println("To create a new account  - press 2 then Enter");
        int selection = in.nextInt();
        if(selection == 1 || selection == 2)
        {
        System.out.println(selection);
        }
        else
        {
        System.out.println("INVALID ANSWER - Please Enter 1 or 2");
        menuSelection();
        }
        if(selection == 1)
        {
            
        }
        
        return selection;
    }
    
}

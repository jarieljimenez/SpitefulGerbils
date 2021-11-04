/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spitefulgerbilsapp;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ojayl
 */
public class AgeSet {
    int num1;
    int max;
    int min;
    String mf;
    public void Genderset(){
    Scanner input = new Scanner(System.in);
    mf = input.next();
        
    if (mf == "male"){
        System.out.print(mf);
  
        }
    else if(mf == "female"){
        System.out.println(mf);
    
    
        }
    else {
        System.out.println("Incorrect entry");
        
        }
    
    
    Random randAge = new Random();
    
    num1 = randAge.nextInt((max - min) + 1) + min;
    System.out.println(num1);

    }
}

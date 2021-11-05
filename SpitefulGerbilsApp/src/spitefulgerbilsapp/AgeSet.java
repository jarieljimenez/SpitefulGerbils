
package spitefulgerbilsapp;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ojayl
 */
public class AgeSet {
    int age;
    int max;
    int min;
    String race;
    public void ageGenerate(){
    Scanner input = new Scanner(System.in);
    System.out.println("Please input the race");
    race = input.next();
        
    if ("Human".equals(race)){
        System.out.println(race);
        min = 15;
        max = 30;
        }
    else if("Elf".equals(race)){
        System.out.println(race);
        min = 80;
        max = 180;
    
        }
    else if("Dwarf".equals(race)){
        System.out.println(race);
        min = 40;
        max = 70;
    
        }
    else if("Gnome".equals(race)){
        System.out.println(race);
        min = 30;
        max = 60;
    
        }
    else if("Halfling".equals(race)){
        System.out.println(race);
        min = 30;
        max = 50;
    
        }
    else {
        System.out.println("Incorrect entry");
        
        }
    
    Random randAge = new Random();
    
    age = randAge.nextInt((max - min) + 1) + min;
    System.out.println(age);

    }
}

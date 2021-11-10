package spitefulgerbilsapp;

import java.util.Random;
import java.util.Scanner;

public class HeightWeight {

// public static void main(String[] args) { - NetBeans says you don't need this because this isn't a tester class.
    private String mf;
    
    public static void heightWeight(){
    public void answers(){
        Scanner gender = new Scanner(System.in);
        System.out.println("Are you male or female");
        String mf = gender.nextLine();
    }
    
    public void humanHeight(String mf){
        Random rand = new Random();
        if("male".equals(mf)){
            int max = 89;
            int min = 54;
            double randomNum = rand.nextDouble(max + 1 - min) + min;
            modHeight = randomNum%12;
            maleHeight = randomNum/12;
            System.out.println("Your Height is " + maleHeight + "'" + modHeight)
        }else if("female".equals(mf)){
            int max = 79;
            int min = 52;
            double randomNum = rand.nextDouble(max + 1 - min) + min;
            modHeight = randomNum%12;
            femaleHeight = randomNum/12;
            System.out.println("Your Height is " + femaleHeight + "'" + modHeight);
        }
    }
    public void humanWeight(String mf){
            if("male".equals(mf)){
            int max = 260;
            int min = 90;
            double randomNumTwo = rand.nextDouble(max + 1 - min) + min;
            System.out.println("Your Weight is " + randomNumTwo + " lbs");
        }else if("female".equals(mf)){
            int max = 200;
            int min = 75;
            double randomNumTwo = rand.nextDouble(max + 1 - min) + min;
            System.out.println("Your Weight is " + randomNumTwo + " lbs");
        }
    }
}

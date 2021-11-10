package spitefulgerbilsapp;

import java.util.Random;
import java.util.Scanner;

public class HeightWeight {

// public static void main(String[] args) { - NetBeans says you don't need this because this isn't a tester class.
    private String mf;
    
        public void answers(){
        Scanner gender = new Scanner(System.in);
        System.out.println("Are you male or female");
        mf = gender.nextLine();
        if("male".equalsIgnoreCase()){
            if("female".equalsIgnoreCase()){
                humanHeight();
                humanWeight();
            }else{
                System.out.println("Please Enter a Valid Response.");
            }    
        }
    }
    
    public void humanHeight(){
        Random rand = new Random();
        if("male".equalsIgnoreCase(mf)){
            int max = 89;
            int min = 54;
            int randomNum = rand.nextInt(max + 1 - min) + min;
            int modHeight = randomNum%12;
            int maleHeight = randomNum/12;
            System.out.println("Your Height is " + maleHeight + "'" + modHeight);
        }else if("female".equalsIgnoreCase(mf)){
            int max = 79;
            int min = 52;
            int randomNum = rand.nextInt(max + 1 - min) + min;
            int modHeight = randomNum%12;
            int femaleHeight = randomNum/12;
            System.out.println("Your Height is " + femaleHeight + "'" + modHeight);
        }
    }
    public void humanWeight(){
        Random rand = new Random();    
        if("male".equalsIgnoreCase(mf)){
            int max = 260;
            int min = 90;
            int randomNumTwo = rand.nextInt(max + 1 - min) + min;
            System.out.println("Your Weight is " + randomNumTwo + " lbs");
        }else if("female".equalsIgnoreCase(mf)){
            int max = 200;
            int min = 75;
            int randomNumTwo = rand.nextInt(max + 1 - min) + min;
            System.out.println("Your Weight is " + randomNumTwo + " lbs");
        }
    }
    public void run(){
        answers();
    }
}

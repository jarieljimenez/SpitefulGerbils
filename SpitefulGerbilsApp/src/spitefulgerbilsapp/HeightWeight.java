package spitefulgerbilsapp;

import java.util.Random;
import java.util.Scanner;

public class HeightWeight {

// public static void main(String[] args) { - NetBeans says you don't need this because this isn't a tester class.
    private String mf;
    private String rc;
    private int fWeiMax;
    private int fWeiMin;
    private int mWeiMax;
    private int mWeiMin;
    private int fHeiMax;
    private int fHeiMin;
    private int mHeiMax;
    private int mHeiMin;
    
    public void answers(){
        Scanner gender = new Scanner(System.in);
        System.out.println("Are you male or female");
        mf = gender.nextLine();
        Scanner race = new Scanner(System.in);
        System.out.println("What is your race? Human, Elf, Dwarf, Gnome, or Halfing?");
        rc = race.nextLine();
     if("male".equalsIgnoreCase(mf) || "female".equalsIgnoreCase(mf)){
        if("human".equalsIgnoreCase(rc) || "elf".equalsIgnoreCase(rc) || "dwarf".equalsIgnoreCase(rc) || "gnome".equalsIgnoreCase(rc) || "halfling".equalsIgnoreCase(rc)) {   
            if("human".equalsIgnoreCase(rc)){
                fWeiMax = 200;
                fWeiMin = 75;
                mWeiMax = 260;
                mWeiMin = 90;
                fHeiMax = 79;
                fHeiMin = 52;
                mHeiMax = 89;
                mHeiMin = 54;
                height();
                weight();
            }else if("elf".equalsIgnoreCase(rc)){
                fWeiMax = 100;
                fWeiMin = 65;
                mWeiMax = 130;
                mWeiMin = 70;
                fHeiMax = 64;
                fHeiMin = 44;
                mHeiMax = 66;
                mHeiMin = 48;
                height();
                weight();
            }else if("dwarf".equalsIgnoreCase(rc)){
                fWeiMax = 180;
                fWeiMin = 125;
                mWeiMax = 230;
                mWeiMin = 150;
                fHeiMax = 55;
                fHeiMin = 44;
                mHeiMax = 58;
                mHeiMin = 48;
                height();
                weight();
            }else if("gnome".equalsIgnoreCase(rc)){
                fWeiMax = 55;
                fWeiMin = 35;
                mWeiMax = 60;
                mWeiMin = 40;
                fHeiMax = 39;
                fHeiMin = 28;
                mHeiMax = 41;
                mHeiMin = 30;
                height();
                weight()
            }else if("halfling".equalsIgnoreCase(rc)){
                fWeiMax = 70;
                fWeiMin = 45;
                mWeiMax = 80;
                mWeiMin = 55;
                fHeiMax = 49;
                fHeiMin = 33;
                mHeiMax = 51;
                mHeiMin = 38;
                height();
                weight();
            }
        }else{
           System.out.println("Please Enter a Valid Race."):
        }
    }else{
        System.out.println("Please Enter a Valid Gender.");   
    }
    }
    public void height(){
        Random rand = new Random();
        if("male".equalsIgnoreCase(mf)){
            int randomNum = rand.nextInt(mHeiMax + 1 - mHeiMin) + mHeiMin;
            int modHeight = randomNum%12;
            int maleHeight = randomNum/12;
            System.out.println("Your Height is " + maleHeight + "'" + modHeight);
        }else if("female".equalsIgnoreCase(mf)){
            int randomNum = rand.nextInt(fHeiMax + 1 - fHeiMin) + fHeiMin;
            int modHeight = randomNum%12;
            int femaleHeight = randomNum/12;
            System.out.println("Your Height is " + femaleHeight + "'" + modHeight);
        }
    }
    public void weight(){
        Random rand = new Random();    
        if("male".equalsIgnoreCase(mf)){
            int randomNumTwo = rand.nextInt(mWeiMax + 1 - mWeiMin) + mWeiMin;
            System.out.println("Your Weight is " + randomNumTwo + " lbs");
        }else if("female".equalsIgnoreCase(mf)){
            int randomNumTwo = rand.nextInt(fWeiMax + 1 - fWeiMin) + fWeiMin;
            System.out.println("Your Weight is " + randomNumTwo + " lbs");
        }
    }
    public void run(){
        answers();
    }
}

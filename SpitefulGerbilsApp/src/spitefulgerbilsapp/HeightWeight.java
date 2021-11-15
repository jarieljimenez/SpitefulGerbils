package spitefulgerbilsapp;

import java.util.Random;
import java.util.Scanner;

public class HeightWeight{
    
    private String mf;
    private String rc;
    private String alnmt;
    private String nm;
    private int fWeiMax;
    private int fWeiMin;
    private int mWeiMax;
    private int mWeiMin;
    private int fHeiMax; //All instance varibles to generate character stats
    private int fHeiMin;
    private int mHeiMax;
    private int mHeiMin;
    private int age;
    private int max;
    private int min;
    private int randomNumTwo;
    private int randomNum;
    private int height;
    private int modHeight;
    
    public void charGen(){
        Scanner name = new Scanner(System.in);
        System.out.println("Please Enter a Name.");
        nm = name.nextLine();
        Scanner gender = new Scanner(System.in);
        System.out.println("Are you Male or Female");  //Asking for gender and then setting the variable to a specific String based on input
        mf = gender.nextLine();
        if("male".equalsIgnoreCase(mf)){
            mf = "Male";
        }else if("female".equalsIgnoreCase(mf)){
            mf = "Female";
        }else{
            mf = "void";
        }
        if("male".equalsIgnoreCase(mf) || "female".equalsIgnoreCase(mf)){
            Scanner race = new Scanner(System.in);
            System.out.println("What is your race? Human, Elf, Dwarf, Gnome, or Halfing?");
            rc = race.nextLine();
            if("human".equalsIgnoreCase(rc) || "elf".equalsIgnoreCase(rc) || "dwarf".equalsIgnoreCase(rc) || "gnome".equalsIgnoreCase(rc) || "halfling".equalsIgnoreCase(rc)){
                Scanner alignment = new Scanner(System.in);
                System.out.println("What is your alignment? Lawful Good, Lawful Evil, Neutral Good, Neutral Evil, Chaotic Good, or Chaotic Evil?");
                alnmt = alignment.nextLine();
                if("human".equalsIgnoreCase(rc)){
                    rc = "Human";
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
                    ageGenerate();
                }else if("elf".equalsIgnoreCase(rc)){
                    rc = "Elf";
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
                    ageGenerate();
                }else if("dwarf".equalsIgnoreCase(rc)){
                    rc = "Dwarf";
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
                    ageGenerate();
                }else if("gnome".equalsIgnoreCase(rc)){
                    rc = "Gnome";
                    fWeiMax = 55;
                    fWeiMin = 35;
                    mWeiMax = 60;
                    mWeiMin = 40;
                    fHeiMax = 39;
                    fHeiMin = 28;
                    mHeiMax = 41;
                    mHeiMin = 30;
                    height();
                    weight();
                    ageGenerate();
                }else if("halfling".equalsIgnoreCase(rc)){
                    rc = "Halfing";
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
                    ageGenerate();
                }
                if("lawful good".equalsIgnoreCase(alnmt) || "chaotic good".equalsIgnoreCase(alnmt) || "neutral good".equalsIgnoreCase(alnmt) || "lawful evil".equalsIgnoreCase(alnmt) || "chaotic evil".equalsIgnoreCase(alnmt) || "neutral evil".equalsIgnoreCase(alnmt)){
                    if("lawful good".equalsIgnoreCase(alnmt)){
                        alnmt = "Lawfull Good";
                    }else if("chaotic good".equalsIgnoreCase(alnmt)){
                        alnmt = "Chaotic Good";
                    }else if("neutral good".equalsIgnoreCase(alnmt)){
                        alnmt = "Neutral Good";
                    }else if("lawful evil".equalsIgnoreCase(alnmt)){
                        alnmt = "Lawfull Evil";
                    }else if("chaotic evil".equalsIgnoreCase(alnmt)){
                        alnmt = "Chaotic Evil";
                    }else if("neutral evil".equalsIgnoreCase(alnmt)){
                        alnmt = "Neutral Evil";
                    }
                    displayStats();
                }else{
                    alnmt = "void";
                    if("void".equals(alnmt)){
                        System.out.println("Please enter a valid alignment.");
                    }
                }
            }else{
                rc = "void";
                if("void".equals(rc)){
                    System.out.println("Please enter a valid race.");
                }
            }
        }else if("void".equals(mf)){
            System.out.println( "Please enter a valid gender.");
        }
    }      
    public void height(){
        Random rand = new Random();
        if("male".equalsIgnoreCase(mf)){
            mf = "Male";
            randomNum = rand.nextInt(mHeiMax + 1 - mHeiMin) + mHeiMin;
            modHeight = randomNum%12;
            height = randomNum/12;
        }else if("female".equalsIgnoreCase(mf)){
            mf = "Female";
            randomNum = rand.nextInt(fHeiMax + 1 - fHeiMin) + fHeiMin;
            modHeight = randomNum%12;
            height = randomNum/12;
        }
    }
    public void weight(){
        Random rand = new Random();    
        if("male".equalsIgnoreCase(mf)){
            mf = "Male";
            randomNumTwo = rand.nextInt(mWeiMax + 1 - mWeiMin) + mWeiMin;
        }else if("female".equalsIgnoreCase(mf)){
            mf = "Female";
            randomNumTwo = rand.nextInt(fWeiMax + 1 - fWeiMin) + fWeiMin;
        }
    }
    public void ageGenerate(){
        if ("Human".equalsIgnoreCase(rc)){
            min = 15;
            max = 30;
        }else if("Elf".equalsIgnoreCase(rc)){
            min = 80;
            max = 180;
        }else if("Dwarf".equalsIgnoreCase(rc)){            
            min = 40;
            max = 70;       
        }else if("Gnome".equalsIgnoreCase(rc)){            
            min = 30;
            max = 60;   
        }else if("Halfling".equalsIgnoreCase(rc)){           
            min = 30;
            max = 50;  
        }else {
            System.out.println("Incorrect entry");       
        }
    
        Random randAge = new Random();
    
        age = randAge.nextInt((max - min) + 1) + min;
    }
      
    public void displayStats(){
        System.out.println("\nName: " + nm);
        System.out.println("Gender: " + mf);
        System.out.println("Alignment: " + alnmt);
        System.out.println("Race: " + rc);
        System.out.println("Height: " + height + "'" + modHeight + '"');
        System.out.println("Weight: " + randomNumTwo);
        System.out.println("Age: "  + age);
        
    }
}

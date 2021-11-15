package spitefulgerbilsapp;

import java.util.Random;
import java.util.Scanner;

public class HeightWeight extends DiceRoller{
    
    private String mf;
    private String rc;
    private String alnmt;
    private String nm;
    private String gn;
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
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private String score1;
    private String score2;
    private String score3;
    private String score4;
    private String score5;
    private String score6;
    private int threeD;
    private int fiveD;
    private int fiveD1;
    private int scoreNum;
    String[] abArr = {"Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma"};
    String[] arr2 = abArr;
    
    public void charGen(){
        Scanner name = new Scanner(System.in);
        System.out.println("Please Enter a Name.");
        nm = name.nextLine();
        Scanner gender = new Scanner(System.in);
        System.out.println("Are you Male or Female?");  //Asking for gender and then setting the variable to a specific String based on input
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
                Scanner gen = new Scanner(System.in);
                System.out.println("What dice would you like to use? 3D6, 5D6, or 5D6 plus 1D3?");
                gn = gen.nextLine();
                generateRaceScore();
                Scanner score = new Scanner(System.in);
                System.out.print("What ability score would you like to assign your score to? ");
                for(int i = 0; i < abArr.length; i++){
                    System.out.print(abArr[i] + " ");
                }
                score1 = score.nextLine();
                if("strength".equalsIgnoreCase(score1) || "dexterity".equalsIgnoreCase(score1) || "constitution".equalsIgnoreCase(score1) || "intelligence".equalsIgnoreCase(score1) || "wisdom".equalsIgnoreCase(score1) || "charisma".equalsIgnoreCase(score1)){
                    if("strength".equalsIgnoreCase(score1)){
                        strength = scoreNum;
                        abArr[] = abArr[] - abArr["Strength"];
                    }else if("dexterity".equalsIgnoreCase(score1)){
                        dexterity = scoreNum;
                    }else if("constitution".equalsIgnoreCase(score1)){
                        constitution = scoreNum;
                    }else if("intelligence".equalsIgnoreCase(score1)){
                        intelligence = scoreNum;
                    }else if("wisdom".equalsIgnoreCase(score1)){
                        wisdom = scoreNum;
                    }else if("charisma".equalsIgnoreCase(score1)){
                        charisma = scoreNum;
                    }
                }else{
                    System.out.println("Please enter a valid ability score.");
                }
                Scanner gen2 = new Scanner(System.in);
                System.out.println("What dice would you like to use? 3D6, 5D6, or 5D6 plus 1D3?");
                gn = gen2.nextLine();
                generateRaceScore();
                Scanner scoreTwo = new Scanner(System.in);
                System.out.println("What ability score would you like to assign your score to? Strength, Dexterity, Constitution, Intelligence, Wisdom, or Charisma?");
                score2 = scoreTwo.nextLine();
                if("strength".equalsIgnoreCase(score2) || "dexterity".equalsIgnoreCase(score2) || "constitution".equalsIgnoreCase(score2) || "intelligence".equalsIgnoreCase(score2) || "wisdom".equalsIgnoreCase(score2) || "charisma".equalsIgnoreCase(score2)){
                    if("strength".equalsIgnoreCase(score2)){
                        strength = scoreNum;
                    }else if("dexterity".equalsIgnoreCase(score2)){
                        dexterity = scoreNum;
                    }else if("constitution".equalsIgnoreCase(score2)){
                        constitution = scoreNum;
                    }else if("intelligence".equalsIgnoreCase(score2)){
                        intelligence = scoreNum;
                    }else if("wisdom".equalsIgnoreCase(score2)){
                        wisdom = scoreNum;
                    }else if("charisma".equalsIgnoreCase(score2)){
                        charisma = scoreNum;
                    }
                }else{
                    System.out.println("Please enter a valid ability score.");
                }
                Scanner gen3 = new Scanner(System.in);
                System.out.println("What dice would you like to use? 3D6, 5D6, or 5D6 plus 1D3?");
                gn = gen3.nextLine();
                generateRaceScore();
                Scanner scoreThree = new Scanner(System.in);
                System.out.println("What ability score would you like to assign your score to? Strength, Dexterity, Constitution, Intelligence, Wisdom, or Charisma?");
                score3 = scoreThree.nextLine();
                if("strength".equalsIgnoreCase(score3) || "dexterity".equalsIgnoreCase(score3) || "constitution".equalsIgnoreCase(score3) || "intelligence".equalsIgnoreCase(score3) || "wisdom".equalsIgnoreCase(score3) || "charisma".equalsIgnoreCase(score3)){
                    if("strength".equalsIgnoreCase(score3)){
                        strength = scoreNum;
                    }else if("dexterity".equalsIgnoreCase(score3)){
                        dexterity = scoreNum;
                    }else if("constitution".equalsIgnoreCase(score3)){
                        constitution = scoreNum;
                    }else if("intelligence".equalsIgnoreCase(score3)){
                        intelligence = scoreNum;
                    }else if("wisdom".equalsIgnoreCase(score3)){
                        wisdom = scoreNum;
                    }else if("charisma".equalsIgnoreCase(score3)){
                        charisma = scoreNum;
                    }
                }else{
                    System.out.println("Please enter a valid ability score.");
                }
                Scanner gen4 = new Scanner(System.in);
                System.out.println("What dice would you like to use? 3D6, 5D6, or 5D6 plus 1D3?");
                gn = gen4.nextLine();
                generateRaceScore();
                Scanner scoreFour = new Scanner(System.in);
                System.out.println("What ability score would you like to assign your score to? Strength, Dexterity, Constitution, Intelligence, Wisdom, or Charisma?");
                score4 = scoreFour.nextLine();
                if("strength".equalsIgnoreCase(score4) || "dexterity".equalsIgnoreCase(score4) || "constitution".equalsIgnoreCase(score4) || "intelligence".equalsIgnoreCase(score4) || "wisdom".equalsIgnoreCase(score4) || "charisma".equalsIgnoreCase(score4)){
                    if("strength".equalsIgnoreCase(score4)){
                        strength = scoreNum;
                    }else if("dexterity".equalsIgnoreCase(score4)){
                        dexterity = scoreNum;
                    }else if("constitution".equalsIgnoreCase(score4)){
                        constitution = scoreNum;
                    }else if("intelligence".equalsIgnoreCase(score4)){
                        intelligence = scoreNum;
                    }else if("wisdom".equalsIgnoreCase(score4)){
                        wisdom = scoreNum;
                    }else if("charisma".equalsIgnoreCase(score4)){
                        charisma = scoreNum;
                    }
                }else{
                    System.out.println("Please enter a valid ability score.");
                }
                Scanner gen5 = new Scanner(System.in);
                System.out.println("What dice would you like to use? 3D6, 5D6, or 5D6 plus 1D3?");
                gn = gen5.nextLine();
                generateRaceScore();
                Scanner scoreFive = new Scanner(System.in);
                System.out.println("What ability score would you like to assign your score to? Strength, Dexterity, Constitution, Intelligence, Wisdom, or Charisma?");
                score5 = scoreFive.nextLine();
                if("strength".equalsIgnoreCase(score5) || "dexterity".equalsIgnoreCase(score5) || "constitution".equalsIgnoreCase(score5) || "intelligence".equalsIgnoreCase(score5) || "wisdom".equalsIgnoreCase(score5) || "charisma".equalsIgnoreCase(score5)){
                    if("strength".equalsIgnoreCase(score5)){
                        strength = scoreNum;
                    }else if("dexterity".equalsIgnoreCase(score5)){
                        dexterity = scoreNum;
                    }else if("constitution".equalsIgnoreCase(score5)){
                        constitution = scoreNum;
                    }else if("intelligence".equalsIgnoreCase(score5)){
                        intelligence = scoreNum;
                    }else if("wisdom".equalsIgnoreCase(score5)){
                        wisdom = scoreNum;
                    }else if("charisma".equalsIgnoreCase(score5)){
                        charisma = scoreNum;
                    }
                }else{
                    System.out.println("Please enter a valid ability score.");
                }
                Scanner gen6 = new Scanner(System.in);
                System.out.println("What dice would you like to use? 3D6, 5D6, or 5D6 plus 1D3?");
                gn = gen6.nextLine();
                generateRaceScore();
                Scanner scoreSix = new Scanner(System.in);
                System.out.println("What ability score would you like to assign your score to? Strength, Dexterity, Constitution, Intelligence, Wisdom, or Charisma?");
                score6 = scoreSix.nextLine();
                if("strength".equalsIgnoreCase(score6) || "dexterity".equalsIgnoreCase(score6) || "constitution".equalsIgnoreCase(score6) || "intelligence".equalsIgnoreCase(score6) || "wisdom".equalsIgnoreCase(score6) || "charisma".equalsIgnoreCase(score6)){
                    if("strength".equalsIgnoreCase(score6)){
                        strength = scoreNum;
                    }else if("dexterity".equalsIgnoreCase(score6)){
                        dexterity = scoreNum;
                    }else if("constitution".equalsIgnoreCase(score6)){
                        constitution = scoreNum;
                    }else if("intelligence".equalsIgnoreCase(score6)){
                        intelligence = scoreNum;
                    }else if("wisdom".equalsIgnoreCase(score6)){
                        wisdom = scoreNum;
                    }else if("charisma".equalsIgnoreCase(score6)){
                        charisma = scoreNum;
                    }
                }else{
                    System.out.println("Please enter a valid ability score.");
                }
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
                    dexterity = dexterity + 2;
                    intelligence = intelligence + 2;
                    constitution = constitution - 2;
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
                    strength = strength + 2;
                    constitution = constitution + 2;
                    charisma = charisma - 2;
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
                    dexterity = dexterity + 2;
                    constitution = constitution + 2;
                    strength = strength - 2;
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
                    dexterity = dexterity + 2;
                    wisdom = wisdom + 2;
                    strength = strength - 2;
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
                    displayABScores();
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
        }
    
        Random randAge = new Random();
    
        age = randAge.nextInt((max - min) + 1) + min;
    }
    
    public void generateRaceScore(){  
        if("3D6".equalsIgnoreCase(gn)){
            threeD6();
        }else if("5D6".equalsIgnoreCase(gn)){
            fiveD6();
        }else if("5D6 plus 1D3".equalsIgnoreCase(gn)){
            fiveD61();
        }
    }
    
    public void threeD6(){
        Random rnd = new Random();
        int maximum = 18;
        int minimum = 3;
        threeD = rnd.nextInt((maximum - minimum) + 1) + minimum;
        scoreNum = threeD;
        System.out.println("\nScore: " + threeD);
    }
    public void fiveD6(){
        Random rnd = new Random();
        int maximum = 18;
        int minimum = 3;
        fiveD = rnd.nextInt((maximum - minimum) + 1) + minimum;
        scoreNum = fiveD;
        System.out.println("\nScore: " + fiveD);
    }
    public void fiveD61(){
        Random rnd = new Random();
        int maximum = 21;
        int minimum = 4;
        fiveD1 = rnd.nextInt((maximum - minimum) + 1) + minimum;
        scoreNum = fiveD1;
        System.out.println("\nScore: " + fiveD1);
    }
    
    public void displayStats()
    {
        System.out.println("\nName: " + nm);
        System.out.println("Gender: " + mf);
        System.out.println("Alignment: " + alnmt);
        System.out.println("Race: " + rc);
        System.out.println("Height: " + height + "'" + modHeight + '"');
        System.out.println("Weight: " + randomNumTwo);
        System.out.println("Age: "  + age);   
    }
    
    public void displayABScores(){
        System.out.println("\nStrength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Constitution: " + constitution);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Charisma: " + charisma);
    }
    public void displayABvars(){

    }
}

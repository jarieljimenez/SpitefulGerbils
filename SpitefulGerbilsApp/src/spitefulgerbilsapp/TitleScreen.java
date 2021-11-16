package spitefulgerbilsapp;

import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class HeightWeight extends TitleScreen{
    
    private String mf;
    private String rc;
    private String alnmt;
    private String nm;
    private String gn;
    private String on;
    private int fWeiMax;
    private int fWeiMin;
    private int mWeiMax;
    private int mWeiMin;
    private int fHeiMax; 
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
    private int strength = 0;
    private int dexterity = 0;
    private int constitution = 0;
    private int intelligence = 0;
    private int wisdom = 0;
    private int charisma = 0;
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
    
    
    public void charGen()throws IOException{ //The Character Generator.
        Scanner newOld = new Scanner(System.in);
        System.out.println("1.) Load Character. \n2.) New Character."); //Asks to load or create new character.
        on = newOld.nextLine();
        if("2".equalsIgnoreCase(on) || "New Character".equalsIgnoreCase(on)){
            signUp();
            Scanner name = new Scanner(System.in);
            System.out.println("Please Enter a Name.");
            nm = name.nextLine();
            genGender();                                                //Tests if the answer is 2 or 1 and either runs the signIn(); method
            genRace();                                                   //or runs the following methods and code.       
            genAlignment();

            Scanner gen = new Scanner(System.in);
            System.out.println("\nWhat dice would you like to use? 3D6, 5D6, or 5D6 plus 1D3?");
            gn = gen.nextLine();
            generateRaceScore();
            scoreOne();

            Scanner gen2 = new Scanner(System.in);
            System.out.println("\nWhat dice would you like to use? 3D6, 5D6, or 5D6 plus 1D3?");
            gn = gen2.nextLine();
            generateRaceScore();
            scoreTwo();

            Scanner gen3 = new Scanner(System.in);
            System.out.println("\nWhat dice would you like to use? 3D6, 5D6, or 5D6 plus 1D3?");
            gn = gen3.nextLine();
            generateRaceScore();
            scoreThree();

            Scanner gen4 = new Scanner(System.in);
            System.out.println("\nWhat dice would you like to use? 3D6, 5D6, or 5D6 plus 1D3?");
            gn = gen4.nextLine();
            generateRaceScore();
            scoreFour();

            Scanner gen5 = new Scanner(System.in);
            System.out.println("\nWhat dice would you like to use? 3D6, 5D6, or 5D6 plus 1D3?");
            gn = gen5.nextLine();
            generateRaceScore();
            scoreFive();

            Scanner gen6 = new Scanner(System.in);
            System.out.println("\nWhat dice would you like to use? 3D6, 5D6, or 5D6 plus 1D3?");
            gn = gen6.nextLine();
            generateRaceScore();
            scoreSix();

            displayStats();
            abAdjust();
            displayABScores();
            textPrinter();
        }else if("1".equalsIgnoreCase(on) || "Load Character".equalsIgnoreCase(on)){
           signIn();
            //System.out.println("test");
        }else{
            System.out.println("Please enter a valid answer.");
            charGen();
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
        }else{
            System.out.println("Please enter a valid die.");
            generateRaceScore();
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
        System.out.println("\n\nStatitistics");
        System.out.println("********************");
        System.out.println("\nName: " + nm);
        System.out.println("Gender: " + mf);
        System.out.println("Alignment: " + alnmt);
        System.out.println("Race: " + rc);
        System.out.println("Height: " + height + "'" + modHeight + '"');
        System.out.println("Weight: " + randomNumTwo);
        System.out.println("Age: "  + age);   
    }
    
    public void displayABScores(){
        System.out.println("\n\nAbility Scores");
        System.out.println("********************");
        System.out.println("\nStrength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Constitution: " + constitution);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Charisma: " + charisma);
    }

    public void scoreOne(){
        Scanner score = new Scanner(System.in);
        System.out.println("What ability would you like to assign your score to? Strength, Dexterity, Constitution, Intelligence, Wisdom, or Charisma?");
        score1 = score.nextLine();
        if("strength".equalsIgnoreCase(score1) || "dexterity".equalsIgnoreCase(score1) || "constitution".equalsIgnoreCase(score1) || "intelligence".equalsIgnoreCase(score1) || "wisdom".equalsIgnoreCase(score1) || "charisma".equalsIgnoreCase(score1)){
            if("strength".equalsIgnoreCase(score1)){
                if(strength <= 0){    
                    strength = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreOne();
                }    
            }else if("dexterity".equalsIgnoreCase(score1)){
                if(dexterity <= 0){    
                    dexterity = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreOne();
                }  
            }else if("constitution".equalsIgnoreCase(score1)){
                if(constitution <= 0){    
                    constitution = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreOne();
                }  
            }else if("intelligence".equalsIgnoreCase(score1)){
                    if(intelligence <= 0){    
                    intelligence = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreOne();
                }  
            }else if("wisdom".equalsIgnoreCase(score1)){
                    if(wisdom <= 0){    
                    wisdom = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreOne();
                }  
            }else if("charisma".equalsIgnoreCase(score1)){
                if(charisma <= 0){    
                    charisma = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreOne();               
                }
            }
        }else{
            System.out.println("Please enter a valid ability.");
            scoreOne();
        }        
    }
    public void scoreTwo(){
        Scanner scoreTwo = new Scanner(System.in);
        System.out.println("What ability score would you like to assign your score to? Strength, Dexterity, Constitution, Intelligence, Wisdom, or Charisma?");
        score2 = scoreTwo.nextLine();
        if("strength".equalsIgnoreCase(score2) || "dexterity".equalsIgnoreCase(score2) || "constitution".equalsIgnoreCase(score2) || "intelligence".equalsIgnoreCase(score2) || "wisdom".equalsIgnoreCase(score2) || "charisma".equalsIgnoreCase(score2)){
            if("strength".equalsIgnoreCase(score2)){
                if(strength <= 0){    
                    strength = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreTwo();
                }    
            }else if("dexterity".equalsIgnoreCase(score2)){
                if(dexterity <= 0){    
                    dexterity = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreTwo();
                }  
            }else if("constitution".equalsIgnoreCase(score2)){
                if(constitution <= 0){    
                    constitution = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreTwo();
                }  
            }else if("intelligence".equalsIgnoreCase(score2)){
                    if(intelligence <= 0){    
                    intelligence = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreTwo();
                }  
            }else if("wisdom".equalsIgnoreCase(score2)){
                    if(wisdom <= 0){    
                    wisdom = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreTwo();
                }  
            }else if("charisma".equalsIgnoreCase(score2)){
                if(charisma <= 0){    
                    charisma = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreTwo();               
                }
            }
        }else{
            System.out.println("Please enter a valid ability.");
            scoreTwo();
        }        
    }
    public void scoreThree(){
        Scanner scoreThree = new Scanner(System.in);
        System.out.println("What ability score would you like to assign your score to? Strength, Dexterity, Constitution, Intelligence, Wisdom, or Charisma?");
        score3 = scoreThree.nextLine();
        if("strength".equalsIgnoreCase(score3) || "dexterity".equalsIgnoreCase(score3) || "constitution".equalsIgnoreCase(score3) || "intelligence".equalsIgnoreCase(score3) || "wisdom".equalsIgnoreCase(score3) || "charisma".equalsIgnoreCase(score3)){
            if("strength".equalsIgnoreCase(score3)){
                if(strength <= 0){    
                    strength = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreThree();
                }    
            }else if("dexterity".equalsIgnoreCase(score3)){
                if(dexterity <= 0){    
                    dexterity = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreThree();
                }  
            }else if("constitution".equalsIgnoreCase(score3)){
                if(constitution <= 0){    
                    constitution = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreThree();
                }  
            }else if("intelligence".equalsIgnoreCase(score3)){
                    if(intelligence <= 0){    
                    intelligence = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreThree();
                }  
            }else if("wisdom".equalsIgnoreCase(score3)){
                    if(wisdom <= 0){    
                    wisdom = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreThree();
                }  
            }else if("charisma".equalsIgnoreCase(score3)){
                if(charisma <= 0){    
                    charisma = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreThree();               
                }
            }
        }else{
            System.out.println("Please enter a valid ability.");
            scoreThree();
        }        
    }
    public void scoreFour(){
        Scanner scoreFour = new Scanner(System.in);
        System.out.println("What ability score would you like to assign your score to? Strength, Dexterity, Constitution, Intelligence, Wisdom, or Charisma?");
        score4 = scoreFour.nextLine();
        if("strength".equalsIgnoreCase(score4) || "dexterity".equalsIgnoreCase(score4) || "constitution".equalsIgnoreCase(score4) || "intelligence".equalsIgnoreCase(score4) || "wisdom".equalsIgnoreCase(score4) || "charisma".equalsIgnoreCase(score4)){
            if("strength".equalsIgnoreCase(score4)){
                if(strength <= 0){    
                    strength = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreFour();
                }    
            }else if("dexterity".equalsIgnoreCase(score4)){
                if(dexterity <= 0){    
                    dexterity = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreFour();
                }  
            }else if("constitution".equalsIgnoreCase(score4)){
                if(constitution <= 0){    
                    constitution = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreFour();
                }  
            }else if("intelligence".equalsIgnoreCase(score4)){
                    if(intelligence <= 0){    
                    intelligence = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreFour();
                }  
            }else if("wisdom".equalsIgnoreCase(score4)){
                    if(wisdom <= 0){    
                    wisdom = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreFour();
                }  
            }else if("charisma".equalsIgnoreCase(score4)){
                if(charisma <= 0){    
                    charisma = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreFour();               
                }
            }
        }else{
            System.out.println("Please enter a valid ability.");
            scoreFour();
        }        
    }
    public void scoreFive(){
        Scanner scoreFive = new Scanner(System.in);
        System.out.println("What ability would you like to assign your score to? Strength, Dexterity, Constitution, Intelligence, Wisdom, or Charisma?");
        score5 = scoreFive.nextLine();
        if("strength".equalsIgnoreCase(score5) || "dexterity".equalsIgnoreCase(score5) || "constitution".equalsIgnoreCase(score5) || "intelligence".equalsIgnoreCase(score5) || "wisdom".equalsIgnoreCase(score5) || "charisma".equalsIgnoreCase(score5)){
            if("strength".equalsIgnoreCase(score5)){
                if(strength <= 0){    
                    strength = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreFive();
                }    
            }else if("dexterity".equalsIgnoreCase(score5)){
                if(dexterity <= 0){    
                    dexterity = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreFive();
                }  
            }else if("constitution".equalsIgnoreCase(score5)){
                if(constitution <= 0){    
                    constitution = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreFive();
                }  
            }else if("intelligence".equalsIgnoreCase(score5)){
                    if(intelligence <= 0){    
                    intelligence = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreFive();
                }  
            }else if("wisdom".equalsIgnoreCase(score5)){
                    if(wisdom <= 0){    
                    wisdom = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreFive();
                }  
            }else if("charisma".equalsIgnoreCase(score5)){
                if(charisma <= 0){    
                    charisma = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreFive();               
                }
            }
        }else{
            System.out.println("Please enter a valid ability.");
            scoreFive();
        }        
    }
    public void scoreSix(){
        Scanner scoreSix = new Scanner(System.in);
        System.out.println("What ability score would you like to assign your score to? Strength, Dexterity, Constitution, Intelligence, Wisdom, or Charisma?");
        score6 = scoreSix.nextLine();
        if("strength".equalsIgnoreCase(score6) || "dexterity".equalsIgnoreCase(score6) || "constitution".equalsIgnoreCase(score6) || "intelligence".equalsIgnoreCase(score6) || "wisdom".equalsIgnoreCase(score6) || "charisma".equalsIgnoreCase(score6)){
            if("strength".equalsIgnoreCase(score6)){
                if(strength <= 0){    
                    strength = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreSix();
                }    
            }else if("dexterity".equalsIgnoreCase(score6)){
                if(dexterity <= 0){    
                    dexterity = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreSix();
                }  
            }else if("constitution".equalsIgnoreCase(score6)){
                if(constitution <= 0){    
                    constitution = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreSix();
                }  
            }else if("intelligence".equalsIgnoreCase(score6)){
                    if(intelligence <= 0){    
                    intelligence = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreSix();
                }  
            }else if("wisdom".equalsIgnoreCase(score6)){
                    if(wisdom <= 0){    
                    wisdom = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreSix();
                }  
            }else if("charisma".equalsIgnoreCase(score6)){
                if(charisma <= 0){    
                    charisma = scoreNum;
                }else{
                    System.out.println("Please enter an ability that does not have a score.");
                    scoreSix();               
                }
            }
        }else{
            System.out.println("Please enter a valid ability.");
            scoreSix();
        }        
    }
    public void genGender(){
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
        if("void".equalsIgnoreCase(mf)){
            System.out.println("Please enter a valid gender.");
            genGender();
        }
    }
    public void genAlignment(){
        Scanner alignment = new Scanner(System.in);
        System.out.println("What is your alignment? Lawful Good, Lawful Evil, Neutral Good, Neutral Evil, Chaotic Good, or Chaotic Evil?");
        alnmt = alignment.nextLine();

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
        }else{
            alnmt = "void";
            if("void".equals(alnmt)){
                System.out.println("Please enter a valid alignment.");
                genAlignment();
            }
        }
    }
    public void genRace(){
        Scanner race = new Scanner(System.in);
        System.out.println("What is your race? Human, Elf, Dwarf, Gnome, or Halfing?");
        rc = race.nextLine();
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
            dexterity = dexterity + 2;
            wisdom = wisdom + 2;
            strength = strength - 2;
            height();
            weight();
            ageGenerate();
        }else{
            rc = "void";
        }
        if("void".equalsIgnoreCase(rc)){
            System.out.println("Please enter a valid race.");
            genRace();
        }           
    }
    public void abAdjust(){
        if("elf".equalsIgnoreCase(rc)){
            dexterity = dexterity + 2;
            intelligence = intelligence + 2;
            constitution = constitution - 2;
        }else if("dwarf".equalsIgnoreCase(rc)){
            strength = strength + 2;
            constitution = constitution + 2;
            charisma = charisma - 2;
        }else if("gnome".equalsIgnoreCase(rc)){
            dexterity = dexterity + 2;
            constitution = constitution + 2;
            strength = strength - 2;
        }else if("halfling".equalsIgnoreCase(rc)){
            dexterity = dexterity + 2;
            wisdom = wisdom + 2;
            strength = strength - 2;
        }            
    }
    public void textPrinter() throws IOException{
        PrintWriter out = new PrintWriter(email + "-" + password + ".txt");
        
        out.println("\nStatistics");
        out.println("********************");
        out.println("\nName: " + nm);
        out.println("Gender: " + mf);
        out.println("Race: " + rc);
        out.println("Alignment: " + alnmt);
        out.println("Age: " + age);
        out.println("Height: " + height + "'" + modHeight + '"');
        out.println("Weight: "  + randomNumTwo);
        out.println("\nAbility Scores");
        out.println("********************");
        out.println("\nStrength: " + strength);
        out.println("Dexterity: " + dexterity);
        out.println("Constitution: " + constitution);
        out.println("Intelligence: " + intelligence);
        out.println("Wisdom: " + wisdom);
        out.println("Charisma: " + charisma);
        
        out.close();
    }
    
}


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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TitleScreen {
    
    public static String username;
    public static String password;
    public static String email;
    public static String password_login;
    public static String email_login;
    private static String fulltext = "";
    private static String line;
    private static int i = 0;
    
    public static void firstmenu() throws IOException // Method for main menu
    {
        TitleScreen test1 = new TitleScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.) Load Character \n2.) New Character "); // Asks for response from user to make
                                                                                 // account or login
        int decision = scanner.nextInt();
        if (decision == 1) {
            signUp(); // calls account creation method
        } else if (decision == 2) {
            signIn(); // calls account signIn method
        }
    }

    public static void signUp() throws IOException // Account creation method
    {
        FileWriter writer = new FileWriter("user_info.txt", true); // writes to file
        Scanner scanner = new Scanner(System.in); // Creating scanner
        System.out.println("Please Enter user Email Address");
        email = scanner.nextLine(); // Entering email
        System.out.println("Please Enter user Password");
        password = scanner.nextLine(); // Entering password
        writer.write(username + "," + email + "," + password + "\n"); // Writing name email and password to file with ,
                                                                  // between and new line for each section
        writer.close(); // Closes file after writing
    }

    public static void signIn() throws IOException // Sign In method
    {

        Scanner scanner = new Scanner(System.in); // Sets up scanner
        System.out.println("Please Sign in"); // Display
        System.out.println("Enter your Email: "); // Display
        email = scanner.nextLine(); // Takes email login
        System.out.println("Enter your Password: "); // Display
        password = scanner.nextLine(); // Takes password login
        try{
            FileReader reader = new FileReader(email + "-" + password + ".txt"); // Reads lines from file that was used to save login info
            BufferedReader bufferedReader = new BufferedReader(reader); // Reads in files more efficiently
            while ((line = bufferedReader.readLine()) != null) // Sets line to equal the readline
            {

                    //System.out.print(arr[i]);
                    System.out.println(line);
                    fulltext += line;
                    i++;
                    
            }
            reader.close();
        }catch(IOException e){
                System.out.println("\n\nIncorrect Email or Password.");
                signIn();
        }

    }
}

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
    public static void firstmenu() throws IOException // Method for main menu
    {
        TitleScreen test1 = new TitleScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to sign up for user account, 2 to log in "); // Asks for response from user to make
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
        System.out.println("Please Enter user name");
        String name = scanner.nextLine(); // Entering username
        System.out.println("Please Enter user email address");
        String email = scanner.nextLine(); // Entering email
        System.out.println("Please Enter user password");
        String password = scanner.nextLine(); // Entering password
        writer.write(name + "," + email + "," + password + "\n"); // Writing name email and password to file with ,
                                                                  // between and new line for each section
        writer.close(); // Closes file after writing
        signIn(); // Calls signin Method
    }

    public static void signIn() throws IOException // Sign In method
    {
        FileReader reader = new FileReader("user_info.txt"); // Reads lines from file that was used to save login info
        BufferedReader bufferedReader = new BufferedReader(reader); // Reads in files more efficiently
        Scanner scanner = new Scanner(System.in); // Sets up scanner
        System.out.println("Please Sign in"); // Display
        System.out.println("Enter your email: "); // Display
        String email_login = scanner.nextLine(); // Takes email login
        System.out.println("Enter your password: "); // Display
        String password_login = scanner.nextLine(); // Takes password login
        String line; // Line string variable
        while ((line = bufferedReader.readLine()) != null) // Sets line to equal the readline
        {
            String line_split[] = line.split(","); // Splits email and password and username with a comma
            // System.out.println(email_login); //Testing the ability to read the line (keep
            // for testing purposes)
            // System.out.println(line_split[1]);
            // System.out.println(password_login);
            // System.out.println(line_split[2]);
            if (line_split[1].equals(email_login) && line_split[2].equals(password_login)) // Scans lines by section
                                                                                           // between , in order to look
                                                                                           // for matching email and
                                                                                           // passwords
            {
                reader.close(); // closes file from reading
                System.out.println("Successfully signed in!"); // Display
                System.exit(0);
                // Create user object with the following properties: name, password, email
                // Characters class will need to extend this user object
            }
        }
        reader.close(); // Closes file from reading
        System.out.println("Username or Password Incorrect"); // Display
        signIn(); // Calls signIn method
    }
}

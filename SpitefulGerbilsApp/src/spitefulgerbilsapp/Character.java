package spitefulgerbilsapp;

import java.util.Scanner;

/**
 *
 * @author XWP921
 */
public class Character implements GerbilsInterface {
    public void setCharInfo() {
        // Instantiate the variables for the character.
        String name;
        String gender;
        // Create an object for the Scanner class
        Scanner in = new Scanner(System.in);
        // Prompt the user for a name for their characer, then save that to name.
        System.out.print("Enter a name for your character: ");
        name = in.nextLine();
        System.out.print("Select a gender - (M) Male or (F) Female: ");
        gender = in.nextLine();
    }

    public void accessCharInfo() {

    }

    public void setNewChar() {

    }

    public void getNewChar() {

    }

    public void setUserAccount() {

    }

    public void getUserAccount() {

    }
}

package c7l1arrays;
import java.util.Random; // Java Utility to Generate Random Numbers
import java.util.Arrays; // Java Utility to make printing the array easier
/**
 *
 * @author Jariel Jimenez-Lopez          CPSC1110.40481 C7 L1  9/1/2021
 */
public class C7L1Arrays {

    public static void main(String[] args) {
        // Step 1: Create the Random Object
        Random rdm = new Random();
        // Step 2: Create the new array (I've titled it randomNumbers)
        int[] randomNumbers = new int[20];
        // Step 3: Create a loop to assign the random values to the array
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rdm.nextInt(101); // Store a random interger in the index, i, of the array. "101" is the maximum value, excluding 101.
        }
        // Step 4: Print out the resulting array (I used the Arrays Utility)
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.print("\n");
        // Step 5: Print out only the even numbers of the array
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i]%2==0) {
                System.out.print(randomNumbers[i] + " ");
            }
        }
        //System.out.println()
    }
    
}

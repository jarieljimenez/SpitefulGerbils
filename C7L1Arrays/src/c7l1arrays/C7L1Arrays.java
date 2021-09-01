package c7l1arrays;
import java.util.Random; // Java Utility to Generate Random Numbers
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
        System.out.print("All Numbers: "); // This is mostly for ease of readability and understanding for each line.
        
        // Step 4: Print out the resulting array
        for (int i = 0; i < randomNumbers.length; i++) { // For Loop: Start with i = 0 and increase after each run until i = Array Length
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.print("\nEven Numbers: ");
        
        // Step 5: Print out only the even numbers of the array
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i]%2==0) { // Runs if the array value's remainder when divided by 2 is = 0.
                System.out.print(randomNumbers[i] + " ");
            }
        }
        System.out.print("\nOdd Index Elements: ");
        
        // Step 6: Print out only the odd indexes of the array
        for (int i = 0; i < randomNumbers.length; i++) {
            if (i%2!=0) { // Runs if the index value's remainder when divided by 2 is not = 0.
                System.out.print(randomNumbers[i] + " ");
            }
        }
        System.out.print("\nAll Numbers Reversed: ");
        
        // Step 7: Print out all numbers in reverse order
        for (int i = 19; i >= 0; i--) { // For Loop: Start with i = 19 and decrease after each run while i >= 0.
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.print("\nSum of every three indexes: ");
        
        // Step 8: Print the sum of every third element
        int sumOfThirds = 0; // Initialize a variable to store the sum of every third index value.
        for (int i = 1; i < randomNumbers.length; i++) { // Starts at 1 to avoid counting zero as the third value.
            if (i%3==0) { // Runs if the remainder of i when divided by 3 is = 0.
                sumOfThirds = sumOfThirds + randomNumbers[i]; // Takes the sum of the array value and adds it to the existing sumOfThirds variable.
                System.out.print(randomNumbers[i]+ " "); // This prints out the number in this index
            }
        }
        System.out.println("= " + sumOfThirds); // Prints out the equal sign and the sumOfThirds value.
    }
}

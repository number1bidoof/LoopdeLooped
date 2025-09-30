/**
 * Ayah Abdalla
 * Java I
 * 09/29/2025
 *
 * Simple sentinel sum calculator, adds all numbers together until 0 is entered, then displays final output
 */
import java.util.Scanner;

public class SentinelSum {
    public static void main(String[] args) {
        // Gets user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, any number: ");
        int userNumber = input.nextInt();
        int userSum = 0;

        while(userNumber != 0){ // starts the loop
            System.out.println("Enter a number, any number: "); // prompts user to enter another number
            userSum += userNumber; // adds the number to the sum
            userNumber = input.nextInt();
        }
        input.close();
        System.out.println("Your final sum is... " + userSum); 
    }
}

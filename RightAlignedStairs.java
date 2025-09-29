/**
 * Ayah Abdalla
 * Java I
 * 09/29/2025
 *
 * Right aligned character stairs, asks user for pattern & number of levels to print final output
 */
import java.util.Scanner;

public class RightAlignedStairs {
      public static void main(String[] args) {
        // Defines the scanners
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter a character: "); // gets the user pattern choice
        char userPattern = input.next().charAt(0);

        System.out.println("Enter a number: "); // asks for the number of levels
        int n = input2.nextInt();
        
        for (int i = n; i >= 1; i--) { // defines the number of levels in the staircase
            for (int j = 1; j < i; j++) { // prints whitespace first 
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) { // prints characters in stairs that the user defined
                System.out.print(userPattern);
            }
            System.out.println();
        }
      }

    }

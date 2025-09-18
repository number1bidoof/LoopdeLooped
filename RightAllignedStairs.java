import java.util.Scanner;

public class RightAllignedStairs {
      public static void main(String[] args) {
        // Defines the scanners
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter a number, any number: "); // asks for the number of levels
        int n = input.nextInt();

        System.out.println("Enter a charater for the patern, any charater: "); // gets the user patern choice
        char userPatern = input2.next().charAt(0);
        
        for (int i = n; i >= 1; i--) { // defines the number of levels in the staircase
            for (int j = 1; j < i; j++) { // prints whitespace first 
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) { // prints charaters in stairs that the user defined
                System.out.print(userPatern);
            }
            System.out.println();
        }
      }

    }

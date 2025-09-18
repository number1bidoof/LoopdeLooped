import java.util.Scanner;

public class SentinelSum {
    public static void main(String[] args) {
        // Gets user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, any number: ");
        int userNumber = input.nextInt();
        int userSum = 0;

        while(userNumber != 0){ // if the user number inputed is not 0
            System.out.println("Enter a number, any number: "); // prompts user to enter another number
            userNumber = input.nextInt();
            userSum += userNumber; // adds the number to the sum
        }
        input.close();
        System.out.println("Your final sum is... " + userSum); 
    }
}

/**
 * Ayah Abdalla
 * Java I
 * 09/29/2025
 *
 * Menu repetition program that has 3 options,
 * 1: Say hello
 * 2: Display the current time
 * 3: Exit because
 * 2 was changed due to changed in rubric :D
 */
import java.util.Scanner;
import java.time.LocalTime;

public class MenuRepetition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, user would you like to...");
        System.out.println("1: Say hello");
        System.out.println("2: Display the current time");
        System.out.println("3: Exit loop");
        int userAnswer = input.nextInt();

        do {
            if(userAnswer == 1){
                System.out.println("Hey!!!");
            } else if(userAnswer == 2){
                System.out.println("The current time is... " + LocalTime.now());
            }
            System.out.println("What is your next action? ");
            userAnswer = input.nextInt(); // resets loop
        } while (userAnswer != 3); // exits loop if the input is 3
    }
}

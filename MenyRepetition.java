import java.util.Scanner;

public class MenyRepetition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, user would you like to...");
        System.out.println("1: Say Hello");
        System.out.println("2: Display favorite charater");
        System.out.println("3: Exit loop");
        int userAnswer = input.nextInt();

        do {
            if(userAnswer == 1){
                System.out.println("Hey!!!");
            } else if(userAnswer == 2){
                System.out.println("My favorite charater is rilakuma!");
            }
            System.out.println("What is your next action");
            userAnswer = input.nextInt(); // resets loop
        } while (userAnswer != 3); // exits loop if the input is 3
    }
}

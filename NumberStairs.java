/**
 * Ayah Abdalla
 * Java I
 * 09/29/2025
 *
 * Number stars that prints in a staircase pattern of numbers 1-10
 */
public class NumberStairs {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) { // for loop for number stairs
            for(int a = 1; a < i+1; a++){ // nested loop to print numbers
                System.out.print(a);
            } 
            System.out.println(); // for formating
        }
    }
}

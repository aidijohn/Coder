package ABCD.Easy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean validInput = false;

        // Continue prompting the user until valid input is received
        while (!validInput) {
            System.out.println("Please enter a number:");

            try {
                n = scanner.nextInt();
                validInput = true; // Input is valid, exit the loop
            } catch (InputMismatchException e) {
                System.out.println("Please enter numbers only.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("You entered: " + n);

        // Process the input number
        for (int i = 1; i <= 10; i++) {
            int result = i * n;
            System.out.println(n + " x " + i + " = " + result);
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}



//TASK Day04
//ToDo 1: Given an integer, n, print its first 10 multiples. Each multiple n x i (where 1<=i<=10)
// should be printed on a new line in the form: n x i = result.
// ii)-Do error handling - Allow integers only.
// iii-Allow user to do the inputs again and again endlessly..only until entering 0 we see Exiting... then Exit.
// iv)-Allow user to do the input again and again until they do the correct input, then show result and stop.
// v) -Allow User to make only 4 continuous trials (Whether valid or invalid).
//    .add these -- Attempt x, You entered y, You've exceeded your 4 trials.
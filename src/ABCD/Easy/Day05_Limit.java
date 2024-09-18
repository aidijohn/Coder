package ABCD.Easy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day05_Limit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int attempts = 0;
        int maxAttempts = 4;

        // Continue prompting the user for 4 trials, whether valid or invalid
        while (attempts < maxAttempts) {
            System.out.println("Please enter a number (Trial " + (attempts + 1) + "):");
            attempts++; // Increment trial count

            try {
                n = scanner.nextInt(); // Read user input
                System.out.println("You entered: " + n);

                // Process the input number: display multiplication table
                for (int i = 1; i <= 10; i++) {
                    int result = i * n;
                    System.out.println(n + " x " + i + " = " + result);
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter numbers only.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("You've exceeded your 4 trials.");
        scanner.close(); // Close the scanner to avoid resource leaks
    }
}

package ABCD;

import java.util.Scanner;

public class Day06_Strings_Ex_Handle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = 0;
        boolean validInput = false;

        // Prompt the user to enter a number until a valid integer is entered
        while (!validInput) {
            System.out.print("Please enter a number: ");
            if (scanner.hasNextInt()) {
                T = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Please enter numbers only.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.nextLine(); // Consume the newline left-over

        for (int i = 1; i <= T; i++) {
            System.out.print("Please enter a string: ");
            String input = scanner.nextLine();

            String evens = "";
            String odds = "";

            for (int j = 0; j < input.length(); j++) {
                if (j % 2 == 0) {
                    evens += input.charAt(j);
                } else {
                    odds += input.charAt(j);
                }
            }

            System.out.println(evens + " " + odds);
        }

        scanner.close();
    }
}

package ABCD.Easy;

import java.util.Scanner;

public class Day05_Endless {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What's your number? Enter 0 to exit.");
            int n = 0;

            try {
                n = scanner.nextInt();

                if (n == 0) {
                    System.out.println("Exiting...");
                    break;
                }

                for (int i = 1; i <= 10; i++) {
                    int result = i * n;
                    System.out.println(n + " x " + i + " = " + result);
                }

            } catch (Exception exception) {
                System.out.println("Only numbers bro..");
                scanner.next(); // Clears the invalid input
            }
        }
    }
}

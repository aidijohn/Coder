package ABCD;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {

        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i<=10; i++) {
            System.out.println(N+" x "+i+" = "+(N*i));
        }
    }
}
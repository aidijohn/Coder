package ABCD;

import java.util.Scanner;

    public class Day07_ReverseArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the number of elements in the array
            System.out.println("Enter the number of Array elements");
            int N = scanner.nextInt();

            // Create an array of size N
            int[] A = new int[N];

            // Read the elements into the array
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            // Print the elements in reverse order
            for (int i = N - 1; i >= 0; i--) {
                System.out.print(A[i]);
                if (i > 0) {
                    System.out.print(" ");  //Print Space: If the condition is true (i.e., i is greater than 0), it prints a space " " before printing the next element.
                }
            }

            scanner.close();
        }
    }


//TASK
//ToDo: Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.

// Read the number of elements in the array
//Input the elements to the array

//Example
//A = [1,2,3,4]
//
//Print 4 3 2 1. Each integer is separated by one space.
package ABCD;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your Array size?");
        int N = scanner.nextInt();

        int[] A = new int[N];

        for(int i=0; i<N; i++){
            System.out.println("Add element");

            A[i] = scanner.nextInt();
        }

        System.out.println("Here is the reversed Array:");
        for (int i = N-1; i>=0; i--) {
            System.out.print(A[i]);
            System.out.print(" ");
        }

    }
}

//TASK
//ToDo: Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.

// Read the number/size of elements in the array
//Input the elements to the array

//Example
//A = [1,2,3,4]
//
//Print 4 3 2 1. Each integer is separated by one space.
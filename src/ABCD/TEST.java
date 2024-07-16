package ABCD;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array: ");
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();

        int[] intArray = new int[arrSize];

        for (int i=0; i<arrSize; i++){
            intArray[i] = scanner.nextInt();
        }

        for (int i=arrSize-1; i>=0; i--) {
            System.out.print(intArray[i]);
            if (i > 0) {
                System.out.print(" ");  //Print Space: If the condition is true (i.e., i is greater than 0), it prints a space " " before printing the next element.
            }
        }
        scanner.close();
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
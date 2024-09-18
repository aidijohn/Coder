package ABCD.TWOD_Arrays;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Day11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Inform the user about the expected input
        System.out.println("Welcome! Please enter 6 rows of 6 space-separated integers:");

        List<List<Integer>> arr = new ArrayList<>();

        // Guide the user to enter each row of the 2D array
        IntStream.range(0, 6).forEach(i -> {
            try {
                System.out.println("Enter row " + (i + 1) + ":");
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        // Inform the user that input is completed and processing will begin
        System.out.println("Input completed. Processing the 2D array to find the highest hourglass sum...");

        // Set the initial highest sum to the smallest possible hourglass sum
        int highest = -63;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.size() - 2; j++) {
                // Calculate the sum of the current hourglass
                int sum = arr.get(i).get(j);
                sum += arr.get(i).get(j + 1);
                sum += arr.get(i).get(j + 2);
                sum += arr.get(i + 1).get(j + 1);
                sum += arr.get(i + 2).get(j);
                sum += arr.get(i + 2).get(j + 1);
                sum += arr.get(i + 2).get(j + 2);

                // Update the highest sum if a larger hourglass sum is found
                if (highest < sum) {
                    highest = sum;
                }
            }
        }

        // Display the result
        System.out.println("The highest hourglass sum in the given 2D array is: " + highest);

        // Close the buffered reader
        bufferedReader.close();
    }
}


//TASK
//ToDo: Given a 6 x 6 2D Array, A:
//
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0

//We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:
//
//a b c
//  d
//e f g

//There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.

//Task
//Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

//Example
//In the array shown above, the maximum hourglass sum is 7 for the hourglass in the top left corner.

//Input Format
//There are 6 lines of input, where each line contains 6 space-separated integers that describe the 2D Array A.

//Output Format
//Print the maximum hourglass sum in A.

//Sample Input
    //1 1 1 0 0 0
    //0 1 0 0 0 0
    //1 1 1 0 0 0
    //0 0 2 4 4 0
    //0 0 0 2 0 0
    //0 0 1 2 4 0

//Sample Output
    //19
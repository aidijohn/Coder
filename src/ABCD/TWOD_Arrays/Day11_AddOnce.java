package ABCD.TWOD_Arrays;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Day11_AddOnce {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Inform the user about the expected input
        System.out.println("Welcome! Please enter 6 rows of 6 space-separated integers in one go:");

        List<List<Integer>> arr = new ArrayList<>();

        // Read all rows at once and split them into lists
        for (int i = 0; i < 6; i++) {
            arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
            );
        }

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

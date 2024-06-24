package Others;

public class SumArray {

    // Method to calculate the sum of all elements in an array
    public int sum(int[] arr) {
        int total = 0;

        // Iterate through the array and add each element to the total
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        // Return the total sum
        return total;
    }

    public static void main(String[] args) {
        // Create an instance of Others.SumArray
        SumArray sumArray = new SumArray();

        // Others.Test array
        int[] arr = {1, 2, 3, 4, 5};

        // Calculate the sum of the array
        int sum = sumArray.sum(arr);

        // Print the result
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}

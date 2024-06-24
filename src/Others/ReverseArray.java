package Others;

public class ReverseArray {

    // Method to reverse an array
    public void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Swap elements from start to end until start >= end
        while (start < end) {
            // Swap elements at start and end indices
            swap(arr, start, end);
            // Move start pointer forward
            start++;
            // Move end pointer backward
            end--;
        }
    }

    // Method to swap two elements in an array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to print the array
    private void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an instance of Others.ReverseArray
        ReverseArray reverseArray = new ReverseArray();

        // Others.Test array
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        reverseArray.printArray(arr);

        // Reverse the array
        reverseArray.reverse(arr);

        System.out.println("Reversed array:");
        reverseArray.printArray(arr);
    }
}

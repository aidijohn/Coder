package Others;

public class BubbleSort {

    // Method to sort an array using Bubble Sort
    public void sort(int[] arr) {
        int n = arr.length;

        // Traverse through all elements in the array
        for (int i = 0; i < n - 1; i++) {
            // Traverse the array from 0 to n-i-1
            // The last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
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
        // Create an instance of Others.BubbleSort
        BubbleSort bubbleSort = new BubbleSort();

        // Others.Test array
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        bubbleSort.printArray(arr);

        // Sort the array
        bubbleSort.sort(arr);

        System.out.println("Sorted array:");
        bubbleSort.printArray(arr);
    }
}

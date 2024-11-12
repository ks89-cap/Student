package Quick_Sort;

import java.util.Arrays;

public class QuickSort2 {
    int partition(int intArray[], int low, int high) {
        int pi = intArray[high]; // Pivot
        int i = (low - 1); // Index of the smaller element
        for (int j = low; j < high; j++) {
            // Change the comparison for descending order
            if (intArray[j] >= pi) {
                i++;
                // Swap intArray[i] and intArray[j]
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }
        // Swap the pivot element with the element at i + 1
        int temp = intArray[i + 1];
        intArray[i + 1] = intArray[high];
        intArray[high] = temp;
        return i + 1; // Return the partition index
    }

    void quick_sort(int intArray[], int low, int high) {
        if (low < high) {
            int pi = partition(intArray, low, high);
            quick_sort(intArray, low, pi - 1);
            quick_sort(intArray, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int intArray[] = {4, -1, 6, 8, 0, 5, -3};
        int n = intArray.length;
        System.out.println("Original array: " + Arrays.toString(intArray));
        QuickSort2 obj = new QuickSort2();
        obj.quick_sort(intArray, 0, n - 1);
        System.out.println("Sorted array in descending order: " + Arrays.toString(intArray));
    }
}

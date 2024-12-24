package tropicalsorting;

import java.util.Arrays;

import static tropicalsorting.TropicalSorting.tropicalSort;

public class Main {
    public static void main(String[] args) {
        // Example array for tropical sorting
        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Perform tropical sort
        int[] sortedArray = tropicalSort(arr);

        // Output the sorted array
        System.out.println("Tropical Sorted Array: " + Arrays.toString(sortedArray));
    }
}

package tropicalsorting;

import java.util.Arrays;

public class TropicalSorting {

    // Tropical sorting function
    public static int[] tropicalSort(int[] arr) {
        // Apply tropical sorting (min operation as the key comparison)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Apply tropical algebra: replace comparison with minimum
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

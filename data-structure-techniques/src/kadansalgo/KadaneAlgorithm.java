package kadansalgo;

public class KadaneAlgorithm {

    // Function to implement Kadane's algorithm
    public static int kadane(int[] arr) {
        int current_max = arr[0];
        int global_max = arr[0];

        // Iterate through the array to find the maximum sum subarray
        for (int i = 1; i < arr.length; i++) {
            current_max = Math.max(arr[i], current_max + arr[i]);
            global_max = Math.max(global_max, current_max);
        }

        return global_max;
    }
}

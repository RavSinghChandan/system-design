package slidingwindow;

/*
 * Sliding Window Algorithm to find the maximum sum of a subarray of size k
 * Steps:
 * 1. Initialize the window and define its size.
 * 2. Expand or contract the window as it slides.
 * 3. Update the result based on the current window's values.
 * 4. Return the final result.
 */

public class SlidingWindow {


    public static int slidingWindow(int[] array, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += array[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < array.length; i++) {
            windowSum += array[i] - array[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}

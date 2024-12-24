package slidingwindow;

import static slidingwindow.SlidingWindow.slidingWindow;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = slidingWindow(array, k);
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + result);
    }
}

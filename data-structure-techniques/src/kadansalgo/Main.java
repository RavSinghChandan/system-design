package kadansalgo;

import static kadansalgo.KadaneAlgorithm.kadane;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum Sum Subarray: " + kadane(arr));
    }
}

package twopointer;

import static twopointer.TwoPointers.twoPointers;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 10;

        int result = twoPointers(array, target);
        System.out.println("Result: " + result);
    }
}

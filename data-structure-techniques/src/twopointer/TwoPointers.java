package twopointer;

/**
 * Steps for solving the problem using Two Pointers technique:
 * 1. Initialize two pointers, one at the start and one at the end of the array.
 * 2. Traverse and move the pointers based on the condition (sum of the elements at the pointers).
 * 3. Update the result if the target condition is met.
 * 4. Return the final result after processing all potential pairs.
 */
public class TwoPointers {

    public static int twoPointers(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];

            if (sum == target) {
                return sum;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return -1;
    }
}

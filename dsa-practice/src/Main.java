import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3};
        int a2[] = {5, 6, 7, 8};
        System.out.println(findMedianSortedArray(a1, a2));

    }

    private static int findMedianSortedArray(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArray(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minX = (partitionX == 0) ? Integer.MAX_VALUE : nums1[partitionX];
            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minY = (partitionY == 0) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxX <= minY && maxY <= minX) {
                if ((m + n) % 2 == 0) {
                    return (int) ((Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0);
                } else {
                    return Math.max(maxX, maxY);
                }
            } else if (maxX > maxY) {
                high = partitionX - 1; // Move the cut to the left
            } else {
                low = partitionX + 1; // Move the cut to the right
            }
            return m;
        }
        return m;
    }
    }



//            // Check if the cuts are correct
//            if (maxX <= minY && maxY <= minX) {
//                // Calculate median
//                if ((m + n) % 2 == 0) {
//                    return (int) ((Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0);
//                } else {
//                    return Math.max(maxX, maxY);
//                }
//            } else if (maxX > minY) {
//                high = partitionX - 1; // Move the cut to the left
//            } else {
//                low = partitionX + 1; // Move the cut to the right
//            }
//        }
//
//        throw new IllegalArgumentException("Input arrays are not sorted.");
//    }

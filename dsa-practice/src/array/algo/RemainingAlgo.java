package array.algo;

import java.util.*;

public class RemainingAlgo {

    // Main method to test all algorithms
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Prefix Sum: " + Arrays.toString(prefixSum(arr)));
        System.out.println("Suffix Sum: " + Arrays.toString(suffixSum(arr)));

        int[] windowArr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        System.out.println("Sliding Window Max Sum: " + slidingWindowMaxSum(windowArr, 4));

        int[] twoPointerArr = {1, 2, 3, 4, 5};
        System.out.println("Two-pointer Sum (Target 9): " + twoPointerSum(twoPointerArr, 9));

        int[] kadaneArr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Kadane’s Max Subarray Sum: " + kadaneMaxSubarraySum(kadaneArr));

        int[] dutchArr = {2, 0, 2, 1, 1, 0};
        dutchNationalFlag(dutchArr);
        System.out.println("Dutch National Flag: " + Arrays.toString(dutchArr));

        int[] mooreArr = {1, 1, 1, 2, 3};
        System.out.println("Moore’s Voting Majority Element: " + mooresVoting(mooreArr));

        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println("Merge Intervals: " + Arrays.deepToString(mergeIntervals(intervals)));

        int[] rotateArr = {1, 2, 3, 4, 5};
        rotateArray(rotateArr, 2);
        System.out.println("Rotated Array: " + Arrays.toString(rotateArr));

        int[] duplicateArr = {1, 2, 3, 2, 4, 5, 4};
        System.out.println("Duplicates: " + findDuplicates(duplicateArr));

        int[] rearrangeArr = {-1, 2, -3, 4, 5, -6};
        rearrangePosNeg(rearrangeArr);
        System.out.println("Rearranged Pos/Neg: " + Arrays.toString(rearrangeArr));

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        transposeMatrix(matrix);
        System.out.println("Transposed Matrix: " + Arrays.deepToString(matrix));

        int[] bitArr = {1, 2, 3, 2, 1};
        System.out.println("Unique Number: " + findUniqueNumber(bitArr));

        int[] subsetArr = {1, 2, 3};
        System.out.println("Subsets: " + subsets(subsetArr));

        Trie trie = new Trie();
        trie.insert("hello");
        System.out.println("Trie Search 'hello': " + trie.search("hello"));
    }

    // 4. Prefix Sum & Suffix Sum
    public static int[] prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int[] suffixSum(int[] arr) {
        int[] suffix = new int[arr.length];
        suffix[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }
        return suffix;
    }

    // 5. Sliding Window Algorithms
    public static int slidingWindowMaxSum(int[] arr, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int windowSum = maxSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    // 6. Two-pointer Technique
    public static boolean twoPointerSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) return true;
            else if (sum < target) left++;
            else right--;
        }
        return false;
    }

    // 7. Kadane’s Algorithm (Maximum Subarray Sum)
    public static int kadaneMaxSubarraySum(int[] arr) {
        int maxSoFar = arr[0], maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    // 8. Dutch National Flag Algorithm
    public static void dutchNationalFlag(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 9. Moore’s Voting Algorithm
    public static int mooresVoting(int[] arr) {
        int candidate = arr[0], count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) count++;
            else count--;
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }
        return candidate;
    }

    // 10. Merge Intervals
    public static int[][] mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    // 11. Array Rotation Algorithms
    public static void rotateArray(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // 12. Finding Duplicates
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) duplicates.add(num);
            else seen.add(num);
        }
        return duplicates;
    }

    // 13. Rearrangement Algorithms
    public static void rearrangePosNeg(int[] arr) {
        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                i++;
                swap(arr, i, j);
            }
        }
    }

    // 14. Matrix-Based Algorithms (2D Arrays)
    public static void transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // 15. Bit Manipulation Algorithms on Arrays
    public static int findUniqueNumber(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num;
        }
        return unique;
    }

    // 16. Subset & Subsequence Generation
    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : arr) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }
        return result;
    }

    // 17. Trie-based Algorithms
    static class Trie {
        TrieNode root = new TrieNode();

        static class TrieNode {
            TrieNode[] children = new TrieNode[26];
            boolean isEnd;
        }

        public void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode();
                }
                node = node.children[c - 'a'];
            }
            node.isEnd = true;
        }

        public boolean search(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null) return false;
                node = node.children[c - 'a'];
            }
            return node.isEnd;
        }
    }

}
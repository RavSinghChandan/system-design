package fenwicktree;

public class Main {
    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};

        FenwickTree fenwickTree = new FenwickTree(arr.length);
        fenwickTree.build(arr);

        // Query the sum of the first 3 elements
        System.out.println("Prefix sum of first 3 elements: " + fenwickTree.query(2)); // Sum of [1, 3, 5] = 9

        // Update index 2 with value 3 (arr[2] = 5 becomes 8)
        fenwickTree.update(2, 3);

        // Query the sum again after the update
        System.out.println("Prefix sum of first 3 elements after update: " + fenwickTree.query(2)); // Sum of [1, 3, 8] = 12

        // Query the range sum of elements from index 2 to 5
        System.out.println("Range sum of elements from index 2 to 5: " + fenwickTree.rangeQuery(2, 5)); // Sum of [8, 7, 9, 11] = 35
    }
}

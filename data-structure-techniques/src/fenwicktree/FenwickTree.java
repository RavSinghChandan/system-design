package fenwicktree;

public class FenwickTree {

    private int[] fenwickTree;
    private int n;

    // Constructor to initialize the Fenwick Tree
    public FenwickTree(int size) {
        this.n = size;
        this.fenwickTree = new int[n + 1]; // 1-indexed array
    }

    // Step 1: Build the tree by calculating prefix sums
    public void build(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            update(i, arr[i]);
        }
    }

    // Step 2: Update a single element in the array
    // Updates the Fenwick Tree by adding 'value' to index 'idx'
    public void update(int idx, int value) {
        idx++; // Move to 1-indexed
        while (idx <= n) {
            fenwickTree[idx] += value;
            idx += idx & -idx; // Update the parent
        }
    }

    // Step 3: Query the prefix sum from the start to index 'idx'
    // Returns the sum of the range [1, idx]
    public int query(int idx) {
        idx++; // Move to 1-indexed
        int sum = 0;
        while (idx > 0) {
            sum += fenwickTree[idx];
            idx -= idx & -idx; // Move to the parent
        }
        return sum;
    }

    // Get the range sum [l, r] using prefix sums
    public int rangeQuery(int l, int r) {
        return query(r) - query(l - 1);
    }
}

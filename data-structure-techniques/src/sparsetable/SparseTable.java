package sparsetable;

public class SparseTable {
    private int[][] st;  // Sparse Table
    private int[] log;   // Logarithmic table

    // Constructor for Sparse Table
    public SparseTable(int[] arr) {
        int n = arr.length;
        int maxLog = (int) Math.floor(Math.log(n) / Math.log(2)) + 1;
        st = new int[n][maxLog];
        log = new int[n + 1];

        // Build log table
        log[1] = 0;
        for (int i = 2; i <= n; i++) {
            log[i] = log[i / 2] + 1;
        }

        // Initialize Sparse Table for intervals of length 1
        for (int i = 0; i < n; i++) {
            st[i][0] = arr[i];
        }

        // Build the Sparse Table
        for (int j = 1; j < maxLog; j++) {
            for (int i = 0; i + (1 << j) - 1 < n; i++) {
                st[i][j] = Math.min(st[i][j - 1], st[i + (1 << (j - 1))][j - 1]);
            }
        }
    }

    // Function to query the minimum in the range [L, R]
    public int query(int L, int R) {
        int j = log[R - L + 1];
        return Math.min(st[L][j], st[R - (1 << j) + 1][j]);
    }

}

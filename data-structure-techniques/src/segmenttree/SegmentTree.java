package segmenttree;

public class SegmentTree {
    private int[] tree;
    private int n;

    public SegmentTree(int[] arr) {
        this.n = arr.length;
        this.tree = new int[4 * n];  // Segment tree size
        build(arr, 0, 0, n - 1);  // Build tree
    }

    // Step 1: Build the tree
    private void build(int[] arr, int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];  // Leaf node represents a single element
        } else {
            int mid = (start + end) / 2;
            build(arr, 2 * node + 1, start, mid);  // Left child
            build(arr, 2 * node + 2, mid + 1, end);  // Right child
            tree[node] = tree[2 * node + 1] + tree[2 * node + 2];  // Internal node stores sum of children
        }
    }

    // Step 2: Query a range (for sum in this case)
    public int query(int L, int R) {
        return query(0, 0, n - 1, L, R);  // Query the range from L to R
    }

    private int query(int node, int start, int end, int L, int R) {
        if (R < start || end < L) {
            return 0;  // No overlap
        }
        if (L <= start && end <= R) {
            return tree[node];  // Total overlap
        }
        // Partial overlap
        int mid = (start + end) / 2;
        int leftQuery = query(2 * node + 1, start, mid, L, R);
        int rightQuery = query(2 * node + 2, mid + 1, end, L, R);
        return leftQuery + rightQuery;
    }

    // Step 3: Update the array and propagate changes
    public void update(int idx, int value) {
        update(0, 0, n - 1, idx, value);  // Update the element at index idx
    }

    private void update(int node, int start, int end, int idx, int value) {
        if (start == end) {
            tree[node] = value;  // Leaf node
        } else {
            int mid = (start + end) / 2;
            if (start <= idx && idx <= mid) {
                update(2 * node + 1, start, mid, idx, value);  // Update left child
            } else {
                update(2 * node + 2, mid + 1, end, idx, value);  // Update right child
            }
            tree[node] = tree[2 * node + 1] + tree[2 * node + 2];  // Internal node updates sum
        }
    }
}

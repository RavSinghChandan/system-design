package disjointset;


/**
 *
 * Operations:
 * 1. **Find**: Determines the representative of the set to which an element belongs.
 * 2. **Union**: Merges two sets into one by linking the roots, optimizing the process
 *    using union by rank.
 * 3. **Path Compression**: Optimizes the `find` operation by making the trees flatter.
 * 4. **AreInSameSet**: Checks if two elements belong to the same set.
 */
public class DisjointSet {
    private int[] parent;
    private int[] rank;

    public DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }

    public boolean areInSameSet(int x, int y) {
        return find(x) == find(y);
    }
}

package sparsetable;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 7, 9, 11, 3, 5};
        SparseTable sparseTable = new SparseTable(arr);

        // Queries
        System.out.println("Minimum in range [0, 3]: " + sparseTable.query(0, 3)); // Output: 1
        System.out.println("Minimum in range [4, 7]: " + sparseTable.query(4, 7)); // Output: 3
        System.out.println("Minimum in range [2, 5]: " + sparseTable.query(2, 5)); // Output: 2
    }
}

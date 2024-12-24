package segmenttree;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        SegmentTree segmentTree = new SegmentTree(arr);

        // Query sum of elements in range [1, 3]
        System.out.println("Sum of values in range [1, 3]: " + segmentTree.query(1, 3));

        // Update index 1 to 10
        segmentTree.update(1, 10);

        // Query sum of elements in range [1, 3] after update
        System.out.println("Sum of values in range [1, 3] after update: " + segmentTree.query(1, 3));
    }
}

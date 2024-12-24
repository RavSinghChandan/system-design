package disjointset;

public class Main
{
    // Main method for testing the Disjoint Set
    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(10); // Create a disjoint set with 10 elements

        ds.union(1, 2); // Union elements 1 and 2
        ds.union(2, 3); // Union elements 2 and 3
        ds.union(4, 5); // Union elements 4 and 5

        System.out.println(ds.areInSameSet(1, 3)); // Output: true
        System.out.println(ds.areInSameSet(1, 4)); // Output: false

        ds.union(3, 4); // Union elements 3 and 4

        System.out.println(ds.areInSameSet(1, 4)); // Output: true
    }
}

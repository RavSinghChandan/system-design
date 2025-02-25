package array.r;

public class Read {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array

        // Call all traversal methods
        traverseForLoop(arr);
        traverseWhileLoop(arr);
        traverseForEachLoop(arr);

        System.out.print("Recursion Traversal: ");
        traverseRecursion(arr, 0);
    }

    // Method 1: Traverse using a for loop
    public static void traverseForLoop(int[] arr) {
        System.out.print("For Loop Traversal: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method 2: Traverse using a while loop
    public static void traverseWhileLoop(int[] arr) {
        System.out.print("While Loop Traversal: ");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    // Method 3: Traverse using enhanced for loop (for-each)
    public static void traverseForEachLoop(int[] arr) {
        System.out.print("For-Each Loop Traversal: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method 4: Traverse using recursion
    public static void traverseRecursion(int[] arr, int index) {
        if (index >= arr.length) {
            System.out.println();
            return;
        }
        System.out.print(arr[index] + " ");
        traverseRecursion(arr, index + 1);
    }
}

/*
    Time & Space Complexity:

    1. For Loop:
       - Time Complexity: O(n) (Loop runs n times)
       - Space Complexity: O(1) (No extra space used)

    2. While Loop:
       - Time Complexity: O(n) (Loop runs n times)
       - Space Complexity: O(1) (No extra space used)

    3. For-Each Loop:
       - Time Complexity: O(n) (Loop runs n times)
       - Space Complexity: O(1) (No extra space used)

    4. Recursion:
       - Time Complexity: O(n) (Function calls itself n times)
       - Space Complexity: O(n) (Extra recursive function calls in stack)
*/

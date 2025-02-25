package array.d;

public class Delete {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        System.out.print("Original Array: ");
        printArray(arr);

        arr = deleteStart(arr);
        System.out.print("After Deleting Delete Element: ");
        printArray(arr);

        arr = deleteEnd(arr);
        System.out.print("After Deleting End Element: ");
        printArray(arr);

        arr = deleteMiddle(arr);
        System.out.print("After Deleting Middle Element: ");
        printArray(arr);

        arr = deleteRandom(arr, 1); // Deleting element at index 1
        System.out.print("After Deleting Random Index 1: ");
        printArray(arr);
    }

    // Method 1: Delete the first (start) element by shifting
    public static int[] deleteStart(int[] arr) {
        if (arr.length == 0) return arr; // Edge case: Empty array
        int[] newArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        return newArr;
    }

    // Method 2: Delete the last (end) element
    public static int[] deleteEnd(int[] arr) {
        if (arr.length == 0) return arr; // Edge case
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    // Method 3: Delete the middle element
    public static int[] deleteMiddle(int[] arr) {
        if (arr.length == 0) return arr; // Edge case
        int mid = arr.length / 2;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != mid) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    // Method 4: Delete an element at a random index
    public static int[] deleteRandom(int[] arr, int index) {
        if (arr.length == 0 || index < 0 || index >= arr.length) return arr; // Edge case
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


}

/*
    Time & Space Complexity Analysis:

    1.  Delete:
       - Time Complexity: O(N) (Shift all elements)
       - Space Complexity: O(N) (New array is created)

    2. Delete End:
       - Time Complexity: O(N) (Copying elements to a new array)
       - Space Complexity: O(N) (New array is created)

    3. Delete Middle:
       - Time Complexity: O(N) (Shift elements after the middle)
       - Space Complexity: O(N) (New array is created)

    4. Delete Random Index:
       - Time Complexity: O(N) (Shift elements after the index)
       - Space Complexity: O(N) (New array is created)
*/

package array.u;

public class Update {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5}; // Example array
        System.out.print("Original Array: ");
        printArray(arr);

        updateStart(arr, 99);
        System.out.print("After Delete Update (Replace first element with 99): ");
        printArray(arr);

        updateEnd(arr, 88);
        System.out.print("After End Update (Replace last element with 88): ");
        printArray(arr);

        updateMiddle(arr, 77);
        System.out.print("After Middle Update (Replace middle element with 77): ");
        printArray(arr);

        updateRandom(arr, 2, 55);
        System.out.print("After Random Update (Replace index 2 with 55): ");
        printArray(arr);
    }

    // Method 1: Update the first (start) element
    public static void updateStart(int[] arr, int newValue) {
        arr[0] = newValue;
    }

    // Method 2: Update the last (end) element
    public static void updateEnd(int[] arr, int newValue) {
        arr[arr.length - 1] = newValue;
    }

    // Method 3: Update the middle element
    public static void updateMiddle(int[] arr, int newValue) {
        int middleIndex = arr.length / 2;
        arr[middleIndex] = newValue;
    }

    // Method 4: Update a random index (if valid)
    public static void updateRandom(int[] arr, int index, int newValue) {
        if (index >= 0 && index < arr.length) {
            arr[index] = newValue;
        } else {
            System.out.println("Invalid index: " + index);
        }
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
    Time & Space Complexity:

    1. Delete Update:
       - Time Complexity: O(1) (Direct access)
       - Space Complexity: O(1) (No extra space used)

    2. End Update:
       - Time Complexity: O(1) (Direct access)
       - Space Complexity: O(1) (No extra space used)

    3. Middle Update:
       - Time Complexity: O(1) (Direct access)
       - Space Complexity: O(1) (No extra space used)

    4. Random Index Update:
       - Time Complexity: O(1) (Direct access)
       - Space Complexity: O(1) (No extra space used)
*/

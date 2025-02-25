package array.c;

public class Create {

    public static void main(String[] args) {
        directAssignment();
        usingNewKeyword();
        emptyArrayWithAssignment();
        loopInitialization();

        // Call returningArray() and print its returned array.
        System.out.println("Returning Array from a Method Approach:");
        printArray(returningArray());
    }

    // 1. Direct assignment approach: Create and initialize the array in one line.
    public static void directAssignment() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Direct Assignment Approach:");
        printArray(numbers);
    }

    // 2. Using 'new' keyword approach: Use 'new' to create and initialize the array.
    public static void usingNewKeyword() {
        int[] numbers = new int[]{10, 20, 30, 40, 50};
        System.out.println("Using 'new' Keyword Approach:");
        printArray(numbers);
    }

    // 3. Empty array with later assignment approach: Create an empty array and then assign values.
    public static void emptyArrayWithAssignment() {
        int[] numbers = new int[5]; // Array of 5 integers (default value 0)
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        numbers[3] = 400;
        numbers[4] = 500;
        System.out.println("Empty Array with Later Assignment Approach:");
        printArray(numbers);
    }

    // 4. Loop initialization approach: Create an empty array and use a loop to assign values.
    public static void loopInitialization() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10; // Assign values: 0, 10, 20, 30, 40
        }
        System.out.println("Loop Initialization Approach:");
        printArray(numbers);
    }

    // 5. Returning an array from a method approach: Create and return an array.
    public static int[] returningArray() {
        return new int[]{1000, 2000, 3000, 4000, 5000}; // Return an array
    }

    // Helper method to print the contents of an array.
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line for better readability.
    }

    //Direct Assignment: O(n) time (printing) & O(n) space;
    // Using New Keyword: O(n) time & O(n) space;
    // Empty Array with Assignment: O(n) time & O(n) space;
    // Loop Initialization: O(n) time & O(n) space;
    // Returning Array: O(1) time (creation),
    // O(n) time if printed, & O(n) space.
}

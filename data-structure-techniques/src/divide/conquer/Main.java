package divide.conquer;

import static divide.conquer.DivideAndConquer.divideAndConquer;

public class Main {
    public static void main(String[] args) {
        // Example input
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};

        // Solve using Divide and Conquer
        int result = divideAndConquer(array, 0, array.length - 1);

        // Print the result
        System.out.println("Final Result: " + result);
    }
}

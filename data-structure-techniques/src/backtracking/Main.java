package backtracking;

import static backtracking.Backtracking.backtrack;

public class Main {
    public static void main(String[] args) {
        int N = 4;  // Example size for a generic problem (can vary based on problem)
        int[] solution = new int[N];  // Initialize an array to store the solution
        for (int i = 0; i < N; i++) {
            solution[i] = -1;  // Initialize with a placeholder value (-1 or null)
        }

        // Call the backtracking function starting at index 0
        if (backtrack(solution, 0)) {
            System.out.println("Solution found:");
            // Print the solution (specific print logic depending on the problem)
            for (int i = 0; i < solution.length; i++) {
                System.out.print(solution[i] + " ");
            }
        } else {
            System.out.println("No solution exists");
        }
    }
    }

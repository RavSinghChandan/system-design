package backtracking;

/**
 *
 * The backtracking algorithm proceeds by:
 * 1. Making a choice or decision at the current state.
 * 2. Validating whether that choice leads to a valid solution.
 * 3. Recursively solving the next subproblem.
 * 4. If a solution is not found, it backtracks (undoes the decision) and tries the next possible choice.
 *
 */
public class Backtracking {
    // Function to check if the current state is valid (specific to each problem)
    public static boolean isValid(int[] solution, int index) {
        // Implement specific validation logic here
        // For example, in the N-Queens problem, check if a queen can be placed safely
        return true;
    }

    // Function to perform the backtracking
    public static boolean backtrack(int[] solution, int index) {
        // Base case: If solution is complete, return true
        if (index == solution.length) {
            return true;
        }

        // Try all possible choices at this position
        for (int choice = 0; choice < solution.length; choice++) {
            // Make a choice (e.g., assign a value to the solution array)
            solution[index] = choice;

            // Validate the choice
            if (isValid(solution, index)) {
                // Recur to make the next choice
                if (backtrack(solution, index + 1)) {
                    return true; // If recursion is successful, return true
                }
            }

            // Backtrack: undo the current choice
            solution[index] = -1; // Reset the solution at this position
        }

        return false; // No valid solution found at this position
    }

}

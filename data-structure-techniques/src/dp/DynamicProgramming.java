package dp;

import java.util.HashMap;
import java.util.Map;

public class DynamicProgramming {
    // Memoization approach to store results of subproblems
    private static Map<Integer, Integer> memo = new HashMap<>();

    // Example: Fibonacci Sequence using Dynamic Programming
    public static int fibonacci(int n) {
        // Check if the result is already stored in the memo map
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Base case
        if (n <= 1) {
            return n;
        }

        // Recursive case - solve the subproblems
        int result = fibonacci(n - 1) + fibonacci(n - 2);

        // Store the result of the subproblem
        memo.put(n, result);

        return result;
    }
}

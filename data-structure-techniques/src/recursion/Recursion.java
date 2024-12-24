package recursion;
// Step 1: Base Case - Check if the problem is small enough to solve
// Step 2: Recursive Case - Break the problem into smaller subproblems
// Step 3: Combine Results - Combine the results of the subproblems
// Final Solution - Return the final result
public class Recursion {
    public static int baseCase(int n) {
        if (n == 0) {
            return 1;  // Base case condition
        }
        return recursiveCase(n);
    }

    public static int recursiveCase(int n) {
        return n * baseCase(n - 1);  // Recursive call with a smaller subproblem
    }

    public static int combineResults(int n) {
        return baseCase(n);  // Combine results from the recursive calls
    }

    public static void main(String[] args) {

    }
}

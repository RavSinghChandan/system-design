package brute.force;

import java.util.List;

import static brute.force.BruteForce.*;

public class Main {
    public static void main(String[] args) {

            // Step 1: Generate all numbers between 1 and 100
            List<Integer> allNumbers = generateNumbers(1, 100);

            // Step 2: Validate each number based on divisibility by both 2 and 3
            List<Integer> validNumbers = validateNumbers(allNumbers);

            // Step 3: Select the largest valid number
            Integer optimalSolution = selectOptimalSolution(validNumbers);

            // Display the results
            displayResults(allNumbers, validNumbers, optimalSolution);
    }
}

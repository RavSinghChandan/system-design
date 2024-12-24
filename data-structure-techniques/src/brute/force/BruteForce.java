package brute.force;

import java.util.ArrayList;
import java.util.List;

/**
 * A Brute Force Solution to find the largest number divisible by both 2 and 3 from a given range.
 * Steps:
 * 1. Generate all numbers between 1 and 100.
 * 2. Validate if each number is divisible by both 2 and 3.
 * 3. Select the largest valid number.
 */
public class BruteForce {

    static List<Integer> generateNumbers(int start, int end) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    static List<Integer> validateNumbers(List<Integer> numbers) {
        List<Integer> validNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0 && number % 3 == 0) {
                validNumbers.add(number);
            }
        }
        return validNumbers;
    }

    static Integer selectOptimalSolution(List<Integer> validNumbers) {
        if (validNumbers.isEmpty()) {
            return null; // No valid solution found
        }
        Integer maxValid = validNumbers.get(0);
        for (int validNumber : validNumbers) {
            if (validNumber > maxValid) {
                maxValid = validNumber;
            }
        }
        return maxValid;
    }

    static void displayResults(List<Integer> allNumbers, List<Integer> validNumbers, Integer optimalSolution) {
        System.out.println("Generated Numbers: " + allNumbers);
        System.out.println("Valid Numbers (Divisible by 2 and 3): " + validNumbers);
        if (optimalSolution != null) {
            System.out.println("Optimal Solution (Largest Valid Number): " + optimalSolution);
        } else {
            System.out.println("No valid solution found.");
        }
    }
}

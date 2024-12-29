//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(90));

    }
    public static int binarySearch(int number) {
        if (number < 0) return -1; // Negative numbers don't have real square roots

        double guess = number; // Start with a guess
        double newGuess;

        do {
            newGuess = guess; // Save the current guess
            guess = (guess + number / guess) / 2; // Update the guess
        } while (Math.abs(guess - newGuess) > 0.01); // Stop when it's close enough

        return (int) guess; // Return the closest whole number
    }
}
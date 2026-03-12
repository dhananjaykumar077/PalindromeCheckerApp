import java.util.Scanner;

/**
 * MAIN CLASS UseCase13PalindromeCheckerApp
 *
 * Use Case 13: Performance Benchmark Palindrome Checker
 *
 * Description:
 * This class measures and displays the performance
 * of the palindrome validation algorithm.
 *
 * At this stage, the application:
 * - Executes the palindrome check
 * - Captures start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * @author Developer
 * @version 13.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Capture start time
        long startTime = System.nanoTime();

        boolean result = checkPalindrome(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate execution time
        long executionTime = endTime - startTime;

        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        System.out.println("Execution Time: " + executionTime + " nanoseconds");

        scanner.close();
    }

    /**
     * Palindrome checking method
     */

    public static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
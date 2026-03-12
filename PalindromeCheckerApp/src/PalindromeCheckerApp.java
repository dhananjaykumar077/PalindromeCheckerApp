import java.util.Scanner;

/**
 * MAIN CLASS UseCase11PalindromeCheckerApp
 *
 * Use Case 11: Object-Oriented Palindrome Checker
 *
 * Description:
 * This class demonstrates palindrome validation using
 * a separate service class.
 *
 * This improves:
 * - Reusability
 * - Maintainability
 * - Clean design
 *
 * @author Developer
 * @version 11.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point
     * @param args Command-Line arguments
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}

/**
 * Service class containing palindrome logic
 */

class PalindromeService {

    /**
     * Checks whether the input string is a palindrome
     * @param input the string to check
     * @return true if palindrome, otherwise false
     */

    public boolean checkPalindrome(String input) {

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
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

/**
 * MAIN CLASS UseCase7PalindromeCheckerApp
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 * removeFirst()
 * removeLast()
 *
 * This avoids reversing the string and provides
 * efficient front-to-back comparison.
 *
 * @author Developer
 * @version 7.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     * @param args Command-Line arguments
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (char ch : input.toCharArray()) {
            deque.add(ch);
        }

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}